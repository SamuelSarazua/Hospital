package Hospital.Service;

import Hospital.model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;

public class bdMedicamento {

    public static ArrayList listaMedicamentos() {
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento("Paracetamol", "Tableta", "500mg", "Paracetamol",
                LocalDate.of(2024, 6, 15), "B67890", 2.50, "Analgésico y antipirético", "Problemas hepáticos"));

        medicamentos.add(new Medicamento("Amoxicilina", "Cápsula", "500mg", "Amoxicilina",
                LocalDate.of(2026, 1, 20), "C11111", 12.99, "Infecciones bacterianas", "Alergia a penicilinas"));

        medicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol",
                LocalDate.of(2023, 11, 10), "D22222", 7.49, "Protector gástrico", "No usar en lactancia"));

        medicamentos.add(new Medicamento("Aspirina", "Comprimido", "100mg", "Ácido acetilsalicílico",
                LocalDate.of(2025, 9, 5), "E33333", 1.99, "Analgésico y antipirético", "Problemas de coagulación"));

        medicamentos.add(new Medicamento("Loratadina", "Tableta", "10mg", "Loratadina",
                LocalDate.of(2024, 4, 20), "F44444", 3.75, "Alergias", "No usar en embarazo"));

        medicamentos.add(new Medicamento("Metformina", "Tableta", "850mg", "Metformina",
                LocalDate.of(2027, 3, 14), "G55555", 4.99, "Diabetes tipo 2", "Problemas renales"));

        medicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100mcg", "Salbutamol",
                LocalDate.of(2026, 7, 22), "H66666", 15.99, "Asma", "No usar en enfermedades cardíacas"));

        medicamentos.add(new Medicamento("Atorvastatina", "Tableta", "40mg", "Atorvastatina",
                LocalDate.of(2025, 10, 30), "I77777", 8.50, "Colesterol alto", "Enfermedades hepáticas"));

        medicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril",
                LocalDate.of(2026, 8, 18), "J88888", 6.99, "Hipertensión", "No usar en embarazo"));

        medicamentos.add(new Medicamento("Levotiroxina", "Tableta", "50mcg", "Levotiroxina",
                LocalDate.of(2023, 12, 1), "K99999", 2.25, "Hipotiroidismo", "Problemas cardíacos"));

        medicamentos.add(new Medicamento("Ranitidina", "Tableta", "150mg", "Ranitidina",
                LocalDate.of(2025, 2, 17), "L10101", 4.00, "Reflujo gástrico", "Suspensión por efectos secundarios"));

        medicamentos.add(new Medicamento("Diclofenaco", "Comprimido", "50mg", "Diclofenaco",
                LocalDate.of(2024, 11, 25), "M20202", 3.49, "Antiinflamatorio", "Problemas gástricos"));

        medicamentos.add(new Medicamento("Furosemida", "Tableta", "40mg", "Furosemida",
                LocalDate.of(2023, 10, 15), "N30303", 5.00, "Diurético", "Problemas renales"));

        medicamentos.add(new Medicamento("Ciprofloxacino", "Tableta", "500mg", "Ciprofloxacino",
                LocalDate.of(2026, 5, 9), "O40404", 9.75, "Infecciones bacterianas", "Problemas tendinosos"));

        medicamentos.add(new Medicamento("Losartán", "Tableta", "50mg", "Losartán",
                LocalDate.of(2027, 12, 13), "P50505", 7.80, "Hipertensión", "Problemas renales"));

        medicamentos.add(new Medicamento("Cetirizina", "Tableta", "10mg", "Cetirizina",
                LocalDate.of(2025, 6, 19), "Q60606", 4.20, "Alergias", "Somnolencia"));

        medicamentos.add(new Medicamento("Insulina", "Inyección", "100UI/ml", "Insulina",
                LocalDate.of(2024, 3, 7), "R70707", 25.99, "Diabetes tipo 1", "Hipoglucemia"));

        medicamentos.add(new Medicamento("Warfarina", "Tableta", "5mg", "Warfarina",
                LocalDate.of(2023, 9, 22), "S80808", 12.50, "Anticoagulante", "Problemas de sangrado"));

        medicamentos.add(new Medicamento("Clopidogrel", "Tableta", "75mg", "Clopidogrel",
                LocalDate.of(2025, 8, 11), "T90909", 10.99, "Prevención de coágulos", "Riesgo de sangrado"));

        medicamentos.add(new Medicamento("Tramadol", "Cápsula", "50mg", "Tramadol",
                LocalDate.of(2024, 12, 30), "U101010", 14.99, "Dolor moderado a severo", "No usar en epilepsia"));

        medicamentos.add(new Medicamento("Prednisona", "Tableta", "5mg", "Prednisona",
                LocalDate.of(2025, 7, 23), "V111111", 6.50, "Inflamación y alergias", "Problemas inmunológicos"));

        medicamentos.add(new Medicamento("Azitromicina", "Tableta", "500mg", "Azitromicina",
                LocalDate.of(2026, 1, 19), "W121212", 11.00, "Infecciones bacterianas", "Problemas hepáticos"));

        medicamentos.add(new Medicamento("Tamsulosina", "Tableta", "0.4mg", "Tamsulosina",
                LocalDate.of(2027, 3, 25), "X131313", 9.50, "Hiperplasia prostática", "Hipotensión"));

        medicamentos.add(new Medicamento("Esomeprazol", "Cápsula", "40mg", "Esomeprazol",
                LocalDate.of(2025, 5, 20), "Y141414", 8.90, "Reflujo gástrico", "Problemas hepáticos"));

        medicamentos.add(new Medicamento("Rosuvastatina", "Tableta", "20mg", "Rosuvastatina",
                LocalDate.of(2026, 8, 11), "Z151515", 12.80, "Colesterol alto", "Problemas hepáticos"));

        medicamentos.add(new Medicamento("Amlodipino", "Tableta", "10mg", "Amlodipino",
                LocalDate.of(2024, 10, 3), "A161616", 5.40, "Hipertensión", "Edema periférico"));

        medicamentos.add(new Medicamento("Bisoprolol", "Tableta", "5mg", "Bisoprolol",
                LocalDate.of(2025, 4, 29), "B171717", 7.30, "Insuficiencia cardíaca", "Bradicardia"));

        medicamentos.add(new Medicamento("Fluconazol", "Cápsula", "150mg", "Fluconazol",
                LocalDate.of(2023, 12, 18), "C181818", 10.50, "Infecciones por hongos", "Problemas hepáticos"));

        medicamentos.add(new Medicamento("Montelukast", "Tableta", "10mg", "Montelukast",
                LocalDate.of(2025, 9, 13), "D191919", 9.00, "Asma y alergias", "Problemas psicológicos"));

        medicamentos.add(new Medicamento("Meloxicam", "Comprimido", "15mg", "Meloxicam",
                LocalDate.of(2024, 5, 16), "E202020", 6.25, "Dolor e inflamación", "Problemas gástricos"));

        medicamentos.add(new Medicamento("Alprazolam", "Comprimido", "0.5mg", "Alprazolam",
                LocalDate.of(2026, 6, 21), "F212121", 4.10, "Ansiedad", "Dependencia"));

        medicamentos.add(new Medicamento("Candesartán", "Tableta", "8mg", "Candesartán",
                LocalDate.of(2027, 7, 14), "G222222", 8.60, "Hipertensión", "No usar en embarazo"));

        medicamentos.add(new Medicamento("Levofloxacino", "Tableta", "500mg", "Levofloxacino",
                LocalDate.of(2023, 11, 7), "H232323", 15.75, "Infecciones bacterianas", "Problemas tendinosos"));

        medicamentos.add(new Medicamento("Sertralina", "Comprimido", "50mg", "Sertralina",
                LocalDate.of(2024, 3, 28), "I242424", 12.45, "Depresión y ansiedad", "Efectos secundarios psicológicos"));

        medicamentos.add(new Medicamento("Dexametasona", "Inyección", "4mg/ml", "Dexametasona",
                LocalDate.of(2026, 9, 9), "J252525", 13.99, "Inflamación y alergias severas", "Problemas inmunológicos"));

        medicamentos.add(new Medicamento("Carbamazepina", "Tableta", "200mg", "Carbamazepina",
                LocalDate.of(2025, 2, 5), "K262626", 8.20, "Epilepsia", "Problemas hepáticos"));

        medicamentos.add(new Medicamento("Folic Acid", "Tableta", "5mg", "Ácido fólico",
                LocalDate.of(2027, 1, 12), "L272727", 3.90, "Deficiencia de ácido fólico", "Sobredosis"));

        medicamentos.add(new Medicamento("Betametasona", "Inyección", "4mg/ml", "Betametasona",
                LocalDate.of(2025, 11, 26), "M282828", 14.75, "Inflamación", "Inmunosupresión"));

        medicamentos.add(new Medicamento("Hidroxicloroquina", "Tableta", "200mg", "Hidroxicloroquina",
                LocalDate.of(2024, 12, 15), "N292929", 11.30, "Malaria y artritis", "Problemas de visión"));

        return medicamentos;

    }

}
