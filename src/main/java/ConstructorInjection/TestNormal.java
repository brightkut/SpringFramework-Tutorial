package ConstructorInjection;

public class TestNormal {

    public static void main(String[] args) {

        // this code is injection without use beans
        SystemManage systemManage = new SystemManage(new Database("jdbc"));
        systemManage.showDetail();
        SystemManage systemManage1 = new SystemManage(new File("bright"));
        systemManage1.showDetail();

        Client c = new Client("Tang");
        Client c2 = new Client("Ponce");

        Server server = new Server("Server1",c);

        SystemManage systemManage2 = new SystemManage(server);
        systemManage2.showDetail();
        server.addClient(c2);
        systemManage2.showDetail();





    }
}
