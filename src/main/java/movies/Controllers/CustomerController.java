package movies.Controllers;

import movies.Models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @RequestMapping("/customer-form")
    public String loadCustomerForm(Model customerModel) {
        Customer newCustomer = new Customer();
        customerModel.addAttribute("customerModel", newCustomer);
        return "customer-form";
    }

    @PostMapping("/process-customer")
    public String processCustomer(@ModelAttribute("customerModel") @Valid Customer customerModel, BindingResult theBindingResult) {
        System.out.println("------------------");
        if (theBindingResult.hasErrors()){
            System.out.println("true");
        } else {
            System.out.println("False");
        }
        return "customerPage";
    }

}
