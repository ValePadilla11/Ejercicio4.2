/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmueble;

public class Prueba {
    public static void main(String[] args) {
        ApartamentoFamiliar apto1 = new
                ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos Apartamento");
        apto1.calcularprecioventa(apto1.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        ApartaEstudio aptestudio1 = new
                ApartaEstudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularprecioventa(aptestudio1.valorArea);
        aptestudio1.imprimir();

    }

}