public class GestContView implements MyObserver{
	private Controller controller;

	public GestContView(Controller c){
		this.controller = c;
	}

	public void run(){
		System.out.println("Runing...");
		int op = 1;
		while(op != 0){
			this.showOptions();
			
		}
	}

	public void update(MyObservable source, Object value){
		return;
	}

	private void showOptions(){
		System.out.println("------Menu de opções------");
		System.out.println("1 -> Adicionar novo contacto.");
		System.out.println("2 -> Ver contacto.");
		System.out.println("3 -> Ver todos os contactos.");
		System.out.println("4 -> Apagar contato.");
		System.out.println("0 -> Fechar.");
	}
}