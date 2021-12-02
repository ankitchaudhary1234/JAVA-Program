public class Assignment5{
  public static void main(String[] args)
    throws invalidAgeException{
    String name=args[0];
    int age=integer.parseint(args[1]);
    if(age<18||age>=60)
      throw new invalidAgeException();
    system.out.println("Name:"+name+"Age:"+age);
  }
}
