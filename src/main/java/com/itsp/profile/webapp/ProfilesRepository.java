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
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public ArrayList<String> getConfigurationParameters() throws IOException {
        ArrayList<String> params = new ArrayList<String>();
        FileInputStream fstream = null;

        String path = "C:\\Users\\John\\IdeaProjects\\SpringBootTutorial\\src\\main\\resources\\profiles\\parameters";
        System.out.println(path);

        fstream = new FileInputStream(path);

        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console - do what you want to do
            System.out.println("Read parameters line: " + strLine);
            if(!strLine.contentEquals(""))
            {
                String[] splitted = strLine.split(" ");

                splitted = splitted[0].split("\\|");

                System.out.println("Splitted: " + Arrays.toString(splitted));
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
        String path = "C:\\Users\\John\\IdeaProjects\\SpringBootTutorial\\src\\main\\resources\\profiles\\parameters";

        fstream = new FileInputStream(path);

        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console - do what you want to do
            System.out.println("Read parameters line: " + strLine);
            if(!strLine.contentEquals(""))
            {
                String[] splitted = strLine.split(" ");
                splitted = splitted[0].split("\\|");

                System.out.println("Splitted: " + Arrays.toString(splitted));
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
        System.out.println("Param persistency string: " + param_line);

        try {
            // input the (modified) file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\John\\IdeaProjects\\SpringBootTutorial\\src\\main\\resources\\profiles\\parameters"));
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
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\John\\IdeaProjects\\SpringBootTutorial\\src\\main\\resources\\profiles\\parameters");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }

        return true;
    }
}
