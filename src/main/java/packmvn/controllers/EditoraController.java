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
    public void detalhes(Context ctx) {
        // TODO Auto-generated method stub
    }
    public void telaForm(Context ctx, boolean alterar) {
        if(alterar) {
            //tela alterar
            HashMap<String, Editora> dados= new HashMap<>();
            String cnpj = ctx.pathParam("cnpj");
            var edi = eDao.buscar(cnpj);
            System.out.println(eDao.buscar(cnpj));
            dados.put("editora", eDao.buscar(cnpj));
            ctx.render("editora/telaForm.jte", dados);
        }else {
            //tela inserir
            ctx.render("editora/telaForm.jte");

        }
    }
    public void cadastrar(Context ctx) {
        String cnpj = ctx.formParam("cnpj");
        String nome = ctx.formParam("nome");
        String email = ctx.formParam("email");
        Editora edi = new Editora(nome,cnpj,email);
        if(ctx.formParam("alterar").equals("true")) {
            //tela alterar
            this.eDao.alterar(edi);
        }else {
            //tela inserir
            this.eDao.inserir(edi);
        }
        ctx.redirect("/editora/listar");
    }
}
