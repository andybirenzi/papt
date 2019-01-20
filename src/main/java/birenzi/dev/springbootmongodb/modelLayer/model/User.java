package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
