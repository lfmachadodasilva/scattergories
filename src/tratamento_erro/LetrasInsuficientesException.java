package tratamento_erro;

public class LetrasInsuficientesException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "É necessário selecionar pelo menos três letras.";
	}
}
