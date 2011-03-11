package facades;

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAcceptFacade;

public class RodaTestes {

	public static void main(String[] args) {
		// coloquem o caminho para o US1.txt, não consegui colocar sem ser o
		// caminho inteiro do meu computador
		String file = "";
		List<String> files = new ArrayList<String>();
		EasyAcceptFacade eaFacade;

		files.add(file);
		US1Facade us1Facade = new US1Facade();
		eaFacade = new EasyAcceptFacade(us1Facade, files);
		eaFacade.executeTests();
		System.out.println(eaFacade.getCompleteResults());
	}

}
