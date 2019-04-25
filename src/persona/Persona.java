/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.util.Scanner;
/**
 *
 * @author ana_b
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inserte cuantos compnentes trendrá a lista: \n");
        Scanner s = new Scanner(System.in);
        Scanner Ss = new Scanner(System.in);
        //creo todas las variantes
        String nombre, apellidos, sexo;
        int edad;
        double peso, estatura;
        int comp= s.nextInt();
        
        System.out.println("DATOS DEL INDIVIDUO\n");
        individuo[] array = new individuo[comp];
        for (int i=0; i<comp;i++){
            
            System.out.println("Nombre: ");
            nombre= s.nextLine();
            System.out.println("Apellidos: ");
            apellidos= s.nextLine();
            System.out.println("Sexo: ");
            sexo= s.nextLine();
            System.out.println("Edad: ");
            edad= Ss.nextInt();
            System.out.println("Peso: ");
            peso= Ss.nextDouble();
            System.out.println("Altura: ");
            estatura= Ss.nextDouble();
            array [i]= new individuo(nombre,apellidos,sexo,edad,estatura,peso);
            
        }
        for (int i = 0; i<comp; i++){
            System.out.println(array[i].getNombre());
            switch (individuo.CalcularIMC(array[i].getEstatura(), array[i].getPeso())){
                case 1 :
                    System.out.println("Está por debajo de su peso. ");
                break;
                case 2 :
                    System.out.println("Está en su peso ideal. ");
                break;
                case 3 :
                    System.out.println("Está por encima de su peso. ");
                break;
                default :
                    System.out.println("Se ha producido un error. ");
                break;
            }
            
            switch (individuo.ComprobarSexo(array[i].getSexo())){
                case "Error":
                    System.out.println("El campo sexo tiene un error");
                default:
                    System.out.println("ok");
                    break;
                    
            }
            if (individuo.MayorEdad(array[i].getEdad())){
                    System.out.println("Es mayor de edad.");
                }else {
                    System.out.println("No es mayor de edad.");
            }
                    
        }
    }
}
