package easyCoderByte;



public class AdditivePersistence {

    private static int additivePersistence(int num){
    int times = 0;
    int added = num;
    while (added > 9) {
        int sum = 0;
        String[] intArr = Integer.toString(added).split("");
        for (String i : intArr) {
            sum += Integer.parseInt(i);
        }
        added = sum;
        times++;
    }
    return times;
  }

    public static void main(String[] args) {
    var result1 = additivePersistence(199);
        System.out.println(result1);
        var result2 = additivePersistence(913);
        System.out.println(result2);
}
}

