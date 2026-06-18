import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo implements ActionListener {

    JFrame frame;
    JButton button;

    public ActionListenerDemo() {

        frame = new JFrame("ActionListener Example");

        button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);

        // Register ActionListener
        button.addActionListener(this);

        frame.add(button);
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionListenerDemo();
    }
}