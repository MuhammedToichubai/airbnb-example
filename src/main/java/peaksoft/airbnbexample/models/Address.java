package peaksoft.airbnbexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

/**
 * @author Muhammed Toichubai
 */
@Entity
@Table(name = "addresses")
@NoArgsConstructor
@Getter @Setter
public class Address {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_id_generator"
    )
    @SequenceGenerator(
            name = "address_id_generator",
            sequenceName = "address_seq",
            allocationSize = 1
    )
    private Long id;

    @ElementCollection
    private List<String> region;

    private String city;

    private String address;

    @OneToOne(cascade = {DETACH,PERSIST,MERGE,REFRESH},
               fetch = FetchType.EAGER, mappedBy = "location")
    private Announcement announcement;


}
