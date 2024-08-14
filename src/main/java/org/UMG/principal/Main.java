package org.UMG.principal;

import org.UMG.principal.Bottelegram.Bot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crea una instancia de TelegramBotsApi
        TelegramBotsApi botsApi;

        try {
            // Inicializa TelegramBotsApi con una sesión por defecto
            botsApi = new TelegramBotsApi(DefaultBotSession.class);

            // Registra tu bot
            botsApi.registerBot(new Bot());

            System.out.println("Bot registrado y funcionando...");

        } catch (TelegramApiException e) {
            e.printStackTrace();
            System.out.println("Error al registrar el bot: " + e.getMessage());
        }

    }

}