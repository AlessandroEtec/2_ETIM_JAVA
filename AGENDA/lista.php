<meta charset="UTF-8">
<style>
    body{
    }
    table{
        margin: 0 auto;
    }
    thead{
        background-color: #6666ff;
        color:white;
    }
    td, th{
        padding: 5px;
    }
    
</style>
<?php
$conexao = new mysqli("localhost", "root", "etec");
$conexao->set_charset("UTF8");
if ($conexao->connect_error) {
    die("Falha ao conectar: " . $conexao->connect_error);
}
if (!$conexao->select_db("agenda")) {
    die("O Banco de dados não existe");
}
$sql = "SELECT * FROM pessoa";
$resultado = $conexao->query($sql);
if ($resultado) {
    echo "<table border='1'>" .
    "<thead>" .
    "<tr>" .
    "<th>Nome</th>" .
    "<th>Endereço</th>" .
    "<th>Cidade</th>" .
    "<th>Telefone</th>" .
    "</tr>" .
    "</thead>".
            "<tbody>";
    while ($linha = $resultado->fetch_array()) {
               echo "<tr>" .
             "<td>" . $linha["nome"] . "</td>" .
             "<td>" . $linha["endereco"] . "</td>" .
             "<td>" . $linha["cidade"] . "</td>" .
             "<td>" . $linha["telefone"] . "</td>" ;
    }
    echo "</tbody></table>";
} else {
    echo "Erro SQL: " . $conexao->error;
}
$conexao->close();
?>
