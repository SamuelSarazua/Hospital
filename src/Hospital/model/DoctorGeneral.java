package Hospital.model;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DoctorGeneral extends JFrame {
    public DoctorGeneral() {

        // CONFIGURACIÓN DE LA VENTANA
        this.setTitle("DOCTOR");
        this.setBounds(0, 0, 1600, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PANEL INICIAL
        JPanel panelInicial = new JPanel(new GridLayout(0, 3, 20, 20));  // Añadir espacio entre columnas
        panelInicial.setBorder(new EmptyBorder(20, 20, 20, 20));  // Margen alrededor del panel
        this.add(panelInicial);

        Font fuente = new Font("Arial", Font.PLAIN, 24);

        // Columna de Horarios del Doctor
        JPanel horarioPanel = new JPanel();
        horarioPanel.setLayout(new BorderLayout(10, 10));  // Añadir espacio entre componentes
        horarioPanel.setBorder(new LineBorder(new Color(75, 0, 130), 2));  // Añadir borde
        JLabel horarioLabel = new JLabel("Horario de Pacientes", SwingConstants.CENTER);  // Centrando texto
        horarioLabel.setFont(fuente);
        horarioPanel.add(horarioLabel, BorderLayout.NORTH);

        JList<String> horarioLista = new JList<>(new String[]{
                "09:00 - Paciente 1", "10:00 - Paciente 2", "11:00 - Paciente 3", "12:00 - Paciente 4",
                "13:00 - Paciente 5", "14:00 - Paciente 6", "15:00 - Paciente 7"
        });
        horarioLista.setFont(fuente);
        horarioPanel.add(new JScrollPane(horarioLista), BorderLayout.CENTER);
        horarioPanel.setBackground(new Color(230, 230, 250));
        horarioLabel.setForeground(new Color(75, 0, 130));
        panelInicial.add(horarioPanel);

        JPanel pacientesPanel = new JPanel();
        pacientesPanel.setLayout(new BorderLayout(10, 10));
        pacientesPanel.setBorder(new LineBorder(new Color(0, 128, 0), 2));
        JLabel pacientesLabel = new JLabel("Lista de Pacientes", SwingConstants.CENTER);
        pacientesLabel.setFont(fuente);
        pacientesPanel.add(pacientesLabel, BorderLayout.NORTH);


        JButton pacienteBoton = new JButton("Abrir");
        pacienteBoton.setFont(fuente);
        pacienteBoton.setBackground(new Color(60, 179, 113));
        pacienteBoton.setForeground(Color.WHITE);
        pacientesPanel.add(pacienteBoton, BorderLayout.SOUTH);

        pacientesPanel.setBackground(new Color(230, 250, 230));
        pacientesLabel.setForeground(new Color(0, 128, 0));
        panelInicial.add(pacientesPanel);


        // Columna de los Doctores
        JPanel doctoresPanel = new JPanel();
        doctoresPanel.setLayout(new BorderLayout(10, 10));
        doctoresPanel.setBorder(new LineBorder(new Color(255, 244, 0), 2));
        JLabel doctoresLabel = new JLabel("Lista de Doctores", SwingConstants.CENTER);
        doctoresLabel.setFont(fuente);
        doctoresPanel.add(doctoresLabel, BorderLayout.NORTH);


        JButton doctorBoton = new JButton("Abrir");
        doctorBoton.setFont(fuente);
        doctorBoton.setBackground(new Color(246, 240, 130));
        doctorBoton.setForeground(Color.WHITE);
        doctoresPanel.add(doctorBoton, BorderLayout.SOUTH);

        doctoresPanel.setBackground(new Color(246, 240, 130));
        doctoresPanel.setForeground(new Color(246, 240, 130));
        panelInicial.add(doctoresPanel);

        // Columna de las Enfermeras
        JPanel enfermePanel = new JPanel();
        enfermePanel.setLayout(new BorderLayout(10, 10));
        enfermePanel.setBorder(new LineBorder(new Color(165, 42, 42), 2));
        JLabel enfermeLabel = new JLabel("Lista de Enfermeras", SwingConstants.CENTER);
        enfermeLabel.setFont(fuente);
        enfermePanel.add(enfermeLabel, BorderLayout.NORTH);


        JPanel botonPanel = new JPanel(new GridLayout(1, 2, 10, 0));  // Panel para los botones con espacio entre ellos
        botonPanel.setBackground(enfermePanel.getBackground());
        JButton botonEnfer = new JButton("Abrir");
        botonEnfer.setFont(fuente);
        botonEnfer.setBackground(new Color(255, 105, 97));
        botonEnfer.setForeground(Color.WHITE);
        botonPanel.add(botonEnfer);

        JButton annadirBtn = new JButton("Añadir");
        annadirBtn.setFont(fuente);
        annadirBtn.setBackground(new Color(165, 42, 42));
        annadirBtn.setForeground(Color.WHITE);
        botonPanel.add(annadirBtn);

        enfermePanel.add(botonPanel, BorderLayout.SOUTH);

        enfermePanel.setBackground(new Color(250, 230, 230));
        enfermeLabel.setForeground(new Color(165, 42, 42));
        panelInicial.add(enfermePanel);

        this.setVisible(true);
    }

    private String nombre;
    private String especialidad;
    private String edad;
    private String telefono;
    private String correo;
    private String contra;


    //Metodo Constructor
    public DoctorGeneral(String nombre, String especialidad, String edad, String telefono, String correo, String contra){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.contra = contra;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public String getEdad() {
        return this.edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContra() {
        return contra;
    }

    //Setters
    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public void  setEspecialidad(String apellido){
        this.especialidad = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}