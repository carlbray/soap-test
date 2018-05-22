package soap.service;

import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.message.WSSecHeader;
import org.apache.wss4j.dom.message.WSSecUsernameToken;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Set;

public class WSSecurityHeaderSOAPHandler implements SOAPHandler<SOAPMessageContext> {


//    private final String usernameText;
//    private final String passwordText;
//
//    public WSSecurityHeaderSOAPHandler(String usernameText, String passwordText) {
//        this.usernameText = usernameText;
//        this.passwordText = passwordText;
//    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        System.out.println("WSSecurityHeaderSOAPHandler : handleMessage()......");

        if (outboundProperty.booleanValue()) {

            try {
                SOAPMessage soapMessage = context.getMessage();
                soapMessage.removeAllAttachments();

                SOAPPart soappart = soapMessage.getSOAPPart();
                WSSecHeader wsSecHeader = new WSSecHeader(soappart);
                wsSecHeader.insertSecurityHeader();
                wsSecHeader.setMustUnderstand(false);
                WSSecUsernameToken token = new WSSecUsernameToken(wsSecHeader);
                token.setPasswordType(WSConstants.PASSWORD_DIGEST);
                token.setUserInfo("userName", "password");
                token.build();

                soapMessage.saveChanges();
            } catch (Exception e) {
                throw new RuntimeException("Error on wsSecurityHandler: " + e.getMessage());
            }

        }

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }
}