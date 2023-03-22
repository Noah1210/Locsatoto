package com.pardon.locsatoto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pardon.locsatoto.entities.Equipement;
import com.pardon.locsatoto.entities.Etat;
import com.pardon.locsatoto.entities.Evaluation;
import com.pardon.locsatoto.entities.InventaireEntree;
import com.pardon.locsatoto.entities.InventaireSortie;
import com.pardon.locsatoto.entities.Location;
import com.pardon.locsatoto.sevices.IEquipementService;
import com.pardon.locsatoto.sevices.IEtatService;
import com.pardon.locsatoto.sevices.IEvaluationService;
import com.pardon.locsatoto.sevices.IInventaireEntreeService;
import com.pardon.locsatoto.sevices.IInventaireSortieService;
import com.pardon.locsatoto.sevices.ILocationService;


@Controller
public class LocationsController {
	@Autowired ILocationService locationService;
	@Autowired IEtatService etatService;
	@Autowired IEquipementService equipementService;
	@Autowired IInventaireEntreeService inventaireEntreeService;
	@Autowired IInventaireSortieService inventaireSortieService;
	@Autowired IEvaluationService evaluationService;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("locations", locationService.locsEnCour());
		return "index";
	}

	@GetMapping("/entree/{code}")
	public String entree(Model model, @PathVariable(name = "code") String code) {
		Location loc = locationService.locById(code) ;
		model.addAttribute("location", loc );
		model.addAttribute("etat", etatService.listEtats());
		return "entree";
	}
	
	@PostMapping(value = {"/entree/{code}"})
	public String entreeSubmit(Model model, @PathVariable(name = "code") String code, @RequestParam(name = "generalComment") String generalComment, @RequestParam(name="comments") ArrayList<String> comments,
			@RequestParam(name="equipements") ArrayList<String> equipements, @RequestParam(name="etats") ArrayList<String> etats, RedirectAttributes redirectAttributes) {
		List<Evaluation> evaluations = new ArrayList<>();
		int i = 0;
		for(String s : equipements) {
			Equipement equi = equipementService.equipementById(s);
			Etat eta = etatService.etatById(etats.get(i));
			Evaluation eval = new Evaluation(comments.get(i), eta, equi);
			evaluations.add(eval);
			evaluationService.saveEvaluation(eval);
			i++;
		}
		InventaireEntree invE = new InventaireEntree(generalComment, evaluations);
		Location loca = locationService.locById(code);
		loca.setInventaireEntree(invE);
		inventaireEntreeService.saveInventaireEntree(invE);
		redirectAttributes.addFlashAttribute("message", "L'inventaire d'entree a bien été ajouté.");
		return "redirect:/index";
	}
	
	@GetMapping("/sortie/{code}")
	public String sortie(Model model, @PathVariable(name = "code") String code) {
		Location loc = locationService.locById(code) ;
		model.addAttribute("location", loc );
		model.addAttribute("etat", etatService.listEtats());
		return "sortie";
	}
	
	@PostMapping(value = {"/sortie/{code}"})
	public String sortieSubmit(Model model, @PathVariable(name = "code") String code, @RequestParam(name = "generalComment") String generalComment, @RequestParam(name="comments") ArrayList<String> comments,
			@RequestParam(name="equipements") ArrayList<String> equipements, @RequestParam(name="etats") ArrayList<String> etats, RedirectAttributes redirectAttributes) {
		List<Evaluation> evaluations = new ArrayList<>();
		int i = 0;
		for(String s : equipements) {
			Equipement equi = equipementService.equipementById(s);
			Etat eta = etatService.etatById(etats.get(i));
			Evaluation eval = new Evaluation(comments.get(i), eta, equi);
			evaluations.add(eval);
			evaluationService.saveEvaluation(eval);
			i++;
		}
		InventaireSortie invS = new InventaireSortie(generalComment, evaluations, 15.0f);
		Location loca = locationService.locById(code);
		loca.setInventaireSortie(invS);
		inventaireSortieService.saveInventaireSortie(invS);
		redirectAttributes.addFlashAttribute("message", "L'inventaire de sortie a bien été ajouté.");
		return "redirect:/index";
	}

}
