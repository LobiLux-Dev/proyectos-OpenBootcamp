// La fecha de hoy
const fechaHoy = new Date()
// La fecha de tu nacimiento
const fechaNacimiento = new Date(2005, 08, 05)
// Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
let esTarde = fechaHoy > fechaNacimiento
// Una variable que contenga el día de tu nacimiento
let dia = fechaNacimiento.getDate()
// Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
let mes = fechaNacimiento.getMonth() + 1
// Una variable que contenga el año de tu nacimiento (con 4 dígitos)
let año = fechaNacimiento.getFullYear()
