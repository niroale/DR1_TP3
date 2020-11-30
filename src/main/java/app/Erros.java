
package app;

public class Erros extends Exception {
    private String msg;
    
    public Erros(String msg){
        super(msg);
        this.msg = msg;
    }
    
    @Override
    public String getMessage(){
        return msg;
    }
}
