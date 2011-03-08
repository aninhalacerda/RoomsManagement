package modelo;

import modelo.excecoes.ParametroInvalidoException;

/**
 * Representa um Laboratorio.
 */
public final class Laboratorio extends Sala implements Alocavel {
    /**
     * Instancia um novo laboratorio destinado a uma ciencia
     * especifica.
     *
     * @param ciencia Ciencia a qual o laboratorio e destinado.
     */
    private Laboratorio(String id, int capacidade, String apelido,
            Ciencia ciencia) {
        this.validar(id, capacidade, apelido);

        this.ciencia = ciencia;
        this.id = id;
        this.capacidade = capacidade;
        this.apelido = apelido;
    }

    /**
     * Instancia um novo laboratorio destinado a uma ciencia
     * especifica.
     *
     * @param ciencia Ciencia a qual o laboratorio e destinado.
     */
    private Laboratorio(String id, int capacidade,  Ciencia ciencia) {
        this(id, capacidade, "", ciencia);
    }

    /*
     * (non-Javadoc)
     *
     * @see modelo.Sala#getTipo()
     */
    @Override
    public String getTipo() {
        return this.ciencia.toString();
    }

    /*
     * (non-Javadoc)
     *
     * @see modelo.Sala#getId()
     */
    @Override
    public String getId() {
        return this.id;
    }

    /*
     * (non-Javadoc)
     *
     * @see modelo.Sala#getFinalidade()
     */
    @Override
    public String getFinalidade() {
        return "Laboratorio";
    }

    /*
     * (non-Javadoc)
     *
     * @see modelo.Sala#getCapacidade()
     */
    @Override
    public int getCapacidade() {
        return this.capacidade;
    }

    /*
     * (non-Javadoc)
     *
     * @see modelo.Sala#getApelido()
     */
    @Override
    public String getApelido() {
        return this.apelido;
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Biologia", com o id,
     * capacidade e apelido especificados.
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @param apelido Apelido do laboratorio.
     * @return O novo laboratorio de biologia.
     */
    public static Laboratorio laboratorioDeBiologia(String id, int capacidade,
            String apelido) {
        return new Laboratorio(id, capacidade, apelido, Ciencia.BIOLOGIA);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Biologia", com o id,
     * e capacidade especificados, e apelido igual a "".
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @return O novo laboratorio de biologia.
     */
    public static Laboratorio laboratorioDeBiologia(String id, int capacidade) {
        return new Laboratorio(id, capacidade, Ciencia.BIOLOGIA);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Computacao", com o id,
     * capacidade e apelido especificados.
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @param apelido Apelido do laboratorio.
     * @return O novo laboratorio de computacao.
     */
    public static Laboratorio laboratorioDeComputacao(String id, int capacidade,
            String apelido) {
        return new Laboratorio(id, capacidade, apelido, Ciencia.COMPUTACAO);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Computacao", com o id,
     * e capacidade especificados, e apelido igual a "".
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @return O novo laboratorio de computacao.
     */
    public static Laboratorio laboratorioDeComputacao(String id,
            int capacidade) {
        return new Laboratorio(id, capacidade, Ciencia.COMPUTACAO);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Fisica", com o id,
     * capacidade e apelido especificados.
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @param apelido Apelido do laboratorio.
     * @return O novo laboratorio de fisica.
     */
    public static Laboratorio laboratorioDeFisica(String id, int capacidade,
            String apelido) {
        return new Laboratorio(id, capacidade, apelido, Ciencia.FISICA);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Fisica", com o id,
     * e capacidade especificados, e apelido igual a "".
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @return O novo laboratorio de fisica.
     */
    public static Laboratorio laboratorioDeFisica(String id, int capacidade) {
        return new Laboratorio(id, capacidade, Ciencia.FISICA);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Quimica", com o id,
     * capacidade e apelido especificados.
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @param apelido Apelido do laboratorio.
     * @return O novo laboratorio de quimica.
     */
    public static Laboratorio laboratorioDeQuimica(String id, int capacidade,
            String apelido) {
        return new Laboratorio(id, capacidade, apelido, Ciencia.QUIMICA);
    }

    /**
     * Instancia e retorna um novo laboratorio do tipo "Quimica", com o id,
     * e capacidade especificados, e apelido igual a "".
     *
     * @param id Identificador do laboratorio.
     * @param capacidade Capacidade do laboratorio.
     * @return O novo laboratorio de quimica.
     */
    public static Laboratorio laboratorioDeQuimica(String id, int capacidade) {
        return new Laboratorio(id, capacidade, Ciencia.QUIMICA);
    }

    /**
     * Valida id, capacidade, apelido e lanca ParametroInvalidoException caso
     * algum deles tenha um valor nao permitido.
     *
     * @param id Id da sala (nao vazio, nao-nulo).
     * @param id Capacidade da sala (positivo).
     * @param id Apelido da sala (nao-nulo).
     */
    private void validar(String id, int capacidade, String apelido) {
        if (id == null)  {
            throw new ParametroInvalidoException("id=null");
        }

        if (id.equals(""))  {
            throw new ParametroInvalidoException("id=\"\"");
        }

        if (capacidade < 1) {
            throw new ParametroInvalidoException("capacidade=" + capacidade);
        }

        if (apelido == null) {
            throw new ParametroInvalidoException("apelido=null");
        }
    }

    private final Ciencia ciencia;
    private final String id;
    private final int capacidade;
    private final String apelido;
}

