# 🛒 nopCommerce Automation Test Suite

Automation test scenarios for [nopCommerce](https://demo.nopcommerce.com), built with Java, Selenium WebDriver, and TestNG. This suite validates core user flows such as registration, login, product navigation, and ordering to ensure a secure and seamless user experience.

---

## 📌 User Stories & Coverage

| ID      | Title                             | Description                                                                 |
|---------|-----------------------------------|-----------------------------------------------------------------------------|
| US_501  | User Registration                 | Validates user registration flow with field inputs and confirmation message |
| US_502  | User Login                        | Tests login functionality with valid credentials                            |
| US_503  | Login Combinations                | Covers both valid and invalid login attempts                                |
| US_504  | Tab Menu Control                  | Verifies tab menu and submenu navigation                                    |
| US_505  | Product Control in Tab Menu       | Ensures product listing and search consistency                              |
| US_506  | Gift Ordering Process             | Validates gift card ordering with recipient details                         |
| US_507  | Computer Order Process            | Tests customizable desktop configuration and cart addition                  |
| US_508  | Parameterized Search Process      | Validates XML-driven search and result accuracy                             |

---

## 📝 Acceptance Criteria Highlights

- ✅ Registration requires First Name, Last Name, Email, DOB, and Password (≥6 chars)
- ✅ Login must display account section upon success
- ✅ Invalid login attempts trigger warning messages
- ✅ Tab menus and submenus must be clickable and route correctly
- ✅ Product search results must match listed items
- ✅ Gift and computer orders must validate mandatory fields and confirm cart addition
- ✅ Search results must include the queried product title

---

## ⚙️ Test Setup & Execution

### ✅ Preconditions

- Supported browsers: Chrome, Firefox, Safari
- Active internet connection
- Valid registered user account
- Test environment: [https://demo.nopcommerce.com](https://demo.nopcommerce.com)

### 🚀 Execution Notes

- Use `@DataProvider` for login combinations
- Use `@Parameters` for XML-driven search input
- Apply `dependsOnMethods` and `priority` for test sequencing
- Capture screenshots and logs for debugging
- Follow Page Object Model (POM) for reusable components

---

## 🛠️ Technologies & Tools

| Component        | Description                     |
|------------------|---------------------------------|
| Automation       | Selenium WebDriver (Java)       |
| Framework        | TestNG                          |
| Design Pattern   | Page Object Model (POM)         |
| Build Tool       | Maven                           |
| Test Management  | Jira / Zephyr                   |
| Version Control  | GitHub                          |
| Browsers         | Chrome, Firefox, Safari         |

---

## 👥 Team

**Contributors:**  
- Aslıhan GÜLLÜOĞLU
- Efe ERSAN
- Rüya TIRAŞ
- Taner ÖZÇELİK
- Arslan Taha DURAN
---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---
