# Задача №1 - Issues

Легенда
Вы работаете в супер-амбициозной команде, которая разрабатывает Test Management System (TMS).

И поскольку многим знаком сервис GitHub 😎, была поставлена задача сделать систему управления Issue максимально похожей на ту, что есть в GitHub.

В качестве примера мы возьмём список Issue JUnit5.

Какие функции должны быть реализованы:

Добавление Issue (набор полей и типы данных для Issue определяете сами, но можете подсмотреть подсказку)
Отображение списка открытых и закрытых Issue (два отдельных метода)
Фильтрация* (3 отдельных метода):
По имени автора (кто создал)
По Label'у (вам нужно проанализировать механику и подобрать нужный метод самостоятельно, но можете посмотреть подсказку)
По Assignee (на кого назначено)
Сортировка (самостоятельно проанализируйте, как выполняется сортировка)
Закрытие/открытие Issue по id (фактически, это и есть update)
Важно: пункты, не указанные в списке, делать не нужно.

Примечание*: фильтрация - это операция возврата только тех объектов, которые удовлетворяют заданному условию. В рамках стандартной библиотеки Java для этого существует специальный интерфейс Predicate. Попробуйте по аналогии с Comparator реализовать метод filterBy в менеджере и передавать в него объект, удовлетворяющий интерфейсу Predicate.

Внутри репозитория (конечно же нужно всё разделить на manager и repository) все issue должны храниться в виде List (реализацию - ArrayList или LinkedList - выберите сами).

Подсказки
Опирайтесь на ту реализацию, которую мы рассматривали на лекции.

На основании раздела CRUD спроектируйте наборы тестов и протестируйте разные состояния системы (можете использовать Mockito для того, чтобы отдельно тестировать логику в менеджере).

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и автотесты к нему, GitHub Actions и т.д. (всё как обычно).
