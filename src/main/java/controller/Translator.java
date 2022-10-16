package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Translator {
    @GetMapping("/translate")
public String display(){

    return "translator";
}
    List<String> english=new ArrayList<>();
    List<String> vietnamese=new ArrayList<>();

    @PostMapping("/translate")
    public String translate(@RequestParam String word, Model model){
        String mean = null;
        english.add("hello");
        english.add("apple");
        english.add("orange");
        vietnamese.add("xin chao");
        vietnamese.add("qua tao");
        vietnamese.add("qua cam");
       int index= english.indexOf(word);
       if (index>-1){
           mean =vietnamese.get(index);
       }
        model.addAttribute("mean",mean);
       return "translator";
    }


}
