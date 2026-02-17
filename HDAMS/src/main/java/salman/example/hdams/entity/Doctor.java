package salman.example.hdams.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="doctors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Speacialization;

    private Integer experienceYears;

    private Boolean available = true;

    @ManyToOne
    @JoinColumn (name = "branch_id", nullable = false)
    private Branch branch;

}
