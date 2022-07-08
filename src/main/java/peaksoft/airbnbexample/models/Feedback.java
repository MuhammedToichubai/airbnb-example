package peaksoft.airbnbexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.airbnbexample.models.auth.User;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.List;

import static javax.persistence.CascadeType.*;

/**
 * @author Muhammed Toichubai
 */
@Entity
@Table(name = "feedbacks")
@NoArgsConstructor
@Getter
@Setter
public class Feedback {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "feedback_id_generator"
    )
    @SequenceGenerator(
            name = "feedback_id_generator",
            sequenceName = "feedback_seq",
            allocationSize = 1
    )
    private Long id;

    @ManyToOne(cascade = {
            DETACH,
            MERGE,
            PERSIST,
            REFRESH }
    )
    private User owner;

    @ElementCollection
    private List<String> images;

    private String description;

    private Integer like;

    private Integer disLike;

    private Integer rating;

    @ManyToOne(cascade = {
            DETACH,
            MERGE,
            PERSIST,
            REFRESH
    }, fetch = FetchType.EAGER)
    private Announcement announcement;

    private LocalDate createdAt;
}
