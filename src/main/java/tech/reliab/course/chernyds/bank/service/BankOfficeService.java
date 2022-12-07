package tech.reliab.course.chernyds.bank.service;

import tech.reliab.course.chernyds.bank.entity.Bank;
import tech.reliab.course.chernyds.bank.entity.BankOffice;

public interface BankOfficeService {
    /**
     *
     * @param name - имя офиса
     * @param bank - банк офиса
     * @param address - адрес офиса
     * @param rent - стоимость аренды офиса
     * @return - возвращает созданный объект офис
     */
    BankOffice create(String name, Bank bank, String address, double rent);
    BankOffice read();
    void update(BankOffice bankOffice);
    void delete(BankOffice bankOffice);
}
