package org.acme.adapters.rest;

import org.acme.adapters.rest.to.UsuarioTO;
import org.acme.app.usuario.CriarUsuario;
import org.acme.app.usuario.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);

    @Inject
    private CriarUsuario criarUsuario;

    @POST
    public Response criarUsuario(UsuarioTO usuarioTO) {
        LOGGER.info(String.format("criando usuario %s", usuarioTO));

        Usuario usuario = new Usuario()
                .setNome(usuarioTO.nome)
                .setEmail(usuarioTO.email)
                .setLogin(usuarioTO.login)
                .setSenha(usuarioTO.senha);

        return Response.ok(converterUsuario(criarUsuario.com(usuario))).build();
    }

    private UsuarioTO converterUsuario(Usuario usuario){
        UsuarioTO to = new UsuarioTO();
        to.id = usuario.getId();
        to.nome = usuario.getNome();
        to.email = usuario.getEmail();
        to.login = usuario.getLogin();
        to.criadoEm = usuario.getCriadoEm();
        return to;
    }
}