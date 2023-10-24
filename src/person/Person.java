/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Primm
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<Member> member = new ArrayList<>();//
        
        ArrayList<Team> teams = new ArrayList<>();
        
      try( BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"))){// added file
          String line;
          while((line = br.readLine())!=null){
              String[]parts =line.split(",");
              int id =Integer.parseInt(parts[0]);
              String firstName = parts[1];
              String lastName  = parts[2];
              String email  = parts[3];
              member.add(new Member(id, firstName, lastName, email));
              
          }
          
      }catch(IOException e){//try catch code
          e.printStackTrace();
          
      }
        Collections.shuffle(member);// grouping names of teams
        for (int i = 1; i <= 20; i++) {
           Team team = new Team("Team " + i);
           
            for (int j = 0; j < 5; j++) {
               // Person person = Team.remove(0); // Remove the first person from the shuffled list
            Member members = member.remove(0);
               Person person = null;
                team.addMember(person);
                
            }
            teams.add(team);
            
        System.out.println(team.getName() + ":");
            for(Person member : team.getperson()) {
                System.out.println("- " + member.getFirstName() + " " + member.getLastName());
            }
            System.out.println();
        
                    
        }
        // TODO code application logic here
    }

    private String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

