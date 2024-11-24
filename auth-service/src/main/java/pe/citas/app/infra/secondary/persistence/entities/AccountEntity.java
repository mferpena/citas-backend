package pe.citas.app.infra.secondary.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class AccountEntity {
    @Id
    private String id;
    private String email;
    private String password;
    private String avatarUrl;
    private List<String> photos;
    private PersonalInfo personalInfo;
    private Demographics demographics;
    private PhysicalAttributes physicalAttributes;
    private Lifestyle lifestyle;
    private MedicalInfo medicalInfo;
    private Preferences preferences;

    @Data
    public static class PersonalInfo {
        private String names;
        private String paternalName;
        private String maternalName;
        private int age;
        private String gender;
        private Date birthday;
        private String profession;
        private boolean isSugarBaby;
        private List<String> languages;
        private String maritalStatus;
        private boolean hasChildren;
        private String bio;
    }

    @Data
    public static class Demographics {
        private String country;
        private String department;
        private String province;
        private String district;
        private String postalCode;
        private String latitude;
        private String longitude;
    }

    @Data
    public static class PhysicalAttributes {
        private String skinType;
        private String bodyType;
        private String eyeColor;
        private String hairColor;
        private String hairType;
        private String noseType;
        private int heightInCm;
        private int weightInKg;
        private int longDickInCm;
        private String breastSize;
    }

    @Data
    public static class Lifestyle {
        private boolean isAthlete;
        private boolean likesGym;
        private String dietaryPreference;
        private boolean likesPets;
        private boolean isOpenToTravel;
        private boolean seeksGymBuddy;
    }

    @Data
    public static class MedicalInfo {
        private String bloodType;
        private String knownConditions;
        private String medications;
        private String allergies;
        private String exerciseFrequency;
        private boolean isSmoker;
        private boolean consumesAlcohol;
        private String sportsPlayed;
        private boolean hasRecentMedicalExams;
        private String lastMedicalExamDate;
        private String recentExamTypes;
        private boolean hasCriticalFindings;
        private String criticalFindingsSummary;
        private String recommendedFollowUpActions;
    }

    @Data
    public static class Preferences {
        private List<String> generalInterests;
        private int minAge;
        private int maxAge;
        private String preferredGender;
        private String sexualOrientation;
        private String preferredOrientation;
        private boolean prefersAthletes;
        private boolean prefersNonSmokers;
        private boolean prefersTravelPartners;
        private boolean seeksLongDistanceRelationship;
        private boolean seeksOpenRelationships;
        private boolean interestedInThreesomes;
        private boolean interestedInInterracialDating;
        private String fetishes;
        private boolean prefersCasualDating;
        private boolean prefersSeriousRelationships;
        private boolean seeksPolyamorousRelationships;
        private boolean seeksVirtualIntimacy;
    }
}
