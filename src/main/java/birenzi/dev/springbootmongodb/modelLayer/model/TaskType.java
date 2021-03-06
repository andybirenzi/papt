package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection ="TaskType")
public class TaskType {
    @Id
    private String id;
    private String name;
    private String description;
    private Date createdOn;

       public TaskType(String name, String description, Date createdOn) {
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
    }

}
