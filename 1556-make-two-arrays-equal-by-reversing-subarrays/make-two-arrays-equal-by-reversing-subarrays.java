// class Solution {

//     public boolean canBeEqual(int[] target, int[] arr) {
//         HashMap<Integer, Integer> hm_target = new HashMap<>();
//         for (int i = 0; i < target.length; i++) {
//             if (hm_target.containsKey(target[i])) {
//                 hm_target.put(target[i], hm_target.get(target[i]) + 1);
//             } else {
//                 hm_target.put(target[i], 1);
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (hm_target.containsKey(arr[i])) {
//                 hm_target.put(arr[i], hm_target.get(arr[i]) - 1);
//                 if (hm_target.get(arr[i]) == 0) {
//                     hm_target.remove(arr[i]);
//                 }
//             } else {
//                 return false;
//             }
//         }
//         if (hm_target.isEmpty()) {
//             return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}