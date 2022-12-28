package strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> infos = new ArrayList<>();
    ArrayList<Client> users = new ArrayList<>();

    public void addMailInfo(MailInfo maiInfo){
        infos.add(maiInfo);
    }

    public void addClient(Client user){
        users.add(user);
    }
    public void sendAll() {
        for(Client user: users){
            for(MailInfo info: infos){
                try{
                MailSender.send(user, info);
                }
                catch (MailjetException|MailjetSocketTimeoutException ex){
                    System.out.println("Mail not sent");
                    System.out.println(ex);
                }
            }
        }
    }
}
