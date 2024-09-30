package Abstraction;

public class login extends Page {

	
	public login() {
		
		System.out.println("login constructor --login");
	}

	@Override
	public void title() {
		System.out.println("Login page title");
	}

	@Override
	public void url() {
		System.out.println("Login page URL");
	}

	@Override
	public void loading() {
		System.out.println("page Loading in 5sec");
	}

	// individual method

	public void doLogin() {
		System.out.println("Login to app");
	}
}
