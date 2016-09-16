package entities;

import entities.DiscountType;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-15T13:53:14")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> quantity;
    public static volatile ListAttribute<Customer, DiscountType> discounts;
    public static volatile SingularAttribute<Customer, Integer> pricePerItem;
    public static volatile SingularAttribute<Customer, Integer> id;

}