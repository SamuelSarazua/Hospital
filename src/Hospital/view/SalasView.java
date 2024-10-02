package Hospital.view;

import Hospital.Service.bdSalas;
import Hospital.model.Salas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SalasView extends JPanel {

    public SalasView() {
        this.setLayout(new GridLayout(4, 4, 10, 10));
        this.setBackground(Color.LIGHT_GRAY);

        ArrayList<Salas> listaSalas = bdSalas.ListaSalas();

        for (Salas sala : listaSalas) {
            JPanel salaPanel = new JPanel();
            salaPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            salaPanel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;


            // Se le agrega el color segun el estado
            switch (sala.getEstado().toLowerCase()) {
                case "disponible":
                    salaPanel.setBackground(Color.GREEN);
                    break;
                case "en uso":
                    salaPanel.setBackground(Color.YELLOW);
                    break;
                case "fuera de servicio":
                    salaPanel.setBackground(Color.RED);
                    break;
            }

            JLabel salaLabel = new JLabel(sala.getNombre());
            salaLabel.setForeground(Color.BLACK);
            salaPanel.add(salaLabel);

            this.add(salaPanel);
        }
    }
}
