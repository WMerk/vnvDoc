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
- [GitHub](https://github.com/WMerk/VnVProject)
- [Blog](https://vnvproject.wordpress.com/)
- [Overall Use case diagram](https://github.com/WMerk/VnVProject/blob/master/doc/use%20cases/SRS.png)
- [Software Requirements Specification](SRS.MD)
- [UC Add friend](UC_AddFriend.MD)
- [UC_ChangePassword](UC_ChangePassword.MD)
- [UC Create new offer](UC_CreateNewOffer.MD)
- [UC_DeleteAccount](UC_DeleteAccount.MD)
- [UC_EditProfile](UC_EditProfile.MD)
- [UC_Login](UC_Login.MD)
- [UC_Register](UC_Register.MD)

## 2. Architectural Representation
vnv uses the MVVM-Pattern for its architecture design.

MVVM Diagram: 

![MVVM][]

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
[MVVM]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/RUP/mvvm.png "MVVM Diagram"
[Architecture]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/SAD/ArchitectureDiagramm.png "Architecture"
[Overview]:  https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/UML/classdiagram_dep_marked.png "Class Overview"
[DesignPackages]:  "Design Packages"
