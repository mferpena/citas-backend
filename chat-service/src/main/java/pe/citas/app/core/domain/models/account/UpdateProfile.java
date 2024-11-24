package pe.citas.app.core.domain.models.account;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UpdateProfile {
    private List<String> photos;                        // Lista de URLs de las fotos del perfil
    private PersonalInfo personalInfo;                  // Información personal básica
    private Demographics demographics;                  //
    private PhysicalAttributes physicalAttributes;      // Características físicas
    private Lifestyle lifestyle;                        // Estilo de vida y hábitos
    private MedicalInfo medicalInfo;                    // Detalles médicos
    private Preferences preferences;                    // Preferencias para citas

    /**
     * Información básica de la persona.
     */
    @Data
    public static class PersonalInfo {
        private String names;                           // Ejemplo: "John"
        private String paternalName;
        private String maternalName;
        private int age;                                // Edad en años
        private String gender;                          // Ejemplo: "Male", "Female", "Non-binary"
        private Date birthday;                          // Fecha de nacimiento en formato YYYY-MM-DD
        private String profession;                      // Ejemplo: "Software Developer"
        private boolean isSugarBaby;                    // True si es "Sugar Baby", False si no
        private List<String> languages;                 // Ejemplo: ["English", "Spanish", "French"]
        private String maritalStatus;                   // Ejemplo: "Single"
        private boolean hasChildren;                    // True si tiene hijos
        private String bio;                             // Ejemplo: "Adventure lover, musician, and food enthusiast."
    }

    /**
     * Información demográfica.
     */
    @Data
    public static class Demographics {
        private String country;                // País, Ejemplo: "Peru"
        private String department;             // Departamento, Ejemplo: "Lima"
        private String province;               // Provincia, Ejemplo: "Lima"
        private String district;               // Distrito, Ejemplo: "Miraflores"
        private String postalCode;             // Código postal, Ejemplo: "15074"
        private String latitude;               // Latitud de la ubicación
        private String longitude;              // Longitud de la ubicación
    }

    /**
     * Características físicas de la persona.
     */
    @Data
    public static class PhysicalAttributes {
        private String skinType;                        // Ejemplo: "Oily", "Dry", "Normal", "Combination"
        private String bodyType;                        // Ejemplo: "Athletic", "Slim", "Curvy", "Average"
        private String eyeColor;                        // Ejemplo: "Brown", "Blue", "Green"
        private String hairColor;                       // Ejemplo: "Black", "Blonde", "Red", "Brown"
        private String hairType;                        // Ejemplo: "Straight", "Wavy", "Curly", "Kinky"
        private String noseType;                        // Ejemplo: "Roman", "Flat", "Pointed", "Aquiline"
        private int heightInCm;                         // Altura en cm, Ejemplo: 180
        private int weightInKg;                         // Peso en kg, Ejemplo: 75
        private int longDickInCm;                       // Peso en kg, Ejemplo: 75
        private String breastSize;                      // Ejemplo: TODO
    }

    /**
     * Información sobre el estilo de vida y los hábitos de la persona.
     */
    @Data
    public static class Lifestyle {
        private boolean isAthlete;                      // True si es atleta
        private boolean likesGym;                       // True si frecuenta el gimnasio
        private String dietaryPreference;               // Ejemplo: "Vegetarian", "Vegan", "Omnivore", "Pescatarian"
        private boolean likesPets;                      // True si le gustan las mascotas
        private boolean isOpenToTravel;                 // True si está dispuesto a viajar
        private boolean seeksGymBuddy;                  // True si busca un compañero para ir al gimnasio
    }

    /**
     * Información médica de la persona.
     */
    @Data
    public static class MedicalInfo {
        private String bloodType;                       // Ejemplo: "O+", "A-", "B+", "AB-"
        private String knownConditions;                 // Ejemplo: "Asthma, Diabetes"
        private String medications;                     // Medicación actual, Ejemplo: "Inhaler, Insulin"
        private String allergies;                       // Alergias, Ejemplo: "Peanuts, Dust"
        private String exerciseFrequency;               // Ejemplo: "Daily", "Weekly", "Occasionally"
        private boolean isSmoker;                       // True si fuma
        private boolean consumesAlcohol;                // True si consume alcohol
        private String sportsPlayed;                    // Deportes practicados, Ejemplo: "Basketball, Tennis"
        private boolean hasRecentMedicalExams;          // True si se han realizado exámenes médicos recientes
        private String lastMedicalExamDate;             // Fecha del último examen médico, formato: YYYY-MM-DD
        private String recentExamTypes;                 // Tipos de exámenes realizados, Ejemplo: "Blood Test, X-Ray"
        private boolean hasCriticalFindings;            // True si los resultados incluyen hallazgos críticos
        private String criticalFindingsSummary;         // Resumen de hallazgos críticos, Ejemplo: "High cholesterol, abnormal ECG"
        private String recommendedFollowUpActions;      // Acciones recomendadas, Ejemplo: "Dietary changes, further testing"
    }

    /**
     * Preferencias para citas y compatibilidad.
     */
    @Data
    public static class Preferences {
        private List<String> generalInterests;          // Ejemplo: ["Music", "Movies", "Sports"]
        private int minAge;                             // Edad mínima preferida
        private int maxAge;                             // Edad máxima preferida
        private String preferredGender;                 // Ejemplo: "Male", "Female", "Non-binary"
        private String sexualOrientation;               // Ejemplo: "Heterosexual", "Homosexual", "Bisexual", "Pansexual"
        private String preferredOrientation;            // Ejemplo: "Heterosexual", "Bisexual"
        private boolean prefersAthletes;                // True si prefiere atletas
        private boolean prefersNonSmokers;              // True si prefiere no fumadores
        private boolean prefersTravelPartners;          // True si prefiere parejas que viajen
        private boolean seeksLongDistanceRelationship;  // True si busca relaciones a distancia
        private boolean seeksOpenRelationships;         // True si busca parejas abiertas a infidelidades
        private boolean interestedInThreesomes;         // True si está interesado en tríos
        private boolean interestedInInterracialDating;  // True si busca relaciones interraciales
        private String fetishes;                        // Lista de fetiches separados por comas, Ejemplo: "Roleplay, BDSM, Feet"
        private boolean prefersCasualDating;            // True si prefiere relaciones casuales
        private boolean prefersSeriousRelationships;    // True si busca relaciones serias
        private boolean seeksPolyamorousRelationships;  // True si busca relaciones poliamorosas
        private boolean seeksVirtualIntimacy;           // True si busca relaciones íntimas virtuales (ejemplo: envío de contenido sugerente)
    }
}
