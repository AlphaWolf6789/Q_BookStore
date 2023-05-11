/**
 * @(#)EmployeeModel.java 2023/04/22.
 * 
  * * 
 * Last_Update 2023/04/22.
 * Version 1.00.
 */
package haui.qstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang MenuOne
 * 
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nav1Model {
	private int id;
	private String name;
	private int categoryId;
	private String nameSearch;
}
