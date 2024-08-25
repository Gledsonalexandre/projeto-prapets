package repositories;

import models.Pet;

public interface PetRepository {
    Pet criar(Pet pet);
    Pet buscar(int id);
    void deletar(int id);
    Pet atualizar(int id, Pet pet);
    boolean existe(int id);

}
