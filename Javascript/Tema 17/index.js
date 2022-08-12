let markers, map

function initMap() {
  const posicion = {
    lat: 40.416593,
    lng: -3.7047994
  }

  map = new google.maps.Map(document.getElementById('map'), {
    zoom: 4,
    center: posicion
  })

  markers.push(
    new google.maps.Marker({
      position: {
        lat: 40.416593,
        lng: -3.7047994
      },
      map,
      title: 'Madrid'
    })
  )
  markers.push(
    new google.maps.Marker({
      position: {
        lat: 23.3142771,
        lng: -111.6404071
      },
      map,
      title: 'México'
    })
  )
  markers.push(
    new google.maps.Marker({
      position: {
        lat: 33.1926767,
        lng: 128.1527297
      },
      map,
      title: 'El Palmar'
    })
  )
}
