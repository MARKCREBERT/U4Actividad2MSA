/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4actividad2msa;

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
  
    
    
    public String repartirCartas() {     
        
        return null;

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