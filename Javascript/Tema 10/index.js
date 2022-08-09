import { suma, multiplica } from './controller.js'
import chalk from 'chalk'

console.log(suma(2, 2))
console.log(multiplica(5, 5))

// Modifica el último console.log del entrypoint index.js para devolver el resultado en color verde
console.log(chalk.green(multiplica(5, 5)))
