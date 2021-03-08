package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser
    private List<User> users;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        /*create local variable of List<User> from FakeApiService and return this

         */
        return users= apiService.getUsers();

    }

    public void generateRandomUser() {
        // TODO: A modifier
        /*use generateRandomUser from FakeApiService

         */
       apiService.generateRandomUser();

    }

    public void deleteUser(User user) {
        // TODO: A modifier
        /* use deleteUser method from fakeApiService,
        with one specific user to delete in parameter
        
         */
        apiService.deleteUser(user);
    }
}
