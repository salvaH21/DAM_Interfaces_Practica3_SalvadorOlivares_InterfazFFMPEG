package interfazffmpeg;

public class InterfazFFMPEG {

    public static void main(String[] args) {
        String comando = "C://Users//salva//Documents//FFMPEG//ffmpeg ejecutable//bin//ffmpeg.exe -i C://Users//salva//Documents//FFMPEG//Codificar//original.avi C://Users//salva//Documents//FFMPEG//Codificar//destino.mp4";
        try {
            ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", comando);
            Process miproceso = proceso.start();
            System.out.println("ok nada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
