/**
 * File : DAOManager.java
 * Deskripsi: pengelola DAO dalam program
 */
package pertemuan10;

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
