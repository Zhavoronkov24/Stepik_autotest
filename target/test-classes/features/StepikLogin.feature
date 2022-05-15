# language: ru

Функционал: Авторизация / Регистрация

  Предыстория: сайт открыт
    Когда открыт Stepik

  @smoke
  Сценарий: Успешная авторизация пользователя
    Когда пользователь нажимает на кнопку Войти
    И вводит валидный Email
    И вводит валидный пароль
    И нажимает войти
    Тогда пользователь видит свой аватар

    #TODO - убрать шаг, сделав закрытие автоматическим
    Затем закрываем сессию


  @negative
  Сценарий: Неуспешная авторизация (неверный пароль)
    Когда пользователь нажимает на кнопку Войти
    И вводит валидный Email
    И вводит невалидный пароль
    И нажимает войти
    Тогда пользователь видит сообщение на странице авторизации E-mail адрес и/или пароль не верны.

 #TODO - убрать шаг, сделав закрытие автоматическим
    Затем закрываем сессию


  @negative
  Сценарий: Неуспешная регистрация (Email занят)
    Когда пользователь нажимает на кнопку Регистрация
    И вводит существующий Email
    И вводит валидный пароль на странице регистрации
    И вводит валидное имя и фамилию
    И нажимает войти
    Тогда пользователь видит сообщение на странице регистрации Пользователь с таким e-mail адресом уже существует.

  #TODO - убрать шаг, сделав закрытие автоматическим
    Затем закрываем сессию
