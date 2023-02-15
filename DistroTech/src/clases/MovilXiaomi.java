
package clases;

/*Esta clase hereda de clase abstracta Movil e implementa su método
 */
public class MovilXiaomi extends Movil{
    private final String nombre = "Movil Xiaomi MX";
    private final int precio = 300;
    @Override
    public void mostrarPedido() {
        System.out.println("El nombre del movil es: " + nombre + " y su valor es de: " + precio + " Euros");
    }
}
