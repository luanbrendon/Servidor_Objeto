/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 10722128072
 */
public class Principal {
    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota", 100);
        Trabalhador ricardo = new Trabalhador("bota", 100);
        severino.start();
        raimundo.start();
        ricardo.start();
}

}
