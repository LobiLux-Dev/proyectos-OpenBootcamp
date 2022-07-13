// Instala la dependencia Winston
const winston = require('winston')

const logger = winston.createLogger({ transports: [new winston.transports.File({ filename: 'error.log' })] })
// En el archivo index.js crea una función que devuelva un error con un mensaje personalizado
const forzarError = () => {
  throw new Error('Este es un error personalizado')
}
// Registra el error en un archivo a través de un try...catch
try {
  forzarError()
} catch (err) {
  logger.error(`${err}`)
} finally {
  console.log('Fin ;)')
}
