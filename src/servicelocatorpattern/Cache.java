package servicelocatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services){
            if (serviceName.equalsIgnoreCase(service.getName())){
                System.out.println("Returning cached " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;

        for (Service service : services){
            if (newService.getName().equalsIgnoreCase(service.getName())){
                exists = true;
            }
        }

        if(!exists){
            services.add(newService);
        }

    }


}
