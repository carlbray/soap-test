package soap.service;

public interface SoapRequestOperation {
	
	void setTemplateBinding(String key, Object replacement);

	String getRequestXml();
}
