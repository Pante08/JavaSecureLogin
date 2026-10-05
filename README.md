# 🔐 Java Login System

A simple **Java login system** that allows users to create their own username and password, then log in using those credentials.

The program gives the user **3 login attempts** before their account is locked.

## 📌 Features

- Create a custom username
- Create a custom password
- Login using the created credentials
- 3 login attempts
- Displays remaining attempts
- Locks the account after 3 failed attempts
- Displays a welcome message after a successful login

## 🛠️ Technologies Used

- **Java**
- `Scanner`
- `while` loops
- `if / else` statements
- `String` variables
- `.equals()` for comparing strings
- `break` statements

## ▶️ How It Works

### 1. Create an Account

When the program starts, the user creates their username and password.

```text
===== CREATE ACCOUNT =====

Create a username: admin
Create a password: 12345

Account created successfully!
```

### 2. Login

The user then enters the username and password they created.

```text
===== LOGIN =====

Enter username: admin
Enter password: 12345

Login Successful!
Welcome, admin!
```

### 3. Incorrect Login

If the credentials are incorrect, the program decreases the number of remaining attempts.

```text
Incorrect username or password.
Attempts remaining: 2
```

### 4. Account Lock

After 3 incorrect attempts, the account is locked.

```text
Incorrect username or password.
Account locked.
```

## 📂 Project Structure

```text
LoginSystem/
└── LoginSystem.java
```

## 🚀 Future Improvements

Some features I plan to add in future versions:

- Save accounts to a file
- Allow users to create multiple accounts
- Password masking
- Password requirements
- Username validation
- Account recovery
- More advanced authentication/security features

## 🎯 What I Learned

This project helped me practice the fundamentals of Java, including:

- Taking user input with `Scanner`
- Working with variables
- Comparing Strings with `.equals()`
- Using conditional statements
- Creating loops
- Tracking login attempts
- Controlling program flow with `break`

## 👨‍💻 Author

**Pantelis**

Beginner Java project created as part of my programming practice.
