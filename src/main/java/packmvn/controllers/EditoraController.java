package packmvn.controllers;

import java.util.HashMap;
import java.util.List;

import io.javalin.http.Context;
import packmvn.modelo.Editora;
import packmvn.persistencia.EditoraDao;

public class EditoraController {
    private EditoraDao eDao;
    public EditoraController(){
        this.eDao = new EditoraDao();
    }
    public void listar(Context ctx) {
        HashMap<String, List<Editora>> dados= new HashMap<>();
        dados.put("editoras", eDao.listar(10,0));
        ctx.render("editora/telaListar.jte", dados);
    }
    public void excluir(Context ctx) {
        eDao.excluir(ctx.pathParam("cnpj"));
        ctx.redirect("/editora/listar");
    }
}
