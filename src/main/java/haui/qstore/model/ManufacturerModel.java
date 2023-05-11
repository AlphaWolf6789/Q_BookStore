/**
 * @(#)ManufacturerModel.java 2023/04/21.
 * 
  * * 
 * Last_Update 2023/04/21.
 * Version 1.00.
 */
package haui.qstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang Manufacturer
 * 
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerModel {
	private int id;
	private String name;
	private String banner;
	private String logo;
	private String describe;
}
