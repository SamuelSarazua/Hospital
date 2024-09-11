package Hospital.view;

import Hospital.model.DoctorGeneral;
import Hospital.Service.bdDoctores;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LoginView extends JFrame {
        public LoginView() {

                //CONFIGURACIÓN DE LA VENTANA
                this.setSize(1600, 1000);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana

                // Estilo de la interfaz
                UIManager.put("Label.font", new Font("Arial", Font.BOLD, 22));
                UIManager.put("Button.font", new Font("Arial", Font.BOLD, 20));
                UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 20));
                UIManager.put("TextArea.font", new Font("Arial", Font.PLAIN, 20));
                UIManager.put("List.font", new Font("Arial", Font.PLAIN, 20));

                //PANEL INICIAL
                JPanel mainPanel = new JPanel(new GridLayout(1, 2));

                //PANEL DEL BANNER
                JPanel panel1 = new JPanel(new GridBagLayout());

                ImageIcon urlImg = new ImageIcon(getClass().getResource("resources/logo3.jpg"));
                JLabel img = new JLabel();
                img.setIcon(urlImg);

                panel1.add(img);

                //SEGUNDO PANEL
                JPanel panel2 = new JPanel(new GridBagLayout());

                //RESTRICCIONES
                GridBagConstraints restricciones = new GridBagConstraints();
                restricciones.gridx = 0;
                restricciones.gridy = 0;
                restricciones.insets = new Insets(12, 12, 12, 12); // Espacio entre componentes

                JLabel correoLabel = new JLabel("Usuario:");
                panel2.add(correoLabel, restricciones);

                restricciones.gridx = 0;
                restricciones.gridy = 1;
                JTextField usuario = new JTextField();
                usuario.setPreferredSize(new Dimension(350, 40));
                panel2.add(usuario, restricciones);

                restricciones.gridx = 0;
                restricciones.gridy = 2;
                JLabel contraLabel = new JLabel("Contraseña:");
                panel2.add(contraLabel, restricciones);

                restricciones.gridx = 0;
                restricciones.gridy = 3;
                JPasswordField contra = new JPasswordField();
                contra.setPreferredSize(new Dimension(350, 40));
                panel2.add(contra, restricciones);

                restricciones.gridx = 0;
                restricciones.gridy = 4;
                JButton boton = new JButton("Iniciar Sesión");
                boton.setBackground(new Color(231, 108, 16));
                boton.setForeground(new Color(12, 73, 3));
                panel2.add(boton, restricciones);

                boton.addActionListener(e -> {
                        ArrayList<DoctorGeneral> dataDoctores = bdDoctores.ListaDoctores();

                        for (DoctorGeneral cadaDoctor : dataDoctores){
                                if (cadaDoctor.getCorreo().equalsIgnoreCase(usuario.getText())){
                                        if (cadaDoctor.getContra().equalsIgnoreCase(contra.getText())){
                                                DoctorGeneral a = new DoctorGeneral();
                                        }
                                }else{
                                        JLabel msgError = new JLabel("Correo no encontrado");
                                        msgError.setForeground(Color.RED);
                                        mainPanel.add(msgError);
                                }
                        }


                        mainPanel.revalidate();
                        mainPanel.repaint();
                });

                mainPanel.add(panel1);
                mainPanel.add(panel2);

                this.add(mainPanel);
                this.setVisible(true);
        }
}