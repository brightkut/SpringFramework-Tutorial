package SetterInjection2;

public class Log implements Service {

    private String nameLog;

    public Log(String nameLog) {
        this.nameLog = nameLog;
    }

    public void showService() {
        System.out.println("Log");
    }
}
