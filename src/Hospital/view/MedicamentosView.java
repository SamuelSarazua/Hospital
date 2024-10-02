package Hospital.view;

import Hospital.model.Medicamento;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MedicamentosView {
    private ArrayList<Medicamento> listaMedicamentos;

    public MedicamentosView(ArrayList<Medicamento> medicamentos) {
        this.listaMedicamentos = medicamentos;
    }

    public JPanel panelMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.listaMedicamentos = medicamentos;

        JPanel panelPacientes = new JPanel();
        panelPacientes.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Listado de Medicamentos");
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPacientes.add(titulo, BorderLayout.NORTH);

        JPanel tablitaDatos = new JPanel();
        tablitaDatos.setLayout(new GridLayout(0, 9));

        String[] datos = {"NOMBRE", "FORMA-FARMACEUTICA", "DOSIS", "PRINCIPIO-ACTIVO", "FECHA-CADUCIDAD", "NUMERO-LOTE", "PRECIO", "INDICACIONES", "CONTRAINDICACIONES"};

        for (String datosP : datos) {
            JLabel datosLabel = new JLabel(datosP);
            datosLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            tablitaDatos.add(datosLabel);
        }

        for (Medicamento medicamento : listaMedicamentos) {
            JLabel nombreLabel = new JLabel(medicamento.getNombre());
            JLabel formaFarmaceutica = new JLabel(medicamento.getFormaFarmaceutica());
            JLabel dosis = new JLabel(medicamento.getDosis());
            JLabel principioActivo = new JLabel(medicamento.getPrincipioActivo());
            JLabel fechaCaducidad = new JLabel(medicamento.getFechaCaducidad().toString());
            JLabel numeroLote = new JLabel(medicamento.getNumeroLote());
            JLabel precio = new JLabel(String.valueOf(medicamento.getPrecio()));
            JLabel indicaciones = new JLabel(medicamento.getIndicaciones());
            JLabel contraindicaciones = new JLabel(medicamento.getContraindicaciones());


            nombreLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            formaFarmaceutica.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            dosis.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            principioActivo.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            fechaCaducidad.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            numeroLote.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            precio.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            indicaciones.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
            contraindicaciones.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));

            tablitaDatos.add(nombreLabel);
            tablitaDatos.add(formaFarmaceutica);
            tablitaDatos.add(dosis);
            tablitaDatos.add(principioActivo);
            tablitaDatos.add(fechaCaducidad);
            tablitaDatos.add(numeroLote);
            tablitaDatos.add(precio);
            tablitaDatos.add(indicaciones);
            tablitaDatos.add(contraindicaciones);

        }

        // Agregar la tabla al panel principal
        panelPacientes.add(new JScrollPane(tablitaDatos), BorderLayout.CENTER);

        return panelPacientes;
    }
}