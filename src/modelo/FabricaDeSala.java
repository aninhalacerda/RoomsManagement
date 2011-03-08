/*   FabricaDeSala.java
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
