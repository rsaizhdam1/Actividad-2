package ende;

/**
 *
 */
class Jugador {

    /**
     * Escoge piedra, papel o tijera al azar
     */
    private int exitos;      // número de partidas ganadas

    public String opcionAlAzar() {
        int c = (int) (Math.random() * 3);
        return switch (c) {
            case 0 -> "piedra";
            case 1 -> "papel";
            default -> "tijera";
        };
    }

    public void setExitos() {
        exitos++;
    }

    public int getExitos() {
        return exitos;
    }


}