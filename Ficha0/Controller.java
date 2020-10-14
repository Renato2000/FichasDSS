public class Controller extends MyObservable implements MyObserver{
	private AgendaContactos model;

	public Controller(AgendaContactos m){
		this.model = m;
	}

	public void update(MyObservable source, Object value){
		notifyObservers(value);
	}

	public void processa(int op){
		return;
	}

	public void adicionarContacto(){
		try{
			this.model.addContacto(new Contacto());
		}
		catch (Exception e) { }
	}
}