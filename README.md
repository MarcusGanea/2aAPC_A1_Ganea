# 2aAPC_A1_Ganea
<a name="readme-top"></a>
# Vererbung
Author: Ganea Marcus-Alin <br>
LBS Eibiswald | 2aAPC <br>
Erstellt am 12.09.2024

Diese Anwendung ist die erste Übung vom Labor ITL12...<br>

## Das Ziel der Übung
### Erstelle ein Basisklasse Person, von welcher die Klasse Employee abgeleitet werden soll.

Die Klasseneigenschaften und Methoden entnimm dem
Klassendiagramm.

Es sollen sämtliche Methoden ausprogrammiert werden.
Erweitere die Mitarbeiter (Employee) Klasse um die Eigen-
schaften: - SupervisorID, - Salary
und die Methoden: set/get für beides und eine Methode
salaryIncrease(float). 


## Installation

```cmd

git checkout origin/master
```
## oder
```cmd
git clone https://github.com/MarcusGanea/2aAPC_HelloWorld

```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Verwendung
Technologien im Einsatz:
[![Java][java.com]][java-url]

```java
 switch (option) {
                case 1:
                    // Display employee information
                    System.out.println();
                    employee.printAll();
                    break;
                case 2:
                    // Set supervisor ID
                    System.out.print("Enter the new supervisor ID: ");
                    String supervisorId = scanner.next();
                    employee.setSupervisorId(supervisorId);
                    System.out.println("Supervisor ID updated.");
                    break;
                case 3:
                    // Set salary
                    System.out.print("Enter the new salary: ");
                    float salary = scanner.nextFloat();
                    employee.setSalary(salary);
                    System.out.println("Salary updated.");
                    break;
                case 4:
                    // Add salary increase
                    System.out.print("Enter the salary increase: ");
                    float increase = scanner.nextFloat();
                    employee.salaryIncrease(increase);
                    System.out.println("Salary increase added.");
                    break;
                case 5:
                    // Set age
                    System.out.print("Enter the new age: ");
                    int age = scanner.nextInt();
                    employee.setAge(age);
                    System.out.println("Age updated.");
                    break;
                case 6:
                    // Exit program
                    exit = true;
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Invalid option, please choose again.");

```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Screenshots

[![Screen Shot][product-screenshot]](Screen.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[java.com]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[java-url]: https://www.java.com/de/
[product-screenshot]: Screen1.png

