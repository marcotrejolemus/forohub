package api.hub.domain.usuario.validaciones;

import api.hub.domain.usuario.RegistroUsuarioDTO;

public interface ValidadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}