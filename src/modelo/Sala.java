package modelo;

/**
 * Tipo abstrato Sala. Todas as salas do sistema
 * sao subclasses dessa Sala.
 */
public abstract class Sala {
    /**
     * Retorna o identificador da sala.
     *
     * @return O id da Sala.
     */
    public abstract String getId();


    /**
     * Retorna a capacidade da sala.
     *
     * @return Capacidade da sala.
     */
    public abstract int getCapacidade();

    /**
     * Retorna a finalidade da sala.
     *
     * @return Finalidade da sala.
     */
    public abstract String getFinalidade();

    /**
     * Retorna o tipo da sala.
     *
     * @return Tipo da sala.
     */
    public abstract String getTipo();

    /**
     * Retorna o apelido da sala.
     *
     * @return Apelido.
     */
    public abstract String getApelido();
}

