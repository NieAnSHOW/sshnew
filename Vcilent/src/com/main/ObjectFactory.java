
package com.main;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.main package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNameV_QNAME = new QName("http://controller.ssh.xrom.com/", "getNameV");
    private final static QName _GetNameVResponse_QNAME = new QName("http://controller.ssh.xrom.com/", "getNameVResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.main
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNameVResponse }
     * 
     */
    public GetNameVResponse createGetNameVResponse() {
        return new GetNameVResponse();
    }

    /**
     * Create an instance of {@link GetNameV }
     * 
     */
    public GetNameV createGetNameV() {
        return new GetNameV();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.ssh.xrom.com/", name = "getNameV")
    public JAXBElement<GetNameV> createGetNameV(GetNameV value) {
        return new JAXBElement<GetNameV>(_GetNameV_QNAME, GetNameV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.ssh.xrom.com/", name = "getNameVResponse")
    public JAXBElement<GetNameVResponse> createGetNameVResponse(GetNameVResponse value) {
        return new JAXBElement<GetNameVResponse>(_GetNameVResponse_QNAME, GetNameVResponse.class, null, value);
    }

}
