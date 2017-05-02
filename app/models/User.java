package models;


import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
/**
 * User entity managed by Ebean
 */
@Entity
public class User extends Model{

	@Constraints.Required
	public String name;
	@Constraints.Required
	public String email;
	@Constraints.Required
	public String password;
	@Id
    public Long id;
	
	public User(Long id, String name, String email, String password){
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
