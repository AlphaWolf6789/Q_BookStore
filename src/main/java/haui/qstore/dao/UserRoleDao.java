/**
 * @(#)UserRoleDao.java 2023/04/07.
 * 
 *
 */
package haui.qstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import haui.qstore.entity.UserRole;

/**
 * Class thuc hien truy van thong tin bang User_Role trong database
 * 
 *
 */
public interface UserRoleDao extends JpaRepository<UserRole, Integer>{
	@Query("SELECT u FROM UserRole u WHERE (u.role.id = 2 or u.role.id = 3) and u.user.Deleteday = null")
	List<UserRole> findAllAdminOrDirector();
}
 