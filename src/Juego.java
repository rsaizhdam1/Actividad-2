package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego {
    Jugador p1;
    Jugador p2;
    int empates;
    public Juego(Jugador p1, Jugador p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.empates = 0;
    }

    public int getEmpates() {
        return empates;
    }

    public void jugar() {

        // Bucle de juego
        String opcionJugador1 = p1.opcionAlAzar();
        System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + p1.getExitos());
        String opcionJugador2 = p2.opcionAlAzar();
        System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + p2.getExitos());
            if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                p2.setÉxitos();
                
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("piedra")))
            {
                System.out.println("Jugador 1 GANA");
                p1.setÉxitos();
            }
            else if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("tijeras")))
            {
                System.out.println("Jugador 1 GANA");
                p1.setÉxitos();
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("piedra")))
            {
                System.out.println("Jugador 2 GANA");
                p2.setÉxitos();
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 1 GANA");
                p1.setÉxitos();
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("tijeras")))
            {
                System.out.println("Jugador 2 GANA");
                p2.setÉxitos();
            }
            if(opcionJugador1==opcionJugador2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }

    }
}
