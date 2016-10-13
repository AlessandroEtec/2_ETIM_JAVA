<meta charset="UTF-8">
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
    while ($linha = $resultado->fetch_array()) {
        echo $linha["nome"] . " - " .
        $linha["endereco"] . " - " .
        $linha["cidade"] . " - " .
        $linha["telefone"] . "<br>";
    }
} else {
    echo "Erro SQL: " . $conexao->error;
}
$conexao->close();
?>

