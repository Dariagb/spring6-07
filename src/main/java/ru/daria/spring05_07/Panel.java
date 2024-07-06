package ru.daria.spring05_07;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//Класс "Табло" - бин (синглтон), у которого есть поле ticketNumberGenerator
//и метод метод newTicket(), который создает объетк класса Ticket со значениями полей:
//3.1 number - результат вызова TicketNumberGenerator#createNewNumber
//3.2 createdAt - LocalDateTime.now()
//3.3 .
@Component
@Data
public class Panel {
    private final TicketNumberGenerator ticketNumberGenerator;

    @Autowired
    public Panel(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        String number = ticketNumberGenerator.createNewNumber();
        LocalDateTime createdAt = LocalDateTime.now();
        return new Ticket(number, createdAt);
    }
}




