package be.relin.dev.KeepThing.models.user;

import java.util.List;

public interface UserInterface{
	
	List <User> getUsers();
	
	User getUser(Integer id);

}
