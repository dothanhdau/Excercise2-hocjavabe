package CustomException;

import java.util.ArrayList;

public class FieldRequiredException extends RuntimeException {
	private ArrayList<String> erros=new ArrayList<>();
	public FieldRequiredException(String s) {
		super(s);
//		this.erros=erros;
	}
	public ArrayList<String> getErros() {
		return erros;
	}
	public void setErros(ArrayList<String> erros) {
		this.erros = erros;
	}
}
