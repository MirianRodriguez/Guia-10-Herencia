/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje02;

import java.util.Locale;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, Double peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        super.crearElectrodomestico();
        System.out.print("Ingrese capacidad de carga: ");
        this.carga = leer.nextInt();
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.*/
    @Override
    public void precioFinal() {
        
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "carga=" + carga + '}';
    }
    
    

}
