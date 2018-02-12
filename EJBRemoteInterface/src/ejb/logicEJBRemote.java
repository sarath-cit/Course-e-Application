package ejb;

import javax.ejb.Remote;

@Remote
public interface logicEJBRemote {

    public void insert(String name, String address, String gender, String mNumber, String community, String nationality, String email, String maths, String physics, String chemistry, String username, String password);

    public Boolean validate(String name,String password);

    public int calculateScore(String uname, String[] a1);

    public boolean validateUsername(String uname);

}
