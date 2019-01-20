package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "SignBoard")
public class SignBoard {
    @Id
    private String id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String number;
    private long longitude;
    private long latitude;
    private String dimensions;
    private String description;
    private Date installedOn;
    private User installedBy;
    private Location location;


    public SignBoard(String number, long longitude, long latitude, String dimensions, String description, Date installedOn, User installedBy, Location location) {
        this.number = number;
        this.longitude = longitude;
        this.latitude = latitude;
        this.dimensions = dimensions;
        this.description = description;
        this.installedOn = installedOn;
        this.installedBy = installedBy;
        this.location = location;
    }


}
