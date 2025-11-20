public class CheckGuess{
  private final String secretWord;
  public CheckGuess(String secretWord){
    this.secretWord = secretWord;
  }
  public LetterStatus[] check(String guess) {
      LetterStatus[] result = new LetterStatus[5];
    return result;
  }}
  public String [] LetterStatus(String guess){
    String [] result= []
    for (i=0; i<5; ++i){
      String letterResult = String.charAt[i].LetterCheck();
      result.add(letterResult);
    }
