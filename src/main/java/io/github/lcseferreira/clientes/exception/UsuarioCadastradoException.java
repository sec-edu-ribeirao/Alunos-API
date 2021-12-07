package io.github.lcseferreira.clientes.exception;

public class UsuarioCadastradoException extends RuntimeException{

    public UsuarioCadastradoException() {
        super("Usuário já cadastrado");
    }
}
