package chain_of_responsibility;

public interface Chain {

    // Defines the next Object to receive the data
    // if this object can't process it
    void setNextChain(Chain nextChain);

    // Either solves the problem or passes the data
    // to the next Object in the chain
    void calculate(Numbers request);
}
