import java.io.*;
import java.net.*;

class servidorTCP {
  public static void main(String argv[]) throws Exception
  {
    String fraseCliente;
    String FraseMaiusculas;
    
    ServerSocket socketRecepcao = new ServerSocket(6789);
    
    while(true) {
      Socket socketConexao = socketRecepcao.accept();
      
      BufferedReader doCliente = new BufferedReader(new
      
      InputStreamReader(socketConexao.getInputStream()));
      
      DataOutputStream paraCliente = new DataOutputStream(socketConexão.getOutputStream());
      
      fraseCliente= doCliente.readLine();
      fraseEmMaiusculas= fraseCliente.toUpperCase() + '\n';
      
      paraCliente.writeBytes(fraseEmMaiusculas);
    }
  }
}
