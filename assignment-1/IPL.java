package com.company;
import java.io.*;
import java.util.*;

public class IPL
{
    ArrayList<CSV_Object> storeData = new ArrayList<>();
    ArrayList<String> teams=new ArrayList<>();
    void fetchData() {
        try {
            String filePath = "/home/saptadeepa/Downloads/IPL_2021_data (1).csv";
            BufferedReader readFile = new BufferedReader(new FileReader(filePath));
            String readFilerow;
            readFile.readLine();

            while ((readFilerow = readFile.readLine()) != null) {
                String[] data = readFilerow.split(",");
                CSV_Object csvData = new CSV_Object(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]);
                storeData.add(csvData);
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void  printData(){
        for (CSV_Object details:storeData)
        {
            System.out.println(details);
        }
    }
    public ArrayList<String> getTeams() {
        return teams;
    }

    void setTeams(){
        Set<String> teams = new HashSet<String>();
        for (CSV_Object team :storeData)
        {
            teams.add(team.getTeam());
        }
        this.teams = (ArrayList<String>) teams.stream().collect(Collectors.toList());
    }
    void bowlerName (){
        try
        {
            BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name of a team");
            String str = ab.readLine();
        for (CSV_Object player :storeData)
        {
            if((str.equalsIgnoreCase(player.getTeam()) )&& (player.getRole().equalsIgnoreCase("BOWLER") )&& ((player.getWickets())>=40))
                {
                    System.out.println(player.getName());
                }
        }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    void displayPlayer(){
        try
        {
            BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name of a player");
            String str = ab.readLine();
            for (CSV_Object player:storeData)
            {
                if(player.getName().equalsIgnoreCase(str) || player.getName().toLowerCase().contains((str.toLowerCase())))
                {
                    System.out.println(player.getName()+" "+player.getTeam()+" "+player.getRole()+" "+player.getMatches()+" "+player.getRuns()+" "+player.getAverage()+" "+player.getSr()+" "+player.getWickets());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    void showPlayer(){
        try
        {
            BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the team");
            String str = ab.readLine();

            String maxWicket = null, maxRun = null;
            int maxWicketTaker = 0, maxRunScorer = 0;
            for (CSV_Object maxCount:storeData) {
                if(maxCount.getTeam().equalsIgnoreCase(str) && maxCount.getWickets()>maxWicketTaker)
                {
                    maxWicketTaker = maxCount.getWickets();
                    maxWicket = maxCount.getName();
                }
                if(maxCount.getTeam().equalsIgnoreCase(str) && maxCount.getRuns()>maxRunScorer)
                {
                    maxRunScorer = maxCount.getRuns();
                    maxRun= maxCount.getName();
                }
            }
            System.out.println("Highest wicket-taker: "+maxWicket);
            System.out.println("Highest run-scorer "+maxRun);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    void top3Batsman(){
        int count=1;
        Collections.sort(storeData, new SortByRuns ());
        System.out.println("Top 3 Batsman :");
        for (CSV_Object batsman:storeData)
        {
            if(count>3)break;
            if(batsman.getRole().compareTo("BATSMAN")==0) {
                System.out.println(batsman.getName());
                count++;
            }
        }
    }
    void top3Bowler(){
        int count=1;
        Collections.sort(storeData, new SortByWickets ());
        System.out.println("Top 3 Bowler :");
        for (CSV_Object bowler:storeData)
        {
            if(count>3)break;
            if(bowler.getRole().compareTo("BOWLER")==0) {
                System.out.println(bowler.getName());
                count++;
            }
        }
    }
    void top3Allrounder(){
        int count=1;
        Collections.sort(storeData, new SortByWickets ());
        System.out.println("Top 3 Allrounder :");
        for (CSV_Object allrounder:storeData)
        {
            if(count>3)break;
            if(allrounder.getRole().compareTo("ALL ROUNDER")==0) {
                System.out.println(allrounder.getName());
                count++;
            }
        }
    }

    void bestTwoTeams(){
        Collections.sort(storeData, new SortByRuns());
        TreeMap<Integer, String> runs = new TreeMap<>(Collections.reverseOrder());
        for (String team:teams)
        {
            int count=0;
            int sum=0;
            for (CSV_Object bestPlayer:storeData)
            {
             if(bestPlayer.getTeam().compareTo(team)==0 && bestPlayer.getRole().compareTo("BATSMAN")==0){
               sum+=bestPlayer.getRuns();
               count++;
               if (count>=11)break;
             }
            }
            runs.put(sum,team);

        }
        System.out.println("best two teams with scores are:");
        int c=0;
        for (Map.Entry<Integer,String> topTwo:runs.entrySet())
        {
            c++;
            if(c>2)break;
            System.out.println(topTwo.getValue()+" "+topTwo.getKey());
        }
    }


    void nextGenPlayer(){
        for (String team : teams)
        {
            System.out.println(team);
            for (CSV_Object nextGenPlayer: storeData)
            {
                if(nextGenPlayer.getTeam().compareTo(team)==0 && nextGenPlayer.getMatches()<50)
                {
                    double wk= (1.0*nextGenPlayer.getWickets())/nextGenPlayer.getMatches();
                    if(((nextGenPlayer.getRole().compareTo("BATSMAN") ==0)||(nextGenPlayer.getRole().compareTo("WICKET KEEPER")==0)||(nextGenPlayer.getRole().compareTo("ALL ROUNDER")==0))&& nextGenPlayer.getAverage()>=20){
                        System.out.println(nextGenPlayer.getName());
                    }
                    else if(((nextGenPlayer.getRole().compareTo("BOWLER")==0) ||(nextGenPlayer.getRole().compareTo("WICKET KEEPER")==0)||(nextGenPlayer.getRole().compareTo("ALL ROUNDER")==0))&& wk>=1.5){
                        System.out.println(nextGenPlayer.getName());
                    }
                }
            }
            System.out.println("------------------------");
        }
    }

    public static void main(String args[])
    {
        IPL  ipl =new IPL();
        ipl.fetchData();
        ipl.setTeams();
        ipl.printData();
        System.out.println(ipl.teams);
        Fixture fixture=new Fixture();
        fixture.createFixture();
        ipl.bowlerName();
        ipl.displayPlayer();
        ipl.showPlayer();
        ipl.top3Batsman();
        ipl.top3Bowler();
        ipl.top3Allrounder();
        ipl.nextGenPlayer();
        ipl.bestTwoTeams();

    }
}

