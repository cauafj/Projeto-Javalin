@import packmvn.modelo.Editora
@import java.util.List
@param List<Editora> editoras
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
  
  
  
  <h2>Lista de Editoras</h2>
  <table class="table table-sm table-responsive-sm table-hover">
    <thead class="thead-dark">
        <tr>
            
            <th scope="col">Nome</th>
            <th scope="col">CNPJ</th>
            <th scope="col">E-mail</th>
            <th scope="col">Opções</th>
    </tr>
  </thead>
  <tbody>

      
    @for(Editora ed: editoras)
    
    <tr>
      <td> ${ed.getNome()} </td>
      <td> ${ed.getCnpj()}  </td>
      <td> ${ed.getEmail()} </td>
      <td> 
        <a href="detalhes/${ed.getCnpj()}" class="btn btn-sm btn-info"> 					
          Detalhes?</a>
        <a href="cadastro/${ed.getCnpj()}" class="btn btn-sm btn-warning">
          Editar?</a>				
        <a href="/editora/excluir/${ed.getCnpj()}" class="btn btn-sm btn-danger"> 					
          Excluir?</a>
      </td>
    </tr>
    @endfor
  </tbody>
</table>
<a href="cadastro/" class="btn btn-secondary active" role="button" aria-pressed="true">Inserir Editora</a>





 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>


