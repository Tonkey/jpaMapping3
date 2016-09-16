package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 *
 * @author nickl
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class DiscountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @ManyToOne
    private Customer customer;
    
    double discount = 0.1;  //10% on all   

    public double calcDiscount(double priceItem, int quantity) {
        return 0.0;
    }
    
    

}
