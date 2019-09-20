package movies.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

    // Return the Index page
    @GetMapping("/")
    public String showIndexPage() {
        System.out.println("You are in me =>> Show index page");
        return "index";
    }
}
