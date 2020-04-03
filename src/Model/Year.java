package Model;

import java.util.Comparator;

public class Year implements Comparator<Netflix>{

	@Override
	public int compare(Netflix o1, Netflix o2) {
		// TODO Auto-generated method stub
		return o1.getYear().compareTo(o2.getYear());
	}

}
