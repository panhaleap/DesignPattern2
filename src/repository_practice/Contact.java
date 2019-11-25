package repository_practice;

public class Contact {
    String name;

    @Override
    public String toString() {
        String temp = "";
        if(this instanceof Friend){
            temp = "Friend name: "+ name +", Phone: "+ ((Friend)this).phoneNumber;
        }else if(this instanceof Work){
            temp = "Work name: "+ name +", Email: "+ ((Work)this).email;
        }
        return temp;
    }
}
