import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example implements ActionListener {
    JButton start;

    public static void main(String[] args) {
        example e = new example();
        e.ex();
    }

//        static GraphicsConfiguration gc;
        public void ex() {
            JFrame frame= new JFrame();
            frame.setTitle("Welecome to JavaTutorial.net");
            frame.setSize(700,200);
            Panel p = new Panel();
            start = new JButton("start");
            p.add(start);
            start.addActionListener(this);
            frame.add(p);

        frame.setLocationRelativeTo(null);
            frame.setVisible(true);

//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
if ( actionEvent.getSource()==start){
    System.out.println("valami tortent");
}
    }
}


