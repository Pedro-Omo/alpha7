import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;
import java.text.NumberFormat;
public class alpha7 {
    
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
String input = "";

while (true){
System.out.println("Enter:  ");
input = scanner.next().toUpperCase();

if (input.equals("pass"))
continue;
if (input.equals("quit"))
break;
System.out.println(input);
}

}
}
