package peaksoft.airbnbexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.airbnbexample.models.auth.User;
import peaksoft.airbnbexample.models.enums.Status;
import peaksoft.airbnbexample.models.enums.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;

/**
 * @author Muhammed Toichubai
 */
@Entity
@Table(name = "announcements")
@NoArgsConstructor
@Getter
@Setter
public class Announcement {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "announcement_id_generator"
    )
    @SequenceGenerator(
            name = "announcement_id_generator",
            sequenceName = "announcement_seq",
            allocationSize = 1
    )
    private Long id;

    private String title;

    private String description;

    @ElementCollection
    private List<String> images;

    private Status status;

    private BigDecimal price;

    @OneToMany(cascade = ALL,
               fetch = EAGER,
               mappedBy = "announcement")
    private List<Feedback> feedbacks;

    private Integer maxGuests;

    private Type houseType;

    @ManyToOne(cascade = {DETACH, MERGE, PERSIST, REFRESH},
               fetch = EAGER)
    private User owner;

    @OneToOne(cascade = ALL)
    private Address location;

    @ManyToMany(cascade = {
            REMOVE,
            DETACH,
            MERGE,
            PERSIST,
            REFRESH},
    fetch = EAGER)
    private List<User> guests;

    @OneToMany(cascade = ALL,
            mappedBy = "announcement")
    private List<Booking> bookings;

    private LocalDate createdAt;


}
