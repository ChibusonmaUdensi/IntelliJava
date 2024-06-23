import org.harry.Account;
import org.harry.Bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testAccountName_DoesNotExists() {
        Account account = new Account();
        assertNull(account.getAccountName());
    }


    @Test
    public void testAccountNameExists() {
        Account account = new Account(8888, "33", "Semaj");
        assertNotNull(account.getAccountName());

    }

    @Test
    public void testForDeposit() {
        Account account = new Account(8888, "33", "Semaj");
        account.deposit(5000);
        double balance = account.checkBalance("33");
        assertEquals(balance, 5000);

    }

    @Test
    public void testForWithdraw() {
        Account account = new Account(8888, "33", "Semaj");
        account.deposit(5000);
        double balance = account.checkBalance("33");
        assertEquals(balance, 5000);
        account.withdraw(3000, "33");
        assertEquals(account.checkBalance("33"), 2000);
    }
    @Test
    public void testForTransfer() {
        Account account = new Account (8888, "33", "Semaj");
        account.deposit(5000);
        assertEquals(account.checkBalance("33"), 5000);
        Account account1 = new Account (9999, "45", "Harry");
        account.withdraw(3000, "33");
        account1.deposit(3000);
        assertEquals(account1.checkBalance("45"), 3000);
        assertEquals(account.checkBalance("33"), 2000);
    }
}
