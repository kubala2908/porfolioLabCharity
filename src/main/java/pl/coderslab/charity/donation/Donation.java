package pl.coderslab.charity.donation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.institution.Institution;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    @OneToMany
    private List<Category> categoryList;
    @ManyToOne
    @JoinColumn(name = "instiution_id")
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;
}
