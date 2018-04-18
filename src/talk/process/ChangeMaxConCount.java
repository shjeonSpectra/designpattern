package talk.process;

public class ChangeMaxConCount implements Action
{

    @Override
    public void doAction()
    {
        System.out.println("최대 동시 상담수 변경");
    }
}
