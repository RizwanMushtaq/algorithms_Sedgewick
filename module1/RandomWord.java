public class RandomWord {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No words provided.");
      return;
    }
    int randomIndex = (int) (Math.random() * args.length);
    System.out.println("Random word: " + args[randomIndex]);
  }
}