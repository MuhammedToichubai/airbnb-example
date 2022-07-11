package peaksoft.airbnbexample.models.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.airbnbexample.models.Announcement;
import peaksoft.airbnbexample.models.Feedback;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

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
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_id_generator")
    @SequenceGenerator(
            name = "users_id_generator",
            sequenceName = "user_seq",
            allocationSize = 1)

    private Long id;

    private String fullName;

    private String email;

    private String password;

    private String image;

    @OneToMany(cascade = ALL, fetch = LAZY)
    private List<Announcement> announcements;

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "owner")
    private List<Feedback> feedbacks;

    @OneToOne(cascade = ALL, fetch = LAZY)
    private Role role;
}
