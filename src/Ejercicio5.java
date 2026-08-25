import javax.swing.*;

public class Ejercicio5 {

    public static double calcularpromedio(double nota1, double nota2){

        return (nota1 + nota2) / 2;
    }
    public static double calcularpromedio(double[] notas){

        double suma=0;

        for(int i=0;i<notas.length;++i){

            suma+= notas[i];
        }

        return suma/notas.length;

    }

    static void main(String[] args) {

        double nota1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese una nota: "));
        double nota2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese otra nota: "));

        //se utiliza el primer metodo
        double promedio2 = calcularpromedio(nota1,nota2);

        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio2);

        //cantidad de notas
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas desea agregar? "));

        //se crea el arreglo
        double[] notas= new double[cantidad];

        //se pide las notas
        for(int i=0;i<notas.length;++i){

            notas[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese una nota: " + (i + 1) + ":"));
        }

        //se utiliza el segundo metodo
        double arreglo= calcularpromedio(notas);

        JOptionPane.showMessageDialog(null, "El promedio es: " + arreglo);


    }

}
