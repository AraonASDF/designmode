package dynamicproxy;

public class Client {
	
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory(new Subject());
		ISubject subject = (ISubject) proxyFactory.newProxyInstance();
		subject.exec();
	}
}
