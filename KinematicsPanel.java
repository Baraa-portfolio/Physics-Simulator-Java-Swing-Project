import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KinematicsPanel extends JPanel {
    public KinematicsPanel(MainFrame frame) {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        JLabel title = new JLabel("Kinematics (Grade 11)");
        title.setFont(title.getFont().deriveFont(18f));
        add(title, BorderLayout.NORTH);

        // Controls placeholder
        JPanel controls = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.gridx = 0; gbc.gridy = 0;

        controls.add(new JLabel("Initial Velocity (m/s):"), gbc);
        gbc.gridx = 1;
        JTextField v0Field = new JTextField("0.0", 10);
        controls.add(v0Field, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("Acceleration (m/s^2):"), gbc);
        gbc.gridx = 1;
        JTextField aField = new JTextField("0.0", 10);
        controls.add(aField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("Time (s):"), gbc);
        gbc.gridx = 1;
        JTextField tField = new JTextField("0.0", 10);
        controls.add(tField, gbc);

        add(controls, BorderLayout.WEST);

        // Visualization placeholder
        JPanel canvas = new JPanel();
        canvas.setBorder(BorderFactory.createTitledBorder("Visualization"));
        add(canvas, BorderLayout.CENTER);

        // Bottom controls
        JPanel bottom = new JPanel();
        JButton back = new JButton("Back");
        back.addActionListener(e -> frame.showConceptSelection("Grade 11"));
        bottom.add(back);

        JButton reset = new JButton("Reset");
        reset.addActionListener(e -> {
            v0Field.setText("0.0");
            aField.setText("0.0");
            tField.setText("0.0");
            // add reset of state here later
        });
        bottom.add(reset);

        add(bottom, BorderLayout.SOUTH);
    }
}

