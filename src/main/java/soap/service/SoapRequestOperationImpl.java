package soap.service;

import java.util.HashMap;
import java.util.Map;

public class SoapRequestOperationImpl implements SoapRequestOperation {

	private String operationName;
	private String content;
	private final Map<String, String> replacements = new HashMap<>();

	public SoapRequestOperationImpl(String operationName, String content) {
		this.operationName = operationName;
		this.content = content;
	}

	@Override
	public void setTemplateBinding(String key, Object replacement) {
		replacements.put(key, replacement.toString());
	}

	@Override
	public String getRequestXml() {
		return content;
	}
}
