package ConstructorInjection;

import java.util.ArrayList;

public class Server implements Manage{

    private ArrayList<Client> listClient;
    private String nameServer;


    public Server(String nameServer,Client c) {
        listClient = new ArrayList<Client>();
        this.nameServer = nameServer;
        listClient.add(c);
    }


    public void read() {

        System.out.println("read server : "+nameServer);
    }

    public void write() {
        System.out.println("write server : "+nameServer);

        showAllCleint();
    }

    public void addClient(Client c){
        listClient.add(c);

    }

    private void showAllCleint(){

        for (Client l : listClient){
            System.out.println(l.getName());
        }
    }
}
