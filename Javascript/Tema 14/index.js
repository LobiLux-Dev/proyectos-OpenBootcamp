const button = document.querySelector('#button')

button.addEventListener('click', function () {
  alert('Tú me has clickeado!')
})

$(() => {
    $('#button').click(() => {
        console.log('Hola, estoy utilizando jQuery')
    })
})
