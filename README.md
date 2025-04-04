# IPv4 Address Checker

A simple program that validates whether a given string is a valid IPv4 address based on specific criteria. This project was built using the **Test-Driven Development (TDD)** approach.

---

## **How It Works**

An IPv4 address is valid if it:
1. Contains four numeric segments separated by dots (`.`).
2. Each segment is a number between **0** and **255** (inclusive).
3. Segments do not have leading zeros (e.g., `01` or `001` are invalid, but `0` is valid).
4. Contains no extra characters or invalid symbols.
5. Has exactly **three dots** separating the four segments.

---

## **Features**
- Verifies IPv4 addresses by validating:
  - Correct number of segments.
  - Valid numeric range for each segment.
  - Absence of leading zeros in segments.
- Includes robust test cases for various scenarios (valid and invalid inputs).
- Uses Kotlin programming language.

---

## **Test Cases**

The program includes the following test cases:
- **Invalid Cases**:
  - Null, empty, or whitespace string.
  - Incorrect delimiters (e.g., commas).
  - Too few or too many segments.
  - Consecutive or trailing dots.
  - Non-numeric or special character segments.
  - Numbers out of range (negative or >255).
  - Segments with leading zeros.
- **Valid Cases**:
  - Private IP addresses (e.g., `192.168.0.0`, `10.255.255.255`).
  - Reserved IPs (e.g., `0.0.0.0`, `255.255.255.255`).

---

## **Technologies Used**
- **Kotlin**: Programming Language.
- **TDD**: Test-Driven Development for implementation.
- **IDE**: IntelliJ IDEA (or your favorite Kotlin IDE).

---

*Flowchart*

The flowchart below explains the decision-making process of the IPv4 checker.


#### *Flowchart Description*

<img src="https://github.com/Ahmed7osny1/IPv4-Address-Checker/blob/master/IPv4%20Address%20Checker%20Flow%20Chart.png?raw=true" alt="IPv4 Address Checker Flowchart Description" width="800" height="1000">

