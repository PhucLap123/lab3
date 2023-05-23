package luphuclap.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "category",cascade= CascadeType.ALL)
    private List<Book> books;
}
