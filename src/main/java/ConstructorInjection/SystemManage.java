package ConstructorInjection;

public class SystemManage {
    private Manage manage;


    // injection
    public SystemManage(Manage manage) {
        this.manage = manage;
    }


    public void showDetail(){
        manage.read() ;
        manage.write();
    }


}
