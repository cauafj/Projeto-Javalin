@import packmvn.modelo.Editora
@param Editora editora
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Exemplo Crud</title>
  </head>
  <body>
  
  
  
  <h2>Cadastro de Editoras</h2>


<form action="/editora/cadastrar" method="post">

  <div class="form-group">
    <label for="nome">Nome</label>
    <input type="text" class="form-control form-control-sm" id="nome" name="nome"  
    value="@if (editora != null)${editora.getNome()} @endif" >
  </div>
  <div class="form-group">
    <label for="email">E-mail</label>
    <input type="email" class="form-control form-control-sm" id="email" name="email" placeholder="nome@exemplo.com" 
    value="@if (editora != null)${editora.getEmail()} @endif">
  </div>
  <div class="form-group">
    <label for="cnpj">CNPJ</label>
    <input type="text" class="form-control form-control-sm" id="cnpj" name="cnpj" placeholder="XXX.XXX.XXX-XX" 
    value="@if (editora != null)${editora.getCnpj()} @endif">
  </div>
  <div class="form-group">
    <button type="submit" class="btn btn-sm btn-primary" >enviar</button>
    <button type="reset" class="btn btn-sm btn-secondary" >limpar</button>  </div>
    <input type="hidden" name="alterar" value="
    @if (editora == null) 
		false
	@else
		true		
    @endif
    ">
</form>

<a href="/editora/listar" class="btn btn-sm active" role="button" aria-pressed="true"> &lt;&lt;voltar</a>









 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>


