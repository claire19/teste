package org.formation.weld.server;



import org.formation.weld.test.MyApplication;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class MonConteneur {

	public static void main(String[] args) {
		// MyApplication application = new MyApplication();
		// application.showMeTheClient();

		Weld weld = new Weld();
		WeldContainer container = weld.initialize();

		MyApplication myApplication = container.instance().select(MyApplication.class).get();

		myApplication.showMeTheCustomer();

		weld.shutdown();

	}

}
