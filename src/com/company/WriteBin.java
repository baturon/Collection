package com.company;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBin {
    public static void main(String[] args) {
        String text = "Hello   World";
        try (FileOutputStream fos = new FileOutputStream("src/com/company/data.bin", false);
             DataOutputStream dout = new DataOutputStream(fos);) {
            dout.writeUTF(text);
dout.writeDouble(3.14);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
