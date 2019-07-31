package Observer.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserver {

    JFrame frame;

    public static void main(String[] args){
        SwingObserver test = new SwingObserver();
        test.start();
    }

    public void start(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");

        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Come on, do it!");
        }
    }

}
