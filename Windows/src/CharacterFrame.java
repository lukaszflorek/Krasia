import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class CharacterFrame extends JFrame implements ActionListener {
    JButton button = new JButton("OK");
    JComboBox <String> combo = new JComboBox<>();

    public CharacterFrame() {
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(true);

    }

}
