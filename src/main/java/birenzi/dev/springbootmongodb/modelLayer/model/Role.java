package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "Role")

public class Role {
    private String role;
    @Id
    private String id;
    private String description;

       public Role(String role, String description) {
        this.role = role;
        this.description = description;
    }
}
