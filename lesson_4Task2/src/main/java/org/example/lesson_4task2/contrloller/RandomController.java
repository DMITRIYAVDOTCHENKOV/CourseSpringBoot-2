package org.example.lesson_4task2.contrloller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class RandomController {
        @GetMapping("/random")
    public String getRandom(Model model) {
        model.addAttribute("number",new Random().nextInt(1000));
        return "random";
    }

    @Value("$data.parameter.min:25")
    private Integer minDefault;

    @Value("$data.parameter.max:55")
    private Integer maxDefault;

    @GetMapping("/random/{min}/{max}")
    public String getRandomNumber(@RequestParam("min") Integer min,
                            @RequestParam("max") Integer max,
                            Model model) {
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("minDefault", minDefault);
        model.addAttribute("maxDefault", maxDefault);
        model.addAttribute("number", new Random().nextInt(min, max + 1));
        return "random";
    }
}