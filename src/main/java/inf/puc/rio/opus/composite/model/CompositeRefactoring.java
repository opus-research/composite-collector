package inf.puc.rio.opus.composite.model;

import java.util.ArrayList;
import java.util.List;


public class CompositeRefactoring {

	public String id;
	public List<Refactoring> refactorings;
	public String type;
	
	
	public CompositeRefactoring(String id, List<Refactoring> refactorings, String type) {
		
		this.id = id;
		this.refactorings = refactorings;
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
	

}
