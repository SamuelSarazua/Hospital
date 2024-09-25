package Hospital.view;

import Hospital.model.Pacientes;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView {
    private ArrayList<Pacientes> listaPacientes;

    public PacienteView(ArrayList<Pacientes> pacientes) {
        this.listaPacientes = pacientes;
    }

    public JPanel panelPaciente(ArrayList<Pacientes> pacientes) {
        this.listaPacientes = pacientes;

        JPanel panelPacientes = new JPanel();
        panelPacientes.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Listado de Pacientes");
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPacientes.add(titulo, BorderLayout.NORTH);

        JPanel tablitaDatos = new JPanel();
        tablitaDatos.setLayout(new GridLayout(0, 4));

        String[] datos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};

        for (String datosP : datos) {
            JLabel datosLabel = new JLabel(datosP);
            datosLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            tablitaDatos.add(datosLabel);
        }

        for (Pacientes paciente : listaPacientes) {
            JLabel nombreLabel = new JLabel(paciente.getNombre());
            JLabel fechaNacimientoLabel = new JLabel(paciente.getFechaNacimiento());
            JLabel horarioCitaLabel = new JLabel(paciente.getHorarioCita());
            JLabel visitaLabel = new JLabel(paciente.getMotivoVisita());

            nombreLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            fechaNacimientoLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            horarioCitaLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            visitaLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));

            tablitaDatos.add(nombreLabel);
            tablitaDatos.add(fechaNacimientoLabel);
            tablitaDatos.add(horarioCitaLabel);
            tablitaDatos.add(visitaLabel);
        }

        // Agregar la tabla al panel principal
        panelPacientes.add(new JScrollPane(tablitaDatos), BorderLayout.CENTER);

        return panelPacientes;
    }
}
