package decorator;

public class ConcreteDecoratorA extends IDecorator {

	public ConcreteDecoratorA(IComponent component) {
		this.component = component;
	}

	@Override
	protected void before() {
		System.out.println("A : before decoration");
	}

	@Override
	protected void after() {
		System.out.println("A : after decoration");
	}

}
