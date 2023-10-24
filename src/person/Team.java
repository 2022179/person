/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.ArrayList;

/**
 *
 * @author Primm
 */
class Team {

    static Person remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String name;
    private ArrayList<Person>members;
//constructor

    public Team(String name) {
        this.name = name;
        this.members = members;
    }
   
    
//    public void addMember(ArrayList<Member> person) {
//        members.add(person);
//    }
// getters added
    public String getName() {
        return name;
    }

    public ArrayList<Person> getMembers() {
        return members;
    }
   
    @Override
    public String toString() {
          StringBuilder builder = new StringBuilder();
        builder.append("Team: ").append(name).append("\n");
        for (Person member : members) {
            builder.append("  ").append(member).append("\n");
        }
        return builder.toString();
    }
        
    }
    

