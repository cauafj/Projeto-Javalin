package gg.jte.generated.editora;
import packmvn.modelo.Editora;
import java.util.List;
public final class JtetelaListarGenerated {
	public static final String JTE_NAME = "editora/telaListar.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,32,32,32,35,35,35,36,36,36,37,37,37,43,43,43,47,47,63};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<Editora> editoras) {
		jteOutput.writeContent("<html lang=\"en\">\n  <head>\n    <!-- Required meta tags -->\n    <meta charset=\"utf-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n\n    <!-- Bootstrap CSS -->\n    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n\n    <title>Exemplo Crud</title>\n  </head>\n  <body>\n  \n  \n  \n  <h2>Lista de Clientes</h2>\n  <table class=\"table table-sm table-responsive-sm table-hover\">\n    <thead class=\"thead-dark\">\n        <tr>\n            \n            <th scope=\"col\">Nome</th>\n            <th scope=\"col\">CNPJ</th>\n            <th scope=\"col\">E-mail</th>\n            <th scope=\"col\">Opções</th>\n    </tr>\n  </thead>\n  <tbody>\n\n      \n    ");
		for (Editora ed: editoras) {
			jteOutput.writeContent("\n    \n    <tr>\n      <td> ");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(ed.getNome());
			jteOutput.writeContent(" </td>\n      <td> ");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(ed.getCnpj());
			jteOutput.writeContent("  </td>\n      <td> ");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(ed.getEmail());
			jteOutput.writeContent(" </td>\n      <td> \n        <a href=\"detalhes.php?cod=\" class=\"btn btn-sm btn-info\"> \t\t\t\t\t\n          Detalhes?</a>\n        <a href=\"cadastro.php?cod=\" class=\"btn btn-sm btn-warning\">\n          Editar?</a>\t\t\t\t\n        <a href=\"/editora/excluir/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(ed.getCnpj());
			jteOutput.writeContent("\" class=\"btn btn-sm btn-danger\"> \t\t\t\t\t\n          Excluir?</a>\n      </td>\n    </tr>\n    ");
		}
		jteOutput.writeContent("\n  </tbody>\n</table>\n<a href=\"cadastro.php\" class=\"btn btn-secondary active\" role=\"button\" aria-pressed=\"true\">Inserir Cliente</a>\n\n\n\n\n\n <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n  </body>\n</html>\n\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<Editora> editoras = (List<Editora>)params.get("editoras");
		render(jteOutput, jteHtmlInterceptor, editoras);
	}
}
