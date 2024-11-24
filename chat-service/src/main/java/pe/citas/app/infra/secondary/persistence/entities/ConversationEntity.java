package pe.citas.app.infra.secondary.persistence.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "conversations")
public class ConversationEntity {
    @Id
    private String id;
    private String type;                 // Tipo: 'direct' (1 a 1) o 'group'
    private List<String> participantIds; // IDs de los usuarios participantes
    private String lastMessageId;        // ID del último mensaje (referencia)
    private Date createdAt;              // Fecha de creación
}
