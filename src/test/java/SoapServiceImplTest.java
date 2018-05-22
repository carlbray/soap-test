import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

import soap.service.SoapRequestOperationImpl;
import soap.service.SoapService;
import soap.service.SoapServiceImpl;

public class SoapServiceImplTest {

	@Test
	public void testGetUri() throws URISyntaxException {
		
		String serviceName = "Holidays/US/Dates/USHolidayDates";
		SoapService soapService = new SoapServiceImpl(serviceName);		
		
		assertEquals(new URI(serviceName), soapService.getUri());
	}
	
	@Test
	public void testGetSoapRequestOperation() throws URISyntaxException {
		
		String operationName = "GetAbrahamLincolnsBirthday";
		SoapRequestOperationImpl operation = new SoapRequestOperationImpl(operationName, "");
		
		SoapService soapService = new SoapServiceImpl("Holidays/US/Dates/USHolidayDates");
		soapService.addSoapRequestOperation(operationName, operation);
		
		assertEquals(operation, soapService.getSoapRequestOperation(operationName));
	}
}
