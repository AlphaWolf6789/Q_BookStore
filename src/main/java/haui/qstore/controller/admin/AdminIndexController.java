/**
 * @(#)AdminIndexController.java 2023/04/10.
 * 
 *
 */
package haui.qstore.controller.admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import haui.qstore.common.Constants;
import haui.qstore.model.StatisticalRevenue;
import haui.qstore.service.OrderService;
import haui.qstore.service.ProductService;
import haui.qstore.service.UserService;

/**
 * Class de hien thi trang chu quan tri
 * 
 *
 */
@Controller
public class AdminIndexController {
	@Autowired
	OrderService orderService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ProductService productService;
	
	
	/**
	 * Hien thi trang chu cua giao dien nguoi dung
	 * 
	 * @return trang admin index.html
	 */
	@GetMapping("/admin/index")
	public String index(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = new Date();
		String[] today = formatter.format(date).toString().split("-");
	    
	    
		long order = orderService.getStatisticalTotalOrderOnMonth(Integer.parseInt(today[1]), Integer.parseInt(today[0])).getOrderSuccess();
		double revenue = 0;
		List<StatisticalRevenue> listRevenue = orderService.listStatisticalRevenue(Integer.parseInt(today[1]), Integer.parseInt(today[0]));
		
		for(StatisticalRevenue item: listRevenue) {
			revenue = revenue + item.getPrice();
		}
		
		long customer = userService.findAllUserNotRoleAdmin().size();
		
		long product = productService.findAll().size();
		
		model.addAttribute("product", product);
		model.addAttribute("customer", customer);
		model.addAttribute("revenue", revenue);
		model.addAttribute("order", order);
		return Constants.USER_DISPLAY_ADMIN_INDEX;
	}
}
