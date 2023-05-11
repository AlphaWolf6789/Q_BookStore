/**
 * @(#)RoleService.java 2023/04/24.
 * 
  * * 
 * Last_Update 2023/04/26.
 * Version 1.00.
 */
package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.Role;

/**
 * Class cung cap cac dich vu thao tac voi table Roles trong database
 * 
 *
 */
public interface RoleService {
	
	/**
	 * Tim role bang role id
	 * 
	 * @param thong tin id cua role
	 * @return Role tim duoc
	 */
	Role findRoleById(int roleId);
	
	/**
	 * Tim ten vai tro dua vao user id
	 * 
	 * @param thong tin user id
	 * @return danh sach ten vai tro tim duoc
	 */
	List<String> getRoleNames(int userId);

}
