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
			if (carro.getAno() > 2005) {
				CarroDAO carroDao = new CarroDAOImpl(em);
				carroDao.cadastrar(carro);
			} else {
				System.out.println("Testando BO");
			}
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

	public void Buscar(long chave) {
		try {
			CarroDAO carroDAO = new CarroDAOImpl(em);
			carroDAO.buscar(chave);
			System.out.println("foi");
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void ValidarKm(Carro carro) {
		try {
			CarroDAO carroDAO = new CarroDAOImpl(em);
			if(carro.getKmProximaTrocaOleo() >= 9000){
				carroDAO.consultarKmVeiculo(carro);
				carro.setKmProximaTrocaOleo(0);
				System.out.println("trocar Ol�o");
			} else {
				carroDAO.consultarKmVeiculo(carro);
			}
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
