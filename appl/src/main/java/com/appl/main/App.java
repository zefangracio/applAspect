package com.appl.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
 
import com.appl.model.AlatMusik;
import com.appl.configuration.MongoConfig;
import com.appl.services.AlatMusikService;
 
public class App {
 
    public static void main(String args[]) {
 
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class);
        AlatMusikService alatMusikService = (AlatMusikService) context.getBean("alatMusikService");
        // Delete All cars
        alatMusikService.deleteAll();
 
        AlatMusik serune = new AlatMusik("Serune Kale", "NAD", "Aerofon", "Ditiup");
        alatMusikService.create(serune);
        
        AlatMusik aramba = new AlatMusik("Aramba", "Sumatera Utara", "Ideofon", "Dipukul");
        alatMusikService.create(aramba);
        
        AlatMusik saluang = new AlatMusik("Saluang", "Sumatera Barat", "Aerofon", "Ditiup");
        alatMusikService.create(saluang);
        
        AlatMusik gambus = new AlatMusik("Gambus", "Riau", "Kordofon", "Dipetik");
        alatMusikService.create(gambus);
        
        AlatMusik serangko = new AlatMusik("Serangko", "Jambi", "Aerofon", "Ditiup");
        alatMusikService.create(serangko);
        
        AlatMusik doll = new AlatMusik("Doll", "Bengkulu", "Membranofon", "Dipukul");
        alatMusikService.create(doll);
 
        System.out.println("\nFind All!!");
 
        List < AlatMusik > alat = alatMusikService.findAll();
        for (AlatMusik a: alat) {
            System.out.println(a);
        }
        System.out.println();
//        carService.delete(swift);
// 
//        System.out.println();
//        i10.setModel("i10 Nxt");
//        carService.update(i10);
// 
//        System.out.println("\nFind By Brand = 'Volkswagen'");
//        cars = carService.findByBrand("Volkswagen");
//        for (Car car: cars) {
//            System.out.println(car);
//        }
// 
//        System.out.println("\nFind By Model = 'Ertiga'");
//        System.out.println(carService.findByModel("Ertiga"));
// 
//        System.out.println("\nFind All!!");
// 
//        cars = carService.findAll();
//        for (Car car: cars) {
//            System.out.println(car);
//        }
 
        context.close();
    }
 
}
