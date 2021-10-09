package com.itsp.profile.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class ProfileServerService {

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
            profiles.add(resource.substring(resource.lastIndexOf("\\") + 1).split(".txt")[0]);
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


    public void test()
    {

    }
}
