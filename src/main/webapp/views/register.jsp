<!DOCTYPE html>
<html>
  <head>
    <title>Register</title>
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
    <form action="/save" method="POST">
      <fieldset>

    <table align="center">
      <h1 style="text-align: center;">Register Page</h1>
      <tr>
        <td>Name:</td>
        <td><input type="text" name="name"></td>
      </tr>

      
        <tr>
        <td>Email:</td>
        <td><input type="email" name="email"></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><input type="password" name="psw"></td>
      </tr>

      <tr>
        <td>Address:</td>
        <td><input type="text" name="addr"></td>
      </tr>


      <tr>
        <td><input type="reset" value="Reset"></td>
        <td><input type="submit" value="Register"></td>
      </tr>
      <tr>
        <td></td>
        <td><button><a href="/">Login</a></button></td>

    </tr>
    </table>
  </fieldset>
</form>
  </body>
</html>