package Utilities.MonstersLoader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class LoadMonstersJson {
    private static final Type monsterToken = new TypeToken<List<MonsterStats>>() {
    }.getType();
    private static final String PATH = "src/main/resources/Monsters/MonstersList.json";

    protected static List<MonsterStats> getAllMonsters() {
        try{
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader(PATH));
            return gson.fromJson(reader,monsterToken);
        }catch (FileNotFoundException e){
            System.out.println("Monster file not found, please create a new monster file in " + PATH);
            throw new RuntimeException();
        }
    }

}
