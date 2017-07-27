package pl.asseco.workshop.calculationModule;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.asseco.workshop.calculationModule.Config.AppConfig;
import pl.asseco.workshop.calculationModule.Services.AdderService;

public class CalculationModuleApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AdderService service = context.getBean(AdderService.class);
	 	service.sum();

	}
}
