package modelo;

/**
 * Fabrica de Salas. (Factory Pattern)
 */
public final class FabricaDeSala {

    /**
     * Constroi e retorna uma sala de aula de acordo com os parametros dados.
     * 
     * @param id Identificador da sala.
     * @param capacidade Capacidade da sala.
     * @param finalidade Finalidade da sala.
     * @param tipo Tipo da sala.
     * @param apelido Apelido da sala.
     * @return Uma nova sala.
     */
    public static Sala getSala(
            final String id,
            final int capacidade,
            final String finalidade,
            final String tipo,
            final String apelido
                    ) {
        return null;
    }

    /**
     * Constroi e retorna uma sala de aula de acordo com os parametros dados.
     * 
     * @param id Identificador da sala.
     * @param capacidade Capacidade da sala.
     * @param finalidade Finalidade da sala.
     * @param tipoOuApelido Apelido da sala, se for um escritorio, out tipo da
     *            sala, caso contrario.
     * @return
     * 
     * @see FabricaDeSala#getSala(String id, int capacidade, String finalidade,
     *       String tipo, String apelido )
     */
    public static Sala getSala(
            final String id,
            final int capacidade,
            final String finalidade,
            final String tipoOuApelido
            ) {
        return null;
    }
}
