package backEnde;

import Hospital.Service.bdDoctores;
import Hospital.model.DoctorGeneral;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {

    private ArrayList<DoctorGeneral> doctores;

    public BackEnde() {
        this.doctores = bdDoctores.ListaDoctores();
    }

    public HashMap<String, String> validarDatos(String correo, String contraseña) {
        HashMap<String, String> resultado = new HashMap<>();

        for (DoctorGeneral doctor : doctores) {
            if (doctor.getCorreo().equalsIgnoreCase(correo)) {
                if (doctor.getContra().equalsIgnoreCase(contraseña)) {
                    // Si la contraseña es correcta, se devuelven los datos del doctor
                    resultado.put("Nombre", doctor.getNombre());
                    resultado.put("Especialidad", doctor.getEspecialidad());
                    resultado.put("Edad", doctor.getEdad());
                    resultado.put("Telefono", doctor.getTelefono());
                    resultado.put("Email", doctor.getCorreo());
                    return resultado; // Salir del bucle una vez que se haya encontrado el usuario
                } else {
                    // Contraseña incorrecta
                    resultado.put("Error", "Contraseña incorrecta");
                    return resultado;
                }
            }
        }
        // Usuario no encontrado
        resultado.put("Error", "Usuario no encontrado");
        return resultado;
    }
}
