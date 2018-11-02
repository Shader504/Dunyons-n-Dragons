import java.util.Random;




public class dados{
  public int d20(){
    Random rand = new Random();
    int  n = rand.nextInt(20) + 1;
    return n;
  }
  public int d6(){
    Random rand = new Random();
    int  n = rand.nextInt(6) + 1;
    return n;
  }
  public int d8(){
    Random rand = new Random();
    int  n = rand.nextInt(8) + 1;
    return n;
  }
}



//there we go


//heck


//https://github.com/Shader504/Dunyons-n-Dragons
