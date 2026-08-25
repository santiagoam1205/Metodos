import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static double calcularPromedioClase(double[] calificaciones) {

        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public static void main(String[] args) {

        int cantidad = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Cuántas calificaciones va a ingresar?")
        );

        double[] calificaciones = new double[cantidad];

        for (int i = 0; i < calificaciones.length; i++) {

            calificaciones[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese la calificación " + (i + 1) + ":")
            );
        }

        double promedio = calcularPromedioClase(calificaciones);

        JOptionPane.showMessageDialog(null, "El promedio de la clase es: " + promedio);
    }
}
