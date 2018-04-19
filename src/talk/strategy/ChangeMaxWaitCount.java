package talk.strategy;

public class ChangeMaxWaitCount implements Action
{
    public ChangeMaxWaitCount ()
    {}

    @Override
    public void doAction()
    {
        System.out.println("최대 대기수 변경");
    }
}
