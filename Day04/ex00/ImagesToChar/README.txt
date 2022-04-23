
#creating a new directory target
mkdir target

#getting the directory of class files
javac -d ./target src/java/edu/school21/printer/*/*.java

#specify path for user class files, char for black pixels, char for white pixels, full path to the image
java -cp ./target edu.school21.printer.app.Program 0 . it.bmp