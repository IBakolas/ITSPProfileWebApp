package com.itsp.profile.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    static final Logger log  = LoggerFactory.getLogger(ProfilesRepository.class);
    private ResourceLoader resourceLoader;
    private String profiles_path;

    public ProfilesRepository() {

        this.profiles_path = System.getenv("PROFILES_PATH");

        if(this.profiles_path == null)
        {
            try {
                this.profiles_path =  ResourcePatternUtils.getResourcePatternResolver(this.resourceLoader).getResource("classpath:profiles/").getFile().toPath().toString();
                this.profiles_path += System.getProperty("file.separator");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        log.info("ProfilesRepository created. Reading profiles data from: " + this.profiles_path);
    }

    public Boolean updateProfileRepo(ITSPProfile provider)
    {

        Path file = Paths.get(this.profiles_path + provider.getP_SipProviderName() + ".txt");
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


        log.info("Profiles path: " + profiles_path);
        File folder = new File(profiles_path);
        File[] listOfFiles = folder.listFiles();

        log.info("Profiles found: " + listOfFiles.length);

        for (File listOfFile : listOfFiles)
        {
            log.info(listOfFile.getName());
            if (listOfFile.getName().contains(".txt"))
            {
                profiles.add(profiles_path + listOfFile.getName());
            }
        }

        return profiles;
    }

    public ITSPProfile findProfileByName(String name) throws IOException {
        ITSPProfile profile = new ITSPProfile();
        ArrayList<String> profiles = this.getProfiles();

        // Search if the profile exists
        log.info("Profiles size: " + profiles.size());
        for(String prof : profiles)
        {
            if(prof.contains(name))
            {
                FileInputStream fstream = null;

                //String path = prof.substring(prof.indexOf("[") + 1, prof.lastIndexOf("]"));
                log.info(prof);

                fstream = new FileInputStream(prof);

                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                //Read File Line By Line
                while ((strLine = br.readLine()) != null) {
                    // Print the content on the console - do what you want to do
                    log.info("Read profile line: " + strLine);
                    if(!strLine.contentEquals(""))
                    {
                        profile.parseDataFromString(strLine);
                    }

                }

                log.info(profile.toString());
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

    public ArrayList<String> getConfigurationParameters() throws IOException {
        ArrayList<String> params = new ArrayList<String>();
        FileInputStream fstream = null;

        String path = this.profiles_path + "param/parameters";
        log.info(path);

        fstream = new FileInputStream(path);

        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console - do what you want to do
            log.info("Read parameters line: " + strLine);
            if(!strLine.contentEquals(""))
            {
                String[] splitted = strLine.split(" ");

                splitted = splitted[0].split("\\|");

                log.info("Splitted: " + Arrays.toString(splitted));
                params.add(splitted[0]);
            }

        }

        //Close the input stream
        fstream.close();

        return params;
    }

    public ConfigurationParam findConfigurationParamByName(String parameter) throws IOException {
        ConfigurationParam param = null;
        FileInputStream fstream;
        String path = this.profiles_path + "param/parameters";

        fstream = new FileInputStream(path);

        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console - do what you want to do
            log.info("Read parameters line: " + strLine);
            if(!strLine.contentEquals(""))
            {
                String[] splitted = strLine.split(" ");
                splitted = splitted[0].split("\\|");

                log.info("Splitted: " + Arrays.toString(splitted));
                if(splitted[0].contentEquals(parameter))
                {
                    param = new ConfigurationParam();
                    param.parseFromString(strLine.replace(" ", ""));
                }
            }

        }

        //Close the input stream
        fstream.close();

        return param;
    }

    public boolean updateConfigurationParamRepo(ConfigurationParam param) {
        //Path file = Paths.get("C:\\Users\\John\\IdeaProjects\\SpringBootTutorial\\src\\main\\resources\\profiles\\parameters");
        String param_line = param.toPersistancyString();
        log.info("Param persistency string: " + param_line);

        try {
            // input the (modified) file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(this.profiles_path + "param/parameters"));
            StringBuffer inputBuffer = new StringBuffer();
            String line;

            boolean paramexists = false;
            while ((line = file.readLine()) != null)
            {
                if (line.contains(param.getParamName()))
                {
                    line = param_line;
                    paramexists = true;
                }

                inputBuffer.append(line);
                inputBuffer.append("\r\n");
            }

            // if the param does not exist in the file add it in a new line
            if(!paramexists)
            {
                inputBuffer.append(param_line);
                inputBuffer.append("\r\n");
            }

            file.close();

            // write the new string with the replaced line OVER the same file
            FileOutputStream fileOut = new FileOutputStream(this.profiles_path + "param/parameters");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

        } catch (Exception e) {
            log.info("Problem reading file.");
        }

        return true;
    }
}
