package br.com.fiap.nac.teste;

import java.util.List;

import org.junit.Test;

import br.com.fiap.nac.bo.CarroBO;
import br.com.fiap.nac.entity.Carro;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.exception.EntityNotFoundException;

public class TesteCarro {
   
	@Test
	public void testListar(){
		List<Carro> lista;
		CarroBO bo = new CarroBO();
		
		lista = bo.listar();
		for (Carro carro : lista) {
			System.out.println(carro.getModelo());
		}
	}
	
   @Test
   public void testCadastra(){
	   Carro cr = new Carro();
	   cr.setId(0);
	   cr.setAno(2006);
	   cr.setCombustivel("Gasolina");
	   cr.setKmCarro(153000);
	   cr.setKmProximaTrocaOleo(9000);
	   cr.setMarca("VW");
	   cr.setModelo("GOL");
	   cr.setPlaca("XXX-XXX");
	   
	   CarroBO bo = new CarroBO();
	   bo.cadastrar(cr);
   }
   
   
   @Test
   public void testBusca(){
	   Carro cr = new Carro();
	   cr.setId(0);
	   cr.setAno(2006);
	   cr.setCombustivel("Gasolina");
	   cr.setKmCarro(153000);
	   cr.setKmProximaTrocaOleo(9000);
	   cr.setMarca("VW");
	   cr.setModelo("GOL");
	   cr.setPlaca("XXX-XXX");
	   
	   CarroBO bo = new CarroBO();
	   bo.cadastrar(cr);
	   bo.Buscar(1);
   }
	
	
   @Test
   public void testValidaTrocaOleo() throws DBException, EntityNotFoundException{
	   Carro cr = new Carro();
	   cr.setId(0);
	   cr.setAno(2006);
	   cr.setCombustivel("Gasolina");
	   cr.setKmCarro(153000);
	   cr.setKmProximaTrocaOleo(9000);
	   cr.setMarca("VW");
	   cr.setModelo("GOL");
	   cr.setPlaca("XXX-XXX");
	   
	   CarroBO bo = new CarroBO();
	   bo.cadastrar(cr);
	   bo.ValidarKm(9000,1);
	 
   }
   
}

