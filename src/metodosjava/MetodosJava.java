/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosjava;

/**
 *
 * @author Walter Galdamez
 */
class MiClase{
    //Creamos un metodo de tipo int con el nombre miMetodo con dos argumentos de tipo int a y b y un return que devolvera la suma de a y b
    int miMetodo(int a, int b){
        return a+b;
    }
}
//Una clase public para poder ejecutar el codigo java con un metodo main
public class MetodosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos el objeto MiObjeto del tipo MiClase 
        MiClase MiObjeto = new MiClase();
        //declaramos una varible llamada resultado intanciando el metodo miMetodo y le pasamos como parametro 5 y 4
        int resultado = MiObjeto.miMetodo(5,4);
        //Imprimimos el resultado
        System.out.println("El Resultado es: "+resultado);    
    }    
}
