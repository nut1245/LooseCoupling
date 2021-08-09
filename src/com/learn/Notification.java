package com.learn;
import com.learn.notification.channel.Sms;
import com.learn.notification.channel.Email;
import com.learn.notification.channel.interf.Notifiable;

public class Notification {
		public static void main(String[] args) {
			Notification notifiacation = new Notification();
			
			Notifiable smsNotify = new Sms();
			Notifiable emailNotify = new Email();
			
			notifiacation.notifyCustomer(smsNotify);
			notifiacation.notifyCustomer(emailNotify);
		}
		public void notifyCustomer(Notifiable notification) {
			notification.send();
		}
}
