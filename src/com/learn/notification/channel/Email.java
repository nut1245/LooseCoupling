package com.learn.notification.channel;
import com.learn.notification.channel.interf.Notifiable;

public class Email implements Notifiable{
	@Override
	public void send() {
		System.out.println("SEND EMAIL TO CUSTOMER");
		
	}
}