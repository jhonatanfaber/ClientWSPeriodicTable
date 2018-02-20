
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "periodictableHttpPost", targetNamespace = "http://www.webserviceX.NET")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeriodictableHttpPost {


    /**
     * Get element 
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAtoms")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAtoms();

    /**
     * Get atomic wieght by element name 
     * 
     * @param elementName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAtomicWeight")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAtomicWeight(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ElementName")
        String elementName);

    /**
     * Get atomic Number by element name 
     * 
     * @param elementName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAtomicNumber")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getAtomicNumber(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ElementName")
        String elementName);

    /**
     * Get atomic symbol by element name 
     * 
     * @param elementName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetElementSymbol")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getElementSymbol(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ElementName")
        String elementName);

}
