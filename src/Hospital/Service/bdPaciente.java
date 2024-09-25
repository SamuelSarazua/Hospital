package Hospital.Service;

import Hospital.model.Pacientes;

import java.util.ArrayList;

public class bdPaciente {

    public static ArrayList listaPacientes(){
        ArrayList<Pacientes> pacientes = new ArrayList<>();
        pacientes.add(new Pacientes("Isabel Méndez", "isabel.mendez@hotmail.com", "555-3456", "Calle 8", "1993-07-18", "08:00 AM", "Consulta de seguimiento", "2", "Dr. Martínez"));
        pacientes.add(new Pacientes("Patricia León", "patricia.leon@gmail.com", "555-6781", "Calle 16", "1993-08-15", "08:30 AM", "Consulta de seguimiento", "3", "Dr. Martínez"));
        pacientes.add(new Pacientes("Andrés Vega", "andres.vega@gmail.com", "555-9988", "Calle 11", "1988-06-22", "09:00 AM", "Chequeo general", "4", "Dr. Garcia"));
        pacientes.add(new Pacientes("Carlos García", "carlos.garcia@hotmail.com", "555-8765", "Calle 3", "1978-11-20", "09:30 AM", "Examen físico", "7", "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Juan Pérez", "juan.perez@gmail.com", "555-1234", "Calle 1", "1985-02-10", "10:00 AM", "Chequeo general", "5", "Dr. Hernandez"));
        pacientes.add(new Pacientes("Francisco Ramírez", "francisco.ramirez@yahoo.com", "555-7789", "Calle 18", "1980-11-09", "10:00 AM", "Consulta de control", "6", "Dr. Gonzalez"));
        pacientes.add(new Pacientes("Verónica Chávez", "veronica.chavez@yahoo.com", "555-7645", "Calle 12", "1981-10-30", "10:30 AM", "Consulta de control", "6", "Dr. Rodríguez"));
        pacientes.add(new Pacientes("María López", "maria.lopez@yahoo.com", "555-5678", "Calle 2", "1990-06-15", "11:00 AM", "Consulta de seguimiento", "3", "Dr. Martínez"));
        pacientes.add(new Pacientes("Sofía Herrera", "sofia.herrera@outlook.com", "555-9876", "Calle 10", "1997-05-25", "11:30 AM", "Revisión anual", "3", "Dr. López"));
        pacientes.add(new Pacientes("Daniela González", "daniela.gonzalez@gmail.com", "555-9898", "Calle 17", "1996-01-10", "12:00 PM", "Examen físico", "2", "Dr. Martínez"));
        pacientes.add(new Pacientes("Miguel Díaz", "miguel.diaz@gmail.com", "555-6789", "Calle 9", "1976-02-02", "12:30 PM", "Examen físico", "8", "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Luis Ramírez", "luis.ramirez@gmail.com", "555-4321", "Calle 5", "1982-09-05", "02:00 PM", "Consulta de control", "4", "Dr. Martínez"));
        pacientes.add(new Pacientes("Claudia Ríos", "claudia.rios@outlook.com", "555-4322", "Calle 19", "1987-09-23", "02:30 PM", "Chequeo general", "5", "Dr. López"));
        pacientes.add(new Pacientes("Ana Torres", "ana.torres@outlook.com", "555-6543", "Calle 4", "1995-03-25", "01:00 PM", "Revisión anual", "2", "Dr. López"));
        pacientes.add(new Pacientes("Rafael Torres", "rafael.torres@hotmail.com", "555-4821", "Calle 13", "1992-12-12", "01:30 PM", "Evaluación médica", "3", "Dr. López"));
        pacientes.add(new Pacientes("Gloria Ortiz", "gloria.ortiz@gmail.com", "555-2398", "Calle 14", "1990-02-18", "03:00 PM", "Revisión anual", "5", "Dr. Martínez"));
        pacientes.add(new Pacientes("Laura Fernández", "laura.fernandez@gmail.com", "555-2134", "Calle 6", "1991-12-30", "03:30 PM", "Evaluación médica", "6", "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Pedro Sánchez", "pedro.sanchez@yahoo.com", "555-5432", "Calle 7", "1986-04-14", "04:00 PM", "Chequeo general", "5", "Dr. López"));
        pacientes.add(new Pacientes("Alejandro Castillo", "alejandro.castillo@hotmail.com", "555-1123", "Calle 15", "1984-07-19", "04:30 PM", "Chequeo general", "4", "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Jose Pereira", "jose.pereira@hotmail.com", "655-1193", "Calle 15", "1984-07-19", "04:30 PM", "Chequeo mensual", "1", "Dr. Martínez"));

        return pacientes;
    }

}
