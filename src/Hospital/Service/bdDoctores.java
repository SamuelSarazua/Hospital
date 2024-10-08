package Hospital.Service;

import Hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class bdDoctores {


    public static ArrayList ListaDoctores(){
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Jose Garcia", "Doctor General", "30", "1234-5678", "jose@gmail.com", "jose123"));
        doctores.add(new DoctorGeneral("Maria Lopez", "Cardióloga", "35", "1357-2468", "maria@gmail.com", "maria123"));
        doctores.add(new DoctorGeneral("Carlos Martinez", "Pediatra", "40", "1256-7834", "carlos@gmail.com", "carlos123"));
        doctores.add(new DoctorGeneral("Ana Rodriguez", "Neuróloga", "45", "3212-5154", "ana@gmail.com", "ana123"));
        doctores.add(new DoctorGeneral("Luis Hernandez", "Dermatólogo", "50", "9087-6543", "luis@gmail.com", "luis123"));
        doctores.add(new DoctorGeneral("Laura Gonzalez", "Ginecóloga", "32", "1232-1165", "laura@gmail.com", "laura123"));
        doctores.add(new DoctorGeneral("Miguel Perez", "Traumatólogo", "37", "1741-7365", "miguel@gmail.com", "miguel123"));
        doctores.add(new DoctorGeneral("Elena Sanchez", "Oncóloga", "42", "2341-5763", "elena@gmail.com", "elena123"));
        doctores.add(new DoctorGeneral("Juan Ramirez", "Gastroenterólogo", "47", "5053-7142", "juan@gmail.com", "juan123"));
        doctores.add(new DoctorGeneral("Sofia Torres", "Psiquiatra", "29", "4325-1423", "sofia@gmail.com", "sofia123"));

        return doctores;

    }
}
