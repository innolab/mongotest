/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innolabmm.software.mongotest;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
 
/**
 *
 * @author User
 */
public class App {
    public static void main (String [] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
	MongoTemplate mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");
 
	User user = new User("sandah", "password123");
 	
        if (!mongoTemplate.collectionExists(User.class)) {
            mongoTemplate.createCollection(User.class);
        }       
        mongoTemplate.insert(user, "users");
        
         System.out.println("users: " +mongoTemplate.findAll(User.class, "users"));
    }
}
