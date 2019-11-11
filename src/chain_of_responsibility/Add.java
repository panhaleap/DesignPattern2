package chain_of_responsibility;

public class Add implements Chain {
    private Chain nextInChain;

    // Defines the next Object to receive the
    // data if this one can't use it
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()
    @Override
    public void calculate(Numbers request) {
        if(request.calculationWanted.equals("add")){
            System.out.println(request.number1 +" + "+ request.number2 +" = "+
                    (request.number1 + request.number2));
        }else {
            System.out.println("Not add - pass it on");
            nextInChain.calculate(request);
        }
    }
}
