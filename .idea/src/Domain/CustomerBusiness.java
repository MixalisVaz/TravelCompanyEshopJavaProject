package Domain;

import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;

public class CustomerBusiness extends Customer{

    public CustomerBusiness(Long id, String name, String email, String address, Nationality nationality, Category category) {
        super(id, name, email, address, nationality, category);
    }
}
