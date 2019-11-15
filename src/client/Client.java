package client;

import impl.ServerInterface;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

    ServerInterface MTLobj;

    Client(){

        URL url = null;
        try {
            url = new URL("http://localhost:9877/hw?wsdl");
        } catch (Exception e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://impl/","HelloWorldServerImplService");
        Service service = Service.create(url, qname);
        MTLobj = service.getPort(ServerInterface.class);

    }

    public static void main(String[] args) {

        PatientClient patient=new PatientClient();
        patient.test();

    }


}
