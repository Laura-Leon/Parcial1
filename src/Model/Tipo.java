package Model;

import java.util.Comparator;

public class Tipo implements Comparator<Netflix>{
	
	@Override
	public int compare(Netflix et1, Netflix et2) {
		// TODO Auto-generated method stub
		return et1.getTipo().compareTo(et2.getTipo());
	}

}
