package SOLID.LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public interface Account {

    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount);

}
