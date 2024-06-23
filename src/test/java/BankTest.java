import org.harry.Account;
import org.harry.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {

    @Test
    public void testBankExists(){
        Bank bank = new Bank();
        assertNotNull(bank);
    }

    @Test
    public void testForDeposit() {
        Bank bank = new Bank();
        Account account = new Account(8888, "33", "Semaj");
        bank.addAccount(account);
        bank.deposit(9000, 8888);
        double balance = account.checkBalance("33");
        assertEquals(balance, 9000);
    }

    @Test
    public void testForWithdraw(){
        Bank bank = new Bank();
        Account account = new Account(8888, "33", "Semaj");
        bank.addAccount(account);
        bank.deposit(9000, 8888);
        double balance = account.checkBalance("33");
        assertEquals(balance, 9000);
        bank.withdraw(8888, 3000, "33");
        balance = account.checkBalance("33");
        assertEquals(balance, 6000);
        }



    @Test
    public void testForTransfer() {
        Bank bank = new Bank();
        Account account = new Account(8888, "33", "Semaj");
        bank.addAccount(account);
        Account account2 = new Account(3333, "90", "Ratta");
        bank.addAccount(account2);
        bank.deposit(40000, 8888);
        assertEquals(account.checkBalance("33"), 40000);
        bank.withdraw(8888, 30000, "33");
        bank.deposit(30000, 3333);
        assertEquals(account2.checkBalance("90"), 30000);
    }
    }

