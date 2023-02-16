import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void transaction() {
        Bank bank = new Bank();
        assertEquals(bank.zoneOfTransaction, bank.zoneOfTransaction);
    }

    @Test
    void enterName() {
        Bank bank = new Bank();
        assertEquals(bank.initialsName, bank.initialsName);
        assertEquals(bank.initialsLastName, bank.initialsLastName);
    }

    @Test
    void enterCash() {
        Bank bank = new Bank();
        assertEquals(bank.cash > 0, bank.cash);
    }
}