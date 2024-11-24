package pe.citas.app.core.domain.models.chat;

import lombok.Data;

@Data
public class User {
    private String id;
    private String names;
    private String status;      // Estado del usuario, Ejemplo: "Online", "Offline"
    private String avatarUrl;   // URL del avatar del usuario
}
