package eu.ensup.premierprojet.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.premierprojet.configuration.ConfigurationBeans;
import eu.ensup.premierprojet.dao.EleveDao;
import eu.ensup.premierprojet.service.EleveService;

public class LanceurConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		load le conteneur
		ApplicationContext appContext = (ApplicationContext) new AnnotationConfigApplicationContext(ConfigurationBeans.class);
//		recupéreration du bean service
		EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		
//		manipulation du bean service (lecture d'un élève dont l'identifiant 1)
		System.out.println(eleveservice.lireEleve(2).toString());
		
	}
	

}
