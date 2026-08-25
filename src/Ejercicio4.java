import javax.swing.*;

public class Ejercicio4 {

    public static boolean par(int numero){
        return numero % 2 == 0;

    }

    static void main(String[] args) {

        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));

        boolean resultado= par(numero);

        if(resultado){
            JOptionPane.showMessageDialog(null,"El numero es par");

        }else {
            JOptionPane.showMessageDialog(null,"El numero no es par");
        }
    }
}
