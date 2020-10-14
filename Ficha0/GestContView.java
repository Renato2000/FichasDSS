public class GestContView{
	private Controller controller;

	public GestContView(Controller c){
		this.controller = c;
	}

	public void run(){
		GestContGUI gui = new GestContGUI(this.controller);
		//gui.dispose(); //Fecha a janela
	}


}