package decorator;

public abstract class IDecorator extends IComponent {

	protected IComponent component;

	@Override
	public void MethodA() {
		before();
		this.component.MethodA();
		after();
	}

	protected abstract void before();

	protected abstract void after();
}
