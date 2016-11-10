<?php
$codigo = $_GET["codigo"];

$conexao = new mysqli("localhost", "root", "etec");
$conexao->set_charset("UTF8");
if ($conexao->connect_error) {
    die("Falha ao conectar: " . $conexao->connect_error);
}
if (!$conexao->select_db("agenda")) {
    die("O Banco de dados não existe");
}
$sql = "SELECT * FROM pessoa where codigo = $codigo";
$resultado = $conexao->query($sql);
if ($resultado) {
    $linha = $resultado->fetch_array();
    $nome = $linha["nome"];
    $endereco = $linha["endereco"];
    $cidade = $linha["cidade"];
    $telefone =  $linha["telefone"];
}
?>
<form method="GET" action="alterar.php">
    <input type="hidden" name="codigo" value="<?=$codigo?>" >
    Nome: <input type="text" name="nome" value="<?=$nome?>"><br>
    Endereço: <input type="text" name="endereco" value="<?=$endereco?>"><br>
    Cidade: <input type="text" name="cidade" value="<?=$cidade?>"><br>
    Telefone: <input type="text" name="fone" value="<?=$telefone?>"><br>
    <input type="submit" value="Alterar">
</form>

