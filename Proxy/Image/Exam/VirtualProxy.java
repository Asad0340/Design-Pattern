/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;


public class VirtualProxy implements Image {
    private Image realImage;
    private String fileName;

    public VirtualProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            if (isSupportedFile(fileName)) {
                realImage = new RealImage(fileName);
            } else {
                realImage = new UnsupportedImage(fileName);
            }
        }
        realImage.display();
    }
    private boolean isSupportedFile(String fileName) {
        // Add logic to check if the file type is supported
        // For simplicity, let's assume only JPG files are supported in this example
        return fileName.endsWith(".jpg");
    }
}

