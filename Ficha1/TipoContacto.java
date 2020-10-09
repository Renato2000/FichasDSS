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

	public TipoContacto(TipoContacto tc){
		this.nomeTipo = tc.getNomeTipo();
		this.valorTipo = tc.getValorTipo();		
	}

	public TipoContacto clone(){
		return new TipoContacto(this);
	}

	public String getNomeTipo(){
		return this.nomeTipo;
	}

	public String getValorTipo(){
		return this.valorTipo;
	}

	public void setNomeTipo(String nome){
		this.nomeTipo = nome;
	}

	public void setValorTipo(String valor){
		this.valorTipo = valor;
	}
}