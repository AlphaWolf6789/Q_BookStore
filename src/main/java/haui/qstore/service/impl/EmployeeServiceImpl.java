/**
 * @(#)RoleServiceImpl.java 2023/04/10.
 * 
 *
 */
package haui.qstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import haui.qstore.dao.EmployeeDao;
import haui.qstore.entity.Employee;
import haui.qstore.model.EmployeeModel;
import haui.qstore.service.EmployeeService;

/**
 * Class trien khai theo interface EmployeeService, Thao tac voi Class EmployeeDao de
 * thuc hien cac tac vu tuong ung
 * 
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<EmployeeModel> getListEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getListEmployee();
	}

	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

}
