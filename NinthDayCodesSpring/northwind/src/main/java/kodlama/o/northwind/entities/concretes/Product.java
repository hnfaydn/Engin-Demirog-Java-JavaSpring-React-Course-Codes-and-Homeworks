package kodlama.o.northwind.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "product_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler","categories"})
    private int id;

    //@Column(name= "category_id")
    //private int categoryId;

    @Column(name= "product_name")
    private String productName;

    @Column(name= "unit_price")
    private double unitPrice;

    @Column(name= "units_in_stock")
    private short unitsInStock;

    @Column(name= "quantity_per_unit")
    private String quantityPerUnit;


    @ManyToOne
    @JoinColumn(name="category_id")
    private Category categories;


}
