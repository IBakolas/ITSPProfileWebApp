package com.itsp.profile.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class ProfileServerViewController {

    @Autowired
    ProfileServerService profileserverservice;

    public ProfileServerViewController(ProfileServerService profileserverservice) {
        this.profileserverservice = profileserverservice;
    }

    @GetMapping(path="/index")
    public String index(Model model) {
        ArrayList<String> profiles = this.profileserverservice.getAllProfiles();

        model.addAttribute("profiles", profiles);

        return "index";
    }

    @GetMapping(path="/view-profile")
    public String view_profile(@RequestParam(name = "id") String profileId, Model model) {
        System.out.println("Provider profile id: " + profileId);
        ITSPProfile profile = this.profileserverservice.getProfileData(profileId);

        model.addAttribute("profile", profile);

        return "view-profile";
    }


    @GetMapping(path="/edit-profile")
    public String edit_profile(@RequestParam(name = "id") String profileId, Model model) {
        ITSPProfile profile = new ITSPProfile();

        if(!profileId.contentEquals("0"))
        {
            profile = this.profileserverservice.getProfileData(profileId);
        }

        model.addAttribute("profile", profile);

        return "edit-profile";
    }

    @PostMapping(path="/update-profiles-repo")
    public String update_profiles_repo(@ModelAttribute ITSPProfile profile, Model model) {

        System.out.println("Data from form: " + profile);
        if(this.profileserverservice.updateRepo(profile))
        {
            return "index";
        }
        else
        {
            return "Error";
        }

    }

    @GetMapping(path="/parameters")
    public String parameters(Model model) {
        ArrayList<String> parameters = this.profileserverservice.getAllConfigurationParameters();

        model.addAttribute("parameters", parameters);

        return "parameters";
    }

    @GetMapping(path="/view-parameter")
    public String view_parameter(@RequestParam(name = "id") String parameterId, Model model) {
        ConfigurationParam parameter = new ConfigurationParam();

        if(!parameterId.contentEquals("0"))
        {
            parameter = this.profileserverservice.getConfigurationParamData(parameterId);
        }

        System.out.println("View parameter: " + parameter);
        model.addAttribute("parameter", parameter);

        return "view-parameter";
    }

    @GetMapping(path="/edit-parameter")
    public String edit_parameter(@RequestParam(name = "id") String parameterId, Model model) {
        ConfigurationParam parameter = new ConfigurationParam();

        if(!parameterId.contentEquals("0"))
        {
            parameter = this.profileserverservice.getConfigurationParamData(parameterId);
            System.out.println("Found parameter: " + parameter);
        }

        model.addAttribute("parameter", parameter);

        return "edit-parameter";
    }

    @PostMapping(path="/update-parameters-repo")
    public String update_parameters_repo(@ModelAttribute ConfigurationParam parameter, Model model) {

        System.out.println("Data from form: " + parameter);
        if(this.profileserverservice.updateConfigurationParamRepo(parameter))
        {
            return "parameters";
        }
        else
        {
            return "Error";
        }
    }
}

