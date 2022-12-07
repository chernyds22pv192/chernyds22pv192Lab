package tech.reliab.course.chernyds.bank.service;

import tech.reliab.course.chernyds.bank.entity.PaymentAccount;
import tech.reliab.course.chernyds.bank.entity.User;


public interface PaymentAccountService {
    /**
     *
     * @param user - клиент
     * @param bankName - имя банка
     * @return - возвращает созданный объект платежный счет
     */
    PaymentAccount create(User user, String bankName);
    PaymentAccount read();
    void update(PaymentAccount paymentAccount);
    void delete(PaymentAccount paymentAccount);
}
