package eu.ensup.premierprojet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eu.ensup.premierprojet.dao.EleveDao;
import eu.ensup.premierprojet.service.EleveService;
@Configuration
public class ConfigurationBeans {

	@Bean
	public EleveService eleveservice() {
        return new EleveService(elevedao());
    }

	@Bean
	public EleveDao elevedao() {
        return new EleveDao();
    }
}
