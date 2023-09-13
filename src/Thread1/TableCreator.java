package Thread1;

public class TableCreator implements Runnable{
    int n;

    public TableCreator (int n){
        this.n = n;
    }

    @Override
    public void run(){
        for(int i=1 ;i<=10;i++){
            System.out.println(this.n  + " times "  + i + " is " + this.n*i);

        }

    }



}