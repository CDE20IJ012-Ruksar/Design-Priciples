package main;

import com.cts.mediator.impl.BasicUser;
import com.cts.mediator.impl.ChatMediator;
import com.cts.mediator.impl.PremiumUser;
import com.cts.mediator.interfaces.IUser;

public class Client {
public static void main(String args[]) {
		// TODO Auto-generated method stub
		ChatMediator chatMediator=new ChatMediator();
		IUser user =new BasicUser(chatMediator,"Rey");
		chatMediator.AddUser(new PremiumUser(chatMediator,"Roy"));
		chatMediator.AddUser(new BasicUser(chatMediator,"Joe"));
		user.SendMessage("Welcome User");

	}

}
