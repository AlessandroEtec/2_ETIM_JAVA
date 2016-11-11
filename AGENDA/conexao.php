<?php

function conectar() {
    $conexao = new mysqli("localhost", "root", "etec");
    $conexao->set_charset("UTF8");
    if ($conexao->connect_error) {
        die("Falha ao conectar: " . $conexao->connect_error);
    }
    if (!$conexao->select_db("agenda")) {
        die("O Banco de dados não existe");
    }
    return $conexao;
}
