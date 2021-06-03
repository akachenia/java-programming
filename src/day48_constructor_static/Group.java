package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<String> members  = new ArrayList<>();

    // constructor that accepts a name
    public Group(String name){
        this.name = name;

    }

    public void addMember(String newMember){
        members.add(newMember);

    }
    public void removeMember(String newMember){
        members.remove(newMember);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public String getGroupName() {
        return name;
    }

    public void setGroupName(String groupName) {
        this.name = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> memebers) {
        this.members = memebers;
    }
}
