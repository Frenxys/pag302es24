package solamenteTuuu;
import java.util.*;
import java.io.*;

public class TextFile {

	private char mode;
	private String percorsoFile;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public TextFile(String fileName, String mode) throws IOException {
		this.mode=mode.charAt(0);
		if(mode.charAt(0) == 'R' || mode.charAt(0) == 'r') {
			reader = new BufferedReader(new FileReader (fileName));
		}else {
			writer = new BufferedWriter(new FileWriter (fileName));
		}
		this.percorsoFile=fileName;
	}
	
	public String read() throws IOException {
		String top;
		top=reader.readLine();
		if(top==null) {
			top="file finito";
		}
		return top;
	}

	public void cambiaTipo() throws IOException {
		if(mode == 'R' || mode == 'r') {
			reader.close();
			writer = new BufferedWriter(new FileWriter (percorsoFile));
		}else {
			writer.close();
			reader = new BufferedReader(new FileReader (percorsoFile));
		}
	}
	
  public String[] getOperazioniByTipo(char tipo) {
        LinkedList<String> daRestituire = new LinkedList<>();

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] operazione = line.split(";");

                if (operazione.length > 0 && operazione[0].charAt(0) == tipo) {
                    daRestituire.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return daRestituire.toArray(new String[daRestituire.size()]);
    }

}

