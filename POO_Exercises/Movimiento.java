package POO_Exercises;

import java.util.*;

/**
 * Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto
 * * dentro de un tablero y actualice su posición dentro del mismo.
 * * Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
 * * Tras cada movimiento el programa mostrará
 * * la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.*
 */
public class Movimiento {

    public class Main {
        //Metodo main
        public static void main(String[] args) {
            boolean Salida=false;
            int x,y,numero;
            String Movimiento;
            Scanner Leer = new Scanner(System.in);

            System.out.println("Este programa permitira dirigir el movimiento de un objeto dentro de un tablero");
            System.out.println("\n Actualizara su posicion dentro del mismo");
            System.out.println("\nIngrese las coordenadas en x:");
            x=Leer.nextInt();
            System.out.println("\n Ingrese las coordenas en y:");
            y=Leer.nextInt();
            System.out.println("\n Los movimientos posibles son: ");
            System.out.println("\nArriba W");
            System.out.println("\nAbajo S");
            System.out.println("\nIzquierda A");
            System.out.println("\nDerecha D");
            System.out.println("\nSalir");
            System.out.println("Ingrese su movimiento");
            Movimiento=Leer.nextLine();
            Tablero movimientos=new Tablero(x,y);
            do{
                switch(Movimiento){
                    case "W":
                        System.out.println("Cuantos espacios desea moverse arriba: ");
                        numero=Leer.nextInt();
                        movimientos.moverArriba(numero);
                        break;
                    case "A":
                        System.out.println("Cuantos espacios desea moverse abajo: ");
                        numero=Leer.nextInt();
                        movimientos.moverAbajo(numero);
                        break;
                    case "S":
                        System.out.println("Cuantos espacios desea moverse izquierda: ");
                        numero=Leer.nextInt();
                        movimientos.moverIzquierda(numero);
                        break;
                    case "D":
                        System.out.println("Cuantos espacios desea moverse derecha: ");
                        numero=Leer.nextInt();
                        movimientos.moverDerecha(numero);
                        break;
                    default:
                        System.out.println("No elegiste un movimiento valido");
                        break;
                }
                System.out.println("La posicion en (x/y) es: ("+movimientos.getX()+","+movimientos.getY()+")");
                System.out.println("\n Los movimientos posibles son: ");
                System.out.println("\nArriba W");
                System.out.println("\nAbajo S");
                System.out.println("\nIzquierda A");
                System.out.println("\nDerecha D");
                System.out.println("\nSalir");
                System.out.println("Ingrese su movimiento");
                Movimiento=Leer.nextLine();
                if(Movimiento=="E"){
                    Salida=true;
                }
            }while(!Salida); }

    }

    public static class Tablero {
        private int x;
        private int y;

        public Tablero(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void moverArriba(int n) {
            this.y += n;
        }
        public void moverAbajo(int n) {
            this.y -= n;
        }

        public void moverIzquierda(int n) {
            this.x += n;
        }
        public void moverDerecha(int n) {
            this.x -= n;
        }

        public int getY() {
            return this.y;
        }

    }
}
