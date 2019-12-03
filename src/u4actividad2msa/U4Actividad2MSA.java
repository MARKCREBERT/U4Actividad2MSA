/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4actividad2msa;

import java.util.Random;
import java.util.Scanner;
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
        
        char palo;

        palo = paloAleatorioDominante();

        int[][] baraja = new int[4][12];
        String[][] cartas = new String[4][4];
        // si tengo que borrar esto, hacer captura y explicarmelo
        baraja = repartirCartas();
        /*  poniendo baraja, nos rellenar el array 
                                    bidimensional con los valores que se tomen en el metodo, repartir cartas, corresponiente a su
                                    parametro que en este caso sería->  repartirCartas(int baraja[][])*/
        palos(baraja);

        cartas = recorrerBaraja(baraja);
        
        System.out.println("\n");
        
        eleccionJugador(cartas,palo);
        
        
    }

    public char paloAleatorioDominante() {

        // creación aleatoria entre el 1 y 4, y cada número le correspondrá un palo
        int paloAleatorio = (int) (Math.random() * 4) + 49;
        //char sirve para guardar los caracteres de la tabla ASCII
        char paloElegido = (char) paloAleatorio;

        if (paloElegido == '1') {
            
            paloElegido = 'B';

            System.out.println("Palo dominante => Bastos");

        } else if (paloElegido == '2') {
            
            paloElegido = 'E';

            System.out.println("Palo dominante => Espadas");

        } else if (paloElegido == '3') {
            
            paloElegido = 'O';

            System.out.println("Palo dominante => Oros");

        } else if (paloElegido == '4') {
            
            paloElegido = 'C';
            System.out.println("Palo dominante => Copas");
        }
        
        

        return paloElegido;

    }

    public int[][] repartirCartas() {

        Random random = new Random(); // random sería un objeto

        int filas;
        int columnas;

        int[][] colFil = new int[4][12]; // así llenamos el array, 4 jugadores X 12 figuras distintas a repartir entre cada jugador

        for (int j = 0; j < 4; j++) { // 4 es porque debe repartir 4 cartas a cada jugador

            for (int i = 0; i < 4; i++) {

                filas = random.nextInt(4);  // crea valores enteros del 0 al 3
                columnas = random.nextInt(12); // crea valores enteros del 0 al 11

                // este if es para que no chafe un numero a otro
                if (colFil[filas][columnas] == 0) { // si en la fila x y la columna x hay un 0 que entre y se le asigne el j+1
                    colFil[filas][columnas] = j + 1; // esto suma el jugador para la siguiente iteracion en el bucle j, una vez ya se le han repartido las 4 cartas al anterior jugador
                } else {
                    i--; // si en fila x y la columna x ya hay un valor asignado (ya sea 1, 2, 3, 4), que reste una iteracion
                }

            }
        }
        // aqui se va mostrando el valor que tiene cada posicion del array bidimensional ya almacenado
        // y así al final aparecerán las 4 filas X las 12 columnas con sus 4 cartas divididas a cada jugador
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {

                System.out.print(colFil[i][j]);

            }

            System.out.println("");
        }

        System.out.println("");

        return colFil;

    }

    // este método no sirve, solo es para visualizarlo
    public void palos(int[][] baraja) {

        System.out.print("Bastos -> ");

        // Este bucle saca la primera linea de colFil
        for (int k = 0; k < 1; k++) {
            for (int l = 0; l < 12; l++) {

                int bastos[] = new int[12];

                bastos[l] = baraja[k][l];

                System.out.print(bastos[l]);
            }

            System.out.println("");
        }

        System.out.print("Espadas -> ");
        // Este bucle saca la segunda linea de colFil
        for (int k = 1; k < 2; k++) {
            for (int l = 0; l < 12; l++) {

                int espadas[] = new int[12];

                espadas[l] = baraja[k][l];

                System.out.print(espadas[l]);
            }

            System.out.println("");
        }

        System.out.print("Oros -> ");
        // Este bucle saca la tercera linea de colFil
        for (int k = 2; k < 3; k++) {
            for (int l = 0; l < 12; l++) {

                int oros[] = new int[12];

                oros[l] = baraja[k][l];

                System.out.print(oros[l]);
            }

            System.out.println("");
        }
        System.out.print("Copas -> ");
        // Este bucle saca la cuarta linea de colFil
        for (int k = 3; k < 4; k++) {
            for (int l = 0; l < 12; l++) {

                int copas[] = new int[12];

                copas[l] = baraja[k][l];

                System.out.print(copas[l]);
            }

            System.out.println("");
        }

    }

    public String[][] recorrerBaraja(int baraja[][]) {

        int t = 0;
        String cartas[][] = new String[4][4];

        for (int m = 0; m < 4; m++) {// jugador
            t=0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 12; j++) {

                    if (baraja[i][j] == m + 1) {
                        if (t < 4) {
                            cartas[m][t] = codificar(i, j);

                            t++;
                        }
                    }

                }

            }
        }

        return cartas;
    }

    public String codificar(int i, int j) {

        String carta = "";

        if (j < 9 && j != 0) {

            carta = String.valueOf(j + 1); // asi convertimos los enteros a String para luego concatenarlos
        }

        switch (j) {

            case 0: // el AS

                carta = "A";

                break;

            case 9: // sota

                carta = "S";

                break;

            case 10: // caballo

                carta = "C";

                break;

            case 11: //rey

                carta = "R";

                break;

        }

        switch (i) {

            case 0: // Oros

                carta = carta.concat("O");

                break;

            case 1: // espadas

                carta = carta.concat("E");

                break;

            case 2: // bastos

                carta = carta.concat("B");

                break;

            case 3: //copas

                carta = carta.concat("C");

                break;

        }

        return carta;
    }

    public String [][] eleccionJugador(String [][]cartas, char palo) { // se pone String [][] -> porque arriba en inicio, el String cartas es bidimensaional
        
        String[] usuario = new String[4];
        Scanner teclado = new Scanner (System.in);
        boolean ganador [] = new boolean[4];
        
        
        for (int i = 0; i < 4; i++) { // bucle para las filas
            
            System.out.print("Cartas Jugador " + (i+1) + ": ");
            

            for (int j = 0; j < 4; j++) { // bucle para las columnas
                
                System.out.print(cartas[i][j] + " |");
                
                
            }
            
            System.out.print("\n");
            System.out.print("¿Qué carta lanzas?: ");
            usuario[i] = teclado.nextLine();

            
        }
        
           ganador = decidirGanador(usuario,palo);
            
            System.out.print("\n");
            
            for (int j = 0; j < ganador.length; j++) {
                
                
                if (ganador[j] == true) {
                    
                    System.out.println("El jugador " + (j+1) + " gana la partida");
                    
                }
                
            }

        return null;
    }

    public boolean [] decidirGanador(String[] usuario, char palo) {
        
        char paloCarta;
        boolean ganadores [] = new boolean[4];
        
        for (int i = 0; i < 4; i++) {
            
            paloCarta = usuario[i].charAt(1); // para sacar la la segunda posición, que en este caso es la que nos importa, para saber el palo dominante de cada jugador
            
            if (paloCarta == palo) {
                
                ganadores[i] = true;
            } 
        }
            

        return ganadores;
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


/*remote-> git push y en casa git pull*/

// crear uno privado y meter a ROberto como colaborador