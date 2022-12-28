package strategy;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;


public class MailSender {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        Client user = new Client("Matthew", "matvii.prytula@ucu.edu.ua", 18, "male");
        MailInfo mailInfo = new MailInfo(new Gift(), user);
            MailjetClient client;
            MailjetRequest request;
            MailjetResponse response;
            client = new MailjetClient("b50ff2d6d244d8ba50cfe8b00eb1abd6", "f78b6dc1d307d51b25b35da34ec5a52e", new ClientOptions("v3.1"));
            request = new MailjetRequest(Emailv31.resource)
                    .property(Emailv31.MESSAGES, new JSONArray()
                            .put(new JSONObject()
                                    .put(Emailv31.Message.FROM, new JSONObject()
                                            .put("Email", "matvii.prytula@ucu.edu.ua")
                                            .put("Name", "Matthew"))
                                    .put(Emailv31.Message.TO, new JSONArray()
                                            .put(new JSONObject()
                                                    .put("Email", user.getEmail())
                                                    .put("Name", user.getName())))
                                    .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
                                    .put(Emailv31.Message.TEXTPART, "My first Mailjet email")
                                    .put(Emailv31.Message.HTMLPART, mailInfo.generate())
                                    .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
            response = client.post(request);
            System.out.println(response.getStatus());
            System.out.println(response.getData());
    }
    public static void send(Client user, MailInfo mailInfo)  throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("b50ff2d6d244d8ba50cfe8b00eb1abd6", "f78b6dc1d307d51b25b35da34ec5a52e", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "matvii.prytula@ucu.edu.ua")
                                        .put("Name", "Matthew"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", user.getEmail())
                                                .put("Name", user.getName())))
                                .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
                                .put(Emailv31.Message.TEXTPART, "My first Mailjet email")
                                .put(Emailv31.Message.HTMLPART, mailInfo.generate())
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
