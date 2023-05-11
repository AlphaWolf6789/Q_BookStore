package haui.qstore.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import haui.qstore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class GlobalInterceptor implements HandlerInterceptor {
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	InformationShopService informationService;

//	@Autowired
//	UserService userService;
	
	@Autowired
	SessionService sessionService;
	
	@Autowired
	ShoppingCartService cartService;

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		request.setAttribute("categories", categoryService.findAll());
		request.setAttribute("information", informationService.getOneInformationShop());
//		request.setAttribute("userAttribute", userService.getUserAccount());
		sessionService.set("sessionProduct", cartService);
	}
}
