package SetterInjection2;

import sun.awt.image.SunVolatileImage;

public class App {
    private Service mainService;

    private Service [] services;

    private String nameApp;

    public App(String nameApp) {
        this.nameApp = nameApp;
    }

    public void getMainService() {
       mainService.showService();
    }

    public void getServices() {
        for (Service s : services){
            s.showService();
        }
    }

    public void setMainService(Service mainService) {
        this.mainService = mainService;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }
}
