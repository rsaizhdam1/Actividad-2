package ende;

public class AppJuego {

    public static void main(String[] args) {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        Juego juego = new Juego(p1, p2);
        boolean finJuego = false;
        int rondasJugadas = 0;    // Número de rondas jugadas
        while (!finJuego) {

            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ juego.getEmpates() + "\n");
            juego.jugar();


            if((p1.éxitos>=3)||(p2.éxitos>=3))
            {
                finJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            } else {
                rondasJugadas++;
            }
            System.out.println();
        }

    }
}
