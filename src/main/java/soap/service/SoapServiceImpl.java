package soap.service;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class SoapServiceImpl implements SoapService {

	private final URI uri;
	private final Map<String, SoapRequestOperation> operations = new HashMap<>();
	
	public SoapServiceImpl(String s) throws URISyntaxException {
		uri = new URI(s);
	}

	@Override
	public URI getUri() {
		return uri;
	}

	@Override
	public SoapRequestOperation getSoapRequestOperation(String operationName) {
		return operations.get(operationName);
	}

	@Override
	public void addSoapRequestOperation(String operationName, SoapRequestOperation operation) {
		operations.put(operationName, operation);
	}

}
