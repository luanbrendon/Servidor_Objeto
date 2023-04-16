/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
/**
 *
 * @author User
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        //abrir a conexao
        Socket socket = new Socket ("localhost", 3334);
        
        //definir stream de saida de dados do cliente
        ObjectOutputStream saida = new ObjectOutputStream (socket.getOutputStream());
        Pessoa p = new Pessoa ("Luan Brendon","rua dos bobos", 1.200, 26);
        saida.writeObject(p);
        
        //fechar a stream de saida de dados
        saida.close();
        
        //fecha o socket
        socket.close();
    }
    
}
