public class Controller extends MyObservable implements MyObserver{
	private AgendaContactos model;

	public Controller(AgendaContactos m){
		this.model = m;
	}

	public void update(MyObservable source, Object value){
		return;
	}

	public void processa(int op){
		return;
	}
}