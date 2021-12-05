package com.itsp.profile.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class ProfileServerService {

    static final Logger log  = LoggerFactory.getLogger(ProfileServerService.class);

    @Autowired
    ProfilesRepository repo;

    public ProfileServerService(ProfilesRepository repo) {
        this.repo = repo;
    }

    public ArrayList<String> getAllProfiles() {
        ArrayList<String> profiles = new ArrayList<String>();
        ArrayList<String> resources = this.repo.getProfiles();

        for(String resource : resources)
        {
            profiles.add(resource.substring(resource.lastIndexOf(System.getProperty("file.separator")) + 1).split(".txt")[0]);
        }

        return profiles;
    }

    public ITSPProfile getProfileData(String profile) {
        ITSPProfile profileData = new ITSPProfile();
        try {
            profileData = this.repo.findProfileByName(profile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return profileData;
    }


    public boolean updateRepo(ITSPProfile provider) {
        boolean res = true;

        // Profile already exists just update it
        res = repo.updateProfileRepo(provider);

        return res;
    }

    public ArrayList<String> getAllConfigurationParameters() {
        ArrayList<String> parameters = new ArrayList<String>();

        try {
            parameters = this.repo.getConfigurationParameters();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parameters;
    }

    public ConfigurationParam getConfigurationParamData(String parameter) {
        ConfigurationParam paramData = new ConfigurationParam();
        try {
            paramData = this.repo.findConfigurationParamByName(parameter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return paramData;
    }

    public boolean updateConfigurationParamRepo(ConfigurationParam param) {
        boolean res = true;

        // Profile already exists just update it
        res = repo.updateConfigurationParamRepo(param);

        return res;
    }
}
