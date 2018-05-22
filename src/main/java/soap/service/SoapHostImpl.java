package soap.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class SoapHostImpl implements SoapHost {

	private final URI uri;
	private final Map<String, SoapService> soapServices = new HashMap<>();
	
	public SoapHostImpl(String s) throws URISyntaxException {
		uri = new URI(s);
	}

	@Override
	public URI getHostURI() {
		return uri;
	}

	@Override
	public SoapService getSoapService(String serviceName) {
		return soapServices.get(serviceName);
	}

	@Override
	public void addSoapService(String serviceName, SoapService service) {
		soapServices.put(serviceName, service);
	}
}
