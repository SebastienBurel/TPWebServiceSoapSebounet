
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloObjisWSService", targetNamespace = "http://simple.demowebservice.objis.com/", wsdlLocation = "http://localhost:8888/hello?wsdl")
public class HelloObjisWSService
    extends Service
{

    private final static URL HELLOOBJISWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOOBJISWSSERVICE_EXCEPTION;
    private final static QName HELLOOBJISWSSERVICE_QNAME = new QName("http://simple.demowebservice.objis.com/", "HelloObjisWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOOBJISWSSERVICE_WSDL_LOCATION = url;
        HELLOOBJISWSSERVICE_EXCEPTION = e;
    }

    public HelloObjisWSService() {
        super(__getWsdlLocation(), HELLOOBJISWSSERVICE_QNAME);
    }

    public HelloObjisWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOOBJISWSSERVICE_QNAME, features);
    }

    public HelloObjisWSService(URL wsdlLocation) {
        super(wsdlLocation, HELLOOBJISWSSERVICE_QNAME);
    }

    public HelloObjisWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOOBJISWSSERVICE_QNAME, features);
    }

    public HelloObjisWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloObjisWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloObjis
     */
    @WebEndpoint(name = "HelloObjisWSPort")
    public HelloObjis getHelloObjisWSPort() {
        return super.getPort(new QName("http://simple.demowebservice.objis.com/", "HelloObjisWSPort"), HelloObjis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloObjis
     */
    @WebEndpoint(name = "HelloObjisWSPort")
    public HelloObjis getHelloObjisWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://simple.demowebservice.objis.com/", "HelloObjisWSPort"), HelloObjis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOOBJISWSSERVICE_EXCEPTION!= null) {
            throw HELLOOBJISWSSERVICE_EXCEPTION;
        }
        return HELLOOBJISWSSERVICE_WSDL_LOCATION;
    }

}
