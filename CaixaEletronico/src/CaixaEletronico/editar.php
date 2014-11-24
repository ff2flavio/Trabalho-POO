<?php
  $arquivo = $_POST['file'] . ".txt";
  $arquivo = file("$arquivo");

  echo "<form action=\"gravar.php\" id=\"form\" name=\"form\" method=\"post\">";
  echo "Alterando o conteudo de " . $_POST['file'] . ".txt:<br /><textarea name=\"texto\" rows=\"20\" cols=\"90\">";
  foreach($arquivo as $texto) {
    echo "$texto";
  }
  echo "</textarea><br />";
  echo "<input type=\"hidden\" name=\"file\" value=\"" . $_POST['file'] . "\" />";
  echo "<input type=\"submit\" value=\"Enviar\">";
  echo "</form>";
?>