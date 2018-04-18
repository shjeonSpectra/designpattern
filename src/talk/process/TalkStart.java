package talk.process;

import talk.ticket.Ticket;

/**
 * Created by shjeon on 2018-04-16.
 */
public class TalkStart {

    public Ticket start(Ticket ticket)
    {
        System.out.println("톡 상담 시작 (TalkStart)");
        ticket.setAccountId("shjeon");
        ticket.setStatus("상담중");
        System.out.println("상담사 아이디 : " + ticket.getAccountId());

        return ticket;
    }

}
