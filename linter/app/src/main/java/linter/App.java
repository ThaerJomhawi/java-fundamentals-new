/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {



        Path jsFile = Paths.get("app/src/main/resources/gates.js");
        System.out.println(javaScriptLinter(jsFile));
    }


    public static String javaScriptLinter(Path jsFile) {
        String errMsg = "";


        try {
            List<String> fileLines = Files.readAllLines(jsFile);
            for (int i = 0; i < fileLines.size(); i++) {
                if (!fileLines.get(i).endsWith(";")){
                    if (!(fileLines.get(i).isBlank() || fileLines.get(i).endsWith("{") || fileLines.get(i).endsWith("}") || fileLines.get(i).contains("if") ||fileLines.get(i).contains("else"))){
                        errMsg+= "Line "+(i+1)+": Missing semicolon.\n";
                    }
                }
            }
        } catch (IOException exception) {
            System.out.println("");
        }

        return errMsg;
    }

}