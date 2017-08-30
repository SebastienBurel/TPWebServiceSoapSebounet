package com.objis.demowebservice.simple;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloObjis {
	@WebResult (partName="reponse")
	String ditBonjour(@WebParam (partName="toto")String name);
}
