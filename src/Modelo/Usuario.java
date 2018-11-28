
package Modelo;


public class Usuario {
    String id;
    String name;
    String last_name;
    String password;
    String position;
    
    public Usuario(){
        id="";
        password="";
        last_name="";
        name="";
        position="";
    }
    
    public String getID(){
        return id;
    }
    public void setId (String id){
        this.id=id;
    }
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    public String getLastName(){
        return last_name;
    }
    public void setLast_name(String last_name){
        this.last_name=last_name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
}
