import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.LIGHT_GRAY;

public class LoginGUI implements ActionListener {
//test comment
    private JButton btu_login;
    private JTextField username_txt;
    private JTextField passcode_txt;

    public LoginGUI() {
        JFrame frame = new JFrame();
        frame.setTitle("Minute Meals!");
        frame.setLayout(new FlowLayout());

        JPanel colorPanel = new JPanel();

        btu_login = new JButton("Login");
        btu_login.addActionListener(this);

        JLabel username = new JLabel("Username ");
        username_txt = new JTextField(5);

        JLabel passcode = new JLabel("Passcode ");
        passcode_txt = new JTextField(5);

        colorPanel.add(username);
        colorPanel.add(username_txt);
        colorPanel.add(passcode);
        colorPanel.add(passcode_txt);
        colorPanel.add(btu_login);

        frame.add(colorPanel);
        frame.setSize(400, 100);
        colorPanel.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
