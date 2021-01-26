import javax.swing.*;

public class GUI {
    private JPanel Panel;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVC");
        frame.setContentPane(new GUI().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
