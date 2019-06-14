/*
 * ²»¹»¼ò½à
 */
class Solution {
    public int numRookCaptures(char[][] board) {
        int sum = 0;
        int xR = 0;
        int yR = 0;
        for(int x=0;x<8;x++) {
            for(int y=0;y<8;y++) {
                if(board[y][x] == 'R') {
                    xR = x;
                    yR = y;
                    break;
                }
            }
        }
        int xRight = xR + 1;
        while(xRight < 8) {
            if(board[yR][xRight] == '.') {
                xRight++;
                continue;
            }
            else if(board[yR][xRight] == 'p') {
                sum++;
                break;
            }
            else if(board[yR][xRight] == 'B') {
                break;
            }
        }
        int xLeft = xR - 1;
        while(xLeft >= 0) {
            if(board[yR][xLeft] == '.') {
                xLeft--;
                continue;
            }
            else if(board[yR][xLeft] == 'p') {
                sum++;
                break;
            }
            else if(board[yR][xLeft] == 'B') {
                break;
            }
        }
        int yUp = yR + 1;
        while(yUp < 8) {
            if(board[yUp][xR] == '.') {
                yUp++;
                continue;
            }
            else if(board[yUp][xR] == 'p') {
                sum++;
                break;
            }
            else if(board[yUp][xR] == 'B') {
                break;
            }
        }
        int yDown = yR - 1;
        while(yDown >= 0) {
            if(board[yDown][xR] == '.') {
                yDown--;
                continue;
            }
            else if(board[yDown][xR] == 'p') {
                sum++;
                break;
            }
            else if(board[yDown][xR] == 'B') {
                break;
            }
        }
        return sum;
    }
}