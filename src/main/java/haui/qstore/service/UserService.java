/**
 * @(#)UserService.java 2023/04/08.
 * 
  * * 
 * Last_Update 2023/04/08.
 * Version 1.00.
 */
package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.User;
import haui.qstore.model.ChangePassModel;
import haui.qstore.model.InformationModel;

/**
 * Class cung cap cac dich vu thao tac voi table Users trong database
 * 
 *
 */
public interface UserService {
	
	/**
	 * Tim kiem User bang email
	 * 
	 * @param username thong tin email
	 * @return User tim duoc
	 */
	User findUserByEmail(String email);

	void save(User user);

	List<User> findAll();

	User create(User user);

	List<User> findAllUserAnable();

	InformationModel getUserAccount();

	InformationModel update(InformationModel informationModel);

	ChangePassModel updatePass(ChangePassModel changePassModel);

	User findById(Integer id);

	InformationModel createUser(InformationModel informationModel);

	List<User> findAllUserNotRoleAdmin();

	void deleteUser(Integer id);

	InformationModel getOneUserById(Integer id);

	InformationModel updateUser(InformationModel informationModel, Integer id);

	List<User> getListUserEnableSubscribe();

}
