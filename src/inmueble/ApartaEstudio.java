
package inmueble;
public class ApartaEstudio extends Apartamento {
    protected  static double valorArea=1500000;
    public ApartaEstudio(int identificadorInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños) {
        super(identificadorInmobiliario, Area, direccion, 1, 1);

    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}