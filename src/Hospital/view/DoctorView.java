package Hospital.view;

import Hospital.model.Pacientes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorView extends JFrame {

    // Array que almacena la resolución de pantalla
    private int[] pantall = {1300, 800};
    private ArrayList<Pacientes> listaPacientes;
    private JPanel panelPacientes;
    private JPanel salasViewPanel;

    public DoctorView(HashMap<String, String> doctorInfo, ArrayList<Pacientes> listaPacientes) {
        this.setTitle("Perfil del doctor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(pantall[0], pantall[1]);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.listaPacientes = listaPacientes;

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

        String nombreDoctor = doctorInfo.get("Nombre");
        String especialidadDoctor = doctorInfo.get("Especialidad");

        JLabel doctorName = new JLabel(nombreDoctor);
        doctorName.setForeground(Color.WHITE);
        doctorName.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel doctorSpecialty = new JLabel(especialidadDoctor);
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

        add(ComponentedeMenuLateral(), BorderLayout.WEST);

        PacienteView pacienteView = new PacienteView(listaPacientes);
        panelPacientes = pacienteView.panelPaciente(listaPacientes);
        this.add(panelPacientes, BorderLayout.CENTER);

        salasViewPanel = new SalasView();

        this.setVisible(true);
    }

    private JPanel ComponentedeMenuLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantall[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5, 1));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        menu.add(op("Consultas Del Día"), gbc);
        menu.add(op("Salas"), gbc);
        menu.add(op("Farmacia"), gbc);
        menu.add(op("Pacientes registrados"), gbc);
        menu.add(op("Citar en otra area"), gbc);
        menuPanel.add(menu);

        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);

        op.addActionListener(e -> {
            System.out.println(texto);

            if (texto.equals("Salas")) {

                this.remove(panelPacientes);
                this.add(salasViewPanel, BorderLayout.CENTER);

                // Actualizar la ventana para reflejar los cambios
                this.revalidate();
                this.repaint();
            }
        });

        return op;
    }
}
