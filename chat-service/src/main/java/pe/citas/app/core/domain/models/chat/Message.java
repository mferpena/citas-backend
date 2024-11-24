package pe.citas.app.core.domain.models.chat;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private String id;
    private String sender;
    private String content;
    private String conversationId;
    private Date timestamp;
}
