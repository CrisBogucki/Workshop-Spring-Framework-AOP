package pl.asseco.workshop.calculationModule.Services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import pl.asseco.workshop.calculationModule.Aspects.LoggingObject;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Service
public class FileAdderProvider implements AdderProvider {

    private Logger logger = Logger.getLogger(getClass().getName());

    private Random generator;
    private Integer maxGen;

    public FileAdderProvider() {
        this.generator = new Random();
        this.maxGen  = generator.nextInt(10);
    }

    @Override
    //@LoggingObject
    public ArrayList<Integer> getItems() {

        //System.out.println("Instancja FileAdderProvider-a " + hashCode());

        //TODO: Implement load Integers from file
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i <= this.maxGen; i++){
            list.add(i);
        }

        logger.info("Pobrano dane z pliku tekstowego...");
        return list;
    }
}
