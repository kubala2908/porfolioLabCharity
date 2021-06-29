package pl.coderslab.charity.donation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.category.CategoryRepository;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionRepository;

import java.util.List;

@Controller
@RequestMapping("/donation")
public class DonationController {
    private static final Logger log = LoggerFactory.getLogger(DonationController.class);
    private final CategoryRepository categoryRepository;
    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;

    public DonationController(CategoryRepository categoryRepository, DonationRepository donationRepository, InstitutionRepository institutionRepository) {
        this.categoryRepository = categoryRepository;
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
    }

    @GetMapping("/form")
    public String formAction (Model model){
        List<Category> categories = categoryRepository.findAll();
        Donation donation = new Donation();
        List<Institution> institutions = institutionRepository.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("donation", donation);
        model.addAttribute("institutions", institutions);
        return "form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String formPost (Donation donation){
        donationRepository.save(donation);
        return "dodano";
    }
}
