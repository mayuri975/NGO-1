package com.ngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ngo.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService Userservice;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
		System.out.println("init login is reached");
        return "login";
    }
	@RequestMapping(value="/logout",method= RequestMethod.GET)
	public String showLogoutPage(ModelMap model) {
		System.out.println("init logout is reached");
        return "logout";
	}

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = true ;//service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }
}
