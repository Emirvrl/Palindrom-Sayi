/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

/**
 *
 * @author EmirV
 */
public class Palindromsayi {

    static boolean ispalindrom(int number) {
        int temp = number, lastnumber, reversenumber = 0;
        System.out.println("Girilen Değer " + number);
        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }

        if (number == reversenumber) 
            return true;
         else 
            return false;
    }

    public static void main(String[] args) {
        System.out.println(ispalindrom(145541));
    }

}
