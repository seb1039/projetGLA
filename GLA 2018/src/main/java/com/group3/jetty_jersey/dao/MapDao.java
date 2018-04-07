package com.group3.jetty_jersey.dao;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;



import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;

import com.group3.jetty_jersey.entity.Map;


public class MapDao extends BasicDao{


	public MapDao()
	{
		
	}
	
	
	public String add(Map map) throws Exception 
	{
		TransportClient client=getClient();          
	    String json = "{\"name\":\""+ map.getName()+
	    		"\",\"privacy\":\""+map.isPrivacy()+"\"}";          
	    IndexResponse response = client.prepareIndex("map", "_doc",""+map.getId_map()).setSource(json, XContentType.JSON).get();

	    return response.status().toString();    
	}
	
	public String getByID(Map map) throws Exception {
		TransportClient client=getClient();
		GetResponse response=client.prepareGet("map", "_doc", ""+map.getId_map()).get();
		return response.getSourceAsString();
	}
	
	public String getByID(String id) throws Exception {
		TransportClient client=getClient();
		GetResponse response=client.prepareGet("map", "_doc",id).get();
		return response.getSourceAsString();
	}
	
	public String delete(Map map) throws Exception {
		TransportClient client=getClient();
		DeleteResponse response=client.prepareDelete("map","_doc", ""+map.getId_map()).get();
		return response.status().toString();
	}
	
	public String delete(String id) throws Exception {
		TransportClient client=getClient();
		DeleteResponse response=client.prepareDelete("map","_doc",id).get();
		return response.status().toString();
	}

	public String getAll(int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	


	public void update(String id, String attribut, String valeur) throws Exception {
		TransportClient client=getClient();
		UpdateRequest updateRequest = new UpdateRequest("map","_doc", id)
		        .doc(jsonBuilder()
		            .startObject()
		                .field(attribut, valeur)
		            .endObject());
		client.update(updateRequest).get();				
	
	}

	public String searchByPages(QueryBuilder queryBuilder, int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}