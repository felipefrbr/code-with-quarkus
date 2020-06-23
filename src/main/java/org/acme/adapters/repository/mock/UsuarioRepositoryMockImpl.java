package org.acme.adapters.repository.mock;

import org.acme.app.usuario.Usuario;
import org.acme.app.usuario.UsuarioRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@ApplicationScoped
public class UsuarioRepositoryMockImpl implements UsuarioRepository {

    public static final Map<Long, Usuario> USUARIOS = Collections.synchronizedMap(new LinkedHashMap<>());

    @Override
    public Usuario save(Usuario usuario) {
        final long ID = USUARIOS.size() + 1L;
        usuario.setId(ID);
        USUARIOS.put(ID, usuario);
        return usuario;
    }

}
