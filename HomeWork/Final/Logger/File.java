package Logger;

import java.io.*;

public class File implements Logger {
    private String New;

    /**
     * @param New имя файла записи
     */
    public File(String New) {
        this.New = New;
    }

    /**
     * @param message
     */
    @Override
    public void Resultat(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(New, true))) {
            writer.write("[FileLogger] " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
