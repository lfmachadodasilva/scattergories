package tratamento_erro;

public class TemasInsuficientesException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "S�o necess�rios pelo menos tr�s categorias.";
	}
}
