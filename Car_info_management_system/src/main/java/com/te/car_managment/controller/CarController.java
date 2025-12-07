package com.te.car_managment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.car_managment.Dto.AdminInfo;
import com.te.car_managment.Dto.CarData;
import com.te.car_managment.Dto.CarInfo;
import com.te.car_managment.service.CarService;

@Controller
public class CarController {

	@Autowired
	private CarService service;

	@GetMapping("/login")
	public String getLogin() {

		return "login";

	}
	@GetMapping("/firstpage")
	public String getFirstPage() {

		return "firstpage";

	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.removeAttribute("loggedIn");

		map.addAttribute("error", "Please Enter User ID and Password");
		return "login";

	}

	@PostMapping("/validate") // while login from Login page
	public String validateAdminData(ModelMap map, int adminId, String password, HttpServletRequest request) {

		AdminInfo adminInfo = service.validateAdminInfo(adminId, password);

		if (adminInfo != null) {

			HttpSession session = request.getSession();
			session.setAttribute("loggedIn", adminInfo);

			map.addAttribute("userInfo", adminInfo);

			return "adminhomepage";
		} else {

			map.addAttribute("error", "Invalid Credentials !!");
			return "login";
		}
	}

	@GetMapping("/getAdminHomePage") // for Home button from Nav Bar
	public String getAdminHomePage(ModelMap map, CarData carData,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			map.addAttribute("welcomeAdmin", info);

			return "adminhomepage";
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}
	
	@GetMapping("/getaddCarData") // for Insert Button Nav Bar
	public String getaddCarData(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			return "insertdata";
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}
	
	@GetMapping("/seeAllCarDetails")
	public String allCarDetails(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {
			
			List<CarInfo> found = service.seeAllCarData() ;

			if (found != null) {

				map.addAttribute("carList", found);

				return "seeallcardataadmin";
			} else {

				map.addAttribute("error", "Failed !!");

				return "seeallcardataadmin";
			}

		}  else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}

	@PostMapping("/addCar")
	public String addCarData(ModelMap map, CarData carData,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			if (service.addCar(carData)) {

				map.addAttribute("carAdded", "Data added Successfully !!");

				return "adminhomepage";
			} else {

				map.addAttribute("error", "Failed !!");

				return "adminhomepage";
			}

		} else {

			return "login";
		}
	}
	
	@GetMapping("/getdeletepage")
	public String getDeletePage(ModelMap map,@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {
			
			return "delete";
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}
	
	@PostMapping("/delete")
	public String deleteCarData(ModelMap map, int carId,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			if (service.deleteCarData(carId)) {
				
				map.addAttribute("deleted", service.deleteCarData(carId) );
				return "delete";
			}

			else {

				map.addAttribute("notdeleted", "Problem Occured while deleting car Data !!");
				return "delete";
			}
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}

	@GetMapping("/getmodifypage")
	public String getModifyPage(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			return "modify";
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}

	@PostMapping("/validatecar")
	public String validateCar(ModelMap map, int carId,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			CarInfo found = service.validateCarData(carId);

			if (found != null) {

				map.addAttribute("found", found.getCar_id());

				return "modify";
			}

			else {

				map.addAttribute("notfound", "Car not found , Please enter valid car ID");

				return "modify";
			}
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}
	
	@GetMapping("/getsearchadmin")
	public String getSearchAdmin(ModelMap map ,@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {
		
		if (info != null) {

			return "searchadmin";
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
		
	}
	
	
	@PostMapping("/searchadmin")
	public String searchAdmin(ModelMap map, int userInput,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {
		
		
		if (info != null) {

			CarInfo found = service.validateCarData(userInput);
			if (found != null) {

				map.addAttribute("found", found);
				
				
				return "searchadmin";
			}
			else {

				map.addAttribute("notfound", "Car not found , Please enter valid car ID");
				return "searchadmin";
			}
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}
	
	
	@PostMapping("/modify")
	public String modifyCar(ModelMap map, CarData modifyData,
			@SessionAttribute(name = "loggedIn", required = false) AdminInfo info) {

		if (info != null) {

			CarInfo modified = service.modifyCarData(modifyData) ;

			if (modified != null) {

				map.addAttribute("modified", modified.getCar_id());

				return "modify";
			}

			else {

				map.addAttribute("notfound", "Error while modifying the data !!");

				return "modify";
			}
		} else {

			map.addAttribute("error", "Please Login first !!");
			return "login";
		}
	}
	
	@GetMapping("/getsearchbar")
	public String getSearchBar() {

		return "searchbar";

	}

	@PostMapping("/searchresult")
	public String fetchResult(ModelMap map, String userInput) {

		List<CarInfo> carInfo = service.validateUserInput(userInput);

		if (carInfo != null) {

			map.addAttribute("carList", carInfo);
			return "searchbar";
		} else {

			map.addAttribute("error", " No reult found !! ") ;
			return "searchbar";
		}
	}

}
