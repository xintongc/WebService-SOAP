package client;

import impl.HelloWorldServer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ClientChild extends HelloWorldClient {


    public static void main(String[] args) {

//        ClientChild clientChild = new ClientChild();
////        clientChild.test();
    }

    public void test(){
        System.out.println(helloWorldobj.sayHello("test"));

    }

}
