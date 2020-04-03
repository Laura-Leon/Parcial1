package Model;

import java.util.Comparator;



public class Name implements Comparator<Netflix> {

	@Override
	public int compare(Netflix net1, Netflix net2) {
		// TODO Auto-generated method stub
		return net1.getName().compareTo(net2.getName());
	}
	

}
