import java.util.Arrays;
public class Model extends Company{
    String[] models = new String[0];

    Model(String CompanyName){
        super();
        super.Company_name = CompanyName;
    }

    private void ArrayAppend(String appendItem) {
    
      this.models = Arrays.copyOf(this.models, this.models.length + 1);
      this.models[this.models.length - 1] = appendItem;
     
    }


    public void AddModel(String Modelname){
        ArrayAppend(Modelname);
    }

    public String[] getModels(){
        return this.models;
    }
}