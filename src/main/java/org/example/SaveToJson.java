package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {
    private Toy toy;

    public SaveToJson(Toy toy) {
        this.toy = toy;
    }

    public void saveToJson(){
        String fileName = "toys.json";
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write("{\n");
            writer.write("\"Id\":\"" + toy.getId() + "\",\n");
            writer.write("\"Model\":\"" + toy.getModel() + "\",\n");
            writer.write("\"Count\":\"" + toy.getCount() + "\",\n");
            writer.write("\"Weight\":\"" + toy.getWeight() + "\"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
