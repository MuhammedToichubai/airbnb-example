package peaksoft.airbnbexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author Muhammed Toichubai
 */
@Entity
@Table(name = "regions")
@NoArgsConstructor
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                     generator = "region_id_generator")
    @SequenceGenerator(name = "region_id_generator",
    sequenceName = "region_id_seq",
    allocationSize = 1)
    private  Long id;

    private String regionName;

//    @OneToMany(cascade = {})
//    private List<Address> addresses;
}
