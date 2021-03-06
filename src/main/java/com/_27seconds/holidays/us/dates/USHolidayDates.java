package com._27seconds.holidays.us.dates;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Web service that calculates specific national holidays for the US.
 *
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-28T13:56:07.738+12:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "USHolidayDates",
                  wsdlLocation = "http://www.holidaywebservice.com/Holidays/US/Dates/USHolidayDates.asmx?WSDL",
                  targetNamespace = "http://www.27seconds.com/Holidays/US/Dates/")
@HandlerChain(file="handler-chain.xml")
public class USHolidayDates extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.27seconds.com/Holidays/US/Dates/", "USHolidayDates");
    public final static QName USHolidayDatesSoap12 = new QName("http://www.27seconds.com/Holidays/US/Dates/", "USHolidayDatesSoap12");
    public final static QName USHolidayDatesSoap = new QName("http://www.27seconds.com/Holidays/US/Dates/", "USHolidayDatesSoap");
    public final static QName USHolidayDatesHttpGet = new QName("http://www.27seconds.com/Holidays/US/Dates/", "USHolidayDatesHttpGet");
    public final static QName USHolidayDatesHttpPost = new QName("http://www.27seconds.com/Holidays/US/Dates/", "USHolidayDatesHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://www.holidaywebservice.com/Holidays/US/Dates/USHolidayDates.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(USHolidayDates.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:USHolidayDates.xml");
        }
        WSDL_LOCATION = url;
    }

    public USHolidayDates(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public USHolidayDates(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public USHolidayDates() {
        super(WSDL_LOCATION, SERVICE);
    }

    public USHolidayDates(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public USHolidayDates(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public USHolidayDates(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns USHolidayDatesSoap
     */
    @WebEndpoint(name = "USHolidayDatesSoap12")
    public USHolidayDatesSoap getUSHolidayDatesSoap12() {
        return super.getPort(USHolidayDatesSoap12, USHolidayDatesSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USHolidayDatesSoap
     */
    @WebEndpoint(name = "USHolidayDatesSoap12")
    public USHolidayDatesSoap getUSHolidayDatesSoap12(WebServiceFeature... features) {
        return super.getPort(USHolidayDatesSoap12, USHolidayDatesSoap.class, features);
    }


    /**
     *
     * @return
     *     returns USHolidayDatesSoap
     */
    @WebEndpoint(name = "USHolidayDatesSoap")
    public USHolidayDatesSoap getUSHolidayDatesSoap() {
        return super.getPort(USHolidayDatesSoap, USHolidayDatesSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USHolidayDatesSoap
     */
    @WebEndpoint(name = "USHolidayDatesSoap")
    public USHolidayDatesSoap getUSHolidayDatesSoap(WebServiceFeature... features) {
        return super.getPort(USHolidayDatesSoap, USHolidayDatesSoap.class, features);
    }


    /**
     *
     * @return
     *     returns USHolidayDatesHttpGet
     */
    @WebEndpoint(name = "USHolidayDatesHttpGet")
    public USHolidayDatesHttpGet getUSHolidayDatesHttpGet() {
        return super.getPort(USHolidayDatesHttpGet, USHolidayDatesHttpGet.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USHolidayDatesHttpGet
     */
    @WebEndpoint(name = "USHolidayDatesHttpGet")
    public USHolidayDatesHttpGet getUSHolidayDatesHttpGet(WebServiceFeature... features) {
        return super.getPort(USHolidayDatesHttpGet, USHolidayDatesHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns USHolidayDatesHttpPost
     */
    @WebEndpoint(name = "USHolidayDatesHttpPost")
    public USHolidayDatesHttpPost getUSHolidayDatesHttpPost() {
        return super.getPort(USHolidayDatesHttpPost, USHolidayDatesHttpPost.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USHolidayDatesHttpPost
     */
    @WebEndpoint(name = "USHolidayDatesHttpPost")
    public USHolidayDatesHttpPost getUSHolidayDatesHttpPost(WebServiceFeature... features) {
        return super.getPort(USHolidayDatesHttpPost, USHolidayDatesHttpPost.class, features);
    }

}
