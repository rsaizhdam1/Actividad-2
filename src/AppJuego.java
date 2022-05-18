package ende;

public class AppJuego {

    public static void main(String[] args) {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        Juego juego = new Juego(p1, p2);
        int rondasJugadas = 0;    // Número de rondas jugadas
        while ((p1.getExitos() < 3) || (p2.getExitos() < 3)) {
            System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
            System.out.println("Numero de empates: " + juego.getEmpates() + "\n");
            juego.jugar();
            rondasJugadas++;
            System.out.println();
        }
        System.out.println("FIN DEL JUEGO!!");
    }
}

