package week6;

import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Gui extends JFrame{

    JPanel greetingPanel;

    public Gui() {
        this.setSize(new Dimension(500,500));
        this.setLayout(new BorderLayout());

        addGreetingPanel();
        addGreetingLabel();
        addGreetingtextField();
        addGreetingButton();
    }

private void addGreetingPanel(){
    greetingPanel = new JPanel();
    this.add(greetingPanel, BorderLayout.NORTH);
}


private void addGreetingLabel() {
    JLabel greetinglabel = new JLabel("Enter greeting:");
    greetingPanel.add(greetinglabel);
}

    private void addGreetingButton(){
        JButton greetingButton = new JButton("Display Greeting");
        greetingPanel.add(greetingButton);

    }
    private void addGreetingtextField(){
        JTextField greetingTextField = new JTextField();
        greetingTextField.setPreferredSize(new Dimension(200, 50));
        this.add(greetingTextField);
    }

        public static void main(String[] args) {
            Gui gui = new Gui();
            gui.setVisible(true);

        }
    
}