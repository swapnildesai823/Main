package com.smsone.model;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import com.sun.mail.pop3.POP3Store;

public class FetchMail{

 public static void receiveEmail(String pop3Host, String storeType, String user, String password) {
  try {
   Properties properties = new Properties();
   properties.put("mail.pop3.host", pop3Host);
   Session emailSession = Session.getDefaultInstance(properties);

   POP3Store emailStore = (POP3Store) emailSession.getStore(storeType);
   emailStore.connect(user, password);

   Folder emailFolder = emailStore.getFolder("INBOX");
   emailFolder.open(Folder.READ_ONLY);

   Message[] messages = emailFolder.getMessages();
   for (int i = 0; i < messages.length; i++) {
	Message message = messages[i];
	System.out.println("---------------------------------");
	System.out.println("Email Number " + (i + 1));
	System.out.println("Subject: " + message.getSubject());
	System.out.println("From: " + message.getFrom()[0]);
	System.out.println("Text: " + message.getContent().toString());
   }

   emailFolder.close(false);
   emailStore.close();

  } catch (NoSuchProviderException e) {e.printStackTrace();} 
  catch (MessagingException e) {e.printStackTrace();}
  catch (IOException e) {e.printStackTrace();}
 }

 public static void main(String[] args) {

  String host = "pop.gmail.com";//change accordingly
  String mailStoreType = "pop3";
  String username= "randivemayuri123@gmail.com";
  String password= "mayuri@6894";//change accordingly

  receiveEmail(host, mailStoreType, username, password);

 }
}
