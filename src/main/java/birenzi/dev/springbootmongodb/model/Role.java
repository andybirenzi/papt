package birenzi.dev.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Role")
public class Role {
    private String role;
    @Id
    private String id;
    private String description;

    public Role() {

    }

    public Role(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public Role(String role, String id, String description) {
        this.role = role;
        this.id = id;
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
