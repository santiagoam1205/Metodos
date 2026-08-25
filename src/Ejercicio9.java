import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static String clasificarNota(double nota) {

        if (nota < 3.0) {
            return "Reprobado";

        } else if (nota < 4.5) {
            return "Aprobado";

        } else {
            return "Excelente";
        }
    }

    public static void main(String[] args) {

        double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota:"));

        String resultado = clasificarNota(nota);

        JOptionPane.showMessageDialog(null, "Clasificación: " + resultado);
    }
}
