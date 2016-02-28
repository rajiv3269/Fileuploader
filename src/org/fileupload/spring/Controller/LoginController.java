package org.fileupload.spring.Controller;

import javax.validation.Valid;

import org.fileupload.spring.DAO.UserDao;
import org.fileupload.spring.Model.Unregister;
import org.fileupload.spring.Model.UserDetails;
import org.fileupload.spring.Model.ValidUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@Autowired
	private UserDao userdao;

	@RequestMapping(value = "/Login",method = RequestMethod.GET)
	public String getLoginForm(){
		return "Login";  
	}

	@RequestMapping(value = "/Signup",method = RequestMethod.GET)
	public String getSignUpForm(){
		return "SignUp";  
	}
	
	@RequestMapping(value = "/Unsub",method = RequestMethod.GET)
	public String cancelRegiter(){
		return "Unsubscribe";  
	}

	@RequestMapping(value = "/OnSubmitLogin",method = RequestMethod.POST)
	public String submitLogin(@Valid @ModelAttribute("validuser") ValidUser validuser, BindingResult result){

		if(result.hasErrors()){
			return "Login";
		}
		
		return "redirect:/Signup";
	}

	@RequestMapping(value = "/OnSubmitSignup",method = RequestMethod.POST)
	public String submitSignup(@Valid @ModelAttribute("userdetails") UserDetails userdetails, BindingResult result){
		if(result.hasErrors()){
			return "SignUp";  
		}
		
		userdao.insertUser(userdetails);
		return "Success";
	}
	
	@RequestMapping(value = "/OnSubmitunsubscribe",method = RequestMethod.POST)
	public String unregister(@Valid @ModelAttribute("Unregister") Unregister Unregister, BindingResult result){

		if(result.hasErrors()){
			return "Unsubscribe";
		}
		return "Thanks";
	}
}
