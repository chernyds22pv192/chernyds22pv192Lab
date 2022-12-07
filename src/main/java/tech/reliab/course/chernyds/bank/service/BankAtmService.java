package tech.reliab.course.chernyds.bank.service;

import tech.reliab.course.chernyds.bank.entity.Bank;
import tech.reliab.course.chernyds.bank.entity.BankAtm;
import tech.reliab.course.chernyds.bank.entity.BankOffice;
import tech.reliab.course.chernyds.bank.entity.Employee;

public interface BankAtmService {
    /**
     *
     * @param name - назание банкомата
     * @param bank - банк
     * @param bankOffice - офис банка
     * @param employee - обслуживающий сотрудник
     * @param maintenance - стоимость обслуживания
     * @return - возвращает созданный объект банкомат
     */
    BankAtm create(String name, Bank bank, BankOffice bankOffice, Employee employee, double maintenance);

    BankAtm read();
    void update(BankAtm bankAtm);
    void delete(BankAtm bankAtm);

}
