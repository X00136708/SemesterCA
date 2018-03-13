package controllers.security;

import controllers.routes;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.users.*;

public class RegisterUser extends Controller{

    private FormFactory formFactory;
    private Environment env;

    public Result register() {
        Form<User> userForm = formFactory.form(User.class);
        return ok(RegisterUser.render(userForm, User.getUserById(session().get("email"))));
    }
    public Result registrationSubmit() {
        User newUser;
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();

        if (newUserForm.hasErrors()){
            return badRequest(RegisterUser.render(newUserForm, User.getUserById(session().get("email"))));
        }
        else {
            newUser = newUserForm.get();
            newUser.save();
        }
        flash("success", "User " + newUser.getName() + " has been created");

        return redirect(controllers.routes.ProductCtrl.listProducts( "?.." ));
    }

}
