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
