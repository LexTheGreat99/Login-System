import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Bro","pizza");
        logininfo.put("Brosef","PASSWORD");
        logininfo.put("Bingo","abc123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
