import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import org.junit.Test;

import soap.service.SoapRequestOperationImpl;

public class SoapRequestOperationImplTest {

	@Test
	public void testSoapRequestOperationImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTemplateBinding() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRequestXml() throws URISyntaxException, UnsupportedEncodingException, IOException {

		String content = getContentFromFile("resources/GetAbrahamLincolnsBirthday.xml");

		SoapRequestOperationImpl operation = new SoapRequestOperationImpl("GetAbrahamLincolnsBirthday", content);		
		operation.getRequestXml();
		
		assertEquals(content, operation.getRequestXml());
	}

	// I think this needs the workspace setting in the runner!
	private String getContentFromFile(String name) throws IOException {
		File file = new File(name);
		assert(file.exists());

		return new String(Files.readAllBytes(file.toPath()));
	}
}
