package chain_of_responsibility;

public class Divide implements Chain {
    Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.calculationWanted.equals("Divide")){
            System.out.println(request.number1 +"/"+ request.number2 +" = "+
                    (request.number1 / request.number2));
        }else {
            System.out.println("End of chain. Only works for add, subtract, multiply or divide.");
        }
    }
}

