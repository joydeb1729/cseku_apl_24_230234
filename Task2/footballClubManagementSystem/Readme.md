# Football club.Club Management System

This project implements a Football club.Club Management System using object-oriented principles, specifically adhering to the S.O.L.I.D. design principles. The system models the essential components of a football club, including clubs, teams, players, coaches, stadiums, sponsors, and staff members. Each class is designed to encapsulate specific attributes and behaviors relevant to the component it represents, making the system modular, scalable, and maintainable.

## How S.O.L.I.D. Principles are maintained?

- **S**: Single Responsibility Principle (**SRP**)
- **O**: Open/Closed Principle (**OCP**)
- **L**: Liskov Substitution Principle (**LSP**)
- **I**: Interface Segregation Principle (**ISP**)
- **D**: Dependency Inversion Principle (**DIP**)


## Project Structure

```plaintext
FootballClubManagementSystem/
│
├── club/
│   └── Club.java
│
├── team/
│   └── Team.java
│
├── player/
│   ├── Player.java
│   ├── SeniorPlayer.java
│   └── JuniorPlayer.java
│
├── staff/
│   ├── Coach.java
│   └── Staff.java
│
├── interfaces/
│   ├── Injurable.java
│   ├── RevenueManageable.java
│   └── SalaryManageable.java
│
├── stadium/
│   └── Stadium.java
│
└── sponsor/
    └── Sponsor.java
 ```


### club.Club Class
The `club.Club` class represents a football club and its primary properties, such as the club’s name, location, stadium, balance, and associated teams, staff, and sponsors. The class includes methods to add and remove teams, adjust finances through revenue generation, and manage salary payments to staff and players. This structure encapsulates the main operations and data of the club, following the **Single Responsibility Principle (SRP)** by focusing solely on club-specific management.

### team.Team Class
The `team.Team` class manages players, a coach, formation, and performance records. It provides methods for player management, coach assignment, formation updates, match tracking, and performance summary. Following **SRP**, it manages only team-specific details while upholding **OCP** for performance metric extensions.

### player.Player Class
An abstract class, `player.Player` encapsulates core attributes common to all players, such as name, age, position, salary, gender, and injury status. It implements both `interfaces.Injurable` and `interfaces.SalaryManageable` interfaces, centralizing the management of these attributes. This modular approach upholds **SRP** and **ISP** by focusing on player-specific behaviors.

### player.SeniorPlayer Class
`player.SeniorPlayer` extends `player.Player` with additional attributes like leadership skills and a bonus percentage, which enables performance-based bonus calculations. The class demonstrates **LSP** by extending player attributes while maintaining expected behavior.

### player.JuniorPlayer Class
`player.JuniorPlayer` extends the `player.Player` class to include additional attributes unique to junior players, such as school affiliation and scholarship status. The class reuses base player functionality and adds junior-specific details, adhering to **Liskov Substitution Principle (LSP)** by allowing junior players to substitute for general players in the system.

### staff.Coach Class
The `staff.Coach` class models a coach with attributes such as name, experience, strategy, and salary. It provides methods for strategy adjustment and salary management. This class also implements the `interfaces.SalaryManageable` interface, enabling salary updates while adhering to **Interface Segregation Principle (ISP)** by focusing only on salary-related functions relevant to a coach.

### staff.Staff Class
`staff.Staff` models club staff members with attributes for name, salary, and role. Implementing `interfaces.SalaryManageable`, the class manages salary adjustments, following **SRP** by focusing solely on staff attributes and related functionalities.

### sponsor.Sponsor Class
The `sponsor.Sponsor` class models a sponsor with details such as sponsorship amount, contract duration, and type. It includes functionality for extending sponsorship contracts. The class adheres to **SRP** by encapsulating only sponsor-specific details, keeping the system modular.

### stadium.Stadium Class
`stadium.Stadium` represents a stadium entity with properties like name, capacity, and ticket sales. It implements `interfaces.RevenueManageable` to facilitate revenue tracking and ticket sales operations. The design supports **SRP** by centralizing stadium-related functions and **OCP** for future expansions.

---

