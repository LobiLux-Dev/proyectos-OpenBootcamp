// Una función sin parámetros que devuelva siempre "true"
const trueAllways = () => true
// Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado
const asyncFunction = async () => setTimeout(() => console.log('Hola soy una promesa'), 5000)
// Una función generadora de índices pares automáticos
function* generateID() {
  for (let id = 0; ; id += 2) {
    yield id
  }
}
