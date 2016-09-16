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
public class DiscountQuantity extends DiscountType{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    int quantityForDiscount = 3; 
    double discount = 0.2; //20% on all if quantity is 3 or more 
   
    
    
   @Override 
   public double calcDiscount(double priceItem, int quantity) {     
       return quantity >=quantityForDiscount ? priceItem * quantity * discount : 0; 
   } 
 
}
