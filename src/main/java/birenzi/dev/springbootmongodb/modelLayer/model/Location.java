package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection="Location")
public class Location {
    @Id
    private String id;
    private String address1;
    private String address2;
    private String city;
    private String country;


    public Location(String address1, String address2, String city, String country) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.country = country;
    }

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
