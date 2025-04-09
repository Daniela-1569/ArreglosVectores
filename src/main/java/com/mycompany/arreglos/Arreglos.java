/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;
import java.util.Scanner;
/**
 *
 * @author PC01
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                
         int[] notas = new int[10];
         int contRegular=0;
         int contBueno=0;
         int contExelente=0;
         int nota = 0;
         int aux = 0;
         
         while (aux < 10) {  
          System.out.println("ingresa las notas de los estudiantes ");
          nota = sc.nextInt();
           if (nota > 0 && nota <=10){
             notas[nota] = nota;
             aux++;
            }else {
             System.out.println("nota incorrecta");
            }
          
            
        }
        
        /*System.out.println("ingrese las notas de los estudiantes...");
        for (int i = 0; i < 10; i++) {
            notas [i] = sc.nextInt();
        }   
        for (int i = 0; i < 10; i++) {
            if (notas[i] > 0 && notas[i]<=6){
                contRegular = contRegular +1;
                //contRegular++;  
            } else if (notas[i] > 6 && notas[i]<=8){
                contBueno++;   
               }else if (notas[i] > 8 && notas[i]<=10){
                contExelente++;   
               }
        }   
          System.out.println("existen" + contRegular + "estudiantes con una calificacion de regular");
          System.out.println("existen" + contBueno + "estudiantes con una calificacion de regular");
          System.out.println("existen" + contExelente + "estudiantes con una calificacion de regular");*/
        }
         
         
    }

