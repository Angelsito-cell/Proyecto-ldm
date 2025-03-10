document.getElementById('search-bar').addEventListener('input', function() {
    let filter = this.value.toLowerCase();
    let albums = document.querySelectorAll('.album');

    albums.forEach((album, index) => {
        let title = album.querySelector('p').textContent.toLowerCase();
        if (title.includes(filter)) {
            album.classList.remove('hidden');
            album.style.order = 0; // Colocar los elementos coincidentes arriba
        } else {
            album.classList.add('hidden');
            album.style.order = 1 + index; // Mantener el orden original para los elementos no coincidentes
        }
    });
});