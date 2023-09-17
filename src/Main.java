import Utils.Hamming;
import Utils.SimHash;
import Utils.TXTIO;

public class Main {
    public static void main(String[] args) {
        String str0 = TXTIO.readTXT(args[0]);
        String str1 = TXTIO.readTXT(args[1]);
        String fileName = args[2];
        String simHash0 = SimHash.getSimHash(str0);
        String simHash1 = SimHash.getSimHash(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        TXTIO.writeTXT(similarity, fileName);
        System.exit(0);
    }
}
