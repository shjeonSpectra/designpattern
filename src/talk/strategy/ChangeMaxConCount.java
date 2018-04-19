package talk.strategy;

public class ChangeMaxConCount implements Action
{
    public ChangeMaxConCount()
    {}

    @Override
    public void doAction()
    {
        System.out.println("최대 동시 상담수 변경");
    }
}
