package gg.jte.generated.editora;
import packmvn.modelo.Editora;
public final class JtetelaFormGenerated {
	public static final String JTE_NAME = "editora/telaForm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,25,25,25,25,25,25,25,30,30,30,30,30,30,35,35,35,35,35,35,41,41,43,43,45,45,66};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Editora editora) {
		jteOutput.writeContent("<html lang=\"en\">\n  <head>\n    <!-- Required meta tags -->\n    <meta charset=\"utf-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n\n    <!-- Bootstrap CSS -->\n    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n\n    <title>Exemplo Crud</title>\n  </head>\n  <body>\n  \n  \n  \n  <h2>Cadastro de Editoras</h2>\n\n\n<form action=\"/editora/cadastrar\" method=\"post\">\n\n  <div class=\"form-group\">\n    <label for=\"nome\">Nome</label>\n    <input type=\"text\" class=\"form-control form-control-sm\" id=\"nome\" name=\"nome\"  \n    value=\"");
		if (editora != null) {
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(editora.getNome());
			jteOutput.writeContent(" ");
		}
		jteOutput.writeContent("\" >\n  </div>\n  <div class=\"form-group\">\n    <label for=\"email\">E-mail</label>\n    <input type=\"email\" class=\"form-control form-control-sm\" id=\"email\" name=\"email\" placeholder=\"nome@exemplo.com\" \n    value=\"");
		if (editora != null) {
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(editora.getEmail());
			jteOutput.writeContent(" ");
		}
		jteOutput.writeContent("\">\n  </div>\n  <div class=\"form-group\">\n    <label for=\"cnpj\">CNPJ</label>\n    <input type=\"text\" class=\"form-control form-control-sm\" id=\"cnpj\" name=\"cnpj\" placeholder=\"XXX.XXX.XXX-XX\" \n    value=\"");
		if (editora != null) {
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(editora.getCnpj());
			jteOutput.writeContent(" ");
		}
		jteOutput.writeContent("\">\n  </div>\n  <div class=\"form-group\">\n    <button type=\"submit\" class=\"btn btn-sm btn-primary\" >enviar</button>\n    <button type=\"reset\" class=\"btn btn-sm btn-secondary\" >limpar</button>  </div>\n    <input type=\"hidden\" name=\"alterar\" value=\"\n    ");
		if (editora == null) {
			jteOutput.writeContent(" \n\t\tfalse\n\t");
		} else {
			jteOutput.writeContent("\n\t\ttrue\t\t\n    ");
		}
		jteOutput.writeContent("\n    \">\n</form>\n\n<a href=\"/editora/listar\" class=\"btn btn-sm active\" role=\"button\" aria-pressed=\"true\"> &lt;&lt;voltar</a>\n\n\n\n\n\n\n\n\n\n <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n  </body>\n</html>\n\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Editora editora = (Editora)params.get("editora");
		render(jteOutput, jteHtmlInterceptor, editora);
	}
}
