/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.s2it.exercise8;

/**
 * 8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as
 * seguintes regras:
 * <ul>
 * <li>O primeiro número de C é o primeiro número de A;</li>
 * <li>O segundo número de C é o primeiro número de B; </li>
 * <li>O terceiro número de C é o segundo número de A; </li>
 * <li>O quarto número de C é o segundo número de B; Assim sucessivamente… </li>
 * <li>Caso os números de A ou B sejam de tamanhos diferentes, completar C com o
 * restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser
 * .15012256 </li>
 * <li>Caso C seja maior que 1.000.000, retornar -1</li>
 * Desenvolva um algoritmo que atenda a todos os requisitos acima.
 * </ul>
 *
 * @author Vinicius
 */
public class CreateCValue {

    public int createCValue(int a, int b) {
        StringBuilder cBuilder = new StringBuilder();

        int length;
        int lengthA = String.valueOf(a).length();
        int lengthB = String.valueOf(b).length();

        if (lengthA >= lengthB) {
            length = lengthA;
        } else {
            length = lengthB;
        }

        for (int index = 0; index < length; index++) {
            if (index < lengthA) {
                cBuilder.append(String.valueOf(a).charAt(index));
            }
            if (index < lengthB) {
                cBuilder.append(String.valueOf(b).charAt(index));
            }
        }

        int c = Integer.parseInt(cBuilder.toString());
        System.out.println(c);

        return c < 1000000 ? c : -1;
    }
}
