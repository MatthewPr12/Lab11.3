package strategy;

import junit.framework.TestCase;
import org.junit.Before;

public class MailBoxTest extends TestCase {
    protected MailInfo mailInfo;
    protected strategy.Client user;
    protected MailBox mailBox;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        user = new strategy.Client("Matthew", "matvii.prytula@ucu.edu.ua", 18, "male");
        mailInfo = new MailInfo(new Gift(), user);
        mailBox = new MailBox();
    }

    public void testAddMailInfo() {
        mailBox.addMailInfo(mailInfo);
        assert mailBox.infos.size()==1;
    }

    public void testAddClient() {
        mailBox.addClient(user);
        assert mailBox.users.size() == 1;
    }

    public void testSendAll() {
        testAddMailInfo();
        testAddClient();
        mailBox.sendAll();
    }
}