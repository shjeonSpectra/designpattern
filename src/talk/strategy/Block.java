package talk.strategy;

public class Block  implements Action
{
    public Block ()
    {

    }
    @Override
    public void doAction()
    {
        System.out.println("상담인입차단");
    }
}
