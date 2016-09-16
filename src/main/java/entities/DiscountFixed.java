package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author nickl
 */
@Entity
public class DiscountFixed extends DiscountType{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
     double discount = 0.1;  //10% on all   

     @Override   
     public double calcDiscount(double priceItem, int quantity) {
         return priceItem * discount *quantity;   
     } 
 
    
    
}
