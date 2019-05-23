package SetterInjection;

public class Server {

    private Client serverClient;

    private String name ;



    public Server(String name) {
        this.name = name;
    }

    public void setClient(Client serverClient) {
        this.serverClient = serverClient;
    }


    public void showDetail(){
        System.out.println("name : "+ serverClient.getName());
        System.out.println("age : "+serverClient.getAge());
        System.out.println("ip : "+serverClient.getIp());

    }
}
