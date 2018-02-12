package stateless;

import javax.ejb.Remote;

@Remote
public interface TestEJBRemote {

    String getMessage();

    public boolean validate(String name, String password);

    void businessMethod();
    
}
