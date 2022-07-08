package peaksoft.airbnbexample.models.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Muhammed Toichubai
 */
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "users_id_generator")
    @SequenceGenerator(name = "users_id_generator",
    sequenceName = "announcement_seq",
    allocationSize = 1)

    private Long id;

    private String fullName;

    private String email;

    private String password;

    @OneToOne
    private Role role;
}
