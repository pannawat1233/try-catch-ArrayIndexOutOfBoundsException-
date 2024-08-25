/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Mavenproject12 {

    public static void main(String[] args) {
        try {
            String[] index = new String[0];
            Scanner input = new Scanner(System.in);
            index[0] = input.nextLine();
            String name = index[0];
            System.out.println("Hello "+name);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Test");
        }
       
       
    }
}
