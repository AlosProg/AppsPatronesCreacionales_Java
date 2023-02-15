
package clases;

/*Esta clase interfaz va a ser la Fábrica Abstracta recogiendo elementos de las clases abstractas Movil y Reloj
 */
public interface FactoriaDispositivos {
    public Movil crearPedidoMovil();
    public Reloj crearPedidoReloj();
}


