/*   Sala.java
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

