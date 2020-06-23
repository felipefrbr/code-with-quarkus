package org.acme.adapters.rest.to;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class UsuarioTO {
    public Long id;
    public String nome;
    public String email;
    public String login;

    public String senha;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    public LocalDateTime criadoEm;

    @Override
    public String toString() {
        return "UsuarioTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", senha='*****'" +
                '}';
    }
}
