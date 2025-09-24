package Ej1;

public class ContrasenaInvalidaException extends Exception {
	String msg;
	public ContrasenaInvalidaException(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}
