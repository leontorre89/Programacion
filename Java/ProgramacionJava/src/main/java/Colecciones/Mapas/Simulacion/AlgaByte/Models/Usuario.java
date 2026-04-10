package Colecciones.Mapas.Simulacion.AlgaByte.Models;

import Colecciones.Mapas.Simulacion.AlgaByte.Exceptions.MemoryException;

import java.util.Objects;
import java.util.regex.Pattern;

public class Usuario implements Comparable<Usuario>{
    private String login;
    private String password;

    public Usuario(String login, String password) throws MemoryException {
        setLogin(login);
        setPassword(password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws MemoryException{
        if (login.length() >= 6){
            this.login = login;
        }
        else {
            throw new MemoryException("Usuario no es correcto");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws MemoryException{
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        if (password.matches(regex)){
            this.password = password;
        }
        else {
            throw new MemoryException("La clave no cumple alguno de estos requisitos: contiene mayúsuculas, minúsculas y números y tiene 8 o más caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(login, usuario.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login);
    }

    @Override
    public int compareTo(Usuario o) {
        return this.login.compareTo(o.getLogin());
    }
}
