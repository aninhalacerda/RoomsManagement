/*
 *   FacadeEasyAccept.java
 *
 *   Copyright 2011 Vitor Morato Almeida.
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
 *      Vitor Morato Almeida
 *
 */

package testes;

public class FacadeEasyAccept {

    public void zerarSistema() {

    }

    public void adicionarSala(String id, int capacidade, String finalidade,
            String tipo) {

    }

    public void adicionarSala(String id, int capacidade, String finalidade,
            String tipo, String apelido) {

    }

    public void adicionarSala(String id, int capacidade, String finalidade,
            String tipo, String apelido, boolean aberto) {

    }

    public Object getAtributoSala(String idSala, String atributo) {

        return null;
    }

    public void adicionarEvento(String id, String nome, String inicio,
            String fim, String area, String contato, int repeticoes) {

    }

    public Object getAtributoEvento(String idEvento, String atributo) {
        return null;

    }

    public void alocarEvento(String idEvento, String idSala) {

    }

    public String[] localizarEvento(String atributo, String valor) {
        return null;

    }

    public void desalocarEvento(String idEvento) {

    }

    public void cancelarEvento(String idEvento) {

    }

    public void removerSala(String idSala) {

    }

    public void encerrarSistema() {

    }

}
