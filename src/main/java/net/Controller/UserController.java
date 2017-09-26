package net.Controller;

import net.Model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {
    private static final Logger log = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/registr",method = RequestMethod.GET)
    public String helloUser(Model model) {
        model.addAttribute("user", new User());
        return "main";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            log.info("Error "+result.toString());
            return "main";
        }
        return "suc";
    }
}
