package com.itsp.profile.webapp;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class ProfilesRepository {

    private ResourceLoader resourceLoader;

    public Boolean updateProfileRepo(ITSPProfile provider)
    {
        Path file = Paths.get("C:\\Users\\John\\IdeaProjects\\SpringBootTutorial\\src\\main\\resources\\profiles\\" + provider.getP_SipProviderName() + ".txt");
        ArrayList<String> lines = new ArrayList<String>();
        String line = provider.toPersistancyString();
        
        lines.add(line);
        try {
            Files.write(file, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public Boolean removeProfile()
    {
        return true;
    }


    public ArrayList<String> getProfiles() {

        ArrayList<String> profiles = new ArrayList<String>();

        try {
            Resource[] files = ResourcePatternUtils.getResourcePatternResolver(this.resourceLoader).getResources("classpath*:profiles/*.txt");
            System.out.println(files.length);

            for (int i = 0 ; i < Arrays.stream(files).toArray().length; i++)
            {
                System.out.println(Arrays.stream(files).toArray()[i].toString());
                profiles.add(Arrays.stream(files).toArray()[i].toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return profiles;
    }

    public ITSPProfile findProfileByName(String name) throws IOException {
        ITSPProfile profile = new ITSPProfile();
        ArrayList<String> profiles = this.getProfiles();

        // Search if the profile exists
        System.out.println("Profiles size: " + profiles.size());
        for(String prof : profiles)
        {
            if(prof.contains(name))
            {
                FileInputStream fstream = null;

                String path = prof.substring(prof.indexOf("[") + 1, prof.lastIndexOf("]"));
                System.out.println(path);

                fstream = new FileInputStream(path);

                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                //Read File Line By Line
                while ((strLine = br.readLine()) != null) {
                    // Print the content on the console - do what you want to do
                    System.out.println("Read profile line: " + strLine);
                    if(!strLine.contentEquals(""))
                    {
                        profile.parseDataFromString(strLine);
                    }

                }
                    System.out.println(profile);
                    //Close the input stream
                    fstream.close();
            }
        }

        return profile;
    }

    public Boolean findProfileById()
    {
        return true;
    }
}
