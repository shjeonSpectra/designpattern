package talk.strategy;

public class Notice implements Action {

    public Notice ()
    {

    }
    @Override
    public void doAction() {
        System.out.println("긴급 공지 등록");
    }
}
