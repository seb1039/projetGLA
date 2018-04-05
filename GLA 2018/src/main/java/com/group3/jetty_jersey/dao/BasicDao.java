package com.group3.jetty_jersey.dao;

import java.net.InetSocketAddress;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.network.InetAddresses;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public abstract class BasicDao {
	public static String index; 
	private static String serverAddr1;
	static{
		try {
			Properties glProperties=new Properties();
			glProperties.load(BasicDao.class.getResourceAsStream("elastic.properties"));
			serverAddr1=glProperties.getProperty("addr1");
			index=glProperties.getProperty("index");
			if (index==null||index.length()==0) {
				index="default";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@SuppressWarnings({ "resource" })
	public TransportClient getClient() throws Exception{
		
			TransportClient client=null;
	
			if (serverAddr1==null) {serverAddr1="localhost";}
			Settings settings = Settings.builder().put("cluster.name", "elasticsearch").build();
			System.out.println("blabla");
		    client = new PreBuiltTransportClient(settings);
			client.addTransportAddress(new TransportAddress(new InetSocketAddress(InetAddresses.forString("127.0.0.1"), 9300)));
		    System.out.println("blabla5");

		
		return client;
	}
	
	private static void registerException(Exception e){
		Logger.getLogger(BasicDao.class.getName()).log(Level.SEVERE, null, e);
	}
}
