package br.com.fiap.nac.teste;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.fiap.nac.bo.CarroBO;
import br.com.fiap.nac.dao.CarroDAO;
import br.com.fiap.nac.entity.Carro;
import br.com.fiap.nac.entity.Combustivel;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.exception.EntityNotFoundException;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class TesteCarro {

//	private static CarroDAO dao;
//	
//   @BeforeClass
//   public static void init(){
//	   EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
//	   //dao = new CarroDAOImpl(em);
//   }

   
//   @Test
//   public void testCadastrar() throws DBException{
//	   Carro carro = new Carro();
//	   carro.setAno(2003);
//	   carro.setCombustivel(Combustivel.ALCOOL);
//	   carro.setId(0);
//	   carro.setModelo("Fusca");
//	   
//	   CarroBO carrobo = new CarroBO();
//	   carrobo.cadastrar(carro);
//   }
   
   @Test
   public void testBuscar() throws DBException, EntityNotFoundException{  
	   Carro cr = new Carro();
	   cr.setId(0);
	   cr.setAno(2006);
	   cr.setCombustivel(Combustivel.GASOLINAADT);
	   cr.setKmCarro(153000);
	   cr.setKmPercorrido(9000);
	   cr.setMarca("VW");
	   cr.setModelo("GOL");
	   cr.setPlaca("XXX-XXX");
	   
	   CarroBO bo = new CarroBO();
	   bo.cadastrar(cr);
//	   bo.Buscar(1);
	   
	   bo.ValidarKm();
   }
   
}

