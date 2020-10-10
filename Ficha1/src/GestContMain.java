public class GestContMain{
	public GestContMain(){
		this.run();
	}

	public static void main(String[] args){
		new GestContMain();
	}

	public void run(){
		AgendaContactos model = new AgendaContactos();
		Controller controller = new Controller(model);
		GestContView view = new GestContView(controller);

		controller.addObserver(view);
		model.addObserver(controller);

		view.run();
	}
}