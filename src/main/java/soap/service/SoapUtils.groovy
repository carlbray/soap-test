package soap.service

import javax.xml.ws.BindingProvider
import javax.xml.ws.handler.MessageContext

class SoapUtils {

    public static void setHttpHeaders(BindingProvider bindingProvider) {
        Map<String, Object> req_ctx = bindingProvider.getRequestContext()

        Map<String, List<String>> headers = new HashMap<String, List<String>>()
        headers.put("Username", Collections.singletonList("mkyong"))
        headers.put("Password", Collections.singletonList("password"))
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers)
    }
}
