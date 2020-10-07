public class TipoContacto{
	private String nomeTipo;
	private String valorTipo;

	/* ex:
	Nome tipo: mobile
	Valor tipo: 912345678
	*/

	public TipoContacto(){
		this.nomeTipo = new String();
		this.valorTipo = new String();
	}

	public TipoContacto(String nome, String valor){
		this.nomeTipo = nome;
		this.valorTipo = valor;		
	}

	public void alterarNomeTipo(String nome){
		this.nomeTipo = nome;
	}

	public void alterarValorTipo(String valor){
		this.valorTipo = valor;
	}
}