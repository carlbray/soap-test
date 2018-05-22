package soap.service;

import java.net.URI;

public interface SoapHost {
	
	public URI getHostURI();
	
	public SoapService getSoapService(String serviceName);
	
	public void addSoapService(String serviceName, SoapService service);
}
