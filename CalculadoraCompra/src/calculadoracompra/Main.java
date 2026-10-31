/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoracompra;

/**
 *
 * @author rmimm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculadoraCompra calc = new CalculadoraCompra();

        double resultado = calc.calcularTotal(10.0, 1);

        System.out.println("Valor total da compra: R$ " + resultado);
    }
}
