/**
 * @(#)AdminEmployeeController.java 2023/04/10.
 * 
  * * 
 * Last_Update 2023/04/13.
 * Version 1.00.
 */
package haui.qstore.controller.admin;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import haui.qstore.common.Constants;

/**
 * Class dung de quan ly nhan vien
 * 

 */
@Controller
public class AdminEmployeeController {
	
	/**
	 * Hien thi trang chu cua giao dien nguoi dung
	 * 
	 * @return trang quan ly nhan vien
	 */
	@GetMapping("/admin/employees/list")
	public String list(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = ((UserDetails) principal).getUsername();
		model.addAttribute("username", username);
		return Constants.USER_DISPLAY_ADMIN_EMPLOYEE_LIST;
	}
	
	/**
	 * Hien thi trang chu cua giao dien nguoi dung
	 * 
	 * @return trang quan ly nhan vien
	 */
	@GetMapping("/admin/employees/form")
	public String form(Model model) {
		model.addAttribute("enableBtnUpdate", false);
		return Constants.USER_DISPLAY_ADMIN_EMPLOYEE_FORM;
	}
	
	@GetMapping("/admin/employees/update/{id}")
	public String update(Model model, @PathVariable("id") Integer id) {
		System.out.println(id);
		model.addAttribute("userId", id);
		model.addAttribute("enableBtnUpdate", true);
		return Constants.USER_DISPLAY_ADMIN_EMPLOYEE_FORM;
	}
}
