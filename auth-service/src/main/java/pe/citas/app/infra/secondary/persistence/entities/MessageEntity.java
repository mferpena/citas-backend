package pe.citas.app.infra.secondary.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "messages")
public class MessageEntity {
    @Id
    private String id;                 // ID único del mensaje
    private String conversationId;     // ID de la conversación a la que pertenece
    private String senderId;           // ID del usuario que envió el mensaje
    private String content;            // Contenido del mensaje
    private Date timestamp;            // Fecha y hora del mensaje
    private boolean isRead;            // Indica si el mensaje fue leído
}
