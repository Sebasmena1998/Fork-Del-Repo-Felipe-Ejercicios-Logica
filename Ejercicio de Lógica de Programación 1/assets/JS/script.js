// Solicitamos los 3 datos que nos piden mediante un prompt con la funcion parseInt convertimos los datos a numericos y por ultimo los asignamos a una variable

const num1 = parseInt( prompt("Inserte el primer dato"));
const num2 = parseInt( prompt("Inserte el segundo dato"));
const num3 = parseInt( prompt("Inserte el tercer dato"));


// los 3 datos los asignamos a un array

var conjunto = [num1,num2,num3];

// Con el metodo Sort acomodamos los datos del array de menor a mayor
conjunto.sort(function(a,b){return a - b;});
// Imprimimos el array con los datos de menor a mayor
console.log(conjunto);

// Nuevamente con el metodo Sort acomodamos los datos del array de mayor a menor
conjunto.sort(function(a,b){return b - a;});
// Volvemos a imprimir los datos del array pero esta vez ya de mayor a menor
console.log(conjunto);



// Creamos unas condicionales if donde analizaran si los datos son iguales e imprimiran un mensaje en caso de que alguno de los datos sean iguales.
if (num1== num2 && num1 == num3) {
    console.log("Los tres numeros son iguales");
}else if (num1 == num2) {
    console.log("El primer dato y el segundo son iguales");

}else if(num2 == num3){
console.log("El segundo dato y el tercer son iguales");


}else if (num1 == num3){
console.log("El primer dato y el tercer son iguales");

}

