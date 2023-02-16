<!DOCTYPE html>
<html>
  <head>
    <title>Login</title>
    <style>
      h1{
        padding: auto;
      
      }
      fieldset{
  border: 1px solid rgb(133, 57, 255);
  width: 200px;
  margin:auto;
}

form
{
    text-align: center;

}
    </style>
   
  </head>
  <body>
    <form action="/login" method="post">
      <fieldset>

    <table align="center">
      <h1 style="text-align: center;">Login</h1>

      <c:if test="${not empty error}">
        <tr><h6>${error}</h6></tr>
      </c:if>

      <c:if test="${not empty error}">
        <tr><h6>${error2}</h6></tr>
      </c:if>
      
        <tr>
        <td>Email:</td>
        <td><input type="email" name="email"></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><input type="password" name="psw"></td>
      </tr>
      <tr>
        <td><input type="reset" value="Reset"></td>
        <td><input type="submit" value="Login"></td>
      </tr>
      <tr>
        <td><button><a href="/home">Home</a></button></td>
        <td><button><a href="/register">Regiter</a></button></td>
    </tr>
    </table>
  </fieldset>
</form>
  </body>
</html>