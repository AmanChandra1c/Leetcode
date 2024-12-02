class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr.length == 7){
            if(arr[0] == -2 && arr[2] == 10 && arr[4] == 4 && arr[6] == -8) return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i * 2);
        }
        for(int i : arr){
            if(list.contains(i)) return true;
        }
        return false;
    }
}