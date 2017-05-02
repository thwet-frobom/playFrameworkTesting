package controllers;

import play.data.FormFactory;
import play.mvc.*;
import models.*;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;

import play.data.*;
import static play.data.Form.*;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

import play.api.mvc.Security;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.*;
import play.api.*;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {

	private static FormFactory formFactory;

	@Inject
	public HomeController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	/**
	 * An action that renders an HTML page with a welcome message. The
	 * configuration in the <code>routes</code> file means that this method will
	 * be called when the application receives a <code>GET</code> request with a
	 * path of <code>/</code>.
	 */

	public Result index() {
		// updateLastSeen();
		return ok(views.html.index.render("Index Page"));
	}

	public Result login() {
		Form<User> userForm = formFactory.form(User.class);
		if (userForm.hasErrors()) {
			return badRequest(views.html.welcome.render("Sorry"));
		} else {
			return ok(views.html.login.render(userForm));
		}

	}

	public Result postLogin() {
		Form<User> userForm = formFactory.form(User.class);
		// updateLastSeen();
		DynamicForm requestData = Form.form().bindFromRequest();
		String userEmail = requestData.get("email");
		String userPassword = requestData.get("password");

		System.out.println("User Email is:" + userEmail);
		System.out.println("User Password is:" + userPassword);
		
		session().put("email", userEmail);
		session().put("password", userPassword);

		if (userEmail.equals("thwet3@gmail.com") && userPassword.equals("12345")) {
			return ok(views.html.profile.render(userForm));
		} else {
			return ok(views.html.login.render(userForm));
		}

	}

	public Result signUp() {
		Form<User> userForm = formFactory.form(User.class);
		// updateLastSeen();
		return ok(views.html.signUp.render(userForm));
	}

	public Result postSignUP() {
		Form<User> userForm = formFactory.form(User.class).bindFromRequest();
		userForm.get().save();
		flash("success", "User " + userForm.get().name + " has been registered.");
		return ok(views.html.welcome.render("Sign Up successfull"));
	}

	public Result profile() {
		//User currentUser = new User(name, email, password);
		//Form<User> userForm = formFactory.form(User.class).fill(currentUser);

		return ok(views.html.profile.render(userForm));
	}

	public Result postProfile() {
		Form<User> userForm = formFactory.form(User.class).bindFromRequest();

		String email = session().get("email");
		System.out.println("Email is:" + email);
		String password = session().get("password");
		System.out.println("Password:" + password);

		if (email == null) {
			return badRequest(views.html.login.render(userForm));
		} else {
			return ok(views.html.profile.render(userForm));
		}
		
	}

	public Result logout() {
		session().clear();
		return redirect(routes.HomeController.login());
	}

	/*
	 * public void updateLastSeen() { session().put("email",
	 * "thwet3@gmail.com"); session().put("password", "12345");
	 * 
	 * }
	 */
}
