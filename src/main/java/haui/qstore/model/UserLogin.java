/**
 * @(#)UserLogin.java 2023/04/09.
 * 
*
 */
package haui.qstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class lam viec voi form login.html
 * 
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {
	// Thong tin user name
	private String username;
	// Thong tin password
	private String password;
}
