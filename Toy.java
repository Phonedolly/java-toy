import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toy
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        You you  = new You();

        System.out.println("안녕?");
        System.out.println("");

        System.out.print("키가 몇이니    ");
        you.name = reader.readLine();
        
        System.out.print("이름이 뭐니?   ");
        you.tall = Double.valueOf(reader.readLine()).doubleValue();

        System.out.println("너는 키가 " + you.tall + "이고 이름은 " + you.name + "이구나");
    }
}

class You
{
    String name;
    Double tall;
    public You()
    {
        name = "";
        tall = 0.0;
    }
}