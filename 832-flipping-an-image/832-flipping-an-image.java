class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] img:image){
            for(int i = 0; i < (img.length + 1)/2; i++){
                int temp = img[i] ^ 1;
                img[i] = img[img.length - i - 1] ^ 1;
                img[img.length - i - 1] = temp;
            }    
        }
        return image;
    }
}