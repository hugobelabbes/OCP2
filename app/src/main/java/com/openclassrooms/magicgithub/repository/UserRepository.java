package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    //La fonction getUsers() retourne le résultat de la fonction apiService.getUsers(), à savoir la
    //liste des utilisateurs de apiService : users
    public List<User> getUsers() {
        // TODO: A modifier
        //Test
        return apiService.getUsers();
    }
    //La fonction generateRandomUser() appelle la fonction apiService.generateRandomUser(), ce qui
    //va ajouter un utilisateur généré à la liste des utilisateurs users d'apiService
    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser();
    }
    //La fonction deleteUser appelle la fonction apiService.deleteUser(user), ce qui va supprimer
    //un utilisateur passé en paramètre de la liste des utilisateurs users d'apiService
    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user);
    }
}
