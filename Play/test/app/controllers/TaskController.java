package controllers;

import models.Task;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.data.Form;

import java.util.List;

public class TaskController extends Controller {
	public static Result listTasks(){
		List<Task> tasks = Task.find.all();
		return ok(listTasks.render(tasks));
	}
	
	public static Result create(){
		Form<Task> task = new Form(Task.class);
		return ok(taskForm.render(task));
	}
	
	public static Result save() {
		Form<Task> form = new Form(Task.class).bindFromRequest();
		Task task = form.get();
		task.save();
		return redirect(routes.TaskController.listTasks());
	}
	
}
