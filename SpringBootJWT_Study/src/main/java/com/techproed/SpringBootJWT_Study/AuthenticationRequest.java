package com.techproed.SpringBootJWT_Study;




public class AuthenticationRequest { // app'e username ve password içeren bir request göndermek için bu class create edildi.

    private String username;

    private  String password;


    public AuthenticationRequest() {

    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
