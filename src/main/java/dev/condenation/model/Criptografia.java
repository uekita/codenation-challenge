package dev.condenation.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Criptografia {
    public int numeroCasas;
    public String token;
    public String cifrado;
    public String decifrado;
    public String resumoCriptografico;

    public int getNumeroCasas() {
        return numeroCasas;
    }

    public Criptografia setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Criptografia setToken(String token) {
        this.token = token;
        return this;
    }

    public String getCifrado() {
        return cifrado;
    }

    public Criptografia setCifrado(String cifrado) {
        this.cifrado = cifrado;
        return this;
    }

    public String getDecifrado() {
        return decifrado;
    }

    public Criptografia setDecifrado(String decifrado) {
        this.decifrado = decifrado;
        return this;
    }

    public String getResumoCriptografico() {
        return resumoCriptografico;
    }

    public Criptografia setResumoCriptografico(String resumoCriptografico) {
        this.resumoCriptografico = resumoCriptografico;
        return this;
    }
}
