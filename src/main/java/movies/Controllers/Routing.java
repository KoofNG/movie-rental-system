package movies.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.*;

@Controller
public class Routing {

    @RequestMapping("/show-form")
    public String showForm() {
        return "showForm";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "processForm";
    }

    @RequestMapping("/process-form-two")
    public String processFormTwo(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName").toUpperCase();
        model.addAttribute("formParameter", studentName);
        return "processForm";
    }

    @RequestMapping("/process-form-annotation")
    public String processFormVersionTwo(@RequestParam ("studentName") String theName, Model model) {
        model.addAttribute("formParameter", theName);
        System.out.println("Ita wan!");
        return "processForm";
    }
}
