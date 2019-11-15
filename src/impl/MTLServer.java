package impl;

import javax.jws.WebService;


@WebService(endpointInterface = "impl.ServerInterface")
public class MTLServer implements ServerInterface {

    public String sayHello(String name) {
        return "Hello " + name + " !, Hope you are doing well !!";
    }

}