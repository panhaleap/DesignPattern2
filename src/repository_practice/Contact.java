package repository_practice;

public class Contact {
    String name;

    @Override
    public String toString() {
        String temp = "";

        //System.getProperty( "line.separator" ) For starting a new line with FileWriter
        if(this instanceof Friend)
        {
            temp = System.getProperty( "line.separator" ) + "Friend name: "+ name +", Phone: "+ ((Friend)this).phoneNumber;
        }
        else if(this instanceof Work)
        {
            temp = System.getProperty( "line.separator" ) + "Work name: "+ name +", Email: "+ ((Work)this).email;

        }
        return temp;
    }
}
