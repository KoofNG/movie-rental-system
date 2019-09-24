package movies.Controllers;

import movies.Models.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/customer-form")
    public String loadCustomerForm(Model customerModel) {
        Customer newCustomer = new Customer();
        customerModel.addAttribute("customerModel", newCustomer);
        return "customer-form";
    }

    @PostMapping("/process-customer")
    public String processCustomer(
            @Valid @ModelAttribute("customerModel")  Customer customerModel,
            BindingResult theBindingResult) {
        if (theBindingResult.hasErrors()) {
            System.out.println("True");
            return "customer-form";
        } else {
            System.out.println("False");
            return null;
        }
    }

}
