package modelo;

/**
 * Representa um Laboratorio.
 */
public class Laboratorio extends Sala implements Alocavel {

    /**
     * Instancia um novo laboratorio destinado a uma ciencia
     * especifica.
     *
     * @param ciencia Ciencia a qual o laboratorio e destinado.
     */
    private Laboratorio(Ciencia ciencia) {

    }

    public static Laboratorio laboratorioDeBiologia() {
        return null;
    }

    public static Laboratorio laboratorioDeComputacao() {
        return null;
    }
    public static Laboratorio laboratorioDeFisica() {
        return null;
    }

    public static Laboratorio laboratorioDeQuimica() {
        return null;
    }

    public String getTipo() {
        return null;
    }

    private Ciencia ciencia;

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getFinalidade() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getApelido() {
        // TODO Auto-generated method stub
        return null;
    }
}

