/*   TesteMain.java
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

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAcceptFacade;

public class TesteMain {

    public static void main(String[] args) throws Exception {

        List<String> files = new ArrayList<String>();

        files.add("/home/vitorma/workspace/projeto-si/src/testes/userStories/US1.txt");
        files.add("userStories/US2.txt");
        files.add("userStories/US3.txt");
        files.add("userStories/US4.txt");
        files.add("userStories/US5.txt");
        files.add("userStories/US6.txt");
        files.add("userStories/US7.txt");

        FacadeEasyAccept facade = new FacadeEasyAccept();

        EasyAcceptFacade eaFacade = new EasyAcceptFacade(facade, files);

        eaFacade.executeTests();

        System.out.println(eaFacade.getCompleteResults());

    }

}
