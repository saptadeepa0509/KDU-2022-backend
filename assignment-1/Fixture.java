package com.company;
import java.util.*;
import java.io.FileWriter;

public class Fixture {
    ArrayList<String> teams= new ArrayList<>();

    HashMap<String,String> stadiums =new HashMap<String,String>();
    void addStatiums(){
        //[RCB, RR, KKR, SRH, CSK, MI, PBKS, DC]
        stadiums.put("RCB","Wankhede stadium");
        stadiums.put("RR","HPCA stadium");
        stadiums.put("KKR","Eden Garden");
        stadiums.put("SRH","Feroz Shah Kotla Ground");
        stadiums.put("CSK","M A. Chidambaram Stadium");
        stadiums.put("MI","Dr DY Patil Sports Academy");
        stadiums.put("PBKS","Barabati Stadium");
        stadiums.put("DC","Barkatullah Khan Stadium");
    }
    public Fixture() {
        addStatiums();
        IPL ipl=new IPL();
        ipl.fetchData();
        ipl.setTeams();
        for (String team:ipl.getTeams())
        {
          teams.add(team);
        }
    }
    void  createFixture(){

        try{
            FileWriter fileWriter= new FileWriter("/home/saptadeepa/IdeaProjects/IPL.java/src/com/company/fixture.csv");
            StringBuilder data=new StringBuilder();

            int teamSize=teams.size();
            int matchNumber =1;
            for(int i=0;i< teamSize-1;i++){
                for (int j=i+1;j< teamSize;j++)
                {
                    data.append(String.valueOf(matchNumber));
                    data.append(",");
                    data.append(teams.get(i));
                    data.append(",");
                    data.append(teams.get(j));
                    data.append(",");;
                    data.append(stadiums.get(teams.get(i)));
                    data.append("\n");

                    matchNumber++;
                    data.append(String.valueOf(matchNumber));
                    data.append(",");
                    data.append(teams.get(j));
                    data.append(",");
                    data.append(teams.get(i));
                    data.append(",");;
                    data.append(stadiums.get(teams.get(j)));
                    data.append("\n");

                    matchNumber++;
                }
            }
            fileWriter.write(data.toString());
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
