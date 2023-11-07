package com.example;

import org.jasypt.util.text.BasicTextEncryptor;

public class App {
    public static void main(String[] args) {

            BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
            textEncryptor.setPasswordCharArray("#modalGR#GPTW#top#maiorEmpresaTecnologia#baixadaSantista".toCharArray());

            String senha1 = "senha1docofreletronico";
            String senha2 = "senha2docofreletronico";
            String senha3 = "senha3docofreletronico";
            
            String senhaCriptografada1 = textEncryptor.encrypt(senha1);
            String senhaCriptografada2 = textEncryptor.encrypt(senha2);
            String senhaCriptografada3 = textEncryptor.encrypt(senha3);
           
            System.out.println("Senha 1 criptografa: " + senhaCriptografada1);
            System.out.println("Senha 2 criptografa: " + senhaCriptografada2);
            System.out.println("Senha 3 criptografa: "+ senhaCriptografada3);

           
    }
}
