public class Name {

  //variables
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;

  }

  //Mutator
  public void changeLastName(String newName){
      this.lastName = newName;
  }

  /**
   * Getter
   */
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public static void main(String[] args) {
      Name testName = new Name("John", "Brown");
      System.out.println(testName.getFirstName());
      System.out.println(testName.getLastName());
      testName.changeLastName("Mikey");
  }
}
