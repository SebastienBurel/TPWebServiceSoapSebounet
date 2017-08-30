package com.objis.demowebservice.simple;

import javax.jws.WebService;

@WebService(endpointInterface = "com.objis.demowebservice.simple.HelloObjis")
public class HelloObjisWS implements HelloObjis {

	@Override
	public String ditBonjour(String nom) {
		return "Hello, " + nom + "!";
	}

}
