import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public Login() {

            this.setSize(1600, 1000);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana

            JPanel mainPanel = new JPanel(new GridLayout(1, 2));


            JPanel panel1 = new JPanel();

            JPanel panel2 = new JPanel();
            panel2.setLayout(null); // Layout manual para personalizar la posición de los componentes

            JLabel correoLabel = new JLabel("Correo:");
            correoLabel.setBounds(100, 368, 500, 30);
            panel2.add(correoLabel);

            JTextField correo = new JTextField();
            correo.setBounds(100, 390, 500, 30);
            panel2.add(correo);

            JLabel contraLabel = new JLabel("Contraseña:");
            contraLabel.setBounds(100, 437, 500, 30);
            panel2.add(contraLabel);

            JTextField contra = new JTextField();
            contra.setBounds(100, 460, 500, 30);
            panel2.add(contra);

            JButton boton = new JButton("Inicia Seción");
            boton.setBounds(400,530,200,50);
            panel2.add(boton);

            mainPanel.add(panel1);
            mainPanel.add(panel2);

            this.add(mainPanel);
            this.setVisible(true);
        }
    }





