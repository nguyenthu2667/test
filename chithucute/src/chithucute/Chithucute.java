/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chithucute;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Chithucute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhap so :");
        int n = sc.nextInt();
        System.out.printf("%d = %s", n, Integer.toBinaryString(n).toUpperCase());
    }
    
}
