import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CircularMotionPanel extends JPanel {
    public CircularMotionPanel(MainFrame frame) {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        JLabel title = new JLabel("Circular Motion (Grade 12)");
        title.setFont(title.getFont().deriveFont(18f));
        add(title, BorderLayout.NORTH);

        JPanel controls = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.gridx = 0; gbc.gridy = 0;

        controls.add(new JLabel("Radius (m):"), gbc);
        gbc.gridx = 1;
        JTextField rField = new JTextField("1.0", 10);
        controls.add(rField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        controls.add(new JLabel("Speed (m/s):"), gbc);
        gbc.gridx = 1;
        JTextField vField = new JTextField("0.0", 10);
        controls.add(vField, gbc);

        add(controls, BorderLayout.WEST);

        JPanel canvas = new JPanel();
        canvas.setBorder(BorderFactory.createTitledBorder("Circular Path (placeholder)"));
        add(canvas, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        JButton back = new JButton("Back");
        back.addActionListener(e -> frame.showConceptSelection("Grade 12"));
        bottom.add(back);

        JButton reset = new JButton("Reset");
        reset.addActionListener(e -> {
            rField.setText("1.0");
            vField.setText("0.0");
        });
