package com.itsp.profile.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String edit_profile(Model model) {
        ArrayList<String> profiles = this.profileserverservice.getAllProfiles();

        model.addAttribute("profiles", profiles);

        return "edit-profile";
    }
}
