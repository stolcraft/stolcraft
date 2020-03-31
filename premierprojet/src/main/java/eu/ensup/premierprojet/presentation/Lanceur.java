package eu.ensup.premierprojet.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.premierprojet.service.EleveService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		load le conteneur
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demospringinjection.xml");
		
//		recup�reration du bean service
		EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		
//		manipulation du bean service (lecture d'un �l�ve dont l'identifiant 1)
		System.out.println(eleveservice.lireEleve(1).toString());
		
		
	}

}
