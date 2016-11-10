
<?php
include ("conexao.php");
$conexao = conectar();
$nome = $_GET["nome"];
$endereco = $_GET["endereco"];
$cidade = $_GET["cidade"];
$fone = $_GET["fone"];

$sql = "INSERT INTO pessoa(nome, endereco, cidade, telefone)" .
        "VALUES('$nome','$endereco','$cidade','$fone')";
$status = $conexao->query($sql);
if ($status == 0) {
    echo "Erro ao inserir: " . $conexao->error;
} else if ($status == 1) {
    echo "<script>alert('Incluido com Sucesso')</script>"
    . "<meta HTTP-EQUIV='Refresh' CONTENT='0;URL=index.php'>";
}
$conexao->close();
?>

