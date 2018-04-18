package talk.process;

public class Block  implements Action
{
    @Override
    public void doAction()
    {
        System.out.println("상담인입차단");
    }
}
