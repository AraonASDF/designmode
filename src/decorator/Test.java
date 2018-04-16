package decorator;

public class Test {

	public static void main(String[] args) {
		IComponent component = new ConcreteComponent();
		component = new ConcreteDecoratorB(new ConcreteDecoratorA(component));
		component.MethodA();
	}
}
