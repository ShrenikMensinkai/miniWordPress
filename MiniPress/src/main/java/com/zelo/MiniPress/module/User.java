/**
 * 
 */
package com.zelo.MiniPress.module;

import java.util.Date;

/**
 * @author shren
 *
 */
public class User 
{
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private Date created = new Date();

	public User()
	{
		
	}
	public User(String Username,String Password, String Firstname,String Lastname)
	{
		id=1;
		username=Username;
		password=Password;
		firstname = Firstname;
		lastname = Lastname;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreated() {
		return created;
	}
	
}
