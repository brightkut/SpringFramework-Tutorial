package SetterInjection2;

public class TestNormal {
    public static void main(String[] args) {
        Service [] services = new Service[3];
        services[0] = new Database("mongo");
        services[1] = new Database("mysql");
        services[2] = new Log("logger");

        Service s = new Database("Br");

        App a = new App("apple");
        a.setMainService(s);
        a.setServices(services);
        a.getMainService();
        System.out.println("----------------");
        a.getServices();






    }
}
