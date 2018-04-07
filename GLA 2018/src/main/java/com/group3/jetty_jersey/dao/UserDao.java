package com.group3.jetty_jersey.dao;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;

import com.group3.jetty_jersey.entity.User;



public class UserDao extends BasicDao {
	
	
	
	public UserDao () {
		
	}
	
	
	public String add(User user) throws Exception 
	{
		TransportClient client=getClient();          
	    String json = "{\"user_name\":\""+ user.getUser_name()+"\",\"password\":\""+user.getPassword()+
	    		"\",\"birthDate\":\""+user.getBirthDate()+"\",\"email\":\""+user.getEmail()+
	    		"\",\"lastName\":\""+user.getLastName()+"\",\"firstName\":\""+user.getFirstName()+
	    		"\",\"gender\":\""+user.getGender()+"\"}";          
	    IndexResponse response = client.prepareIndex("user", "_doc","1").setSource(json, XContentType.JSON).get();

	    return response.status().toString();    
	}

	public String getAll(int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String delete(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public void update(String id, String attribut, String valeur) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String searchByPages(QueryBuilder queryBuilder, int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String getByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return "test";
	}

}
