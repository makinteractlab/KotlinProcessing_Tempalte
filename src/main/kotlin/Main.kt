import processing.core.PApplet
import processing.core.PVector


// Program entry point
fun main(args:Array<String>)
{
    // Execute Processing Sketch 
    PApplet.main("Sketch")

    // Call a Java class
    var x = Boo()    
}



// Example of Processing sketch
class Sketch() : PApplet() {

    override fun settings() {
        size(640, 360)
    }

    override fun setup() {
        frameRate(30f)
        ellipseMode(RADIUS)
    }

    override fun draw() {
        background(255)
        fill(255f,255f,0f)
        rectMode(CENTER)
        rect(width/2f, height/2f, 100f, 100f)
    }
}



