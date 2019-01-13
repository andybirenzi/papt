package birenzi.dev.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document (collection ="TaskType")
public class TaskType {
    @Id
    private String id;
    private String name;
    private String description;
    private Date createdOn;

    public TaskType() {

    }

    public TaskType(String name, String description, Date createdOn) {
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
    }

    public TaskType(String id, String name, String description, Date createdOn) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
