/*   Escritorio.java
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
 * Representa um escritorio.
 */
public final class Escritorio extends Sala {

    /**
     * Instancia um novo Escritorio com identificador, capacidade
     * e apelido especificados.
     *
     * @param id Identificador do escritorio.
     * @param capacidade Capacidade do escritorio.
     * @see Escritorio#Escritorio(java.lang.String, int, Java.lang.String)
     */
    public Escritorio(final String id, final int capacidade,
            final String apelido) {

        this.validar(id, capacidade, apelido);

        this.id = id;
        this.capacidade = capacidade;
        this.apelido = apelido;
    }

    /**
     * Instancia um novo Escritorio com identificador e capacidade
     * especificados e apelido vazio ("").
     *
     * @param id Identificador do escritorio.
     * @param capacidade Capacidade do escritorio.
     * @see Escritorio#Escritorio(java.lang.String, int, Java.lang.String)
     */
    public Escritorio(final String id, final int capacidade) {
        this(id, capacidade, "");
    }

    /**
     * (non-Javadoc)
     *
     * @see model.Sala#getId()
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * (non-Javadoc)
     *
     * @see model.Sala#getFinalidade()
     */
    @Override
    public String getFinalidade() {
        return "Escritorio";
    }

    /**
     * (non-Javadoc)
     *
     * @see model.Sala#getCapacidade()
     */
    @Override
    public int getCapacidade() {
        return this.capacidade;
    }

    /**
     * (non-Javadoc)
     *
     * @see model.Sala#getTipo()
     */
    @Override
    public String getTipo() {
        return "";
    }

    /**
     * (non-Javadoc)
     *
     * @see model.Sala#getApelido()
     */
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
            final String apelido) {
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

    private final String id;
    private final String apelido;
    private final int capacidade;
}

