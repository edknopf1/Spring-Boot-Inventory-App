package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
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
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0) {
            InhousePart engine = new InhousePart();
            engine.setName("Engine");
            engine.setInv(20);
            engine.setPrice(300.0);
            engine.setId(1);
            engine.setMinInv(5);
            engine.setMaxInv(25);
            inhousePartRepository.save(engine);

            InhousePart radiator = new InhousePart();
            radiator.setName("Radiator");
            radiator.setInv(30);
            radiator.setPrice(100.0);
            radiator.setId(2);
            radiator.setMinInv(5);
            radiator.setMaxInv(40);
            inhousePartRepository.save(radiator);


            OutsourcedPart exhaust = new OutsourcedPart();
            exhaust.setName("Exhaust");
            exhaust.setCompanyName("Larry's Parts");
            exhaust.setInv(45);
            exhaust.setPrice(200.0);
            exhaust.setId(3);
            exhaust.setMinInv(5);
            exhaust.setMaxInv(50);
            outsourcedPartRepository.save(exhaust);

            OutsourcedPart belts = new OutsourcedPart();
            belts.setName("Belts");
            belts.setCompanyName("Larry's Parts");
            belts.setInv(50);
            belts.setPrice(50.0);
            belts.setId(4);
            belts.setMinInv(5);
            belts.setMaxInv(60);
            outsourcedPartRepository.save(belts);

            OutsourcedPart tires = new OutsourcedPart();
            tires.setName("Tires");
            tires.setCompanyName("Larry's Parts");
            tires.setInv(100);
            tires.setPrice(400.0);
            tires.setId(5);
            tires.setMinInv(5);
            tires.setMaxInv(200);
            outsourcedPartRepository.save(tires);
        }

        /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if(productRepository.count() == 0) {
            Product suv = new Product("SUV", 30000.0, 20);
            productRepository.save(suv);
            Product truck = new Product("Truck", 40000.0, 30);
            productRepository.save(truck);
            Product sedan = new Product("Sedan", 20000.0, 50);
            productRepository.save(sedan);
            Product coupe = new Product("Coupe", 25000.0, 15);
            productRepository.save(coupe);
            Product luxury = new Product("Luxury", 50000.0, 5);
            productRepository.save(luxury);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());





    }
}
