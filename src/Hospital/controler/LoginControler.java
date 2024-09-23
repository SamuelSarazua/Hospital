package Hospital.controler;

import backEnde.BackEnde;
import Hospital.view.DoctorView;
import Hospital.view.LoginView;

import java.util.HashMap;

public class LoginControler {

    private LoginView loginView;

    public LoginControler(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {
        String correo = loginView.getCOrreo();
        String contra = loginView.getContra();

        // Valida los datos usando la clase BackEnde
        BackEnde consultaLogin = new BackEnde();
        HashMap<String, String> resultado = consultaLogin.validarDatos(correo, contra);

        // Verifica si hay un error en los resultados
        if (resultado.containsKey("Error")) {
            System.out.println(resultado.get("Error"));
        } else {
            loginView.dispose();
            new DoctorView(resultado);
        }
    }
}
