package org.acme.app.usuario;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;

@ApplicationScoped
public class CriarUsuario {

    @Inject
    private UsuarioRepository usuarioRepository;

    public Usuario com(Usuario usuario){
        usuario.setCriadoEm(LocalDateTime.now());
        return usuarioRepository.save(usuario);
    }

}
