/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author Abdul
 */
@Remote
public interface logicEJBRemote {

    public void insert(String name, String address, String gender, String mNumber, String community, String nationality, String email, String maths, String physics, String chemistry, String username, String password);

    public Boolean validate(String name,String password);

    public int calculateScore(String uname, String[] a1);

    public boolean validateUsername(String uname);

}
