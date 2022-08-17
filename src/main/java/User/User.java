package User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class User {
@Id
@SequenceGenerator(name= "User_Sequence", sequenceName = "User_Sequence", allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "User_Sequence")
private Long id;
private String name;
private String username;
private Integer password;

@ManyToMany(fetch= FetchType.EAGER)
private Collection<Role> roles;


}
