package birenzi.dev.springbootmongodb.modelLayer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document (collection = "User")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String password;
    private String userName;
    private String email;
    private String cellPhoneNumber;

    private List<Role> roles;


    public User(String firstName, String lastName, String middleName, String password, String userName, String email, String cellPhoneNumber, List<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
        this.roles = roles;
    }

    public User(String id, String firstName, String lastName, String middleName, String password, String userName, String email, String cellPhoneNumber, List<Role> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
        this.roles = roles;
    }



}
