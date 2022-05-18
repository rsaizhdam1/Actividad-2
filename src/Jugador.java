package ende;

/**
 *
 */
class Jugador {

    /**
     * Escoge piedra, papel o tijera al azar
     */
    private int exitos;      // número de partidas ganadas
    private int winTotal;
    public String opcionAlAzar() {
        String opcion = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0 -> opcion = ("piedra");
            case 1 -> opcion = ("papel");
            case 2 -> opcion = ("tijeras");
        }
        return opcion;
    }

    public void setExitos() {
        exitos++;
    }

    public int getExitos() {
        return (exitos);
    }


}