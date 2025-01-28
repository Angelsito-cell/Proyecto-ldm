document.getElementById('search-bar').addEventListener('input', function() {
    let filter = this.value.toLowerCase();
    let albums = document.querySelectorAll('.album');

    albums.forEach(function(album) {
        let title = album.querySelector('p').textContent.toLowerCase();
        if (title.includes(filter)) {
            album.classList.remove('hidden');
        } else {
            album.classList.add('hidden');
        }
    });
});