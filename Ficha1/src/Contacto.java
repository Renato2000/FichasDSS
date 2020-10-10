public class Contacto{
	private String nome;
	private TipoContacto etiquetaContacto;

	public Contacto(){
		this.nome = new String();
		this.etiquetaContacto = new TipoContacto();
	}

	public Contacto(String nome){
		this.nome = new String();
		this.etiquetaContacto = new TipoContacto();
	}

	public Contacto(String nome, String nomeTipo, String valorTipo){
		this.nome = new String();
		this.etiquetaContacto = new TipoContacto(nomeTipo, valorTipo);
	}

	public Contacto(Contacto c){
		this.nome = c.getNome();
		this.etiquetaContacto = new TipoContacto(c.getValorContacto(), c.getTipoContacto());
	}

	public Contacto clone(){
		return new Contacto(this);
	}

	public String getNome(){
		return this.nome;
	}

	public TipoContacto getEtiquetaContacto(){
		return this.etiquetaContacto.clone();
	}

	public String getTipoContacto(){
		return this.etiquetaContacto.getNomeTipo();
	}

	public String getValorContacto(){
		return this.etiquetaContacto.getValorTipo();
	}

	public void setEtiquetaContacto(TipoContacto ec){
		this.etiquetaContacto = ec;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setTipoContacto(String tipo){
		this.etiquetaContacto.setNomeTipo(tipo);
	}

	public void setValorContacto(String valor){
		this.etiquetaContacto.setValorTipo(valor);
	}
}