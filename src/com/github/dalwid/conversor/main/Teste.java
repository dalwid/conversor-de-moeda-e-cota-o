package com.github.dalwid.conversor.main;

import com.github.dalwid.conversor.http.Converter;

import java.io.IOException;

public class Teste {
    public static void main(String[] args) throws IOException, InterruptedException {
        Converter converter = new Converter();
        System.out.println(converter.convertAnyCoinsAndReverse("USD", "BRL", 100));
    }
}
