package guru.springframework.sfgid.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgid.services.PetService;


/**
 * Created by jt on 12/28/19.
 */

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
		super();
		this.petService = petService;
	}

	public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
