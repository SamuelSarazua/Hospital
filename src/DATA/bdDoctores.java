package DATA;

import personalMedico.DoctorGeneral;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class bdDoctores {


    public static ArrayList ListaDoctores(){
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Jose Garcia", "Doctor General", 30, 12345678, "jose@gmail.com", "jose123"));
        doctores.add(new DoctorGeneral("Maria Lopez", "Cardióloga", 35, 13572468, "maria@gmail.com", "maria123"));
        doctores.add(new DoctorGeneral("Carlos Martinez", "Pediatra", 40, 12567834, "carlos@gmail.com", "carlos123"));
        doctores.add(new DoctorGeneral("Ana Rodriguez", "Neuróloga", 45, 3215154, "ana@gmail.com", "ana123"));
        doctores.add(new DoctorGeneral("Luis Hernandez", "Dermatólogo", 50, 90876543, "luis@gmail.com", "luis123"));
        doctores.add(new DoctorGeneral("Laura Gonzalez", "Ginecóloga", 32, 12321165, "laura@gmail.com", "laura123"));
        doctores.add(new DoctorGeneral("Miguel Perez", "Traumatólogo", 37, 17417365, "miguel@gmail.com", "miguel123"));
        doctores.add(new DoctorGeneral("Elena Sanchez", "Oncóloga", 42, 23415763, "elena@gmail.com", "elena123"));
        doctores.add(new DoctorGeneral("Juan Ramirez", "Gastroenterólogo", 47, 50537142, "juan@gmail.com", "juan123"));
        doctores.add(new DoctorGeneral("Sofia Torres", "Psiquiatra", 29, 43251423, "sofia@gmail.com", "sofia123"));

        return doctores;

    }
}
