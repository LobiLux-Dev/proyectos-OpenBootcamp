const trash = document.querySelector('.trash')
const sections = document.querySelectorAll('.section')
const draggables = document.querySelectorAll('.draggable')

draggables.forEach(draggable => {
  draggable.addEventListener('dragstart', event => {
    trash.classList.remove('hidden')
    event.dataTransfer.setData('id', draggable.id)
  })

  draggable.addEventListener('dragend', () => trash.classList.add('hidden'))
})

sections.forEach(section => {
  section.addEventListener('dragover', event => {
    event.preventDefault()
    event.dataTransfer.dropEffect = 'move'
  })

  section.addEventListener('drop', event => {
    const id = event.dataTransfer.getData('id')
    const draggable = document.getElementById(id)
    section.appendChild(draggable)
  })
})

trash.addEventListener('dragenter', () => trash.classList.remove('drag'))
trash.addEventListener('dragleave', () => trash.classList.add('drag'))
trash.addEventListener('dragover', event => {
  event.preventDefault()
  event.dataTransfer.dropEffect = 'move'
})
trash.addEventListener('drop', event => {
  const id = event.dataTransfer.getData('id')
  const draggable = document.getElementById(id)
  draggable.remove()
})
