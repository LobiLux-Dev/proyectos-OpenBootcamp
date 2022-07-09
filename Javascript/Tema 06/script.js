// Una variable que contenga la lista de la compra (mínimo 5 elementos)
const compras = ['Leche', 'Huevo', 'Café', 'Jabón', 'Cloro']
// Modifica la lista de la compra y añádele "Aceite de Girasol"
compras.push('Aceite de Girasol')
// Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
compras.pop()
// Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)
const peliculasFavoritas = [
  {
    titulo: 'Sonic la película',
    directores: ['Jeff Fowler'],
    fecha: new Date(2020, 5, 26)
  },
  {
    titulo: 'Sonic 2',
    directores: ['Jeff Fowler'],
    fecha: new Date(2022, 3, 8)
  },
  {
    titulo: 'Avengers: Endgame',
    directores: ['Anthony Russo', 'Joe Russo'],
    fecha: new Date(2019, 3, 26)
  }
]
// Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)
const peliculasNuevas = peliculasFavoritas.filter(pelicula => pelicula.fecha > new Date(2010, 0, 1))
// Una nueva lista que contenga los directores de la lista de películas original (utilizando map)
const directores = peliculasFavoritas.map(pelicula => pelicula.directores)
// Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)
const peliculas = peliculasFavoritas.map(pelicula => pelicula.titulo)
// Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)
const directores_titulos_concat = directores.concat(peliculas)
// Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)
const directores_titulos_factorDePropagacion = [...directores, ...peliculas]
