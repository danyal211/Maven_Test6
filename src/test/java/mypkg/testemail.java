package mypkg;

import org.apache.commons.mail.*;
import org.testng.annotations.AfterSuite;


public class testemail {

    @AfterSuite
    public void sendemail() throws Exception {

        System.out.println("Email started sending");

/*        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);

        email.setAuthenticator(new DefaultAuthenticator("danyal.ashraf@gmail.com", "401113401113"));
        email.setSSLOnConnect(true);
        email.setFrom("danyal.ashraf@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("mdanyalashraf@gmail.com");
        email.send();
        System.out.println("Email is sent");

 */

        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("E:\\Selenium\\Maven_Test1\\test_output_pdf\\Test_Suite\\TestExecutionReport.pdf");
     //   attachment.setPath(("user.dir") + "\\test_output_pdf\\Test_Suite\\TestExecutionReport.pdf");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
//        attachment.setDescription("Test Report");
//        attachment.setName("Dani.pdf");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
      //  email.setHostName("mail.myserver.com");

        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);

        email.setAuthenticator(new DefaultAuthenticator("danyal.ashraf@gmail.com", "401113401113"));
        email.setSSLOnConnect(true);

        email.addTo("mdanyalashraf@gmail.com", "Muhammad Danyal Ashraf");
        email.setFrom("danyal.ashraf@gmail.com", "Dani");
        email.setSubject("Test Attachment Email");
        email.setMsg("Please see the attachment.");

        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();

        System.out.println("Email is sent");


    }
}
