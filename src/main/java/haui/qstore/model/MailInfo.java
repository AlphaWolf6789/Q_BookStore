/**
 * @(#)MailInfo.java 2023/04/08.
 * 
  * * 
 * Last_Update 2023/04/08.
 * Version 1.00.
 */
package haui.qstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class chua thong tin gui mail
 * 
 *
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailInfo {
	String from;
	String to;
	String[] cc;
	String[] bcc;
	String subject;
	String body;
	String[] attachment;
	public MailInfo(String to, String subject, String body) {
		this.from = "HaUi <nhq@gmail.com>";
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
}
