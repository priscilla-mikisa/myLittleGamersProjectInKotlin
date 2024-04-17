fun main() {
  findMyShape("rectangle","four","all sides are equal")
}
//Create a program that enables children to find if a shape is either a triangle,rectangle, square, or circle
//      PSEUDO CODE
//1. Input the name shape and properties(whether the shape is regular,two opposite sides equal,or all sides are equal).
//2. If the shape has four sides and all sides are equal shape is a rectangle.
//3. If shape has four sides and 2 opposite sides are equal output shape is a square.
//4. If shape has infinity sides and is regular, output shape is a circle.
//5. If shape has three sides and all sides are equal output shape is a triangle.
//6. Else output  shape is advanced and your promoted!!

fun findMyShape(name:String, numberOfSides: Any,property: String){
        if (name.lowercase()=="rectangle" &&numberOfSides==4|| numberOfSides=="four"||numberOfSides=="Four" && property.lowercase() == "all sides are equal"){
            println("Right!!! Shape is a $name")
        }
    else if (name.lowercase()=="triangle" && numberOfSides==3|| numberOfSides=="three" && property.lowercase()=="all sides are equal" ){
        println("Right!!! Shape is a $name")
        }
        else if (name.lowercase()=="square" && numberOfSides==4|| numberOfSides=="four" && property.lowercase()=="two oposite sides are equal" ){
            println("Right!!! Shape is a $name")
        }
        else if (name.lowercase()=="circle" && numberOfSides=="Infinity" && property.lowercase()=="regular" ){
            println("Right!!! Shape is a $name")
        }
    else{
        println("Try again shape is either wrong or not basic.")
        }
    }
