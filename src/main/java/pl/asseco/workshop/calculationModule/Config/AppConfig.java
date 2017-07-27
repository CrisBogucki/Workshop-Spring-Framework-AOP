package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.*;
import pl.asseco.workshop.calculationModule.Aspects.LoggingAspect;
import pl.asseco.workshop.calculationModule.Services.AdderProvider;
import pl.asseco.workshop.calculationModule.Services.AdderService;
import pl.asseco.workshop.calculationModule.Services.FileAdderProvider;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"pl.asseco.workshop.calculationModule"})
public class AppConfig {


}
