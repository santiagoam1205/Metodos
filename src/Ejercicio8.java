import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static int[] generarTablaMultiplicar(int numero) {

        int[] tabla = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        int[] tabla = generarTablaMultiplicar(numero);

        String resultado = "";

        for (int i = 0; i < tabla.length; i++) {

            resultado += numero + " x " + (i + 1) + " = " + tabla[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
