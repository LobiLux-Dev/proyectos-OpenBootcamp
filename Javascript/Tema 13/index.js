// Una cadena de texto con tu Nombre
const name = "Luis"
// Otra cadena de texto con tu Apellido
const surname = "Sanchez"
// Una cadena de texto que se llame "estudiante" concatenando tu Nombre y tu Apellido con un espacio entre medias
const estudiante = `${name} ${surname}`
// Una cadena de texto que se llame "estudianteMayus" que contenga la cadena estudiante pero todo en mayúsculas
const estudianteMayus = estudiante.toUpperCase()
// Una cadena de texto que se llame "estudianteMinus" que contenga la cadena estudiante pero todo en minúsculas
const estudianteMinus = estudiante.toLowerCase()
// Una variable que contenga el número de letras de la cadena "estudiante" contando los espacios
const estudianteLength = estudiante.length
// Una variable que contenga la primera letra del Nombre
const flname = estudiante[0]
// Otra variable que contenga la última letra del Apellido
const llsurname = estudiante[estudiante.length - 1]
// Una cadena de texto que elimine los espacios de la variable "estudiante"
const estudianteCutSpaces = estudiante.replace(" ", "")
// Una variable booleana que diga si el Nombre está contenido en la variable "estudiante"
const isIncluded = estudiante.includes(name)
