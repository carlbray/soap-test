import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

import soap.service.SoapHostImpl;
import soap.service.SoapService;
import soap.service.SoapServiceImpl;

public class SoapHostImplTest {

	@Test
	public void testGetHostURI() throws URISyntaxException {
		SoapHostImpl host = new SoapHostImpl("http://www.holidaywebservice.com/");
		assertEquals(new URI("http://www.holidaywebservice.com/"), host.getHostURI());
	}
	
	@Test
	public void testGetSoapService() throws URISyntaxException {
		
		String serviceName = "Holidays/US/Dates/USHolidayDates";
		
		SoapService soapService = new SoapServiceImpl(serviceName);
		SoapHostImpl host = new SoapHostImpl("http://www.holidaywebservice.com/");
		host.addSoapService(serviceName, soapService);
		
		assertEquals(soapService, host.getSoapService(serviceName));
	}
}
