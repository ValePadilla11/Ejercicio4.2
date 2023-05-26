
package inmueble;
public class Apartamento extends InmuebleVivienda{

    public Apartamento(int identificadorInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños) {
        super(identificadorInmobiliario, Area, direccion, numerohabitaciones, numerobaños);
        }

    @Override
    void imprimir() {
        super.imprimir();
    }
}