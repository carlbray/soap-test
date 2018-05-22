package soap.service;

import java.net.URI;

public interface SoapService {
	URI getUri();
	
	SoapRequestOperation getSoapRequestOperation(String operationName);
	
	void addSoapRequestOperation(String operationName, SoapRequestOperation operation);
}
