package com.techproed.SpringBootJWT_Study;



public class AuthenticationResponse { // App gelen token'u saklayacak class

    // Bu class'tan create edilen obje app'den gelen token'ı bulunduracak,

    private final String jwt;

    public AuthenticationResponse(String jwt) { // final jwt initialize etmek için cons create edildi.
        this.jwt = jwt;
    }


    public String getJwt() { // App'den gelen token validate metodunda onaylanması için okunması lazım bunun için getter method create edildi
        return jwt;
    }


}
