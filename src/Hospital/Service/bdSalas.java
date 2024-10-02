package Hospital.Service;

import Hospital.model.Salas;

import java.util.ArrayList;

public class bdSalas {

    public static ArrayList ListaSalas(){
        ArrayList<Salas> salas = new ArrayList<>();
        salas.add(new Salas("Sala de Emergencias", "Disponible"));
        salas.add(new Salas("Sala de Operaciones 1", "En Uso"));
        salas.add(new Salas("Sala de Operaciones 2", "Fuera de Servicio"));
        salas.add(new Salas("Sala de Cuidados Intensivos", "En Uso"));
        salas.add(new Salas("Sala de Recuperación", "Disponible"));
        salas.add(new Salas("Sala de Maternidad", "Fuera de Servicio"));
        salas.add(new Salas("Sala de Neonatología", "En Uso"));
        salas.add(new Salas("Sala de Radiología", "Disponible"));
        salas.add(new Salas("Sala de Quimioterapia", "En Uso"));
        salas.add(new Salas("Sala de Consulta Externa", "Fuera de Servicio"));
        salas.add(new Salas("Sala de Terapia Física", "Disponible"));
        salas.add(new Salas("Sala de Endoscopia", "Fuera de Servicio"));

        return salas;
    }

}
