package birenzi.dev.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="Location")
public class Location {
    @Id
    private String id;
    private String address1;
    private String address2;
    private String city;
    private String country;

    public Location(String id, String address1, String address2, String city, String country) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
