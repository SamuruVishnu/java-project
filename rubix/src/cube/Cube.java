package cube;

public class Cube {
    private char[][] U=new char[3][3];
    private char[][] D=new char[3][3];
    private char[][] B=new char[3][3];
    private char[][] F=new char[3][3];
    private char[][] L=new char[3][3];
    private char[][] R=new char[3][3];
    // Constructor → initialize cube with default colors
public Cube(){
    fillFace(U, 'W'); // Up = White
    fillFace(D, 'Y'); // Down = Yellow
    fillFace(L, 'O'); // Left = Orange
    fillFace(R, 'R'); // Right = Red
    fillFace(F, 'G'); // Front = Green
    fillFace(B, 'B'); // Back = Blue
}
    // Helper method to fill a face with a color
    private void fillFace(char[][] face, char color) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                face[i][j] = color;
            }
        }
    }
    // Method to display cube (console)
    public void display() {
        System.out.println("Up Face:");
        printFace(U);
        System.out.println("Down Face:");
        printFace(D);
        System.out.println("Left Face:");
        printFace(L);
        System.out.println("Right Face:");
        printFace(R);
        System.out.println("Front Face:");
        printFace(F);
        System.out.println("Back Face:");
        printFace(B);
    }
    // Print a single face
    private void printFace(char[][] face) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(face[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
