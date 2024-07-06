package ru.daria.spring05_07;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

//1. Класс TicketNumberGenerator - бин (синглтон), у которого есть метод createNewNumber()
//        1.1 Метод createNewNumber возвращает строки вида "Ticket #X", где X - UUID (UUID.randomUUID().toString())
//
//Пример:
//TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
//System.out.println(generator.createNewNumber()); // "Ticket #b0b3a25d-2135-4b18-9dec-08d494b96b06"
//        System.out.println(generator.createNewNumber()); // "Ticket #379c5673-50c3-4daf-a53f-a396a3d34535"
//        System.out.println(generator.createNewNumber()); // "Ticket #b4cc4e55-69b2-4c49-867f-09735fea292a"

@Data
@Component
@Scope("singleton")
public class TicketNumberGenerator {

    public String createNewNumber() {
        return "Ticket #" + UUID.randomUUID().toString();
    }
}
