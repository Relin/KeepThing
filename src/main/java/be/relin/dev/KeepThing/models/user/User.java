package be.relin.dev.KeepThing.models.user;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

public class User implements UserInterface{
	
	@GeneratedValue
	@Id
	protected Integer id;
	
	protected String name;
	
	protected String surname;
	
	protected String login;
	
	protected String password;
	
	protected String mail;
	
	protected String lang;
	
	@CreatedDate
	protected Date createAt;
	
	protected Date updateAt;
	
	protected Date deleteAt;
	
	protected Date lastLoginAt;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
