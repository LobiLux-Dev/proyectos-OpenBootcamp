// Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
const datos = {
  nombre: 'Luis',
  apellido: 'Sanchez',
  edad: 16,
  altura: 1.67,
  esDesarrollador: true
}
// Una variable que obtenga tu edad a partir del objeto anterior
let edad = datos.edad
// Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
const lista = [
  { ...datos },
  {
    nombre: 'Polo',
    apellido: 'Muñoz',
    edad: 17,
    altura: 1.78,
    esDesarrollador: true
  },
  {
    nombre: 'Ken',
    apellido: 'Torrez',
    edad: 15,
    altura: 1.72,
    esDesarrollador: true
  }
]
// Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
const listaOrdenada = lista.sort((a, b) => a.edad - b.edad)
