package pe.citas.app.core.domain.models.chat;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Conversation {
    private String id;
    private String name;
    private List<String> participants;
    private Date createdAt;
}
