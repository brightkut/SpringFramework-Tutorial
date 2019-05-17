package ConstructorInjection;

public class Database implements Manage {
    private String db;

    public Database(String db) {
        this.db = db;

    }

    public void read() {
        System.out.println("read database : " +db );



    }

    public void write() {
        System.out.println("write database : "+db);


    }

}
