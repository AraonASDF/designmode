package observer;

import java.util.Observable;

public class Subject extends Observable{

	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}
	
}
