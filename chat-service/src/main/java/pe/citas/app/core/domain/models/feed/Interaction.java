package pe.citas.app.core.domain.models.feed;

import lombok.Data;

import java.util.Date;

@Data
public class Interaction {
    private String fromUserId;       // ID del usuario que interactúa
    private String toUserId;         // ID del usuario que recibe la interacción
    private InteractionType type;   // Tipo de interacción
    private Date timestamp;          // Fecha y hora de la interacción

    public enum InteractionType {
        LIKE,           // El usuario dio "like"
        DISLIKE,        // El usuario dio "dislike"
        SUPER_LIKE      // El usuario dio "super like"
    }
}
