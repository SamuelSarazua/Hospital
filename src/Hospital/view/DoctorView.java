package Hospital.view;

import Hospital.model.Medicamento;
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
    private JPanel medicamentosViewPanel;

    public DoctorView(HashMap<String, String> doctorInfo, ArrayList<Pacientes> listaPacientes, ArrayList<Medicamento> listaMedicamentos) {
        this.setTitle("Perfil del doctor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(pantall[0], pantall[1]);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.listaPacientes = listaPacientes;

        // Crear el header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(pantall[0], 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Información del doctor
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

        // Inicializar paneles
        PacienteView pacienteView = new PacienteView(listaPacientes);
        panelPacientes = pacienteView.panelPaciente(listaPacientes);
        this.add(panelPacientes, BorderLayout.CENTER);

        salasViewPanel = new SalasView(); // Inicializar el panel de salas
        MedicamentosView medicamentosView = new MedicamentosView(listaMedicamentos);
        medicamentosViewPanel = medicamentosView.panelMedicamentos(listaMedicamentos); // Inicializar el panel de medicamentos

        this.setVisible(true);
    }

    private JPanel ComponentedeMenuLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantall[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5, 1));

        // Crear botones en el menú lateral
        menu.add(op("Consultas Del Día"));
        menu.add(op("Salas"));
        menu.add(op("Farmacia"));
        menu.add(op("Pacientes registrados"));
        menu.add(op("Citar en otra área"));

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton button = new JButton(texto);

        button.addActionListener(e -> {
            System.out.println(texto);

            this.remove(panelPacientes);

            switch (texto) {
                case "Salas":
                    this.remove(medicamentosViewPanel);
                    this.add(salasViewPanel, BorderLayout.CENTER);
                    break;

                case "Farmacia":
                    this.remove(salasViewPanel);
                    this.add(medicamentosViewPanel, BorderLayout.CENTER);
                    break;

                default:
                    System.out.println("Opción no manejada");
                    break;
            }

            this.revalidate();
            this.repaint();
        });

        return button;
    }
}
