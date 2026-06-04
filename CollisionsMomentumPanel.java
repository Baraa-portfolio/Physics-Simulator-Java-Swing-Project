import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CollisionsMomentumPanel extends JPanel {
    public CollisionsMomentumPanel(MainFrame frame) {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        JLabel title = new JLabel("Collisions & Momentum (Grade 12)");
        title.setFont(title.getFont().deriveFont(18f));
        add(title, BorderLayout.NORTH);

        JPanel controls = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.gridx = 0; gbc.gridy = 0;

        controls.add(new JLabel("m1 (kg):"), gbc);
        gbc.gridx = 1;
        JTextField m1Field = new JTextField("1.0", 10);
        controls.add(m1Field, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("v1 (m/s):"), gbc);
        gbc.gridx = 1;
        JTextField v1Field = new JTextField("0.0", 10);
        controls.add(v1Field, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("m2 (kg):"), gbc);
        gbc.gridx = 1;
        JTextField m2Field = new JTextField("1.0", 10);
        controls.add(m2Field, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("v2 (m/s):"), gbc);
        gbc.gridx = 1;
        JTextField v2Field = new JTextField("0.0", 10);
        controls.add(v2Field, gbc);

        add(controls, BorderLayout.WEST);

        JPanel canvas = new JPanel();
        canvas.setBorder(BorderFactory.createTitledBorder("Collision Visualization (placeholder)"));
        add(canvas, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        JButton back = new JButton("Back");
        back.addActionListener(e -> frame.showConceptSelection("Grade 12"));
        bottom.add(back);

        JButton reset = new JButton("Reset");
        reset.addActionListener(e -> {
            m1Field.setText("1.0");
            v1Field.setText("0.0");
            m2Field.setText("1.0");
            v2Field.setText("0.0");
        });
        bottom.add(reset);

        add(bottom, BorderLayout.SOUTH);
    }
}
