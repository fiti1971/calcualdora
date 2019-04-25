/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author ana_b
 */
public class individuo {
    
    private String nombre = "", apellidos = "", sexo = "";
    private double estatura = 0, peso = 0;
    private int edad;
    public  individuo (String nombre, String apellidos, String sexo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        
    }
    public individuo (String nombre, String apellidos, String sexo,int edad, double estatura, double peso){
            this.edad = edad;
            this.estatura = estatura;
            this.apellidos = apellidos;
            this.nombre = nombre;
            this.sexo = sexo;
            this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

  
   

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static int CalcularIMC (double estatura, double peso){
        double formula = peso/(Math.pow(estatura, 2));
        if (formula < 20){
            return 1;
        }else {
            if (formula >= 20 && formula <= 25){
                return 2;
            }else {
                if(formula > 25){
                    return 3;
                }else {
                    return 4;
                }
            }
        }
    }
    
    public static boolean MayorEdad (int edad){
        return edad >= 18;
    }
    
    public static String ComprobarSexo (String sexo){
        if (sexo.equals("hombre")||sexo.equals("mujer")){
        return sexo;
        }
        else{
        return "Error";
        } 
        
    }
    
    }
   
    

