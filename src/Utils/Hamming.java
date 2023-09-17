package Utils;

public class Hamming {

    public static double getSimilarity(String simHash1, String simHash2) {
        int distance = getHammingDistance(simHash1, simHash2);
        // 计算相似度
        return 0.01 * (100 - distance * 100 / 128);
    }

    public static int getHammingDistance(String simHash1, String simHash2) {
        int distance = 0;
        if (simHash1.length() != simHash2.length()) {
            distance = -1;
        } else {
            for (int i = 0; i < simHash1.length(); i++) {
                if (simHash1.charAt(i) != simHash2.charAt(i)) distance++;
            }
        }
        return distance;
    }
}
