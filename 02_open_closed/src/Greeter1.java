
interface IGreeter{
  String greet();
  
}

class FormalGreeter implements IGreeter{
  public String greet (){
    return "Good evening";

      
  }
}

class CasualGreeter implements IGreeter{
  public String greet(){
  return "Good-day";
  }
}

class IntimateGreeter implements IGreeter{
  public String greet(){
    return "Hello Darling";
    }
  }

class Greeter {
  private IGreeter greeter; 

  public Greeter(IGreeter greeter){
    this.greeter = greeter;
  }

  public String greet (){
    return greeter.greet();
  }
}

