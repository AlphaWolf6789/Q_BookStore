/**
 * @(#)RoleDao.java 2023/04/24.
 * 
  * * 
 * Last_Update 2023/04/24.
 * Version 1.00.
 */
package haui.qstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import haui.qstore.entity.Role;
import haui.qstore.entity.UserRole;

/**
 * Class thuc hien truy van thong tin bang Role trong database
 * 
 *
 */
public interface RoleDao extends JpaRepository<Role, Integer>{
	@Query("SELECT u.role.name FROM UserRole u WHERE u.user.id = :uid")
	List<String> getRoleNames(@Param("uid") Integer id);
	
	@Query("SELECT u FROM UserRole u WHERE u.user.id = :uid")
	UserRole getRoleByUserId(@Param("uid") Integer id);
}
