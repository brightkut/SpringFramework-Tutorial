package SetterInjection2;

public class Database implements Service {

    private String nameDB;

    public Database(String nameDB) {
        this.nameDB = nameDB;
    }

    public void showService() {
        System.out.println(nameDB);

    }
}
