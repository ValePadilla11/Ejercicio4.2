package inmueble;

public class Casa extends  InmuebleVivienda{
        protected  int numeroPisos;
        public Casa(int identificarInmobiliario,int Area,String direccion,int numerohabitaciones, int numerobaños, int numeroPisos){
            super(identificarInmobiliario,Area,direccion,numerohabitaciones,numerobaños);
            this.numeroPisos= numeroPisos;
        }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos="+numeroPisos);
    }
}
