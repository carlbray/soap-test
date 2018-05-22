package soap.service.holidaywebservice.us_holiday_dates;

import java.net.URI;
import java.net.URISyntaxException;

import soap.service.SoapRequestOperation;
import soap.service.SoapService;

public class UsHolidayDatesService implements SoapService {
	
	final URI uri;

	public UsHolidayDatesService(String s) throws URISyntaxException {
		uri = new URI(s);
	}

	@Override
	public URI getUri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoapRequestOperation getSoapRequestOperation(String operationName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSoapRequestOperation(String operationName, SoapRequestOperation operation) {
		// TODO Auto-generated method stub
		
	}

}
