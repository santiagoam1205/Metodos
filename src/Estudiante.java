public class Estudiante {

    double nota;

    public void mostrarboletin(){
        System.out.println("Nota del estudiante: " + this.nota);
    }

    public static double notas(double n1, double n2){
        if (n1 > n2){
            return n1;
        } else {
            return n2;
        }
    }
}
