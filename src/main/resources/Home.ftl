<!DOCTYPE html>
<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

<table>
  <tr>
    <th>Fecha</th>
    <th>Juego</th>
    <th>Monto Invertido</th>
	<th>Monto Ganado</th>
  </tr>
  <#list juegos as juego>
  <tr>
    <td>${juego.fecha}</td>
      <td>${juego.jugada}</td>
      <td>${juego.montoApostado}</td>
      <td>${juego.montoGanado}</td>
    </tr>
  </#list>
</table>

</body>
</html>