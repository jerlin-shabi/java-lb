class Constructor{
  private String name;

  
  Constructor() {
    System.out.println("Constructor Called:");
    name = "Programiz";
  }

  public static void main(String[] args) {

    Main obj = new Main();
    System.out.println("The name is " + obj.name);
  }
}
