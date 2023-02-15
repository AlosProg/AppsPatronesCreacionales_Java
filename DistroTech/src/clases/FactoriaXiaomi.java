
package clases;

/*Clase que implementará los métodos de la clase interfaz FactoriaDispositivos
haciendo pedidos solo de productos Xiaomi
 */
public class FactoriaXiaomi implements FactoriaDispositivos{

    @Override
    public Movil crearPedidoMovil() {
        return new MovilXiaomi();
    }

    @Override
    public Reloj crearPedidoReloj() {
        return new RelojXiaomi();
    }
}

