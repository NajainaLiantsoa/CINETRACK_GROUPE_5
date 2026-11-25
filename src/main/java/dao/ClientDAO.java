package dao;

import java.util.List;

import model.Client;

public interface ClientDAO {

    void ajouterClient(Client client);

    Client recupererInfo(int idClient);

    void modifierClient(Client client);

    void supprimerClient(int idClient);

    List<Client> getAllClients();
}