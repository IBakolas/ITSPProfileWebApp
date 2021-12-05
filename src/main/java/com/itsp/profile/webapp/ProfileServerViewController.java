package com.itsp.profile.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class ProfileServerViewController {

    static final Logger log = LoggerFactory.getLogger(ProfileServerViewController.class);

    @Autowired
    ProfileServerService profileserverservice;

    public ProfileServerViewController(ProfileServerService profileserverservice) {
        this.profileserverservice = profileserverservice;
    }

    @GetMapping(path="/login")
    public String login() {
        log.debug("Log in first!!!");
        return "login";
    }

    @GetMapping(path="/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        log.debug("Log out");
        HttpSession session= request.getSession(false);
        SecurityContextHolder.clearContext();
        session= request.getSession(false);
        if(session != null) {
            session.invalidate();
        }
        for(Cookie cookie : request.getCookies()) {
            cookie.setMaxAge(0);
        }

        return "redirect:/login?logout";
    }

    @GetMapping(path="/index")
    public String index(Model model) {
        ArrayList<String> profiles = this.profileserverservice.getAllProfiles();

        model.addAttribute("profiles", profiles);

        return "index";
    }

    @PostMapping(path="/index")
    public String index_post(Model model) {
        ArrayList<String> profiles = this.profileserverservice.getAllProfiles();

        model.addAttribute("profiles", profiles);

        return "index";
    }

    @GetMapping(path="/view-profile")
    public String view_profile(@RequestParam(name = "id") String profileId, Model model) {
        log.info("Provider profile id: " + profileId);
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

        log.info("Data from form: " + profile);
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

        log.info("View parameter: " + parameter);
        model.addAttribute("parameter", parameter);

        return "view-parameter";
    }

    @GetMapping(path="/edit-parameter")
    public String edit_parameter(@RequestParam(name = "id") String parameterId, Model model) {
        ConfigurationParam parameter = new ConfigurationParam();

        if(!parameterId.contentEquals("0"))
        {
            parameter = this.profileserverservice.getConfigurationParamData(parameterId);
            log.info("Found parameter: " + parameter);
        }

        model.addAttribute("parameter", parameter);

        return "edit-parameter";
    }

    @PostMapping(path="/update-parameters-repo")
    public String update_parameters_repo(@ModelAttribute ConfigurationParam parameter, Model model) {

        log.info("Data from form: " + parameter);
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

