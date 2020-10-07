public class Contacto{
	private String nome;
	private TipoContacto etiquetaContacto;

	public Contacto(){
		this.nome = newString();
		this.etiquetaContacto = new TipoContacto();
	}

	public Contacto(String nome){
		this.nome = newString();
		this.etiquetaContacto = new TipoContacto();
	}

	public Contacto(String nome, String nomeTipo, String valorTipo){
		this.nome = newString();
		this.etiquetaContacto = new TipoContacto(nomeTipo, valorTipo);
	}

	public String getNome(){
		return this.nome;
	}

	public void alterarNome(String nome){
		this.nome = nome;
	}

	public void alterarTipoContacto(String tipo){
		this.etiquetaContacto.alterarNomeTipo(tipo);
	}

	public void alterarValorContacto(String valor){
		this.etiquetaContacto.alterarValorTipo(valor);
	}
}