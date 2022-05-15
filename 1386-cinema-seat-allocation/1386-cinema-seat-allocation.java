class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int result = 0;
        
        Map<Integer, List<Integer>> rowResvSeats = new HashMap<>();
        
        for(int[] row : reservedSeats){
            if(rowResvSeats.containsKey(row[0])){
                rowResvSeats.get(row[0]).add(row[1]);
            }else
                rowResvSeats.put(row[0], new ArrayList<Integer>(Arrays.asList(row[1])));
        }
        
        result = (n - rowResvSeats.size()) * 2;         // These rows do not contain any reservations
        
         for(List<Integer> res : rowResvSeats.values()) { // Check possible family seating in each row 
            boolean flag = false;
            
			// Check first possibility
            if(!res.contains(2) &&
              !res.contains(3) &&
              !res.contains(4) &&
              !res.contains(5)) {
                result++;
                flag = true;
            }
            
            // Check second possibility
            if(!res.contains(6) &&
              !res.contains(7) &&
              !res.contains(8) &&
              !res.contains(9)) {
                result++;
                flag = true;
            }
            
            // Check middle seats only if first two are not used
            if(!flag) {
                if(!res.contains(4) &&
                   !res.contains(5) &&
                   !res.contains(6) &&
                   !res.contains(7))
                result++;
            }
        }
        return result;
    }
}