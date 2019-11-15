package impl;

import javax.jws.WebService;


@WebService(endpointInterface = "impl.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {

    public String sayHello(String name) {
        return "Hello " + name + " !, Hope you are doing well !!";
    }

}