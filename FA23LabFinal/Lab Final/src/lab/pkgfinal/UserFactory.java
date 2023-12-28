/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkgfinal;

/**
 *
 * @author Asad
 */
// UserFactory class follows Factory Method pattern
class UserFactory {
    public User createUser(UserType userType, String username, String password) {
        switch (userType) {
            case STUDENT:
                return new Student(username, password);
            case PARENT:
                return new Parent(username, password);
            case TEACHER:
                return new Teacher(username, password);
            case ADMINISTRATOR:
                return new Administrator(username, password);
            default:
                return new NullUser();
        }
    }
}

