package br.com.fiap.nac.exception;

@SuppressWarnings("serial")
public class EntityNotFoundException extends Exception{

	public EntityNotFoundException(){}
	
	public EntityNotFoundException(String msg){
		super(msg);
	}
}
