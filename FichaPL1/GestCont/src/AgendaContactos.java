import java.util.HashMap;
import java.util.Map;

public class AgendaContactos extends MyObservable{
	private Map<String, Contacto> todosConcatos;
	private MyObservable observers;

	public AgendaContactos(){
		this.todosConcatos = new HashMap<>();
	}

	public void addContacto(Contacto c) throws ContactoInvalidoException{
		if(this.todosConcatos.containsKey(c.getNome())){
			throw new ContactoInvalidoException("O contacto já existe.");
		}
		else{
			this.todosConcatos.put(c.getNome(), c.clone());
		}
	}

	public Contacto getContacto(String nome) throws ContactoInvalidoException{
		if(this.todosConcatos.containsKey(nome)){
			return this.todosConcatos.get(nome).clone();
		}
		else{
			throw new ContactoInvalidoException("O contacto não existe.");
		}
	}

	public Map<String, Contacto> getContactos(){
		Map<String, Contacto> ret = new HashMap<>();

		for(Map.Entry<String, Contacto> entry : this.todosConcatos.entrySet()){
			ret.put(entry.getKey(), entry.getValue().clone());
		}

		return ret;
	}

	public void alterarContacto(String nomeContacto, String tipoContacto, String valor) throws ContactoInvalidoException{
		Contacto c = this.getContacto(nomeContacto);
		c.setTipoContacto(tipoContacto);
		c.setValorContacto(valor);
	}
}