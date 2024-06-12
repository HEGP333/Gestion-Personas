
public class Persona
{
    
    private String codigo;
    private String nombre;
    private String gmail;

    public Persona(){
        
    }
    public Persona(String codigo, String nombre, String gmail)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.gmail = gmail;
    }

   

//Start GetterSetterExtension Source Code

    /**GET Method Propertie codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**SET Method Propertie codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie gmail*/
    public String getGmail(){
        return this.gmail;
    }//end method getGmail

    /**SET Method Propertie gmail*/
    public void setGmail(String gmail){
        this.gmail = gmail;
    }//end method setGmail

//End GetterSetterExtension Source Code


}//End class