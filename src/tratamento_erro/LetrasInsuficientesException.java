package tratamento_erro;

public class LetrasInsuficientesException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "� necess�rio selecionar pelo menos tr�s letras.";
	}
}
