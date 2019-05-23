package SetterInjection;

public class Client {
    private String name;
    private int age ;
    private String ip;

    public Client(String name, int age, String ip) {
        this.name = name;
        this.age = age;
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIp() {
        return ip;
    }
}
