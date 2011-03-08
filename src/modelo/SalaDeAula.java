/*   SalaDeAula.java
 *
 *   Copyright 2011 Tiago Almeida Reul.
 *   All rights reserved.
 *
 *   This file is part of RoomsManagement
 *
 *   RoomsManagement is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   RoomsManagement is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with RoomsManagement.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Contributors:
 *      Tiago Almeida Reul
 *
 */

package modelo;

import modelo.excecoes.ParametroInvalidoException;

/**
 * Representa uma sala de aula.
 */
public class SalaDeAula extends Sala implements Alocavel {

    /**
     * Instancia uma nova SalaDeAula com id, capacidade, tipo e apelido
     * especificados.
     *
     * @param id Identificador da sala.
     * @param capacidade Capacidade da sala.
     * @param tipo Tipo da Sala (Normal, Inteligente ou Videoconferencia);
     * @param apelido Apelido da Sala.
     */
    public SalaDeAula(String id, int capacidade, String tipo, String apelido ){
        this.validar(id, capacidade, tipo, apelido);

        this.tipo = TipoDeSalaDeAula.valueOf(tipo.toUpperCase());
        this.capacidade = capacidade;
        this.apelido = apelido;
        this.id = id;
    }

    /**
     * Instancia uma nova SalaDeAula com id, capacidade e tipo
     * especificados, e apelido = "";
     *
     * @param id Identificador da sala.
     * @param capacidade Capacidade da sala.
     * @param tipo Tipo da Sala (Normal, Inteligente ou Videoconferencia);
     * @param apelido Apelido da Sala.
     */
    public SalaDeAula(String id, int capacidade, String tipo){
        this(id, capacidade, tipo, "");
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getCapacidade() {
        return this.capacidade;
    }

    @Override
    public String getFinalidade() {
        return "Sala de Aula";
    }

    @Override
    public String getTipo() {
        return this.tipo.toString();
    }

    @Override
    public String getApelido() {
        return this.apelido;
    }

    /**
     * Valida id, capacidade, apelido e lanca ParametroInvalidoException caso
     * algum deles tenha um valor nao permitido.
     *
     * @param id Id da sala (nao vazio, nao-nulo).
     * @param id Capacidade da sala (positivo).
     * @param id Apelido da sala (nao-nulo).
     */
    private void validar(final String id, final int capacidade,
            String tipo, final String apelido) {
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

        if (tipo == null) {
            throw new ParametroInvalidoException("tipo=null");
        }

        if (tipo.equals("")) {
            throw new ParametroInvalidoException("tipo=\"\"");
        }

        try {
            TipoDeSalaDeAula.valueOf(tipo.toUpperCase());
        } catch (Exception e) {
            throw new ParametroInvalidoException("tipo desconhecido");
        }
    }


    private final TipoDeSalaDeAula tipo;
    private String id;
    private String apelido;
    private int capacidade;
}

