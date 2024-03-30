import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. ClassNotFoundException example
            Class.forName("NonExistentClass");
            
            // 2. IllegalAccessException example
            throw new IllegalAccessException("Access denied!");
            
            // 3. IOException example
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            
            // 4. FileNotFoundException example
            FileReader fileReader = new FileReader("file.txt");
            
            // 5. NoSuchMethodException example
            Class<?> cls = String.class;
            cls.getMethod("nonExistentMethod");
            
            // 6. InstantiationException example
            Class<?> cls2 = Main.class;
            cls2.newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("No such method: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Instantiation error: " + e.getMessage());
        }
    }
}
