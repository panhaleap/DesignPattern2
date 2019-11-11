package chain_of_responsibility;

public class Substract implements Chain {
    Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.calculationWanted.equals("Substract")){
            System.out.println(request.number1 +" - "+ request.number2 +" = "+
                    (request.number1 - request.number2));
        }else {
            System.out.println("Not Substract - Pass it on");
            nextChain.calculate(request);
        }
    }
}
