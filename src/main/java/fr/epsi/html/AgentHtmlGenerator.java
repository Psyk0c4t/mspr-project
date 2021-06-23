package fr.epsi.html;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AgentHtmlGenerator {
    public static void main(String[] args) {
        if(args.length == 0){
            System.err.println("Veulliez indiquer le chemin du fichier");
            System.exit(1);
            return;
        }

        Path file = Paths.get(args[0]);
        if(!file.toFile().exists()){
            System.err.println("Le fichier " + args[0] + "n'existe pas");
            System.exit(2);
            return;
        }

        try {
            System.out.println("<html><body>");
            List<String> lines = Files.readAllLines(file);      //lire les lignes

            String[] datas = lines.toArray(new String[0]);      //initialisation du tableau


            System.out.println("Fiche Agent");  //En-tête
            System.out.println("<br/>Nom de l'agent : " + datas[0]  );   //nom agent
            System.out.println("<br/>Prénom de l'agent: "+ datas[1]);   //prenom agent
            System.out.println("<br/>Rôle de l'agent: "+ datas[2]);     //Role agent



         /*   for (String line : lines) { //
                // System.out.println(line);
                System.out.println("<tr>");
                String[] array  = line.split(",");
                for (String a:array){
                    System.out.println("<td>");
                    System.out.println("Fiche Agent");  //En-tête
                    System.out.println("");   //nom agent

                    System.out.println("</td>");
                }
                for (String b:array){
                    System.out.println("<td>");
                    System.out.println("Nom de l'agent:"+b);   //prenom agent

                    System.out.println("</td>");

                    System.out.println("<a href='index.html'> </a>");
                }
                for (String c:array){
                    System.out.println("<td>");
                    System.out.println("Prénom de l'agent: "+c);   //Rôle

                    System.out.println("</td>");
                }
                for (String d:array){
                    System.out.println("<td>");
                    System.out.println();   //Liste du materiel
                    System.out.println("<a href='index.html'> </a>");   //Retour au menu
                    System.out.println("</td>");
                }
                System.out.println("</tr>");
            }*/
            System.out.println("</body></html>");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
