<?php
$conexao = new mysqli("localhost", "root", "etec");
$conexao->set_charset("UTF8");
if ($conexao->connect_error) {
    die("Falha ao conectar: " . $conexao->connect_error);
}
if (!$conexao->select_db("agenda")) {
    die("O Banco de dados não existe");
}
$codigo =  $_GET["codigo"];
$sql = "delete from pessoa where codigo = $codigo";
$status = $conexao->query($sql);
if($status == 0){
    echo "Erro ao excluir ".$conexao->error;
}else{
    echo "<script>alert('Excluido com  sucesso')</script>"
    . "<meta HTTP-EQUIV='Refresh' CONTENT='0;URL=lista.php'>";
}
$conexao->close();
?>

