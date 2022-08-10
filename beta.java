package Alpha;

import javax.swing.*;
import java.awt.*;

public class beta extends JFrame {
    public void main(String[] args) {
        beta b = new beta();

        JLabel lblname = new JLabel("Name");
        JTextField txtname = new JTextField(13);
        JPanel panela = new JPanel();
        panela.add(lblname);
        panela.add(txtname);

        Component add = getContentPane().add(BorderLayout.CENTER, panela);
        b.show();


    }
}
