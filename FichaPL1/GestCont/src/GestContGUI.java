import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestContGUI {
    private JPanel mainPanel;
    private JButton addContactButton;

    public GestContGUI() {
        addContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    JOptionPane.showMessageDialog(null, "This will add a contact");
            }
        });
    }
}
