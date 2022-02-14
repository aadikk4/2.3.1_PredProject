package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiseImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") int count, Model model) {
        CarServiseImpl service = new CarServiseImpl();
        model.addAttribute("count", service.getCars(count));
        return "/cars";
    }
}
