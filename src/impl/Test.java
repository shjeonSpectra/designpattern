package impl;

import impl.process.TalkReceipt;
import impl.ticket.Ticket;

import java.util.Scanner;

/**
 * Created by shjeon on 2018-04-16.
 */
public class Test {


    public static void main(String args[])
    {
        Ticket ticket = new Ticket();
        ticket.setAccountId("shjeon");
        ticket.setCustomerId("customerSH");

        TalkReceipt receipt = new TalkReceipt();

        receipt.receipt(ticket);

        Scanner scan = new Scanner(System.in);
        System.out.println("상담을 시작하시겠습니까? (Y 또는 N");
        String flag = scan.next();

        if (flag.equals("Y"))
        {

        }





    }



}
