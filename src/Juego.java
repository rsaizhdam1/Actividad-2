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

        String opcionJugador1 = p1.opcionAlAzar();
        System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + p1.getExitos());
        String opcionJugador2 = p2.opcionAlAzar();
        System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + p2.getExitos());
            if(opcionJugador1.equals("piedra")) {
               if (opcionJugador2.equals("papel")) {
                   System.out.println("Jugador 2 GANA");
                   p2.setExitos();
                } else if (opcionJugador2.equals("tijera")) {
                   System.out.println("Jugador 1 GANA");
                   p1.setExitos();
               }
            } else if(opcionJugador1.equals("papel")) {
                if (opcionJugador2.equals("piedra")) {
                    System.out.println("Jugador 1 GANA");
                    p1.setExitos();
                } else if (opcionJugador2.equals("tijera")){
                    System.out.println("Jugador 2 GANA");
                    p2.setExitos();
                }
            } else {
                if (opcionJugador2.equals("piedra")){
                    System.out.println("Jugador 2 GANA");
                    p2.setExitos();
                } else if(opcionJugador2.equals("papel")){
                    System.out.println("Jugador 1 GANA");
                    p1.setExitos();
                }
            }

            if(opcionJugador1.equals(opcionJugador2)) {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }

    }
}
