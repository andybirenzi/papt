package birenzi.dev.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

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

    public Sign() {

    }

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

    public Sign(String id, String name, String description, Date activeDate, Date removeDate, User installedBy, User removedBy, boolean active, String image, User lastUpdatedBy, SignCategory category) {

        this.id = id;
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

    public SignCategory getCategory() {
        return category;
    }

    public void setCategory(SignCategory category) {
        this.category = category;
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

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }

    public User getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(User installedBy) {
        this.installedBy = installedBy;
    }

    public User getRemovedBy() {
        return removedBy;
    }

    public void setRemovedBy(User removedBy) {
        this.removedBy = removedBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(User lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
