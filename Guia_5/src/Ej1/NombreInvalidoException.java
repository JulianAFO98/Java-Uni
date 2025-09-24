package Ej1;

public class NombreInvalidoException extends Exception {
	String msg;
	public NombreInvalidoException(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	
	
}
