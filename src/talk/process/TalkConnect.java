package talk.process;

import talk.ticket.Ticket;

/**
 * Created by shjeon on 2018-04-16.
 */
public class TalkConnect {

    public Ticket connect (Ticket ticket)
    {
        System.out.println("톡 접수 완료 (TalkConnect)");
        System.out.println("고객 아이디 : " + ticket.getCustomerId());
        ticket.setStatus("접수완료");

        return ticket;
    }

}
