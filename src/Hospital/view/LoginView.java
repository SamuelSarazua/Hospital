package Hospital.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class LoginView extends JFrame {

        //OBJETOS GLOBALES
        private JTextField usuario ;
        private JPasswordField contra ;
        private JButton boton;

        public LoginView() {

                //CONFIGURACIÓN DE LA VENTANA
                this.setSize(500, 600);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana

                // Estilo de la interfaz
                UIManager.put("Label.font", new Font("Arial", Font.BOLD, 22));
                UIManager.put("Button.font", new Font("Arial", Font.BOLD, 20));
                UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 20));
                UIManager.put("TextArea.font", new Font("Arial", Font.PLAIN, 20));
                UIManager.put("List.font", new Font("Arial", Font.PLAIN, 20));

                //PANEL INICIAL
                JPanel mainPanel = new JPanel(new GridLayout(1, 1));

                //SEGUNDO PANEL
                JPanel panel2 = new JPanel(new GridBagLayout());

                //RESTRICCIONES
                GridBagConstraints restricciones = new GridBagConstraints();
                restricciones.insets = new Insets(15, 10, 15, 10);  // Agregar espacio entre los componentes
                restricciones.gridx = 0;
                restricciones.gridy = 0;

                JLabel correoLabel = new JLabel("Usuario:");
                panel2.add(correoLabel, restricciones);

                restricciones.gridx = 0;
                restricciones.gridy = 1;

                usuario = new JTextField();
                restricciones.gridx = 1;
                restricciones.gridy = 0;
                usuario.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK)); // Líneas inferiores negras
                usuario.setPreferredSize(new Dimension(150, 30));
                panel2.add(usuario, restricciones);

                restricciones.gridx = 0;
                restricciones.gridy = 2;
                JLabel contraLabel = new JLabel("Contraseña:");
                panel2.add(contraLabel, restricciones);

                restricciones.gridx = 1;
                restricciones.gridy = 2;
                contra = new JPasswordField();
                contra.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK)); // Líneas inferiores negras
                contra.setPreferredSize(new Dimension(150, 30));
                panel2.add(contra, restricciones);

                restricciones.gridx = 1;
                restricciones.gridy = 4;
                boton = new JButton("Iniciar Sesión");
                boton.setBackground(new Color(116, 116, 116));
                boton.setForeground(new Color(255, 255, 255));
                panel2.add(boton, restricciones);


                mainPanel.add(panel2);

                this.add(mainPanel);
                this.setVisible(true);
        }

        public String getCOrreo() {
                return usuario.getText();
        }

        public String getContra() {
                return new String(contra.getPassword());
        }

        public void addLoginListener(ActionListener Listener) {
                boton.addActionListener(Listener);        }

}