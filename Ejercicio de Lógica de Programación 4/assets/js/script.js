// Empezamos llamando la funcion fibonacci con un prompt y un parseint, que va a ser el de de los numero que se quiere ver de la serie fibonacci
fibonacci(parseInt(prompt("Ingrese el numero de digitos que quiere ver de la Sucesión de Fibonacci")));

// Creamos la funcon fibonacci y el para metro numero que va a ser el que ingreso el usuario con el prompt
function fibonacci(numero) {

    //Creamos la condicional if para asegurarnos que el valor sea un numero 
    if (Number(numero) == numero) {
        // Creamos las variables auxiliares 'x' y 'y' que nos van a ayudar a hacer las operaciones
        var x = 0;
        var y = 1;
        // Creamos un array que es donde vamos a guardar la serie para imprimirlo de manera corrida
        var array = [0,1];
        // Como el array tiene por default 2 valores el numero que ingreso el usuario se le va a restar para que muestre los numero que desea.
        numero = numero - 2

        // En el caso que dese ver solo el primer digito de la sucesion que es 0 creamos un caso,
        if (numero < 0) {
            console.log(array[0]);
        } else {

            // En caso de que sea normal creamos un ciclo for donde se haran los calculos de la sucecion
            for (let i = 0; i < numero; i++) {

                var z = x + y;
                x = y;
                y = z;

                // Despues de hacer los calculos usamos el metodo push para agregar cada dato al array
                array.push(z);
            }
            // Terminamos imprimiendo todo el array
            console.log(array);
        }
        // Un else para el primer if en caso de que el numero ingresado no sea un numero;
    } else {
        console.log("No es un numero valido, vuelva a intentarlo");
    }
}