package facades;

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAcceptFacade;

public class RodaTestes {
	
	
	public static void main(String[] args) {
		
		List<String> files = new ArrayList<String>();
		EasyAcceptFacade eaFacade;
		
		files.add("C:\\Users\\Aninha\\RoomsManagement\\src\\testes\\userStories\\US1.txt");
		US1Facade us1Facade = new US1Facade();
		eaFacade = new EasyAcceptFacade(us1Facade, files);
		eaFacade.executeTests();
		System.out.println(eaFacade.getCompleteResults());
	}
	

}
