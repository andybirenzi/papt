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

@Document(collection = "Sign")
public class Sign {
    @Id
    private String id;
    private String name;
    private String description;
    private Date activeDate;
    private Date removeDate;
    private User installedBy;
    private User removedBy;
    private boolean active;
    private String image;
    private User lastUpdatedBy;
    private SignCategory category;

    public Sign(String name, String description, Date activeDate, Date removeDate, User installedBy, User removedBy, boolean active, String image, User lastUpdatedBy, SignCategory category) {
        this.name = name;
        this.description = description;
        this.activeDate = activeDate;
        this.removeDate = removeDate;
        this.installedBy = installedBy;
        this.removedBy = removedBy;
        this.active = active;
        this.image = image;
        this.lastUpdatedBy = lastUpdatedBy;
        this.category = category;
    }

}
