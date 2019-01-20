package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "TaskStatus")
public class TaskStatus {
    @Id
    private String id;
    private String status;
    private String description;

    public TaskStatus(String status, String description) {
        this.status = status;
        this.description = description;
    }

}