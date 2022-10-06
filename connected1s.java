import java.io.*;
public class connected1s {
    static final int row=6;
    static final int col=7;
    static int[][]vis=new int[row+1][col+1];
    static int id;
    static int diameter=0,length=0;
    static int x=0,y=0;
    static int dx[]={-1,1,0,0};
    static int dy[]={0,0,-1,1};

 // to perform dfs traversal
 static void dfs(int a, int b, int lis[][]){
    vis[a][b]=id;
    length++;
    if(length>diameter){
        x=a;
        y=b;
        diameter=length;
    }
    for(int j=0;j<4;j++){
        int cx=a+dx[j];
        int cy=b+dy[j];
        if(cy<0 || cx<0 || lis[cx][cy]==0 || vis[cx][cy]>0)
        {
            continue;
        }
        dfs(cx,cy,lis);
    }
    vis[a][b]=0;
    length--;

 }
 //function to call maximum length of connected 1s in given grid
 static void findmaxlength(int lis[][]){
    id++;
    length=0;
    diameter=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(lis[i][j]!=0){
                dfs(i,j,lis);
                i=row;
                break;
            }
        }
    }
    id++;
    length=0;
    diameter=0;
    dfs(x,y,lis);
    System.out.println(diameter);
 }

// Driver Code
public static void main(String[] args)
{
     
    // Given grid[][]
    int grid[][] = { { 0, 0, 0, 0, 0, 0, 0 },
                     { 0, 1, 0, 1, 0, 0, 0 },
                     { 0, 1, 0, 1, 0, 0, 0 },
                     { 0, 1, 0, 1, 0, 1, 0 },
                     { 0, 1, 1, 1, 1, 1, 0 },
                     { 0, 0, 0, 1, 0, 0, 0 } };
 
    // Function Call
    findmaxlength(grid);
}
}

