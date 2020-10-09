public class GestContMain{
	public static void main(String[] args){
		AgendaContactos model = new AgendaContactos();
		Controller controller = new Controller(model);
		GestContView view = new GestContView(controller);

		controller.addObserver(view);
		model.addObserver(controller);

		view.run();
	}
}