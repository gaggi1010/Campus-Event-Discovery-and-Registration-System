# Campus Event Discovery and Registration System

A Java 17 desktop application for campus event discovery, student registration, event administration, capacity control and waitlists. Built with Java Swing, JDBC, SQLite and Maven.

## Features
- Student sign-up and login; seeded administrator login.
- Browse, search and filter events; view event details.
- Register, cancel, see registration history and waitlist status.
- Duplicate-registration, event-status, deadline and capacity validation.
- FIFO waitlist promotion when a confirmed registration is cancelled.
- Admin event creation, editing, cancellation, student list and participant reports.
- CSV export; persistent SQLite database; PBKDF2 password hashing.
- Prepared statements, foreign keys and transactions.

## Requirements and run
Install JDK 17+ and Maven 3.8+. In the project directory run:

```bash
mvn clean test
mvn exec:java
```

The app creates `data/campus_events.db` automatically. A graphical desktop session is required.

## Demo administrator
- Email: `admin@campus.local`
- Password: `Admin@123`

This is a local demo account. Change the password before any real use. Create student accounts through the login window.

## Architecture
`model` contains domain entities; `dao` contains JDBC persistence; `service` enforces business rules; `ui` contains Swing screens; `util` contains database bootstrap, password hashing and CSV export. UI code calls services, not SQL directly.

## OOP concepts
Encapsulation (private fields and validated construction), inheritance (`Student` and `Admin` extend abstract `User`), abstraction (`User` and `Searchable`), polymorphism (overridden role/display methods and overloaded event search), associations between students/events/registrations, collections, custom exception messages and file export.

## Database
SQLite file is generated locally and intentionally ignored by Git. The schema is documented in `database/schema.sql`; startup initializes tables and inserts demo categories, organizer, event and admin.

## GitHub upload
```bash
git init
git add .
git commit -m "Initial campus event system"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/Campus-Event-Discovery-and-Registration-System.git
git push -u origin main
```

Do not commit the generated database or real student data. Add screenshots under `docs/screenshots/` after running the application.

## Future improvements
Email notifications, organizer accounts, poster uploads, event calendar integration, backups, richer analytics and a web deployment for multi-device access.

Educational portfolio project; review privacy, security and backup requirements before institutional use.
