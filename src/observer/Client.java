package observer;

public class Client {

	public static void main(String[] args) {
		Subject subject = new Subject();
		ConcreteObserver concreteObserver = new ConcreteObserver();
		subject.addObserver(concreteObserver);
		subject.setChanged();
		subject.notifyObservers("aaaa");
	}

}
