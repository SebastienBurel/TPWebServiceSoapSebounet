package com.objis.demowebservice.simple;

import javax.xml.ws.Endpoint;

public class HelloObjisPublisher {
	public static final String URI = "http://192.168.57.100:8888/hello";
	
	public static void main(String[] args) {
		
		//Cree une instance de l'implémentation
		HelloObjisWS impl = new HelloObjisWS();
		
		//Rend disponible l'instance
		Endpoint endpoint = Endpoint.publish(URI, impl);
		
		//Teste la disponibilité du endpoint
		boolean status = endpoint.isPublished();
		System.out.println("Web service disponible ? " + status);
	}

}
