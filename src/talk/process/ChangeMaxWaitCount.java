package talk.process;

public class ChangeMaxWaitCount implements Action
{
    @Override
    public void doAction()
    {
        System.out.println("최대 대기수 변경");
    }
}
