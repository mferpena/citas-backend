package pe.citas.app.core;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
@RequiredArgsConstructor
@SuppressWarnings("all")
public class ChatServiceImpl extends TextWebSocketHandler {

    private final Map<String, List<WebSocketSession>> rooms = new ConcurrentHashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        log.info("Nueva conexión establecida: {}", session.getId());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        rooms.values().forEach(sessions -> sessions.remove(session));
        log.info("Conexión cerrada: {}", session.getId());
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String payload = message.getPayload();

        Map<String, String> parsedMessage = parseMessage(payload);

        String type = parsedMessage.get("type");
        String room = parsedMessage.get("room");
        String content = parsedMessage.get("content");

        if ("join".equals(type)) {
            joinRoom(room, session);
        } else if ("message".equals(type)) {
            sendMessageToRoom(room, content, session);
        }
    }

    private void joinRoom(String room, WebSocketSession session) {
        rooms.computeIfAbsent(room, r -> new ArrayList<>()).add(session);
        log.info("Sesión {} unida a la sala {}", session.getId(), room);
    }

    private void sendMessageToRoom(String room, String message, WebSocketSession sender) throws IOException {
        List<WebSocketSession> roomSessions = rooms.get(room);
        if (roomSessions != null) {
            for (WebSocketSession session : roomSessions) {
                if (session.isOpen() && session != sender) {
                    session.sendMessage(new TextMessage(message));
                }
            }
            log.info("Mensaje enviado a la sala {}: {}", room, message);
        } else {
            log.warn("Sala no encontrada: {}", room);
        }
    }

    private Map<String, String> parseMessage(String message) {
        Map<String, String> map = new HashMap<>();
        String[] parts = message.replace("{", "").replace("}", "").replace("\"", "").split(",");
        for (String part : parts) {
            String[] entry = part.split(":");
            map.put(entry[0].trim(), entry[1].trim());
        }
        return map;
    }
}
