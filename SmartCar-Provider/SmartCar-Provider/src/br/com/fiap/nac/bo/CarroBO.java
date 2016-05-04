package br.com.fiap.nac.bo;

import javax.persistence.EntityManager;

import br.com.fiap.nac.dao.CarroDAO;
import br.com.fiap.nac.dao.impl.CarroDAOImpl;
import br.com.fiap.nac.entity.Carro;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.exception.EntityNotFoundException;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class CarroBO {

	private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	
	public void cadastrar(Carro carro) {
		try {
			CarroDAO carroDao = new CarroDAOImpl(em);
			carroDao.cadastrar(carro);
		} catch (DBException e) {
			e.printStackTrace();
		}	
	}
	public void Buscar(long chave) {
		try {
			CarroDAO carroDAO = new CarroDAOImpl(em);
			carroDAO.buscar(chave);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
	}
	public boolean ValidarKm(double kmPercorrido, long chave) {
		CarroDAO carroDAO = new CarroDAOImpl(em);
		Carro carro;
		try {
			carro = carroDAO.buscar(chave);
			if(kmPercorrido >= carro.getKmProximaTrocaOleo()){
				carro.setKmProximaTrocaOleo(0);
				return true;
			} else {
				return false;
			}
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}			
}

