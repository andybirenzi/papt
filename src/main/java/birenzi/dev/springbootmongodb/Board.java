package birenzi.dev.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document (collection = "Boards")
public class Board {
    @Id
    private String id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePerNight;
    private String name;
    private Address address;


    public String getId() {
        return id;
    }


    public Board(int pricePerNight, String name, Address address) {
        this.pricePerNight = pricePerNight;
        this.name = name;
        this.address = address;

    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
