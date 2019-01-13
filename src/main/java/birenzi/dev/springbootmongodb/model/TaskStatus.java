package birenzi.dev.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "TaskStatus")
public class TaskStatus {
    @Id
    private String id;
    private String status;
    private String description;

    public TaskStatus() {

    }

    public TaskStatus(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public TaskStatus(String id, String status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
