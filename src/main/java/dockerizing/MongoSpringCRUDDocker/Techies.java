package dockerizing.MongoSpringCRUDDocker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "techies")
public class Techies {
    private String id;
    private String fullname;
    private int experience;
    private int commercials;
    private String expert;
    private long contact;
}
