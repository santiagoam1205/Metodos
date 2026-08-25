import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double nota1 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese la nota del estudiante 1:"
                )
        );

        double nota2 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese la nota del estudiante 2:"
                )
        );

        // Crear los estudiantes
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        // Asignar las notas
        estudiante1.nota = nota1;
        estudiante2.nota = nota2;

        // Mostrar boletines
        estudiante1.mostrarboletin();
        estudiante2.mostrarboletin();

        // Comparar notas
        double mayor = Estudiante.notas(nota1, nota2);

        JOptionPane.showMessageDialog(
                null,
                "La nota mayor es: " + mayor
        );
    }
}