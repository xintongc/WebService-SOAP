import impl.HelloWorldServerImpl;

import javax.xml.ws.Endpoint;

public class ServerPublisher {

    public static void main(String[] args) {

        System.out.println("Beginning to publish HelloWorldService now");
        Endpoint.publish("http://127.0.0.1:9877/hw", new HelloWorldServerImpl());
        System.out.println("Done publishing");
        
        //http://127.0.0.1:9877/hw?wsdl
    }

}
