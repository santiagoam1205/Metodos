import javax.swing.*;

public class Ejercicio3 {
    public static double calculararea(double base, double altura){
        return base*altura;
    }

    static void main(String[] args) {
        double base= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));

        double altura= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));

        double area= calculararea(base,altura);

        JOptionPane.showMessageDialog(null,"El area del base es: "+area);
    }
}
