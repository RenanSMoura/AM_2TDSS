package br.com.fiap.nac.dao;

import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.exception.EntityNotFoundException;

public interface GenericDAO <T, K> {
	public void cadastrar(T entidade) throws DBException;
	public T buscar(K chave) throws EntityNotFoundException;
	public void consultarKmVeiculo() throws DBException; 
}
