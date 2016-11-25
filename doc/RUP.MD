#vnv – Verleihen, Dienstleistungen, verschenken
#Software Architecture Document


## 1. Introduction 
### 1.1 Purpose
This document provides a comprehensive architectural overview of the system, 
using a number of different architectural views to depict different aspects of the system. 
It is intended to capture and convey the significant architectural decisions which have been made on the system.

### 1.2 Scope
The scope of this SAD is to show the architecture of the vnv project. Affected are the class structure, the use cases and the data representation.

### 1.3 References

### 1.4 Overview

## 2. Architectural Representation
vnv uses an extended MVC-Pattern.

MVC Diagram: 

![MVC][]

## 3.Architectural Goals and Constraints 
We decided to use Spring for the back-end and AngularJs for the front-end of the web-project. 
Both components are coupled by the Rest-API. 

Architecture: 
![Architecture][]


## 4. Use-Case View 
n/a

## 5. Logical View
### 5.1 Overview

![Overview][]

### 5.2	Architecturally Significant Design Packages
![DesignPackages][]

## 6. Process View
n/a

## 7. Deployment View
n/a
## 8. Implementation View
n/a

## 9. Data View (optional)

## 10. Size and Performance

## 11. Quality


<!-- picture links -->
[MVC]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/RUP/mvc.png "MVC Diagram"
[Architecture]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/RUP/ArchitectureDiagramm.png "Architecture"
[Overview]:  "Class Overview"
[DesignPackages]:  "Design Packages"
