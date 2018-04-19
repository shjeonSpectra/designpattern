package talk;

import talk.process.*;
import talk.ticket.Ticket;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shjeon on 2018-04-16.
 */
public class Test {


    public static void main(String args[])
    {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
//        long curr = System.currentTimeMillis();
//        Ticket ticket = new Ticket();
//        ticket.setId("TCKT1");
//        ticket.setCustomerId("customerSH");
//        ticket.setDate(sdf.format(new Date(curr)));
//
//        TalkConnect talkConnect = new TalkConnect();
//        TalkStart talkStart = new TalkStart();
//        TalkEnd talkEnd = new TalkEnd();
//        TalkMessageFactory factory = new TalkMessageFactory();
//
//        System.out.println("============톡상담 데모 시작============");
//        // 톡상담 접수
//        ticket = talkConnect.connect(ticket);
//        // 톡상담 시작 (상담사수락)
//        ticket = talkStart.start(ticket);
//        factory.getTalkMessage("KAKAO","image","","D://");
//        factory.getTalkMessage("PC","text","텍스트 메세지 입니다.","");
//        // 톡상담 종료
//        ticket = talkEnd.end(ticket);
//
//        System.out.println("============톡상담 데모 종료============");
//        System.out.println("아이디 : " + ticket.getId());
//        System.out.println("상담사 : " + ticket.getAccountId());
//        System.out.println("고객   : " + ticket.getCustomerId());
//        System.out.println("상태   : " + ticket.getStatus());
//        System.out.println("접수일 : " + ticket.getDate());

        /*
         * Strategy 패턴 적용
         */

        // 관리자 업무
        Account admin = new Account("admin");
        System.out.println("===============관리자 업무===============");
        admin.actionByRole();

        // 매니저 업무
        Account manager = new Account("manager");
        System.out.println("===============매니저 업무===============");
        manager.actionByRole();

        // 상담원 업무
        Account agent = new Account("agent");
        System.out.println("===============상담원 업무===============");
        agent.actionByRole();


    }
}
