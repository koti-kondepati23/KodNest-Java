class  Money{

}

class Ticket{

}

class Conductor {

    void Collect(Money m){
        System.out.println("Pay the money");
    }
    Ticket give(){
        Ticket t = new Ticket();
        System.out.println("Collect the ticket");
        return t;
    }

}
public class Bus {
    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money();
        c.Collect(m);
        Ticket d = c.give();
        System.out.println(d);
        if(d!= null){
            System.out.println("Ticket COllected");
        }
        
    }
    
}
