package talk.process;

import talk.ticket.Ticket;

/**
 * Created by shjeon on 2018-04-16.
 */
public class TalkEnd {

    public Ticket end(Ticket ticket)
    {
        System.out.println("톡 상담 종료 (TalkEnd)");
        ticket.setStatus("상담완료");

        return ticket;
    }
}
