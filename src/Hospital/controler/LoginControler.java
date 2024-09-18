package Hospital.controler;

import backEnde.BackEnde;
import Hospital.view.LoginView;

import java.util.HashMap;

public class LoginControler {

    private LoginView loginView;


    public LoginControler(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> controlDelLogin());
    }

    private void controlDelLogin() {
        String correo = loginView.getCOrreo();
        String contra = loginView.getContra();

        // Valida los datos usando la clase BackEnde
        BackEnde consultaLogin = new BackEnde();
        HashMap<String, String> resultado = consultaLogin.validarDatos(correo, contra);

        // Imprime el resultado en la consola
        if (resultado.containsKey("Error")) {
            System.out.println(resultado.get("Error"));
        } else {
            System.out.println("Nombre: " + resultado.get("Nombre"));
            System.out.println("Especialidad: " + resultado.get("Especialidad"));
            System.out.println("Edad: " + resultado.get("Edad"));
            System.out.println("Telefono: " + resultado.get("Telefono"));
            System.out.println("Email: " + resultado.get("Email"));
        }

    }
}
