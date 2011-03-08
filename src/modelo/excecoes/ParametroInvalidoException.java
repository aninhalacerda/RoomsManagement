/*   ParametroInvalidoException.java
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

