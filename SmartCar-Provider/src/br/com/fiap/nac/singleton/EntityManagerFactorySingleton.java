package br.com.fiap.nac.singleton;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	private static EntityManagerFactory factory;
	
	private EntityManagerFactorySingleton(){
		
	}
	
	public static EntityManagerFactory getInstance(){
		if(factory == null){
			factory = Persistence.createEntityManagerFactory("CLIENTE_CARRO");
		}
			return factory;
	}

}
