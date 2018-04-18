package talk.process;

public class ChangeMaxWaitCount implements Action
{
    @Override
    public void action()
    {
        System.out.println("동시상담수 변경");
    }
}
