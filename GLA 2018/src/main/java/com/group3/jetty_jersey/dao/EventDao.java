package com.group3.jetty_jersey.dao;
import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;

import com.group3.jetty_jersey.entity.Event;

public class EventDao extends BasicDao{
	
	public String add(Event event) throws Exception 
	{
		TransportClient client=getClient();          
	    String json = "{\"name\":\""+ event.getName()+"\",\"coordonate_x\":\""+event.getCoordonate_x()+
	    		"\",\"coordonate_y\":\""+event.getCoordonate_y()+"\",\"place\":\""+event.getPlace()+
	    		"\",\"startingDate\":\""+event.getStartingDate()+"\",\"endingDate\":\""+event.getEndingDate()+
	    		"\",\"picture\":\""+event.getPicture()+"\"}";          
	    IndexResponse response = client.prepareIndex("event", "_doc",""+event.getId_event()).setSource(json, XContentType.JSON).get();

	    return response.status().toString();    
	}
	
	public String getByID(Event event) throws Exception {
		TransportClient client=getClient();
		GetResponse response=client.prepareGet("event", "_doc", ""+event.getId_event()).get();
		return response.getSourceAsString();
	}
	
	public String getByID(String id) throws Exception {
		TransportClient client=getClient();
		GetResponse response=client.prepareGet("event", "_doc",id).get();
		return response.getSourceAsString();
	}
	
	public String delete(Event event) throws Exception {
		TransportClient client=getClient();
		DeleteResponse response=client.prepareDelete("event","_doc", ""+event.getId_event()).get();
		return response.status().toString();
	}
	
	public String delete(String id) throws Exception {
		TransportClient client=getClient();
		DeleteResponse response=client.prepareDelete("event","_doc",id).get();
		return response.status().toString();
	}

	public String getAll(int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(String id, String attribut, String valeur) throws Exception {
		TransportClient client=getClient();
		UpdateRequest updateRequest = new UpdateRequest("event","_doc", id)
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