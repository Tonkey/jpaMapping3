package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author nickl
 */
@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    private int pricePerItem;
    private int quantity;
    
    
    @OneToMany(mappedBy = "customer")
    private List<DiscountType> discounts = new ArrayList();
    
    public int getPrice(int pricePerItem, int quantity){
        return pricePerItem*quantity;
    }
    
}
