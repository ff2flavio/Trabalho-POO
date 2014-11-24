<?php
  $arquivo = $_POST['file'] . ".txt";
  $texto = $_POST["texto"];

  if (is_writable($arquivo)) {
    $manipular = fopen("$arquivo", 'w+');

    if (!$manipular) {
      echo "Erro<br /><br />Não foi possível abrir o arquivo.";
    } else {
      if (!fwrite($manipular, $texto)) {
        echo "Erro<br /><br />Não foi possível gravar as informações no arquivo.";
      } else {
        echo "O texto foi gravado com sucesso!";
      } // if !fwrite

      fclose($manipular);
    } // if !$manipular
  } else {
    echo "O $arquivo não tem permissões de leitura e/ou escrita.";
  } // if is_writable
?>