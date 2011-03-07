package modelo.excecoes;

/**
 * Excecao lancada quando um valor invalido e passado como parametro a um
 * metodo.
 */
public final class ParametroInvalidoException extends RuntimeException {
    /**
     * Instancia uma nova Excecao do tipo ParametroInvalidoException, com
     * mensagem especificada.
     *
     * @param mensagem Descricao da causa da excecao.
     */
    public ParametroInvalidoException(final String message) {
        super(message);
        this.message = message;
    }

    /**
     * Instancia uma nova Excecao do tipo ParametroInvalidoException com
     * mensagem igual a "".
     */
    public ParametroInvalidoException() {
        this("");
    }

    /*
     * (non-Javadoc)
     *
     * @see Java.lang.RuntimeException#getMessage
     */
    public final String getMessage() {
        return this.message;
    }

    private String message;
}

