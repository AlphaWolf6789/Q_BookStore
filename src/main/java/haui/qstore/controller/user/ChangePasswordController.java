package haui.qstore.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import haui.qstore.common.Constants;

@Controller
public class ChangePasswordController {
	@GetMapping("/account/change-password")
	public String index() {
		return Constants.USER_DISPLAY_ACCOUNT_CHANGE_PASSWORD;
	}
}
