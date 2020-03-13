

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;


public class Gui extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    private GridBagConstraints constraints;

    String[] livingThing = {"Human", "Animal", "Plant"};

    public Gui() {
        this.setSize(500, 500);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constraints = new GridBagConstraints();
        addHeadingLabel();
        addJCombobox();
        addType();
        addname();
        addtextfield1();
        addage();
        addtextfield2();
        addsubmit();
       
        
    }

    
    private void addType(){
        JLabel type = new JLabel("Type");

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;

        this.add(type, constraints);
    }
    private void addJCombobox(){
        JComboBox livingCreature = new JComboBox(livingThing);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;

        this.add(livingCreature, constraints);
    }
    private void addHeadingLabel() {
        JLabel headingLabel = new JLabel("Heading");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        headingLabel.setOpaque(true);
        headingLabel.setBackground(Color.RED);
        this.add(headingLabel, constraints);
    }
    private void addname(){
        JLabel name = new JLabel("Name");

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;

        this.add(name, constraints);
    }
    private void addtextfield1(){
        JTextField entertext = new JTextField();

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth =3;

        entertext.setPreferredSize(new Dimension(200,25));
        this.add(entertext, constraints);
    }
    private void addage(){
        JLabel age = new JLabel("Age");

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;

        this.add(age, constraints);
    }
    private void addtextfield2(){
        JTextField enterage = new JTextField();

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth =1;

        enterage.setPreferredSize(new Dimension(200,25));
        this.add(enterage, constraints);
    }
    private void addsubmit(){
        JButton submit = new JButton("Submit");

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 1;

        this.add(submit, constraints);
    }

    
    public static void main(String[] args)
    {
        Gui gui = new Gui();
        gui.setVisible(true);
    }
}