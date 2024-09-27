class MyCalendarTwo {
    List<int[]> single = new ArrayList<>();
    List<int[]> doubleBooked = new ArrayList<>(); 
    public MyCalendarTwo() {}   
    public boolean book(int start, int end) {
        for (int[] booking : doubleBooked) {
            if (Math.max(start, booking[0]) < Math.min(end, booking[1])) {
                return false; 
            }
        }
        for (int[] booking : single) {
            if (Math.max(start, booking[0]) < Math.min(end, booking[1])) {
                doubleBooked.add(new int[]{Math.max(start, booking[0]), Math.min(end, booking[1])});
            }
        }
        single.add(new int[]{start, end});
        return true;
    }
}