# Сервис пассажирских перевозок

## Бэкенд

Для запуска требуется бэкенда:
gradle, sqlite3

Для начала работы надо инициировать базу данных, для этого:
`sqlite3 mydatabase.db ".read create.sql" ".read data.sql"`

Затем запустить сервер

Команда старта сервера: `gradlew :bootRun`

Код сервера находится здесь, в текущей папке.

## Фронтенд

Код для мобильного приложения доступен по пути:
`travel_booking_app/`

Для запуска требуется фронтенда:
dart, flutter

Для старта запустить в папке: `flutter run`
Для компиляции: `flutter build apk`