package utilitario;

public class ListaPerson {
	private static String[] _strArray;
	private Integer _primeDadoMemIni = 0;
	private String _valor;
	private Integer _proxDadoMemIni = 0;
	private static Integer _pontAnterior = 0;
	private static Integer _pontProximo = 0;
	private static Integer _tamanhoArray = 0;
	
	

	public ListaPerson() {

	}

	public ListaPerson(Integer primeDadoMemIni, String valor, Integer proxDadoMemIni, Integer pontAnterior,
			Integer pontProximo) {
		super();
		this._primeDadoMemIni = primeDadoMemIni;
		this._valor = valor;
		this._proxDadoMemIni = proxDadoMemIni;
		ListaPerson._pontAnterior = pontAnterior;
		ListaPerson._pontProximo = pontProximo;
	}
	
	
	

	public String adicionar(String valor) {
		String result;
		String[] temp = new String[_tamanhoArray];
		for(int i=0;i<_tamanhoArray;i++) {
			temp[i] = _strArray[i];
						
		}
		
		
		
		
		if(_pontProximo != 0) {
			_tamanhoArray = _tamanhoArray+1;
			ListaPerson._strArray = new String[_tamanhoArray];			
		}else {
			ListaPerson._strArray = new String[1];
		}
		
		
		
		
		if(_pontProximo != 0) {
			for(int i=0;i<_tamanhoArray-1;i++) {
				_strArray[i] = temp[i];
			}
			
			_strArray[_pontProximo]=valor;
			_pontProximo =_pontProximo+1;
			_tamanhoArray = _tamanhoArray++;
			result = _strArray[1];
			
		}else {
			_strArray[0] = valor;
			_pontProximo = 1;
			_tamanhoArray = 1;
			result = _strArray[0];
		}
		
		
		
		
		

		return result;
	}
	
	
	
	public String findAll() {
		String res = "";
		for (int i=0;i<_tamanhoArray;i++) {
			
			if(i == 0) {
				res = "{"+ ListaPerson._strArray[i];
				
			}else if(i==_tamanhoArray-1){
				res = res + ", "+ ListaPerson._strArray[i]+"}";
				
			}else{
				res = res + ", "+ ListaPerson._strArray[i];
				
			}
					
			
		}
		return res;	
		
	}
	
	

}
