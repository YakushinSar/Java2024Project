package hw14;

import java.util.HashMap;
import java.util.Map;

/*
Найти наиболее часто встречающееся слово в следующем тексте:

Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare. Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis tincidunt litora natoque per himenaeos velit. Consequat quis vestibulum ornare tortor quam pharetra. Proin ante ex habitasse consequat habitant a consequat.

Suscipit quis scelerisque elementum morbi massa auctor magnis, massa habitasse. Quis libero pellentesque aenean; dolor nec potenti porttitor sem. Sagittis litora per tristique cubilia ultricies ridiculus. Urna sagittis hendrerit integer suspendisse potenti euismod suscipit phasellus lectus. Id tellus mollis id nostra nisi condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare sagittis sapien. Feugiat fusce scelerisque metus cursus aenean ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit fames eleifend varius ligula.

 */
public class Hw14_5 {
    public static void main(String[] args) {

        String text = "Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare. Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis tincidunt litora natoque per himenaeos velit. Consequat quis vestibulum ornare tortor quam pharetra. Proin ante ex habitasse consequat habitant a consequat. " +
                "Suscipit quis scelerisque elementum morbi massa auctor magnis, massa habitasse. Quis libero pellentesque aenean; dolor nec potenti porttitor sem. Sagittis litora per tristique cubilia ultricies ridiculus. Urna sagittis hendrerit integer suspendisse potenti euismod suscipit phasellus lectus. " +
                "Id tellus mollis id nostra nisi condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare sagittis sapien. Feugiat fusce scelerisque metus cursus aenean ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit fames eleifend varius ligula.";

        // Удаляем знаки пунктуации и приводим к нижнему регистру
        String cleanText = text.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();

        // Разбиваем текст на слова
        String[] words = cleanText.split("\\s+");

        // Используем Map для подсчета частоты слов
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Находим наиболее часто встречающееся слово
        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }


        System.out.println("Наиболее часто встречающееся слово: \"" + mostFrequentWord + "\" (встречается " + maxCount + " раз)");
    }
}

