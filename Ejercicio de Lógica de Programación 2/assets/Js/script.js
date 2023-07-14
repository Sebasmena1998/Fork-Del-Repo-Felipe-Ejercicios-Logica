// Creamos unas cariables constantes que nos ayudaran a las conversiones de temperatura
const convercionKelvin = 273.15;
const convercionFahrenheit1 = 1.8;
const convercionFahrenheit2 = 32;


// Creamos un ciclo while con una condicional if donde en caso de que el valor ingresado no sea numerico nos mostrara un error en pantalla para evitar mal funcionamiento.
while (true) {
const  tempCelcius = parseFloat(prompt('Ingrese su temperatura en Celcius'));
  if (isNaN(tempCelcius)) {
    alert("Error al ingresar el dato");
    alert("Ingreso mal el dato, corrobore que solo haya ingresado numeros.\nLos signos y letras no son datos permitidos. ")
    break;
    // En caso de que si sea un valor 'number'`accede a este else donde...
} else {

    // Se crea una variable para la temperatura en Farenheit y hace las conversiones
    const tempFarenheit = ((tempCelcius*convercionFahrenheit1)+ convercionFahrenheit2);

    // Se crea una variable para la temperatura en Kelvin y hace las conversiones
    const tempKelvin = (tempCelcius + convercionKelvin);

    // Se imprimen las dos temperaturas en consola.
    console.log("Grados Fahrenheit: " + tempFarenheit);
    console.log("Grado Kelvin: " + tempKelvin);
    
    break;

}
}