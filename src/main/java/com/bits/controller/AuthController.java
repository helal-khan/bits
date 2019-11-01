package com.bits.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bits.model.User;
import com.bits.service.UserService;

@Controller
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String showRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByUsername(user.getUsername());
        if (userExists != null) {
            bindingResult
                    .rejectValue("username", "error.user",
                            "There is already a user registered with the username provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("registration");
        }
        return modelAndView;
    }
	
	@RequestMapping("/access-denied")
	public String showAccessDenied(){
		return "accessDenied";
	}

}
