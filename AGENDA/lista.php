<meta charset="UTF-8">
<style>
    body{
    }
    table{
        margin: 0 auto;
        border-collapse: collapse;
        border: solid 1px black;
    }
    thead{
        background-color: #6666ff;
        color:white;
    }
    td, th{
        padding: 8px;
    }
    .c0{
        background-color: #dddddd;
    }
    .c1{
        background-color: #aaaaaa;
        
    }
    
</style>
<?php
$conexao = new mysqli("localhost", "root", "etec");
$conexao->set_charset("UTF8");
$ordem = "nome";
$filtro = "";
if(!empty($_GET["ordem"])){
    $ordem = $_GET["ordem"];
}
if(!empty($_GET["filtro"])){
    $filtro = $_GET["filtro"];
}
if ($conexao->connect_error) {
    die("Falha ao conectar: " . $conexao->connect_error);
}
if (!$conexao->select_db("agenda")) {
    die("O Banco de dados não existe");
}
$sql = "SELECT * FROM pessoa where nome like '%$filtro%' order by $ordem";
$resultado = $conexao->query($sql);
if ($resultado) {
    ?>
   

        <?php
    echo "<table border='1'>" .
           "<caption>
             <form>
              <input type='text' name='filtro'/>
              <input type='submit' value='Filtrar'/>
             </form>
            </caption>".
    "<thead>" .
    "<tr>" .
    "<th><a href='?ordem=nome'>Nome</a></th>" .
    "<th>Endereço</th>" .
    "<th><a href='?ordem=cidade'>Cidade</a></th>" .
    "<th>Telefone</th>" .
    "<th colspan='2'>Ações</th>" .
    "</tr>" .
    "</thead>".
            "<tbody>";
    $cont = 0;
    while ($linha = $resultado->fetch_array()) {
        $cont++;
        $classe = $cont % 2;
        $codigo = $linha["codigo"];
               echo "<tr class='c$classe'>" .
             "<td>" . $linha["nome"] . "</td>" .
             "<td>" . $linha["endereco"] . "</td>" .
             "<td>" . $linha["cidade"] . "</td>" .
             "<td>" . $linha["telefone"] . "</td>" .
             "<td><a href='formularioAlterar.php?codigo=$codigo'><img title='Editar' src='img/edit.png' height='18'/></a></td>".
             "<td><a href='excluir.php?codigo=$codigo'><img title='Excluir' src='img/delete.png' height='18'/></a></td>".
                       
             "</tr>";
    }
    echo "</tbody>";
    echo "<tfoot><tr><th colspan='6'>Registros: $cont</th></tfoot>";
    echo  "</table>";
    
} else {
    echo "Erro SQL: " . $conexao->error;
}
$conexao->close();
?>

