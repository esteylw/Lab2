class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  
  // Declaring variables
  int countMnMs;
  double countBlue;
  double countBrown;
  double countGreen;
  double countOrange;
  double countRed;
  double countYellow;
  double sumColors;
  //Initializing those variables
  countMnMs = 55 * 11;
  countBlue    = countMnMs * 0.24;
  countBrown   = countMnMs * 0.13;
  countGreen   = countMnMs * 0.16;
  countOrange  = countMnMs * 0.20;
  countRed     = countMnMs * 0.13;
  countYellow  = countMnMs * 0.14;
  //add them together
  sumColors = (countBlue + countGreen + countBrown + countOrange + countRed + countYellow);
  //Print out results
  System.out.println("Blue: " + countBlue);
  System.out.println("Brown: " + countBrown);
  System.out.println("Green: " + countGreen);
  System.out.println("Orange: " + countOrange);
  System.out.println("Red: " + countRed);
  System.out.println("Yellow: " + countYellow);
  System.out.println("Sum: " + sumColors);
  //Print out comparisons
  if ( countBlue < countBrown && countRed > countOrange)
     System.out.println("Blue under Brown and Red over Orange");
  if ( countBrown >= countGreen)
     System.out.println("Brown is greater than or equal to Green");
  if ( sumColors == countMnMs)
     System.out.println("Numbers match");
  }
}