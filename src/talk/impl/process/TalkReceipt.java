package talk.impl.process;

import talk.impl.ticket.Ticket;

/**
 * Created by shjeon on 2018-04-16.
 */
public class TalkReceipt {
    private String ticketId;

    public int receipt (Ticket ticket)
    {
        System.out.println("톡 접수 완료");
        System.out.println("고객 아이디 : " + ticket.getCustomerId());

        return 1;
    }

}
