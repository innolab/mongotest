/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innolabmm.software.mongotest;

/**
 *
 * @author User
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document(collection = "users")
public class User {
 
	@Id
	private String id;
 
	String username;
 
	String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
	
 
}