package com.github.dalwid.conversor.assembler;

import com.github.dalwid.conversor.http.Converter;
import com.github.dalwid.conversor.model.Coin;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Converter converte = new Converter();
    Coin chosen = new Coin();

    private final String menu = """                
                *******************************************
                Seja bem-vindo/a ao conversor de Moeda
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar =>> Peso comlobiano
                6) peso comlombiano =>> Dólar
                7) Sair
                *******************************************
                """;


    Scanner ler = new Scanner(System.in);
    Scanner valor = new Scanner(System.in);
    private String opcao = null;

    public void menu() throws IOException, InterruptedException {

        do {
            System.out.println(menu);
            opcao = ler.nextLine();

            if (opcao.equals("7")) {
                System.out.println("Você escolheu sair");
                break;
            }

            System.out.println("Digite o valor que deseja converter");
            double value = valor.nextDouble();

            switch (opcao) {
                case "1":
                    chosen = new Coin(
                            converte.convertAnyCoinsAndReverse("USD", "ARS", value).baseCode(),
                            converte.convertAnyCoinsAndReverse("USD", "ARS", value).targetCode(),
                            converte.convertAnyCoinsAndReverse("USD", "ARS", value).conversionRate(),
                            converte.convertAnyCoinsAndReverse("USD", "ARS", value).conversionResult(),
                            value
                    );

                    chosen.setTargetCode(converte.convertAnyCoinsAndReverse("USD", "ARS", value).targetCode());

                    System.out.println("Valor " + chosen.getValue() + " " + chosen.getBaseCode() +
                            " corresponde ao valor de =>> " + chosen.getConversionResult()+" "+chosen.getTargetCode());

                    break;

                case "2":
                    chosen = new Coin(
                            converte.convertAnyCoinsAndReverse("ARS", "USD", value).baseCode(),
                            converte.convertAnyCoinsAndReverse("ARS", "USD", value).targetCode(),
                            converte.convertAnyCoinsAndReverse("ARS", "USD", value).conversionRate(),
                            converte.convertAnyCoinsAndReverse("ARS", "USD", value).conversionResult(),
                            value
                    );

                    chosen.setTargetCode(converte.convertAnyCoinsAndReverse("ARS", "USD", value).targetCode());

                    System.out.println("Valor " + chosen.getValue() + " " + chosen.getBaseCode() +
                            " corresponde ao valor de =>> " + chosen.getConversionResult()+" "+chosen.getTargetCode());
                    break;

                case "3":
                    chosen = new Coin(
                            converte.convertAnyCoinsAndReverse("USD", "BRL", value).baseCode(),
                            converte.convertAnyCoinsAndReverse("USD", "BRL", value).targetCode(),
                            converte.convertAnyCoinsAndReverse("USD", "BRL", value).conversionRate(),
                            converte.convertAnyCoinsAndReverse("USD", "BRL", value).conversionResult(),
                            value
                    );

                    chosen.setTargetCode(converte.convertAnyCoinsAndReverse("USD", "BRL", value).targetCode());

                    System.out.println("Valor " + chosen.getValue() + " " + chosen.getBaseCode() +
                            " corresponde ao valor de =>> " + chosen.getConversionResult()+" "+chosen.getTargetCode());
                    break;

                case "4":
                    chosen = new Coin(
                            converte.convertAnyCoinsAndReverse("BRL", "USD", value).baseCode(),
                            converte.convertAnyCoinsAndReverse("BRL", "USD", value).targetCode(),
                            converte.convertAnyCoinsAndReverse("BRL", "USD", value).conversionRate(),
                            converte.convertAnyCoinsAndReverse("BRL", "USD", value).conversionResult(),
                            value
                    );

                    chosen.setTargetCode(converte.convertAnyCoinsAndReverse("BRL", "USD", value).targetCode());

                    System.out.println("Valor " + chosen.getValue() + " " + chosen.getBaseCode() +
                            " corresponde ao valor de =>> " + chosen.getConversionResult()+" "+chosen.getTargetCode());

                    break;

                case "5":
                    chosen = new Coin(
                            converte.convertAnyCoinsAndReverse("USD", "COP", value).baseCode(),
                            converte.convertAnyCoinsAndReverse("USD", "COP", value).targetCode(),
                            converte.convertAnyCoinsAndReverse("USD", "COP", value).conversionRate(),
                            converte.convertAnyCoinsAndReverse("USD", "COP", value).conversionResult(),
                            value
                    );

                    chosen.setTargetCode(converte.convertAnyCoinsAndReverse("USD", "COP", value).targetCode());

                    System.out.println("Valor " + chosen.getValue() + " " + chosen.getBaseCode() +
                            " corresponde ao valor de =>> " + chosen.getConversionResult()+" "+chosen.getTargetCode());
                    break;

                case "6":
                    chosen = new Coin(
                            converte.convertAnyCoinsAndReverse("COP", "USD", value).baseCode(),
                            converte.convertAnyCoinsAndReverse("COP", "USD", value).targetCode(),
                            converte.convertAnyCoinsAndReverse("COP", "USD", value).conversionRate(),
                            converte.convertAnyCoinsAndReverse("COP", "USD", value).conversionResult(),
                            value
                    );

                    chosen.setTargetCode(converte.convertAnyCoinsAndReverse("COP", "USD", value).targetCode());

                    System.out.println("Valor " + chosen.getValue() + " " + chosen.getBaseCode() +
                            " corresponde ao valor de =>> " + chosen.getConversionResult()+" "+chosen.getTargetCode());
                    break;

                default:
                    System.out.println("Não há essa opção neste conversor");
                    break;
            }

        } while (!opcao.equals("7"));
    }

}
