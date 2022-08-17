package User;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Data
public class Role {
    @Id
    @SequenceGenerator(name= "User_Sequence", sequenceName = "User_Sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "User_Sequence")
    private Long id;
    private String name;
    private String username;

}
