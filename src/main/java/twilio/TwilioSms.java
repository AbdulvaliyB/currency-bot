package twilio;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSms {
    public static String code = "2004";
    public static final String ACCOUNT_SID = "AC5977b26e7e128f783c4f05cb58699b3e";
    public static final String AUTH_TOKEN = "56a3710bdddc7e17aeb6c277be30c846";

    public static void smsCode() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber("+998971670555"),
                new PhoneNumber("+16076009068"),
                "Your code-" + code).create();
        System.out.println(message.getSid());
    }


}
