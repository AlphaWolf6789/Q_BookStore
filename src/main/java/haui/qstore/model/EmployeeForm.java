/**
 * @(#)EmployeeForm.java 2023/04/10.
 * 
 *
 */
package haui.qstore.model;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.Data;

/**
 * Class thong tin truy van cua bang Employee
 * 
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeForm {
	private int id;
	private String email;
	private String fullname;
	private String position;
	private String department;
	private String phone;
	private int salary;
	private String startday;
	private int role;
}
