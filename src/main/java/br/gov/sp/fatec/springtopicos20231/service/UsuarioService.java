package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.Usuario;
import br.gov.sp.fatec.springtopicos20231.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository UsuarioRepository;

    public Usuario novoUsuario(Usuario usuario){
        if(usuario == null 
                || usuario.getNome() == null
                || usuario.getSenha() == null){
                throw new IllegalArgumentException("usuario e senha invalidos");
    }
    return UsuarioRepository.save(usuario);
}

public List<Usuario> buscarTodosUsuarios(){
    return UsuarioRepository.findAll();
}

}