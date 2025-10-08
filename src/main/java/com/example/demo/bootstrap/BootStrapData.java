package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long partCount = partRepository.count();
        long productCount = productRepository.count();

        if (partCount != 0);
        {


        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Diamond Car Dealer");
        o.setName("Engine");
        o.setInv(5);
        o.setPrice(200.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Engine"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        o = new OutsourcedPart();
        o.setCompanyName("Diamond Car Dealer");
        o.setName("Radiator");
        o.setInv(5);
        o.setPrice(100.0);
        o.setId(200L);
        outsourcedPartRepository.save(o);
        thePart = null;
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Engine"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        o = new OutsourcedPart();
        o.setCompanyName("Diamond Car Dealer");
        o.setName("Exhaust");
        o.setInv(5);
        o.setPrice(150.0);
        o.setId(300L);
        outsourcedPartRepository.save(o);
        thePart = null;
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Engine"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        o = new OutsourcedPart();
        o.setCompanyName("Diamond Car Dealer");
        o.setName("Belts");
        o.setInv(20);
        o.setPrice(50.0);
        o.setId(400L);
        outsourcedPartRepository.save(o);
        thePart = null;
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Engine"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        o = new OutsourcedPart();
        o.setCompanyName("Diamond Car Dealer");
        o.setName("Tires");
        o.setInv(100);
        o.setPrice(300.0);
        o.setId(500L);
        outsourcedPartRepository.save(o);
        thePart = null;
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Engine"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());



        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        }

        if (productCount != 0);
        {

        Product SUV= new Product("SUV",40000.0,15);
        Product Truck= new Product("Truck",55000.0,15);
        Product Sedan= new Product("Sedan",20000.0,15);
        Product Coupe= new Product("Coupe",25000.0,15);
        Product Luxury= new Product("Luxury",60000.0,15);
        productRepository.save(SUV);
        productRepository.save(Truck);
        productRepository.save(Sedan);
        productRepository.save(Coupe);
        productRepository.save(Luxury);

        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
