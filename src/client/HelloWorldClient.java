package client;

import impl.HelloWorldServer;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

    HelloWorldServer helloWorldobj;

    HelloWorldClient(){

        URL url = null;
        try {

            url = new URL("http://localhost:9877/hw?wsdl");

        } catch (Exception e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://impl/","HelloWorldServerImplService");
        Service service = Service.create(url, qname);
        helloWorldobj = service.getPort(HelloWorldServer.class);

    }

    public static void main(String[] args) {

        ClientChild clientChild = new ClientChild();
        clientChild.test();

    }


}
