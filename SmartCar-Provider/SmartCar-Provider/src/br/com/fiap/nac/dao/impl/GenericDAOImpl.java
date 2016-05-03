package br.com.fiap.nac.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.nac.dao.GenericDAO;
import br.com.fiap.nac.entity.Carro;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.exception.EntityNotFoundException;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {

	private EntityManager em;
	private Class<T> classe;
	
	
	@SuppressWarnings(value="all")
	public GenericDAOImpl(EntityManager em){
		this.em = em;
		this.classe = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	
	public void cadastrar(T entidade) throws DBException {
		try{
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		} catch(Exception e){
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			} 
			throw new DBException("Cadastro não realizado com sucesso!");
		}
		
	}

	public T buscar(K chave) throws EntityNotFoundException {
		T entidade = em.find(classe, chave);
		
		if(entidade == null){
			throw new EntityNotFoundException("Entidade não encontrada");
		}
		
		return entidade;
	}


	@Override
	public void consultarKmVeiculo(Carro carro) throws DBException {
		Query query = em.createNativeQuery("select KMPROXIMATROCAOLEO from T_NAC_CARRO");
		System.out.println(query.getSingleResult());
	
	}



}
