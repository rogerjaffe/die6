
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class Die6
{
  /**
   * Contains the current value of the die
   */
  private int value;

/**
 * Constructor to do an initial roll to set the first value
 */
  public Die6() {
    this.roll();
  }
  
/**
 * Getter for value
 */
  public int getValue() {
    return value;
  }

/**
 * Roll the die! Generate random number 1 <= x <= 6 and assign to value
 */
  public void roll() {
    this.value = (int)(Math.random() * 6) + 1;
  }
}
