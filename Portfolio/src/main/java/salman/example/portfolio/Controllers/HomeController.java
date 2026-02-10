package salman.example.portfolio.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("{/home")
    public String showHome(Model model)
    {
        model.addAttribute("message", "Welcome to Student Management System");
        return "home";
    }
}
