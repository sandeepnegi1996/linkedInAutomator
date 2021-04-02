/*
 * package com.workon.utilities.emailService;
 * 
 * import java.io.FileInputStream; import java.io.IOException; import
 * java.io.InputStream; import java.util.Properties;
 * 
 * import javax.activation.DataHandler; import javax.activation.DataSource;
 * import javax.activation.FileDataSource; import javax.mail.BodyPart; import
 * javax.mail.Message; import javax.mail.MessagingException; import
 * javax.mail.Multipart; import javax.mail.PasswordAuthentication; import
 * javax.mail.Session; import javax.mail.Transport; import
 * javax.mail.internet.InternetAddress; import javax.mail.internet.MimeBodyPart;
 * import javax.mail.internet.MimeMessage; import
 * javax.mail.internet.MimeMultipart;
 * 
 * import org.apache.commons.mail.DefaultAuthenticator; import
 * org.apache.commons.mail.EmailAttachment; import
 * org.apache.commons.mail.EmailException; import
 * org.apache.commons.mail.MultiPartEmail;
 * 
 * import com.workon.base.Page; import com.workon.utilities.loggers.Log;
 * 
 * public class EmailManager {
 * 
 * public static void sendEmailWithAttachment() {
 * 
 * String userName = Page.prop.getProperty("userName"); String password =
 * Page.prop.getProperty("password"); String smtpHostName =
 * Page.prop.getProperty("smtpHostName"); int smtpPortNumber =
 * Integer.parseInt(Page.prop.getProperty("smtpPortNumber")); String to =
 * Page.prop.getProperty("to"); String from = Page.prop.getProperty("from");
 * String alhadEmail = Page.prop.getProperty("alhadEmail");
 * 
 * 
 * 
 * 
 * EmailAttachment attachment = new EmailAttachment();
 * 
 * String reportPath = Page.rootDir + "\\ZIP\\reports.zip";
 * attachment.setPath(reportPath);
 * attachment.setDisposition(EmailAttachment.ATTACHMENT);
 * 
 * attachment.setName("report.zip");
 * 
 * MultiPartEmail email = new MultiPartEmail();
 * 
 * email.setHostName(smtpHostName); email.setSmtpPort(smtpPortNumber);
 * 
 * email.setAuthenticator(new DefaultAuthenticator(userName, password));
 * 
 * try { email.setFrom(from); } catch (EmailException e) {
 * 
 * e.printStackTrace(); } email.setSubject("Automated Test Report"); try {
 * email.setMsg("Checkout the Generic and Regression Testing report for :-)"
 * +Page.prop.getProperty("BROWSER_NAME") +"  Browser"); } catch (EmailException
 * e) {
 * 
 * e.printStackTrace(); } try { email.addTo(to); email.addTo(alhadEmail); }
 * catch (EmailException e) {
 * 
 * e.printStackTrace(); } // email.addTo(alhadEmail);
 * 
 * try { email.attach(attachment); } catch (EmailException e) {
 * 
 * e.printStackTrace(); }
 * 
 * try { email.send(); } catch (EmailException e) {
 * 
 * e.printStackTrace(); }
 * Log.info("============= REPORT is SEND  ===================");
 * 
 * }
 * 
 * }
 */