package Domain;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;
import com.travelcompany.eshop.enumeration.PaymentMethod;

public class CustomerIndividual extends Customer {
    private static final Object CustomerType = ;
    private static final Long Customer = ;


    public CustomerIndividual() {
        super(Customer);
    }

    public CustomerIndividual(String name) {
        super(name, CustomerType.Individual);
    }

    public CustomerIndividual(Long id, String name, String email, String address, Nationality nationality, Category category) {
        super(id, name, email, address, nationality, category);
    }




}