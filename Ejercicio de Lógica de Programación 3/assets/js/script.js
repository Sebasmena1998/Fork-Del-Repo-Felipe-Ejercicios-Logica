
// Creamos la funcion factorial con el parametro valor (Que sera nuestro numero que vamos a calcular el factorial)
function factorial(numero) {
    //Creamos una variable x que es una variable auxiliar donde al entrar al ciclo ira almacenando el valor de las multiplicaciones (la inicializamos con 1 porque si empezara con 0 el valor siempre seria 0).    
    
    var x = 1
    if(Number(numero)==numero) {
    
         //Hacemos un ciclo for con la variable index como contador y va a llegar hasta el valor del factorial
         for (let index = 1; index <= numero; index++) {      
            //Es un algoritmo recursivo porque va a ir cambiando el valor de x segun el ciclo
            x *= index;    
        }
        // Cuando acabe el ciclo for imprimiremos "x" que es el valor del factorial de "valor"
        console.log("Su numero es: "+ numero+ " y su factorial es: "+x);
        //Retornamos x para poder ocupar su valor fuera de la funcion
        return x;
    } else{
    console.error("El valor que ingreso no es un numero entero vuelva a intentarlo");  
    } 
}

// llamamos a la funcion y con un promt solicitamos al usuario el numero que quiere saber su factorial y con el parseInt convertimos el string a un valor numerico;
factorial(parseInt(prompt("Ingrese el numero que quiere saber su factorial")));

//Tuve problemas con el if para el error.

