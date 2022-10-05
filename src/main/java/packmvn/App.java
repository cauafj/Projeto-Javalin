package packmvn;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.template.JavalinJte;
import packmvn.util.PreCompileJte;

public class App {
    public static void main(String[] args) {
        JavalinJte.configure(PreCompileJte.createTemplateEngine());
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> ctx.render("hello.jte"));
    }

}
