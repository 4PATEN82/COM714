import javax.swing.JButton;

import javax.swing.JFrame;

public class Gui extends JFrame{

    public Gui(){
        addGreetingButton();
    }
    private void addGreetingButton(){
        JButton greetingButton = new JButton("Display Greeting");
        this.add(greetingButton);

    }

        public static void main(String[] args) {
            Gui gui = new Gui();
            gui.setVisible(true);

        }
    
}