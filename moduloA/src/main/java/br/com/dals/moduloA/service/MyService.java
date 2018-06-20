package br.com.dals.moduloA.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String message() {
        System.out.println("Acessando serviço de outro módulo");
        return "Ok";
    }
}
