package com.exampleTDD.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
public class TestClassConvert {
    @Test
    public void ConversaoTemperatura() throws Exception{
        //instaciar a classe a ser testada
        ConvertTemp convertTemp = new ConvertTemp();
        //atribuindo valor a variável
        double celsius = 36.6;
        double resposta = convertTemp.conversor(celsius);
        //teste
        Assertions.assertEquals(98, Math.round(resposta));

    }
}
