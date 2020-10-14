import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GestContGUI extends JFrame implements MyObserver{
	private JLabel label;
	private Controller controller;

    public GestContGUI(Controller c) {
     	super();

     	this.controller = c;

		controller.addObserver(this);

     	JButton button_addContact = new JButton("Add Contact");
     	button_addContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	adicionarContacto();
            }
        });

     	this.label = new JLabel("Number of contacts: 0");

     	JPanel panel = new JPanel();

     	panel = new JPanel();
     	// cima x esquerda x baixo x direita
     	panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
     	panel.setLayout(new GridLayout(0, 1));
     	panel.add(button_addContact);
     	panel.add(this.label);

     	this.setTitle("GestCont");
     	this.add(panel, BorderLayout.CENTER);
     	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	this.pack();
     	this.setVisible(true);
    }

    public void update(MyObservable o, Object arg) {
        this.label.setText("Number of contacts: " + arg.toString());
    }

    public void adicionarContacto(){
    	this.controller.adicionarContacto();
    }
}
