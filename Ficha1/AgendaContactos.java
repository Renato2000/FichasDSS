import java.util.HashMa

public class AgendaContactos{
	private Map<String, Contacto> todosConcatos;

	public AgendaContactos(){
		this.todosConcatos = new 
	}

	public void addContacto(Contacto c){
		this.todosConcatos.put(c.getNome(), c.clone());
	}

	public Map<String, Contacto> getContactos(){
		Map<String, Contacto> ret = new HashMap<>();

		for(    ){
			ret.put();
		}

		return ret;
	}

	public void alterarContacto(String nomeContacto, String tipoContacto, String valor){

	}
}