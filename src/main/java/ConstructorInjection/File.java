package ConstructorInjection;

public class File implements Manage {

    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void read() {
        System.out.println("read filename : "+filename);

    }

    public void write() {
        System.out.println("write file : "+filename);

    }


}
