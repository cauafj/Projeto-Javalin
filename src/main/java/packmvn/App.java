package packmvn;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.template.JavalinJte;
import packmvn.controllers.EditoraController;
import packmvn.util.PreCompileJte;

public class App {
    public static void main(String[] args) {
        JavalinJte.configure(PreCompileJte.createTemplateEngine());
        Javalin app = Javalin.create().start(7070);

        
        //rotas
        app.get("/", ctx -> ctx.render("hello.jte"));
        
        //rotas editora
        EditoraController ec = new EditoraController();
        app.get("/editora/listar", ctx -> ec.listar(ctx));
//      app.get("/editora/detalhes/{cnpj}", ctx -> ec.buscar(ctx));
        app.get("/editora/excluir/{cnpj}", ctx -> ec.excluir(ctx));

        //alterar e inserir podem chamar o mesmo jte (ai testa se vem dados para popular campos
//        app.get("/editora/alterar/:cnpj", ctx -> ec.alterar(ctx));

//        app.get("/editora/inserir", ctx -> ctx.render("editora/telaInserir.jte"));
        
        
    }

}
