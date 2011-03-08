/*   TipoDeSalaDeAula.java
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
 * Representa um tipo de sala de aula.
 */
enum TipoDeSalaDeAula {
    NORMAL("Normal"),
    INTELIGENTE("Inteligente"),
    VIDEOCONFERENCIA("Videoconferencia");

    /**
     * Instancia uma nova ciencia com o nome dado.
     */
    private TipoDeSalaDeAula(final String nome) {
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

