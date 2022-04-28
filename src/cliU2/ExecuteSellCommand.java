package cliU2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteSellCommand {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter anything: ");
        String str = br.readLine();
        System.out.println("You have Entered: ");
        System.out.println(str);
    }
}
