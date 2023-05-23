/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package euclid;

/**
 *
 * @author SONY
 */
public class Euclid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ebob(1453,332));
    }

    public static double ebob(double a, double b) {

        while(true) {
            double reminder = a % b;
            double divition = a / b;
            System.out.printf("%.0f = %.0f * %.0f + %.0f \n", a, Math.floor(a / b), b, (a % b));

            if (reminder == 0) {
                break;
            }
            a = b;
            b = reminder;
        }
        return b;
    }
}
