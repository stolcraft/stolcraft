package eu.ensup.premierprojet.dao;

import java.util.List;

import eu.ensup.premierprojet.domaine.Eleve;

public class EleveDao {

	public void createStudent(Eleve eleve) {

		 System.out.println("creation de l'�l�ve");
	}

	public Eleve getEleveById(int id) {

		 System.out.println("recup�ration de l'�l�ve dont l'ID est :" + id);
		 return new Eleve("jean", "pierre");
	}
	
	public void delete(Eleve eleve) {

		 System.out.println("suppression de l'�l�ve");
	}
	public List<Eleve> getAll() {

		 System.out.println("recup�ration de tout les eleves");
		return null;
	}
	
	
}
