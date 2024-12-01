import java.util.*; 

public class DayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("first list:");
        for (int i = 0; i < 1000; i++) {
            int val = sc.nextInt();
            arr1.add(val); 
        }
        System.out.println("second list:");
        for (int i = 0; i < 1000; i++) {
            int val = sc.nextInt();
            arr2.add(val); 
        }
        // System.out.println("Result: " + dayone(arr1, arr2));
        System.out.println("Result: " + getSimilarity(arr1, arr2));
    }

    static int dayone(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Collections.sort(arr1); 
        Collections.sort(arr2);
        int sum = 0;
        for (int i = 0; i < arr2.size(); i++) {
            int dif = Math.abs(arr1.get(i) - arr2.get(i)); 
            sum += dif; 
        }
        return sum; 
     }

     static int getSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr1) map.put(val,map.getOrDefault(val,0)+1);
        int ans = 0;
        for(int val:arr2){
            ans += val*map.getOrDefault(val,0);
        }
        return ans;
    }
}
