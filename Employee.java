import java.util.ArrayList;
import java.util.List;

public  class Employee{
    private String name;
    private String department;
    private List<Role> roles;
    public Employee(String name, String department, Role initialRole){
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.roles.add(initialRole);
    }

    public String getName(){ return name; }
    public String getDepartment(){ return department; }
    public void addRole(Role role){
        this.roles.add(role);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilderRoles = new StringBuilder();
        stringBuilderRoles.append("(Roles: ");
        for(int i = 0; i <  roles.size(); i++){
            stringBuilderRoles.append(roles.get(i));
            if(i != roles.size() -1) {
                stringBuilderRoles.append(", ");
            }
        }
        stringBuilderRoles.append(")");

        return String.format("%s at %s %s", name, department, stringBuilderRoles.toString());

    }
}