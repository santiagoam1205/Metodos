import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio10 {

    public static void agregarProducto(
            ArrayList<Producto> productos,
            Producto producto) {

        productos.add(producto);
    }

    public static double calcularValorTotalInventario(
            ArrayList<Producto> productos) {

        double total = 0;

        for (int i = 0; i < productos.size(); i++) {

            total += productos.get(i).precio *
                    productos.get(i).cantidad;
        }

        return total;
    }

    public static void mostrarInventario(
            ArrayList<Producto> productos) {

        String resultado = "";

        for (int i = 0; i < productos.size(); i++) {

            Producto producto = productos.get(i);

            resultado += "Producto: " + producto.nombre + "\n";
            resultado += "Precio: $" + producto.precio + "\n";
            resultado += "Cantidad: " + producto.cantidad + "\n";
            resultado += "----------------------\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos desea ingresar?")
        );

        for (int i = 0; i < cantidadProductos; i++) {

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));

            Producto producto = new Producto(
                    nombre,
                    precio,
                    cantidad
            );

            agregarProducto(productos, producto);
        }

        mostrarInventario(productos);

        double total = calcularValorTotalInventario(productos);

        JOptionPane.showMessageDialog(null, "Valor total del inventario: $" + total);
    }
}