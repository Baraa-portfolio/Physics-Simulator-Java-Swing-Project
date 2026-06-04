import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EnergyWorkPanel extends JPanel {
    public EnergyWorkPanel(MainFrame frame) {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        JLabel title = new JLabel("Energy & Work (Grade 11)");
        title.setFont(title.getFont().deriveFont(18f));
        add(title, BorderLayout.NORTH);

        JPanel controls = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.gridx = 0; gbc.gridy = 0;

        controls.add(new JLabel("Mass (kg):"), gbc);
        gbc.gridx = 1;
        JTextField massField = new JTextField("1.0", 10);
        controls.add(massField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("Height (m):"), gbc);
        gbc.gridx = 1;
        JTextField heightField = new JTextField("0.0", 10);
        controls.add(heightField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("Velocity (m/s):"), gbc);
        gbc.gridx = 1;
        JTextField velocityField = new JTextField("0.0", 10);
        controls.add(velocityField, gbc);

        add(controls, BorderLayout.WEST);

        JPanel canvas = new JPanel();
        canvas.setBorder(BorderFactory.createTitledBorder("Energy Diagram / Motion (placeholder)"));
        add(canvas, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        JButton back = new JButton("Back");
        back.addActionListener(e -> frame.showConceptSelection("Grade 11"));
        bottom.add(back);

        JButton reset = new JButton("Reset");
        reset.addActionListener(e -> {
            massField.setText("1.0");
            heightField.setText("0.0");
            velocityField.setText("0.0");
        });
        bottom.add(reset);

        add(bottom, BorderLayout.SOUTH);
    }
}

