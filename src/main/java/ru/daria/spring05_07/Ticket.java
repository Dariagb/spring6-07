package ru.daria.spring05_07;

import lombok.Data;

import java.time.LocalDateTime;

//Создать класс Ticket (не бин!!!) с полями:
//        2.1. String number - номер тикета
//2.2. LocalDateTime createdAt - дата создания
//2.3. ... (любые другие поля)
@Data
public class Ticket {
    private String number;
    private LocalDateTime createdAt;

    public Ticket(String number, LocalDateTime createdAt) {
        this.number = number;
        this.createdAt = createdAt;
    }
}
