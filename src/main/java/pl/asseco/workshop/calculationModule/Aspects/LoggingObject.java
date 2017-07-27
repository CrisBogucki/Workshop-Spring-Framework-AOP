package pl.asseco.workshop.calculationModule.Aspects;

import java.lang.annotation.*;

/**
 * Created by krzysztof.bogucki on 27 lip 2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface LoggingObject {
}
