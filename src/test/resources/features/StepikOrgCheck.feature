# language: ru

Функционал: проверка отображения компаний на платформе

  Предыстория: сайт открыт
    Когда открыт Stepik

  @smoke
  Сценарий: проверка отображения компании JetBrains
    Когда пользователь видит на главной странице иконку JetBrains
    Тогда пользователь нажимает на нее
    Тогда открывается новая вкладка
    Тогда пользователь видит страницу JetBrains в новой вкладке

    #TODO - убрать шаг, сделав закрытие автоматическим
    Затем закрываем сессию