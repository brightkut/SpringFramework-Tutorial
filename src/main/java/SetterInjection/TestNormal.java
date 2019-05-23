package SetterInjection;

public class TestNormal {
    public static void main(String[] args) {
        Server s = new Server("server1");
        Client c = new Client("bob",22,"192.168.1.0");

        s.setClient(c);
        s.showDetail();



    }
}
