package Hospital.controler;
import Hospital.Service.bdPaciente;
import Hospital.Service.bdMedicamento;
import Hospital.model.Medicamento;
import Hospital.model.Pacientes;
import backEnde.BackEnde;
import Hospital.view.DoctorView;
import Hospital.view.LoginView;

import java.util.ArrayList;
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

        BackEnde consultaLogin = new BackEnde();
        HashMap<String, String> resultado = consultaLogin.validarDatos(correo, contra);

        if (resultado.containsKey("Error")) {
            System.out.println(resultado.get("Error"));
        } else {
            loginView.dispose();

            ArrayList<Pacientes> listaPacientes = bdPaciente.listaPacientes();
            ArrayList<Medicamento> listaMedicamentos = bdMedicamento.listaMedicamentos();

            new DoctorView(resultado, listaPacientes, listaMedicamentos);
        }
    }
}
