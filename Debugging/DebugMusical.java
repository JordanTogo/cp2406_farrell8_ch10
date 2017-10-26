public class DebugMusical extends FixDebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title, author, comp);
      composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is"  + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}