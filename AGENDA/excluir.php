<?php
include ("conexao.php");
$conexao = conectar();
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

