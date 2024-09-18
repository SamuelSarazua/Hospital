package Hospital.view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {

    // Array que almacena la resolución de pantalla
    private final int[] pantall = {1300, 800};

    public DoctorView() {
        this.setTitle("Perfil del doctor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(pantall[0], pantall[1]); // Usar el array para definir las dimensiones
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(pantall[0], 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);

        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.YELLOW);
        logoPanel.setPreferredSize(new Dimension(50, 50));

        JLabel doctorName = new JLabel("Samuel Sarazúa");
        doctorName.setForeground(Color.WHITE);
        doctorName.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel doctorSpecialty = new JLabel("Dermatólogo");
        doctorSpecialty.setForeground(Color.WHITE);
        doctorSpecialty.setFont(new Font("Arial", Font.PLAIN, 14));

        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(2, 1));
        doctorInfoPanel.setBackground(Color.DARK_GRAY);
        doctorInfoPanel.add(doctorName);
        doctorInfoPanel.add(doctorSpecialty);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10); // Espaciado entre componentes
        userPanel.add(logoPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        userPanel.add(doctorInfoPanel, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);

        this.add(headerPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }

}
