public class McGuy {
    private String name;
    private String phone;
    private String email;
    public McGuy(String name){

        if (name.equals(null)){
            throw new NullPointerException("McGuy name cannot be null");
        }
        this.name = name;

    }

    public McGuy(String name, String email){
        this(name);
        this.email = email;
    }

    public McGuy(String name, String email, String phone){
        this(name,email);
        this.phone = phone;
    }

    public String name() { return name;  }
    public String email(){ return email; }
    public String phone(){ return phone; }

    @Override
    public String toString(){
        return String.format("%s  %s  %s", name, (email==null?"":email), (phone==null?"":phone));
    }
}
