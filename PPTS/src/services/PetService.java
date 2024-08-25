package services;

import exceptions.PetJaExisteExcpetion;
import models.Pet;
import repositories.PetRepository;

public class PetService {

    private PetRepository petRepository;

    public Pet salvar(Pet pet) throws PetJaExisteExcpetion {
        if(petRepository.existe(pet.getId())){
           throw new PetJaExisteExcpetion("Pet já existe sob o id "+pet.getId());
        }else{
            if(pet.getId()!=0 && pet.getNome() != null ){
                 return petRepository.criar(pet);
            }
        }
        return pet;
    }
}
