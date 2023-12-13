async function obtenerUsuarios() {
    try {
        const response = await fetch('http://localhost:8080/api/usuarios');
        const usuarios = await response.json();
        
        const listaUsuarios = document.getElementById('listaUsuarios');
        listaUsuarios.innerHTML = '';
        
        usuarios.forEach(usuario => {
            const li = document.createElement('li');
            li.textContent = `ID: ${usuario.id} - Nombre: ${usuario.nombre} - Email: ${usuario.email}`;
            listaUsuarios.appendChild(li);
        });
    } catch (error) {
        console.error('Error al obtener usuarios:', error);
    }
}

window.onload = obtenerUsuarios;
