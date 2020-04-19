class ArgsExample {
  public static void main(String[] args) {
    
    System.out.println("Number of args: "+args.length);
    
    //The .length method will return an int so
    int argsLength = +args.length;
    System.out.println(argsLength);
    
    System.out.println("First Arg: "+args[0]);
    System.out.println("Second Arg: "+args[1]);
        
  }
}