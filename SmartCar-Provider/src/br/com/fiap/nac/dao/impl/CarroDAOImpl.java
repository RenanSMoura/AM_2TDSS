package br.com.fiap.nac.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.nac.dao.CarroDAO;
import br.com.fiap.nac.entity.Carro;

public class CarroDAOImpl extends GenericDAOImpl<Carro, Long> implements CarroDAO {

	public CarroDAOImpl(EntityManager em) {
		super(em);
	}

}
