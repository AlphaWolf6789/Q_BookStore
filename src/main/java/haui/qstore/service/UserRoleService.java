/**
 * @(#)UserRoleService.java 2023/04/24.
 * 
  * * 
 * Last_Update 2023/04/24.
 * Version 1.00.
 */
package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.UserRole;

/**
 * Class cung cap cac dich vu thao tac voi table User_Role trong database
 * 
 *
 */
public interface UserRoleService{
	
	/**
	 * Luu user role vao database
	 * 
	 * @param userRole
	 */
	void save(UserRole userRole);

	List<UserRole> findAll();

	List<UserRole> findAllAdminOrDirector();

	void delete(Integer id);
	
}
