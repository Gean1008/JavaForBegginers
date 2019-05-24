import javax.swing.JOptionPane;

public class informWindow {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Welcome to Java!!!");
        String name = JOptionPane.showInputDialog("Input your name: ");
        String message = String.format("Welcome, %s to Java",name);
        JOptionPane.showMessageDialog(null, message);
    }
}
