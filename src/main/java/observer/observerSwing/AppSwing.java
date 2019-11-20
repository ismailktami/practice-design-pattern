package observer.observerSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppSwing extends JFrame {
    private List listes1=new List();
    private List listes2=new List();

    private JButton jb1=new JButton("Sujjet");


    class Ecouteur1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            listes1.add(" Informer Ecouteur1 "+e.getSource());
        }
    }

    class Ecouteur12 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            listes2.add("Informer Ecouteur2 "+e.getSource());
        }
    }



    public AppSwing(){
        this.setLayout(new FlowLayout());
        this.add(jb1);
        this.add(listes1);
        this.add(listes2);
        this.setBounds(10,10,500,500);
        this.setVisible(true);

        Ecouteur1 e1=new Ecouteur1();
        Ecouteur12 e2=new Ecouteur12();
        jb1.addActionListener(e1);
        jb1.addActionListener(e2);
    }
    public static void main(String[] args) {
        new AppSwing();
    }
}
