// Se crea una funcion para nuestro juego donde pedimos por un promp el valor con el que vamos a intentar

numSecreto(parseInt(prompt("Intente adivinar cual es el número secreto.")))


function numSecreto(numero) {
    // Con la Var secreto le asignamos un valor al azar entre el 1 y el 100 y con .round redondeamos para que sea un valor entero
    var secreto = Math.round(Math.random() * 100);
    // Creamos la var intentosPasados para imprimir la lista de numeros intentados
    var intentosPasados = [];
    
    //console.log(secreto); Para el programador.
    // Se crea la var detener que vamos a ocupar para detener el ciclo en caso de rendirse
    var detener = false
   
    // Con una condicional if comprobamos que el valor ingresado sea un numero
    if (Number(numero) == numero) {
        // Una condicional para asegurarnos que el valor sea entre 1 y 100
        if ((numero>100) && (numero<1)) {
            console.error("Lo siento solo se permiten numero entre 1 y 100");
        } else {
            // Usaremos un ciclo while para hacer que se repita el juego hasta que se atine el numero
            while (numero != secreto && detener == false) {

                // Con push iremos agregando el valor a un array para ver los numero que ya se jugaron
                intentosPasados.push(numero);
                console.log("Numeros intentados " + intentosPasados);
                numero = parseInt(prompt("Ups, el número secreto es incorrecto, vuelve a intentarlo."));
                // para tener la opcion de detenerse antes de ganar el juego un condicional if para que al picar cancelar con el promp se detenga el juego
                if (Number(numero)!==numero) {
                    console.log("Vaya parece que te rendiste");
                    detener=true;

                }
            }
            // Mensaje para que al detnerse el while es que el numero propuesto y el secreto son iguales pero con el condicional if aseguramos que este mensaje no se imprima al "rendirse".
            if (detener== false) {
                console.log("Felicidades, adivinaste el número secreto.");
            }else{
        }

        }

        // Continuacion del if para asegurar que el valor sea un numero, en caso de ser un String o NaN imprimira este mensaje
    } else {
        console.error("El dato que ingreso no es tiene un valor numerico, por favor vuelva a intentarlo. ");
    }
}


// Corregir los casos que vuelven infinito el juego
