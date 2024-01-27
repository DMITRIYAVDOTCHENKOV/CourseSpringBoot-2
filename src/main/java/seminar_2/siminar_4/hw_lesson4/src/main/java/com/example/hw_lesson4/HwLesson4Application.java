package com.example.hw_lesson4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Базовое задание:
//		1. Создание базового веб-приложения Spring MVC
//Начните с создания простого веб-приложения с использованием Spring MVC. Это может быть простой сайт, который выводит
// "Привет, мир!" на главной странице. Используйте аннотацию @Controller
//и @RequestMapping для маршрутизации запросов на эту страницу.
//2. Добавление Thymeleaf в проект
//Добавьте Thymeleaf в свое веб-приложение Spring MVC. Создайте простую страницу с некоторыми переменными,
// которые заполняются с помощью модели Spring MVC и отображаются на странице с использованием Thymeleaf.
//3. Создание формы ввода и обработка данных формы
//Создайте страницу с формой ввода, используя Thymeleaf для рендеринга формы. Затем создайте контроллер Spring MVC,
// который обрабатывает отправку формы и выводит полученные данные.
// Это может быть форма для регистрации или любая другая форма, которая собирает информацию от пользователя.
//
//Все необходимые примеры кода для этого задания мы разбирали на семинаре.
//		_
//Задание со звездочкой:
//Проект домашнего задания для 2 семинара (CRUD приложение USER SERVICE) переписать:
//		1. Использовать библиотеку Lomboc:
//a) @Data - для полей классов
//b) @AllArgsConstructor - для классов с конструкторами
//c) @Log - логировать работу всех контроллеров
//2. Использовать configuration-processor для работы с настройками приложения:
//a) Создать объект инкапсулирующий шаблоны запросов к базе данных H2
//b) Использовать аннотации @ConfigurationProperties
//и @ConfigurationPropertiesScan для заполнения полей этого класса
//с) Вынести все SQL шаблоны в настройки приложения.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HwLesson4Application {

	public static void main(String[] args) {
		SpringApplication.run(HwLesson4Application.class, args);
	}

}