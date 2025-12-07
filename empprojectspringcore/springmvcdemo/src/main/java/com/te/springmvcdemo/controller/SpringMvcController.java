package com.te.springmvcdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springmvcdemo.dto.Employee;
import com.te.springmvcdemo.service.EmployeeService;

@Controller
public class SpringMvcController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String authenticate(ModelMap map, int id, String password, HttpServletRequest request,
			HttpServletResponse response) {
		Employee employee = employeeService.validate(id, password);// employee object
		if (employee != null) {
			HttpSession session = request.getSession();
			// HttpCookie cookie=response.
			session.setAttribute("loggedIn", employee);
			map.addAttribute("msg", employee.getName());
			return "home";
		}
		map.addAttribute("error", "Invalid credentials");
		return "login";
	}

	@GetMapping("/search")
	public String search(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map,
			HttpSession session) {
		if (emp != null) {
			return "getData";
		}
		map.addAttribute("msg", "Please login First");
		return "login";
	}

	@PostMapping("/search")
	public String search(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map, int empId) {
		Employee employee = employeeService.getData(empId);// employee object
		if (emp != null) {
			if (employee != null) {

				map.addAttribute("msg", employee);
				return "getData";
			}
			map.addAttribute("error", "Data Not Found" + " " + empId);
			return "getData";
		}
		map.addAttribute("msg", "Please login First");
		return "login";

	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("msg", "Logout successfully!!");
		return "login";
	}

	@GetMapping("/delete")
	public String deleteData(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map) {
		if (emp != null) {
			return "deleteData";
		}

		else {
			map.addAttribute("msg", "Please login First");
			return "login";

		}

	}

	@PostMapping("/delete")
	public String deleteData(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map,
			int empId) {
		if (emp != null) {
			int res = employeeService.deleteData(empId);
			if (res != 0) {
				map.addAttribute("msg", "Deleted data successfully");
				return "deleteData";
			} else {
				map.addAttribute("error", "Data Not Found" + " " + empId);
				return "deleteData";
			}

		} else {
			map.addAttribute("msg", "Please login First");
			return "login";
		}
	}

	@GetMapping("/addData")
	public String addData(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map) {
		if (emp != null) {
			return "addData";
		} else {
			map.addAttribute("msg", "Please login First");
			return "login";
		}

	}

	@PostMapping("/addData")
	public String addData(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map, int id,
			String name, String address, String password) {
		if (emp != null) {
			boolean res = employeeService.addData(id, name, address, password);
			if (res != false) {
				map.addAttribute("msg1", "Data insetred successfully!!!");
				return "home";
			} else {
				map.addAttribute("error", "Data not inserted,Plese input valid data");
				return "addData";
			}
		} else {
			map.addAttribute("msg", "Please login First");
			return "login";
		}
	}

	@GetMapping("/update")
	public String updateData(@SessionAttribute(name = "loggedIn", required = false) Employee employee, ModelMap map) {
		if (employee != null) {
			return "updateData";
		} else {
			map.addAttribute("msg", "Please login First");
			return "login";
		}

	}

	@PostMapping("/update")
	public String updateData(@SessionAttribute(name = "loggedIn", required = false) Employee emp, ModelMap map, int id,
			String name) {
		if (emp != null) {
			Boolean update = employeeService.updateData(id, name);
			if (update != false) {
				map.addAttribute("msg1", " Data Updated Successfully");
				return "home";
			} else {
				map.addAttribute("error", "Invalid Id " + id);
				return "updateData";
			}
		} else {
			map.addAttribute("msg", "Please login First");
			return "login";
		}

	}

	@GetMapping("/allDetails")
	public String seeAllDetails(@SessionAttribute(name = "loggedIn", required = false) 
	Employee emp, ModelMap map) {
		if (emp != null) {
			List<Employee> result = employeeService.seeAllDetails();
			if (result != null) {
				map.addAttribute("result", result);
				return "seeAllDetails";
			} else {
				map.addAttribute("error", "Invalid Id ");
				return "seeAllDetails";
			}
		} else {
			map.addAttribute("msg", "Please Login First");
			return "login";
		}
	}

}
