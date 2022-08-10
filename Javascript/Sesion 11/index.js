class Estudiante {
    #nombre
    #asignaturas = [ 'JavaScript', 'HTML', 'CSS' ]

    constructor(nombre) {
        this.#nombre = nombre
    }

    obtenDatos() {
        return {
            nombre: this.#nombre,
            asignaturas: this.#asignaturas
        }
    }
}

const estudiante = new Estudiante('Luis')
console.log(estudiante.obtenDatos())