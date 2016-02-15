package org.fileupload.spring.Controller;

import javax.validation.Valid;

import org.fileupload.spring.Model.ValidUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String getForm(){
		return "Login";
	}
	
	@RequestMapping(value = "/onSubmit",method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("validuser") ValidUser validuser, BindingResult result){
		
		if(result.hasErrors()){
			return "Login";
		}
		return "SignUp";
	}
	
}
