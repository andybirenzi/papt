package birenzi.dev.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

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

    public SignBoard() {

    }

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

    public SignBoard(String id, String number, long longitude, long latitude, String dimensions, String description, Date installedOn, User installedBy, Location location) {
        this.id = id;
        this.number = number;
        this.longitude = longitude;
        this.latitude = latitude;
        this.dimensions = dimensions;
        this.description = description;
        this.installedOn = installedOn;
        this.installedBy = installedBy;
        this.location = location;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(Date installedOn) {
        this.installedOn = installedOn;
    }

    public User getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(User installedBy) {
        this.installedBy = installedBy;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
