# IOChamber


Скопируйте проект из задания 2 в новую папку, переименуйте в IOChamber. Добавьте возможность вместо считывания пользовательского ввода из консоли, считать содержимое текстового файла, вывести его содержимое в консоль, закончить работу приложения.

Выбор осуществляется следующим образом: если при запуске приложения ему передан аргумент – путь к текстовому файлу, то приложение выводит его содержимое (для работы с файлом можно использовать, например, java.io.FileReader, а также рекомендую обратить внимание на java.nio.Files для получения BufferedReader, у которого есть очень хороший метод lines(), преимущества которого мы обсудим на следующем занятии).

Если при запуске передан аргумент, но он не является валидным идентификатором файла или такого файла не существует, должно быть выведено сообщение “Файл не распознан. Введите ваши сообщения”, после чего приложение должно работать, как в задании 2.

Если при запуске не передается аргумент, приложение должно работать, как в задании 2.

Пример: Запуск с аргументом: java IOChamber “C:\Users\admin\Documents\text.txt” * Приложение выводит содержимое текстового файла в консоль и завершает работу *

Запуск без аргумента: java IOChamber

* Как в задании 2 *

4. В том же проекте, в котором вы выполнили задание 3, внесите изменения таким образом, чтобы выводить только нечётные строки (как для файла, так и для пользовательского ввода).

Пример:

Запуск без аргумента: java IOChamber

Пользователь вводит: Привет<Enter>

Как<Enter>

Тебя<Enter>

Зовут<Enter>

Спасибо<Enter>

Пожалуйста<Enter>

<Enter>

Приложение выводит: Привет

Тебя

Спасибо
