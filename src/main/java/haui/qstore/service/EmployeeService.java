/**
 * @(#)RoleService.java 2023/04/10.
 * 
 *
 */
package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.Employee;
import haui.qstore.model.EmployeeModel;

/**
 * Class cung cap cac dich vu thao tac voi table Employee trong database
 * 
 *
 */
public interface EmployeeService {

	List<EmployeeModel> getListEmployee();

	void save(Employee employee);
	
}
