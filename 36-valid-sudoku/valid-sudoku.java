class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set seen = new HashSet();

        for(int i=0;i<9;i++){
            for(int j = 0;j<9;j++){
                char word = board[i][j];

                if(word!='.'){
                    if(!seen.add(word + "at row" + i)||
                    !seen.add(word + "at col" + j)||
                    !seen.add(word + "at box" + i/3 +'.'+ j/3)){
                        return false;
                    }

                }
            }
            
        }
        return true;
        
    }
}