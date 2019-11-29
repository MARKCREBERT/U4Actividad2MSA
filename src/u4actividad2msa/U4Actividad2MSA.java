/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4actividad2msa;

import java.util.Random;

/**
 *
 * @author ciclost
 */
public class U4Actividad2MSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        U4Actividad2MSA programa = new U4Actividad2MSA();
        programa.inicio();
    }
    
    public void inicio() {
        
        paloAleatorioDominante();
        
        int [][] baraja = new int [4][12];
        
        repartirCartas(baraja, 1); // poniendo el 1, llamamos al jugador 1
        
        
        
        
    }
    
    public char paloAleatorioDominante() { 

       // creación aleatoria entre el 1 y 4, y cada número le correspondrá un palo
  
       int paloAleatorio = (int) (Math.random()*4)+49;  
       //char sirve para guardar los caracteres de la tabla ASCII
       char paloElegido = (char) paloAleatorio;
        
        
        if (paloElegido == '1') {
            
            System.out.println("Palo dominante => Bastos");
            
        } else if (paloElegido == '2') {
            
            System.out.println("Palo dominante => Espadas");
            
        } else if (paloElegido == '3') {
            
            System.out.println("Palo dominante => Oros");
            
        } else if (paloElegido == '4') {
            
            System.out.println("Palo dominante => Copas");
        }
        
        
       return paloElegido;

    }
  
    
    
    public int[][] repartirCartas(int baraja[][], int numJugador) {   
        
        Random random = new Random(); // random sería un objeto
        
        int filas = 0;
        int columnas = 0;
        int jugador = numJugador;
        
        
        int [][] colFil = new int [4][12]; // así llenamos el array
        
        for (int j = 0; j < 4; j++) {
            
        for (int i = 0; i < 4; i++) {
              
               filas = random.nextInt(4);  // crea valores enteros entre el 0 y el 4
               columnas = random.nextInt(12); // crea valores enteros entre el 0 y el 11
               
               // este if es para que no chafe un numero a otro
               if(colFil[filas][columnas] == 0) {
               colFil[filas][columnas] = j+1; //para que en cada iteracion sume un jugador, porque sino j empieza en 0, y no debe haber un jugador que sea 0
               }
               else{i--;}// ccuando no sea 0 se va hacia atrás para compensar la carta que no ha puesto
               
               
        }}
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                
                System.out.print(colFil[i][j]);
                
            }
            
            System.out.println("");
        }
        
        // ahora sería asignar el valor en otro método, por ejemplo asignar valor a las cartas, que busque posicion, si hay un 0 que asigne, sino no
        
        return colFil;

    }
    
    public String palos() {
        
        
        return null;
    }
    
    public String eleccionJugador() {
        
        
        return null;
    }
    
    public String visionCartasDelJugador() {
        
        
        return null;
    }
    
    public String ganadorDeLaPartida() {
        
        
        return null;
    }
    
    
}
/*taza clic derecho, versioing, initialize git repository, solo crear el nuevco proyecto
, das ok, las letras se pondrán en verde, eso es que está en modo stage, clic derecho en el proyecto-> git
add -> los avances que vayamos realizando en la Actividad 4.2, dijo algo del ckecout(creo)
luego habrá que enviarle el enlace del github y no un archivo.java

click derecho en la taza o en el .java, commit

click derecho, giff, giff to HEAD (para ver como lo tenías anteriormente)
*/

/*

public int mayor (int a, int b) { // poner dos returns, se puede hacer, pero el primer return que coja, devolverá la respuesta el método mayor y finalizará

    if (a < b) {
        return a;
    }
    else if (b > a) {
        return b;
    }
}
*/

/*

al final, cuando ya lo tenemos todo hecho, lo enviamos al repositorio Remoto que cree: llamado Actividad2MSA

*/


/*

PARA IMPORTAR PROYECTO Y ASÍ NO DA ERRORES EN CADA AL COMITEAR Y TAL

Me pongo encima de la taza del proyecto a exportar
File -> Export y la guardas en el escritorio y en el nombre del archivo, actividad4.zip (importante ponerle .zip)

En casa FIle -> Import

*/