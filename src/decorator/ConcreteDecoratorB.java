package decorator;

public class ConcreteDecoratorB extends IDecorator {

	public ConcreteDecoratorB(IComponent component) {
		this.component = component;
	}

	@Override
	protected void before() {
		System.out.println("B : before decoration");
	}

	@Override
	protected void after() {
		System.out.println("B : after decoration");
	}

}
