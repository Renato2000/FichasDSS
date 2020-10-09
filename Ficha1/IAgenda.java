import java.util.Map;

public interface IAgenda{
	public void addContacto(Contacto c) throws ContactoInvalidoException;
	public Contacto getContacto(String nomeContacto) throws ContactoInvalidoException;
	public Map<String, Contacto> getContactos();
	public void alterarContacto(String nomeContacto, String tipoContacto, String Valor) throws ContactoInvalidoException;
	public void addObserver(MyObserver observer);
}