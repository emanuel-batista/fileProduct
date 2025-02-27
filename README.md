# File Processing in Java

This project is a simple Java application that reads product data from a CSV file, processes it, and writes a summary file to an output directory. The goal of this project is to practice file handling in Java, which I have recently learned.

## 📂 Project Structure

```
fileProduct/
│-- src/
│   ├── application/
│   │   ├── Main.java
│   ├── model/
│   │   ├── entities/
│   │   │   ├── Product.java
```

## 🛠 How It Works

1. The program asks for a file path from the user.
2. It reads product data from the specified CSV file.
3. Each product is stored as an instance of the `Product` class.
4. The program calculates the total price for each product (price × quantity).
5. The processed data is written to a new file named `summary.csv` inside an `out/` directory.

## 📜 Product Class

The `Product` class represents an item with:
- `name`: The product's name.
- `price`: The unit price of the product.
- `quantity`: The quantity of the product.
- `totalPrice()`: A method to calculate the total cost.
- `toString()`: A method that formats the output as `name,totalPrice` for easy CSV writing.

```java
@Override
public String toString() {
    return this.name + "," + this.totalPrice();
}
```

## 📥 Input File Format (`items.csv`)
Each line in the CSV file should have the following format:
```
ProductName,Price,Quantity
Laptop,1200.50,2
Mouse,25.00,5
Keyboard,45.99,3
```

## 📤 Output File (`summary.csv`)
The program generates a `summary.csv` file in the `out/` folder with the following format:
```
ProductName,TotalPrice
Laptop,2401.00
Mouse,125.00
Keyboard,137.97
```

## 🔧 Requirements
- Java 8+
- IntelliJ IDEA or any Java IDE
- A CSV file with product data

## 🚀 Running the Project
1. Compile and run `Main.java`.
2. Enter the full path of the `items.csv` file when prompted.
3. Check the `out/` folder for the generated `summary.csv` file.

## 📚 What I Learned
This project was a great hands-on way to learn about **file handling in Java**, including:
- Reading files using `BufferedReader`.
- Writing files using `BufferedWriter`.
- Handling directories and file paths.
- Working with lists and objects.

This is just the beginning of my journey in Java file manipulation! 🚀

