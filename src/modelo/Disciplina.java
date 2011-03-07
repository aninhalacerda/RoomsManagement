package modelo;

/**
 * Representa uma ciencia.
 */
enum Ciencia {
    BIOLOGIA("Biologia"),
    COMPUTACAO("Computacao"),
    FISICA("Fisica"),
    QUIMICA("Quimica");

    /**
     * Instancia uma nova ciencia com o nome dado.
     */
    private Ciencia(final String nome) {
        this.nome = nome;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return nome;
    }

    private final String nome;
}

