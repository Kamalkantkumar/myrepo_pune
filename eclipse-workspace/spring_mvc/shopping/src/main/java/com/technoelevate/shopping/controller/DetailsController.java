package com.technoelevate.shopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.technoelevate.shopping.dto.CarClass;
import com.technoelevate.shopping.dto.DetailsDto;
import com.technoelevate.shopping.service.DetailsService;

@Controller
public class DetailsController {

	@Autowired
	DetailsService detailsService;

	@GetMapping("/home")
	public String home1() {
		return "customersearch";

	}

//	@GetMapping("/register")
//	public String register() {
//		return "register";
//
//	}
//
//	@PostMapping("/register")
//	public String newAccount(ModelMap map, DetailsDto dto) {
//		boolean addEmp = detailsService.addEmp(dto);
//		if (addEmp == true) {
//			String msg = "Register succesful please login";
//			map.addAttribute("message", msg);
//		} else {
//			String msg = "User already exist please login!!!";
//			map.addAttribute("message", msg);
//		}
//
//		return "login";
//
//	}

	@GetMapping("/login")
	public String login() {

		return "login";
	}

	@PostMapping("/login")
	public String name6(ModelMap map, String number, String password, HttpServletRequest request, String name) {
		DetailsDto dto = detailsService.login(number, password, name);
		if (dto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginkey", dto);
			map.addAttribute("msg", dto);
			return "home";
		} else {
			String msg = "invalid user please register!!!!!";
			map.addAttribute("msg", msg);
		}
		return "register";

	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("mess", "logout succesful");
		return "login";
	}

	public String log(ModelMap map) {
		return null;

	}

	@GetMapping("/update")
	public String update(ModelMap map, @SessionAttribute(name = "loginkey", required = false) DetailsDto dto) {
		if (dto != null) {
        // CarClass updateShow = detailsService.updateShow(id);
			return "find";
		} else {
			map.addAttribute("mess", "logout please login agin!!!!");
			return "login";
		}

	}

	@PostMapping("/update")
	public String updateData(ModelMap map, @SessionAttribute(name = "loginkey", required = false) DetailsDto dto,
			 String id) {
		if (dto != null) {
			CarClass updateClass = detailsService.updateShow(id);
			System.out.println(updateClass);
           
			map.addAttribute("messageobj", updateClass);
			 // map.addAttribute("mess","updated succesful");
			return "update";
		} else {
			map.addAttribute("mess", "logout please login agin!!!!");
			return "login";
		}
	}
	@PostMapping("/updatef")
	public String updateDataf(ModelMap map, @SessionAttribute(name = "loginkey", required = false) DetailsDto dto,
			CarClass cls) {
		if (dto != null) {
			CarClass updateClass = detailsService.updateShowf(cls);
           
			map.addAttribute("mes", "succussfull");
			 // map.addAttribute("mess","updated succesful");
			return "update";
		} else {
			map.addAttribute("mess", "logout please login agin!!!!");
			return "login";
		}
	}
	
	

	@GetMapping("/delete")
	public String del(ModelMap map, @SessionAttribute(name = "loginkey", required = false) DetailsDto dto) {
		if (dto != null) {
			return "delete";
		} else {
			map.addAttribute("mess", "logout please login agin!!!!");
			return "login";
		}

	}

	@PostMapping("/delete")
	public String updatePost(ModelMap map, String id, String password, String name, String gender, String email,
			String dob, @SessionAttribute(name = "loginkey", required = false) DetailsDto dto) {
		if (dto != null) {
			boolean delete = detailsService.Delete(id);
			if (delete == true) {
				String msg = "deleted succesful";
				map.addAttribute("key", msg);
			} else {
				String msg = "deleted unsuccesful";
				map.addAttribute("key", msg);
			}

			return "delete";
		} else {
			map.addAttribute("mess", " please login again!!!! ");
			return "delete";
		}
	}

	@GetMapping("/search")
	public String search(ModelMap map, @SessionAttribute(name = "loginkey", required = false) DetailsDto dto) {
		if (dto != null) {
			return "search";
		} else {
			map.addAttribute("mess", "logout please login agin!!!!");
			return "login";
		}
	}           

	@PostMapping("/search")
	public String ser(ModelMap map, String number,
			@SessionAttribute(name = "loginkey", required = false) DetailsDto dto) {
		if (dto != null) {
			
			DetailsDto addEmp = detailsService.Search(number);
			if(addEmp!=null) {
			map.addAttribute("key", addEmp);
			}else {
				map.addAttribute("msg","data not found");
			}
			return "search";
		} else {
			map.addAttribute("mess", "logout please login agin!!!!");
			return "login";
		}

	}

	@GetMapping("/password")
	public String password() {
		return "password";

	}

	@PostMapping("/password")
	public String name1(ModelMap map, String number, String password, String password1) {
		DetailsDto password2 = detailsService.password(number, password, password1);

		map.addAttribute("mess", "Password updated Succesfully!!!");

		return "login";
	}

	@GetMapping("/enter")
	public String enter() {

		return "enter";
	}

	@PostMapping("/enter")
	public String name5(ModelMap map, CarClass class1) {

		boolean enter = detailsService.enter(class1);
		if (class1 != null) {
			map.addAttribute("key", class1);
			return "enter";
		} else {
			map.addAttribute("mess", "logout please login");
			return "login";
		}

	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";

	}

	@GetMapping("/find")
	public String find() {
		return "main";

	}

	@PostMapping("/find")
	public String namefind(ModelMap map, String fuel_type) {

		List<CarClass> name2 = detailsService.name(fuel_type);
		System.out.println(name2);
		if (name2 != null) {
			map.addAttribute("msg", name2);
			return "index";
		} else {
			map.addAttribute("msg", "details not found");
			return "main";
		}
	}
	@PostMapping("/adminfind")
	public String namefind1(ModelMap map, String fuel_type) {

		List<CarClass> name2 = detailsService.name(fuel_type);
		System.out.println(name2);
		if (name2 == null) {
			map.addAttribute("msg", "details not found");
			return "main";
		} else {
			map.addAttribute("msg", name2);

			return "admindetails";
			
		}
	}

	@GetMapping("/profile")
	public String profile(ModelMap map, String number) {
		DetailsDto profile = detailsService.profile(number);
		map.addAttribute("msg", profile);
		return "profile";

	}

}
