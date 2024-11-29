# Шаблон парсера для проекта Кампус

## Template

Для настройки шаблона нужно:

1. В `settings.gradle.kts` изменить `rootProject.name` на `campus-parser-<сокращенное имя вуза>`
2. Изменить пакет `ru.campus.parsers.template` на `ru.campus.parsers.<сокращенное имя вуза>`
3. Переименовать `TemplateParser` в `<Сокращенное имя вуза>Parser`
4. Переименовать `TemplateGroupEntitiesCollector` в `<Сокращенное имя вуза>GroupEntitiesCollector`
5. Переименовать `TemplateGroupScheduleCollector` в `<Сокращенное имя вуза>GroupScheduleCollector`
6. Убрать `@Ignore` в `DumpParserTest`

## Setup

Для запуска на локальной машине требуется:

1. Наличие [JDK 11](https://jdk.java.net) или выше
2. Создать на github PAT токен с правами read:packages
3. Добавить в gradle.properties параметр github.token= с токеном

## Development

Для проверки что все корректно настроено можно запустить задачу build:

- Windows - `gradlew.bat build`
- Unix/MacOS - `./gradlew build`

В результате выполнения увидите `BUILD SUCCESSFUL` - значит проект скомпилировался и успешно запустил все тесты.

Для разработки рекомендуется использовать [IntelliJ IDEA](https://www.jetbrains.com/idea/) (подойдет и Community
Edition). В ней есть все интеграции с Kotlin и Gradle.

Проект написан на языке [Kotlin](https://kotlinlang.org).

Описание как делаются парсеры доступно в ридми [parser-sdk](https://github.com/campus-mobile/campus-parser-kotlin-sdk).

Важно, что при изменении парсера, нужно проверять работу через тесты (примеры в `src/test`) - таким образом можно
отладить работу парсера на разных расписаниях.

Для выполнения доработок нужно создать ветку в git со своим именем и вести доработки в ней. Когда доработки завершены
на GitHub нужно создать Pull Request из вашей ветки в develop. GitHub проведет автоматические проверки, а позже и
человек проведет code review. После всех необходимых доработок ветка будет слита в develop, а дальше и опубликована
на сервер парсеров, где начнет свою работу.

## Testing

Для запуска полноценного прогона парсера можно использовать тестовое приложение, которое находится в модуле `app`.

В файле `Main.kt` нажмите на стрелку у функции `main` (при работе через IDEA). Парсер выполнит полностью свою работу,
за исключением отправки данных на сервер Campus. Вместо этого все данные, которые должны будут быть отправлены на
сервер, сохраняются в папке `app/dump` для анализа. Также в файле `app/log4j2.log` сохраняется полный лог запуска.
