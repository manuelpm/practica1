<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>inicio de sesion</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body style="background:lemonchiffon ;margin:0">
    <h1>INICIO DE SESION</h1>
    
    <H2>USUARIO:</H2>
    
    <form action="emailList" method="post">        
        <input type="hidden" name="action" value="add">          
        <label class="pad_top">codigo:</label>        
        <input type="text" name="codigo" required><br>        
        <label class="pad_top">nombre:</label>        
        <input type="text" name="nombre" required><br>        
        <label class="pad_top">apellidos:</label>        
        <input type="text" name="apellido" required><br>
         <label class="pad_top">email:</label>     
        <input type="email" name="email" required><br>
        <label>&nbsp;</label> 
        <input type="reset">
        <input type="submit" value="ingresar" class="margin_left"> 
        
        
    </form> 
</body>
</html>