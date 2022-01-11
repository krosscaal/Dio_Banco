import entities.Conta;
import entities.P_fisica;
import utils.CountConta;

public class MainBanco {

  public static CountConta numInit = new CountConta();

  public static void main(String[] args){

    numInit.setCountContaPF(0);
    numInit.setCountContaPJ(0);
    Conta pf= new P_fisica(1,numInit.getCountContaPF(),1,1500.0,0.0);
    numInit.setCountContaPF(numInit.getCountContaPF());
    Conta pf2= new P_fisica(1,numInit.getCountContaPF(),2,100.0,0.0);
    numInit.setCountContaPF(numInit.getCountContaPF());
    System.out.println(pf.toString());
    System.out.println(pf2.toString());


  }

}
