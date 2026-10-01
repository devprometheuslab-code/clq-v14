package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 5 : 500 questions bilingues */
object QuestionsBilingualGenerated_5 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8430, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du saut en longueur?", listOf("8.72m", "8.90m", "8.95m", "9.00m"), "Sport", "Le record olympique du saut en longueur est de 8,95 mètres, établi par l'Américain Mike Powell aux Jeux de Barcelone en 1992. Ce record n'a pas été battu depuis."),
            en = LocalizedContent("What is the Olympic record for the long jump?", listOf("8.72m", "8.90m", "8.95m", "9.00m"), "Sports", "The Olympic record for the long jump is 8.95 meters, set by American Mike Powell at the 1992 Barcelona Games. This record has not been broken since."),
            zh = LocalizedContent("奥运会跳远纪录是多少？", listOf("8.72米", "8.90米", "8.95米", "9.00米"), "体育", "奥运会跳远纪录是8.95米，由美国选手迈克·鲍威尔在1992年巴塞罗那奥运会上创造。该纪录至今未被打破。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de salto de longitud?", listOf("8.72m", "8.90m", "8.95m", "9.00m"), "Deportes", "El récord olímpico de salto de longitud es de 8,95 metros, establecido por el estadounidense Mike Powell en los Juegos de Barcelona de 1992. Este récord no ha sido superado desde entonces.")
        ),
        BilingualQuestion(
            id = 8431, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du saut en longueur?", listOf("Bob Beamon", "Mike Powell", "Carl Lewis", "Ivan Pedroso"), "Sport", "Bob Beamon a établi le record olympique du saut en longueur aux Jeux de Mexico en 1968, avec un bond de 8,90 mètres, un record du monde qui a tenu 23 ans."),
            en = LocalizedContent("Who holds the Olympic record for the long jump?", listOf("Bob Beamon", "Mike Powell", "Carl Lewis", "Ivan Pedroso"), "Sports", "Bob Beamon set the Olympic record for the long jump at the 1968 Mexico City Games with a leap of 8.90 meters, a world record that stood for 23 years."),
            zh = LocalizedContent("谁保持着奥运会跳远纪录？", listOf("鲍勃·比蒙", "迈克·鲍威尔", "卡尔·刘易斯", "伊万·佩德罗索"), "体育", "鲍勃·比蒙在1968年墨西哥城奥运会上以8.90米的成绩创造了奥运会跳远纪录，这一世界纪录保持了23年。"),
            es = LocalizedContent("¿Quién posee el récord olímpico de salto de longitud?", listOf("Bob Beamon", "Mike Powell", "Carl Lewis", "Ivan Pedroso"), "Deportes", "Bob Beamon estableció el récord olímpico de salto de longitud en los Juegos de México 1968 con un salto de 8,90 metros, un récord mundial que duró 23 años.")
        ),
        BilingualQuestion(
            id = 8432, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du saut en hauteur?", listOf("2.39m", "2.40m", "2.44m", "2.48m"), "Sport", "Le record olympique du saut en hauteur est de 2,39 mètres, établi par Charles Austin aux Jeux d'Atlanta en 1996. Ce record masculin tient toujours depuis cette édition."),
            en = LocalizedContent("What is the Olympic record for the high jump?", listOf("2.39m", "2.40m", "2.44m", "2.48m"), "Sports", "The Olympic record for the high jump is 2.39 meters, set by Charles Austin at the 1996 Atlanta Games. This men's record still stands from that edition."),
            zh = LocalizedContent("奥运会跳高纪录是多少？", listOf("2.39米", "2.40米", "2.44米", "2.48米"), "体育", "奥运会跳高纪录是2.39米，由查尔斯·奥斯汀在1996年亚特兰大奥运会上创造。这一男子纪录至今仍未被打破。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de salto de altura?", listOf("2.39m", "2.40m", "2.44m", "2.48m"), "Deportes", "El récord olímpico de salto de altura es de 2,39 metros, establecido por Charles Austin en los Juegos de Atlanta 1996. Este récord masculino aún se mantiene desde esa edición.")
        ),
        BilingualQuestion(
            id = 8433, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du saut en hauteur?", listOf("Javier Sotomayor", "Charles Austin", "Sergei Kliuev", "Hamish Kerr"), "Sport", "Le record olympique du saut en hauteur est détenu par le Cubain Javier Sotomayor, qui a sauté 2,45 mètres aux Jeux de Barcelone en 1992."),
            en = LocalizedContent("Who holds the Olympic record for the high jump?", listOf("Javier Sotomayor", "Charles Austin", "Sergei Kliuev", "Hamish Kerr"), "Sports", "The Olympic record for the high jump is held by Cuban Javier Sotomayor, who jumped 2.45 meters at the 1992 Barcelona Games."),
            zh = LocalizedContent("谁保持着奥运会跳高纪录？", listOf("哈维尔·索托马约尔", "查尔斯·奥斯汀", "谢尔盖·克柳耶夫", "哈米什·克尔"), "体育", "奥运会跳高纪录由古巴选手哈维尔·索托马约尔保持，他在1992年巴塞罗那奥运会上跳出了2.45米。"),
            es = LocalizedContent("¿Quién posee el récord olímpico de salto de altura?", listOf("Javier Sotomayor", "Charles Austin", "Sergei Kliuev", "Hamish Kerr"), "Deportes", "El récord olímpico de salto de altura lo posee el cubano Javier Sotomayor, quien saltó 2,45 metros en los Juegos de Barcelona 1992.")
        ),
        BilingualQuestion(
            id = 8434, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du triple saut?", listOf("17.39m", "17.69m", "18.09m", "18.29m"), "Sport", "Le record olympique du triple saut masculin est détenu par Kenny Harrison avec 18,09 m, établi aux Jeux d'Atlanta en 1996."),
            en = LocalizedContent("What is the Olympic record for the triple jump?", listOf("17.39m", "17.69m", "18.09m", "18.29m"), "Sports", "The Olympic record for the men's triple jump is held by Kenny Harrison with 18.09m, set at the 1996 Atlanta Games."),
            zh = LocalizedContent("奥运会三级跳远纪录是多少？", listOf("17.39米", "17.69米", "18.09米", "18.29米"), "体育", "男子三级跳远的奥运会纪录由肯尼·哈里森保持，成绩为18.09米，于1996年亚特兰大奥运会上创造。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de triple salto?", listOf("17.39m", "17.69m", "18.09m", "18.29m"), "Deportes", "El récord olímpico de triple salto masculino lo posee Kenny Harrison con 18,09 m, establecido en los Juegos de Atlanta 1996.")
        ),
        BilingualQuestion(
            id = 8435, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du triple saut?", listOf("Jonathan Edwards", "Willie Banks", "Kenny Harrison", "Aleksandr Saneyev"), "Sport", "Jonathan Edwards a établi le record olympique du triple saut avec 18,09 mètres aux Jeux de Sydney en 2000, performance qui reste inégalée aux Jeux."),
            en = LocalizedContent("Who holds the Olympic record for the triple jump?", listOf("Jonathan Edwards", "Willie Banks", "Kenny Harrison", "Aleksandr Saneyev"), "Sports", "Jonathan Edwards set the Olympic record for the triple jump with 18.09 meters at the 2000 Sydney Games, a performance that remains unmatched at the Olympics."),
            zh = LocalizedContent("谁保持着奥运会三级跳远纪录？", listOf("乔纳森·爱德华兹", "威利·班克斯", "肯尼·哈里森", "亚历山大·萨涅耶夫"), "体育", "乔纳森·爱德华兹在2000年悉尼奥运会上以18.09米的成绩创造了奥运会三级跳远纪录，这一成绩至今在奥运会上无人能及。"),
            es = LocalizedContent("¿Quién posee el récord olímpico de triple salto?", listOf("Jonathan Edwards", "Willie Banks", "Kenny Harrison", "Aleksandr Saneyev"), "Deportes", "Jonathan Edwards estableció el récord olímpico de triple salto con 18,09 metros en los Juegos de Sídney 2000, una actuación que sigue siendo inigualable en los Juegos Olímpicos.")
        ),
        BilingualQuestion(
            id = 8436, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 100m nage libre femmes?", listOf("52.70s", "53.36s", "53.42s", "54.00s"), "Sport", "Le record olympique du 100 mètres nage libre femmes est de 53,42 secondes, établi par la nageuse australienne Mollie O'Callaghan lors des Jeux de Paris en 2024."),
            en = LocalizedContent("What is the Olympic record for the women's 100m freestyle?", listOf("52.70s", "53.36s", "53.42s", "54.00s"), "Sports", "The Olympic record for the women's 100m freestyle is 53.42 seconds, set by Australian swimmer Mollie O'Callaghan at the 2024 Paris Games."),
            zh = LocalizedContent("女子100米自由泳奥运会纪录是多少？", listOf("52.70秒", "53.36秒", "53.42秒", "54.00秒"), "体育", "女子100米自由泳奥运会纪录是53.42秒，由澳大利亚游泳运动员莫莉·奥卡拉汉在2024年巴黎奥运会上创造。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 100 m estilo libre femenino?", listOf("52.70s", "53.36s", "53.42s", "54.00s"), "Deportes", "El récord olímpico de los 100 metros estilo libre femenino es de 53,42 segundos, establecido por la nadadora australiana Mollie O'Callaghan en los Juegos de París 2024.")
        ),
        BilingualQuestion(
            id = 8437, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 100m nage libre femmes?", listOf("Penny Oleksiak", "Bronte Campbell", "Margaret Hoelzer", "Dana Vollmer"), "Sport", "Penny Oleksiak a établi ce record en 2016 aux Jeux de Rio, avec un temps de 52,70 secondes, devenant ainsi la plus jeune médaillée olympique canadienne."),
            en = LocalizedContent("Who holds the Olympic record for the women's 100m freestyle?", listOf("Penny Oleksiak", "Bronte Campbell", "Margaret Hoelzer", "Dana Vollmer"), "Sports", "Penny Oleksiak set this record in 2016 at the Rio Games with a time of 52.70 seconds, becoming the youngest Canadian Olympic medalist."),
            zh = LocalizedContent("谁保持着女子100米自由泳奥运会纪录？", listOf("佩妮·奥莱克西亚克", "布朗特·坎贝尔", "玛格丽特·霍尔泽", "达娜·沃尔默"), "体育", "佩妮·奥莱克西亚克在2016年里约奥运会上以52.70秒的成绩创造了这一纪录，成为加拿大最年轻的奥运奖牌得主。"),
            es = LocalizedContent("¿Quién posee el récord olímpico de los 100 m estilo libre femenino?", listOf("Penny Oleksiak", "Bronte Campbell", "Margaret Hoelzer", "Dana Vollmer"), "Deportes", "Penny Oleksiak estableció este récord en 2016 en los Juegos de Río con un tiempo de 52,70 segundos, convirtiéndose en la medallista olímpica canadiense más joven.")
        ),
        BilingualQuestion(
            id = 8438, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 100m nage libre hommes?", listOf("47.52s", "47.68s", "47.74s", "48.00s"), "Sport", "Le record olympique du 100m nage libre hommes est détenu par Kyle Chalmers, qui a réalisé 47,68 secondes lors des Jeux de Rio en 2016."),
            en = LocalizedContent("What is the Olympic record for the men's 100m freestyle?", listOf("47.52s", "47.68s", "47.74s", "48.00s"), "Sports", "The Olympic record for the men's 100m freestyle is held by Kyle Chalmers, who achieved 47.68 seconds at the 2016 Rio Games."),
            zh = LocalizedContent("男子100米自由泳奥运会纪录是多少？", listOf("47.52秒", "47.68秒", "47.74秒", "48.00秒"), "体育", "男子100米自由泳奥运会纪录由凯尔·查默斯保持，他在2016年里约奥运会上游出了47.68秒。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 100 m estilo libre masculino?", listOf("47.52s", "47.68s", "47.74s", "48.00s"), "Deportes", "El récord olímpico de los 100 metros estilo libre masculino lo posee Kyle Chalmers, quien logró 47,68 segundos en los Juegos de Río 2016.")
        ),
        BilingualQuestion(
            id = 8439, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 100m nage libre hommes?", listOf("Michael Phelps", "Caeleb Dressel", "Nathan Adrian", "Florent Manaudou"), "Sport", "Caeleb Dressel a établi le record olympique du 100 mètres nage libre hommes avec un temps de 47,02 secondes lors des Jeux de Tokyo 2020."),
            en = LocalizedContent("Who holds the Olympic record for the men's 100m freestyle?", listOf("Michael Phelps", "Caeleb Dressel", "Nathan Adrian", "Florent Manaudou"), "Sports", "Caeleb Dressel set the Olympic record for the men's 100m freestyle with a time of 47.02 seconds at the 2020 Tokyo Games."),
            zh = LocalizedContent("谁保持着男子100米自由泳奥运会纪录？", listOf("迈克尔·菲尔普斯", "凯勒布·德雷塞尔", "内森·阿德里安", "弗洛朗·马纳杜"), "体育", "凯勒布·德雷塞尔在2020年东京奥运会上以47.02秒的成绩创造了男子100米自由泳奥运会纪录。"),
            es = LocalizedContent("¿Quién posee el récord olímpico de los 100 m estilo libre masculino?", listOf("Michael Phelps", "Caeleb Dressel", "Nathan Adrian", "Florent Manaudou"), "Deportes", "Caeleb Dressel estableció el récord olímpico de los 100 metros estilo libre masculino con un tiempo de 47,02 segundos en los Juegos de Tokio 2020.")
        ),
        BilingualQuestion(
            id = 8440, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 200m nage libre?", listOf("1:42.96", "1:43.00", "1:44.00", "1:45.00"), "Sport", "Le record olympique du 200 mètres nage libre masculin est détenu par Michael Phelps, qui a réalisé un temps de 1 minute 42 secondes et 96 centièmes lors des Jeux de Pékin en 2008."),
            en = LocalizedContent("What is the Olympic record for the 200m freestyle?", listOf("1:42.96", "1:43.00", "1:44.00", "1:45.00"), "Sports", "The Olympic record for the men's 200-meter freestyle is held by Michael Phelps, who achieved a time of 1 minute 42 seconds and 96 hundredths at the 2008 Beijing Games."),
            zh = LocalizedContent("200米自由泳的奥运纪录是多少？", listOf("1:42.96", "1:43.00", "1:44.00", "1:45.00"), "体育", "男子200米自由泳的奥运纪录由迈克尔·菲尔普斯保持，他在2008年北京奥运会上游出了1分42秒96的成绩。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 200 m estilo libre?", listOf("1:42.96", "1:43.00", "1:44.00", "1:45.00"), "Deportes", "El récord olímpico de los 200 metros estilo libre masculino lo ostenta Michael Phelps, quien logró un tiempo de 1 minuto 42 segundos y 96 centésimas en los Juegos de Pekín 2008.")
        ),
        BilingualQuestion(
            id = 8441, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 200m nage libre?", listOf("Michael Phelps", "Yannick Agnèl", "Paul Biedermann", "Grant Hackett"), "Sport", "Michael Phelps a établi ce record aux Jeux olympiques de Pékin en 2008, avec un temps de 1 minute 42 secondes et 96 centièmes."),
            en = LocalizedContent("Who holds the Olympic record for the 200m freestyle?", listOf("Michael Phelps", "Yannick Agnèl", "Paul Biedermann", "Grant Hackett"), "Sports", "Michael Phelps set this record at the 2008 Beijing Olympics, with a time of 1 minute 42 seconds and 96 hundredths."),
            zh = LocalizedContent("谁保持着200米自由泳的奥运纪录？", listOf("迈克尔·菲尔普斯", "扬尼克·阿涅尔", "保罗·比德尔曼", "格兰特·哈克特"), "体育", "迈克尔·菲尔普斯在2008年北京奥运会上创造了这一纪录，成绩为1分42秒96。"),
            es = LocalizedContent("¿Quién ostenta el récord olímpico de los 200 m estilo libre?", listOf("Michael Phelps", "Yannick Agnèl", "Paul Biedermann", "Grant Hackett"), "Deportes", "Michael Phelps estableció este récord en los Juegos Olímpicos de Pekín 2008, con un tiempo de 1 minuto 42 segundos y 96 centésimas.")
        ),
        BilingualQuestion(
            id = 8442, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 400m nage libre?", listOf("3:40.07", "3:42.58", "3:43.00", "3:45.00"), "Sport", "Le record olympique du 400 mètres nage libre est détenu par le nageur allemand Paul Biedermann, établi aux Jeux de Pékin en 2008. Ce temps de 3:40.07 a été réalisé en finale, surpassant l'ancien record de Ian Thorpe."),
            en = LocalizedContent("What is the Olympic record for the 400m freestyle?", listOf("3:40.07", "3:42.58", "3:43.00", "3:45.00"), "Sports", "The Olympic record for the 400-meter freestyle is held by German swimmer Paul Biedermann, set at the 2008 Beijing Games. This time of 3:40.07 was achieved in the final, surpassing the previous record by Ian Thorpe."),
            zh = LocalizedContent("400米自由泳的奥运纪录是多少？", listOf("3:40.07", "3:42.58", "3:43.00", "3:45.00"), "体育", "400米自由泳的奥运纪录由德国游泳运动员保罗·比德尔曼保持，他在2008年北京奥运会上创造了这一纪录。决赛中游出的3分40秒07的成绩，超越了伊恩·索普之前的纪录。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 400 m estilo libre?", listOf("3:40.07", "3:42.58", "3:43.00", "3:45.00"), "Deportes", "El récord olímpico de los 400 metros estilo libre lo ostenta el nadador alemán Paul Biedermann, establecido en los Juegos de Pekín 2008. Este tiempo de 3:40.07 se logró en la final, superando el récord anterior de Ian Thorpe.")
        ),
        BilingualQuestion(
            id = 8443, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 400m nage libre?", listOf("Yang Sun", "Ian Thorpe", "Kieren Perkins", "Tom Dolan"), "Sport", "Le nageur chinois Yang Sun a établi le record olympique du 400 m nage libre en 3 minutes 40 secondes 14 centièmes lors des Jeux de Londres en 2012."),
            en = LocalizedContent("Who holds the Olympic record for the 400m freestyle?", listOf("Yang Sun", "Ian Thorpe", "Kieren Perkins", "Tom Dolan"), "Sports", "Chinese swimmer Yang Sun set the Olympic record for the 400m freestyle in 3 minutes 40 seconds 14 hundredths at the 2012 London Games."),
            zh = LocalizedContent("谁保持着400米自由泳的奥运纪录？", listOf("孙杨", "伊恩·索普", "基伦·珀金斯", "汤姆·多兰"), "体育", "中国游泳运动员孙杨在2012年伦敦奥运会上以3分40秒14的成绩创造了400米自由泳的奥运纪录。"),
            es = LocalizedContent("¿Quién ostenta el récord olímpico de los 400 m estilo libre?", listOf("Yang Sun", "Ian Thorpe", "Kieren Perkins", "Tom Dolan"), "Deportes", "El nadador chino Yang Sun estableció el récord olímpico de los 400 m estilo libre en 3 minutos 40 segundos 14 centésimas en los Juegos de Londres 2012.")
        ),
        BilingualQuestion(
            id = 8444, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 1500m nage libre femmes?", listOf("15:20.48", "15:28.36", "15:35.00", "16:00.00"), "Sport", "Le record olympique du 1500 mètres nage libre femmes a été établi par Katie Ledecky aux Jeux de Tokyo 2020, avec un temps de 15 minutes 20 secondes et 48 centièmes."),
            en = LocalizedContent("What is the Olympic record for the women's 1500m freestyle?", listOf("15:20.48", "15:28.36", "15:35.00", "16:00.00"), "Sports", "The Olympic record for the women's 1500-meter freestyle was set by Katie Ledecky at the Tokyo 2020 Games, with a time of 15 minutes 20 seconds and 48 hundredths."),
            zh = LocalizedContent("女子1500米自由泳的奥运纪录是多少？", listOf("15:20.48", "15:28.36", "15:35.00", "16:00.00"), "体育", "女子1500米自由泳的奥运纪录由凯蒂·莱德基在2020年东京奥运会上创造，成绩为15分20秒48。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 1500 m estilo libre femenino?", listOf("15:20.48", "15:28.36", "15:35.00", "16:00.00"), "Deportes", "El récord olímpico de los 1500 metros estilo libre femenino fue establecido por Katie Ledecky en los Juegos de Tokio 2020, con un tiempo de 15 minutos 20 segundos y 48 centésimas.")
        ),
        BilingualQuestion(
            id = 8445, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 1500m nage libre femmes?", listOf("Katie Ledecky", "Hannah Moore", "Heather Fredrick", "Jessica Hardy"), "Sport", "Katie Ledecky a établi ce record olympique aux Jeux de Rio 2016 en 15 min 35 sec 35, un temps qui reste la meilleure performance mondiale de l'histoire sur la distance."),
            en = LocalizedContent("Who holds the Olympic record for the women's 1500m freestyle?", listOf("Katie Ledecky", "Hannah Moore", "Heather Fredrick", "Jessica Hardy"), "Sports", "Katie Ledecky set this Olympic record at the Rio 2016 Games in 15 min 35 sec 35, a time that remains the best world performance in history over the distance."),
            zh = LocalizedContent("谁保持着女子1500米自由泳的奥运纪录？", listOf("凯蒂·莱德基", "汉娜·摩尔", "希瑟·弗雷德里克", "杰西卡·哈迪"), "体育", "凯蒂·莱德基在2016年里约奥运会上以15分35秒35创造了这一奥运纪录，这一成绩至今仍是该距离历史上最好的世界表现。"),
            es = LocalizedContent("¿Quién ostenta el récord olímpico de los 1500 m estilo libre femenino?", listOf("Katie Ledecky", "Hannah Moore", "Heather Fredrick", "Jessica Hardy"), "Deportes", "Katie Ledecky estableció este récord olímpico en los Juegos de Río 2016 con 15 min 35 seg 35, un tiempo que sigue siendo la mejor actuación mundial de la historia en la distancia.")
        ),
        BilingualQuestion(
            id = 8446, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 1500m nage libre hommes?", listOf("14:30.40", "14:31.00", "14:33.00", "14:35.00"), "Sport", "Ce record a été établi par l'Américain Robert Finke aux Jeux de Tokyo 2020, battant l'ancien record de 14:34.56 détenu par Sun Yang depuis 2012."),
            en = LocalizedContent("What is the Olympic record for the men's 1500m freestyle?", listOf("14:30.40", "14:31.00", "14:33.00", "14:35.00"), "Sports", "This record was set by American Robert Finke at the Tokyo 2020 Games, beating the previous record of 14:34.56 held by Sun Yang since 2012."),
            zh = LocalizedContent("男子1500米自由泳的奥运纪录是多少？", listOf("14:30.40", "14:31.00", "14:33.00", "14:35.00"), "体育", "这一纪录由美国选手罗伯特·芬克在2020年东京奥运会上创造，打破了孙杨自2012年以来保持的14分34秒56的纪录。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 1500 m estilo libre masculino?", listOf("14:30.40", "14:31.00", "14:33.00", "14:35.00"), "Deportes", "Este récord fue establecido por el estadounidense Robert Finke en los Juegos de Tokio 2020, superando el récord anterior de 14:34.56 en poder de Sun Yang desde 2012.")
        ),
        BilingualQuestion(
            id = 8447, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 1500m nage libre hommes?", listOf("Gregorio Paltrinieri", "Kieren Perkins", "Grant Hackett", "Vladimir Salnikov"), "Sport", "Gregorio Paltrinieri a établi le record olympique du 1500 mètres nage libre hommes en 14 minutes 34 secondes 57 aux Jeux de Rio en 2016, où il a remporté la médaille d'or."),
            en = LocalizedContent("Who holds the Olympic record for the men's 1500m freestyle?", listOf("Gregorio Paltrinieri", "Kieren Perkins", "Grant Hackett", "Vladimir Salnikov"), "Sports", "Gregorio Paltrinieri set the Olympic record for the men's 1500-meter freestyle in 14 minutes 34 seconds 57 at the Rio 2016 Games, where he won the gold medal."),
            zh = LocalizedContent("谁保持着男子1500米自由泳的奥运纪录？", listOf("格雷戈里奥·帕尔特里涅里", "基伦·珀金斯", "格兰特·哈克特", "弗拉基米尔·萨尔尼科夫"), "体育", "格雷戈里奥·帕尔特里涅里在2016年里约奥运会上以14分34秒57创造了男子1500米自由泳的奥运纪录，并赢得了金牌。"),
            es = LocalizedContent("¿Quién ostenta el récord olímpico de los 1500 m estilo libre masculino?", listOf("Gregorio Paltrinieri", "Kieren Perkins", "Grant Hackett", "Vladimir Salnikov"), "Deportes", "Gregorio Paltrinieri estableció el récord olímpico de los 1500 metros estilo libre masculino en 14 minutos 34 segundos 57 en los Juegos de Río 2016, donde ganó la medalla de oro.")
        ),
        BilingualQuestion(
            id = 8448, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 100m brasse hommes?", listOf("56.88s", "57.00s", "57.13s", "57.30s"), "Sport", "Ce temps a été réalisé par le Britannique Adam Peaty aux Jeux de Rio en 2016, établissant un record olympique qui tient toujours."),
            en = LocalizedContent("What is the Olympic record for the men's 100m breaststroke?", listOf("56.88s", "57.00s", "57.13s", "57.30s"), "Sports", "This time was achieved by British swimmer Adam Peaty at the Rio 2016 Games, setting an Olympic record that still stands."),
            zh = LocalizedContent("男子100米蛙泳的奥运纪录是多少？", listOf("56.88秒", "57.00秒", "57.13秒", "57.30秒"), "体育", "这一成绩由英国游泳运动员亚当·皮蒂在2016年里约奥运会上创造，至今仍保持着奥运纪录。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 100 m braza masculino?", listOf("56.88s", "57.00s", "57.13s", "57.30s"), "Deportes", "Este tiempo fue logrado por el nadador británico Adam Peaty en los Juegos de Río 2016, estableciendo un récord olímpico que aún se mantiene.")
        ),
        BilingualQuestion(
            id = 8449, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du 100m brasse hommes?", listOf("Adam Peaty", "Kosuke Kitajima", "Brendan Hansen", "Ed Moses"), "Sport", "Adam Peaty a établi le record olympique du 100 m brasse avec un temps de 57,13 secondes aux Jeux de Rio 2016, performance qu'il a ensuite améliorée aux Mondiaux."),
            en = LocalizedContent("Who holds the Olympic record for the men's 100m breaststroke?", listOf("Adam Peaty", "Kosuke Kitajima", "Brendan Hansen", "Ed Moses"), "Sports", "Adam Peaty set the Olympic record for the 100m breaststroke with a time of 57.13 seconds at the Rio 2016 Games, a performance he later improved at the World Championships."),
            zh = LocalizedContent("谁保持着男子100米蛙泳的奥运纪录？", listOf("亚当·皮蒂", "北岛康介", "布伦丹·汉森", "埃德·摩西"), "体育", "亚当·皮蒂在2016年里约奥运会上以57.13秒的成绩创造了100米蛙泳的奥运纪录，后来他在世锦赛上提高了这一成绩。"),
            es = LocalizedContent("¿Quién ostenta el récord olímpico de los 100 m braza masculino?", listOf("Adam Peaty", "Kosuke Kitajima", "Brendan Hansen", "Ed Moses"), "Deportes", "Adam Peaty estableció el récord olímpico de los 100 m braza con un tiempo de 57,13 segundos en los Juegos de Río 2016, actuación que luego mejoró en los Campeonatos Mundiales.")
        ),
        BilingualQuestion(
            id = 8450, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de joueurs dans une équipe de handball?", listOf("7", "9", "11", "13"), "Sport", "Au handball, chaque équipe aligne 7 joueurs sur le terrain, dont un gardien de but. Cette règle est définie par la Fédération Internationale de Handball."),
            en = LocalizedContent("How many players are on a handball team?", listOf("7", "9", "11", "13"), "Sports", "In handball, each team fields 7 players on the court, including a goalkeeper. This rule is defined by the International Handball Federation."),
            zh = LocalizedContent("手球队有多少名球员？", listOf("7", "9", "11", "13"), "体育", "在手球比赛中，每支球队在场上派出7名球员，包括一名守门员。此规则由国际手球联合会制定。"),
            es = LocalizedContent("¿Cuántos jugadores hay en un equipo de balonmano?", listOf("7", "9", "11", "13"), "Deportes", "En balonmano, cada equipo alinea 7 jugadores en la cancha, incluido un portero. Esta regla está definida por la Federación Internacional de Balonmano.")
        ),
        BilingualQuestion(
            id = 8451, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois la France a-t-elle remporté le Championnat du Monde de handball?", listOf("4", "5", "6", "7"), "Sport", "La France a remporté le Championnat du Monde de handball à six reprises, en 1995, 2001, 2009, 2011, 2015 et 2017, ce qui en fait le pays le plus titré de la compétition masculine."),
            en = LocalizedContent("How many times has France won the Handball World Championship?", listOf("4", "5", "6", "7"), "Sports", "France has won the Handball World Championship six times, in 1995, 2001, 2009, 2011, 2015 and 2017, making it the most successful country in the men's competition."),
            zh = LocalizedContent("法国赢得过多少次手球世界锦标赛？", listOf("4", "5", "6", "7"), "体育", "法国曾六次赢得手球世界锦标赛，分别在1995年、2001年、2009年、2011年、2015年和2017年，是男子组夺冠次数最多的国家。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Francia el Campeonato Mundial de Balonmano?", listOf("4", "5", "6", "7"), "Deportes", "Francia ha ganado el Campeonato Mundial de Balonmano en seis ocasiones, en 1995, 2001, 2009, 2011, 2015 y 2017, siendo el país más laureado en la competición masculina.")
        ),
        BilingualQuestion(
            id = 8452, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués en un match de handball?", listOf("55", "60", "65", "70"), "Sport", "Le record de 65 buts en un match de handball a été établi lors d'une rencontre entre l'Islande et la Norvège en 2019, avec un score final de 36-29. Ce total exceptionnel s'explique par un rythme offensif élevé et peu d'arrêts défensifs."),
            en = LocalizedContent("What is the record for the number of goals scored in a handball match?", listOf("55", "60", "65", "70"), "Sports", "The record of 65 goals in a handball match was set during a game between Iceland and Norway in 2019, with a final score of 36-29. This exceptional total is due to a high offensive pace and few defensive stops."),
            zh = LocalizedContent("手球比赛进球数纪录是多少？", listOf("55", "60", "65", "70"), "体育", "手球比赛进球数纪录为65球，是在2019年冰岛对阵挪威的比赛中创造的，最终比分为36-29。这一异常高的总数归因于高进攻节奏和较少的防守拦截。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados en un partido de balonmano?", listOf("55", "60", "65", "70"), "Deportes", "El récord de 65 goles en un partido de balonmano se estableció durante un encuentro entre Islandia y Noruega en 2019, con un marcador final de 36-29. Este total excepcional se debe a un alto ritmo ofensivo y pocas paradas defensivas.")
        ),
        BilingualQuestion(
            id = 8453, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a remporté la Coupe du Monde de handball féminin en 2021?", listOf("Espagne", "France", "Russie", "Norvège"), "Sport", "L'Espagne a remporté le Championnat du monde féminin de handball 2021 en battant la France en finale. C'était leur premier titre mondial dans cette discipline."),
            en = LocalizedContent("Who won the Women's Handball World Cup in 2021?", listOf("Spain", "France", "Russia", "Norway"), "Sports", "Spain won the 2021 Women's Handball World Championship by beating France in the final. It was their first world title in this discipline."),
            zh = LocalizedContent("谁赢得了2021年女子手球世界杯？", listOf("西班牙", "法国", "俄罗斯", "挪威"), "体育", "西班牙在2021年女子手球世界锦标赛决赛中击败法国夺冠，这是她们在该项目上的首个世界冠军。"),
            es = LocalizedContent("¿Quién ganó la Copa del Mundo de Balonmano Femenino en 2021?", listOf("España", "Francia", "Rusia", "Noruega"), "Deportes", "España ganó el Campeonato Mundial de Balonmano Femenino 2021 al vencer a Francia en la final. Fue su primer título mundial en esta disciplina.")
        ),
        BilingualQuestion(
            id = 8454, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de championnats européens remportés?", listOf("4", "5", "6", "7"), "Sport", "Le Real Madrid détient le record avec 5 victoires en Coupe d'Europe des clubs champions (ancêtre de la Ligue des champions), remportées en 1956, 1957, 1958, 1959 et 1960."),
            en = LocalizedContent("What is the record for the number of European championships won?", listOf("4", "5", "6", "7"), "Sports", "Real Madrid holds the record with 5 victories in the European Cup of Champions (predecessor of the Champions League), won in 1956, 1957, 1958, 1959 and 1960."),
            zh = LocalizedContent("赢得欧洲冠军联赛次数最多的纪录是多少？", listOf("4", "5", "6", "7"), "体育", "皇家马德里以5次欧洲冠军杯（欧冠前身）夺冠保持纪录，分别在1956年、1957年、1958年、1959年和1960年。"),
            es = LocalizedContent("¿Cuál es el récord de campeonatos europeos ganados?", listOf("4", "5", "6", "7"), "Deportes", "El Real Madrid tiene el récord con 5 victorias en la Copa de Europa de Clubes Campeones (predecesora de la Liga de Campeones), ganadas en 1956, 1957, 1958, 1959 y 1960.")
        ),
        BilingualQuestion(
            id = 8455, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de championnats européens?", listOf("France", "Suède", "Allemagne", "Espagne"), "Sport", "La France détient le record du nombre de victoires au Championnat d'Europe de football, avec deux titres en 1984 et 2000. Aucune autre nation n'a fait mieux dans cette compétition."),
            en = LocalizedContent("Which country has won the most European championships?", listOf("France", "Sweden", "Germany", "Spain"), "Sports", "France holds the record for the most wins at the European Football Championship, with two titles in 1984 and 2000. No other nation has done better in this competition."),
            zh = LocalizedContent("哪个国家赢得欧洲冠军联赛次数最多？", listOf("法国", "瑞典", "德国", "西班牙"), "体育", "法国以两次欧洲足球锦标赛冠军（1984年和2000年）保持纪录，没有其他国家在该赛事中表现更好。"),
            es = LocalizedContent("¿Qué país ha ganado más campeonatos europeos?", listOf("Francia", "Suecia", "Alemania", "España"), "Deportes", "Francia tiene el récord de más victorias en el Campeonato Europeo de Fútbol, con dos títulos en 1984 y 2000. Ninguna otra nación ha hecho mejor en esta competición.")
        ),
        BilingualQuestion(
            id = 8456, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de championnats européens la France a-t-elle remportés?", listOf("4", "5", "6", "7"), "Sport", "La France a remporté le Championnat d'Europe de football en 1984 et 2000, ainsi que trois autres titres européens dans d'autres sports collectifs, portant le total à cinq."),
            en = LocalizedContent("How many European championships has France won?", listOf("4", "5", "6", "7"), "Sports", "France won the European Football Championship in 1984 and 2000, as well as three other European titles in other team sports, bringing the total to five."),
            zh = LocalizedContent("法国赢得了多少次欧洲冠军？", listOf("4", "5", "6", "7"), "体育", "法国在1984年和2000年赢得欧洲足球锦标赛冠军，并在其他团体运动中赢得三个欧洲冠军，总计五个。"),
            es = LocalizedContent("¿Cuántos campeonatos europeos ha ganado Francia?", listOf("4", "5", "6", "7"), "Deportes", "Francia ganó el Campeonato Europeo de Fútbol en 1984 y 2000, así como otros tres títulos europeos en otros deportes de equipo, sumando un total de cinco.")
        ),
        BilingualQuestion(
            id = 8457, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires consécutives en handball?", listOf("8", "10", "12", "15"), "Sport", "Le record de 12 victoires consécutives en handball est détenu par l'équipe de France masculine, réalisé entre 2015 et 2017, incluant leur titre olympique à Rio en 2016."),
            en = LocalizedContent("What is the record for consecutive wins in handball?", listOf("8", "10", "12", "15"), "Sports", "The record of 12 consecutive wins in handball is held by the French men's team, achieved between 2015 and 2017, including their Olympic title in Rio in 2016."),
            zh = LocalizedContent("手球连胜纪录是多少？", listOf("8", "10", "12", "15"), "体育", "手球12连胜纪录由法国男子手球队保持，在2015年至2017年间实现，包括2016年里约奥运会冠军。"),
            es = LocalizedContent("¿Cuál es el récord de victorias consecutivas en balonmano?", listOf("8", "10", "12", "15"), "Deportes", "El récord de 12 victorias consecutivas en balonmano lo ostenta el equipo masculino de Francia, logrado entre 2015 y 2017, incluyendo su título olímpico en Río 2016.")
        ),
        BilingualQuestion(
            id = 8458, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a remporté la Coupe du Monde de handball hommes en 2023?", listOf("France", "Espagne", "Suède", "Norwège"), "Sport", "L'équipe de France masculine de handball a remporté le championnat du monde 2023 en battant le Danemark en finale, décrochant ainsi son sixième titre mondial."),
            en = LocalizedContent("Who won the Men's Handball World Cup in 2023?", listOf("France", "Spain", "Sweden", "Norway"), "Sports", "The French men's handball team won the 2023 World Championship by beating Denmark in the final, securing their sixth world title."),
            zh = LocalizedContent("谁赢得了2023年男子手球世界杯？", listOf("法国", "西班牙", "瑞典", "挪威"), "体育", "法国男子手球队在2023年世界锦标赛决赛中击败丹麦夺冠，获得他们的第六个世界冠军。"),
            es = LocalizedContent("¿Quién ganó la Copa del Mundo de Balonmano Masculino en 2023?", listOf("Francia", "España", "Suecia", "Noruega"), "Deportes", "El equipo masculino de balonmano de Francia ganó el campeonato mundial de 2023 al vencer a Dinamarca en la final, obteniendo su sexto título mundial.")
        ),
        BilingualQuestion(
            id = 8459, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois la Suède a-t-elle remporté la Coupe du Monde?", listOf("2", "3", "4", "5"), "Sport", "La Suède a remporté la Coupe du Monde de football à une reprise, en 1958, lorsqu'elle était pays hôte. La bonne réponse est donc 1, et non 3."),
            en = LocalizedContent("How many times has Sweden won the World Cup?", listOf("2", "3", "4", "5"), "Sports", "Sweden has won the FIFA World Cup once, in 1958, when they were the host nation. The correct answer is therefore 1, not 3."),
            zh = LocalizedContent("瑞典赢得过多少次世界杯？", listOf("2", "3", "4", "5"), "体育", "瑞典曾一次赢得国际足联世界杯，即1958年作为东道主时。因此正确答案是1，而不是3。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Suecia la Copa del Mundo?", listOf("2", "3", "4", "5"), "Deportes", "Suecia ha ganado la Copa Mundial de la FIFA una vez, en 1958, cuando fue el país anfitrión. Por lo tanto, la respuesta correcta es 1, no 3.")
        ),
        BilingualQuestion(
            id = 8460, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par un joueur en carrière?", listOf("1000", "1500", "2000", "2500"), "Sport", "Le record du nombre de buts marqués en carrière est détenu par le Brésilien Pelé, avec 767 buts officiels en matchs, bien que certaines sources incluent des matchs amicaux pour atteindre environ 2000 buts. Ce chiffre est souvent cité dans le débat sur les meilleurs buteurs de l'histoire."),
            en = LocalizedContent("What is the record for the number of goals scored by a player in a career?", listOf("1000", "1500", "2000", "2500"), "Sports", "The record for career goals is held by Brazilian Pelé, with 767 official goals in matches, although some sources include friendly matches to reach about 2000 goals. This number is often cited in debates about the greatest scorers in history."),
            zh = LocalizedContent("球员职业生涯进球数纪录是多少？", listOf("1000", "1500", "2000", "2500"), "体育", "职业生涯进球纪录由巴西球员贝利保持，他在正式比赛中打入767球，但有些资料将友谊赛计算在内，总数约为2000球。这个数字常被用于历史最佳射手的讨论。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un jugador en su carrera?", listOf("1000", "1500", "2000", "2500"), "Deportes", "El récord de goles en carrera lo posee el brasileño Pelé, con 767 goles oficiales en partidos, aunque algunas fuentes incluyen partidos amistosos para alcanzar unos 2000 goles. Esta cifra se cita a menudo en el debate sobre los máximos goleadores de la historia.")
        ),
        BilingualQuestion(
            id = 8461, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué le plus de buts en carrière?", listOf("Nikola Karabatic", "Igor Anic", "Jackson Richardson", "Holger Glandrup"), "Sport", "Igor Anic est un joueur de handball français, considéré comme l’un des meilleurs buteurs de l’histoire de ce sport, avec plus de 4 000 buts marqués en compétitions officielles."),
            en = LocalizedContent("Who has scored the most goals in a career?", listOf("Nikola Karabatic", "Igor Anic", "Jackson Richardson", "Holger Glandrup"), "Sports", "Igor Anic is a French handball player, considered one of the best scorers in the history of the sport, with over 4,000 goals scored in official competitions."),
            zh = LocalizedContent("谁在职业生涯中进球最多？", listOf("尼古拉·卡拉巴蒂奇", "伊戈尔·阿尼奇", "杰克逊·理查森", "霍尔格·格兰德鲁普"), "体育", "伊戈尔·阿尼奇是法国手球运动员，被认为是该运动历史上最优秀的得分手之一，在正式比赛中攻入超过4000球。"),
            es = LocalizedContent("¿Quién ha marcado más goles en su carrera?", listOf("Nikola Karabatic", "Igor Anic", "Jackson Richardson", "Holger Glandrup"), "Deportes", "Igor Anic es un jugador de balonmano francés, considerado uno de los mejores goleadores de la historia de este deporte, con más de 4.000 goles marcados en competiciones oficiales.")
        ),
        BilingualQuestion(
            id = 8462, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de buts Igor Anic a-t-il marqués?", listOf("500", "1000", "1500", "2000"), "Sport", "Igor Anic, joueur de handball français, a marqué 1500 buts en sélection nationale, un record pour l'équipe de France. Il est connu pour sa carrière au Montpellier Handball et en équipe de France."),
            en = LocalizedContent("How many goals has Igor Anic scored?", listOf("500", "1000", "1500", "2000"), "Sports", "Igor Anic, a French handball player, scored 1500 goals for the national team, a record for the French team. He is known for his career at Montpellier Handball and the French national team."),
            zh = LocalizedContent("伊戈尔·阿尼奇进了多少球？", listOf("500", "1000", "1500", "2000"), "体育", "法国手球运动员伊戈尔·阿尼奇为国家队攻入1500球，是法国队的纪录。他以在蒙彼利埃手球俱乐部和法国国家队的职业生涯而闻名。"),
            es = LocalizedContent("¿Cuántos goles ha marcado Igor Anic?", listOf("500", "1000", "1500", "2000"), "Deportes", "Igor Anic, jugador de balonmano francés, marcó 1500 goles con la selección nacional, un récord para el equipo francés. Es conocido por su carrera en el Montpellier Handball y la selección francesa.")
        ),
        BilingualQuestion(
            id = 8463, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par un joueur en un match?", listOf("15", "16", "17", "18"), "Sport", "Ce record est détenu par le joueur de football Archie Thompson, qui a inscrit 16 buts pour l'Australie lors d'une victoire 31-0 contre les Samoa américaines en 2001."),
            en = LocalizedContent("What is the record for the number of goals scored by a player in a single match?", listOf("15", "16", "17", "18"), "Sports", "This record is held by footballer Archie Thompson, who scored 16 goals for Australia in a 31-0 victory over American Samoa in 2001."),
            zh = LocalizedContent("球员单场比赛进球数纪录是多少？", listOf("15", "16", "17", "18"), "体育", "该纪录由足球运动员阿奇·汤普森保持，他在2001年澳大利亚31-0战胜美属萨摩亚的比赛中攻入16球。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un jugador en un solo partido?", listOf("15", "16", "17", "18"), "Deportes", "Este récord lo posee el futbolista Archie Thompson, quien marcó 16 goles para Australia en una victoria 31-0 sobre Samoa Americana en 2001.")
        ),
        BilingualQuestion(
            id = 8464, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par une équipe en un match?", listOf("40", "45", "50", "55"), "Sport", "Ce record a été établi en 1885 par Arbroath FC, qui a battu Bon Accord 36-0 en Coupe d'Écosse. Le score de 50-0 est souvent cité par erreur, mais le record officiel est de 36 buts."),
            en = LocalizedContent("What is the record for the number of goals scored by a team in a single match?", listOf("40", "45", "50", "55"), "Sports", "This record was set in 1885 by Arbroath FC, who beat Bon Accord 36-0 in the Scottish Cup. The score of 50-0 is often mistakenly cited, but the official record is 36 goals."),
            zh = LocalizedContent("球队单场比赛进球数纪录是多少？", listOf("40", "45", "50", "55"), "体育", "该纪录由阿布罗斯足球俱乐部在1885年创造，他们在苏格兰杯中以36-0战胜邦阿科德。50-0的比分常被误传，但官方纪录是36球。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un equipo en un solo partido?", listOf("40", "45", "50", "55"), "Deportes", "Este récord fue establecido en 1885 por el Arbroath FC, que venció 36-0 al Bon Accord en la Copa de Escocia. El marcador de 50-0 se cita a menudo por error, pero el récord oficial es de 36 goles.")
        ),
        BilingualQuestion(
            id = 8465, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par une équipe en une saison?", listOf("500", "600", "700", "800"), "Sport", "Le record de 700 buts en une saison a été établi par le club écossais du Celtic Glasgow lors de la saison 1966-1967, toutes compétitions confondues."),
            en = LocalizedContent("What is the record for the number of goals scored by a team in a season?", listOf("500", "600", "700", "800"), "Sports", "The record of 700 goals in a season was set by Scottish club Celtic Glasgow during the 1966-1967 season, across all competitions."),
            zh = LocalizedContent("球队单赛季进球数纪录是多少？", listOf("500", "600", "700", "800"), "体育", "单赛季700球的纪录由苏格兰俱乐部凯尔特人在1966-1967赛季创造，涵盖所有赛事。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un equipo en una temporada?", listOf("500", "600", "700", "800"), "Deportes", "El récord de 700 goles en una temporada fue establecido por el club escocés Celtic Glasgow durante la temporada 1966-1967, en todas las competiciones.")
        ),
        BilingualQuestion(
            id = 8466, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en Ligue des Champions?", listOf("3", "4", "5", "6"), "Sport", "Le Real Madrid détient le record avec 15 victoires en Ligue des Champions, et non 5. Ce chiffre correspond plutôt au nombre de titres remportés par un club comme Barcelone ou Liverpool."),
            en = LocalizedContent("What is the record for the number of Champions League wins?", listOf("3", "4", "5", "6"), "Sports", "Real Madrid holds the record with 15 Champions League titles, not 5. This number corresponds more to the number of titles won by a club like Barcelona or Liverpool."),
            zh = LocalizedContent("欧冠冠军次数纪录是多少？", listOf("3", "4", "5", "6"), "体育", "皇家马德里以15次欧冠冠军保持纪录，而非5次。5次更接近巴塞罗那或利物浦等俱乐部的夺冠次数。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en la Liga de Campeones?", listOf("3", "4", "5", "6"), "Deportes", "El Real Madrid ostenta el récord con 15 títulos de la Liga de Campeones, no 5. Esta cifra corresponde más al número de títulos ganados por un club como Barcelona o Liverpool.")
        ),
        BilingualQuestion(
            id = 8467, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel club a remporté le plus de Ligue des Champions?", listOf("FC Barcelona", "Paris Saint-Germain", "THW Kiel", "Montpellier"), "Sport", "Le FC Barcelone détient le record de victoires en Ligue des Champions féminine avec 8 titres, dont le dernier en 2023. C'est le club le plus titré de l'histoire de la compétition."),
            en = LocalizedContent("Which club has won the most Champions League titles?", listOf("FC Barcelona", "Paris Saint-Germain", "THW Kiel", "Montpellier"), "Sports", "FC Barcelona holds the record for the most Women's Champions League titles with 8, the latest in 2023. It is the most successful club in the competition's history."),
            zh = LocalizedContent("哪家俱乐部赢得欧冠冠军最多？", listOf("巴塞罗那", "巴黎圣日耳曼", "THW基尔", "蒙彼利埃"), "体育", "巴塞罗那以8次女足欧冠冠军保持纪录，最近一次是2023年。它是该赛事历史上最成功的俱乐部。"),
            es = LocalizedContent("¿Qué club ha ganado más Ligas de Campeones?", listOf("FC Barcelona", "Paris Saint-Germain", "THW Kiel", "Montpellier"), "Deportes", "El FC Barcelona ostenta el récord de títulos de la Liga de Campeones Femenina con 8, el último en 2023. Es el club más exitoso en la historia de la competición.")
        ),
        BilingualQuestion(
            id = 8468, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Ligue des Champions le FC Barcelona a-t-il remportées?", listOf("2", "3", "4", "5"), "Sport", "Le FC Barcelone a remporté sa première Ligue des Champions en 1992, puis en 2006, 2009, 2011 et 2015, soit cinq titres au total. La réponse correcte est donc 5, et non 4."),
            en = LocalizedContent("How many Champions League titles has FC Barcelona won?", listOf("2", "3", "4", "5"), "Sports", "FC Barcelona won its first Champions League in 1992, then in 2006, 2009, 2011, and 2015, for a total of five titles. The correct answer is 5, not 4."),
            zh = LocalizedContent("巴塞罗那赢得了多少次欧冠冠军？", listOf("2", "3", "4", "5"), "体育", "巴塞罗那在1992年首次赢得欧冠，随后在2006年、2009年、2011年和2015年夺冠，共五次。正确答案是5次，而非4次。"),
            es = LocalizedContent("¿Cuántas Ligas de Campeones ha ganado el FC Barcelona?", listOf("2", "3", "4", "5"), "Deportes", "El FC Barcelona ganó su primera Liga de Campeones en 1992, luego en 2006, 2009, 2011 y 2015, totalizando cinco títulos. La respuesta correcta es 5, no 4.")
        ),
        BilingualQuestion(
            id = 8469, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre d'arrêts en un match de handball?", listOf("15", "16", "17", "18"), "Sport", "Le record de 16 arrêts en un match de handball a été établi par le gardien français Thierry Omeyer lors de la finale des Jeux olympiques de 2008 contre l'Islande."),
            en = LocalizedContent("What is the record for the number of saves in a handball match?", listOf("15", "16", "17", "18"), "Sports", "The record of 16 saves in a handball match was set by French goalkeeper Thierry Omeyer during the final of the 2008 Olympic Games against Iceland."),
            zh = LocalizedContent("手球比赛单场扑救次数纪录是多少？", listOf("15", "16", "17", "18"), "体育", "手球比赛单场16次扑救的纪录由法国门将蒂埃里·奥梅耶在2008年奥运会决赛对阵冰岛时创造。"),
            es = LocalizedContent("¿Cuál es el récord de paradas en un partido de balonmano?", listOf("15", "16", "17", "18"), "Deportes", "El récord de 16 paradas en un partido de balonmano fue establecido por el portero francés Thierry Omeyer durante la final de los Juegos Olímpicos de 2008 contra Islandia.")
        ),
        BilingualQuestion(
            id = 8470, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre d'arrêts en une saison?", listOf("200", "250", "300", "350"), "Sport", "Le record de 300 arrêts en une saison a été établi par le gardien de but de hockey sur glace Martin Brodeur lors de la saison 2006-2007 de la LNH."),
            en = LocalizedContent("What is the record for the number of saves in a season?", listOf("200", "250", "300", "350"), "Sports", "The record of 300 saves in a season was set by ice hockey goaltender Martin Brodeur during the 2006-2007 NHL season."),
            zh = LocalizedContent("单赛季扑救次数纪录是多少？", listOf("200", "250", "300", "350"), "体育", "单赛季300次扑救的纪录由冰球守门员马丁·布罗德尔在2006-2007赛季NHL中创造。"),
            es = LocalizedContent("¿Cuál es el récord de paradas en una temporada?", listOf("200", "250", "300", "350"), "Deportes", "El récord de 300 paradas en una temporada fue establecido por el portero de hockey sobre hielo Martin Brodeur durante la temporada 2006-2007 de la NHL.")
        ),
        BilingualQuestion(
            id = 8471, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gardien a effectué le plus d'arrêts en carrière?", listOf("Dominik Klein", "Thomas Haab", "Thierry Omeyer", "Silvio Heinevetter"), "Sport", "Thierry Omeyer, considéré comme l'un des meilleurs gardiens de handball, détient le record du nombre d'arrêts en carrière grâce à sa longévité et ses performances exceptionnelles en club et en équipe de France."),
            en = LocalizedContent("Which goalkeeper has made the most saves in their career?", listOf("Dominik Klein", "Thomas Haab", "Thierry Omeyer", "Silvio Heinevetter"), "Sports", "Thierry Omeyer, considered one of the best handball goalkeepers, holds the record for the most saves in a career due to his longevity and exceptional performances at club and national team level."),
            zh = LocalizedContent("哪位守门员职业生涯扑救次数最多？", listOf("多米尼克·克莱因", "托马斯·哈布", "蒂埃里·奥梅耶", "西尔维奥·海内维特"), "体育", "蒂埃里·奥梅耶被认为是手球史上最优秀的守门员之一，凭借其职业生涯的持久性和在俱乐部及国家队的出色表现，保持着扑救次数最多的纪录。"),
            es = LocalizedContent("¿Qué portero ha realizado más paradas en su carrera?", listOf("Dominik Klein", "Thomas Haab", "Thierry Omeyer", "Silvio Heinevetter"), "Deportes", "Thierry Omeyer, considerado uno de los mejores porteros de balonmano, posee el récord de más paradas en una carrera gracias a su longevidad y actuaciones excepcionales en clubes y con la selección francesa.")
        ),
        BilingualQuestion(
            id = 8472, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'arrêts Thierry Omeyer a-t-il effectués?", listOf("500", "1000", "1500", "2000"), "Sport", "Thierry Omeyer, considéré comme l'un des meilleurs gardiens de handball, a atteint le cap des 1000 arrêts en compétition officielle, un record symbolique dans l'histoire du sport."),
            en = LocalizedContent("How many saves has Thierry Omeyer made?", listOf("500", "1000", "1500", "2000"), "Sports", "Thierry Omeyer, considered one of the best handball goalkeepers, reached the milestone of 1000 saves in official competition, a symbolic record in the history of the sport."),
            zh = LocalizedContent("蒂埃里·奥梅耶完成了多少次扑救？", listOf("500", "1000", "1500", "2000"), "体育", "蒂埃里·奥梅耶被认为是手球史上最优秀的守门员之一，他在正式比赛中达到了1000次扑救的里程碑，这是该运动历史上一个具有象征意义的纪录。"),
            es = LocalizedContent("¿Cuántas paradas ha realizado Thierry Omeyer?", listOf("500", "1000", "1500", "2000"), "Deportes", "Thierry Omeyer, considerado uno de los mejores porteros de balonmano, alcanzó la marca de 1000 paradas en competición oficial, un récord simbólico en la historia del deporte.")
        ),
        BilingualQuestion(
            id = 8473, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de passes décisives?", listOf("200", "300", "400", "500"), "Sport", "Le record de 400 passes décisives est détenu par le joueur de football américain Tom Brady, établi tout au long de sa carrière en NFL, une performance inégalée dans ce sport."),
            en = LocalizedContent("What is the record for the number of assists?", listOf("200", "300", "400", "500"), "Sports", "The record of 400 assists is held by American football player Tom Brady, achieved throughout his NFL career, an unparalleled performance in the sport."),
            zh = LocalizedContent("助攻次数纪录是多少？", listOf("200", "300", "400", "500"), "体育", "400次助攻的纪录由美式橄榄球运动员汤姆·布雷迪保持，他在NFL职业生涯中达成，是该运动中无与伦比的表现。"),
            es = LocalizedContent("¿Cuál es el récord de asistencias?", listOf("200", "300", "400", "500"), "Deportes", "El récord de 400 asistencias lo posee el jugador de fútbol americano Tom Brady, logrado a lo largo de su carrera en la NFL, una actuación sin igual en este deporte.")
        ),
        BilingualQuestion(
            id = 8474, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a effectué le plus de passes décisives?", listOf("Nikola Karabatic", "Igor Anic", "Jackson Richardson", "Holger Glandrup"), "Sport", "Nikola Karabatic détient le record du nombre de passes décisives en handball, notamment grâce à sa longévité et son rôle de chef d'orchestre au poste d'arrière gauche."),
            en = LocalizedContent("Who has made the most assists?", listOf("Nikola Karabatic", "Igor Anic", "Jackson Richardson", "Holger Glandrup"), "Sports", "Nikola Karabatic holds the record for the most assists in handball, thanks to his longevity and role as playmaker at left back."),
            zh = LocalizedContent("谁完成的助攻次数最多？", listOf("尼古拉·卡拉巴蒂奇", "伊戈尔·阿尼奇", "杰克逊·理查森", "霍尔格·格兰德鲁普"), "体育", "尼古拉·卡拉巴蒂奇保持着手球助攻次数最多的纪录，这得益于他漫长的职业生涯以及作为左后卫组织核心的角色。"),
            es = LocalizedContent("¿Quién ha realizado más asistencias?", listOf("Nikola Karabatic", "Igor Anic", "Jackson Richardson", "Holger Glandrup"), "Deportes", "Nikola Karabatic posee el récord de más asistencias en balonmano, gracias a su longevidad y su papel como director de juego en la posición de lateral izquierdo.")
        ),
        BilingualQuestion(
            id = 8475, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de passes décisives Nikola Karabatic a-t-il effectuées?", listOf("200", "300", "400", "500"), "Sport", "Nikola Karabatic est devenu le premier joueur de l’histoire du championnat de France de handball à atteindre la barre des 400 passes décisives en février 2023."),
            en = LocalizedContent("How many assists has Nikola Karabatic made?", listOf("200", "300", "400", "500"), "Sports", "Nikola Karabatic became the first player in the history of the French handball championship to reach the 400-assist mark in February 2023."),
            zh = LocalizedContent("尼古拉·卡拉巴蒂奇完成了多少次助攻？", listOf("200", "300", "400", "500"), "体育", "尼古拉·卡拉巴蒂奇于2023年2月成为法国手球锦标赛历史上首位达到400次助攻的球员。"),
            es = LocalizedContent("¿Cuántas asistencias ha realizado Nikola Karabatic?", listOf("200", "300", "400", "500"), "Deportes", "Nikola Karabatic se convirtió en el primer jugador en la historia del campeonato francés de balonmano en alcanzar la marca de 400 asistencias en febrero de 2023.")
        ),
        BilingualQuestion(
            id = 8476, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts en 7 matchs?", listOf("50", "60", "70", "80"), "Sport", "Ce record a été établi lors de la Coupe du monde de rugby à XV en 2003, où l'Australie a marqué 60 points contre la Namibie. Il s'agit du plus grand nombre de points inscrits par une équipe en sept matchs dans l'histoire de la compétition."),
            en = LocalizedContent("What is the record for the number of points in 7 matches?", listOf("50", "60", "70", "80"), "Sports", "This record was set during the 2003 Rugby World Cup, where Australia scored 60 points against Namibia. It is the highest number of points scored by a team in seven matches in the history of the competition."),
            zh = LocalizedContent("7场比赛得分纪录是多少？", listOf("50", "60", "70", "80"), "体育", "这一纪录是在2003年橄榄球世界杯上创造的，澳大利亚队对阵纳米比亚队时得到了60分。这是该赛事历史上单支球队在七场比赛中获得的最高分数。"),
            es = LocalizedContent("¿Cuál es el récord de puntos en 7 partidos?", listOf("50", "60", "70", "80"), "Deportes", "Este récord se estableció durante la Copa Mundial de Rugby de 2003, donde Australia anotó 60 puntos contra Namibia. Es la mayor cantidad de puntos anotados por un equipo en siete partidos en la historia de la competición.")
        ),
        BilingualQuestion(
            id = 8477, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires consécutives en coupe?", listOf("10", "12", "15", "18"), "Sport", "Le Real Madrid détient ce record avec 15 victoires consécutives en Ligue des champions, une série établie entre 2015 et 2018 sous la direction de Zinedine Zidane."),
            en = LocalizedContent("What is the record for the most consecutive cup wins?", listOf("10", "12", "15", "18"), "Sports", "Real Madrid holds this record with 15 consecutive wins in the Champions League, a streak established between 2015 and 2018 under Zinedine Zidane."),
            zh = LocalizedContent("杯赛连胜纪录是多少？", listOf("10", "12", "15", "18"), "体育", "皇家马德里保持着这一纪录，在齐内丁·齐达内的带领下，于2015年至2018年间在欧冠联赛中取得了15连胜。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias consecutivas en copa?", listOf("10", "12", "15", "18"), "Deportes", "El Real Madrid posee este récord con 15 victorias consecutivas en la Liga de Campeones, una racha establecida entre 2015 y 2018 bajo la dirección de Zinedine Zidane.")
        ),
        BilingualQuestion(
            id = 8478, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires en Coupe de France?", listOf("2", "3", "4", "5"), "Sport", "Le record est détenu par le Paris Saint-Germain avec 14 victoires, et non 4. Aucun club n'a remporté la Coupe de France exactement 4 fois."),
            en = LocalizedContent("What is the record for the most wins in the Coupe de France?", listOf("2", "3", "4", "5"), "Sports", "The record is held by Paris Saint-Germain with 14 wins, not 4. No club has won the Coupe de France exactly 4 times."),
            zh = LocalizedContent("法国杯夺冠次数纪录是多少？", listOf("2", "3", "4", "5"), "体育", "纪录由巴黎圣日耳曼保持，共14次夺冠，而非4次。没有俱乐部恰好赢得4次法国杯。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias en la Copa de Francia?", listOf("2", "3", "4", "5"), "Deportes", "El récord lo posee el Paris Saint-Germain con 14 victorias, no 4. Ningún club ha ganado la Copa de Francia exactamente 4 veces.")
        ),
        BilingualQuestion(
            id = 8479, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel club a remporté le plus de Coupe de France?", listOf("Dunkerque", "Montpellier", "Saint-Raphaël", "Toulouse"), "Sport", "L'USL Dunkerque détient le record du plus grand nombre de victoires en Coupe de France de football, avec 7 titres remportés entre 1918 et 1931."),
            en = LocalizedContent("Which club has won the most Coupe de France titles?", listOf("Dunkerque", "Montpellier", "Saint-Raphaël", "Toulouse"), "Sports", "USL Dunkerque holds the record for the most wins in the Coupe de France football competition, with 7 titles won between 1918 and 1931."),
            zh = LocalizedContent("哪家俱乐部赢得法国杯次数最多？", listOf("敦刻尔克", "蒙彼利埃", "圣拉斐尔", "图卢兹"), "体育", "敦刻尔克俱乐部保持着法国杯足球赛夺冠次数最多的纪录，在1918年至1931年间共赢得7次冠军。"),
            es = LocalizedContent("¿Qué club ha ganado más veces la Copa de Francia?", listOf("Dunkerque", "Montpellier", "Saint-Raphaël", "Toulouse"), "Deportes", "El USL Dunkerque posee el récord de más victorias en la Copa de Francia de fútbol, con 7 títulos ganados entre 1918 y 1931.")
        ),
        BilingualQuestion(
            id = 8480, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Coupe de France Dunkerque a-t-il remportées?", listOf("2", "3", "4", "5"), "Sport", "Dunkerque a remporté la Coupe de France à quatre reprises, en 1959, 1960, 1961 et 1962, réalisant un exploit rare dans l'histoire du football français."),
            en = LocalizedContent("How many Coupe de France titles has Dunkerque won?", listOf("2", "3", "4", "5"), "Sports", "Dunkerque has won the Coupe de France four times, in 1959, 1960, 1961 and 1962, achieving a rare feat in French football history."),
            zh = LocalizedContent("敦刻尔克赢得了多少次法国杯冠军？", listOf("2", "3", "4", "5"), "体育", "敦刻尔克四次赢得法国杯冠军，分别在1959年、1960年、1961年和1962年，这在法国足球历史上是一项罕见的成就。"),
            es = LocalizedContent("¿Cuántas Copas de Francia ha ganado Dunkerque?", listOf("2", "3", "4", "5"), "Deportes", "Dunkerque ha ganado la Copa de Francia en cuatro ocasiones, en 1959, 1960, 1961 y 1962, logrando una hazaña poco común en la historia del fútbol francés.")
        ),
        BilingualQuestion(
            id = 8481, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par une équipe sur une saison en championnat?", listOf("800", "850", "900", "950"), "Sport", "Ce record a été établi par le Real Madrid lors de la saison 2011-2012, toutes compétitions confondues, mais en championnat d'Espagne, l'équipe a marqué 121 buts, et non 850. Le chiffre de 850 correspond au record de buts marqués par une équipe de hockey sur glace en une saison de LNH."),
            en = LocalizedContent("What is the record for the number of goals scored by a team in a league season?", listOf("800", "850", "900", "950"), "Sports", "This record was set by Real Madrid in the 2011-2012 season across all competitions, but in the Spanish league, the team scored 121 goals, not 850. The figure 850 corresponds to the record for goals scored by an ice hockey team in an NHL season."),
            zh = LocalizedContent("一支球队在联赛赛季中进球数的纪录是多少？", listOf("800", "850", "900", "950"), "体育", "这一纪录由皇家马德里在2011-2012赛季所有比赛中创造，但在西甲联赛中，该队打入121球，而非850球。850这个数字对应的是冰球队在NHL赛季中的进球纪录。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un equipo en una temporada de liga?", listOf("800", "850", "900", "950"), "Deportes", "Este récord fue establecido por el Real Madrid en la temporada 2011-2012 en todas las competiciones, pero en la liga española, el equipo marcó 121 goles, no 850. La cifra de 850 corresponde al récord de goles marcados por un equipo de hockey sobre hielo en una temporada de la NHL.")
        ),
        BilingualQuestion(
            id = 8482, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par une équipe en demi-finale?", listOf("30", "35", "40", "45"), "Sport", "Ce record a été établi par l'équipe de France de handball lors des Jeux Olympiques de 2008, où elle a marqué 40 buts contre la Croatie en demi-finale."),
            en = LocalizedContent("What is the record for the number of goals scored by a team in a semi-final?", listOf("30", "35", "40", "45"), "Sports", "This record was set by the French handball team during the 2008 Olympic Games, where they scored 40 goals against Croatia in the semi-final."),
            zh = LocalizedContent("一支球队在半决赛中进球数的纪录是多少？", listOf("30", "35", "40", "45"), "体育", "这一纪录由法国手球队在2008年奥运会半决赛对阵克罗地亚时创造，他们打入了40球。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un equipo en una semifinal?", listOf("30", "35", "40", "45"), "Deportes", "Este récord fue establecido por el equipo francés de balonmano durante los Juegos Olímpicos de 2008, donde marcaron 40 goles contra Croacia en la semifinal.")
        ),
        BilingualQuestion(
            id = 8483, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de buts encaissés en un match?", listOf("30", "35", "40", "45"), "Sport", "Ce record a été établi en 1885 lors d'un match entre l'Arbroath FC et le Bon Accord, où Arbroath a gagné 36-0, mais le score officiel le plus élevé est de 149-0, un match de 2002 à Madagascar où l'équipe perdante a délibérément marqué des buts contre son camp pour protester contre l'arbitrage."),
            en = LocalizedContent("What is the record for the highest number of goals conceded in a match?", listOf("30", "35", "40", "45"), "Sports", "This record was set in 1885 during a match between Arbroath FC and Bon Accord, where Arbroath won 36-0, but the highest official score is 149-0, a 2002 match in Madagascar where the losing team deliberately scored own goals to protest refereeing."),
            zh = LocalizedContent("一场比赛中失球数最多的纪录是多少？", listOf("30", "35", "40", "45"), "体育", "这一纪录于1885年在阿布罗斯FC对阵博纳科德的比赛中创造，阿布罗斯以36-0获胜，但官方最高比分是149-0，那是2002年马达加斯加的一场比赛，输球方故意打入乌龙球以抗议裁判。"),
            es = LocalizedContent("¿Cuál es el récord de mayor número de goles recibidos en un partido?", listOf("30", "35", "40", "45"), "Deportes", "Este récord se estableció en 1885 durante un partido entre el Arbroath FC y el Bon Accord, donde Arbroath ganó 36-0, pero el marcador oficial más alto es 149-0, un partido de 2002 en Madagascar donde el equipo perdedor marcó goles en propia puerta deliberadamente para protestar contra el arbitraje.")
        ),
        BilingualQuestion(
            id = 8484, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de buts encaissés en une saison?", listOf("400", "500", "600", "700"), "Sport", "Le record de 600 buts encaissés en une saison a été établi par le club écossais d'Arbroath FC lors de la saison 1885-1886, une époque où les scores étaient souvent très élevés dans le football amateur."),
            en = LocalizedContent("What is the record for the highest number of goals conceded in a season?", listOf("400", "500", "600", "700"), "Sports", "The record of 600 goals conceded in a season was set by the Scottish club Arbroath FC in the 1885-1886 season, an era when scores were often very high in amateur football."),
            zh = LocalizedContent("一个赛季中失球数最多的纪录是多少？", listOf("400", "500", "600", "700"), "体育", "单赛季失球600球的纪录由苏格兰俱乐部阿布罗斯FC在1885-1886赛季创造，当时业余足球的比分往往非常高。"),
            es = LocalizedContent("¿Cuál es el récord de mayor número de goles recibidos en una temporada?", listOf("400", "500", "600", "700"), "Deportes", "El récord de 600 goles recibidos en una temporada fue establecido por el club escocés Arbroath FC en la temporada 1885-1886, una época en la que los marcadores solían ser muy altos en el fútbol amateur.")
        ),
        BilingualQuestion(
            id = 8485, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en compétition internationale?", listOf("50", "100", "150", "200"), "Sport", "Ce record de 150 victoires en compétition internationale est détenu par le nageur Michael Phelps, qui totalise 28 médailles olympiques et 26 titres mondiaux."),
            en = LocalizedContent("What is the record for the number of wins in international competition?", listOf("50", "100", "150", "200"), "Sports", "This record of 150 wins in international competition is held by swimmer Michael Phelps, who has 28 Olympic medals and 26 world titles."),
            zh = LocalizedContent("国际比赛中获胜次数的纪录是多少？", listOf("50", "100", "150", "200"), "体育", "国际比赛150胜的纪录由游泳运动员迈克尔·菲尔普斯保持，他拥有28枚奥运奖牌和26个世界冠军头衔。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en competición internacional?", listOf("50", "100", "150", "200"), "Deportes", "Este récord de 150 victorias en competición internacional lo posee el nadador Michael Phelps, que suma 28 medallas olímpicas y 26 títulos mundiales.")
        ),
        BilingualQuestion(
            id = 8486, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe a le plus de victoires en compétition internationale?", listOf("France", "Suède", "Allemagne", "Espagne"), "Sport", "L'équipe de France de football détient le record de victoires en Coupe du monde avec deux titres, en 1998 et 2018. Elle compte également deux victoires en Championnat d'Europe des nations, en 1984 et 2000."),
            en = LocalizedContent("Which team has the most wins in international competition?", listOf("France", "Sweden", "Germany", "Spain"), "Sports", "The French football team holds the record for World Cup wins with two titles, in 1998 and 2018. It also has two European Championship wins, in 1984 and 2000."),
            zh = LocalizedContent("哪支球队在国际比赛中获胜次数最多？", listOf("法国", "瑞典", "德国", "西班牙"), "体育", "法国足球队保持着世界杯夺冠纪录，共两次夺冠，分别是1998年和2018年。此外，他们还两次赢得欧洲锦标赛冠军，分别是1984年和2000年。"),
            es = LocalizedContent("¿Qué equipo tiene más victorias en competición internacional?", listOf("Francia", "Suecia", "Alemania", "España"), "Deportes", "El equipo francés de fútbol tiene el récord de victorias en la Copa del Mundo con dos títulos, en 1998 y 2018. También cuenta con dos victorias en la Eurocopa, en 1984 y 2000.")
        ),
        BilingualQuestion(
            id = 8487, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de médailles remportées en Coupes du Monde?", listOf("5", "6", "7", "8"), "Sport", "Le record de six médailles en Coupes du Monde est détenu par le footballeur brésilien Pelé, qui a remporté trois Coupes du Monde (1958, 1962, 1970) et trois autres médailles lors d'autres compétitions internationales."),
            en = LocalizedContent("What is the record for the number of medals won in World Cups?", listOf("5", "6", "7", "8"), "Sports", "The record of six medals in World Cups is held by Brazilian footballer Pelé, who won three World Cups (1958, 1962, 1970) and three other medals in other international competitions."),
            zh = LocalizedContent("世界杯中获得奖牌数的纪录是多少？", listOf("5", "6", "7", "8"), "体育", "六枚世界杯奖牌的纪录由巴西足球运动员贝利保持，他赢得了三届世界杯（1958年、1962年、1970年）以及在其他国际比赛中获得的三枚奖牌。"),
            es = LocalizedContent("¿Cuál es el récord de medallas ganadas en Copas del Mundo?", listOf("5", "6", "7", "8"), "Deportes", "El récord de seis medallas en Copas del Mundo lo posee el futbolista brasileño Pelé, quien ganó tres Copas del Mundo (1958, 1962, 1970) y otras tres medallas en otras competiciones internacionales.")
        ),
        BilingualQuestion(
            id = 8488, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de participations en Coupe du Monde?", listOf("15", "16", "17", "18"), "Sport", "Lionel Messi détient ce record avec 26 matchs joués en Coupe du Monde, mais le record de participations en tant que joueur (nombre de tournois disputés) est de 5, partagé par plusieurs joueurs comme Antonio Carbajal et Lothar Matthäus."),
            en = LocalizedContent("What is the record for the number of World Cup appearances?", listOf("15", "16", "17", "18"), "Sports", "Lionel Messi holds this record with 26 matches played in World Cups, but the record for appearances as a player (number of tournaments played) is 5, shared by several players like Antonio Carbajal and Lothar Matthäus."),
            zh = LocalizedContent("世界杯出场次数的纪录是多少？", listOf("15", "16", "17", "18"), "体育", "莱昂内尔·梅西保持着世界杯出场26次的纪录，但作为球员参加世界杯届数的纪录是5届，由安东尼奥·卡瓦哈尔和洛塔尔·马特乌斯等人共同保持。"),
            es = LocalizedContent("¿Cuál es el récord de participaciones en la Copa del Mundo?", listOf("15", "16", "17", "18"), "Deportes", "Lionel Messi tiene este récord con 26 partidos jugados en Copas del Mundo, pero el récord de participaciones como jugador (número de torneos disputados) es de 5, compartido por varios jugadores como Antonio Carbajal y Lothar Matthäus.")
        ),
        BilingualQuestion(
            id = 8489, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts marqués par une équipe en 3 matchs?", listOf("80", "90", "100", "110"), "Sport", "Le record des 100 buts en trois matchs a été établi par l'équipe de football des îles Salomon en 2015, lors des éliminatoires de la Coupe du monde, contre des adversaires comme les Samoa américaines."),
            en = LocalizedContent("What is the record for the number of goals scored by a team in 3 matches?", listOf("80", "90", "100", "110"), "Sports", "The record of 100 goals in three matches was set by the Solomon Islands football team in 2015, during World Cup qualifiers, against opponents like American Samoa."),
            zh = LocalizedContent("一支球队在3场比赛中进球数的纪录是多少？", listOf("80", "90", "100", "110"), "体育", "三场比赛打入100球的纪录由所罗门群岛足球队在2015年世界杯预选赛中创造，对手包括美属萨摩亚等队。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados por un equipo en 3 partidos?", listOf("80", "90", "100", "110"), "Deportes", "El récord de 100 goles en tres partidos fue establecido por el equipo de fútbol de las Islas Salomón en 2015, durante las eliminatorias de la Copa del Mundo, contra rivales como Samoa Americana.")
        ),
        BilingualQuestion(
            id = 8490, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires de suite en Championnat?", listOf("15", "16", "17", "18"), "Sport", "Ce record de 16 victoires consécutives en championnat est détenu par le Bayern Munich, réalisé lors de la saison 2013-2014 en Bundesliga."),
            en = LocalizedContent("What is the record for the most consecutive wins in a championship?", listOf("15", "16", "17", "18"), "Sports", "This record of 16 consecutive championship wins is held by Bayern Munich, achieved during the 2013-2014 Bundesliga season."),
            zh = LocalizedContent("联赛中连续获胜次数最多的纪录是多少？", listOf("15", "16", "17", "18"), "体育", "16场联赛连胜的纪录由拜仁慕尼黑保持，在2013-2014赛季德甲中实现。"),
            es = LocalizedContent("¿Cuál es el récord de victorias consecutivas en un campeonato?", listOf("15", "16", "17", "18"), "Deportes", "Este récord de 16 victorias consecutivas en el campeonato lo ostenta el Bayern de Múnich, logrado durante la temporada 2013-2014 de la Bundesliga.")
        ),
        BilingualQuestion(
            id = 8491, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe a remporté le plus de victoires consécutives?", listOf("THW Kiel", "Paris Saint-Germain", "FC Barcelona", "Montpellier"), "Sport", "Le PSG détient le record du plus grand nombre de victoires consécutives en Ligue 1, avec 14 succès d'affilée lors de la saison 2015-2016. Cette série a été réalisée sous la direction de Laurent Blanc."),
            en = LocalizedContent("Which team has the most consecutive wins?", listOf("THW Kiel", "Paris Saint-Germain", "FC Barcelona", "Montpellier"), "Sports", "PSG holds the record for the most consecutive wins in Ligue 1, with 14 straight victories during the 2015-2016 season. This streak was achieved under the direction of Laurent Blanc."),
            zh = LocalizedContent("哪支球队连续获胜次数最多？", listOf("THW基尔", "巴黎圣日耳曼", "巴塞罗那", "蒙彼利埃"), "体育", "巴黎圣日耳曼保持法甲连胜纪录，在2015-2016赛季取得14连胜。这一纪录是在洛朗·布兰科执教下实现的。"),
            es = LocalizedContent("¿Qué equipo tiene más victorias consecutivas?", listOf("THW Kiel", "Paris Saint-Germain", "FC Barcelona", "Montpellier"), "Deportes", "El PSG ostenta el récord de más victorias consecutivas en la Ligue 1, con 14 triunfos seguidos durante la temporada 2015-2016. Esta racha se logró bajo la dirección de Laurent Blanc.")
        ),
        BilingualQuestion(
            id = 8492, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de victoires consécutives le PSG a-t-il remportées?", listOf("15", "16", "17", "18"), "Sport", "Le PSG a établi un record de 16 victoires consécutives toutes compétitions confondues lors de la saison 2015-2016, sous la direction de Laurent Blanc."),
            en = LocalizedContent("How many consecutive wins did PSG achieve?", listOf("15", "16", "17", "18"), "Sports", "PSG set a record of 16 consecutive wins in all competitions during the 2015-2016 season, under the direction of Laurent Blanc."),
            zh = LocalizedContent("巴黎圣日耳曼取得了多少连胜？", listOf("15", "16", "17", "18"), "体育", "巴黎圣日耳曼在2015-2016赛季各项赛事中取得16连胜，由洛朗·布兰科执教。"),
            es = LocalizedContent("¿Cuántas victorias consecutivas logró el PSG?", listOf("15", "16", "17", "18"), "Deportes", "El PSG estableció un récord de 16 victorias consecutivas en todas las competiciones durante la temporada 2015-2016, bajo la dirección de Laurent Blanc.")
        ),
        BilingualQuestion(
            id = 8493, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de buts en demi-finale de Coupe du Monde?", listOf("40", "45", "50", "55"), "Sport", "Le record de 50 buts a été établi lors de la demi-finale de la Coupe du Monde de handball en 2003, entre l'Allemagne et la France, qui s'est soldée par un score de 28-22."),
            en = LocalizedContent("What is the highest number of goals in a World Cup semi-final?", listOf("40", "45", "50", "55"), "Sports", "The record of 50 goals was set during the 2003 Handball World Cup semi-final between Germany and France, which ended with a score of 28-22."),
            zh = LocalizedContent("世界杯半决赛中进球最多的是多少？", listOf("40", "45", "50", "55"), "体育", "50球的纪录是在2003年手球世界杯半决赛中创造的，德国对阵法国，最终比分28-22。"),
            es = LocalizedContent("¿Cuál es la mayor cantidad de goles en una semifinal de la Copa del Mundo?", listOf("40", "45", "50", "55"), "Deportes", "El récord de 50 goles se estableció durante la semifinal de la Copa del Mundo de balonmano de 2003 entre Alemania y Francia, que terminó con un marcador de 28-22.")
        ),
        BilingualQuestion(
            id = 8494, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de pénalités transformées?", listOf("5", "6", "7", "8"), "Sport", "Ce record a été établi par le rugbyman sud-africain Percy Montgomery lors d'un match contre l'Angleterre en 2007, où il a réussi 7 pénalités."),
            en = LocalizedContent("What is the record for the most penalties converted?", listOf("5", "6", "7", "8"), "Sports", "This record was set by South African rugby player Percy Montgomery during a match against England in 2007, where he successfully kicked 7 penalties."),
            zh = LocalizedContent("罚球命中次数最多的纪录是多少？", listOf("5", "6", "7", "8"), "体育", "这一纪录由南非橄榄球运动员珀西·蒙哥马利在2007年对阵英格兰的比赛中创造，他罚中了7个罚球。"),
            es = LocalizedContent("¿Cuál es el récord de más penaltis convertidos?", listOf("5", "6", "7", "8"), "Deportes", "Este récord lo estableció el jugador de rugby sudafricano Percy Montgomery durante un partido contra Inglaterra en 2007, donde acertó 7 penaltis.")
        ),
        BilingualQuestion(
            id = 8495, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de pénalités en un match?", listOf("8", "9", "10", "11"), "Sport", "Le record de dix pénalités lors d'un match de football américain a été établi en 2018 lors d'une rencontre entre les Steelers et les Raiders, un fait rare dans l'histoire de la NFL."),
            en = LocalizedContent("What is the highest number of penalties in a game?", listOf("8", "9", "10", "11"), "Sports", "The record of ten penalties in an American football game was set in 2018 during a match between the Steelers and the Raiders, a rare occurrence in NFL history."),
            zh = LocalizedContent("一场比赛中罚球次数最多的是多少？", listOf("8", "9", "10", "11"), "体育", "美式橄榄球比赛中十次罚球的纪录是在2018年钢人队对阵突袭者队的比赛中创造的，这在NFL历史上很少见。"),
            es = LocalizedContent("¿Cuál es la mayor cantidad de penaltis en un partido?", listOf("8", "9", "10", "11"), "Deportes", "El récord de diez penaltis en un partido de fútbol americano se estableció en 2018 durante un encuentro entre los Steelers y los Raiders, un hecho poco común en la historia de la NFL.")
        ),
        BilingualQuestion(
            id = 8496, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de disqualifications en un match?", listOf("2", "3", "4", "5"), "Sport", "Ce record a été établi lors d'un match de basket-ball NCAA en 1990, où quatre joueurs ont été disqualifiés pour avoir commis cinq fautes personnelles."),
            en = LocalizedContent("What is the record for the most disqualifications in a game?", listOf("2", "3", "4", "5"), "Sports", "This record was set during an NCAA basketball game in 1990, where four players were disqualified for committing five personal fouls."),
            zh = LocalizedContent("一场比赛中被罚下人数最多的纪录是多少？", listOf("2", "3", "4", "5"), "体育", "这一纪录是在1990年一场NCAA篮球比赛中创造的，四名球员因五次个人犯规被罚下。"),
            es = LocalizedContent("¿Cuál es el récord de más descalificaciones en un partido?", listOf("2", "3", "4", "5"), "Deportes", "Este récord se estableció durante un partido de baloncesto de la NCAA en 1990, donde cuatro jugadores fueron descalificados por cometer cinco faltas personales.")
        ),
        BilingualQuestion(
            id = 8497, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe a le moins encaissé de buts en une saison?", listOf("THW Kiel", "Montpellier", "FC Barcelona", "Paris Saint-Germain"), "Sport", "Montpellier détient le record du plus faible nombre de buts encaissés en une saison de Ligue 1, avec seulement 21 buts concédés lors de l'exercice 1991-1992."),
            en = LocalizedContent("Which team conceded the fewest goals in a season?", listOf("THW Kiel", "Montpellier", "FC Barcelona", "Paris Saint-Germain"), "Sports", "Montpellier holds the record for the fewest goals conceded in a Ligue 1 season, with only 21 goals allowed during the 1991-1992 campaign."),
            zh = LocalizedContent("哪支球队单赛季失球最少？", listOf("THW基尔", "蒙彼利埃", "巴塞罗那", "巴黎圣日耳曼"), "体育", "蒙彼利埃保持法甲单赛季失球最少纪录，在1991-1992赛季仅失21球。"),
            es = LocalizedContent("¿Qué equipo encajó menos goles en una temporada?", listOf("THW Kiel", "Montpellier", "FC Barcelona", "Paris Saint-Germain"), "Deportes", "El Montpellier ostenta el récord de menos goles encajados en una temporada de la Ligue 1, con solo 21 goles concedidos durante la campaña 1991-1992.")
        ),
        BilingualQuestion(
            id = 8498, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de tournois remportés en une année?", listOf("3", "4", "5", "6"), "Sport", "Ce record est détenu par le Serbe Novak Djokovic, qui a remporté les quatre tournois du Grand Chelem en 2021 (Australie, Roland-Garros, Wimbledon, US Open)."),
            en = LocalizedContent("What is the record for the most tournaments won in a year?", listOf("3", "4", "5", "6"), "Sports", "This record is held by Serbian Novak Djokovic, who won all four Grand Slam tournaments in 2021 (Australian Open, Roland Garros, Wimbledon, US Open)."),
            zh = LocalizedContent("一年内赢得最多锦标赛的纪录是多少？", listOf("3", "4", "5", "6"), "体育", "这一纪录由塞尔维亚选手诺瓦克·德约科维奇保持，他在2021年赢得了全部四项大满贯赛事（澳网、法网、温网、美网）。"),
            es = LocalizedContent("¿Cuál es el récord de más torneos ganados en un año?", listOf("3", "4", "5", "6"), "Deportes", "Este récord lo ostenta el serbio Novak Djokovic, quien ganó los cuatro torneos de Grand Slam en 2021 (Abierto de Australia, Roland Garros, Wimbledon, Abierto de EE. UU.).")
        ),
        BilingualQuestion(
            id = 8499, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de titres personnels d'un joueur?", listOf("5", "10", "15", "20"), "Sport", "Le record de 10 titres personnels est détenu par le joueur de tennis Rafael Nadal, qui a remporté 10 fois le tournoi de Roland-Garros."),
            en = LocalizedContent("What is the record for the most personal titles of a player?", listOf("5", "10", "15", "20"), "Sports", "The record of 10 personal titles is held by tennis player Rafael Nadal, who has won the Roland Garros tournament 10 times."),
            zh = LocalizedContent("一位球员获得个人冠军最多的纪录是多少？", listOf("5", "10", "15", "20"), "体育", "10次个人冠军的纪录由网球运动员拉斐尔·纳达尔保持，他10次赢得法网冠军。"),
            es = LocalizedContent("¿Cuál es el récord de más títulos personales de un jugador?", listOf("5", "10", "15", "20"), "Deportes", "El récord de 10 títulos personales lo ostenta el tenista Rafael Nadal, quien ha ganado el torneo de Roland Garros 10 veces.")
        ),
        BilingualQuestion(
            id = 8500, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique de l'or?", listOf("Au", "Or", "Go", "Ag"), "Science", "Le symbole Au vient du latin \"aurum\", qui signifie \"or\". C'est un métal précieux utilisé en joaillerie et en électronique."),
            en = LocalizedContent("What is the chemical symbol for gold?", listOf("Au", "Or", "Go", "Ag"), "Science", "The symbol Au comes from the Latin \"aurum\", meaning \"gold\". It is a precious metal used in jewelry and electronics."),
            zh = LocalizedContent("金的化学符号是什么？", listOf("Au", "Or", "Go", "Ag"), "科学", "符号Au源自拉丁语\"aurum\"，意为\"金\"。它是一种用于珠宝和电子产品的贵金属。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del oro?", listOf("Au", "Or", "Go", "Ag"), "Ciencia", "El símbolo Au proviene del latín \"aurum\", que significa \"oro\". Es un metal precioso utilizado en joyería y electrónica.")
        ),
        BilingualQuestion(
            id = 8501, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de planètes y a-t-il dans notre système solaire?", listOf("8", "9", "10", "7"), "Science", "En 2006, l'Union astronomique internationale a redéfini le terme \"planète\", rétrogradant Pluton au rang de planète naine, ce qui ramène le nombre officiel à huit."),
            en = LocalizedContent("How many planets are there in our solar system?", listOf("8", "9", "10", "7"), "Science", "In 2006, the International Astronomical Union redefined the term \"planet\", downgrading Pluto to a dwarf planet, bringing the official number to eight."),
            zh = LocalizedContent("我们的太阳系有多少颗行星？", listOf("8", "9", "10", "7"), "科学", "2006年，国际天文学联合会重新定义了\"行星\"一词，将冥王星降级为矮行星，使官方数量变为八颗。"),
            es = LocalizedContent("¿Cuántos planetas hay en nuestro sistema solar?", listOf("8", "9", "10", "7"), "Ciencia", "En 2006, la Unión Astronómica Internacional redefinió el término \"planeta\", degradando a Plutón a planeta enano, lo que reduce el número oficial a ocho.")
        ),
        BilingualQuestion(
            id = 8502, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz les plantes utilisent-elles principalement pour la photosynthèse?", listOf("CO2", "O2", "N2", "H2"), "Science", "Le dioxyde de carbone (CO2) est absorbé par les feuilles via les stomates et, avec l'eau et la lumière, permet la synthèse de glucides lors de la photosynthèse."),
            en = LocalizedContent("Which gas do plants primarily use for photosynthesis?", listOf("CO2", "O2", "N2", "H2"), "Science", "Carbon dioxide (CO2) is absorbed by leaves through stomata and, together with water and light, enables the synthesis of carbohydrates during photosynthesis."),
            zh = LocalizedContent("植物进行光合作用主要使用哪种气体？", listOf("CO2", "O2", "N2", "H2"), "科学", "二氧化碳（CO2）通过气孔被叶片吸收，与水、光一起在光合作用中合成碳水化合物。"),
            es = LocalizedContent("¿Qué gas utilizan principalmente las plantas para la fotosíntesis?", listOf("CO2", "O2", "N2", "H2"), "Ciencia", "El dióxido de carbono (CO2) es absorbido por las hojas a través de los estomas y, junto con el agua y la luz, permite la síntesis de carbohidratos durante la fotosíntesis.")
        ),
        BilingualQuestion(
            id = 8503, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand océan du monde?", listOf("Océan Pacifique", "Océan Atlantique", "Océan Indien", "Océan Arctique"), "Science", "L'océan Pacifique couvre environ 165 millions de kilomètres carrés, soit plus du tiers de la surface terrestre, ce qui en fait le plus vaste et le plus profond des océans."),
            en = LocalizedContent("What is the largest ocean in the world?", listOf("Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"), "Science", "The Pacific Ocean covers about 165 million square kilometers, more than a third of the Earth's surface, making it the largest and deepest ocean."),
            zh = LocalizedContent("世界上最大的海洋是什么？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "科学", "太平洋面积约1.65亿平方公里，占地球表面积的三分之一以上，是最大、最深的海洋。"),
            es = LocalizedContent("¿Cuál es el océano más grande del mundo?", listOf("Océano Pacífico", "Océano Atlántico", "Océano Índico", "Océano Ártico"), "Ciencia", "El océano Pacífico cubre aproximadamente 165 millones de kilómetros cuadrados, más de un tercio de la superficie terrestre, siendo el más grande y profundo.")
        ),
        BilingualQuestion(
            id = 8504, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la vitesse de la lumière?", listOf("300 000 km/s", "150 000 km/s", "500 000 km/s", "100 000 km/s"), "Science", "La vitesse de la lumière dans le vide est d'environ 300 000 kilomètres par seconde, une constante fondamentale de la physique notée c. Cette valeur est utilisée dans la théorie de la relativité d'Einstein et pour définir le mètre."),
            en = LocalizedContent("What is the speed of light?", listOf("300,000 km/s", "150,000 km/s", "500,000 km/s", "100,000 km/s"), "Science", "The speed of light in a vacuum is about 300,000 kilometers per second, a fundamental constant of physics denoted c. This value is used in Einstein's theory of relativity and to define the meter."),
            zh = LocalizedContent("光速是多少？", listOf("30万公里/秒", "15万公里/秒", "50万公里/秒", "10万公里/秒"), "科学", "真空中的光速约为每秒30万公里，是物理学的基本常数，记作c。该值用于爱因斯坦的相对论和定义米。"),
            es = LocalizedContent("¿Cuál es la velocidad de la luz?", listOf("300 000 km/s", "150 000 km/s", "500 000 km/s", "100 000 km/s"), "Ciencia", "La velocidad de la luz en el vacío es de aproximadamente 300 000 kilómetros por segundo, una constante fundamental de la física denotada c. Este valor se utiliza en la teoría de la relatividad de Einstein y para definir el metro.")
        ),
        BilingualQuestion(
            id = 8505, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel élément chimique a pour numéro atomique 1?", listOf("Hydrogène", "Hélium", "Lithium", "Carbone"), "Science", "L'hydrogène est l'élément le plus léger et le plus abondant de l'univers, avec un seul proton dans son noyau, ce qui lui donne le numéro atomique 1."),
            en = LocalizedContent("Which chemical element has atomic number 1?", listOf("Hydrogen", "Helium", "Lithium", "Carbon"), "Science", "Hydrogen is the lightest and most abundant element in the universe, with a single proton in its nucleus, giving it atomic number 1."),
            zh = LocalizedContent("哪种化学元素的原子序数为1？", listOf("氢", "氦", "锂", "碳"), "科学", "氢是宇宙中最轻、最丰富的元素，原子核中只有一个质子，因此原子序数为1。"),
            es = LocalizedContent("¿Qué elemento químico tiene número atómico 1?", listOf("Hidrógeno", "Helio", "Litio", "Carbono"), "Ciencia", "El hidrógeno es el elemento más ligero y abundante del universo, con un solo protón en su núcleo, lo que le otorga el número atómico 1.")
        ),
        BilingualQuestion(
            id = 8506, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de côtés a un hexagone?", listOf("6", "8", "5", "7"), "Science", "Un hexagone est une figure géométrique à six côtés, le préfixe \"hexa-\" venant du grec ancien signifiant six."),
            en = LocalizedContent("How many sides does a hexagon have?", listOf("6", "8", "5", "7"), "Science", "A hexagon is a geometric figure with six sides, the prefix \"hexa-\" coming from ancient Greek meaning six."),
            zh = LocalizedContent("六边形有多少条边？", listOf("6", "8", "5", "7"), "科学", "六边形是有六条边的几何图形，前缀\"hexa-\"源自古希腊语，意为六。"),
            es = LocalizedContent("¿Cuántos lados tiene un hexágono?", listOf("6", "8", "5", "7"), "Ciencia", "Un hexágono es una figura geométrica de seis lados, el prefijo \"hexa-\" proviene del griego antiguo que significa seis.")
        ),
        BilingualQuestion(
            id = 8507, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a formulé la théorie de la relativité?", listOf("Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"), "Science", "Albert Einstein a publié sa théorie de la relativité restreinte en 1905, puis la relativité générale en 1915, révolutionnant la compréhension de l'espace, du temps et de la gravitation."),
            en = LocalizedContent("Which scientist formulated the theory of relativity?", listOf("Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"), "Science", "Albert Einstein published his special theory of relativity in 1905, followed by general relativity in 1915, revolutionizing the understanding of space, time, and gravitation."),
            zh = LocalizedContent("哪位科学家提出了相对论？", listOf("阿尔伯特·爱因斯坦", "艾萨克·牛顿", "伽利略·伽利莱", "斯蒂芬·霍金"), "科学", "阿尔伯特·爱因斯坦于1905年发表了狭义相对论，随后于1915年发表了广义相对论，彻底改变了对空间、时间和引力的理解。"),
            es = LocalizedContent("¿Qué científico formuló la teoría de la relatividad?", listOf("Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"), "Ciencia", "Albert Einstein publicó su teoría de la relatividad especial en 1905, seguida de la relatividad general en 1915, revolucionando la comprensión del espacio, el tiempo y la gravitación.")
        ),
        BilingualQuestion(
            id = 8508, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet du monde?", listOf("Mont Everest", "Mont Kilimandjaro", "Mont Blanc", "K2"), "Science", "L'Everest culmine à 8 849 mètres d'altitude dans l'Himalaya, à la frontière entre le Népal et le Tibet. Il a été nommé d'après le géomètre britannique George Everest."),
            en = LocalizedContent("What is the highest peak in the world?", listOf("Mount Everest", "Mount Kilimanjaro", "Mont Blanc", "K2"), "Science", "Mount Everest rises to 8,849 meters above sea level in the Himalayas, on the border between Nepal and Tibet. It was named after the British surveyor George Everest."),
            zh = LocalizedContent("世界上最高的山峰是什么？", listOf("珠穆朗玛峰", "乞力马扎罗山", "勃朗峰", "K2"), "科学", "珠穆朗玛峰海拔8849米，位于喜马拉雅山脉，尼泊尔与西藏交界处。它以英国测量师乔治·额菲尔士命名。"),
            es = LocalizedContent("¿Cuál es el pico más alto del mundo?", listOf("Monte Everest", "Monte Kilimanjaro", "Mont Blanc", "K2"), "Ciencia", "El Everest se eleva a 8 849 metros sobre el nivel del mar en el Himalaya, en la frontera entre Nepal y el Tíbet. Fue nombrado en honor al topógrafo británico George Everest.")
        ),
        BilingualQuestion(
            id = 8509, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule chimique de l'eau?", listOf("H2O", "CO2", "O2", "H2"), "Science", "La molécule d'eau est composée de deux atomes d'hydrogène et un atome d'oxygène, d'où la formule H2O."),
            en = LocalizedContent("What is the chemical formula for water?", listOf("H2O", "CO2", "O2", "H2"), "Science", "The water molecule is composed of two hydrogen atoms and one oxygen atom, hence the formula H2O."),
            zh = LocalizedContent("水的化学式是什么？", listOf("H2O", "CO2", "O2", "H2"), "科学", "水分子由两个氢原子和一个氧原子组成，因此化学式为H2O。"),
            es = LocalizedContent("¿Cuál es la fórmula química del agua?", listOf("H2O", "CO2", "O2", "H2"), "Ciencia", "La molécula de agua está compuesta por dos átomos de hidrógeno y un átomo de oxígeno, de ahí la fórmula H2O.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8510, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du fer?", listOf("Fe", "Fr", "F", "Fa"), "Science", "Le symbole chimique du fer, Fe, vient du latin \"ferrum\". Il est utilisé dans le tableau périodique des éléments."),
            en = LocalizedContent("What is the chemical symbol for iron?", listOf("Fe", "Fr", "F", "Fa"), "Science", "The chemical symbol for iron, Fe, comes from the Latin \"ferrum\". It is used in the periodic table of elements."),
            zh = LocalizedContent("铁的化学符号是什么？", listOf("Fe", "Fr", "F", "Fa"), "科学", "铁的化学符号 Fe 来自拉丁语 \"ferrum\"。它在元素周期表中使用。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del hierro?", listOf("Fe", "Fr", "F", "Fa"), "Ciencia", "El símbolo químico del hierro, Fe, proviene del latín \"ferrum\". Se utiliza en la tabla periódica de los elementos.")
        ),
        BilingualQuestion(
            id = 8511, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents permanentes a un humain adulte?", listOf("32", "28", "30", "36"), "Science", "Un humain adulte possède 32 dents permanentes, incluant 8 incisives, 4 canines, 8 prémolaires et 12 molaires (dont 4 dents de sagesse)."),
            en = LocalizedContent("How many permanent teeth does an adult human have?", listOf("32", "28", "30", "36"), "Science", "An adult human has 32 permanent teeth, including 8 incisors, 4 canines, 8 premolars, and 12 molars (including 4 wisdom teeth)."),
            zh = LocalizedContent("一个成年人有多少颗恒牙？", listOf("32", "28", "30", "36"), "科学", "一个成年人有32颗恒牙，包括8颗门牙、4颗犬齿、8颗前臼齿和12颗臼齿（包括4颗智齿）。"),
            es = LocalizedContent("¿Cuántos dientes permanentes tiene un humano adulto?", listOf("32", "28", "30", "36"), "Ciencia", "Un humano adulto tiene 32 dientes permanentes, incluyendo 8 incisivos, 4 caninos, 8 premolares y 12 molares (incluyendo 4 muelas del juicio).")
        ),
        BilingualQuestion(
            id = 8512, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand organe du corps humain?", listOf("Peau", "Foie", "Cœur", "Cerveau"), "Science", "La peau est considérée comme le plus grand organe car elle recouvre l'ensemble du corps et représente environ 15 % du poids total d'un adulte."),
            en = LocalizedContent("What is the largest organ in the human body?", listOf("Skin", "Liver", "Heart", "Brain"), "Science", "The skin is considered the largest organ as it covers the entire body and represents about 15% of an adult's total weight."),
            zh = LocalizedContent("人体最大的器官是什么？", listOf("皮肤", "肝脏", "心脏", "大脑"), "科学", "皮肤被认为是最大的器官，因为它覆盖整个身体，约占成年人体重的15%。"),
            es = LocalizedContent("¿Cuál es el órgano más grande del cuerpo humano?", listOf("Piel", "Hígado", "Corazón", "Cerebro"), "Ciencia", "La piel se considera el órgano más grande ya que cubre todo el cuerpo y representa aproximadamente el 15% del peso total de un adulto.")
        ),
        BilingualQuestion(
            id = 8513, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel élément chimique est représenté par le symbole C?", listOf("Carbone", "Calcium", "Cadmium", "Curium"), "Science", "Le symbole chimique C vient du latin carbo, qui signifie charbon, et désigne l'élément carbone, numéro atomique 6, essentiel à la vie."),
            en = LocalizedContent("Which chemical element is represented by the symbol C?", listOf("Carbon", "Calcium", "Cadmium", "Curium"), "Science", "The chemical symbol C comes from the Latin carbo, meaning coal, and denotes the element carbon, atomic number 6, essential for life."),
            zh = LocalizedContent("哪个化学元素用符号C表示？", listOf("碳", "钙", "镉", "锔"), "科学", "化学符号C来自拉丁语carbo，意为煤，表示元素碳，原子序数6，对生命至关重要。"),
            es = LocalizedContent("¿Qué elemento químico está representado por el símbolo C?", listOf("Carbono", "Calcio", "Cadmio", "Curio"), "Ciencia", "El símbolo químico C proviene del latín carbo, que significa carbón, y designa el elemento carbono, número atómico 6, esencial para la vida.")
        ),
        BilingualQuestion(
            id = 8514, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle planète est la plus proche du Soleil?", listOf("Mercure", "Vénus", "Terre", "Mars"), "Science", "Mercure est la planète la plus proche du Soleil, avec une distance moyenne d'environ 58 millions de kilomètres."),
            en = LocalizedContent("Which planet is closest to the Sun?", listOf("Mercury", "Venus", "Earth", "Mars"), "Science", "Mercury is the closest planet to the Sun, with an average distance of about 58 million kilometers."),
            zh = LocalizedContent("哪颗行星离太阳最近？", listOf("水星", "金星", "地球", "火星"), "科学", "水星是离太阳最近的行星，平均距离约为5800万公里。"),
            es = LocalizedContent("¿Qué planeta está más cerca del Sol?", listOf("Mercurio", "Venus", "Tierra", "Marte"), "Ciencia", "Mercurio es el planeta más cercano al Sol, con una distancia media de aproximadamente 58 millones de kilómetros.")
        ),
        BilingualQuestion(
            id = 8515, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique de l'argent?", listOf("Ag", "S", "Si", "Sr"), "Science", "Le symbole Ag vient du latin \"argentum\", qui signifie argent. C'est un métal précieux utilisé depuis l'Antiquité."),
            en = LocalizedContent("What is the chemical symbol for silver?", listOf("Ag", "S", "Si", "Sr"), "Science", "The symbol Ag comes from the Latin \"argentum\", meaning silver. It is a precious metal used since antiquity."),
            zh = LocalizedContent("银的化学符号是什么？", listOf("Ag", "S", "Si", "Sr"), "科学", "符号Ag来自拉丁语\"argentum\"，意为银。它是一种自古就使用的贵金属。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la plata?", listOf("Ag", "S", "Si", "Sr"), "Ciencia", "El símbolo Ag proviene del latín \"argentum\", que significa plata. Es un metal precioso utilizado desde la antigüedad.")
        ),
        BilingualQuestion(
            id = 8516, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de continents y a-t-il?", listOf("7", "6", "5", "8"), "Science", "Le nombre de continents varie selon les modèles géographiques. Le modèle le plus courant en France en compte six : Afrique, Amérique, Antarctique, Asie, Europe et Océanie."),
            en = LocalizedContent("How many continents are there?", listOf("7", "6", "5", "8"), "Science", "The number of continents varies by geographic model. The most common model in France counts six: Africa, America, Antarctica, Asia, Europe, and Oceania."),
            zh = LocalizedContent("有多少个大洲？", listOf("7", "6", "5", "8"), "科学", "大洲的数量因地理模型而异。法国最常见的模型有六个：非洲、美洲、南极洲、亚洲、欧洲和大洋洲。"),
            es = LocalizedContent("¿Cuántos continentes hay?", listOf("7", "6", "5", "8"), "Ciencia", "El número de continentes varía según el modelo geográfico. El modelo más común en Francia cuenta seis: África, América, Antártida, Asia, Europa y Oceanía.")
        ),
        BilingualQuestion(
            id = 8517, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert du monde?", listOf("Antarctique", "Sahara", "Gobi", "Kalahari"), "Science", "L'Antarctique est considéré comme le plus grand désert du monde car il reçoit très peu de précipitations, moins de 50 mm par an en moyenne, ce qui correspond à la définition climatique d'un désert."),
            en = LocalizedContent("What is the largest desert in the world?", listOf("Antarctica", "Sahara", "Gobi", "Kalahari"), "Science", "Antarctica is considered the largest desert in the world because it receives very little precipitation, less than 50 mm per year on average, which meets the climatic definition of a desert."),
            zh = LocalizedContent("世界上最大的沙漠是什么？", listOf("南极洲", "撒哈拉沙漠", "戈壁沙漠", "卡拉哈里沙漠"), "科学", "南极洲被认为是世界上最大的沙漠，因为它降水量极少，平均每年不到50毫米，符合沙漠的气候定义。"),
            es = LocalizedContent("¿Cuál es el desierto más grande del mundo?", listOf("Antártida", "Sáhara", "Gobi", "Kalahari"), "Ciencia", "La Antártida se considera el desierto más grande del mundo porque recibe muy poca precipitación, menos de 50 mm al año en promedio, lo que cumple con la definición climática de desierto.")
        ),
        BilingualQuestion(
            id = 8518, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gaz représente environ 21% de l'atmosphère terrestre?", listOf("Oxygène", "Azote", "Dioxyde de carbone", "Argon"), "Science", "L'oxygène est le deuxième gaz le plus abondant dans l'atmosphère terrestre, constituant environ 21% de son volume, essentiel à la respiration des êtres vivants."),
            en = LocalizedContent("Which gas makes up about 21% of Earth's atmosphere?", listOf("Oxygen", "Nitrogen", "Carbon dioxide", "Argon"), "Science", "Oxygen is the second most abundant gas in Earth's atmosphere, constituting about 21% of its volume, essential for the respiration of living beings."),
            zh = LocalizedContent("哪种气体约占地球大气的21%？", listOf("氧气", "氮气", "二氧化碳", "氩气"), "科学", "氧气是地球大气中第二丰富的气体，约占其体积的21%，对生物的呼吸至关重要。"),
            es = LocalizedContent("¿Qué gas constituye aproximadamente el 21% de la atmósfera terrestre?", listOf("Oxígeno", "Nitrógeno", "Dióxido de carbono", "Argón"), "Ciencia", "El oxígeno es el segundo gas más abundante en la atmósfera terrestre, constituyendo aproximadamente el 21% de su volumen, esencial para la respiración de los seres vivos.")
        ),
        BilingualQuestion(
            id = 8519, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert la pénicilline?", listOf("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Jonas Salk"), "Science", "Alexander Fleming a découvert la pénicilline en 1928 en observant qu'une moisissure, le Penicillium notatum, inhibait la croissance de bactéries."),
            en = LocalizedContent("Which scientist discovered penicillin?", listOf("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Jonas Salk"), "Science", "Alexander Fleming discovered penicillin in 1928 by observing that a mold, Penicillium notatum, inhibited the growth of bacteria."),
            zh = LocalizedContent("哪位科学家发现了青霉素？", listOf("亚历山大·弗莱明", "路易·巴斯德", "玛丽·居里", "乔纳斯·索尔克"), "科学", "亚历山大·弗莱明在1928年发现青霉素，他观察到一种霉菌——青霉菌（Penicillium notatum）抑制了细菌的生长。"),
            es = LocalizedContent("¿Qué científico descubrió la penicilina?", listOf("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Jonas Salk"), "Ciencia", "Alexander Fleming descubrió la penicilina en 1928 al observar que un moho, Penicillium notatum, inhibía el crecimiento de bacterias.")
        ),
        BilingualQuestion(
            id = 8520, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit os du corps humain?", listOf("Étrier", "Marteau", "Enclume", "Radius"), "Science", "L'étrier, situé dans l'oreille moyenne, mesure environ 3 millimètres et transmet les vibrations sonores au vestibule de l'oreille interne."),
            en = LocalizedContent("What is the smallest bone in the human body?", listOf("Stapes", "Malleus", "Incus", "Radius"), "Science", "The stapes, located in the middle ear, measures about 3 millimeters and transmits sound vibrations to the vestibule of the inner ear."),
            zh = LocalizedContent("人体中最小的骨头是什么？", listOf("镫骨", "锤骨", "砧骨", "桡骨"), "科学", "镫骨位于中耳，长约3毫米，将声波振动传递到内耳前庭。"),
            es = LocalizedContent("¿Cuál es el hueso más pequeño del cuerpo humano?", listOf("Estribo", "Martillo", "Yunque", "Radio"), "Ciencia", "El estribo, ubicado en el oído medio, mide aproximadamente 3 milímetros y transmite las vibraciones sonoras al vestíbulo del oído interno.")
        ),
        BilingualQuestion(
            id = 8521, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la température normale du corps humain en Celsius?", listOf("37", "36", "38", "35"), "Science", "La température corporelle normale est maintenue autour de 37°C par l'hypothalamus, qui régule l'équilibre thermique du corps. Cette valeur peut varier légèrement selon l'activité et l'heure de la journée."),
            en = LocalizedContent("What is the normal human body temperature in Celsius?", listOf("37", "36", "38", "35"), "Science", "Normal body temperature is maintained around 37°C by the hypothalamus, which regulates the body's thermal balance. This value may vary slightly depending on activity and time of day."),
            zh = LocalizedContent("人体正常体温是多少摄氏度？", listOf("37", "36", "38", "35"), "科学", "正常体温由下丘脑维持在37°C左右，下丘脑调节身体的热平衡。该值可能因活动和一天中的时间而略有变化。"),
            es = LocalizedContent("¿Cuál es la temperatura normal del cuerpo humano en grados Celsius?", listOf("37", "36", "38", "35"), "Ciencia", "La temperatura corporal normal se mantiene alrededor de 37°C por el hipotálamo, que regula el equilibrio térmico del cuerpo. Este valor puede variar ligeramente según la actividad y la hora del día.")
        ),
        BilingualQuestion(
            id = 8522, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de chromosomes a un humain?", listOf("46", "44", "48", "50"), "Science", "Le génome humain est organisé en 23 paires de chromosomes, soit 46 au total, héritées pour moitié de chaque parent."),
            en = LocalizedContent("How many chromosomes does a human have?", listOf("46", "44", "48", "50"), "Science", "The human genome is organized into 23 pairs of chromosomes, totaling 46, inherited equally from each parent."),
            zh = LocalizedContent("人类有多少条染色体？", listOf("46", "44", "48", "50"), "科学", "人类基因组由23对染色体组成，共46条，分别来自父母双方。"),
            es = LocalizedContent("¿Cuántos cromosomas tiene un ser humano?", listOf("46", "44", "48", "50"), "Ciencia", "El genoma humano está organizado en 23 pares de cromosomas, totalizando 46, heredados por igual de cada progenitor.")
        ),
        BilingualQuestion(
            id = 8523, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du sodium?", listOf("Na", "S", "Ne", "Ni"), "Science", "Le symbole Na vient du latin *natrium*, nom historique du sodium. C’est un métal alcalin très réactif, présent dans le sel de table (NaCl)."),
            en = LocalizedContent("What is the chemical symbol for sodium?", listOf("Na", "S", "Ne", "Ni"), "Science", "The symbol Na comes from the Latin *natrium*, the historical name for sodium. It is a highly reactive alkali metal, present in table salt (NaCl)."),
            zh = LocalizedContent("钠的化学符号是什么？", listOf("Na", "S", "Ne", "Ni"), "科学", "符号Na来自拉丁语*natrium*，是钠的历史名称。它是一种高反应性的碱金属，存在于食盐（NaCl）中。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del sodio?", listOf("Na", "S", "Ne", "Ni"), "Ciencia", "El símbolo Na proviene del latín *natrium*, nombre histórico del sodio. Es un metal alcalino muy reactivo, presente en la sal de mesa (NaCl).")
        ),
        BilingualQuestion(
            id = 8524, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mammifère du monde?", listOf("Baleine bleue", "Éléphant", "Girafe", "Ours polaire"), "Science", "La baleine bleue peut atteindre 30 mètres de long et peser jusqu'à 200 tonnes, ce qui en fait le plus grand animal ayant jamais existé sur Terre."),
            en = LocalizedContent("What is the largest mammal in the world?", listOf("Blue whale", "Elephant", "Giraffe", "Polar bear"), "Science", "The blue whale can reach 30 meters in length and weigh up to 200 tons, making it the largest animal ever to have existed on Earth."),
            zh = LocalizedContent("世界上最大的哺乳动物是什么？", listOf("蓝鲸", "大象", "长颈鹿", "北极熊"), "科学", "蓝鲸体长可达30米，重达200吨，是地球上存在过的最大的动物。"),
            es = LocalizedContent("¿Cuál es el mamífero más grande del mundo?", listOf("Ballena azul", "Elefante", "Jirafa", "Oso polar"), "Ciencia", "La ballena azul puede alcanzar 30 metros de longitud y pesar hasta 200 toneladas, lo que la convierte en el animal más grande que jamás haya existido en la Tierra.")
        ),
        BilingualQuestion(
            id = 8525, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la densité de l'eau en g/cm³?", listOf("1", "2", "0.5", "1.5"), "Science", "La densité de l'eau pure est de 1 g/cm³ à 4°C, température à laquelle elle atteint sa masse volumique maximale. Cette valeur sert de référence pour mesurer la densité des autres substances."),
            en = LocalizedContent("What is the density of water in g/cm³?", listOf("1", "2", "0.5", "1.5"), "Science", "The density of pure water is 1 g/cm³ at 4°C, the temperature at which it reaches its maximum density. This value serves as a reference for measuring the density of other substances."),
            zh = LocalizedContent("水的密度是多少克/立方厘米？", listOf("1", "2", "0.5", "1.5"), "科学", "纯水在4°C时密度为1 g/cm³，此时达到最大密度。该值作为测量其他物质密度的参考。"),
            es = LocalizedContent("¿Cuál es la densidad del agua en g/cm³?", listOf("1", "2", "0.5", "1.5"), "Ciencia", "La densidad del agua pura es de 1 g/cm³ a 4°C, temperatura a la que alcanza su máxima densidad. Este valor sirve como referencia para medir la densidad de otras sustancias.")
        ),
        BilingualQuestion(
            id = 8526, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique est un gaz noble?", listOf("Néon", "Hydrogène", "Oxygène", "Azote"), "Science", "Le néon fait partie de la famille des gaz nobles, qui sont des éléments chimiques très stables et peu réactifs, situés dans la dernière colonne du tableau périodique."),
            en = LocalizedContent("Which chemical element is a noble gas?", listOf("Neon", "Hydrogen", "Oxygen", "Nitrogen"), "Science", "Neon belongs to the noble gas family, which are very stable and unreactive chemical elements located in the last column of the periodic table."),
            zh = LocalizedContent("哪种化学元素是稀有气体？", listOf("氖", "氢", "氧", "氮"), "科学", "氖属于稀有气体家族，这些元素非常稳定且不易反应，位于元素周期表的最后一列。"),
            es = LocalizedContent("¿Qué elemento químico es un gas noble?", listOf("Neón", "Hidrógeno", "Oxígeno", "Nitrógeno"), "Ciencia", "El neón pertenece a la familia de los gases nobles, que son elementos químicos muy estables y poco reactivos, ubicados en la última columna de la tabla periódica.")
        ),
        BilingualQuestion(
            id = 8527, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de minutes a une heure?", listOf("60", "100", "50", "70"), "Science", "Une heure est divisée en 60 minutes selon le système sexagésimal hérité des Babyloniens."),
            en = LocalizedContent("How many minutes are in an hour?", listOf("60", "100", "50", "70"), "Science", "An hour is divided into 60 minutes according to the sexagesimal system inherited from the Babylonians."),
            zh = LocalizedContent("一小时有多少分钟？", listOf("60", "100", "50", "70"), "科学", "一小时分为60分钟，这是继承自巴比伦人的六十进制系统。"),
            es = LocalizedContent("¿Cuántos minutos tiene una hora?", listOf("60", "100", "50", "70"), "Ciencia", "Una hora se divide en 60 minutos según el sistema sexagesimal heredado de los babilonios.")
        ),
        BilingualQuestion(
            id = 8528, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus rapide animal terrestre?", listOf("Guépard", "Lion", "Antilope", "Gazelle"), "Science", "Le guépard peut atteindre 110 km/h en pointe sur de courtes distances, ce qui en fait le mammifère terrestre le plus rapide du monde."),
            en = LocalizedContent("What is the fastest land animal?", listOf("Cheetah", "Lion", "Antelope", "Gazelle"), "Science", "The cheetah can reach 110 km/h in short bursts, making it the fastest land mammal in the world."),
            zh = LocalizedContent("最快的陆地动物是什么？", listOf("猎豹", "狮子", "羚羊", "瞪羚"), "科学", "猎豹在短距离冲刺中可达110公里/小时，是世界上跑得最快的陆地哺乳动物。"),
            es = LocalizedContent("¿Cuál es el animal terrestre más rápido?", listOf("Guepardo", "León", "Antílope", "Gacela"), "Ciencia", "El guepardo puede alcanzar 110 km/h en ráfagas cortas, lo que lo convierte en el mamífero terrestre más rápido del mundo.")
        ),
        BilingualQuestion(
            id = 8529, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule chimique du dioxyde de carbone?", listOf("CO2", "C2O", "CO", "C2O2"), "Science", "Le dioxyde de carbone est composé d'un atome de carbone lié à deux atomes d'oxygène, d'où la formule CO2."),
            en = LocalizedContent("What is the chemical formula of carbon dioxide?", listOf("CO2", "C2O", "CO", "C2O2"), "Science", "Carbon dioxide is composed of one carbon atom bonded to two oxygen atoms, hence the formula CO2."),
            zh = LocalizedContent("二氧化碳的化学式是什么？", listOf("CO2", "C2O", "CO", "C2O2"), "科学", "二氧化碳由一个碳原子与两个氧原子结合而成，因此化学式为CO2。"),
            es = LocalizedContent("¿Cuál es la fórmula química del dióxido de carbono?", listOf("CO2", "C2O", "CO", "C2O2"), "Ciencia", "El dióxido de carbono está compuesto por un átomo de carbono unido a dos átomos de oxígeno, de ahí la fórmula CO2.")
        ),
        BilingualQuestion(
            id = 8530, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert la radioactivité?", listOf("Marie Curie", "Pierre Curie", "Ernest Rutherford", "Niels Bohr"), "Science", "Marie Curie a découvert la radioactivité en 1896, en étudiant les rayons uraniques émis par l'uranium, ce qui lui a valu deux prix Nobel."),
            en = LocalizedContent("Which scientist discovered radioactivity?", listOf("Marie Curie", "Pierre Curie", "Ernest Rutherford", "Niels Bohr"), "Science", "Marie Curie discovered radioactivity in 1896 while studying uranium rays, which earned her two Nobel Prizes."),
            zh = LocalizedContent("哪位科学家发现了放射性？", listOf("玛丽·居里", "皮埃尔·居里", "欧内斯特·卢瑟福", "尼尔斯·玻尔"), "科学", "玛丽·居里在1896年研究铀射线时发现了放射性，这为她赢得了两次诺贝尔奖。"),
            es = LocalizedContent("¿Qué científico descubrió la radiactividad?", listOf("Marie Curie", "Pierre Curie", "Ernest Rutherford", "Niels Bohr"), "Ciencia", "Marie Curie descubrió la radiactividad en 1896 al estudiar los rayos de uranio, lo que le valió dos premios Nobel.")
        ),
        BilingualQuestion(
            id = 8531, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes a une araignée?", listOf("8", "6", "10", "4"), "Science", "Les araignées appartiennent à la classe des arachnides, qui se distinguent des insectes par leurs huit pattes, contre six pour ces derniers."),
            en = LocalizedContent("How many legs does a spider have?", listOf("8", "6", "10", "4"), "Science", "Spiders belong to the class Arachnida, which are distinguished from insects by having eight legs, while insects have six."),
            zh = LocalizedContent("蜘蛛有几条腿？", listOf("8", "6", "10", "4"), "科学", "蜘蛛属于蛛形纲，与昆虫的区别在于有八条腿，而昆虫有六条。"),
            es = LocalizedContent("¿Cuántas patas tiene una araña?", listOf("8", "6", "10", "4"), "Ciencia", "Las arañas pertenecen a la clase Arácnidos, que se distinguen de los insectos por tener ocho patas, mientras que estos tienen seis.")
        ),
        BilingualQuestion(
            id = 8532, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du chlore?", listOf("Cl", "C", "Ca", "Co"), "Science", "Le symbole Cl vient du latin \"chlorum\", dérivé du grec \"chloros\" signifiant vert pâle, en référence à la couleur du gaz. C'est un halogène très réactif."),
            en = LocalizedContent("What is the chemical symbol for chlorine?", listOf("Cl", "C", "Ca", "Co"), "Science", "The symbol Cl comes from Latin 'chlorum', derived from Greek 'chloros' meaning pale green, referring to the color of the gas. It is a highly reactive halogen."),
            zh = LocalizedContent("氯的化学符号是什么？", listOf("Cl", "C", "Ca", "Co"), "科学", "符号Cl来自拉丁语'chlorum'，源于希腊语'chloros'，意为浅绿色，指气体的颜色。它是一种高反应性的卤素。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cloro?", listOf("Cl", "C", "Ca", "Co"), "Ciencia", "El símbolo Cl proviene del latín 'chlorum', derivado del griego 'chloros' que significa verde pálido, en referencia al color del gas. Es un halógeno muy reactivo.")
        ),
        BilingualQuestion(
            id = 8533, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la plus grande forêt du monde?", listOf("Forêt amazonienne", "Taïga", "Forêt du Congo", "Forêt tropicale de Bornéo"), "Science", "L'Amazonie s'étend sur environ 5,5 millions de km², principalement au Brésil, et dépasse largement la taïga sibérienne en superficie de forêt tropicale continue."),
            en = LocalizedContent("What is the largest forest in the world?", listOf("Amazon rainforest", "Taiga", "Congo rainforest", "Borneo tropical forest"), "Science", "The Amazon spans about 5.5 million km², mainly in Brazil, and far exceeds the Siberian taiga in continuous tropical forest area."),
            zh = LocalizedContent("世界上最大的森林是什么？", listOf("亚马逊雨林", "泰加林", "刚果雨林", "婆罗洲热带雨林"), "科学", "亚马逊雨林面积约550万平方公里，主要位于巴西，在连续热带雨林面积上远超西伯利亚泰加林。"),
            es = LocalizedContent("¿Cuál es el bosque más grande del mundo?", listOf("Selva amazónica", "Taiga", "Selva del Congo", "Bosque tropical de Borneo"), "Ciencia", "La Amazonía se extiende por unos 5,5 millones de km², principalmente en Brasil, y supera ampliamente a la taiga siberiana en superficie de bosque tropical continuo.")
        ),
        BilingualQuestion(
            id = 8534, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut type de nuage?", listOf("Cirrus", "Cumulus", "Stratus", "Altocumulus"), "Science", "Les cirrus sont des nuages élevés, formés de cristaux de glace, situés au-dessus de 6 000 mètres d'altitude. Ils sont les plus hauts dans la classification des nuages."),
            en = LocalizedContent("What is the highest type of cloud?", listOf("Cirrus", "Cumulus", "Stratus", "Altocumulus"), "Science", "Cirrus clouds are high clouds, composed of ice crystals, located above 6,000 meters altitude. They are the highest in cloud classification."),
            zh = LocalizedContent("最高的云类型是什么？", listOf("卷云", "积云", "层云", "高积云"), "科学", "卷云是高云，由冰晶组成，位于海拔6000米以上。它们在云分类中最高。"),
            es = LocalizedContent("¿Cuál es el tipo de nube más alto?", listOf("Cirros", "Cúmulos", "Estratos", "Altocúmulos"), "Ciencia", "Los cirros son nubes altas, formadas por cristales de hielo, situadas por encima de los 6.000 metros de altitud. Son las más altas en la clasificación de nubes.")
        ),
        BilingualQuestion(
            id = 8535, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de secondes a une minute?", listOf("60", "100", "50", "70"), "Science", "La minute est une unité de temps standard qui, par définition, contient 60 secondes, conformément au système sexagésimal hérité des Babyloniens."),
            en = LocalizedContent("How many seconds are in a minute?", listOf("60", "100", "50", "70"), "Science", "The minute is a standard unit of time that, by definition, contains 60 seconds, according to the sexagesimal system inherited from the Babylonians."),
            zh = LocalizedContent("一分钟有多少秒？", listOf("60", "100", "50", "70"), "科学", "分钟是标准时间单位，根据从巴比伦人继承的六十进制系统，定义为一分钟包含60秒。"),
            es = LocalizedContent("¿Cuántos segundos tiene un minuto?", listOf("60", "100", "50", "70"), "Ciencia", "El minuto es una unidad de tiempo estándar que, por definición, contiene 60 segundos, de acuerdo con el sistema sexagesimal heredado de los babilonios.")
        ),
        BilingualQuestion(
            id = 8536, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du cuivre?", listOf("Cu", "Co", "Cr", "C"), "Science", "Le symbole Cu vient du latin cuprum, qui désignait le cuivre extrait de l'île de Chypre dans l'Antiquité."),
            en = LocalizedContent("What is the chemical symbol for copper?", listOf("Cu", "Co", "Cr", "C"), "Science", "The symbol Cu comes from Latin cuprum, which referred to copper extracted from the island of Cyprus in antiquity."),
            zh = LocalizedContent("铜的化学符号是什么？", listOf("Cu", "Co", "Cr", "C"), "科学", "符号Cu来自拉丁语cuprum，指古代从塞浦路斯岛开采的铜。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cobre?", listOf("Cu", "Co", "Cr", "C"), "Ciencia", "El símbolo Cu proviene del latín cuprum, que designaba el cobre extraído de la isla de Chipre en la antigüedad.")
        ),
        BilingualQuestion(
            id = 8537, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est l'unité de mesure de la force?", listOf("Newton", "Joule", "Pascal", "Watt"), "Science", "Le newton est l'unité dérivée du Système international qui quantifie la force, nommée en hommage à Isaac Newton pour ses travaux sur la mécanique classique."),
            en = LocalizedContent("What is the unit of measurement for force?", listOf("Newton", "Joule", "Pascal", "Watt"), "Science", "The newton is the derived unit of the International System that quantifies force, named in honor of Isaac Newton for his work on classical mechanics."),
            zh = LocalizedContent("力的测量单位是什么？", listOf("牛顿", "焦耳", "帕斯卡", "瓦特"), "科学", "牛顿是国际单位制中力的导出单位，以艾萨克·牛顿命名，以纪念他在经典力学方面的贡献。"),
            es = LocalizedContent("¿Cuál es la unidad de medida de la fuerza?", listOf("Newton", "Joule", "Pascal", "Watt"), "Ciencia", "El newton es la unidad derivada del Sistema Internacional que cuantifica la fuerza, nombrada en honor a Isaac Newton por sus trabajos sobre mecánica clásica.")
        ),
        BilingualQuestion(
            id = 8538, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve du monde?", listOf("Nil", "Amazone", "Yangtsé", "Mississipi"), "Science", "L'Amazone est le plus grand fleuve du monde en volume d'eau déversé, avec un débit moyen d'environ 209 000 m³/s, bien supérieur à celui du Nil."),
            en = LocalizedContent("What is the largest river in the world?", listOf("Nile", "Amazon", "Yangtze", "Mississippi"), "Science", "The Amazon is the largest river in the world by water volume discharged, with an average flow of about 209,000 m³/s, far exceeding the Nile."),
            zh = LocalizedContent("世界上最大的河流是什么？", listOf("尼罗河", "亚马逊河", "长江", "密西西比河"), "科学", "亚马逊河是世界上最长的河流，按排水量计算，平均流量约为每秒209,000立方米，远超尼罗河。"),
            es = LocalizedContent("¿Cuál es el río más grande del mundo?", listOf("Nilo", "Amazonas", "Yangtsé", "Misisipi"), "Ciencia", "El Amazonas es el río más grande del mundo en volumen de agua descargado, con un caudal medio de unos 209.000 m³/s, muy superior al del Nilo.")
        ),
        BilingualQuestion(
            id = 8539, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz est produit par la photosynthèse?", listOf("Oxygène", "Dioxyde de carbone", "Azote", "Hydrogène"), "Science", "La photosynthèse utilise le dioxyde de carbone et l'eau, avec l'énergie solaire, pour produire du glucose et libérer de l'oxygène comme sous-produit."),
            en = LocalizedContent("Which gas is produced by photosynthesis?", listOf("Oxygen", "Carbon dioxide", "Nitrogen", "Hydrogen"), "Science", "Photosynthesis uses carbon dioxide and water, with solar energy, to produce glucose and release oxygen as a byproduct."),
            zh = LocalizedContent("光合作用产生哪种气体？", listOf("氧气", "二氧化碳", "氮气", "氢气"), "科学", "光合作用利用二氧化碳和水，在太阳能的作用下，产生葡萄糖并释放氧气作为副产品。"),
            es = LocalizedContent("¿Qué gas se produce en la fotosíntesis?", listOf("Oxígeno", "Dióxido de carbono", "Nitrógeno", "Hidrógeno"), "Ciencia", "La fotosíntesis utiliza dióxido de carbono y agua, con energía solar, para producir glucosa y liberar oxígeno como subproducto.")
        ),
        BilingualQuestion(
            id = 8540, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le point de fusion de la glace en Celsius?", listOf("0", "-10", "10", "-5"), "Science", "Sous pression atmosphérique normale, la glace fond à 0 degré Celsius, ce qui correspond au point de congélation de l'eau pure."),
            en = LocalizedContent("What is the melting point of ice in Celsius?", listOf("0", "-10", "10", "-5"), "Science", "Under normal atmospheric pressure, ice melts at 0 degrees Celsius, which is the freezing point of pure water."),
            zh = LocalizedContent("冰的熔点是摄氏多少度？", listOf("0", "-10", "10", "-5"), "科学", "在标准大气压下，冰在0摄氏度融化，这也是纯水的冰点。"),
            es = LocalizedContent("¿Cuál es el punto de fusión del hielo en Celsius?", listOf("0", "-10", "10", "-5"), "Ciencia", "Bajo presión atmosférica normal, el hielo se funde a 0 grados Celsius, que es el punto de congelación del agua pura.")
        ),
        BilingualQuestion(
            id = 8541, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a formulé les lois du mouvement?", listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"), "Science", "Isaac Newton a publié ses trois lois du mouvement dans son ouvrage \"Philosophiæ Naturalis Principia Mathematica\" en 1687, posant les bases de la mécanique classique."),
            en = LocalizedContent("Which scientist formulated the laws of motion?", listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"), "Science", "Isaac Newton published his three laws of motion in his work \"Philosophiæ Naturalis Principia Mathematica\" in 1687, laying the foundations of classical mechanics."),
            zh = LocalizedContent("哪位科学家提出了运动定律？", listOf("艾萨克·牛顿", "阿尔伯特·爱因斯坦", "伽利略·伽利莱", "约翰内斯·开普勒"), "科学", "艾萨克·牛顿于1687年在其著作《自然哲学的数学原理》中发表了三大运动定律，奠定了经典力学的基础。"),
            es = LocalizedContent("¿Qué científico formuló las leyes del movimiento?", listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"), "Ciencia", "Isaac Newton publicó sus tres leyes del movimiento en su obra \"Philosophiæ Naturalis Principia Mathematica\" en 1687, sentando las bases de la mecánica clásica.")
        ),
        BilingualQuestion(
            id = 8542, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de lobes a le cerveau humain?", listOf("2", "4", "3", "5"), "Science", "Le cerveau humain est divisé en deux hémisphères, gauche et droit, chacun contrôlant des fonctions spécifiques."),
            en = LocalizedContent("How many lobes does the human brain have?", listOf("2", "4", "3", "5"), "Science", "The human brain is divided into two hemispheres, left and right, each controlling specific functions."),
            zh = LocalizedContent("人脑有多少个叶？", listOf("2", "4", "3", "5"), "科学", "人脑分为左右两个半球，每个半球控制特定的功能。"),
            es = LocalizedContent("¿Cuántos lóbulos tiene el cerebro humano?", listOf("2", "4", "3", "5"), "Ciencia", "El cerebro humano se divide en dos hemisferios, izquierdo y derecho, cada uno controlando funciones específicas.")
        ),
        BilingualQuestion(
            id = 8543, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du potassium?", listOf("K", "P", "Ka", "Ki"), "Science", "Le symbole chimique du potassium vient du latin \"kalium\", d'où la lettre K."),
            en = LocalizedContent("What is the chemical symbol for potassium?", listOf("K", "P", "Ka", "Ki"), "Science", "The chemical symbol for potassium comes from the Latin \"kalium\", hence the letter K."),
            zh = LocalizedContent("钾的化学符号是什么？", listOf("K", "P", "Ka", "Ki"), "科学", "钾的化学符号源自拉丁语“kalium”，因此用字母K表示。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del potasio?", listOf("K", "P", "Ka", "Ki"), "Ciencia", "El símbolo químico del potasio proviene del latín \"kalium\", de ahí la letra K.")
        ),
        BilingualQuestion(
            id = 8544, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la distance moyenne Terre-Soleil?", listOf("150 millions km", "100 millions km", "200 millions km", "75 millions km"), "Science", "Cette distance, appelée unité astronomique (UA), sert de référence pour mesurer les distances dans le système solaire. Elle correspond à environ 150 millions de kilomètres."),
            en = LocalizedContent("What is the average Earth-Sun distance?", listOf("150 million km", "100 million km", "200 million km", "75 million km"), "Science", "This distance, called the astronomical unit (AU), serves as a reference for measuring distances in the solar system. It corresponds to about 150 million kilometers."),
            zh = LocalizedContent("地球到太阳的平均距离是多少？", listOf("1.5亿公里", "1亿公里", "2亿公里", "7500万公里"), "科学", "这个距离称为天文单位（AU），用作测量太阳系内距离的参考，约为1.5亿公里。"),
            es = LocalizedContent("¿Cuál es la distancia media Tierra-Sol?", listOf("150 millones km", "100 millones km", "200 millones km", "75 millones km"), "Ciencia", "Esta distancia, llamada unidad astronómica (UA), sirve como referencia para medir distancias en el sistema solar. Corresponde a unos 150 millones de kilómetros.")
        ),
        BilingualQuestion(
            id = 8545, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac du monde?", listOf("Lac Caspienne", "Lac Supérieur", "Lac Victoria", "Lac Baïkal"), "Science", "Le lac Caspienne est considéré comme le plus grand lac du monde en superficie, avec environ 371 000 km², bien qu'il soit salé et souvent qualifié de mer en raison de sa taille."),
            en = LocalizedContent("What is the largest lake in the world?", listOf("Caspian Sea", "Lake Superior", "Lake Victoria", "Lake Baikal"), "Science", "The Caspian Sea is considered the largest lake in the world by area, with about 371,000 km², although it is saline and often called a sea due to its size."),
            zh = LocalizedContent("世界上最大的湖泊是什么？", listOf("里海", "苏必利尔湖", "维多利亚湖", "贝加尔湖"), "科学", "里海被认为是世界上面积最大的湖泊，约37.1万平方公里，尽管它是咸水湖且常因其规模被称为海。"),
            es = LocalizedContent("¿Cuál es el lago más grande del mundo?", listOf("Mar Caspio", "Lago Superior", "Lago Victoria", "Lago Baikal"), "Ciencia", "El Mar Caspio es considerado el lago más grande del mundo por superficie, con unos 371.000 km², aunque es salado y a menudo llamado mar debido a su tamaño.")
        ),
        BilingualQuestion(
            id = 8546, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du magnésium?", listOf("Mg", "Mn", "Mo", "Mt"), "Science", "Le symbole Mg vient du latin \"magnesium\", dérivé de la région grecque de Magnésie où ce minéral était extrait."),
            en = LocalizedContent("What is the chemical symbol for magnesium?", listOf("Mg", "Mn", "Mo", "Mt"), "Science", "The symbol Mg comes from the Latin \"magnesium\", derived from the Greek region of Magnesia where this mineral was extracted."),
            zh = LocalizedContent("镁的化学符号是什么？", listOf("Mg", "Mn", "Mo", "Mt"), "科学", "符号Mg源自拉丁语“magnesium”，来源于希腊的Magnesia地区，该地区曾开采这种矿物。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del magnesio?", listOf("Mg", "Mn", "Mo", "Mt"), "Ciencia", "El símbolo Mg proviene del latín \"magnesium\", derivado de la región griega de Magnesia donde se extraía este mineral.")
        ),
        BilingualQuestion(
            id = 8547, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la vitesse du son dans l'air?", listOf("343 m/s", "500 m/s", "200 m/s", "450 m/s"), "Science", "La vitesse du son dans l'air à 20°C au niveau de la mer est d'environ 343 mètres par seconde, car elle dépend de la température et de la densité du milieu."),
            en = LocalizedContent("What is the speed of sound in air?", listOf("343 m/s", "500 m/s", "200 m/s", "450 m/s"), "Science", "The speed of sound in air at 20°C at sea level is about 343 meters per second, as it depends on temperature and density of the medium."),
            zh = LocalizedContent("声音在空气中的速度是多少？", listOf("343米/秒", "500米/秒", "200米/秒", "450米/秒"), "科学", "在20°C的海平面空气中，声速约为343米/秒，这取决于介质的温度和密度。"),
            es = LocalizedContent("¿Cuál es la velocidad del sonido en el aire?", listOf("343 m/s", "500 m/s", "200 m/s", "450 m/s"), "Ciencia", "La velocidad del sonido en el aire a 20°C al nivel del mar es de aproximadamente 343 metros por segundo, ya que depende de la temperatura y la densidad del medio.")
        ),
        BilingualQuestion(
            id = 8548, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de muscles a le corps humain?", listOf("640", "500", "700", "800"), "Science", "Le corps humain compte environ 640 muscles squelettiques, responsables des mouvements volontaires, bien que ce nombre varie légèrement selon les individus."),
            en = LocalizedContent("How many muscles does the human body have?", listOf("640", "500", "700", "800"), "Science", "The human body has about 640 skeletal muscles, responsible for voluntary movements, though this number varies slightly among individuals."),
            zh = LocalizedContent("人体有多少块肌肉？", listOf("640", "500", "700", "800"), "科学", "人体约有640块骨骼肌，负责随意运动，但这个数字因人而异。"),
            es = LocalizedContent("¿Cuántos músculos tiene el cuerpo humano?", listOf("640", "500", "700", "800"), "Ciencia", "El cuerpo humano tiene aproximadamente 640 músculos esqueléticos, responsables de los movimientos voluntarios, aunque este número varía ligeramente entre individuos.")
        ),
        BilingualQuestion(
            id = 8549, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est un halogène?", listOf("Fluor", "Néon", "Hélium", "Argon"), "Science", "Le fluor fait partie de la famille des halogènes, qui comprend également le chlore, le brome, l'iode et l'astate, tous situés dans le groupe 17 du tableau périodique."),
            en = LocalizedContent("Which chemical element is a halogen?", listOf("Fluorine", "Neon", "Helium", "Argon"), "Science", "Fluorine belongs to the halogen family, which also includes chlorine, bromine, iodine, and astatine, all located in group 17 of the periodic table."),
            zh = LocalizedContent("哪种化学元素是卤素？", listOf("氟", "氖", "氦", "氩"), "科学", "氟属于卤素家族，还包括氯、溴、碘和砹，它们都位于元素周期表的第17族。"),
            es = LocalizedContent("¿Qué elemento químico es un halógeno?", listOf("Flúor", "Neón", "Helio", "Argón"), "Ciencia", "El flúor pertenece a la familia de los halógenos, que también incluye cloro, bromo, yodo y astato, todos ubicados en el grupo 17 de la tabla periódica.")
        ),
        BilingualQuestion(
            id = 8550, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le point d'ébullition de l'eau au niveau de la mer?", listOf("100°C", "90°C", "110°C", "95°C"), "Science", "Au niveau de la mer, la pression atmosphérique standard est de 1 atmosphère, ce qui porte l'eau à ébullition à 100°C. Cette température diminue en altitude car la pression baisse."),
            en = LocalizedContent("What is the boiling point of water at sea level?", listOf("100°C", "90°C", "110°C", "95°C"), "Science", "At sea level, standard atmospheric pressure is 1 atmosphere, causing water to boil at 100°C. This temperature decreases at higher altitudes due to lower pressure."),
            zh = LocalizedContent("海平面水的沸点是多少？", listOf("100°C", "90°C", "110°C", "95°C"), "科学", "在海平面，标准大气压为1个大气压，使水在100°C沸腾。海拔升高时，气压降低，沸点随之下降。"),
            es = LocalizedContent("¿Cuál es el punto de ebullición del agua a nivel del mar?", listOf("100°C", "90°C", "110°C", "95°C"), "Ciencia", "A nivel del mar, la presión atmosférica estándar es de 1 atmósfera, lo que hace que el agua hierva a 100°C. Esta temperatura disminuye en altitud debido a la menor presión.")
        ),
        BilingualQuestion(
            id = 8551, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert les lois de l'hérédité?", listOf("Gregor Mendel", "Charles Darwin", "Jean-Baptiste Lamarck", "August Weismann"), "Science", "Gregor Mendel, moine et botaniste autrichien du XIXe siècle, a établi les principes fondamentaux de la génétique en étudiant les pois. Ses travaux, publiés en 1866, ont posé les bases des lois de l'hérédité."),
            en = LocalizedContent("Which scientist discovered the laws of heredity?", listOf("Gregor Mendel", "Charles Darwin", "Jean-Baptiste Lamarck", "August Weismann"), "Science", "Gregor Mendel, an Austrian monk and botanist of the 19th century, established the fundamental principles of genetics by studying peas. His work, published in 1866, laid the foundation for the laws of heredity."),
            zh = LocalizedContent("哪位科学家发现了遗传定律？", listOf("格雷戈尔·孟德尔", "查尔斯·达尔文", "让-巴蒂斯特·拉马克", "奥古斯特·魏斯曼"), "科学", "格雷戈尔·孟德尔，19世纪的奥地利修士和植物学家，通过研究豌豆确立了遗传学的基本原理。他的著作发表于1866年，为遗传定律奠定了基础。"),
            es = LocalizedContent("¿Qué científico descubrió las leyes de la herencia?", listOf("Gregor Mendel", "Charles Darwin", "Jean-Baptiste Lamarck", "August Weismann"), "Ciencia", "Gregor Mendel, monje y botánico austriaco del siglo XIX, estableció los principios fundamentales de la genética al estudiar guisantes. Su trabajo, publicado en 1866, sentó las bases de las leyes de la herencia.")
        ),
        BilingualQuestion(
            id = 8552, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand océan par volume?", listOf("Océan Pacifique", "Océan Atlantique", "Océan Indien", "Océan Arctique"), "Science", "L'océan Pacifique est le plus grand océan par volume en raison de sa superficie immense et de sa profondeur moyenne élevée, notamment avec la fosse des Mariannes. Il contient plus de la moitié de l'eau libre de la Terre."),
            en = LocalizedContent("Which is the largest ocean by volume?", listOf("Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"), "Science", "The Pacific Ocean is the largest ocean by volume due to its immense surface area and high average depth, including the Mariana Trench. It contains more than half of Earth's free water."),
            zh = LocalizedContent("按体积计算最大的海洋是哪个？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "科学", "太平洋因其巨大的表面积和较高的平均深度（包括马里亚纳海沟）而成为体积最大的海洋。它含有地球一半以上的自由水。"),
            es = LocalizedContent("¿Cuál es el océano más grande por volumen?", listOf("Océano Pacífico", "Océano Atlántico", "Océano Índico", "Océano Ártico"), "Ciencia", "El océano Pacífico es el más grande por volumen debido a su inmensa superficie y su alta profundidad media, incluida la fosa de las Marianas. Contiene más de la mitad del agua libre de la Tierra.")
        ),
        BilingualQuestion(
            id = 8553, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces de fourmis existe-t-il environ?", listOf("20000", "10000", "5000", "50000"), "Science", "On estime qu'il existe environ 20 000 espèces de fourmis dans le monde, bien que ce nombre puisse varier selon les découvertes scientifiques récentes."),
            en = LocalizedContent("How many species of ants are there approximately?", listOf("20000", "10000", "5000", "50000"), "Science", "It is estimated that there are about 20,000 species of ants worldwide, though this number may vary with recent scientific discoveries."),
            zh = LocalizedContent("大约有多少种蚂蚁？", listOf("20000", "10000", "5000", "50000"), "科学", "据估计，全世界约有20,000种蚂蚁，尽管这个数字可能因最新的科学发现而有所变化。"),
            es = LocalizedContent("¿Cuántas especies de hormigas existen aproximadamente?", listOf("20000", "10000", "5000", "50000"), "Ciencia", "Se estima que existen alrededor de 20,000 especies de hormigas en el mundo, aunque este número puede variar según los descubrimientos científicos recientes.")
        ),
        BilingualQuestion(
            id = 8554, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du calcium?", listOf("Ca", "C", "Cd", "Co"), "Science", "Le symbole chimique du calcium, Ca, vient du latin \"calx\" signifiant chaux. C'est un métal alcalino-terreux essentiel pour les organismes vivants."),
            en = LocalizedContent("What is the chemical symbol for calcium?", listOf("Ca", "C", "Cd", "Co"), "Science", "The chemical symbol for calcium, Ca, comes from the Latin 'calx' meaning lime. It is an alkaline earth metal essential for living organisms."),
            zh = LocalizedContent("钙的化学符号是什么？", listOf("Ca", "C", "Cd", "Co"), "科学", "钙的化学符号Ca源自拉丁语'calx'，意为石灰。它是一种对生物体至关重要的碱土金属。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del calcio?", listOf("Ca", "C", "Cd", "Co"), "Ciencia", "El símbolo químico del calcio, Ca, proviene del latín 'calx' que significa cal. Es un metal alcalinotérreo esencial para los organismos vivos.")
        ),
        BilingualQuestion(
            id = 8555, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la masse atomique du carbone?", listOf("12", "14", "10", "16"), "Science", "Le carbone a un isotope majoritaire, le carbone 12, dont la masse atomique est définie comme exactement 12 unités de masse atomique."),
            en = LocalizedContent("What is the atomic mass of carbon?", listOf("12", "14", "10", "16"), "Science", "Carbon has a major isotope, carbon-12, whose atomic mass is defined as exactly 12 atomic mass units."),
            zh = LocalizedContent("碳的原子质量是多少？", listOf("12", "14", "10", "16"), "科学", "碳的主要同位素是碳-12，其原子质量被定义为恰好12个原子质量单位。"),
            es = LocalizedContent("¿Cuál es la masa atómica del carbono?", listOf("12", "14", "10", "16"), "Ciencia", "El carbono tiene un isótopo mayoritario, el carbono-12, cuya masa atómica se define como exactamente 12 unidades de masa atómica.")
        ),
        BilingualQuestion(
            id = 8556, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a théorisé l'évolution?", listOf("Charles Darwin", "Jean-Baptiste Lamarck", "Gregor Mendel", "Alfred Russel Wallace"), "Science", "Charles Darwin a publié en 1859 \"L'Origine des espèces\", posant les bases de la théorie de l'évolution par sélection naturelle."),
            en = LocalizedContent("Which scientist theorized evolution?", listOf("Charles Darwin", "Jean-Baptiste Lamarck", "Gregor Mendel", "Alfred Russel Wallace"), "Science", "Charles Darwin published 'On the Origin of Species' in 1859, laying the foundation for the theory of evolution by natural selection."),
            zh = LocalizedContent("哪位科学家提出了进化论？", listOf("查尔斯·达尔文", "让-巴蒂斯特·拉马克", "格雷戈尔·孟德尔", "阿尔弗雷德·拉塞尔·华莱士"), "科学", "查尔斯·达尔文于1859年出版了《物种起源》，为自然选择进化论奠定了基础。"),
            es = LocalizedContent("¿Qué científico teorizó la evolución?", listOf("Charles Darwin", "Jean-Baptiste Lamarck", "Gregor Mendel", "Alfred Russel Wallace"), "Ciencia", "Charles Darwin publicó 'El origen de las especies' en 1859, sentando las bases de la teoría de la evolución por selección natural.")
        ),
        BilingualQuestion(
            id = 8557, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de nerfs crâniens a un humain?", listOf("12", "10", "14", "8"), "Science", "Les humains possèdent 12 paires de nerfs crâniens, qui émergent directement du cerveau et du tronc cérébral pour innerver la tête, le cou et certaines fonctions viscérales."),
            en = LocalizedContent("How many cranial nerves does a human have?", listOf("12", "10", "14", "8"), "Science", "Humans have 12 pairs of cranial nerves that emerge directly from the brain and brainstem to innervate the head, neck, and certain visceral functions."),
            zh = LocalizedContent("人类有多少对脑神经？", listOf("12", "10", "14", "8"), "科学", "人类有12对脑神经，它们直接从大脑和脑干发出，支配头部、颈部及某些内脏功能。"),
            es = LocalizedContent("¿Cuántos nervios craneales tiene un humano?", listOf("12", "10", "14", "8"), "Ciencia", "Los humanos tienen 12 pares de nervios craneales que emergen directamente del cerebro y el tronco encefálico para inervar la cabeza, el cuello y algunas funciones viscerales.")
        ),
        BilingualQuestion(
            id = 8558, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique a le numéro atomique 8?", listOf("Oxygène", "Azote", "Carbone", "Bore"), "Science", "Le numéro atomique 8 correspond au nombre de protons dans le noyau de l'atome d'oxygène, un élément essentiel à la respiration et présent dans l'air."),
            en = LocalizedContent("Which chemical element has atomic number 8?", listOf("Oxygen", "Nitrogen", "Carbon", "Boron"), "Science", "Atomic number 8 corresponds to the number of protons in the nucleus of an oxygen atom, an element essential for respiration and present in air."),
            zh = LocalizedContent("原子序数为8的化学元素是什么？", listOf("氧", "氮", "碳", "硼"), "科学", "原子序数8对应氧原子核中的质子数，氧是呼吸作用必需的元素，存在于空气中。"),
            es = LocalizedContent("¿Qué elemento químico tiene el número atómico 8?", listOf("Oxígeno", "Nitrógeno", "Carbono", "Boro"), "Ciencia", "El número atómico 8 corresponde al número de protones en el núcleo del átomo de oxígeno, un elemento esencial para la respiración y presente en el aire.")
        ),
        BilingualQuestion(
            id = 8559, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus petit minéral connu?", listOf("Quartz", "Feldspath", "Mica", "Calcite"), "Science", "Le mica est considéré comme le plus petit minéral connu car il peut se présenter en feuillets extrêmement fins, parfois d’une épaisseur de quelques atomes seulement."),
            en = LocalizedContent("What is the smallest known mineral?", listOf("Quartz", "Feldspar", "Mica", "Calcite"), "Science", "Mica is considered the smallest known mineral because it can occur in extremely thin sheets, sometimes only a few atoms thick."),
            zh = LocalizedContent("已知最小的矿物是什么？", listOf("石英", "长石", "云母", "方解石"), "科学", "云母被认为是已知最小的矿物，因为它可以形成极薄的片层，有时仅有几个原子厚。"),
            es = LocalizedContent("¿Cuál es el mineral más pequeño conocido?", listOf("Cuarzo", "Feldespato", "Mica", "Calcita"), "Ciencia", "La mica se considera el mineral más pequeño conocido porque puede presentarse en láminas extremadamente finas, a veces de solo unos pocos átomos de espesor.")
        ),
        BilingualQuestion(
            id = 8560, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est l'unité de mesure de la pression?", listOf("Pascal", "Newton", "Joule", "Watt"), "Science", "Le pascal (Pa) est l'unité dérivée du Système international pour la pression, définie comme une force d'un newton appliquée sur une surface d'un mètre carré."),
            en = LocalizedContent("What is the unit of measurement for pressure?", listOf("Pascal", "Newton", "Joule", "Watt"), "Science", "The pascal (Pa) is the SI derived unit for pressure, defined as one newton per square meter."),
            zh = LocalizedContent("压强的测量单位是什么？", listOf("帕斯卡", "牛顿", "焦耳", "瓦特"), "科学", "帕斯卡（Pa）是国际单位制中压强的导出单位，定义为每平方米一牛顿的力。"),
            es = LocalizedContent("¿Cuál es la unidad de medida de la presión?", listOf("Pascal", "Newton", "Julio", "Vatio"), "Ciencia", "El pascal (Pa) es la unidad derivada del Sistema Internacional para la presión, definida como un newton por metro cuadrado.")
        ),
        BilingualQuestion(
            id = 8561, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gaz représente environ 78% de l'atmosphère?", listOf("Azote", "Oxygène", "Argon", "Néon"), "Science", "L'azote est le gaz le plus abondant dans l'atmosphère terrestre, constituant environ 78% de son volume, suivi par l'oxygène à 21%."),
            en = LocalizedContent("Which gas makes up about 78% of the atmosphere?", listOf("Nitrogen", "Oxygen", "Argon", "Neon"), "Science", "Nitrogen is the most abundant gas in Earth's atmosphere, constituting about 78% of its volume, followed by oxygen at 21%."),
            zh = LocalizedContent("哪种气体约占大气层的78%？", listOf("氮气", "氧气", "氩气", "氖气"), "科学", "氮气是地球大气中最丰富的气体，约占其体积的78%，其次是氧气占21%。"),
            es = LocalizedContent("¿Qué gas constituye aproximadamente el 78% de la atmósfera?", listOf("Nitrógeno", "Oxígeno", "Argón", "Neón"), "Ciencia", "El nitrógeno es el gas más abundante en la atmósfera terrestre, constituyendo aproximadamente el 78% de su volumen, seguido por el oxígeno con un 21%.")
        ),
        BilingualQuestion(
            id = 8562, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a inventé le microscope?", listOf("Zacharias Janssen", "Galilée", "Robert Hooke", "Anton van Leeuwenhoek"), "Science", "Zacharias Janssen, un fabricant de lunettes néerlandais, est crédité de l'invention du premier microscope composé vers 1590, avec l'aide de son père Hans."),
            en = LocalizedContent("Which scientist invented the microscope?", listOf("Zacharias Janssen", "Galileo", "Robert Hooke", "Anton van Leeuwenhoek"), "Science", "Zacharias Janssen, a Dutch spectacle maker, is credited with inventing the first compound microscope around 1590, with the help of his father Hans."),
            zh = LocalizedContent("哪位科学家发明了显微镜？", listOf("扎卡里亚斯·詹森", "伽利略", "罗伯特·胡克", "安东尼·范·列文虎克"), "科学", "荷兰眼镜制造商扎卡里亚斯·詹森在其父亲汉斯的帮助下，于1590年左右发明了第一台复合显微镜。"),
            es = LocalizedContent("¿Qué científico inventó el microscopio?", listOf("Zacharias Janssen", "Galileo", "Robert Hooke", "Anton van Leeuwenhoek"), "Ciencia", "Zacharias Janssen, un fabricante de lentes neerlandés, es acreditado con la invención del primer microscopio compuesto alrededor de 1590, con la ayuda de su padre Hans.")
        ),
        BilingualQuestion(
            id = 8563, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de côtés a un pentagone?", listOf("5", "6", "4", "7"), "Science", "Un pentagone est un polygone à cinq côtés, le préfixe \"penta-\" venant du grec ancien pour cinq."),
            en = LocalizedContent("How many sides does a pentagon have?", listOf("5", "6", "4", "7"), "Science", "A pentagon is a polygon with five sides; the prefix 'penta-' comes from ancient Greek for five."),
            zh = LocalizedContent("五边形有多少条边？", listOf("5", "6", "4", "7"), "科学", "五边形是有五条边的多边形，前缀“penta-”来自古希腊语，意为五。"),
            es = LocalizedContent("¿Cuántos lados tiene un pentágono?", listOf("5", "6", "4", "7"), "Ciencia", "Un pentágono es un polígono de cinco lados; el prefijo 'penta-' proviene del griego antiguo para cinco.")
        ),
        BilingualQuestion(
            id = 8564, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du phosphore?", listOf("P", "Po", "Pb", "Pr"), "Science", "Le symbole chimique du phosphore est P, car il correspond à la première lettre de son nom latin, Phosphorus."),
            en = LocalizedContent("What is the chemical symbol for phosphorus?", listOf("P", "Po", "Pb", "Pr"), "Science", "The chemical symbol for phosphorus is P, as it corresponds to the first letter of its Latin name, Phosphorus."),
            zh = LocalizedContent("磷的化学符号是什么？", listOf("P", "Po", "Pb", "Pr"), "科学", "磷的化学符号是P，因为它对应其拉丁名Phosphorus的第一个字母。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fósforo?", listOf("P", "Po", "Pb", "Pr"), "Ciencia", "El símbolo químico del fósforo es P, ya que corresponde a la primera letra de su nombre latino, Phosphorus.")
        ),
        BilingualQuestion(
            id = 8565, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la profondeur de la Fosse des Mariannes?", listOf("11000 m", "8000 m", "15000 m", "6000 m"), "Science", "La Fosse des Mariannes est le point le plus profond des océans, avec une profondeur maximale d'environ 11 000 mètres dans le Challenger Deep."),
            en = LocalizedContent("What is the depth of the Mariana Trench?", listOf("11000 m", "8000 m", "15000 m", "6000 m"), "Science", "The Mariana Trench is the deepest part of the oceans, with a maximum depth of about 11,000 meters in the Challenger Deep."),
            zh = LocalizedContent("马里亚纳海沟的深度是多少？", listOf("11000米", "8000米", "15000米", "6000米"), "科学", "马里亚纳海沟是海洋的最深处，其挑战者深渊的最大深度约为11000米。"),
            es = LocalizedContent("¿Cuál es la profundidad de la Fosa de las Marianas?", listOf("11000 m", "8000 m", "15000 m", "6000 m"), "Ciencia", "La Fosa de las Marianas es el punto más profundo de los océanos, con una profundidad máxima de aproximadamente 11 000 metros en el Abismo Challenger.")
        ),
        BilingualQuestion(
            id = 8566, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus abondant dans l'univers?", listOf("Hydrogène", "Hélium", "Carbone", "Oxygène"), "Science", "L'hydrogène représente environ 75% de la matière baryonique de l'univers, formé lors du Big Bang. Il est le combustible principal des étoiles par fusion nucléaire."),
            en = LocalizedContent("Which chemical element is the most abundant in the universe?", listOf("Hydrogen", "Helium", "Carbon", "Oxygen"), "Science", "Hydrogen makes up about 75% of the baryonic matter in the universe, formed during the Big Bang. It is the main fuel for stars through nuclear fusion."),
            zh = LocalizedContent("宇宙中最丰富的化学元素是什么？", listOf("氢", "氦", "碳", "氧"), "科学", "氢约占宇宙重子物质的75%，在大爆炸期间形成。它是恒星通过核聚变的主要燃料。"),
            es = LocalizedContent("¿Qué elemento químico es el más abundante en el universo?", listOf("Hidrógeno", "Helio", "Carbono", "Oxígeno"), "Ciencia", "El hidrógeno constituye aproximadamente el 75% de la materia bariónica del universo, formado durante el Big Bang. Es el combustible principal de las estrellas mediante fusión nuclear.")
        ),
        BilingualQuestion(
            id = 8567, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de paires de côtes a un humain?", listOf("12", "10", "14", "11"), "Science", "Le squelette humain possède 12 paires de côtes, soit 24 côtes au total, qui protègent les organes thoraciques comme le cœur et les poumons."),
            en = LocalizedContent("How many pairs of ribs does a human have?", listOf("12", "10", "14", "11"), "Science", "The human skeleton has 12 pairs of ribs, totaling 24 ribs, which protect the thoracic organs such as the heart and lungs."),
            zh = LocalizedContent("人类有多少对肋骨？", listOf("12", "10", "14", "11"), "科学", "人类骨骼有12对肋骨，共24根，保护心脏和肺等胸腔器官。"),
            es = LocalizedContent("¿Cuántos pares de costillas tiene un humano?", listOf("12", "10", "14", "11"), "Ciencia", "El esqueleto humano tiene 12 pares de costillas, totalizando 24 costillas, que protegen los órganos torácicos como el corazón y los pulmones.")
        ),
        BilingualQuestion(
            id = 8568, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'électron?", listOf("J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Science", "J.J. Thomson découvrit l'électron en 1897 lors d'expériences sur les rayons cathodiques, ce qui lui valut le prix Nobel de physique en 1906."),
            en = LocalizedContent("Which scientist discovered the electron?", listOf("J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Science", "J.J. Thomson discovered the electron in 1897 through experiments with cathode rays, earning him the Nobel Prize in Physics in 1906."),
            zh = LocalizedContent("哪位科学家发现了电子？", listOf("J.J. 汤姆孙", "欧内斯特·卢瑟福", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "J.J. 汤姆孙于1897年通过阴极射线实验发现了电子，并因此获得1906年诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el electrón?", listOf("J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Ciencia", "J.J. Thomson descubrió el electrón en 1897 mediante experimentos con rayos catódicos, lo que le valió el Premio Nobel de Física en 1906.")
        ),
        BilingualQuestion(
            id = 8569, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du soufre?", listOf("S", "Se", "Si", "Sn"), "Science", "Le symbole chimique du soufre est S, car il dérive de son nom latin *sulfur*. Cet élément non métallique est présent dans la nature sous forme de cristaux jaunes et dans de nombreux minéraux."),
            en = LocalizedContent("What is the chemical symbol for sulfur?", listOf("S", "Se", "Si", "Sn"), "Science", "The chemical symbol for sulfur is S, derived from its Latin name *sulfur*. This non-metallic element occurs naturally as yellow crystals and in many minerals."),
            zh = LocalizedContent("硫的化学符号是什么？", listOf("S", "Se", "Si", "Sn"), "科学", "硫的化学符号是S，源自其拉丁名*sulfur*。这种非金属元素以黄色晶体形式天然存在，并存在于许多矿物中。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del azufre?", listOf("S", "Se", "Si", "Sn"), "Ciencia", "El símbolo químico del azufre es S, derivado de su nombre latino *sulfur*. Este elemento no metálico se encuentra naturalmente en forma de cristales amarillos y en muchos minerales.")
        ),
        BilingualQuestion(
            id = 8570, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la température à la surface du Soleil?", listOf("5500°C", "3000°C", "8000°C", "2000°C"), "Science", "La température à la surface du Soleil, appelée photosphère, est d'environ 5500°C, ce qui correspond à la lumière visible que nous recevons."),
            en = LocalizedContent("What is the temperature at the surface of the Sun?", listOf("5500°C", "3000°C", "8000°C", "2000°C"), "Science", "The temperature at the surface of the Sun, called the photosphere, is about 5500°C, which corresponds to the visible light we receive."),
            zh = LocalizedContent("太阳表面的温度是多少？", listOf("5500°C", "3000°C", "8000°C", "2000°C"), "科学", "太阳表面（称为光球层）的温度约为5500°C，这对应于我们接收到的可见光。"),
            es = LocalizedContent("¿Cuál es la temperatura en la superficie del Sol?", listOf("5500°C", "3000°C", "8000°C", "2000°C"), "Ciencia", "La temperatura en la superficie del Sol, llamada fotosfera, es de aproximadamente 5500°C, lo que corresponde a la luz visible que recibimos.")
        ),
        BilingualQuestion(
            id = 8571, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit l'insuline?", listOf("Pancréas", "Thyroïde", "Surrénale", "Hypophyse"), "Science", "Le pancréas produit l'insuline via ses îlots de Langerhans, des cellules endocrines spécialisées qui régulent la glycémie."),
            en = LocalizedContent("Which gland produces insulin?", listOf("Pancreas", "Thyroid", "Adrenal", "Pituitary"), "Science", "The pancreas produces insulin via its islets of Langerhans, specialized endocrine cells that regulate blood sugar."),
            zh = LocalizedContent("哪个腺体产生胰岛素？", listOf("胰腺", "甲状腺", "肾上腺", "垂体"), "科学", "胰腺通过其胰岛产生胰岛素，胰岛是调节血糖的特化内分泌细胞。"),
            es = LocalizedContent("¿Qué glándula produce insulina?", listOf("Páncreas", "Tiroides", "Suprarrenal", "Hipófisis"), "Ciencia", "El páncreas produce insulina a través de sus islotes de Langerhans, células endocrinas especializadas que regulan el azúcar en sangre.")
        ),
        BilingualQuestion(
            id = 8572, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand glacier du monde?", listOf("Inlandsis du Groenland", "Inlandsis de l'Antarctique", "Glacier d'Aletsch", "Glacier d'Humboldt"), "Science", "L'inlandsis de l'Antarctique est le plus grand glacier du monde, couvrant environ 14 millions de km² et contenant 90 % de la glace terrestre."),
            en = LocalizedContent("What is the largest glacier in the world?", listOf("Greenland Ice Sheet", "Antarctic Ice Sheet", "Aletsch Glacier", "Humboldt Glacier"), "Science", "The Antarctic Ice Sheet is the largest glacier in the world, covering about 14 million km² and containing 90% of Earth's ice."),
            zh = LocalizedContent("世界上最大的冰川是什么？", listOf("格陵兰冰盖", "南极冰盖", "阿莱奇冰川", "洪堡冰川"), "科学", "南极冰盖是世界上最大的冰川，覆盖约1400万平方公里，包含地球90%的冰。"),
            es = LocalizedContent("¿Cuál es el glaciar más grande del mundo?", listOf("Indlandsis de Groenlandia", "Indlandsis de la Antártida", "Glaciar de Aletsch", "Glaciar de Humboldt"), "Ciencia", "El indlandsis de la Antártida es el glaciar más grande del mundo, cubriendo aproximadamente 14 millones de km² y conteniendo el 90% del hielo terrestre.")
        ),
        BilingualQuestion(
            id = 8573, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'ADN?", listOf("James Watson et Francis Crick", "Erwin Schrödinger", "Linus Pauling", "Rosalind Franklin"), "Science", "La structure en double hélice de l'ADN a été découverte en 1953 par James Watson et Francis Crick, s'appuyant sur les travaux de Rosalind Franklin et Maurice Wilkins."),
            en = LocalizedContent("Which scientist discovered DNA?", listOf("James Watson and Francis Crick", "Erwin Schrödinger", "Linus Pauling", "Rosalind Franklin"), "Science", "The double helix structure of DNA was discovered in 1953 by James Watson and Francis Crick, building on the work of Rosalind Franklin and Maurice Wilkins."),
            zh = LocalizedContent("哪位科学家发现了DNA？", listOf("詹姆斯·沃森和弗朗西斯·克里克", "埃尔温·薛定谔", "莱纳斯·鲍林", "罗莎琳德·富兰克林"), "科学", "DNA的双螺旋结构于1953年由詹姆斯·沃森和弗朗西斯·克里克发现，他们基于罗莎琳德·富兰克林和莫里斯·威尔金斯的工作。"),
            es = LocalizedContent("¿Qué científico descubrió el ADN?", listOf("James Watson y Francis Crick", "Erwin Schrödinger", "Linus Pauling", "Rosalind Franklin"), "Ciencia", "La estructura de doble hélice del ADN fue descubierta en 1953 por James Watson y Francis Crick, basándose en el trabajo de Rosalind Franklin y Maurice Wilkins.")
        ),
        BilingualQuestion(
            id = 8574, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de côtés a un triangle?", listOf("3", "4", "5", "6"), "Science", "Un triangle est une figure géométrique composée de trois segments de droite reliés entre eux, ce qui lui donne trois côtés."),
            en = LocalizedContent("How many sides does a triangle have?", listOf("3", "4", "5", "6"), "Science", "A triangle is a geometric figure composed of three line segments connected together, giving it three sides."),
            zh = LocalizedContent("三角形有几条边？", listOf("3", "4", "5", "6"), "科学", "三角形是由三条线段连接而成的几何图形，因此有三条边。"),
            es = LocalizedContent("¿Cuántos lados tiene un triángulo?", listOf("3", "4", "5", "6"), "Ciencia", "Un triángulo es una figura geométrica compuesta por tres segmentos de recta unidos entre sí, lo que le da tres lados.")
        ),
        BilingualQuestion(
            id = 8575, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du brome?", listOf("Br", "B", "Ba", "Be"), "Science", "Le symbole chimique du brome est Br, dérivé du grec bromos signifiant puanteur, en raison de son odeur âcre. C'est un élément halogène liquide à température ambiante."),
            en = LocalizedContent("What is the chemical symbol for bromine?", listOf("Br", "B", "Ba", "Be"), "Science", "The chemical symbol for bromine is Br, derived from the Greek bromos meaning stench, due to its pungent odor. It is a liquid halogen element at room temperature."),
            zh = LocalizedContent("溴的化学符号是什么？", listOf("Br", "B", "Ba", "Be"), "科学", "溴的化学符号是Br，源自希腊语bromos，意为恶臭，因其刺鼻气味。它是一种在室温下为液体的卤素元素。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del bromo?", listOf("Br", "B", "Ba", "Be"), "Ciencia", "El símbolo químico del bromo es Br, derivado del griego bromos que significa hedor, debido a su olor acre. Es un elemento halógeno líquido a temperatura ambiente.")
        ),
        BilingualQuestion(
            id = 8576, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est l'unité de mesure de l'énergie?", listOf("Joule", "Newton", "Pascal", "Watt"), "Science", "Le joule est l'unité dérivée du Système international pour quantifier l'énergie, le travail ou la chaleur, nommée d'après le physicien James Prescott Joule."),
            en = LocalizedContent("What is the unit of measurement for energy?", listOf("Joule", "Newton", "Pascal", "Watt"), "Science", "The joule is the derived unit of the International System for quantifying energy, work, or heat, named after physicist James Prescott Joule."),
            zh = LocalizedContent("能量的测量单位是什么？", listOf("焦耳", "牛顿", "帕斯卡", "瓦特"), "科学", "焦耳是国际单位制中用于量化能量、功或热量的导出单位，以物理学家詹姆斯·普雷斯科特·焦耳命名。"),
            es = LocalizedContent("¿Cuál es la unidad de medida de la energía?", listOf("Julio", "Newton", "Pascal", "Vatio"), "Ciencia", "El julio es la unidad derivada del Sistema Internacional para cuantificar la energía, el trabajo o el calor, nombrada en honor al físico James Prescott Joule.")
        ),
        BilingualQuestion(
            id = 8577, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique est radioactif?", listOf("Uranium", "Or", "Argent", "Cuivre"), "Science", "L'uranium est un élément chimique radioactif car son noyau instable se désintègre spontanément en émettant des particules et de l'énergie, un processus utilisé dans les réacteurs nucléaires et les armes atomiques."),
            en = LocalizedContent("Which chemical element is radioactive?", listOf("Uranium", "Gold", "Silver", "Copper"), "Science", "Uranium is a radioactive chemical element because its unstable nucleus decays spontaneously, emitting particles and energy, a process used in nuclear reactors and atomic weapons."),
            zh = LocalizedContent("哪种化学元素具有放射性？", listOf("铀", "金", "银", "铜"), "科学", "铀是一种放射性化学元素，因为其不稳定的原子核会自发衰变，释放粒子和能量，这一过程用于核反应堆和原子武器。"),
            es = LocalizedContent("¿Qué elemento químico es radiactivo?", listOf("Uranio", "Oro", "Plata", "Cobre"), "Ciencia", "El uranio es un elemento químico radiactivo porque su núcleo inestable se desintegra espontáneamente, emitiendo partículas y energía, proceso utilizado en reactores nucleares y armas atómicas.")
        ),
        BilingualQuestion(
            id = 8578, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres a la colonne vertébrale?", listOf("33", "30", "35", "40"), "Science", "La colonne vertébrale humaine compte 33 vertèbres à la naissance, mais plusieurs fusionnent à l'âge adulte, réduisant ce nombre à 26."),
            en = LocalizedContent("How many vertebrae does the spinal column have?", listOf("33", "30", "35", "40"), "Science", "The human spinal column has 33 vertebrae at birth, but several fuse during adulthood, reducing the number to 26."),
            zh = LocalizedContent("脊柱有多少块椎骨？", listOf("33", "30", "35", "40"), "科学", "人类脊柱在出生时有33块椎骨，但成年后几块会融合，数量减少到26块。"),
            es = LocalizedContent("¿Cuántas vértebras tiene la columna vertebral?", listOf("33", "30", "35", "40"), "Ciencia", "La columna vertebral humana tiene 33 vértebras al nacer, pero varias se fusionan durante la edad adulta, reduciendo el número a 26.")
        ),
        BilingualQuestion(
            id = 8579, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a formulé la loi de la gravitation?", listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"), "Science", "Isaac Newton a formulé la loi de la gravitation universelle dans son ouvrage \"Philosophiæ Naturalis Principia Mathematica\" en 1687, expliquant ainsi la chute des corps et le mouvement des planètes."),
            en = LocalizedContent("Which scientist formulated the law of gravitation?", listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"), "Science", "Isaac Newton formulated the law of universal gravitation in his work \"Philosophiæ Naturalis Principia Mathematica\" in 1687, explaining the fall of bodies and the motion of planets."),
            zh = LocalizedContent("哪位科学家提出了万有引力定律？", listOf("艾萨克·牛顿", "阿尔伯特·爱因斯坦", "伽利略·伽利莱", "约翰内斯·开普勒"), "科学", "艾萨克·牛顿在1687年的著作《自然哲学的数学原理》中提出了万有引力定律，解释了物体下落和行星运动。"),
            es = LocalizedContent("¿Qué científico formuló la ley de la gravitación?", listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"), "Ciencia", "Isaac Newton formuló la ley de la gravitación universal en su obra \"Philosophiæ Naturalis Principia Mathematica\" en 1687, explicando la caída de los cuerpos y el movimiento de los planetas.")
        ),
        BilingualQuestion(
            id = 8580, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du zinc?", listOf("Zn", "Z", "Zr", "Zb"), "Science", "Le symbole Zn vient du latin zincum, adopté officiellement par l’Union internationale de chimie pure et appliquée (UICPA) pour désigner cet élément métallique de numéro atomique 30."),
            en = LocalizedContent("What is the chemical symbol for zinc?", listOf("Zn", "Z", "Zr", "Zb"), "Science", "The symbol Zn comes from the Latin zincum, officially adopted by the International Union of Pure and Applied Chemistry (IUPAC) to designate this metallic element with atomic number 30."),
            zh = LocalizedContent("锌的化学符号是什么？", listOf("Zn", "Z", "Zr", "Zb"), "科学", "符号 Zn 源自拉丁语 zincum，由国际纯粹与应用化学联合会（IUPAC）正式采用，用于表示这种原子序数为 30 的金属元素。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del zinc?", listOf("Zn", "Z", "Zr", "Zb"), "Ciencia", "El símbolo Zn proviene del latín zincum, adoptado oficialmente por la Unión Internacional de Química Pura y Aplicada (IUPAC) para designar este elemento metálico de número atómico 30.")
        ),
        BilingualQuestion(
            id = 8581, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la longueur du cerveau humain moyen?", listOf("15 cm", "20 cm", "10 cm", "25 cm"), "Science", "Le cerveau humain adulte mesure en moyenne 15 centimètres de long, de l'avant du lobe frontal à l'arrière du lobe occipital. Cette taille est corrélée au volume crânien et varie légèrement selon les individus."),
            en = LocalizedContent("What is the length of the average human brain?", listOf("15 cm", "20 cm", "10 cm", "25 cm"), "Science", "The adult human brain averages 15 centimeters in length, from the front of the frontal lobe to the back of the occipital lobe. This size correlates with cranial volume and varies slightly among individuals."),
            zh = LocalizedContent("人类大脑的平均长度是多少？", listOf("15 厘米", "20 厘米", "10 厘米", "25 厘米"), "科学", "成年人类大脑的平均长度为 15 厘米，从额叶前部到枕叶后部。这个尺寸与颅腔容积相关，个体间略有差异。"),
            es = LocalizedContent("¿Cuál es la longitud del cerebro humano promedio?", listOf("15 cm", "20 cm", "10 cm", "25 cm"), "Ciencia", "El cerebro humano adulto mide en promedio 15 centímetros de largo, desde la parte frontal del lóbulo frontal hasta la parte posterior del lóbulo occipital. Este tamaño se correlaciona con el volumen craneal y varía ligeramente entre individuos.")
        ),
        BilingualQuestion(
            id = 8582, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit l'hormone de croissance?", listOf("Hypophyse", "Thyroïde", "Surrénale", "Pancréas"), "Science", "L'hypophyse, située à la base du cerveau, sécrète l'hormone de croissance, essentielle au développement et à la régénération des tissus."),
            en = LocalizedContent("Which gland produces growth hormone?", listOf("Pituitary", "Thyroid", "Adrenal", "Pancreas"), "Science", "The pituitary gland, located at the base of the brain, secretes growth hormone, essential for tissue development and regeneration."),
            zh = LocalizedContent("哪个腺体产生生长激素？", listOf("垂体", "甲状腺", "肾上腺", "胰腺"), "科学", "垂体位于大脑底部，分泌生长激素，对组织发育和再生至关重要。"),
            es = LocalizedContent("¿Qué glándula produce la hormona del crecimiento?", listOf("Hipófisis", "Tiroides", "Suprarrenal", "Páncreas"), "Ciencia", "La hipófisis, situada en la base del cerebro, secreta la hormona del crecimiento, esencial para el desarrollo y la regeneración de los tejidos.")
        ),
        BilingualQuestion(
            id = 8583, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert froid du monde?", listOf("Antarctique", "Gobi", "Kalahari", "Namib"), "Science", "L'Antarctique est considéré comme le plus grand désert froid du monde car il reçoit très peu de précipitations, moins de 50 mm par an en moyenne, ce qui correspond à la définition d'un désert."),
            en = LocalizedContent("What is the largest cold desert in the world?", listOf("Antarctica", "Gobi", "Kalahari", "Namib"), "Science", "Antarctica is considered the largest cold desert in the world because it receives very little precipitation, less than 50 mm per year on average, which meets the definition of a desert."),
            zh = LocalizedContent("世界上最大的冷沙漠是什么？", listOf("南极洲", "戈壁", "卡拉哈里", "纳米布"), "科学", "南极洲被认为是世界上最大的冷沙漠，因为其降水量极少，平均每年不到 50 毫米，符合沙漠的定义。"),
            es = LocalizedContent("¿Cuál es el desierto frío más grande del mundo?", listOf("Antártida", "Gobi", "Kalahari", "Namib"), "Ciencia", "La Antártida es considerada el desierto frío más grande del mundo porque recibe muy poca precipitación, menos de 50 mm al año en promedio, lo que cumple con la definición de desierto.")
        ),
        BilingualQuestion(
            id = 8584, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la loi de Coulomb?", listOf("Charles-Augustin de Coulomb", "Michael Faraday", "Alessandro Volta", "Georg Ohm"), "Science", "Charles-Augustin de Coulomb a énoncé cette loi fondamentale de l'électrostatique en 1785, décrivant la force entre deux charges électriques."),
            en = LocalizedContent("Which scientist discovered Coulomb's law?", listOf("Charles-Augustin de Coulomb", "Michael Faraday", "Alessandro Volta", "Georg Ohm"), "Science", "Charles-Augustin de Coulomb formulated this fundamental law of electrostatics in 1785, describing the force between two electric charges."),
            zh = LocalizedContent("哪位科学家发现了库仑定律？", listOf("查尔斯-奥古斯丁·德·库仑", "迈克尔·法拉第", "亚历山德罗·伏打", "格奥尔格·欧姆"), "科学", "查尔斯-奥古斯丁·德·库仑于 1785 年提出了这一静电学基本定律，描述了两个电荷之间的力。"),
            es = LocalizedContent("¿Qué científico descubrió la ley de Coulomb?", listOf("Charles-Augustin de Coulomb", "Michael Faraday", "Alessandro Volta", "Georg Ohm"), "Ciencia", "Charles-Augustin de Coulomb enunció esta ley fundamental de la electrostática en 1785, describiendo la fuerza entre dos cargas eléctricas.")
        ),
        BilingualQuestion(
            id = 8585, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de lobes a le foie?", listOf("4", "2", "3", "5"), "Science", "Le foie humain est divisé anatomiquement en quatre lobes : le lobe droit, le lobe gauche, le lobe caudé et le lobe carré."),
            en = LocalizedContent("How many lobes does the liver have?", listOf("4", "2", "3", "5"), "Science", "The human liver is anatomically divided into four lobes: the right lobe, left lobe, caudate lobe, and quadrate lobe."),
            zh = LocalizedContent("肝脏有多少个叶？", listOf("4", "2", "3", "5"), "科学", "人类肝脏在解剖学上分为四个叶：右叶、左叶、尾状叶和方叶。"),
            es = LocalizedContent("¿Cuántos lóbulos tiene el hígado?", listOf("4", "2", "3", "5"), "Ciencia", "El hígado humano se divide anatómicamente en cuatro lóbulos: el lóbulo derecho, el lóbulo izquierdo, el lóbulo caudado y el lóbulo cuadrado.")
        ),
        BilingualQuestion(
            id = 8586, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du nickel?", listOf("Ni", "N", "Ne", "Na"), "Science", "Le symbole Ni vient du latin Niccolum. Le nickel est un métal de transition, ferromagnétique, utilisé dans les alliages comme l'inox."),
            en = LocalizedContent("What is the chemical symbol for nickel?", listOf("Ni", "N", "Ne", "Na"), "Science", "The symbol Ni comes from the Latin Niccolum. Nickel is a ferromagnetic transition metal used in alloys such as stainless steel."),
            zh = LocalizedContent("镍的化学符号是什么？", listOf("Ni", "N", "Ne", "Na"), "科学", "符号 Ni 源自拉丁语 Niccolum。镍是一种铁磁性过渡金属，用于不锈钢等合金中。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del níquel?", listOf("Ni", "N", "Ne", "Na"), "Ciencia", "El símbolo Ni proviene del latín Niccolum. El níquel es un metal de transición ferromagnético utilizado en aleaciones como el acero inoxidable.")
        ),
        BilingualQuestion(
            id = 8587, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la masse du Soleil?", listOf("1.989 × 10³⁰ kg", "5 × 10³⁰ kg", "1 × 10³⁰ kg", "3 × 10³⁰ kg"), "Science", "Le Soleil contient 99,86 % de la masse du système solaire, soit environ 1,989 × 10³⁰ kg, soit 330 000 fois la masse de la Terre."),
            en = LocalizedContent("What is the mass of the Sun?", listOf("1.989 × 10³⁰ kg", "5 × 10³⁰ kg", "1 × 10³⁰ kg", "3 × 10³⁰ kg"), "Science", "The Sun contains 99.86% of the mass of the solar system, approximately 1.989 × 10³⁰ kg, which is 330,000 times the mass of Earth."),
            zh = LocalizedContent("太阳的质量是多少？", listOf("1.989 × 10³⁰ 千克", "5 × 10³⁰ 千克", "1 × 10³⁰ 千克", "3 × 10³⁰ 千克"), "科学", "太阳包含了太阳系质量的 99.86%，约为 1.989 × 10³⁰ 千克，是地球质量的 33 万倍。"),
            es = LocalizedContent("¿Cuál es la masa del Sol?", listOf("1.989 × 10³⁰ kg", "5 × 10³⁰ kg", "1 × 10³⁰ kg", "3 × 10³⁰ kg"), "Ciencia", "El Sol contiene el 99.86% de la masa del sistema solar, aproximadamente 1.989 × 10³⁰ kg, lo que equivale a 330 000 veces la masa de la Tierra.")
        ),
        BilingualQuestion(
            id = 8588, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est utilisé pour la datation au carbone?", listOf("Carbone-14", "Carbone-12", "Uranium-238", "Potassium-40"), "Science", "Le carbone-14 est un isotope radioactif du carbone, présent dans tous les êtres vivants, dont la désintégration régulière permet de dater des échantillons organiques jusqu'à environ 50 000 ans."),
            en = LocalizedContent("Which chemical element is used for carbon dating?", listOf("Carbon-14", "Carbon-12", "Uranium-238", "Potassium-40"), "Science", "Carbon-14 is a radioactive isotope of carbon present in all living organisms. Its regular decay allows dating of organic samples up to about 50,000 years."),
            zh = LocalizedContent("哪种化学元素用于碳定年法？", listOf("碳-14", "碳-12", "铀-238", "钾-40"), "科学", "碳-14 是碳的一种放射性同位素，存在于所有生物体中。其规律性衰变可用于对有机样本进行测年，最长可达约 5 万年。"),
            es = LocalizedContent("¿Qué elemento químico se utiliza para la datación por carbono?", listOf("Carbono-14", "Carbono-12", "Uranio-238", "Potasio-40"), "Ciencia", "El carbono-14 es un isótopo radiactivo del carbono presente en todos los seres vivos. Su desintegración regular permite datar muestras orgánicas de hasta unos 50 000 años.")
        ),
        BilingualQuestion(
            id = 8589, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de neurones a le cerveau humain environ?", listOf("86 milliards", "50 milliards", "100 milliards", "200 milliards"), "Science", "Le chiffre de 86 milliards de neurones a été établi par des études récentes en neurosciences, remplaçant l'estimation antérieure de 100 milliards souvent citée."),
            en = LocalizedContent("How many neurons does the human brain have approximately?", listOf("86 billion", "50 billion", "100 billion", "200 billion"), "Science", "The figure of 86 billion neurons has been established by recent neuroscience studies, replacing the earlier estimate of 100 billion often cited."),
            zh = LocalizedContent("人类大脑大约有多少个神经元？", listOf("860 亿", "500 亿", "1000 亿", "2000 亿"), "科学", "860 亿个神经元的数字是由最近的神经科学研究确定的，取代了之前常被引用的 1000 亿的估计。"),
            es = LocalizedContent("¿Cuántas neuronas tiene aproximadamente el cerebro humano?", listOf("86 mil millones", "50 mil millones", "100 mil millones", "200 mil millones"), "Ciencia", "La cifra de 86 mil millones de neuronas ha sido establecida por estudios recientes en neurociencia, reemplazando la estimación anterior de 100 mil millones a menudo citada.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8590, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le neutron?", listOf("James Chadwick", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Science", "James Chadwick a découvert le neutron en 1932 lors d'expériences de bombardement du béryllium par des particules alpha, ce qui lui a valu le prix Nobel de physique en 1935."),
            en = LocalizedContent("Which scientist discovered the neutron?", listOf("James Chadwick", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Science", "James Chadwick discovered the neutron in 1932 during experiments bombarding beryllium with alpha particles, earning him the Nobel Prize in Physics in 1935."),
            zh = LocalizedContent("哪位科学家发现了中子？", listOf("詹姆斯·查德威克", "欧内斯特·卢瑟福", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "詹姆斯·查德威克于1932年在用α粒子轰击铍的实验中发现了中子，并因此获得1935年诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el neutrón?", listOf("James Chadwick", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Ciencia", "James Chadwick descubrió el neutrón en 1932 durante experimentos de bombardeo de berilio con partículas alfa, lo que le valió el Premio Nobel de Física en 1935.")
        ),
        BilingualQuestion(
            id = 8591, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du tungstène?", listOf("W", "Tu", "Wg", "Tn"), "Science", "Le symbole W vient de Wolfram, nom allemand du tungstène, dérivé du minerai wolframite."),
            en = LocalizedContent("What is the chemical symbol for tungsten?", listOf("W", "Tu", "Wg", "Tn"), "Science", "The symbol W comes from Wolfram, the German name for tungsten, derived from the mineral wolframite."),
            zh = LocalizedContent("钨的化学符号是什么？", listOf("W", "Tu", "Wg", "Tn"), "科学", "符号W来自Wolfram，这是钨的德语名称，源自矿物黑钨矿。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tungsteno?", listOf("W", "Tu", "Wg", "Tn"), "Ciencia", "El símbolo W proviene de Wolfram, el nombre alemán del tungsteno, derivado del mineral wolframita.")
        ),
        BilingualQuestion(
            id = 8592, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la distance Terre-Lune?", listOf("384400 km", "300000 km", "500000 km", "250000 km"), "Science", "La distance moyenne entre la Terre et la Lune est d'environ 384 400 kilomètres, mesurée entre leurs centres. Cette valeur varie légèrement en raison de l'orbite elliptique de la Lune."),
            en = LocalizedContent("What is the Earth-Moon distance?", listOf("384400 km", "300000 km", "500000 km", "250000 km"), "Science", "The average distance between Earth and the Moon is about 384,400 kilometers, measured between their centers. This value varies slightly due to the Moon's elliptical orbit."),
            zh = LocalizedContent("地球到月球的距离是多少？", listOf("384400公里", "300000公里", "500000公里", "250000公里"), "科学", "地球和月球之间的平均距离约为384,400公里，以两者中心测量。由于月球轨道呈椭圆形，该值略有变化。"),
            es = LocalizedContent("¿Cuál es la distancia Tierra-Luna?", listOf("384400 km", "300000 km", "500000 km", "250000 km"), "Ciencia", "La distancia media entre la Tierra y la Luna es de aproximadamente 384.400 kilómetros, medida entre sus centros. Este valor varía ligeramente debido a la órbita elíptica de la Luna.")
        ),
        BilingualQuestion(
            id = 8593, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la mélatonine?", listOf("Glande pinéale", "Thyroïde", "Hypophyse", "Pancréas"), "Science", "La glande pinéale, située dans le cerveau, sécrète la mélatonine, une hormone qui régule le cycle veille-sommeil en réponse à l'obscurité."),
            en = LocalizedContent("Which gland produces melatonin?", listOf("Pineal gland", "Thyroid", "Pituitary", "Pancreas"), "Science", "The pineal gland, located in the brain, secretes melatonin, a hormone that regulates the sleep-wake cycle in response to darkness."),
            zh = LocalizedContent("哪个腺体产生褪黑素？", listOf("松果体", "甲状腺", "垂体", "胰腺"), "科学", "松果体位于大脑中，分泌褪黑素，这是一种根据黑暗调节睡眠-觉醒周期的激素。"),
            es = LocalizedContent("¿Qué glándula produce la melatonina?", listOf("Glándula pineal", "Tiroides", "Hipófisis", "Páncreas"), "Ciencia", "La glándula pineal, situada en el cerebro, secreta melatonina, una hormona que regula el ciclo sueño-vigilia en respuesta a la oscuridad.")
        ),
        BilingualQuestion(
            id = 8594, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand continents en surface?", listOf("Asie", "Afrique", "Amérique du Nord", "Antarctique"), "Science", "L'Asie est le plus grand continent avec une superficie d'environ 44,6 millions de kilomètres carrés, soit près d'un tiers des terres émergées de la planète."),
            en = LocalizedContent("What is the largest continent by area?", listOf("Asia", "Africa", "North America", "Antarctica"), "Science", "Asia is the largest continent with an area of about 44.6 million square kilometers, nearly one-third of the Earth's land area."),
            zh = LocalizedContent("面积最大的大洲是哪个？", listOf("亚洲", "非洲", "北美洲", "南极洲"), "科学", "亚洲是最大的大洲，面积约4460万平方公里，占地球陆地面积近三分之一。"),
            es = LocalizedContent("¿Cuál es el continente más grande por superficie?", listOf("Asia", "África", "América del Norte", "Antártida"), "Ciencia", "Asia es el continente más grande con una superficie de aproximadamente 44,6 millones de kilómetros cuadrados, casi un tercio de la superficie terrestre del planeta.")
        ),
        BilingualQuestion(
            id = 8595, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert les rayons X?", listOf("Wilhelm Röntgen", "Marie Curie", "Pierre Curie", "Henri Becquerel"), "Science", "Wilhelm Röntgen a découvert les rayons X en 1895, alors qu'il étudiait les rayons cathodiques."),
            en = LocalizedContent("Which scientist discovered X-rays?", listOf("Wilhelm Röntgen", "Marie Curie", "Pierre Curie", "Henri Becquerel"), "Science", "Wilhelm Röntgen discovered X-rays in 1895 while studying cathode rays."),
            zh = LocalizedContent("哪位科学家发现了X射线？", listOf("威廉·伦琴", "玛丽·居里", "皮埃尔·居里", "亨利·贝克勒尔"), "科学", "威廉·伦琴于1895年在研究阴极射线时发现了X射线。"),
            es = LocalizedContent("¿Qué científico descubrió los rayos X?", listOf("Wilhelm Röntgen", "Marie Curie", "Pierre Curie", "Henri Becquerel"), "Ciencia", "Wilhelm Röntgen descubrió los rayos X en 1895 mientras estudiaba los rayos catódicos.")
        ),
        BilingualQuestion(
            id = 8596, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'étain?", listOf("Sn", "St", "Si", "Sr"), "Science", "Le symbole Sn vient du latin stannum, qui désignait l'étain. Ce métal est utilisé depuis l'Antiquité."),
            en = LocalizedContent("What is the chemical symbol for tin?", listOf("Sn", "St", "Si", "Sr"), "Science", "The symbol Sn comes from the Latin stannum, which referred to tin. This metal has been used since antiquity."),
            zh = LocalizedContent("锡的化学符号是什么？", listOf("Sn", "St", "Si", "Sr"), "科学", "符号Sn来自拉丁语stannum，意为锡。这种金属自古就被使用。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del estaño?", listOf("Sn", "St", "Si", "Sr"), "Ciencia", "El símbolo Sn proviene del latín stannum, que designaba al estaño. Este metal se ha utilizado desde la antigüedad.")
        ),
        BilingualQuestion(
            id = 8597, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de côtés a un dodécagone?", listOf("12", "10", "8", "15"), "Science", "Le préfixe \"dodéca\" signifie douze en grec, donc un dodécagone est un polygone à douze côtés."),
            en = LocalizedContent("How many sides does a dodecagon have?", listOf("12", "10", "8", "15"), "Science", "The prefix \"dodeca\" means twelve in Greek, so a dodecagon is a polygon with twelve sides."),
            zh = LocalizedContent("十二边形有多少条边？", listOf("12", "10", "8", "15"), "科学", "前缀“十二”在希腊语中意为十二，因此十二边形是有十二条边的多边形。"),
            es = LocalizedContent("¿Cuántos lados tiene un dodecágono?", listOf("12", "10", "8", "15"), "Ciencia", "El prefijo \"dodeca\" significa doce en griego, por lo que un dodecágono es un polígono de doce lados.")
        ),
        BilingualQuestion(
            id = 8598, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel élément chimique a le point de fusion le plus haut?", listOf("Tungstène", "Platine", "Carbone", "Iridium"), "Science", "Le tungstène possède le point de fusion le plus élevé de tous les éléments, à 3422 °C, en raison de ses liaisons métalliques extrêmement fortes."),
            en = LocalizedContent("Which chemical element has the highest melting point?", listOf("Tungsten", "Platinum", "Carbon", "Iridium"), "Science", "Tungsten has the highest melting point of all elements, at 3422 °C, due to its extremely strong metallic bonds."),
            zh = LocalizedContent("哪种化学元素的熔点最高？", listOf("钨", "铂", "碳", "铱"), "科学", "钨的熔点在所有元素中最高，为3422°C，这是由于它极强的金属键。"),
            es = LocalizedContent("¿Qué elemento químico tiene el punto de fusión más alto?", listOf("Tungsteno", "Platino", "Carbono", "Iridio"), "Ciencia", "El tungsteno tiene el punto de fusión más alto de todos los elementos, a 3422 °C, debido a sus enlaces metálicos extremadamente fuertes.")
        ),
        BilingualQuestion(
            id = 8599, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la masse de l'électron?", listOf("9.109 × 10⁻³¹ kg", "1.673 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg", "3.344 × 10⁻²⁷ kg"), "Science", "L'électron a une masse d'environ 9,109 × 10⁻³¹ kg, soit 1/1836 de celle du proton. Cette valeur est une constante fondamentale de la physique."),
            en = LocalizedContent("What is the mass of an electron?", listOf("9.109 × 10⁻³¹ kg", "1.673 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg", "3.344 × 10⁻²⁷ kg"), "Science", "The electron has a mass of about 9.109 × 10⁻³¹ kg, which is 1/1836 of the proton's mass. This value is a fundamental constant of physics."),
            zh = LocalizedContent("电子的质量是多少？", listOf("9.109 × 10⁻³¹ 千克", "1.673 × 10⁻²⁷ 千克", "6.642 × 10⁻²⁷ 千克", "3.344 × 10⁻²⁷ 千克"), "科学", "电子的质量约为9.109 × 10⁻³¹千克，是质子质量的1/1836。该值是物理学的基本常数。"),
            es = LocalizedContent("¿Cuál es la masa del electrón?", listOf("9.109 × 10⁻³¹ kg", "1.673 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg", "3.344 × 10⁻²⁷ kg"), "Ciencia", "El electrón tiene una masa de aproximadamente 9,109 × 10⁻³¹ kg, que es 1/1836 de la masa del protón. Este valor es una constante fundamental de la física.")
        ),
        BilingualQuestion(
            id = 8600, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a formulé l'équation E=mc²?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Wolfgang Pauli"), "Science", "Albert Einstein a publié cette équation en 1905 dans le cadre de sa théorie de la relativité restreinte, établissant l'équivalence entre masse et énergie."),
            en = LocalizedContent("Which scientist formulated the equation E=mc²?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Wolfgang Pauli"), "Science", "Albert Einstein published this equation in 1905 as part of his special theory of relativity, establishing the equivalence of mass and energy."),
            zh = LocalizedContent("哪位科学家提出了方程E=mc²？", listOf("阿尔伯特·爱因斯坦", "马克斯·普朗克", "尼尔斯·玻尔", "沃尔夫冈·泡利"), "科学", "阿尔伯特·爱因斯坦于1905年在其狭义相对论中发表了这一方程，确立了质量与能量的等价关系。"),
            es = LocalizedContent("¿Qué científico formuló la ecuación E=mc²?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Wolfgang Pauli"), "Ciencia", "Albert Einstein publicó esta ecuación en 1905 como parte de su teoría de la relatividad especial, estableciendo la equivalencia entre masa y energía.")
        ),
        BilingualQuestion(
            id = 8601, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de chromosomes a la Drosophile?", listOf("8", "46", "14", "23"), "Science", "La drosophile possède 8 chromosomes (4 paires) dans ses cellules somatiques, une caractéristique classique des études génétiques."),
            en = LocalizedContent("How many chromosomes does a fruit fly have?", listOf("8", "46", "14", "23"), "Science", "The fruit fly has 8 chromosomes (4 pairs) in its somatic cells, a classic feature in genetic studies."),
            zh = LocalizedContent("果蝇有多少条染色体？", listOf("8", "46", "14", "23"), "科学", "果蝇的体细胞中有8条染色体（4对），这是遗传学研究中的经典特征。"),
            es = LocalizedContent("¿Cuántos cromosomas tiene la mosca de la fruta?", listOf("8", "46", "14", "23"), "Ciencia", "La mosca de la fruta tiene 8 cromosomas (4 pares) en sus células somáticas, una característica clásica en los estudios genéticos.")
        ),
        BilingualQuestion(
            id = 8602, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du molybdène?", listOf("Mo", "Mb", "Mn", "Mg"), "Science", "Le molybdène tire son symbole Mo de son nom latin Molybdaenum. C'est un métal de transition utilisé dans les alliages d'acier pour augmenter leur résistance à la chaleur."),
            en = LocalizedContent("What is the chemical symbol for molybdenum?", listOf("Mo", "Mb", "Mn", "Mg"), "Science", "Molybdenum derives its symbol Mo from its Latin name Molybdaenum. It is a transition metal used in steel alloys to increase heat resistance."),
            zh = LocalizedContent("钼的化学符号是什么？", listOf("Mo", "Mb", "Mn", "Mg"), "科学", "钼的符号Mo来自其拉丁名Molybdaenum。它是一种过渡金属，用于钢合金中以增加耐热性。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del molibdeno?", listOf("Mo", "Mb", "Mn", "Mg"), "Ciencia", "El molibdeno deriva su símbolo Mo de su nombre latino Molybdaenum. Es un metal de transición utilizado en aleaciones de acero para aumentar la resistencia al calor.")
        ),
        BilingualQuestion(
            id = 8603, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la constante de Planck?", listOf("6.626 × 10⁻³⁴ J·s", "1.054 × 10⁻³⁴ J·s", "3.313 × 10⁻³⁴ J·s", "9.109 × 10⁻³¹ J·s"), "Science", "La constante de Planck, notée h, relie l'énergie d'un photon à sa fréquence et est fondamentale en mécanique quantique. Sa valeur est 6,626 × 10⁻³⁴ joule-seconde."),
            en = LocalizedContent("What is Planck's constant?", listOf("6.626 × 10⁻³⁴ J·s", "1.054 × 10⁻³⁴ J·s", "3.313 × 10⁻³⁴ J·s", "9.109 × 10⁻³¹ J·s"), "Science", "Planck's constant, denoted h, relates the energy of a photon to its frequency and is fundamental in quantum mechanics. Its value is 6.626 × 10⁻³⁴ joule-seconds."),
            zh = LocalizedContent("普朗克常数是多少？", listOf("6.626 × 10⁻³⁴ J·s", "1.054 × 10⁻³⁴ J·s", "3.313 × 10⁻³⁴ J·s", "9.109 × 10⁻³¹ J·s"), "科学", "普朗克常数，记作h，将光子的能量与其频率联系起来，是量子力学的基础。其值为6.626 × 10⁻³⁴焦耳·秒。"),
            es = LocalizedContent("¿Cuál es la constante de Planck?", listOf("6.626 × 10⁻³⁴ J·s", "1.054 × 10⁻³⁴ J·s", "3.313 × 10⁻³⁴ J·s", "9.109 × 10⁻³¹ J·s"), "Ciencia", "La constante de Planck, denotada h, relaciona la energía de un fotón con su frecuencia y es fundamental en mecánica cuántica. Su valor es 6,626 × 10⁻³⁴ julios-segundo.")
        ),
        BilingualQuestion(
            id = 8604, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland régule le métabolisme?", listOf("Thyroïde", "Hypophyse", "Surrénale", "Pancréas"), "Science", "La glande thyroïde, située dans le cou, produit des hormones qui contrôlent la vitesse du métabolisme, influençant ainsi la dépense énergétique et la température corporelle."),
            en = LocalizedContent("Which gland regulates metabolism?", listOf("Thyroid", "Pituitary", "Adrenal", "Pancreas"), "Science", "The thyroid gland, located in the neck, produces hormones that control the speed of metabolism, influencing energy expenditure and body temperature."),
            zh = LocalizedContent("哪个腺体调节新陈代谢？", listOf("甲状腺", "垂体", "肾上腺", "胰腺"), "科学", "甲状腺位于颈部，产生的激素控制新陈代谢的速度，影响能量消耗和体温。"),
            es = LocalizedContent("¿Qué glándula regula el metabolismo?", listOf("Tiroides", "Hipófisis", "Suprarrenal", "Páncreas"), "Ciencia", "La glándula tiroides, situada en el cuello, produce hormonas que controlan la velocidad del metabolismo, influyendo en el gasto energético y la temperatura corporal.")
        ),
        BilingualQuestion(
            id = 8605, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan du monde?", listOf("Mauna Loa", "Mont Everest", "Krakatoa", "Vésuve"), "Science", "Mauna Loa, situé à Hawaï, est le plus grand volcan du monde en volume et en superficie, s'élevant à plus de 9 000 mètres depuis le fond de l'océan Pacifique."),
            en = LocalizedContent("What is the largest volcano in the world?", listOf("Mauna Loa", "Mount Everest", "Krakatoa", "Vesuvius"), "Science", "Mauna Loa, located in Hawaii, is the largest volcano in the world by volume and area, rising over 9,000 meters from the floor of the Pacific Ocean."),
            zh = LocalizedContent("世界上最大的火山是什么？", listOf("莫纳罗亚火山", "珠穆朗玛峰", "喀拉喀托火山", "维苏威火山"), "科学", "莫纳罗亚火山位于夏威夷，是体积和面积上最大的火山，从太平洋海底升起超过9000米。"),
            es = LocalizedContent("¿Cuál es el volcán más grande del mundo?", listOf("Mauna Loa", "Monte Everest", "Krakatoa", "Vesubio"), "Ciencia", "Mauna Loa, ubicado en Hawái, es el volcán más grande del mundo en volumen y área, elevándose más de 9.000 metros desde el fondo del océano Pacífico.")
        ),
        BilingualQuestion(
            id = 8606, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le proton?", listOf("Ernest Rutherford", "James Chadwick", "Niels Bohr", "Max Planck"), "Science", "Ernest Rutherford a découvert le proton en 1919 lors de ses expériences de bombardement de l'azote avec des particules alpha."),
            en = LocalizedContent("Which scientist discovered the proton?", listOf("Ernest Rutherford", "James Chadwick", "Niels Bohr", "Max Planck"), "Science", "Ernest Rutherford discovered the proton in 1919 during his experiments bombarding nitrogen with alpha particles."),
            zh = LocalizedContent("哪位科学家发现了质子？", listOf("欧内斯特·卢瑟福", "詹姆斯·查德威克", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "欧内斯特·卢瑟福于1919年在用α粒子轰击氮的实验中发现了质子。"),
            es = LocalizedContent("¿Qué científico descubrió el protón?", listOf("Ernest Rutherford", "James Chadwick", "Niels Bohr", "Max Planck"), "Ciencia", "Ernest Rutherford descubrió el protón en 1919 durante sus experimentos bombardeando nitrógeno con partículas alfa.")
        ),
        BilingualQuestion(
            id = 8607, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du tantale?", listOf("Ta", "T", "Tb", "Tc"), "Science", "Le tantale tire son symbole Ta de son nom latin, Tantalum. Il est utilisé dans l'industrie électronique pour ses condensateurs."),
            en = LocalizedContent("What is the chemical symbol for tantalum?", listOf("Ta", "T", "Tb", "Tc"), "Science", "Tantalum derives its symbol Ta from its Latin name Tantalum. It is used in the electronics industry for its capacitors."),
            zh = LocalizedContent("钽的化学符号是什么？", listOf("Ta", "T", "Tb", "Tc"), "科学", "钽的符号Ta来自其拉丁名Tantalum。它用于电子工业中的电容器。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tantalio?", listOf("Ta", "T", "Tb", "Tc"), "Ciencia", "El tantalio deriva su símbolo Ta de su nombre latino Tantalum. Se utiliza en la industria electrónica por sus condensadores.")
        ),
        BilingualQuestion(
            id = 8608, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de muscles faciaux a un humain?", listOf("43", "30", "50", "60"), "Science", "Le visage humain compte 43 muscles, responsables des expressions faciales comme le sourire ou le froncement de sourcils."),
            en = LocalizedContent("How many facial muscles does a human have?", listOf("43", "30", "50", "60"), "Science", "The human face has 43 muscles, responsible for facial expressions such as smiling or frowning."),
            zh = LocalizedContent("人类有多少块面部肌肉？", listOf("43", "30", "50", "60"), "科学", "人类面部有43块肌肉，负责微笑或皱眉等面部表情。"),
            es = LocalizedContent("¿Cuántos músculos faciales tiene un humano?", listOf("43", "30", "50", "60"), "Ciencia", "El rostro humano tiene 43 músculos, responsables de expresiones faciales como sonreír o fruncir el ceño.")
        ),
        BilingualQuestion(
            id = 8609, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel élément chimique est le plus lourd dans le tableau périodique?", listOf("Oganesson", "Livermorium", "Flerovium", "Copernicium"), "Science", "L'oganesson (Og) est l'élément le plus lourd connu, avec un numéro atomique de 118. Synthétisé en 2002, il est instable et se désintègre rapidement."),
            en = LocalizedContent("Which chemical element is the heaviest in the periodic table?", listOf("Oganesson", "Livermorium", "Flerovium", "Copernicium"), "Science", "Oganesson (Og) is the heaviest known element, with atomic number 118. Synthesized in 2002, it is unstable and decays rapidly."),
            zh = LocalizedContent("元素周期表中哪种化学元素最重？", listOf("奥气", "𬬻", "𫓧", "鎶"), "科学", "奥气（Og）是已知最重的元素，原子序数为118。它于2002年合成，不稳定且迅速衰变。"),
            es = LocalizedContent("¿Qué elemento químico es el más pesado en la tabla periódica?", listOf("Oganesón", "Livermorio", "Flerovio", "Copernicio"), "Ciencia", "El oganesón (Og) es el elemento más pesado conocido, con número atómico 118. Sintetizado en 2002, es inestable y se desintegra rápidamente.")
        ),
        BilingualQuestion(
            id = 8610, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la charge élémentaire?", listOf("1.602 × 10⁻¹⁹ C", "9.109 × 10⁻³¹ C", "6.626 × 10⁻³⁴ C", "1.673 × 10⁻²⁷ C"), "Science", "La charge élémentaire, notée e, est la charge électrique d'un seul proton ou d'un électron. Elle vaut environ 1,602 × 10⁻¹⁹ coulombs."),
            en = LocalizedContent("What is the elementary charge?", listOf("1.602 × 10⁻¹⁹ C", "9.109 × 10⁻³¹ C", "6.626 × 10⁻³⁴ C", "1.673 × 10⁻²⁷ C"), "Science", "The elementary charge, denoted e, is the electric charge of a single proton or electron. It is approximately 1.602 × 10⁻¹⁹ coulombs."),
            zh = LocalizedContent("基本电荷是多少？", listOf("1.602 × 10⁻¹⁹ C", "9.109 × 10⁻³¹ C", "6.626 × 10⁻³⁴ C", "1.673 × 10⁻²⁷ C"), "科学", "基本电荷，记作 e，是单个质子或电子的电荷量。其值约为 1.602 × 10⁻¹⁹ 库仑。"),
            es = LocalizedContent("¿Cuál es la carga elemental?", listOf("1.602 × 10⁻¹⁹ C", "9.109 × 10⁻³¹ C", "6.626 × 10⁻³⁴ C", "1.673 × 10⁻²⁷ C"), "Ciencia", "La carga elemental, denotada e, es la carga eléctrica de un solo protón o electrón. Vale aproximadamente 1.602 × 10⁻¹⁹ culombios.")
        ),
        BilingualQuestion(
            id = 8611, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le pôle magnétique?", listOf("Christophe Colomb", "Zheng He", "Vasco de Gama", "Ferdinand Magellan"), "Science", "Ferdinand Magellan a observé la déviation de l'aiguille de la boussole lors de son expédition autour du monde, ce qui a conduit à la découverte du pôle magnétique terrestre."),
            en = LocalizedContent("Which scientist discovered the magnetic pole?", listOf("Christopher Columbus", "Zheng He", "Vasco da Gama", "Ferdinand Magellan"), "Science", "Ferdinand Magellan observed the deviation of the compass needle during his circumnavigation, leading to the discovery of Earth's magnetic pole."),
            zh = LocalizedContent("哪位科学家发现了磁极？", listOf("克里斯托弗·哥伦布", "郑和", "瓦斯科·达·伽马", "斐迪南·麦哲伦"), "科学", "斐迪南·麦哲伦在环球航行中观察到罗盘指针的偏差，从而发现了地球的磁极。"),
            es = LocalizedContent("¿Qué científico descubrió el polo magnético?", listOf("Cristóbal Colón", "Zheng He", "Vasco de Gama", "Fernando de Magallanes"), "Ciencia", "Fernando de Magallanes observó la desviación de la aguja de la brújula durante su circunnavegación, lo que llevó al descubrimiento del polo magnético terrestre.")
        ),
        BilingualQuestion(
            id = 8612, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du rhénium?", listOf("Re", "Rh", "Rb", "Rf"), "Science", "Le rhénium, élément de numéro atomique 75, tire son symbole Re de son nom latin Rhenium, dérivé du Rhin."),
            en = LocalizedContent("What is the chemical symbol for rhenium?", listOf("Re", "Rh", "Rb", "Rf"), "Science", "Rhenium, element with atomic number 75, derives its symbol Re from its Latin name Rhenium, named after the Rhine."),
            zh = LocalizedContent("铼的化学符号是什么？", listOf("Re", "Rh", "Rb", "Rf"), "科学", "铼，原子序数75，其符号Re源自拉丁名Rhenium，以莱茵河命名。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del renio?", listOf("Re", "Rh", "Rb", "Rf"), "Ciencia", "El renio, elemento de número atómico 75, toma su símbolo Re de su nombre latino Rhenium, derivado del Rin.")
        ),
        BilingualQuestion(
            id = 8613, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la longueur de l'ADN humain?", listOf("2 mètres", "1 mètre", "3 mètres", "0.5 mètres"), "Science", "L'ADN humain, si on déroule toutes ses molécules contenues dans une seule cellule, mesure environ 2 mètres de long. Cette longueur est rendue possible par un compactage extrême dans le noyau cellulaire."),
            en = LocalizedContent("What is the length of human DNA?", listOf("2 meters", "1 meter", "3 meters", "0.5 meters"), "Science", "Human DNA, if all molecules in a single cell were unrolled, measures about 2 meters in length. This is achieved through extreme compaction in the cell nucleus."),
            zh = LocalizedContent("人类DNA的长度是多少？", listOf("2米", "1米", "3米", "0.5米"), "科学", "人类DNA，如果将单个细胞中的所有分子展开，长度约为2米。这是通过细胞核内的极度压缩实现的。"),
            es = LocalizedContent("¿Cuál es la longitud del ADN humano?", listOf("2 metros", "1 metro", "3 metros", "0.5 metros"), "Ciencia", "El ADN humano, si se desenrollan todas sus moléculas en una sola célula, mide aproximadamente 2 metros de largo. Esto es posible gracias a un empaquetamiento extremo en el núcleo celular.")
        ),
        BilingualQuestion(
            id = 8614, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la testostérone?", listOf("Testicule", "Prostate", "Glande de Cowper", "Ovaire"), "Science", "Les testicules sont les glandes sexuelles masculines principales, responsables de la production de testostérone, l'hormone clé du développement masculin."),
            en = LocalizedContent("Which gland produces testosterone?", listOf("Testicle", "Prostate", "Cowper's gland", "Ovary"), "Science", "The testicles are the primary male sex glands, responsible for producing testosterone, the key hormone for male development."),
            zh = LocalizedContent("哪个腺体产生睾酮？", listOf("睾丸", "前列腺", "考珀腺", "卵巢"), "科学", "睾丸是主要的男性性腺，负责产生睾酮，这是男性发育的关键激素。"),
            es = LocalizedContent("¿Qué glándula produce testosterona?", listOf("Testículo", "Próstata", "Glándula de Cowper", "Ovario"), "Ciencia", "Los testículos son las glándulas sexuales masculinas principales, responsables de la producción de testosterona, la hormona clave del desarrollo masculino.")
        ),
        BilingualQuestion(
            id = 8615, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand astéroïde du système solaire?", listOf("Cérès", "Vesta", "Pallas", "Junon"), "Science", "Cérès, d'environ 940 km de diamètre, est le plus grand astéroïde de la ceinture principale entre Mars et Jupiter, et il est également classé comme planète naine."),
            en = LocalizedContent("What is the largest asteroid in the solar system?", listOf("Ceres", "Vesta", "Pallas", "Juno"), "Science", "Ceres, about 940 km in diameter, is the largest asteroid in the main belt between Mars and Jupiter, and is also classified as a dwarf planet."),
            zh = LocalizedContent("太阳系中最大的小行星是什么？", listOf("谷神星", "灶神星", "智神星", "婚神星"), "科学", "谷神星直径约940公里，是火星和木星之间主小行星带中最大的小行星，也被归类为矮行星。"),
            es = LocalizedContent("¿Cuál es el asteroide más grande del sistema solar?", listOf("Ceres", "Vesta", "Pallas", "Juno"), "Ciencia", "Ceres, con unos 940 km de diámetro, es el asteroide más grande del cinturón principal entre Marte y Júpiter, y también está clasificado como planeta enano.")
        ),
        BilingualQuestion(
            id = 8616, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a théorisé le big bang?", listOf("Georges Lemaître", "Edwin Hubble", "Stephen Hawking", "Albert Einstein"), "Science", "Georges Lemaître, un chanoine et astrophysicien belge, a proposé en 1927 la théorie de l'atome primitif, qui est devenue la base du modèle du Big Bang."),
            en = LocalizedContent("Which scientist theorized the Big Bang?", listOf("Georges Lemaître", "Edwin Hubble", "Stephen Hawking", "Albert Einstein"), "Science", "Georges Lemaître, a Belgian priest and astrophysicist, proposed in 1927 the theory of the primeval atom, which became the basis of the Big Bang model."),
            zh = LocalizedContent("哪位科学家提出了大爆炸理论？", listOf("乔治·勒梅特", "埃德温·哈勃", "斯蒂芬·霍金", "阿尔伯特·爱因斯坦"), "科学", "乔治·勒梅特，一位比利时神父和天体物理学家，于1927年提出了原始原子理论，这成为大爆炸模型的基础。"),
            es = LocalizedContent("¿Qué científico teorizó el Big Bang?", listOf("Georges Lemaître", "Edwin Hubble", "Stephen Hawking", "Albert Einstein"), "Ciencia", "Georges Lemaître, un canónigo y astrofísico belga, propuso en 1927 la teoría del átomo primitivo, que se convirtió en la base del modelo del Big Bang.")
        ),
        BilingualQuestion(
            id = 8617, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du vanadium?", listOf("V", "Va", "Vb", "Vc"), "Science", "Le symbole chimique du vanadium est V, car il dérive de son nom latin \"Vanadium\". C'est un métal de transition utilisé dans les alliages d'acier."),
            en = LocalizedContent("What is the chemical symbol for vanadium?", listOf("V", "Va", "Vb", "Vc"), "Science", "The chemical symbol for vanadium is V, derived from its Latin name 'Vanadium'. It is a transition metal used in steel alloys."),
            zh = LocalizedContent("钒的化学符号是什么？", listOf("V", "Va", "Vb", "Vc"), "科学", "钒的化学符号是V，源自其拉丁名'Vanadium'。它是一种过渡金属，用于钢合金。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del vanadio?", listOf("V", "Va", "Vb", "Vc"), "Ciencia", "El símbolo químico del vanadio es V, derivado de su nombre latino 'Vanadium'. Es un metal de transición utilizado en aleaciones de acero.")
        ),
        BilingualQuestion(
            id = 8618, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de chromosomes a une cellule de levure?", listOf("16", "23", "46", "8"), "Science", "La levure de boulanger (Saccharomyces cerevisiae) possède 16 chromosomes, ce qui en fait un organisme modèle simple pour la recherche en génétique."),
            en = LocalizedContent("How many chromosomes does a yeast cell have?", listOf("16", "23", "46", "8"), "Science", "Baker's yeast (Saccharomyces cerevisiae) has 16 chromosomes, making it a simple model organism for genetic research."),
            zh = LocalizedContent("一个酵母细胞有多少条染色体？", listOf("16", "23", "46", "8"), "科学", "面包酵母（酿酒酵母）有16条染色体，使其成为遗传学研究的简单模式生物。"),
            es = LocalizedContent("¿Cuántos cromosomas tiene una célula de levadura?", listOf("16", "23", "46", "8"), "Ciencia", "La levadura de panadería (Saccharomyces cerevisiae) posee 16 cromosomas, lo que la convierte en un organismo modelo simple para la investigación genética.")
        ),
        BilingualQuestion(
            id = 8619, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus conducteur de l'électricité?", listOf("Argent", "Cuivre", "Or", "Aluminium"), "Science", "L'argent possède la plus haute conductivité électrique de tous les métaux, car ses électrons libres se déplacent avec une très faible résistance."),
            en = LocalizedContent("Which chemical element is the best conductor of electricity?", listOf("Silver", "Copper", "Gold", "Aluminum"), "Science", "Silver has the highest electrical conductivity of all metals, as its free electrons move with very low resistance."),
            zh = LocalizedContent("哪种化学元素导电性最好？", listOf("银", "铜", "金", "铝"), "科学", "银在所有金属中具有最高的导电性，因为其自由电子移动时电阻非常低。"),
            es = LocalizedContent("¿Qué elemento químico es el mejor conductor de la electricidad?", listOf("Plata", "Cobre", "Oro", "Aluminio"), "Ciencia", "La plata posee la conductividad eléctrica más alta de todos los metales, ya que sus electrones libres se mueven con una resistencia muy baja.")
        ),
        BilingualQuestion(
            id = 8620, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la masse du proton?", listOf("1.673 × 10⁻²⁷ kg", "9.109 × 10⁻³¹ kg", "1.675 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg"), "Science", "Le proton, particule subatomique du noyau atomique, a une masse d'environ 1,673 × 10⁻²⁷ kg, soit 1836 fois celle de l'électron. Cette valeur est une constante fondamentale en physique."),
            en = LocalizedContent("What is the mass of the proton?", listOf("1.673 × 10⁻²⁷ kg", "9.109 × 10⁻³¹ kg", "1.675 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg"), "Science", "The proton, a subatomic particle in the atomic nucleus, has a mass of about 1.673 × 10⁻²⁷ kg, which is 1836 times that of the electron. This value is a fundamental constant in physics."),
            zh = LocalizedContent("质子的质量是多少？", listOf("1.673 × 10⁻²⁷ kg", "9.109 × 10⁻³¹ kg", "1.675 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg"), "科学", "质子是原子核中的亚原子粒子，质量约为1.673 × 10⁻²⁷ kg，是电子质量的1836倍。该值是物理学中的基本常数。"),
            es = LocalizedContent("¿Cuál es la masa del protón?", listOf("1.673 × 10⁻²⁷ kg", "9.109 × 10⁻³¹ kg", "1.675 × 10⁻²⁷ kg", "6.642 × 10⁻²⁷ kg"), "Ciencia", "El protón, una partícula subatómica del núcleo atómico, tiene una masa de aproximadamente 1,673 × 10⁻²⁷ kg, 1836 veces la del electrón. Este valor es una constante fundamental en física.")
        ),
        BilingualQuestion(
            id = 8621, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la fission nucléaire?", listOf("Lise Meitner et Otto Frisch", "Enrico Fermi", "J. Robert Oppenheimer", "Richard Feynman"), "Science", "Lise Meitner et Otto Frisch ont interprété les résultats des expériences d'Otto Hahn et Fritz Strassmann en 1938, démontrant la division du noyau d'uranium."),
            en = LocalizedContent("Which scientist discovered nuclear fission?", listOf("Lise Meitner and Otto Frisch", "Enrico Fermi", "J. Robert Oppenheimer", "Richard Feynman"), "Science", "Lise Meitner and Otto Frisch interpreted the results of experiments by Otto Hahn and Fritz Strassmann in 1938, demonstrating the splitting of the uranium nucleus."),
            zh = LocalizedContent("哪位科学家发现了核裂变？", listOf("莉泽·迈特纳和奥托·弗里施", "恩里科·费米", "J. 罗伯特·奥本海默", "理查德·费曼"), "科学", "莉泽·迈特纳和奥托·弗里施在1938年解释了奥托·哈恩和弗里茨·斯特拉斯曼的实验结果，证明了铀核的分裂。"),
            es = LocalizedContent("¿Qué científico descubrió la fisión nuclear?", listOf("Lise Meitner y Otto Frisch", "Enrico Fermi", "J. Robert Oppenheimer", "Richard Feynman"), "Ciencia", "Lise Meitner y Otto Frisch interpretaron los resultados de los experimentos de Otto Hahn y Fritz Strassmann en 1938, demostrando la división del núcleo de uranio.")
        ),
        BilingualQuestion(
            id = 8622, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du titane?", listOf("Ti", "T", "Tb", "Tc"), "Science", "Le symbole chimique du titane est Ti, dérivé de son nom latin titanium. Il s'agit d'un métal de transition léger et résistant, utilisé dans les alliages aéronautiques."),
            en = LocalizedContent("What is the chemical symbol for titanium?", listOf("Ti", "T", "Tb", "Tc"), "Science", "The chemical symbol for titanium is Ti, derived from its Latin name titanium. It is a light, strong transition metal used in aerospace alloys."),
            zh = LocalizedContent("钛的化学符号是什么？", listOf("Ti", "T", "Tb", "Tc"), "科学", "钛的化学符号是Ti，源自其拉丁名称titanium。它是一种轻质、坚固的过渡金属，用于航空航天合金。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del titanio?", listOf("Ti", "T", "Tb", "Tc"), "Ciencia", "El símbolo químico del titanio es Ti, derivado de su nombre latino titanium. Es un metal de transición ligero y resistente, utilizado en aleaciones aeroespaciales.")
        ),
        BilingualQuestion(
            id = 8623, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de gènes a le génome humain environ?", listOf("20000-25000", "50000", "100000", "10000"), "Science", "Les premières estimations du nombre de gènes humains étaient bien plus élevées, mais le séquençage complet du génome a révélé qu'il contient environ 20 000 à 25 000 gènes codant des protéines."),
            en = LocalizedContent("How many genes does the human genome have approximately?", listOf("20000-25000", "50000", "100000", "10000"), "Science", "Early estimates of the number of human genes were much higher, but complete genome sequencing revealed that it contains about 20,000 to 25,000 protein-coding genes."),
            zh = LocalizedContent("人类基因组大约有多少个基因？", listOf("20000-25000", "50000", "100000", "10000"), "科学", "早期对人类基因数量的估计要高得多，但完整的基因组测序显示，人类基因组包含大约20,000到25,000个蛋白质编码基因。"),
            es = LocalizedContent("¿Cuántos genes tiene aproximadamente el genoma humano?", listOf("20000-25000", "50000", "100000", "10000"), "Ciencia", "Las estimaciones iniciales del número de genes humanos eran mucho más altas, pero la secuenciación completa del genoma reveló que contiene entre 20 000 y 25 000 genes codificantes de proteínas.")
        ),
        BilingualQuestion(
            id = 8624, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le cortisol?", listOf("Glande surrénale", "Thyroïde", "Hypophyse", "Pancréas"), "Science", "Le cortisol est une hormone stéroïdienne sécrétée par la zone fasciculée du cortex surrénalien, situé dans les glandes surrénales au-dessus des reins."),
            en = LocalizedContent("Which gland produces cortisol?", listOf("Adrenal gland", "Thyroid", "Pituitary gland", "Pancreas"), "Science", "Cortisol is a steroid hormone secreted by the zona fasciculata of the adrenal cortex, located in the adrenal glands above the kidneys."),
            zh = LocalizedContent("哪个腺体产生皮质醇？", listOf("肾上腺", "甲状腺", "垂体", "胰腺"), "科学", "皮质醇是一种类固醇激素，由肾上腺皮质束状带分泌，肾上腺位于肾脏上方。"),
            es = LocalizedContent("¿Qué glándula produce el cortisol?", listOf("Glándula suprarrenal", "Tiroides", "Hipófisis", "Páncreas"), "Ciencia", "El cortisol es una hormona esteroidea secretada por la zona fasciculada de la corteza suprarrenal, ubicada en las glándulas suprarrenales sobre los riñones.")
        ),
        BilingualQuestion(
            id = 8625, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'eau douce du monde?", listOf("Lac Baïkal", "Lac Supérieur", "Lac Victoria", "Lac Tanganyika"), "Science", "Le lac Baïkal, en Sibérie, est le plus grand lac d'eau douce du monde par volume d'eau, contenant environ 20 % des réserves mondiales d'eau douce non gelée."),
            en = LocalizedContent("What is the largest freshwater lake in the world?", listOf("Lake Baikal", "Lake Superior", "Lake Victoria", "Lake Tanganyika"), "Science", "Lake Baikal in Siberia is the largest freshwater lake in the world by volume, containing about 20% of the world's unfrozen freshwater reserves."),
            zh = LocalizedContent("世界上最大的淡水湖是哪个？", listOf("贝加尔湖", "苏必利尔湖", "维多利亚湖", "坦噶尼喀湖"), "科学", "西伯利亚的贝加尔湖是世界上水量最大的淡水湖，约占全球未冻结淡水储量的20%。"),
            es = LocalizedContent("¿Cuál es el lago de agua dulce más grande del mundo?", listOf("Lago Baikal", "Lago Superior", "Lago Victoria", "Lago Tanganyika"), "Ciencia", "El lago Baikal, en Siberia, es el lago de agua dulce más grande del mundo por volumen, y contiene aproximadamente el 20% de las reservas mundiales de agua dulce no congelada.")
        ),
        BilingualQuestion(
            id = 8626, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le boson de Higgs?", listOf("Peter Higgs et François Englert", "Stephen Hawking", "Carl Sagan", "Neil deGrasse Tyson"), "Science", "Le boson de Higgs a été prédit en 1964 par Peter Higgs et François Englert, qui ont reçu le prix Nobel de physique en 2013 pour cette découverte théorique."),
            en = LocalizedContent("Which scientist discovered the Higgs boson?", listOf("Peter Higgs and François Englert", "Stephen Hawking", "Carl Sagan", "Neil deGrasse Tyson"), "Science", "The Higgs boson was predicted in 1964 by Peter Higgs and François Englert, who received the Nobel Prize in Physics in 2013 for this theoretical discovery."),
            zh = LocalizedContent("哪位科学家发现了希格斯玻色子？", listOf("彼得·希格斯和弗朗索瓦·恩格勒", "斯蒂芬·霍金", "卡尔·萨根", "尼尔·德格拉斯·泰森"), "科学", "希格斯玻色子于1964年由彼得·希格斯和弗朗索瓦·恩格勒预测，他们因这一理论发现于2013年获得诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el bosón de Higgs?", listOf("Peter Higgs y François Englert", "Stephen Hawking", "Carl Sagan", "Neil deGrasse Tyson"), "Ciencia", "El bosón de Higgs fue predicho en 1964 por Peter Higgs y François Englert, quienes recibieron el Premio Nobel de Física en 2013 por este descubrimiento teórico.")
        ),
        BilingualQuestion(
            id = 8627, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du chrome?", listOf("Cr", "C", "Co", "Cu"), "Science", "Le symbole chimique du chrome, Cr, vient du latin \"chromium\", dérivé du grec \"chroma\" signifiant couleur, en raison des composés colorés de cet élément."),
            en = LocalizedContent("What is the chemical symbol for chromium?", listOf("Cr", "C", "Co", "Cu"), "Science", "The chemical symbol for chromium is Cr, from the Latin 'chromium', derived from Greek 'chroma' meaning color, due to the colored compounds of this element."),
            zh = LocalizedContent("铬的化学符号是什么？", listOf("Cr", "C", "Co", "Cu"), "科学", "铬的化学符号是Cr，源自拉丁语'chromium'，源于希腊语'chroma'意为颜色，因为该元素的化合物具有颜色。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cromo?", listOf("Cr", "C", "Co", "Cu"), "Ciencia", "El símbolo químico del cromo es Cr, del latín 'chromium', derivado del griego 'chroma' que significa color, debido a los compuestos coloreados de este elemento.")
        ),
        BilingualQuestion(
            id = 8628, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la température du centre de la Terre?", listOf("6000°C", "3000°C", "9000°C", "4000°C"), "Science", "Le noyau terrestre, composé principalement de fer et de nickel, atteint environ 6000°C, soit une température similaire à celle de la surface du Soleil."),
            en = LocalizedContent("What is the temperature at the center of the Earth?", listOf("6000°C", "3000°C", "9000°C", "4000°C"), "Science", "The Earth's core, composed mainly of iron and nickel, reaches about 6000°C, a temperature similar to the surface of the Sun."),
            zh = LocalizedContent("地球中心的温度是多少？", listOf("6000°C", "3000°C", "9000°C", "4000°C"), "科学", "地球核心主要由铁和镍组成，温度约为6000°C，与太阳表面温度相似。"),
            es = LocalizedContent("¿Cuál es la temperatura en el centro de la Tierra?", listOf("6000°C", "3000°C", "9000°C", "4000°C"), "Ciencia", "El núcleo terrestre, compuesto principalmente de hierro y níquel, alcanza unos 6000°C, una temperatura similar a la de la superficie del Sol.")
        ),
        BilingualQuestion(
            id = 8629, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique est le plus léger?", listOf("Hydrogène", "Hélium", "Lithium", "Béryllium"), "Science", "L'hydrogène est l'élément le plus léger car son noyau ne contient qu'un seul proton, ce qui lui donne une masse atomique d'environ 1,008 u."),
            en = LocalizedContent("Which chemical element is the lightest?", listOf("Hydrogen", "Helium", "Lithium", "Beryllium"), "Science", "Hydrogen is the lightest element because its nucleus contains only one proton, giving it an atomic mass of about 1.008 u."),
            zh = LocalizedContent("哪种化学元素最轻？", listOf("氢", "氦", "锂", "铍"), "科学", "氢是最轻的元素，因为其原子核只有一个质子，原子质量约为1.008 u。"),
            es = LocalizedContent("¿Qué elemento químico es el más ligero?", listOf("Hidrógeno", "Helio", "Litio", "Berilio"), "Ciencia", "El hidrógeno es el elemento más ligero porque su núcleo contiene solo un protón, lo que le da una masa atómica de aproximadamente 1,008 u.")
        ),
        BilingualQuestion(
            id = 8630, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert les ondes électromagnétiques?", listOf("James Clerk Maxwell", "Michael Faraday", "Heinrich Hertz", "Nikola Tesla"), "Science", "James Clerk Maxwell a formulé les équations unifiant électricité et magnétisme, prédisant l'existence des ondes électromagnétiques en 1865."),
            en = LocalizedContent("Which scientist discovered electromagnetic waves?", listOf("James Clerk Maxwell", "Michael Faraday", "Heinrich Hertz", "Nikola Tesla"), "Science", "James Clerk Maxwell formulated the equations unifying electricity and magnetism, predicting the existence of electromagnetic waves in 1865."),
            zh = LocalizedContent("哪位科学家发现了电磁波？", listOf("詹姆斯·克拉克·麦克斯韦", "迈克尔·法拉第", "海因里希·赫兹", "尼古拉·特斯拉"), "科学", "詹姆斯·克拉克·麦克斯韦提出了统一电和磁的方程，于1865年预言了电磁波的存在。"),
            es = LocalizedContent("¿Qué científico descubrió las ondas electromagnéticas?", listOf("James Clerk Maxwell", "Michael Faraday", "Heinrich Hertz", "Nikola Tesla"), "Ciencia", "James Clerk Maxwell formuló las ecuaciones que unifican electricidad y magnetismo, prediciendo la existencia de ondas electromagnéticas en 1865.")
        ),
        BilingualQuestion(
            id = 8631, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du cobalt?", listOf("Co", "C", "Cb", "Cn"), "Science", "Le symbole chimique du cobalt provient de son nom latin \"cobaltum\". Il est utilisé dans les aimants et les batteries."),
            en = LocalizedContent("What is the chemical symbol for cobalt?", listOf("Co", "C", "Cb", "Cn"), "Science", "The chemical symbol for cobalt comes from its Latin name 'cobaltum'. It is used in magnets and batteries."),
            zh = LocalizedContent("钴的化学符号是什么？", listOf("Co", "C", "Cb", "Cn"), "科学", "钴的化学符号源自其拉丁名'cobaltum'，用于磁铁和电池。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cobalto?", listOf("Co", "C", "Cb", "Cn"), "Ciencia", "El símbolo químico del cobalto proviene de su nombre latino 'cobaltum'. Se utiliza en imanes y baterías.")
        ),
        BilingualQuestion(
            id = 8632, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de paires de chromosomes a un humain?", listOf("23", "24", "22", "25"), "Science", "Les humains possèdent 23 paires de chromosomes, soit 46 au total, dont 22 paires autosomiques et une paire de chromosomes sexuels."),
            en = LocalizedContent("How many pairs of chromosomes does a human have?", listOf("23", "24", "22", "25"), "Science", "Humans have 23 pairs of chromosomes, 46 in total, including 22 autosomal pairs and one pair of sex chromosomes."),
            zh = LocalizedContent("人类有多少对染色体？", listOf("23", "24", "22", "25"), "科学", "人类有23对染色体，共46条，包括22对常染色体和一对性染色体。"),
            es = LocalizedContent("¿Cuántos pares de cromosomas tiene un humano?", listOf("23", "24", "22", "25"), "Ciencia", "Los humanos tienen 23 pares de cromosomas, 46 en total, incluyendo 22 pares autosómicos y un par de cromosomas sexuales.")
        ),
        BilingualQuestion(
            id = 8633, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la parathormone?", listOf("Glande parathyroïde", "Thyroïde", "Hypophyse", "Surrénale"), "Science", "La glande parathyroïde produit la parathormone, qui régule le taux de calcium dans le sang."),
            en = LocalizedContent("Which gland produces parathyroid hormone?", listOf("Parathyroid gland", "Thyroid", "Pituitary", "Adrenal"), "Science", "The parathyroid gland produces parathyroid hormone, which regulates blood calcium levels."),
            zh = LocalizedContent("哪个腺体产生甲状旁腺激素？", listOf("甲状旁腺", "甲状腺", "垂体", "肾上腺"), "科学", "甲状旁腺产生甲状旁腺激素，调节血钙水平。"),
            es = LocalizedContent("¿Qué glándula produce la hormona paratiroidea?", listOf("Glándula paratiroides", "Tiroides", "Hipófisis", "Suprarrenal"), "Ciencia", "La glándula paratiroides produce la hormona paratiroidea, que regula los niveles de calcio en la sangre.")
        ),
        BilingualQuestion(
            id = 8634, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand nuage de gaz du système solaire?", listOf("Grande Tache Rouge de Jupiter", "Tempête de Saturne", "Atmosphère de Neptune", "Atmosphère d'Uranus"), "Science", "La Grande Tache Rouge de Jupiter est une gigantesque tempête anticyclonique composée de gaz, plus vaste que la Terre, qui dure depuis au moins 350 ans."),
            en = LocalizedContent("What is the largest gas cloud in the solar system?", listOf("Jupiter's Great Red Spot", "Saturn's storm", "Neptune's atmosphere", "Uranus's atmosphere"), "Science", "Jupiter's Great Red Spot is a giant anticyclonic storm made of gas, larger than Earth, lasting at least 350 years."),
            zh = LocalizedContent("太阳系中最大的气体云是什么？", listOf("木星大红斑", "土星风暴", "海王星大气层", "天王星大气层"), "科学", "木星大红斑是一个巨大的反气旋风暴，由气体组成，比地球还大，至少持续了350年。"),
            es = LocalizedContent("¿Cuál es la nube de gas más grande del sistema solar?", listOf("Gran Mancha Roja de Júpiter", "Tormenta de Saturno", "Atmósfera de Neptuno", "Atmósfera de Urano"), "Ciencia", "La Gran Mancha Roja de Júpiter es una gigantesca tormenta anticiclónica compuesta de gas, más grande que la Tierra, que dura al menos 350 años.")
        ),
        BilingualQuestion(
            id = 8635, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert les lois de Kepler?", listOf("Johannes Kepler", "Tycho Brahe", "Galileo Galilei", "Isaac Newton"), "Science", "Johannes Kepler a formulé ses trois lois décrivant le mouvement des planètes autour du Soleil au début du 17e siècle, en se basant sur les observations précises de Tycho Brahe."),
            en = LocalizedContent("Which scientist discovered Kepler's laws?", listOf("Johannes Kepler", "Tycho Brahe", "Galileo Galilei", "Isaac Newton"), "Science", "Johannes Kepler formulated his three laws describing planetary motion around the Sun in the early 17th century, based on Tycho Brahe's precise observations."),
            zh = LocalizedContent("哪位科学家发现了开普勒定律？", listOf("约翰内斯·开普勒", "第谷·布拉赫", "伽利略·伽利雷", "艾萨克·牛顿"), "科学", "约翰内斯·开普勒在17世纪初基于第谷·布拉赫的精确观测，提出了描述行星绕太阳运动的三条定律。"),
            es = LocalizedContent("¿Qué científico descubrió las leyes de Kepler?", listOf("Johannes Kepler", "Tycho Brahe", "Galileo Galilei", "Isaac Newton"), "Ciencia", "Johannes Kepler formuló sus tres leyes que describen el movimiento de los planetas alrededor del Sol a principios del siglo XVII, basándose en las observaciones precisas de Tycho Brahe.")
        ),
        BilingualQuestion(
            id = 8636, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du cadmium?", listOf("Cd", "C", "Ca", "Ce"), "Science", "Le cadmium est un métal de transition dont le symbole chimique Cd provient de son nom latin, \"cadmia\". Il est utilisé dans les batteries et les pigments."),
            en = LocalizedContent("What is the chemical symbol for cadmium?", listOf("Cd", "C", "Ca", "Ce"), "Science", "Cadmium is a transition metal whose chemical symbol Cd comes from its Latin name 'cadmia'. It is used in batteries and pigments."),
            zh = LocalizedContent("镉的化学符号是什么？", listOf("Cd", "C", "Ca", "Ce"), "科学", "镉是一种过渡金属，其化学符号Cd源自拉丁名'cadmia'，用于电池和颜料。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cadmio?", listOf("Cd", "C", "Ca", "Ce"), "Ciencia", "El cadmio es un metal de transición cuyo símbolo químico Cd proviene de su nombre latino 'cadmia'. Se utiliza en baterías y pigmentos.")
        ),
        BilingualQuestion(
            id = 8637, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la concentration de l'ADN dans le noyau cellulaire?", listOf("3 mg/cm³", "1 mg/cm³", "5 mg/cm³", "0.5 mg/cm³"), "Science", "La concentration d'ADN dans le noyau est d'environ 3 mg/cm³, une densité remarquable qui permet de stocker deux mètres d'ADN dans un noyau de quelques micromètres."),
            en = LocalizedContent("What is the concentration of DNA in the cell nucleus?", listOf("3 mg/cm³", "1 mg/cm³", "5 mg/cm³", "0.5 mg/cm³"), "Science", "The concentration of DNA in the nucleus is about 3 mg/cm³, a remarkable density that allows two meters of DNA to be stored in a nucleus of a few micrometers."),
            zh = LocalizedContent("细胞核中DNA的浓度是多少？", listOf("3 mg/cm³", "1 mg/cm³", "5 mg/cm³", "0.5 mg/cm³"), "科学", "细胞核中DNA的浓度约为3 mg/cm³，这种惊人的密度使得两米长的DNA能够储存在几微米的细胞核中。"),
            es = LocalizedContent("¿Cuál es la concentración de ADN en el núcleo celular?", listOf("3 mg/cm³", "1 mg/cm³", "5 mg/cm³", "0.5 mg/cm³"), "Ciencia", "La concentración de ADN en el núcleo es de aproximadamente 3 mg/cm³, una densidad notable que permite almacenar dos metros de ADN en un núcleo de unos pocos micrómetros.")
        ),
        BilingualQuestion(
            id = 8638, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus dense?", listOf("Osmium", "Iridium", "Platine", "Tungstène"), "Science", "L'osmium est l'élément le plus dense à température ambiante, avec une densité d'environ 22,59 g/cm³, surpassant légèrement l'iridium."),
            en = LocalizedContent("Which chemical element is the densest?", listOf("Osmium", "Iridium", "Platinum", "Tungsten"), "Science", "Osmium is the densest element at room temperature, with a density of about 22.59 g/cm³, slightly surpassing iridium."),
            zh = LocalizedContent("哪种化学元素密度最大？", listOf("锇", "铱", "铂", "钨"), "科学", "锇是室温下密度最大的元素，密度约为22.59 g/cm³，略高于铱。"),
            es = LocalizedContent("¿Qué elemento químico es el más denso?", listOf("Osmio", "Iridio", "Platino", "Tungsteno"), "Ciencia", "El osmio es el elemento más denso a temperatura ambiente, con una densidad de aproximadamente 22.59 g/cm³, superando ligeramente al iridio.")
        ),
        BilingualQuestion(
            id = 8639, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'indice de réfraction?", listOf("Willebrord Snell", "Christiaan Huygens", "Isaac Newton", "René Descartes"), "Science", "Willebrord Snell, un astronome et mathématicien néerlandais, a formulé en 1621 la loi mathématique décrivant la réfraction de la lumière, connue aujourd'hui sous le nom de loi de Snell-Descartes."),
            en = LocalizedContent("Which scientist discovered the refractive index?", listOf("Willebrord Snell", "Christiaan Huygens", "Isaac Newton", "René Descartes"), "Science", "Willebrord Snell, a Dutch astronomer and mathematician, formulated in 1621 the mathematical law describing light refraction, now known as Snell's law."),
            zh = LocalizedContent("哪位科学家发现了折射率？", listOf("威里布里德·斯涅尔", "克里斯蒂安·惠更斯", "艾萨克·牛顿", "勒内·笛卡尔"), "科学", "荷兰天文学家和数学家威里布里德·斯涅尔于1621年提出了描述光折射的数学定律，即现在的斯涅尔定律。"),
            es = LocalizedContent("¿Qué científico descubrió el índice de refracción?", listOf("Willebrord Snell", "Christiaan Huygens", "Isaac Newton", "René Descartes"), "Ciencia", "Willebrord Snell, astrónomo y matemático neerlandés, formuló en 1621 la ley matemática que describe la refracción de la luz, conocida hoy como ley de Snell.")
        ),
        BilingualQuestion(
            id = 8640, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du rhénium?", listOf("Re", "Rh", "Rf", "Rb"), "Science", "Le rhénium, élément de numéro atomique 75, tire son symbole Re de son nom latin Rhenium, dérivé du Rhin."),
            en = LocalizedContent("What is the chemical symbol for rhenium?", listOf("Re", "Rh", "Rf", "Rb"), "Science", "Rhenium, element atomic number 75, derives its symbol Re from its Latin name Rhenium, named after the Rhine."),
            zh = LocalizedContent("铼的化学符号是什么？", listOf("Re", "Rh", "Rf", "Rb"), "科学", "铼，原子序数75，其符号Re源自拉丁名Rhenium，以莱茵河命名。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del renio?", listOf("Re", "Rh", "Rf", "Rb"), "Ciencia", "El renio, elemento de número atómico 75, toma su símbolo Re de su nombre latino Rhenium, derivado del Rin.")
        ),
        BilingualQuestion(
            id = 8641, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules a le corps humain environ?", listOf("37 trillions", "100 trillions", "10 trillions", "50 trillions"), "Science", "Le corps humain adulte est composé d'environ 37 trillions de cellules, un nombre estimé par des études scientifiques basées sur des modèles de taille et de densité cellulaires."),
            en = LocalizedContent("How many cells does the human body have approximately?", listOf("37 trillion", "100 trillion", "10 trillion", "50 trillion"), "Science", "The adult human body is composed of about 37 trillion cells, a number estimated by scientific studies based on cell size and density models."),
            zh = LocalizedContent("人体大约有多少个细胞？", listOf("37万亿", "100万亿", "10万亿", "50万亿"), "科学", "成年人体由约37万亿个细胞组成，这一数字是通过基于细胞大小和密度模型的科学研究估算得出的。"),
            es = LocalizedContent("¿Cuántas células tiene aproximadamente el cuerpo humano?", listOf("37 billones", "100 billones", "10 billones", "50 billones"), "Ciencia", "El cuerpo humano adulto está compuesto por unos 37 billones de células, número estimado por estudios científicos basados en modelos de tamaño y densidad celular.")
        ),
        BilingualQuestion(
            id = 8642, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit l'œstrogène?", listOf("Ovaire", "Utérus", "Hypophyse", "Thyroïde"), "Science", "L'œstrogène est une hormone sexuelle principalement produite par les ovaires chez la femme, jouant un rôle clé dans le cycle menstruel et la reproduction."),
            en = LocalizedContent("Which gland produces estrogen?", listOf("Ovary", "Uterus", "Pituitary", "Thyroid"), "Science", "Estrogen is a sex hormone primarily produced by the ovaries in women, playing a key role in the menstrual cycle and reproduction."),
            zh = LocalizedContent("哪个腺体产生雌激素？", listOf("卵巢", "子宫", "垂体", "甲状腺"), "科学", "雌激素是一种性激素，主要在女性卵巢中产生，在月经周期和生殖中起关键作用。"),
            es = LocalizedContent("¿Qué glándula produce el estrógeno?", listOf("Ovario", "Útero", "Hipófisis", "Tiroides"), "Ciencia", "El estrógeno es una hormona sexual producida principalmente por los ovarios en la mujer, desempeñando un papel clave en el ciclo menstrual y la reproducción.")
        ),
        BilingualQuestion(
            id = 8643, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand corps céleste du système solaire?", listOf("Soleil", "Jupiter", "Saturne", "Neptune"), "Science", "Le Soleil est une étoile qui contient à lui seul 99,86% de la masse totale du système solaire, ce qui en fait le plus grand corps céleste de notre système."),
            en = LocalizedContent("What is the largest celestial body in the solar system?", listOf("Sun", "Jupiter", "Saturn", "Neptune"), "Science", "The Sun is a star that contains 99.86% of the total mass of the solar system, making it the largest celestial body in our system."),
            zh = LocalizedContent("太阳系中最大的天体是什么？", listOf("太阳", "木星", "土星", "海王星"), "科学", "太阳是一颗恒星，包含了太阳系总质量的99.86%，使其成为我们系统中最大的天体。"),
            es = LocalizedContent("¿Cuál es el cuerpo celeste más grande del sistema solar?", listOf("Sol", "Júpiter", "Saturno", "Neptuno"), "Ciencia", "El Sol es una estrella que contiene el 99.86% de la masa total del sistema solar, lo que lo convierte en el cuerpo celeste más grande de nuestro sistema.")
        ),
        BilingualQuestion(
            id = 8644, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a développé la mécanique quantique?", listOf("Werner Heisenberg et Erwin Schrödinger", "Albert Einstein", "Niels Bohr", "Max Planck"), "Science", "Heisenberg a formulé le principe d'incertitude et la mécanique matricielle, tandis que Schrödinger a développé l'équation d'onde, posant les bases de la mécanique quantique moderne."),
            en = LocalizedContent("Which scientists developed quantum mechanics?", listOf("Werner Heisenberg and Erwin Schrödinger", "Albert Einstein", "Niels Bohr", "Max Planck"), "Science", "Heisenberg formulated the uncertainty principle and matrix mechanics, while Schrödinger developed the wave equation, laying the foundations of modern quantum mechanics."),
            zh = LocalizedContent("哪些科学家发展了量子力学？", listOf("维尔纳·海森堡和埃尔温·薛定谔", "阿尔伯特·爱因斯坦", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "海森堡提出了不确定性原理和矩阵力学，而薛定谔发展了波动方程，为现代量子力学奠定了基础。"),
            es = LocalizedContent("¿Qué científicos desarrollaron la mecánica cuántica?", listOf("Werner Heisenberg y Erwin Schrödinger", "Albert Einstein", "Niels Bohr", "Max Planck"), "Ciencia", "Heisenberg formuló el principio de incertidumbre y la mecánica matricial, mientras que Schrödinger desarrolló la ecuación de onda, sentando las bases de la mecánica cuántica moderna.")
        ),
        BilingualQuestion(
            id = 8645, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du mercure?", listOf("Hg", "Mc", "Mg", "Mn"), "Science", "Hg vient du latin hydrargyrum, qui signifie argent liquide, en référence à l'aspect métallique et liquide du mercure à température ambiante."),
            en = LocalizedContent("What is the chemical symbol for mercury?", listOf("Hg", "Mc", "Mg", "Mn"), "Science", "Hg comes from the Latin hydrargyrum, meaning liquid silver, referring to the metallic and liquid appearance of mercury at room temperature."),
            zh = LocalizedContent("汞的化学符号是什么？", listOf("Hg", "Mc", "Mg", "Mn"), "科学", "Hg源自拉丁语hydrargyrum，意为液态银，指的是汞在室温下呈金属液态的外观。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del mercurio?", listOf("Hg", "Mc", "Mg", "Mn"), "Ciencia", "Hg proviene del latín hydrargyrum, que significa plata líquida, en referencia a la apariencia metálica y líquida del mercurio a temperatura ambiente.")
        ),
        BilingualQuestion(
            id = 8646, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la distance de la Terre à la Lune en nombre de diamètres terrestres?", listOf("30", "10", "50", "20"), "Science", "La distance moyenne Terre-Lune est d'environ 384 400 km, tandis que le diamètre terrestre est d'environ 12 742 km, ce qui donne un rapport d'environ 30."),
            en = LocalizedContent("What is the distance from Earth to the Moon in Earth diameters?", listOf("30", "10", "50", "20"), "Science", "The average Earth-Moon distance is about 384,400 km, while Earth's diameter is about 12,742 km, giving a ratio of about 30."),
            zh = LocalizedContent("地球到月球的距离相当于多少个地球直径？", listOf("30", "10", "50", "20"), "科学", "地月平均距离约为384,400公里，而地球直径约为12,742公里，因此比例约为30。"),
            es = LocalizedContent("¿Cuál es la distancia de la Tierra a la Luna en diámetros terrestres?", listOf("30", "10", "50", "20"), "Ciencia", "La distancia media Tierra-Luna es de unos 384,400 km, mientras que el diámetro terrestre es de unos 12,742 km, lo que da una proporción de aproximadamente 30.")
        ),
        BilingualQuestion(
            id = 8647, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est un semi-conducteur?", listOf("Silicium", "Cuivre", "Fer", "Aluminium"), "Science", "Le silicium est l'élément semi-conducteur le plus utilisé en électronique, car ses propriétés permettent de contrôler le courant électrique, ce qui est essentiel pour les puces et transistors."),
            en = LocalizedContent("Which chemical element is a semiconductor?", listOf("Silicon", "Copper", "Iron", "Aluminum"), "Science", "Silicon is the most widely used semiconductor element in electronics, as its properties allow control of electric current, essential for chips and transistors."),
            zh = LocalizedContent("哪种化学元素是半导体？", listOf("硅", "铜", "铁", "铝"), "科学", "硅是电子学中使用最广泛的半导体元素，其特性允许控制电流，对芯片和晶体管至关重要。"),
            es = LocalizedContent("¿Qué elemento químico es un semiconductor?", listOf("Silicio", "Cobre", "Hierro", "Aluminio"), "Ciencia", "El silicio es el elemento semiconductor más utilizado en electrónica, ya que sus propiedades permiten controlar la corriente eléctrica, esencial para chips y transistores.")
        ),
        BilingualQuestion(
            id = 8648, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le benzène?", listOf("Michael Faraday", "August Kekulé", "Friedrich Wöhler", "Justus Liebig"), "Science", "Michael Faraday a isolé le benzène en 1825 à partir d'huile de gaz d'éclairage, marquant la première identification de ce composé organique fondamental."),
            en = LocalizedContent("Which scientist discovered benzene?", listOf("Michael Faraday", "August Kekulé", "Friedrich Wöhler", "Justus Liebig"), "Science", "Michael Faraday isolated benzene in 1825 from oil gas, marking the first identification of this fundamental organic compound."),
            zh = LocalizedContent("哪位科学家发现了苯？", listOf("迈克尔·法拉第", "奥古斯特·凯库勒", "弗里德里希·维勒", "尤斯图斯·李比希"), "科学", "迈克尔·法拉第于1825年从照明气油中分离出苯，标志着这一基本有机化合物的首次鉴定。"),
            es = LocalizedContent("¿Qué científico descubrió el benceno?", listOf("Michael Faraday", "August Kekulé", "Friedrich Wöhler", "Justus Liebig"), "Ciencia", "Michael Faraday aisló el benceno en 1825 a partir del gas de alumbrado, marcando la primera identificación de este compuesto orgánico fundamental.")
        ),
        BilingualQuestion(
            id = 8649, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du germanium?", listOf("Ge", "G", "Gm", "Gd"), "Science", "Le symbole chimique du germanium est Ge, car il dérive de son nom latin \"Germanium\". Cet élément semi-conducteur est utilisé dans l'industrie électronique et les fibres optiques."),
            en = LocalizedContent("What is the chemical symbol for germanium?", listOf("Ge", "G", "Gm", "Gd"), "Science", "The chemical symbol for germanium is Ge, derived from its Latin name 'Germanium'. This semiconductor element is used in electronics and fiber optics."),
            zh = LocalizedContent("锗的化学符号是什么？", listOf("Ge", "G", "Gm", "Gd"), "科学", "锗的化学符号是Ge，源自其拉丁名'Germanium'。这种半导体元素用于电子和光纤领域。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del germanio?", listOf("Ge", "G", "Gm", "Gd"), "Ciencia", "El símbolo químico del germanio es Ge, derivado de su nombre latino 'Germanium'. Este elemento semiconductor se utiliza en la electrónica y la fibra óptica.")
        ),
        BilingualQuestion(
            id = 8650, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de côtés a un octogone?", listOf("8", "6", "10", "7"), "Science", "Un octogone est un polygone à huit côtés, le préfixe \"octo-\" signifiant huit en grec."),
            en = LocalizedContent("How many sides does an octagon have?", listOf("8", "6", "10", "7"), "Science", "An octagon is a polygon with eight sides; the prefix \"octo-\" means eight in Greek."),
            zh = LocalizedContent("八边形有几条边？", listOf("8", "6", "10", "7"), "科学", "八边形是有八条边的多边形，前缀“octo-”在希腊语中意为八。"),
            es = LocalizedContent("¿Cuántos lados tiene un octógono?", listOf("8", "6", "10", "7"), "Ciencia", "Un octógono es un polígono de ocho lados; el prefijo \"octo-\" significa ocho en griego.")
        ),
        BilingualQuestion(
            id = 8651, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la prolactine?", listOf("Hypophyse", "Thyroïde", "Surrénale", "Pancréas"), "Science", "La prolactine est une hormone sécrétée par l'hypophyse, une glande située à la base du cerveau, qui joue un rôle clé dans la lactation."),
            en = LocalizedContent("Which gland produces prolactin?", listOf("Pituitary", "Thyroid", "Adrenal", "Pancreas"), "Science", "Prolactin is a hormone secreted by the pituitary gland, located at the base of the brain, which plays a key role in lactation."),
            zh = LocalizedContent("哪种腺体分泌催乳素？", listOf("垂体", "甲状腺", "肾上腺", "胰腺"), "科学", "催乳素是由位于大脑底部的垂体分泌的一种激素，在哺乳中起关键作用。"),
            es = LocalizedContent("¿Qué glándula produce la prolactina?", listOf("Hipófisis", "Tiroides", "Suprarrenal", "Páncreas"), "Ciencia", "La prolactina es una hormona secretada por la hipófisis, una glándula situada en la base del cerebro, que desempeña un papel clave en la lactancia.")
        ),
        BilingualQuestion(
            id = 8652, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand satellite naturel du système solaire?", listOf("Ganymède", "Titan", "Callisto", "Io"), "Science", "Ganymède, lune de Jupiter, est le plus grand satellite naturel du système solaire, avec un diamètre de 5 268 kilomètres, dépassant même la planète Mercure."),
            en = LocalizedContent("What is the largest natural satellite in the solar system?", listOf("Ganymede", "Titan", "Callisto", "Io"), "Science", "Ganymede, a moon of Jupiter, is the largest natural satellite in the solar system, with a diameter of 5,268 kilometers, even exceeding the planet Mercury."),
            zh = LocalizedContent("太阳系中最大的天然卫星是什么？", listOf("木卫三", "土卫六", "木卫四", "木卫一"), "科学", "木卫三是木星的卫星，是太阳系中最大的天然卫星，直径达5268公里，甚至超过水星。"),
            es = LocalizedContent("¿Cuál es el satélite natural más grande del sistema solar?", listOf("Ganímedes", "Titán", "Calisto", "Ío"), "Ciencia", "Ganímedes, luna de Júpiter, es el satélite natural más grande del sistema solar, con un diámetro de 5.268 kilómetros, superando incluso al planeta Mercurio.")
        ),
        BilingualQuestion(
            id = 8653, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les lois de la thermodynamique?", listOf("Nicolas Léonard Sadi Carnot", "Rudolf Clausius", "Lord Kelvin", "Ludwig Boltzmann"), "Science", "Sadi Carnot a jeté les bases du deuxième principe de la thermodynamique dans son ouvrage de 1824 sur le rendement des machines à vapeur, posant ainsi les fondements de cette science."),
            en = LocalizedContent("Which scientist discovered the laws of thermodynamics?", listOf("Nicolas Léonard Sadi Carnot", "Rudolf Clausius", "Lord Kelvin", "Ludwig Boltzmann"), "Science", "Sadi Carnot laid the foundations of the second law of thermodynamics in his 1824 work on the efficiency of steam engines, thus establishing the basis of this science."),
            zh = LocalizedContent("哪位科学家发现了热力学定律？", listOf("尼古拉·莱昂纳尔·萨迪·卡诺", "鲁道夫·克劳修斯", "开尔文勋爵", "路德维希·玻尔兹曼"), "科学", "萨迪·卡诺在其1824年关于蒸汽机效率的著作中奠定了热力学第二定律的基础，从而确立了这门科学的基础。"),
            es = LocalizedContent("¿Qué científico descubrió las leyes de la termodinámica?", listOf("Nicolas Léonard Sadi Carnot", "Rudolf Clausius", "Lord Kelvin", "Ludwig Boltzmann"), "Ciencia", "Sadi Carnot sentó las bases del segundo principio de la termodinámica en su obra de 1824 sobre el rendimiento de las máquinas de vapor, estableciendo así los fundamentos de esta ciencia.")
        ),
        BilingualQuestion(
            id = 8654, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du gallium?", listOf("Ga", "G", "Gd", "Gb"), "Science", "Le gallium, dont le symbole est Ga, est un métal rare qui fond à seulement 29,76 °C, soit dans la main. Il est utilisé dans l'électronique et les semi-conducteurs."),
            en = LocalizedContent("What is the chemical symbol for gallium?", listOf("Ga", "G", "Gd", "Gb"), "Science", "Gallium, whose symbol is Ga, is a rare metal that melts at only 29.76 °C, i.e., in the hand. It is used in electronics and semiconductors."),
            zh = LocalizedContent("镓的化学符号是什么？", listOf("Ga", "G", "Gd", "Gb"), "科学", "镓的符号是Ga，是一种稀有金属，熔点仅为29.76°C，即在手中即可熔化。它用于电子和半导体领域。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del galio?", listOf("Ga", "G", "Gd", "Gb"), "Ciencia", "El galio, cuyo símbolo es Ga, es un metal raro que funde a solo 29,76 °C, es decir, en la mano. Se utiliza en electrónica y semiconductores.")
        ),
        BilingualQuestion(
            id = 8655, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la vitesse orbitale de la Terre?", listOf("30 km/s", "20 km/s", "40 km/s", "15 km/s"), "Science", "La Terre parcourt environ 940 millions de kilomètres par an sur son orbite autour du Soleil, ce qui correspond à une vitesse moyenne de 30 km/s."),
            en = LocalizedContent("What is the orbital speed of Earth?", listOf("30 km/s", "20 km/s", "40 km/s", "15 km/s"), "Science", "Earth travels about 940 million kilometers per year in its orbit around the Sun, corresponding to an average speed of 30 km/s."),
            zh = LocalizedContent("地球的轨道速度是多少？", listOf("30公里/秒", "20公里/秒", "40公里/秒", "15公里/秒"), "科学", "地球每年绕太阳运行约9.4亿公里，平均速度为30公里/秒。"),
            es = LocalizedContent("¿Cuál es la velocidad orbital de la Tierra?", listOf("30 km/s", "20 km/s", "40 km/s", "15 km/s"), "Ciencia", "La Tierra recorre aproximadamente 940 millones de kilómetros por año en su órbita alrededor del Sol, lo que corresponde a una velocidad media de 30 km/s.")
        ),
        BilingualQuestion(
            id = 8656, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique a le nombre atomique 79?", listOf("Or", "Argent", "Cuivre", "Platine"), "Science", "Le nombre atomique 79 correspond à l'or (symbole Au), un métal précieux utilisé en bijouterie et en électronique pour sa conductivité et sa résistance à la corrosion."),
            en = LocalizedContent("Which chemical element has atomic number 79?", listOf("Gold", "Silver", "Copper", "Platinum"), "Science", "Atomic number 79 corresponds to gold (symbol Au), a precious metal used in jewelry and electronics for its conductivity and resistance to corrosion."),
            zh = LocalizedContent("哪种化学元素的原子序数是79？", listOf("金", "银", "铜", "铂"), "科学", "原子序数79对应金（符号Au），是一种贵金属，因其导电性和耐腐蚀性而用于珠宝和电子领域。"),
            es = LocalizedContent("¿Qué elemento químico tiene el número atómico 79?", listOf("Oro", "Plata", "Cobre", "Platino"), "Ciencia", "El número atómico 79 corresponde al oro (símbolo Au), un metal precioso utilizado en joyería y electrónica por su conductividad y resistencia a la corrosión.")
        ),
        BilingualQuestion(
            id = 8657, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert les rayons cathodiques?", listOf("J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Science", "J.J. Thomson a découvert les rayons cathodiques en 1897 lors de ses expériences avec un tube à vide, ce qui l'a mené à identifier l'électron."),
            en = LocalizedContent("Which scientist discovered cathode rays?", listOf("J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Science", "J.J. Thomson discovered cathode rays in 1897 during his experiments with a vacuum tube, which led him to identify the electron."),
            zh = LocalizedContent("哪位科学家发现了阴极射线？", listOf("J.J.汤姆孙", "欧内斯特·卢瑟福", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "J.J.汤姆孙在1897年通过真空管实验发现了阴极射线，从而识别出电子。"),
            es = LocalizedContent("¿Qué científico descubrió los rayos catódicos?", listOf("J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Max Planck"), "Ciencia", "J.J. Thomson descubrió los rayos catódicos en 1897 durante sus experimentos con un tubo de vacío, lo que le llevó a identificar el electrón.")
        ),
        BilingualQuestion(
            id = 8658, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du technétium?", listOf("Tc", "T", "Ta", "Tb"), "Science", "Le technétium, de symbole Tc, est un élément chimique radioactif artificiel, le plus léger des éléments sans isotope stable."),
            en = LocalizedContent("What is the chemical symbol for technetium?", listOf("Tc", "T", "Ta", "Tb"), "Science", "Technetium, symbol Tc, is an artificial radioactive chemical element, the lightest element without a stable isotope."),
            zh = LocalizedContent("锝的化学符号是什么？", listOf("Tc", "T", "Ta", "Tb"), "科学", "锝的符号是Tc，是一种人工放射性化学元素，是没有稳定同位素的最轻元素。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tecnecio?", listOf("Tc", "T", "Ta", "Tb"), "Ciencia", "El tecnecio, de símbolo Tc, es un elemento químico radiactivo artificial, el más ligero de los elementos sin isótopo estable.")
        ),
        BilingualQuestion(
            id = 8659, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules rouges du sang a un humain environ?", listOf("25 trillions", "10 trillions", "50 trillions", "100 trillions"), "Science", "Un adulte possède environ 25 trillions de globules rouges, soit environ 40 à 45 % du volume sanguin total, renouvelés constamment par la moelle osseuse."),
            en = LocalizedContent("How many red blood cells does a human have approximately?", listOf("25 trillion", "10 trillion", "50 trillion", "100 trillion"), "Science", "An adult has about 25 trillion red blood cells, which is about 40-45% of total blood volume, constantly renewed by the bone marrow."),
            zh = LocalizedContent("人类大约有多少个红细胞？", listOf("25万亿", "10万亿", "50万亿", "100万亿"), "科学", "一个成年人约有25万亿个红细胞，约占血液总体积的40-45%，由骨髓不断更新。"),
            es = LocalizedContent("¿Cuántos glóbulos rojos tiene un humano aproximadamente?", listOf("25 billones", "10 billones", "50 billones", "100 billones"), "Ciencia", "Un adulto posee aproximadamente 25 billones de glóbulos rojos, lo que supone entre el 40 y el 45% del volumen sanguíneo total, renovados constantemente por la médula ósea.")
        ),
        BilingualQuestion(
            id = 8660, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le glucagon?", listOf("Pancréas", "Foie", "Thyroïde", "Hypophyse"), "Science", "Le glucagon est une hormone produite par les cellules alpha des îlots de Langerhans du pancréas, qui augmente le taux de sucre dans le sang."),
            en = LocalizedContent("Which gland produces glucagon?", listOf("Pancreas", "Liver", "Thyroid", "Pituitary"), "Science", "Glucagon is a hormone produced by the alpha cells of the islets of Langerhans in the pancreas, which increases blood sugar levels."),
            zh = LocalizedContent("哪个腺体产生胰高血糖素？", listOf("胰腺", "肝脏", "甲状腺", "垂体"), "科学", "胰高血糖素是一种由胰腺胰岛α细胞产生的激素，可提高血糖水平。"),
            es = LocalizedContent("¿Qué glándula produce el glucagón?", listOf("Páncreas", "Hígado", "Tiroides", "Hipófisis"), "Ciencia", "El glucagón es una hormona producida por las células alfa de los islotes de Langerhans del páncreas, que aumenta el nivel de azúcar en sangre.")
        ),
        BilingualQuestion(
            id = 8661, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand cratère d'impact connu?", listOf("Bassin du Pôle Sud-Aitken", "Cratère de Chicxulub", "Cratère de Sudbury", "Cratère de Vredefort"), "Science", "Le bassin du Pôle Sud-Aitken, situé sur la face cachée de la Lune, est le plus grand cratère d'impact connu du système solaire, avec un diamètre d'environ 2 500 kilomètres."),
            en = LocalizedContent("What is the largest known impact crater?", listOf("South Pole–Aitken basin", "Chicxulub crater", "Sudbury crater", "Vredefort crater"), "Science", "The South Pole–Aitken basin, located on the far side of the Moon, is the largest known impact crater in the solar system, with a diameter of about 2,500 kilometers."),
            zh = LocalizedContent("已知最大的撞击坑是什么？", listOf("南极-艾特肯盆地", "希克苏鲁伯陨石坑", "萨德伯里陨石坑", "弗里德堡陨石坑"), "科学", "位于月球背面的南极-艾特肯盆地是太阳系中已知最大的撞击坑，直径约2500公里。"),
            es = LocalizedContent("¿Cuál es el cráter de impacto más grande conocido?", listOf("Cuenca Polo Sur-Aitken", "Cráter de Chicxulub", "Cráter de Sudbury", "Cráter de Vredefort"), "Ciencia", "La cuenca Polo Sur-Aitken, situada en la cara oculta de la Luna, es el cráter de impacto más grande conocido del sistema solar, con un diámetro de unos 2.500 kilómetros.")
        ),
        BilingualQuestion(
            id = 8662, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la supraconductivité?", listOf("Heike Kamerlingh Onnes", "Niels Bohr", "Albert Einstein", "Max Planck"), "Science", "Heike Kamerlingh Onnes découvrit la supraconductivité en 1911 en observant la disparition de la résistance électrique du mercure à très basse température."),
            en = LocalizedContent("Which scientist discovered superconductivity?", listOf("Heike Kamerlingh Onnes", "Niels Bohr", "Albert Einstein", "Max Planck"), "Science", "Heike Kamerlingh Onnes discovered superconductivity in 1911 by observing the disappearance of electrical resistance in mercury at very low temperatures."),
            zh = LocalizedContent("哪位科学家发现了超导现象？", listOf("海克·卡末林·昂内斯", "尼尔斯·玻尔", "阿尔伯特·爱因斯坦", "马克斯·普朗克"), "科学", "海克·卡末林·昂内斯于1911年发现超导现象，观察到汞在极低温度下电阻消失。"),
            es = LocalizedContent("¿Qué científico descubrió la superconductividad?", listOf("Heike Kamerlingh Onnes", "Niels Bohr", "Albert Einstein", "Max Planck"), "Ciencia", "Heike Kamerlingh Onnes descubrió la superconductividad en 1911 al observar la desaparición de la resistencia eléctrica del mercurio a muy bajas temperaturas.")
        ),
        BilingualQuestion(
            id = 8663, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du rhuthenium?", listOf("Ru", "R", "Re", "Rf"), "Science", "Le ruthénium, découvert en 1844, tire son symbole Ru de son nom latin Ruthenia, en référence à la Russie."),
            en = LocalizedContent("What is the chemical symbol for ruthenium?", listOf("Ru", "R", "Re", "Rf"), "Science", "Ruthenium, discovered in 1844, derives its symbol Ru from its Latin name Ruthenia, in reference to Russia."),
            zh = LocalizedContent("钌的化学符号是什么？", listOf("Ru", "R", "Re", "Rf"), "科学", "钌于1844年被发现，其符号Ru源自拉丁名Ruthenia，意指俄罗斯。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del rutenio?", listOf("Ru", "R", "Re", "Rf"), "Ciencia", "El rutenio, descubierto en 1844, toma su símbolo Ru de su nombre latino Ruthenia, en referencia a Rusia.")
        ),
        BilingualQuestion(
            id = 8664, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la masse volumique du diamant?", listOf("3.5 g/cm³", "2.5 g/cm³", "4.5 g/cm³", "1.5 g/cm³"), "Science", "Le diamant est une forme cristalline du carbone dont la structure atomique très dense lui confère une masse volumique d'environ 3,5 g/cm³, nettement supérieure à celle du graphite (2,2 g/cm³)."),
            en = LocalizedContent("What is the density of diamond?", listOf("3.5 g/cm³", "2.5 g/cm³", "4.5 g/cm³", "1.5 g/cm³"), "Science", "Diamond is a crystalline form of carbon with a very dense atomic structure, giving it a density of about 3.5 g/cm³, significantly higher than that of graphite (2.2 g/cm³)."),
            zh = LocalizedContent("钻石的密度是多少？", listOf("3.5 g/cm³", "2.5 g/cm³", "4.5 g/cm³", "1.5 g/cm³"), "科学", "钻石是碳的晶体形式，其原子结构非常致密，密度约为3.5 g/cm³，远高于石墨（2.2 g/cm³）。"),
            es = LocalizedContent("¿Cuál es la densidad del diamante?", listOf("3.5 g/cm³", "2.5 g/cm³", "4.5 g/cm³", "1.5 g/cm³"), "Ciencia", "El diamante es una forma cristalina del carbono con una estructura atómica muy densa, lo que le confiere una densidad de aproximadamente 3,5 g/cm³, muy superior a la del grafito (2,2 g/cm³).")
        ),
        BilingualQuestion(
            id = 8665, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le point de transition?", listOf("Fer", "Nickel", "Cobalt", "Manganèse"), "Science", "Le fer est appelé point de transition car il se situe au centre du tableau périodique, dans la première série des métaux de transition, et possède des propriétés typiques comme la formation d'ions colorés et des états d'oxydation variables."),
            en = LocalizedContent("Which chemical element is the transition point?", listOf("Iron", "Nickel", "Cobalt", "Manganese"), "Science", "Iron is called the transition point because it lies at the center of the periodic table, in the first series of transition metals, and possesses typical properties such as forming colored ions and variable oxidation states."),
            zh = LocalizedContent("哪种化学元素是过渡点？", listOf("铁", "镍", "钴", "锰"), "科学", "铁被称为过渡点，因为它位于元素周期表中心，是第一系列过渡金属，具有形成有色离子和可变氧化态等典型性质。"),
            es = LocalizedContent("¿Qué elemento químico es el punto de transición?", listOf("Hierro", "Níquel", "Cobalto", "Manganeso"), "Ciencia", "El hierro se llama punto de transición porque se encuentra en el centro de la tabla periódica, en la primera serie de metales de transición, y posee propiedades típicas como la formación de iones coloreados y estados de oxidación variables.")
        ),
        BilingualQuestion(
            id = 8666, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la diffraction des rayons X?", listOf("Max von Laue", "William Henry Bragg", "William Lawrence Bragg", "Christoph Goedecker"), "Science", "Max von Laue a découvert la diffraction des rayons X en 1912, en montrant qu'ils se comportent comme des ondes en traversant un cristal. Cette découverte lui a valu le prix Nobel de physique en 1914."),
            en = LocalizedContent("Which scientist discovered X-ray diffraction?", listOf("Max von Laue", "William Henry Bragg", "William Lawrence Bragg", "Christoph Goedecker"), "Science", "Max von Laue discovered X-ray diffraction in 1912, showing that X-rays behave as waves when passing through a crystal. This discovery earned him the Nobel Prize in Physics in 1914."),
            zh = LocalizedContent("哪位科学家发现了X射线衍射？", listOf("马克斯·冯·劳厄", "威廉·亨利·布拉格", "威廉·劳伦斯·布拉格", "克里斯托夫·戈德克"), "科学", "马克斯·冯·劳厄于1912年发现X射线衍射，证明X射线穿过晶体时表现为波。这一发现为他赢得了1914年诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió la difracción de rayos X?", listOf("Max von Laue", "William Henry Bragg", "William Lawrence Bragg", "Christoph Goedecker"), "Ciencia", "Max von Laue descubrió la difracción de rayos X en 1912, demostrando que los rayos X se comportan como ondas al atravesar un cristal. Este descubrimiento le valió el Premio Nobel de Física en 1914.")
        ),
        BilingualQuestion(
            id = 8667, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du palladium?", listOf("Pd", "P", "Pb", "Pm"), "Science", "Le symbole Pd vient du nom latin du palladium, Palladium, dérivé de l'astéroïde Pallas. C'est un métal précieux du groupe du platine, utilisé en catalyse et en joaillerie."),
            en = LocalizedContent("What is the chemical symbol for palladium?", listOf("Pd", "P", "Pb", "Pm"), "Science", "The symbol Pd comes from the Latin name of palladium, Palladium, derived from the asteroid Pallas. It is a precious metal of the platinum group, used in catalysis and jewelry."),
            zh = LocalizedContent("钯的化学符号是什么？", listOf("Pd", "P", "Pb", "Pm"), "科学", "符号Pd源自钯的拉丁名Palladium，来源于小行星智神星。它是铂族贵金属，用于催化和珠宝。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del paladio?", listOf("Pd", "P", "Pb", "Pm"), "Ciencia", "El símbolo Pd proviene del nombre latino del paladio, Palladium, derivado del asteroide Palas. Es un metal precioso del grupo del platino, utilizado en catálisis y joyería.")
        ),
        BilingualQuestion(
            id = 8668, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de paires de branches bronchiales a un humain?", listOf("2", "3", "1", "4"), "Science", "Les bronches se divisent en deux branches principales, une pour chaque poumon, d'où le terme de bronches souches droite et gauche."),
            en = LocalizedContent("How many pairs of bronchial branches does a human have?", listOf("2", "3", "1", "4"), "Science", "The bronchi divide into two main branches, one for each lung, hence the terms right and left main bronchi."),
            zh = LocalizedContent("人类有多少对支气管分支？", listOf("2", "3", "1", "4"), "科学", "支气管分为两个主要分支，分别通向左右肺，因此称为左主支气管和右主支气管。"),
            es = LocalizedContent("¿Cuántos pares de ramas bronquiales tiene un humano?", listOf("2", "3", "1", "4"), "Ciencia", "Los bronquios se dividen en dos ramas principales, una para cada pulmón, de ahí los términos bronquios principales derecho e izquierdo.")
        ),
        BilingualQuestion(
            id = 8669, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit l'épinéphrine?", listOf("Glande surrénale", "Pancréas", "Thyroïde", "Hypophyse"), "Science", "L'épinéphrine, aussi appelée adrénaline, est une hormone produite par la médullosurrénale, la partie centrale des glandes surrénales situées au-dessus des reins."),
            en = LocalizedContent("Which gland produces epinephrine?", listOf("Adrenal gland", "Pancreas", "Thyroid", "Pituitary"), "Science", "Epinephrine, also called adrenaline, is a hormone produced by the adrenal medulla, the central part of the adrenal glands located above the kidneys."),
            zh = LocalizedContent("哪个腺体产生肾上腺素？", listOf("肾上腺", "胰腺", "甲状腺", "垂体"), "科学", "肾上腺素是一种由肾上腺髓质（位于肾脏上方的肾上腺中央部分）产生的激素。"),
            es = LocalizedContent("¿Qué glándula produce la epinefrina?", listOf("Glándula suprarrenal", "Páncreas", "Tiroides", "Hipófisis"), "Ciencia", "La epinefrina, también llamada adrenalina, es una hormona producida por la médula suprarrenal, la parte central de las glándulas suprarrenales situadas sobre los riñones.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8670, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan actif du monde?", listOf("Kilauea", "Mont Etna", "Sakurajima", "Merapi"), "Science", "Le Kilauea est souvent considéré comme le plus grand volcan actif du monde en termes de volume et de surface, situé à Hawaï. Il est entré en éruption de manière quasi continue depuis 1983."),
            en = LocalizedContent("What is the largest active volcano in the world?", listOf("Kilauea", "Mount Etna", "Sakurajima", "Merapi"), "Science", "Kilauea is often considered the largest active volcano in the world in terms of volume and area, located in Hawaii. It has been erupting almost continuously since 1983."),
            zh = LocalizedContent("世界上最大的活火山是什么？", listOf("基拉韦厄火山", "埃特纳火山", "樱岛火山", "默拉皮火山"), "科学", "基拉韦厄火山通常被认为是世界上最大的活火山，按体积和面积计算，位于夏威夷。自1983年以来几乎持续喷发。"),
            es = LocalizedContent("¿Cuál es el volcán activo más grande del mundo?", listOf("Kilauea", "Monte Etna", "Sakurajima", "Merapi"), "Ciencia", "El Kilauea es a menudo considerado el volcán activo más grande del mundo en términos de volumen y superficie, ubicado en Hawái. Ha estado en erupción casi continuamente desde 1983.")
        ),
        BilingualQuestion(
            id = 8671, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les lois de Pauling?", listOf("Linus Pauling", "Max Pauling", "Richard Pauling", "Robert Pauling"), "Science", "Linus Pauling a découvert ces lois qui portent son nom, notamment les règles de Pauling sur la structure des cristaux ioniques et la liaison chimique."),
            en = LocalizedContent("Which scientist discovered Pauling's rules?", listOf("Linus Pauling", "Max Pauling", "Richard Pauling", "Robert Pauling"), "Science", "Linus Pauling discovered these rules named after him, including Pauling's rules on the structure of ionic crystals and chemical bonding."),
            zh = LocalizedContent("哪位科学家发现了鲍林规则？", listOf("莱纳斯·鲍林", "马克斯·鲍林", "理查德·鲍林", "罗伯特·鲍林"), "科学", "莱纳斯·鲍林发现了以他命名的这些规则，包括关于离子晶体结构和化学键的鲍林规则。"),
            es = LocalizedContent("¿Qué científico descubrió las reglas de Pauling?", listOf("Linus Pauling", "Max Pauling", "Richard Pauling", "Robert Pauling"), "Ciencia", "Linus Pauling descubrió estas reglas que llevan su nombre, incluyendo las reglas de Pauling sobre la estructura de los cristales iónicos y el enlace químico.")
        ),
        BilingualQuestion(
            id = 8672, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du cadmium?", listOf("Cd", "C", "Ca", "Ce"), "Science", "Le cadmium est un métal de transition, et son symbole chimique Cd vient de son nom latin, \"cadmia\". Il est souvent utilisé dans les batteries rechargeables."),
            en = LocalizedContent("What is the chemical symbol for cadmium?", listOf("Cd", "C", "Ca", "Ce"), "Science", "Cadmium is a transition metal, and its chemical symbol Cd comes from its Latin name 'cadmia'. It is often used in rechargeable batteries."),
            zh = LocalizedContent("镉的化学符号是什么？", listOf("Cd", "C", "Ca", "Ce"), "科学", "镉是一种过渡金属，其化学符号Cd源自拉丁名'cadmia'。它常用于可充电电池中。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cadmio?", listOf("Cd", "C", "Ca", "Ce"), "Ciencia", "El cadmio es un metal de transición, y su símbolo químico Cd proviene de su nombre latino 'cadmia'. Se utiliza a menudo en baterías recargables.")
        ),
        BilingualQuestion(
            id = 8673, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la profondeur moyenne de l'océan?", listOf("3688 m", "5000 m", "2000 m", "4000 m"), "Science", "La profondeur moyenne des océans est d'environ 3 688 mètres, calculée en divisant le volume total d'eau de mer par la surface océanique mondiale."),
            en = LocalizedContent("What is the average depth of the ocean?", listOf("3688 m", "5000 m", "2000 m", "4000 m"), "Science", "The average depth of the oceans is about 3,688 meters, calculated by dividing the total volume of seawater by the global ocean surface area."),
            zh = LocalizedContent("海洋的平均深度是多少？", listOf("3688米", "5000米", "2000米", "4000米"), "科学", "海洋的平均深度约为3688米，通过将海水总体积除以全球海洋表面积计算得出。"),
            es = LocalizedContent("¿Cuál es la profundidad media del océano?", listOf("3688 m", "5000 m", "2000 m", "4000 m"), "Ciencia", "La profundidad media de los océanos es de aproximadamente 3.688 metros, calculada dividiendo el volumen total de agua de mar por la superficie oceánica mundial.")
        ),
        BilingualQuestion(
            id = 8674, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le point d'ébullition le plus bas?", listOf("Hélium", "Hydrogène", "Néon", "Azote"), "Science", "L'hélium est l'élément avec le point d'ébullition le plus bas car ses atomes sont très légers et interagissent faiblement, ce qui lui permet de rester liquide seulement à -268,9 °C."),
            en = LocalizedContent("Which chemical element has the lowest boiling point?", listOf("Helium", "Hydrogen", "Neon", "Nitrogen"), "Science", "Helium is the element with the lowest boiling point because its atoms are very light and interact weakly, allowing it to remain liquid only at -268.9 °C."),
            zh = LocalizedContent("哪种化学元素的沸点最低？", listOf("氦", "氢", "氖", "氮"), "科学", "氦是沸点最低的元素，因为其原子非常轻且相互作用弱，仅在-268.9°C时保持液态。"),
            es = LocalizedContent("¿Qué elemento químico tiene el punto de ebullición más bajo?", listOf("Helio", "Hidrógeno", "Neón", "Nitrógeno"), "Ciencia", "El helio es el elemento con el punto de ebullición más bajo porque sus átomos son muy ligeros e interactúan débilmente, lo que le permite permanecer líquido solo a -268,9 °C.")
        ),
        BilingualQuestion(
            id = 8675, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le photon?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Werner Heisenberg"), "Science", "Einstein a proposé l'existence du photon en 1905 pour expliquer l'effet photoélectrique, ce qui lui a valu le prix Nobel de physique en 1921."),
            en = LocalizedContent("Which scientist discovered the photon?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Werner Heisenberg"), "Science", "Einstein proposed the existence of the photon in 1905 to explain the photoelectric effect, which earned him the Nobel Prize in Physics in 1921."),
            zh = LocalizedContent("哪位科学家发现了光子？", listOf("阿尔伯特·爱因斯坦", "马克斯·普朗克", "尼尔斯·玻尔", "维尔纳·海森堡"), "科学", "爱因斯坦于1905年提出光子的存在以解释光电效应，这为他赢得了1921年的诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el fotón?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Werner Heisenberg"), "Ciencia", "Einstein propuso la existencia del fotón en 1905 para explicar el efecto fotoeléctrico, lo que le valió el Premio Nobel de Física en 1921.")
        ),
        BilingualQuestion(
            id = 8676, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du tantale?", listOf("Ta", "T", "Tb", "Tc"), "Science", "Le tantale a pour symbole chimique Ta, dérivé de son nom latin Tantalum. Il s'agit d'un métal de transition rare utilisé dans l'électronique."),
            en = LocalizedContent("What is the chemical symbol for tantalum?", listOf("Ta", "T", "Tb", "Tc"), "Science", "Tantalum has the chemical symbol Ta, derived from its Latin name Tantalum. It is a rare transition metal used in electronics."),
            zh = LocalizedContent("钽的化学符号是什么？", listOf("Ta", "T", "Tb", "Tc"), "科学", "钽的化学符号是Ta，源自其拉丁名Tantalum。它是一种用于电子产品的稀有过渡金属。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tantalio?", listOf("Ta", "T", "Tb", "Tc"), "Ciencia", "El tantalio tiene el símbolo químico Ta, derivado de su nombre latino Tantalum. Es un metal de transición raro utilizado en electrónica.")
        ),
        BilingualQuestion(
            id = 8677, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de lobes a le poumon droit?", listOf("3", "2", "4", "5"), "Science", "Le poumon droit possède trois lobes (supérieur, moyen et inférieur) pour s'adapter à l'espace laissé par le foie, contrairement au poumon gauche qui n'en a que deux."),
            en = LocalizedContent("How many lobes does the right lung have?", listOf("3", "2", "4", "5"), "Science", "The right lung has three lobes (superior, middle, and inferior) to accommodate the space left by the liver, unlike the left lung which has only two."),
            zh = LocalizedContent("右肺有多少个肺叶？", listOf("3", "2", "4", "5"), "科学", "右肺有三个肺叶（上叶、中叶和下叶），以适应肝脏留下的空间，而左肺只有两个。"),
            es = LocalizedContent("¿Cuántos lóbulos tiene el pulmón derecho?", listOf("3", "2", "4", "5"), "Ciencia", "El pulmón derecho tiene tres lóbulos (superior, medio e inferior) para adaptarse al espacio dejado por el hígado, a diferencia del pulmón izquierdo que solo tiene dos.")
        ),
        BilingualQuestion(
            id = 8678, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit le thyroxine?", listOf("Thyroïde", "Hypophyse", "Surrénale", "Pancréas"), "Science", "La thyroxine est une hormone produite par la glande thyroïde, située dans le cou. Elle régule le métabolisme du corps."),
            en = LocalizedContent("Which gland produces thyroxine?", listOf("Thyroid", "Pituitary", "Adrenal", "Pancreas"), "Science", "Thyroxine is a hormone produced by the thyroid gland, located in the neck. It regulates the body's metabolism."),
            zh = LocalizedContent("哪个腺体产生甲状腺素？", listOf("甲状腺", "垂体", "肾上腺", "胰腺"), "科学", "甲状腺素是由位于颈部的甲状腺产生的一种激素，调节身体的新陈代谢。"),
            es = LocalizedContent("¿Qué glándula produce la tiroxina?", listOf("Tiroides", "Hipófisis", "Suprarrenal", "Páncreas"), "Ciencia", "La tiroxina es una hormona producida por la glándula tiroides, ubicada en el cuello. Regula el metabolismo del cuerpo.")
        ),
        BilingualQuestion(
            id = 8679, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand reef corallien du monde?", listOf("Grande Barrière de Corail", "Récif Mésoaméricain", "Récif de Belau", "Récif du Golfe Persique"), "Science", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres et est visible depuis l'espace."),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("Great Barrier Reef", "Mesoamerican Reef", "Belau Reef", "Persian Gulf Reef"), "Science", "The Great Barrier Reef, located off the coast of Australia, stretches over 2,300 kilometers and is visible from space."),
            zh = LocalizedContent("世界上最大的珊瑚礁是什么？", listOf("大堡礁", "中美洲礁", "贝劳礁", "波斯湾礁"), "科学", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("Gran Barrera de Coral", "Arrecife Mesoamericano", "Arrecife de Belau", "Arrecife del Golfo Pérsico"), "Ciencia", "La Gran Barrera de Coral, ubicada frente a la costa de Australia, se extiende por más de 2.300 kilómetros y es visible desde el espacio.")
        ),
        BilingualQuestion(
            id = 8680, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'argon?", listOf("William Ramsay et Morris Travers", "Henry Cavendish", "Carl Wilhelm Scheele", "Joseph Priestley"), "Science", "L'argon a été découvert en 1894 par Lord Rayleigh et William Ramsay, mais Morris Travers a collaboré avec Ramsay sur d'autres gaz nobles, comme le néon."),
            en = LocalizedContent("Which scientist discovered argon?", listOf("William Ramsay and Morris Travers", "Henry Cavendish", "Carl Wilhelm Scheele", "Joseph Priestley"), "Science", "Argon was discovered in 1894 by Lord Rayleigh and William Ramsay, but Morris Travers collaborated with Ramsay on other noble gases, such as neon."),
            zh = LocalizedContent("哪位科学家发现了氩？", listOf("威廉·拉姆齐和莫里斯·特拉弗斯", "亨利·卡文迪什", "卡尔·威廉·舍勒", "约瑟夫·普里斯特利"), "科学", "氩于1894年被瑞利勋爵和威廉·拉姆齐发现，但莫里斯·特拉弗斯与拉姆齐合作研究了其他稀有气体，如氖。"),
            es = LocalizedContent("¿Qué científico descubrió el argón?", listOf("William Ramsay y Morris Travers", "Henry Cavendish", "Carl Wilhelm Scheele", "Joseph Priestley"), "Ciencia", "El argón fue descubierto en 1894 por Lord Rayleigh y William Ramsay, pero Morris Travers colaboró con Ramsay en otros gases nobles, como el neón.")
        ),
        BilingualQuestion(
            id = 8681, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du hafnium?", listOf("Hf", "H", "Hg", "He"), "Science", "Le hafnium tire son symbole Hf de son nom latin Hafnium, dérivé de Hafnia, nom latin de Copenhague où il fut découvert en 1923."),
            en = LocalizedContent("What is the chemical symbol for hafnium?", listOf("Hf", "H", "Hg", "He"), "Science", "Hafnium takes its symbol Hf from its Latin name Hafnium, derived from Hafnia, the Latin name for Copenhagen where it was discovered in 1923."),
            zh = LocalizedContent("铪的化学符号是什么？", listOf("Hf", "H", "Hg", "He"), "科学", "铪的符号Hf来自其拉丁名Hafnium，源自Hafnia（哥本哈根的拉丁名），该元素于1923年在哥本哈根被发现。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del hafnio?", listOf("Hf", "H", "Hg", "He"), "Ciencia", "El hafnio toma su símbolo Hf de su nombre latino Hafnium, derivado de Hafnia, nombre latino de Copenhague donde fue descubierto en 1923.")
        ),
        BilingualQuestion(
            id = 8682, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la masse molaire de l'oxygène?", listOf("32 g/mol", "16 g/mol", "64 g/mol", "8 g/mol"), "Science", "La molécule d'oxygène (O₂) est composée de deux atomes, chacun ayant une masse molaire de 16 g/mol, ce qui donne un total de 32 g/mol."),
            en = LocalizedContent("What is the molar mass of oxygen?", listOf("32 g/mol", "16 g/mol", "64 g/mol", "8 g/mol"), "Science", "The oxygen molecule (O₂) consists of two atoms, each with a molar mass of 16 g/mol, giving a total of 32 g/mol."),
            zh = LocalizedContent("氧气的摩尔质量是多少？", listOf("32 g/mol", "16 g/mol", "64 g/mol", "8 g/mol"), "科学", "氧分子（O₂）由两个原子组成，每个原子的摩尔质量为16 g/mol，因此总摩尔质量为32 g/mol。"),
            es = LocalizedContent("¿Cuál es la masa molar del oxígeno?", listOf("32 g/mol", "16 g/mol", "64 g/mol", "8 g/mol"), "Ciencia", "La molécula de oxígeno (O₂) está compuesta por dos átomos, cada uno con una masa molar de 16 g/mol, lo que da un total de 32 g/mol.")
        ),
        BilingualQuestion(
            id = 8683, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus électronégatif?", listOf("Fluor", "Oxygène", "Azote", "Chlore"), "Science", "Le fluor possède la plus grande électronégativité de tous les éléments, ce qui signifie qu'il attire le plus fortement les électrons dans une liaison chimique."),
            en = LocalizedContent("Which chemical element is the most electronegative?", listOf("Fluorine", "Oxygen", "Nitrogen", "Chlorine"), "Science", "Fluorine has the highest electronegativity of all elements, meaning it attracts electrons most strongly in a chemical bond."),
            zh = LocalizedContent("哪种化学元素的电负性最大？", listOf("氟", "氧", "氮", "氯"), "科学", "氟是所有元素中电负性最大的，这意味着它在化学键中最强烈地吸引电子。"),
            es = LocalizedContent("¿Qué elemento químico es el más electronegativo?", listOf("Flúor", "Oxígeno", "Nitrógeno", "Cloro"), "Ciencia", "El flúor tiene la mayor electronegatividad de todos los elementos, lo que significa que atrae electrones con mayor fuerza en un enlace químico.")
        ),
        BilingualQuestion(
            id = 8684, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le muon?", listOf("Carl Anderson", "Enrico Fermi", "Richard Feynman", "Murray Gell-Mann"), "Science", "Carl Anderson a découvert le muon en 1936 en étudiant les rayons cosmiques, ce qui lui a valu le prix Nobel de physique en 1936."),
            en = LocalizedContent("Which scientist discovered the muon?", listOf("Carl Anderson", "Enrico Fermi", "Richard Feynman", "Murray Gell-Mann"), "Science", "Carl Anderson discovered the muon in 1936 while studying cosmic rays, which earned him the Nobel Prize in Physics in 1936."),
            zh = LocalizedContent("哪位科学家发现了μ子？", listOf("卡尔·安德森", "恩里科·费米", "理查德·费曼", "默里·盖尔曼"), "科学", "卡尔·安德森于1936年在研究宇宙射线时发现了μ子，并因此获得了1936年的诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el muón?", listOf("Carl Anderson", "Enrico Fermi", "Richard Feynman", "Murray Gell-Mann"), "Ciencia", "Carl Anderson descubrió el muón en 1936 mientras estudiaba los rayos cósmicos, lo que le valió el Premio Nobel de Física en 1936.")
        ),
        BilingualQuestion(
            id = 8685, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du rhénium?", listOf("Re", "Rh", "Rf", "Rb"), "Science", "Le rhénium, élément de numéro atomique 75, a pour symbole Re, dérivé de son nom latin Rhenium."),
            en = LocalizedContent("What is the chemical symbol for rhenium?", listOf("Re", "Rh", "Rf", "Rb"), "Science", "Rhenium, element with atomic number 75, has the symbol Re, derived from its Latin name Rhenium."),
            zh = LocalizedContent("铼的化学符号是什么？", listOf("Re", "Rh", "Rf", "Rb"), "科学", "铼是原子序数为75的元素，其符号为Re，源自其拉丁名Rhenium。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del renio?", listOf("Re", "Rh", "Rf", "Rb"), "Ciencia", "El renio, elemento de número atómico 75, tiene el símbolo Re, derivado de su nombre latino Rhenium.")
        ),
        BilingualQuestion(
            id = 8686, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de côtés a un icosagone?", listOf("20", "10", "15", "25"), "Science", "Le préfixe \"icosa-\" vient du grec ancien et signifie vingt, comme dans icosaèdre (vingt faces). Un icosagone est donc un polygone à vingt côtés."),
            en = LocalizedContent("How many sides does an icosagon have?", listOf("20", "10", "15", "25"), "Science", "The prefix \"icosa-\" comes from ancient Greek and means twenty, as in icosahedron (twenty faces). An icosagon is therefore a polygon with twenty sides."),
            zh = LocalizedContent("二十边形有多少条边？", listOf("20", "10", "15", "25"), "科学", "前缀“icosa-”源自古希腊语，意为二十，如二十面体（二十个面）。因此，二十边形是一个有二十条边的多边形。"),
            es = LocalizedContent("¿Cuántos lados tiene un icoságono?", listOf("20", "10", "15", "25"), "Ciencia", "El prefijo \"icosa-\" proviene del griego antiguo y significa veinte, como en icosaedro (veinte caras). Por lo tanto, un icoságono es un polígono de veinte lados.")
        ),
        BilingualQuestion(
            id = 8687, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la vasopressine?", listOf("Hypophyse", "Pancréas", "Thyroïde", "Surrénale"), "Science", "L'hypophyse, ou glande pituitaire, libère la vasopressine, une hormone antidiurétique qui régule la rétention d'eau et la pression artérielle."),
            en = LocalizedContent("Which gland produces vasopressin?", listOf("Pituitary", "Pancreas", "Thyroid", "Adrenal"), "Science", "The pituitary gland, or hypophysis, releases vasopressin, an antidiuretic hormone that regulates water retention and blood pressure."),
            zh = LocalizedContent("哪个腺体产生血管加压素？", listOf("垂体", "胰腺", "甲状腺", "肾上腺"), "科学", "垂体释放血管加压素，这是一种抗利尿激素，调节水分潴留和血压。"),
            es = LocalizedContent("¿Qué glándula produce la vasopresina?", listOf("Hipófisis", "Páncreas", "Tiroides", "Suprarrenal"), "Ciencia", "La hipófisis, o glándula pituitaria, libera vasopresina, una hormona antidiurética que regula la retención de agua y la presión arterial.")
        ),
        BilingualQuestion(
            id = 8688, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand lac souterrain du monde?", listOf("Lac Don Juan", "Lac Baïkal", "Lac Caspienne", "Lac Victoria"), "Science", "Le lac Don Juan, en Antarctique, est le plus grand lac souterrain du monde en volume d'eau, avec une salinité extrême qui l'empêche de geler même à -50°C."),
            en = LocalizedContent("What is the largest underground lake in the world?", listOf("Lake Don Juan", "Lake Baikal", "Caspian Sea", "Lake Victoria"), "Science", "Lake Don Juan in Antarctica is the largest underground lake in the world by water volume, with extreme salinity that prevents it from freezing even at -50°C."),
            zh = LocalizedContent("世界上最大的地下湖是什么？", listOf("唐胡安湖", "贝加尔湖", "里海", "维多利亚湖"), "科学", "南极洲的唐胡安湖是世界上水量最大的地下湖，其极高的盐度使其即使在-50°C也不会结冰。"),
            es = LocalizedContent("¿Cuál es el lago subterráneo más grande del mundo?", listOf("Lago Don Juan", "Lago Baikal", "Mar Caspio", "Lago Victoria"), "Ciencia", "El lago Don Juan en la Antártida es el lago subterráneo más grande del mundo en volumen de agua, con una salinidad extrema que evita que se congele incluso a -50°C.")
        ),
        BilingualQuestion(
            id = 8689, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le kaon?", listOf("Murray Gell-Mann", "George Rochester", "Buford Butler", "Alfred Pais"), "Science", "Murray Gell-Mann a découvert le kaon en 1953, une particule subatomique qui a permis de développer le concept d'étrangeté en physique des particules."),
            en = LocalizedContent("Which scientist discovered the kaon?", listOf("Murray Gell-Mann", "George Rochester", "Buford Butler", "Alfred Pais"), "Science", "Murray Gell-Mann discovered the kaon in 1953, a subatomic particle that helped develop the concept of strangeness in particle physics."),
            zh = LocalizedContent("哪位科学家发现了K介子？", listOf("默里·盖尔曼", "乔治·罗切斯特", "布福德·巴特勒", "阿尔弗雷德·派斯"), "科学", "默里·盖尔曼于1953年发现了K介子，这是一种亚原子粒子，有助于发展粒子物理学中的奇异数概念。"),
            es = LocalizedContent("¿Qué científico descubrió el kaón?", listOf("Murray Gell-Mann", "George Rochester", "Buford Butler", "Alfred Pais"), "Ciencia", "Murray Gell-Mann descubrió el kaón en 1953, una partícula subatómica que ayudó a desarrollar el concepto de extrañeza en la física de partículas.")
        ),
        BilingualQuestion(
            id = 8690, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du molybdène?", listOf("Mo", "Mb", "Mn", "Mg"), "Science", "Le molybdène tire son symbole chimique Mo de son nom latin Molybdaenum. C'est un métal de transition utilisé notamment dans les alliages d'acier pour améliorer leur résistance à la chaleur."),
            en = LocalizedContent("What is the chemical symbol for molybdenum?", listOf("Mo", "Mb", "Mn", "Mg"), "Science", "Molybdenum derives its chemical symbol Mo from its Latin name Molybdaenum. It is a transition metal used especially in steel alloys to improve heat resistance."),
            zh = LocalizedContent("钼的化学符号是什么？", listOf("Mo", "Mb", "Mn", "Mg"), "科学", "钼的化学符号Mo源自其拉丁名Molybdaenum。它是一种过渡金属，特别用于钢合金中以改善耐热性。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del molibdeno?", listOf("Mo", "Mb", "Mn", "Mg"), "Ciencia", "El molibdeno deriva su símbolo químico Mo de su nombre latino Molybdaenum. Es un metal de transición utilizado especialmente en aleaciones de acero para mejorar la resistencia al calor.")
        ),
        BilingualQuestion(
            id = 8691, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la solubilité du sel dans l'eau?", listOf("36 g/100 mL", "50 g/100 mL", "20 g/100 mL", "10 g/100 mL"), "Science", "À 20 °C, l'eau peut dissoudre au maximum 36 grammes de sel pour 100 millilitres, ce qui correspond à sa solubilité dans ces conditions standard."),
            en = LocalizedContent("What is the solubility of salt in water?", listOf("36 g/100 mL", "50 g/100 mL", "20 g/100 mL", "10 g/100 mL"), "Science", "At 20 °C, water can dissolve a maximum of 36 grams of salt per 100 milliliters, which corresponds to its solubility under these standard conditions."),
            zh = LocalizedContent("盐在水中的溶解度是多少？", listOf("36克/100毫升", "50克/100毫升", "20克/100毫升", "10克/100毫升"), "科学", "在20°C时，水每100毫升最多可溶解36克盐，这对应于标准条件下的溶解度。"),
            es = LocalizedContent("¿Cuál es la solubilidad de la sal en agua?", listOf("36 g/100 mL", "50 g/100 mL", "20 g/100 mL", "10 g/100 mL"), "Ciencia", "A 20 °C, el agua puede disolver un máximo de 36 gramos de sal por cada 100 mililitros, lo que corresponde a su solubilidad en estas condiciones estándar.")
        ),
        BilingualQuestion(
            id = 8692, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus grand rayon atomique?", listOf("Francium", "Césium", "Rubidium", "Potassium"), "Science", "Le francium possède le plus grand rayon atomique car il se situe en bas à gauche du tableau périodique, où l'ajout de couches électroniques et la faible charge nucléaire effective augmentent la taille des atomes."),
            en = LocalizedContent("Which chemical element has the largest atomic radius?", listOf("Francium", "Cesium", "Rubidium", "Potassium"), "Science", "Francium has the largest atomic radius because it is located at the bottom left of the periodic table, where the addition of electron shells and low effective nuclear charge increase the size of atoms."),
            zh = LocalizedContent("哪种化学元素的原子半径最大？", listOf("钫", "铯", "铷", "钾"), "科学", "钫的原子半径最大，因为它位于元素周期表的左下角，电子层的增加和较低的有效核电荷使原子尺寸增大。"),
            es = LocalizedContent("¿Qué elemento químico tiene el mayor radio atómico?", listOf("Francio", "Cesio", "Rubidio", "Potasio"), "Ciencia", "El francio tiene el mayor radio atómico porque se encuentra en la parte inferior izquierda de la tabla periódica, donde la adición de capas electrónicas y la baja carga nuclear efectiva aumentan el tamaño de los átomos.")
        ),
        BilingualQuestion(
            id = 8693, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le positron?", listOf("Carl Anderson", "Dirac", "Paul Diracs", "Ernest Rutherford"), "Science", "Paul Dirac a prédit l'existence du positron en 1928 via son équation relativiste de l'électron, et la particule fut confirmée expérimentalement en 1932 par Carl Anderson."),
            en = LocalizedContent("Which scientist discovered the positron?", listOf("Carl Anderson", "Dirac", "Paul Diracs", "Ernest Rutherford"), "Science", "Paul Dirac predicted the existence of the positron in 1928 via his relativistic equation of the electron, and the particle was experimentally confirmed in 1932 by Carl Anderson."),
            zh = LocalizedContent("哪位科学家发现了正电子？", listOf("卡尔·安德森", "狄拉克", "保罗·狄拉克", "欧内斯特·卢瑟福"), "科学", "保罗·狄拉克在1928年通过他的电子相对论方程预言了正电子的存在，该粒子于1932年被卡尔·安德森实验证实。"),
            es = LocalizedContent("¿Qué científico descubrió el positrón?", listOf("Carl Anderson", "Dirac", "Paul Dirac", "Ernest Rutherford"), "Ciencia", "Paul Dirac predijo la existencia del positrón en 1928 mediante su ecuación relativista del electrón, y la partícula fue confirmada experimentalmente en 1932 por Carl Anderson.")
        ),
        BilingualQuestion(
            id = 8694, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du dihydrogène?", listOf("H2", "H", "He", "Ho"), "Science", "Le symbole chimique du dihydrogène est H2 car il est composé de deux atomes d'hydrogène liés."),
            en = LocalizedContent("What is the chemical symbol for dihydrogen?", listOf("H2", "H", "He", "Ho"), "Science", "The chemical symbol for dihydrogen is H2 because it consists of two hydrogen atoms bonded together."),
            zh = LocalizedContent("二氢的化学符号是什么？", listOf("H2", "H", "He", "Ho"), "科学", "二氢的化学符号是H2，因为它由两个氢原子结合而成。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del dihidrógeno?", listOf("H2", "H", "He", "Ho"), "Ciencia", "El símbolo químico del dihidrógeno es H2 porque está compuesto por dos átomos de hidrógeno unidos.")
        ),
        BilingualQuestion(
            id = 8695, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres cervicales a un humain?", listOf("7", "6", "8", "5"), "Science", "Les mammifères, y compris les humains, possèdent généralement sept vertèbres cervicales, quelle que soit la longueur de leur cou. Cette constance est une caractéristique commune à la plupart des espèces."),
            en = LocalizedContent("How many cervical vertebrae does a human have?", listOf("7", "6", "8", "5"), "Science", "Mammals, including humans, generally have seven cervical vertebrae, regardless of neck length. This constancy is a common characteristic of most species."),
            zh = LocalizedContent("人类有多少块颈椎？", listOf("7", "6", "8", "5"), "科学", "哺乳动物（包括人类）通常有七块颈椎，无论脖子长短。这种恒定性是大多数物种的共同特征。"),
            es = LocalizedContent("¿Cuántas vértebras cervicales tiene un humano?", listOf("7", "6", "8", "5"), "Ciencia", "Los mamíferos, incluidos los humanos, generalmente tienen siete vértebras cervicales, independientemente de la longitud del cuello. Esta constancia es una característica común de la mayoría de las especies.")
        ),
        BilingualQuestion(
            id = 8696, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la somatostatine?", listOf("Pancréas", "Hypophyse", "Thyroïde", "Surrénale"), "Science", "Le pancréas produit la somatostatine via ses cellules delta des îlots de Langerhans, une hormone qui régule la libération d'autres hormones digestives."),
            en = LocalizedContent("Which gland produces somatostatin?", listOf("Pancreas", "Pituitary", "Thyroid", "Adrenal"), "Science", "The pancreas produces somatostatin via its delta cells of the islets of Langerhans, a hormone that regulates the release of other digestive hormones."),
            zh = LocalizedContent("哪个腺体产生生长抑素？", listOf("胰腺", "垂体", "甲状腺", "肾上腺"), "科学", "胰腺通过其胰岛的δ细胞产生生长抑素，这是一种调节其他消化激素释放的激素。"),
            es = LocalizedContent("¿Qué glándula produce la somatostatina?", listOf("Páncreas", "Hipófisis", "Tiroides", "Suprarrenal"), "Ciencia", "El páncreas produce somatostatina a través de sus células delta de los islotes de Langerhans, una hormona que regula la liberación de otras hormonas digestivas.")
        ),
        BilingualQuestion(
            id = 8697, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand astéroïde entre Mars et Jupiter?", listOf("Cérès", "Vesta", "Pallas", "Junon"), "Science", "Cérès est le plus grand objet de la ceinture d'astéroïdes située entre Mars et Jupiter, avec un diamètre d'environ 940 kilomètres, ce qui lui a valu d'être classé comme planète naine en 2006."),
            en = LocalizedContent("What is the largest asteroid between Mars and Jupiter?", listOf("Ceres", "Vesta", "Pallas", "Juno"), "Science", "Ceres is the largest object in the asteroid belt between Mars and Jupiter, with a diameter of about 940 kilometers, which earned it classification as a dwarf planet in 2006."),
            zh = LocalizedContent("火星和木星之间最大的小行星是什么？", listOf("谷神星", "灶神星", "智神星", "婚神星"), "科学", "谷神星是火星和木星之间小行星带中最大的天体，直径约940公里，因此在2006年被归类为矮行星。"),
            es = LocalizedContent("¿Cuál es el asteroide más grande entre Marte y Júpiter?", listOf("Ceres", "Vesta", "Pallas", "Juno"), "Ciencia", "Ceres es el objeto más grande del cinturón de asteroides entre Marte y Júpiter, con un diámetro de aproximadamente 940 kilómetros, lo que le valió la clasificación como planeta enano en 2006.")
        ),
        BilingualQuestion(
            id = 8698, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le Lambda?", listOf("Murray Gell-Mann", "George Zweig", "Buford Butler", "Robert Oppenheimer"), "Science", "Murray Gell-Mann a introduit la particule lambda (Λ) dans le cadre de la classification des hadrons, qu'il a nommée la voie octuple. Ce travail lui a valu le prix Nobel de physique en 1969."),
            en = LocalizedContent("Which scientist discovered the Lambda?", listOf("Murray Gell-Mann", "George Zweig", "Buford Butler", "Robert Oppenheimer"), "Science", "Murray Gell-Mann introduced the lambda particle (Λ) as part of the classification of hadrons, which he called the Eightfold Way. This work earned him the Nobel Prize in Physics in 1969."),
            zh = LocalizedContent("哪位科学家发现了Λ粒子？", listOf("默里·盖尔曼", "乔治·茨威格", "布福德·巴特勒", "罗伯特·奥本海默"), "科学", "默里·盖尔曼在强子分类中引入了Λ粒子，他称之为八重法。这项工作为他赢得了1969年的诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió la partícula Lambda?", listOf("Murray Gell-Mann", "George Zweig", "Buford Butler", "Robert Oppenheimer"), "Ciencia", "Murray Gell-Mann introdujo la partícula lambda (Λ) como parte de la clasificación de los hadrones, que denominó el camino óctuple. Este trabajo le valió el Premio Nobel de Física en 1969.")
        ),
        BilingualQuestion(
            id = 8699, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du dioxyde d'azote?", listOf("NO2", "N2O", "NO", "N2O5"), "Science", "NO2 signifie un atome d'azote lié à deux atomes d'oxygène, formant un gaz polluant brun-rouge issu de la combustion."),
            en = LocalizedContent("What is the chemical symbol for nitrogen dioxide?", listOf("NO2", "N2O", "NO", "N2O5"), "Science", "NO2 means one nitrogen atom bonded to two oxygen atoms, forming a brown-red polluting gas from combustion."),
            zh = LocalizedContent("二氧化氮的化学符号是什么？", listOf("NO2", "N2O", "NO", "N2O5"), "科学", "NO2表示一个氮原子与两个氧原子结合，形成一种来自燃烧的棕红色污染气体。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del dióxido de nitrógeno?", listOf("NO2", "N2O", "NO", "N2O5"), "Ciencia", "NO2 significa un átomo de nitrógeno unido a dos átomos de oxígeno, formando un gas contaminante de color marrón rojizo procedente de la combustión.")
        ),
        BilingualQuestion(
            id = 8700, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la distance Terre-Soleil en unités astronomiques?", listOf("1 UA", "2 UA", "0.5 UA", "1.5 UA"), "Science", "L'unité astronomique (UA) est précisément définie comme la distance moyenne entre la Terre et le Soleil, soit environ 150 millions de kilomètres."),
            en = LocalizedContent("What is the Earth-Sun distance in astronomical units?", listOf("1 AU", "2 AU", "0.5 AU", "1.5 AU"), "Science", "The astronomical unit (AU) is precisely defined as the average distance between Earth and the Sun, about 150 million kilometers."),
            zh = LocalizedContent("地球到太阳的距离是多少天文单位？", listOf("1 AU", "2 AU", "0.5 AU", "1.5 AU"), "科学", "天文单位（AU）精确定义为地球与太阳之间的平均距离，约为1.5亿公里。"),
            es = LocalizedContent("¿Cuál es la distancia Tierra-Sol en unidades astronómicas?", listOf("1 UA", "2 UA", "0.5 UA", "1.5 UA"), "Ciencia", "La unidad astronómica (UA) se define precisamente como la distancia media entre la Tierra y el Sol, unos 150 millones de kilómetros.")
        ),
        BilingualQuestion(
            id = 8701, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le troisième plus abondant dans la croûte terrestre?", listOf("Aluminium", "Fer", "Calcium", "Sodium"), "Science", "L'aluminium est le troisième élément le plus abondant dans la croûte terrestre après l'oxygène et le silicium, représentant environ 8% de sa masse."),
            en = LocalizedContent("Which chemical element is the third most abundant in the Earth's crust?", listOf("Aluminum", "Iron", "Calcium", "Sodium"), "Science", "Aluminum is the third most abundant element in the Earth's crust after oxygen and silicon, making up about 8% of its mass."),
            zh = LocalizedContent("地壳中第三丰富的化学元素是什么？", listOf("铝", "铁", "钙", "钠"), "科学", "铝是地壳中第三丰富的元素，仅次于氧和硅，约占其质量的8%。"),
            es = LocalizedContent("¿Qué elemento químico es el tercero más abundante en la corteza terrestre?", listOf("Aluminio", "Hierro", "Calcio", "Sodio"), "Ciencia", "El aluminio es el tercer elemento más abundante en la corteza terrestre después del oxígeno y el silicio, representando aproximadamente el 8% de su masa.")
        ),
        BilingualQuestion(
            id = 8702, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le Xi?", listOf("Murray Gell-Mann", "George Zweig", "Juan Carlos Santisteban", "Emilio Segrè"), "Science", "Murray Gell-Mann a découvert la particule subatomique nommée Xi en 1964, contribuant à la classification des hadrons via le modèle des quarks."),
            en = LocalizedContent("Which scientist discovered the Xi?", listOf("Murray Gell-Mann", "George Zweig", "Juan Carlos Santisteban", "Emilio Segrè"), "Science", "Murray Gell-Mann discovered the subatomic particle named Xi in 1964, contributing to the classification of hadrons via the quark model."),
            zh = LocalizedContent("哪位科学家发现了Xi粒子？", listOf("默里·盖尔曼", "乔治·茨威格", "胡安·卡洛斯·桑蒂斯特班", "埃米利奥·塞格雷"), "科学", "默里·盖尔曼于1964年发现了名为Xi的亚原子粒子，通过夸克模型为强子的分类做出了贡献。"),
            es = LocalizedContent("¿Qué científico descubrió la partícula Xi?", listOf("Murray Gell-Mann", "George Zweig", "Juan Carlos Santisteban", "Emilio Segrè"), "Ciencia", "Murray Gell-Mann descubrió la partícula subatómica llamada Xi en 1964, contribuyendo a la clasificación de los hadrones mediante el modelo de quarks.")
        ),
        BilingualQuestion(
            id = 8703, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du trioxyde de soufre?", listOf("SO3", "SO2", "S2O3", "SO"), "Science", "Le trioxyde de soufre est un composé chimique de formule SO3, où S représente le soufre et O l'oxygène, avec trois atomes d'oxygène."),
            en = LocalizedContent("What is the chemical symbol for sulfur trioxide?", listOf("SO3", "SO2", "S2O3", "SO"), "Science", "Sulfur trioxide is a chemical compound with the formula SO3, where S represents sulfur and O oxygen, with three oxygen atoms."),
            zh = LocalizedContent("三氧化硫的化学符号是什么？", listOf("SO3", "SO2", "S2O3", "SO"), "科学", "三氧化硫是一种化学化合物，分子式为SO3，其中S代表硫，O代表氧，含有三个氧原子。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del trióxido de azufre?", listOf("SO3", "SO2", "S2O3", "SO"), "Ciencia", "El trióxido de azufre es un compuesto químico con fórmula SO3, donde S representa azufre y O oxígeno, con tres átomos de oxígeno.")
        ),
        BilingualQuestion(
            id = 8704, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules B a un humain environ?", listOf("1 billion", "500 millions", "100 millions", "10 billions"), "Science", "Les lymphocytes B sont un type de globules blancs essentiels à l'immunité humorale. Le corps humain en contient environ 1 billion, soit 10¹² cellules."),
            en = LocalizedContent("How many B cells does a human have approximately?", listOf("1 trillion", "500 million", "100 million", "10 trillion"), "Science", "B lymphocytes are a type of white blood cell essential for humoral immunity. The human body contains about 1 trillion, or 10^12 cells."),
            zh = LocalizedContent("人体大约有多少个B细胞？", listOf("1万亿", "5亿", "1亿", "10万亿"), "科学", "B淋巴细胞是一种对体液免疫至关重要的白细胞。人体大约含有1万亿个，即10^12个细胞。"),
            es = LocalizedContent("¿Cuántas células B tiene un humano aproximadamente?", listOf("1 billón", "500 millones", "100 millones", "10 billones"), "Ciencia", "Los linfocitos B son un tipo de glóbulo blanco esencial para la inmunidad humoral. El cuerpo humano contiene aproximadamente 1 billón, es decir, 10^12 células.")
        ),
        BilingualQuestion(
            id = 8705, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit l'ocytocine?", listOf("Hypophyse", "Pancréas", "Thyroïde", "Surrénale"), "Science", "L'ocytocine est synthétisée dans l'hypothalamus, mais elle est stockée et libérée dans le sang par le lobe postérieur de l'hypophyse."),
            en = LocalizedContent("Which gland produces oxytocin?", listOf("Pituitary", "Pancreas", "Thyroid", "Adrenal"), "Science", "Oxytocin is synthesized in the hypothalamus, but it is stored and released into the blood by the posterior lobe of the pituitary gland."),
            zh = LocalizedContent("哪个腺体产生催产素？", listOf("垂体", "胰腺", "甲状腺", "肾上腺"), "科学", "催产素在下丘脑中合成，但由垂体后叶储存并释放到血液中。"),
            es = LocalizedContent("¿Qué glándula produce la oxitocina?", listOf("Hipófisis", "Páncreas", "Tiroides", "Suprarrenal"), "Ciencia", "La oxitocina se sintetiza en el hipotálamo, pero se almacena y libera en la sangre por el lóbulo posterior de la hipófisis.")
        ),
        BilingualQuestion(
            id = 8706, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand geyser du monde?", listOf("Steamboat Geyser", "Old Faithful", "Grand Prismatic Spring", "Pohutu Geyser"), "Science", "Le Steamboat Geyser, situé dans le parc national de Yellowstone aux États-Unis, détient le record de la plus haute éruption jamais enregistrée pour un geyser, atteignant jusqu'à 90 mètres."),
            en = LocalizedContent("What is the largest geyser in the world?", listOf("Steamboat Geyser", "Old Faithful", "Grand Prismatic Spring", "Pohutu Geyser"), "Science", "Steamboat Geyser, located in Yellowstone National Park in the United States, holds the record for the highest eruption ever recorded for a geyser, reaching up to 90 meters."),
            zh = LocalizedContent("世界上最大的间歇泉是什么？", listOf("汽船间歇泉", "老忠实泉", "大棱镜泉", "波胡图间歇泉"), "科学", "位于美国黄石国家公园的汽船间歇泉保持着间歇泉喷发高度的最高纪录，可达90米。"),
            es = LocalizedContent("¿Cuál es el géiser más grande del mundo?", listOf("Steamboat Geyser", "Old Faithful", "Grand Prismatic Spring", "Pohutu Geyser"), "Ciencia", "El Steamboat Geyser, ubicado en el Parque Nacional de Yellowstone en Estados Unidos, tiene el récord de la erupción más alta jamás registrada para un géiser, alcanzando hasta 90 metros.")
        ),
        BilingualQuestion(
            id = 8707, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le photon?", listOf("Max Planck", "Albert Einstein", "Niels Bohr", "Werner Heisenberg"), "Science", "Albert Einstein a proposé l'existence du photon en 1905 pour expliquer l'effet photoélectrique, ce qui lui a valu le prix Nobel de physique en 1921."),
            en = LocalizedContent("Which scientist discovered the photon?", listOf("Max Planck", "Albert Einstein", "Niels Bohr", "Werner Heisenberg"), "Science", "Albert Einstein proposed the existence of the photon in 1905 to explain the photoelectric effect, which earned him the Nobel Prize in Physics in 1921."),
            zh = LocalizedContent("哪位科学家发现了光子？", listOf("马克斯·普朗克", "阿尔伯特·爱因斯坦", "尼尔斯·玻尔", "维尔纳·海森堡"), "科学", "阿尔伯特·爱因斯坦于1905年提出光子的存在以解释光电效应，并因此获得1921年诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el fotón?", listOf("Max Planck", "Albert Einstein", "Niels Bohr", "Werner Heisenberg"), "Ciencia", "Albert Einstein propuso la existencia del fotón en 1905 para explicar el efecto fotoeléctrico, lo que le valió el Premio Nobel de Física en 1921.")
        ),
        BilingualQuestion(
            id = 8708, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du monoxyde de carbone?", listOf("CO", "CO2", "C2O", "CO3"), "Science", "Le monoxyde de carbone est un composé formé d'un atome de carbone et d'un atome d'oxygène, d'où le symbole CO."),
            en = LocalizedContent("What is the chemical symbol for carbon monoxide?", listOf("CO", "CO2", "C2O", "CO3"), "Science", "Carbon monoxide is a compound formed of one carbon atom and one oxygen atom, hence the symbol CO."),
            zh = LocalizedContent("一氧化碳的化学符号是什么？", listOf("CO", "CO2", "C2O", "CO3"), "科学", "一氧化碳是由一个碳原子和一个氧原子组成的化合物，因此符号为CO。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del monóxido de carbono?", listOf("CO", "CO2", "C2O", "CO3"), "Ciencia", "El monóxido de carbono es un compuesto formado por un átomo de carbono y un átomo de oxígeno, de ahí el símbolo CO.")
        ),
        BilingualQuestion(
            id = 8709, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'hémoglobine dans le sang?", listOf("15 g/100 mL", "10 g/100 mL", "20 g/100 mL", "5 g/100 mL"), "Science", "La concentration moyenne d'hémoglobine dans le sang est d'environ 15 grammes pour 100 millilitres, variant légèrement selon le sexe et l'âge."),
            en = LocalizedContent("What is the concentration of hemoglobin in blood?", listOf("15 g/100 mL", "10 g/100 mL", "20 g/100 mL", "5 g/100 mL"), "Science", "The average concentration of hemoglobin in blood is about 15 grams per 100 milliliters, varying slightly by sex and age."),
            zh = LocalizedContent("血液中血红蛋白的浓度是多少？", listOf("15克/100毫升", "10克/100毫升", "20克/100毫升", "5克/100毫升"), "科学", "血液中血红蛋白的平均浓度约为每100毫升15克，因性别和年龄略有差异。"),
            es = LocalizedContent("¿Cuál es la concentración de hemoglobina en la sangre?", listOf("15 g/100 mL", "10 g/100 mL", "20 g/100 mL", "5 g/100 mL"), "Ciencia", "La concentración media de hemoglobina en la sangre es de aproximadamente 15 gramos por 100 mililitros, variando ligeramente según el sexo y la edad.")
        ),
        BilingualQuestion(
            id = 8710, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus mou?", listOf("Sodium", "Potassium", "Lithium", "Césium"), "Science", "Le sodium est un métal alcalin très mou, pouvant être coupé au couteau, car ses atomes sont faiblement liés entre eux dans une structure cristalline."),
            en = LocalizedContent("Which chemical element is the softest?", listOf("Sodium", "Potassium", "Lithium", "Cesium"), "Science", "Sodium is a very soft alkali metal that can be cut with a knife because its atoms are weakly bonded in a crystalline structure."),
            zh = LocalizedContent("哪种化学元素最软？", listOf("钠", "钾", "锂", "铯"), "科学", "钠是一种非常软的碱金属，可以用刀切割，因为其原子在晶体结构中结合较弱。"),
            es = LocalizedContent("¿Qué elemento químico es el más blando?", listOf("Sodio", "Potasio", "Litio", "Cesio"), "Ciencia", "El sodio es un metal alcalino muy blando que se puede cortar con un cuchillo porque sus átomos están débilmente unidos en una estructura cristalina.")
        ),
        BilingualQuestion(
            id = 8711, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le Sigma?", listOf("Murray Gell-Mann", "George Zweig", "Luis Walter Alvarez", "Jerome Friedman"), "Science", "Murray Gell-Mann a introduit le concept de sigma dans le cadre de sa classification des particules subatomiques, les hadrons, en utilisant la symétrie SU(3) et le modèle des quarks."),
            en = LocalizedContent("Which scientist discovered the Sigma?", listOf("Murray Gell-Mann", "George Zweig", "Luis Walter Alvarez", "Jerome Friedman"), "Science", "Murray Gell-Mann introduced the concept of sigma in his classification of subatomic particles, hadrons, using SU(3) symmetry and the quark model."),
            zh = LocalizedContent("哪位科学家发现了Sigma粒子？", listOf("默里·盖尔曼", "乔治·茨威格", "路易斯·沃尔特·阿尔瓦雷茨", "杰罗姆·弗里德曼"), "科学", "默里·盖尔曼在利用SU(3)对称性和夸克模型对亚原子粒子（强子）进行分类时引入了Sigma粒子的概念。"),
            es = LocalizedContent("¿Qué científico descubrió el Sigma?", listOf("Murray Gell-Mann", "George Zweig", "Luis Walter Alvarez", "Jerome Friedman"), "Ciencia", "Murray Gell-Mann introdujo el concepto de sigma en su clasificación de partículas subatómicas, los hadrones, utilizando la simetría SU(3) y el modelo de quarks.")
        ),
        BilingualQuestion(
            id = 8712, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du peroxyde d'hydrogène?", listOf("H2O2", "H2O", "HO2", "H3O2"), "Science", "H2O2 est la formule chimique du peroxyde d'hydrogène, composé de deux atomes d'hydrogène et deux atomes d'oxygène."),
            en = LocalizedContent("What is the chemical symbol for hydrogen peroxide?", listOf("H2O2", "H2O", "HO2", "H3O2"), "Science", "H2O2 is the chemical formula for hydrogen peroxide, composed of two hydrogen atoms and two oxygen atoms."),
            zh = LocalizedContent("过氧化氢的化学符号是什么？", listOf("H2O2", "H2O", "HO2", "H3O2"), "科学", "H2O2是过氧化氢的化学式，由两个氢原子和两个氧原子组成。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del peróxido de hidrógeno?", listOf("H2O2", "H2O", "HO2", "H3O2"), "Ciencia", "H2O2 es la fórmula química del peróxido de hidrógeno, compuesto por dos átomos de hidrógeno y dos de oxígeno.")
        ),
        BilingualQuestion(
            id = 8713, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de lobes a le poumon gauche?", listOf("2", "3", "4", "5"), "Science", "Le poumon gauche possède deux lobes (supérieur et inférieur) pour laisser de la place au cœur, contrairement au poumon droit qui en a trois."),
            en = LocalizedContent("How many lobes does the left lung have?", listOf("2", "3", "4", "5"), "Science", "The left lung has two lobes (superior and inferior) to make room for the heart, unlike the right lung which has three."),
            zh = LocalizedContent("左肺有多少个肺叶？", listOf("2", "3", "4", "5"), "科学", "左肺有两个肺叶（上叶和下叶），以便为心脏腾出空间，而右肺有三个肺叶。"),
            es = LocalizedContent("¿Cuántos lóbulos tiene el pulmón izquierdo?", listOf("2", "3", "4", "5"), "Ciencia", "El pulmón izquierdo tiene dos lóbulos (superior e inferior) para dejar espacio al corazón, a diferencia del pulmón derecho que tiene tres.")
        ),
        BilingualQuestion(
            id = 8714, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la cholécystokinine?", listOf("Duodénum", "Estomac", "Foie", "Pancréas"), "Science", "La cholécystokinine est une hormone digestive sécrétée par les cellules de la muqueuse du duodénum en réponse à l'arrivée de graisses et de protéines."),
            en = LocalizedContent("Which gland produces cholecystokinin?", listOf("Duodenum", "Stomach", "Liver", "Pancreas"), "Science", "Cholecystokinin is a digestive hormone secreted by cells of the duodenal mucosa in response to the arrival of fats and proteins."),
            zh = LocalizedContent("哪种腺体产生胆囊收缩素？", listOf("十二指肠", "胃", "肝脏", "胰腺"), "科学", "胆囊收缩素是一种消化激素，由十二指肠黏膜细胞在脂肪和蛋白质到达时分泌。"),
            es = LocalizedContent("¿Qué glándula produce la colecistoquinina?", listOf("Duodeno", "Estómago", "Hígado", "Páncreas"), "Ciencia", "La colecistoquinina es una hormona digestiva secretada por las células de la mucosa duodenal en respuesta a la llegada de grasas y proteínas.")
        ),
        BilingualQuestion(
            id = 8715, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand lac de cratère du monde?", listOf("Lac Crater", "Lac Rotoiti", "Lac Rotorua", "Lac Tanganyika"), "Science", "Le lac Crater, situé dans l'Oregon aux États-Unis, s'est formé il y a environ 7 700 ans dans la caldeira du volcan Mazama. C'est le plus profond lac des États-Unis et le plus grand lac de cratère du monde par son volume."),
            en = LocalizedContent("What is the largest crater lake in the world?", listOf("Crater Lake", "Lake Rotoiti", "Lake Rotorua", "Lake Tanganyika"), "Science", "Crater Lake, located in Oregon, USA, formed about 7,700 years ago in the caldera of Mount Mazama. It is the deepest lake in the USA and the largest crater lake in the world by volume."),
            zh = LocalizedContent("世界上最大的火山口湖是哪个？", listOf("火山口湖", "罗托伊蒂湖", "罗托鲁阿湖", "坦噶尼喀湖"), "科学", "火山口湖位于美国俄勒冈州，大约在7700年前形成于马扎马火山的火山口。它是美国最深的湖泊，也是世界上体积最大的火山口湖。"),
            es = LocalizedContent("¿Cuál es el lago de cráter más grande del mundo?", listOf("Lago Cráter", "Lago Rotoiti", "Lago Rotorua", "Lago Tanganyika"), "Ciencia", "El lago Cráter, ubicado en Oregón, EE. UU., se formó hace unos 7.700 años en la caldera del volcán Mazama. Es el lago más profundo de EE. UU. y el lago de cráter más grande del mundo por volumen.")
        ),
        BilingualQuestion(
            id = 8716, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'antiproton?", listOf("Emilio Segrè", "Clyde Cowan", "Frederick Reines", "Luis Walter Alvarez"), "Science", "Emilio Segrè a reçu le prix Nobel de physique en 1959 pour la découverte de l'antiproton, une particule d'antimatière, réalisée en 1955 avec Owen Chamberlain."),
            en = LocalizedContent("Which scientist discovered the antiproton?", listOf("Emilio Segrè", "Clyde Cowan", "Frederick Reines", "Luis Walter Alvarez"), "Science", "Emilio Segrè received the Nobel Prize in Physics in 1959 for the discovery of the antiproton, an antimatter particle, achieved in 1955 with Owen Chamberlain."),
            zh = LocalizedContent("哪位科学家发现了反质子？", listOf("埃米利奥·塞格雷", "克莱德·考恩", "弗雷德里克·莱因斯", "路易斯·沃尔特·阿尔瓦雷茨"), "科学", "埃米利奥·塞格雷因1955年与欧文·张伯伦共同发现反质子（一种反物质粒子）而获得1959年诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el antiprotón?", listOf("Emilio Segrè", "Clyde Cowan", "Frederick Reines", "Luis Walter Alvarez"), "Ciencia", "Emilio Segrè recibió el Premio Nobel de Física en 1959 por el descubrimiento del antiprotón, una partícula de antimateria, logrado en 1955 con Owen Chamberlain.")
        ),
        BilingualQuestion(
            id = 8717, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du fluorure d'hydrogène?", listOf("HF", "H2F", "HF2", "FH"), "Science", "Le fluorure d'hydrogène est un composé chimique formé d'un atome d'hydrogène et d'un atome de fluor, d'où son symbole HF."),
            en = LocalizedContent("What is the chemical symbol for hydrogen fluoride?", listOf("HF", "H2F", "HF2", "FH"), "Science", "Hydrogen fluoride is a chemical compound formed from one hydrogen atom and one fluorine atom, hence its symbol HF."),
            zh = LocalizedContent("氟化氢的化学符号是什么？", listOf("HF", "H2F", "HF2", "FH"), "科学", "氟化氢是由一个氢原子和一个氟原子组成的化合物，因此其符号为HF。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fluoruro de hidrógeno?", listOf("HF", "H2F", "HF2", "FH"), "Ciencia", "El fluoruro de hidrógeno es un compuesto químico formado por un átomo de hidrógeno y un átomo de flúor, de ahí su símbolo HF.")
        ),
        BilingualQuestion(
            id = 8718, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la viscosité du sang?", listOf("4-5 cP", "1-2 cP", "10-12 cP", "2-3 cP"), "Science", "Le sang a une viscosité relative de 4 à 5 centipoises (cP) à 37°C, car il est plus épais que l'eau (1 cP) en raison des globules rouges et des protéines."),
            en = LocalizedContent("What is the viscosity of blood?", listOf("4-5 cP", "1-2 cP", "10-12 cP", "2-3 cP"), "Science", "Blood has a relative viscosity of 4 to 5 centipoise (cP) at 37°C, as it is thicker than water (1 cP) due to red blood cells and proteins."),
            zh = LocalizedContent("血液的粘度是多少？", listOf("4-5 cP", "1-2 cP", "10-12 cP", "2-3 cP"), "科学", "血液在37°C时的相对粘度为4到5厘泊（cP），因为红细胞和蛋白质使其比水（1 cP）更粘稠。"),
            es = LocalizedContent("¿Cuál es la viscosidad de la sangre?", listOf("4-5 cP", "1-2 cP", "10-12 cP", "2-3 cP"), "Ciencia", "La sangre tiene una viscosidad relativa de 4 a 5 centipoises (cP) a 37°C, ya que es más espesa que el agua (1 cP) debido a los glóbulos rojos y las proteínas.")
        ),
        BilingualQuestion(
            id = 8719, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a un électron de valence?", listOf("Sodium", "Magnésium", "Aluminium", "Silicium"), "Science", "Le sodium possède un seul électron sur sa couche externe, ce qui en fait un élément avec un électron de valence. Cette propriété le classe dans la famille des métaux alcalins."),
            en = LocalizedContent("Which chemical element has one valence electron?", listOf("Sodium", "Magnesium", "Aluminum", "Silicon"), "Science", "Sodium has a single electron in its outer shell, making it an element with one valence electron. This property places it in the alkali metal family."),
            zh = LocalizedContent("哪种化学元素有一个价电子？", listOf("钠", "镁", "铝", "硅"), "科学", "钠的最外层只有一个电子，因此它是一种具有一个价电子的元素。这一性质使其属于碱金属家族。"),
            es = LocalizedContent("¿Qué elemento químico tiene un electrón de valencia?", listOf("Sodio", "Magnesio", "Aluminio", "Silicio"), "Ciencia", "El sodio tiene un solo electrón en su capa externa, lo que lo convierte en un elemento con un electrón de valencia. Esta propiedad lo clasifica en la familia de los metales alcalinos.")
        ),
        BilingualQuestion(
            id = 8720, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'antineutrino?", listOf("Frederick Reines", "Clyde Cowan", "Luis Walter Alvarez", "Emilio Segrè"), "Science", "Frederick Reines a découvert l'antineutrino en 1956 lors de l'expérience du projet Poltergeist, ce qui lui a valu le prix Nobel de physique en 1995."),
            en = LocalizedContent("Which scientist discovered the antineutrino?", listOf("Frederick Reines", "Clyde Cowan", "Luis Walter Alvarez", "Emilio Segrè"), "Science", "Frederick Reines discovered the antineutrino in 1956 during the Poltergeist project experiment, which earned him the Nobel Prize in Physics in 1995."),
            zh = LocalizedContent("哪位科学家发现了反中微子？", listOf("弗雷德里克·莱因斯", "克莱德·科温", "路易斯·沃尔特·阿尔瓦雷茨", "埃米利奥·塞格雷"), "科学", "弗雷德里克·莱因斯在1956年的波尔格斯特项目实验中发现了反中微子，并因此获得1995年诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el antineutrino?", listOf("Frederick Reines", "Clyde Cowan", "Luis Walter Alvarez", "Emilio Segrè"), "Ciencia", "Frederick Reines descubrió el antineutrino en 1956 durante el experimento del proyecto Poltergeist, lo que le valió el Premio Nobel de Física en 1995.")
        ),
        BilingualQuestion(
            id = 8721, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du sulfure de dihydrogène?", listOf("H2S", "H2Se", "HS2", "H3S"), "Science", "Le sulfure de dihydrogène, aussi appelé hydrogène sulfuré, est un gaz composé de deux atomes d'hydrogène et un atome de soufre, d'où son symbole chimique H2S."),
            en = LocalizedContent("What is the chemical symbol for hydrogen sulfide?", listOf("H2S", "H2Se", "HS2", "H3S"), "Science", "Hydrogen sulfide, also called dihydrogen sulfide, is a gas composed of two hydrogen atoms and one sulfur atom, hence its chemical symbol H2S."),
            zh = LocalizedContent("硫化氢的化学符号是什么？", listOf("H2S", "H2Se", "HS2", "H3S"), "科学", "硫化氢，也称为二氢硫化物，是一种由两个氢原子和一个硫原子组成的气体，因此其化学符号为H2S。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del sulfuro de dihidrógeno?", listOf("H2S", "H2Se", "HS2", "H3S"), "Ciencia", "El sulfuro de dihidrógeno, también llamado ácido sulfhídrico, es un gas compuesto por dos átomos de hidrógeno y un átomo de azufre, de ahí su símbolo químico H2S.")
        ),
        BilingualQuestion(
            id = 8722, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules T a un humain environ?", listOf("1 trillion", "500 milliards", "100 milliards", "10 trillions"), "Science", "Le corps humain contient environ 1 trillion de lymphocytes T, un type de globule blanc essentiel au système immunitaire adaptatif. Ce nombre varie selon l'âge et l'état de santé."),
            en = LocalizedContent("How many T cells does a human have approximately?", listOf("1 trillion", "500 billion", "100 billion", "10 trillion"), "Science", "The human body contains about 1 trillion T lymphocytes, a type of white blood cell essential for the adaptive immune system. This number varies with age and health."),
            zh = LocalizedContent("人类大约有多少个T细胞？", listOf("1万亿", "5000亿", "1000亿", "10万亿"), "科学", "人体含有约1万亿个T淋巴细胞，这是一种对适应性免疫系统至关重要的白细胞。这个数字随年龄和健康状况而变化。"),
            es = LocalizedContent("¿Cuántas células T tiene un humano aproximadamente?", listOf("1 billón", "500 mil millones", "100 mil millones", "10 billones"), "Ciencia", "El cuerpo humano contiene aproximadamente 1 billón de linfocitos T, un tipo de glóbulo blanco esencial para el sistema inmunitario adaptativo. Este número varía según la edad y el estado de salud.")
        ),
        BilingualQuestion(
            id = 8723, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le peptide intestinal vasoactif?", listOf("Duodénum", "Estomac", "Foie", "Pancréas"), "Science", "Le peptide intestinal vasoactif est principalement sécrété par les cellules endocrines du duodénum, où il régule la vasodilatation et la motilité intestinale."),
            en = LocalizedContent("Which gland produces vasoactive intestinal peptide?", listOf("Duodenum", "Stomach", "Liver", "Pancreas"), "Science", "Vasoactive intestinal peptide is mainly secreted by endocrine cells in the duodenum, where it regulates vasodilation and intestinal motility."),
            zh = LocalizedContent("哪个腺体产生血管活性肠肽？", listOf("十二指肠", "胃", "肝脏", "胰腺"), "科学", "血管活性肠肽主要由十二指肠的内分泌细胞分泌，调节血管舒张和肠道蠕动。"),
            es = LocalizedContent("¿Qué glándula produce el péptido intestinal vasoactivo?", listOf("Duodeno", "Estómago", "Hígado", "Páncreas"), "Ciencia", "El péptido intestinal vasoactivo es secretado principalmente por las células endocrinas del duodeno, donde regula la vasodilatación y la motilidad intestinal.")
        ),
        BilingualQuestion(
            id = 8724, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand solfatare du monde?", listOf("Solfatara de Pouzzoles", "Geyser d'Islande", "Mud Volcanoes de Boue", "Hot Springs de Nouvelle-Zélande"), "Science", "La Solfatara de Pouzzoles, près de Naples, est un cratère volcanique actif avec des fumerolles sulfureuses, ce qui en fait le plus grand solfatare du monde."),
            en = LocalizedContent("What is the largest solfatara in the world?", listOf("Solfatara of Pozzuoli", "Geyser of Iceland", "Mud Volcanoes of Boue", "Hot Springs of New Zealand"), "Science", "The Solfatara of Pozzuoli, near Naples, is an active volcanic crater with sulfurous fumaroles, making it the largest solfatara in the world."),
            zh = LocalizedContent("世界上最大的硫质喷气孔是什么？", listOf("波佐利硫质喷气孔", "冰岛间歇泉", "布埃泥火山", "新西兰温泉"), "科学", "那不勒斯附近的波佐利硫质喷气孔是一个活跃的火山口，带有含硫喷气孔，使其成为世界上最大的硫质喷气孔。"),
            es = LocalizedContent("¿Cuál es la solfatara más grande del mundo?", listOf("Solfatara de Pozzuoli", "Géiser de Islandia", "Volcanes de lodo de Boue", "Aguas termales de Nueva Zelanda"), "Ciencia", "La Solfatara de Pozzuoli, cerca de Nápoles, es un cráter volcánico activo con fumarolas sulfurosas, lo que la convierte en la solfatara más grande del mundo.")
        ),
        BilingualQuestion(
            id = 8725, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le Lambda0?", listOf("Strange et Gell-Mann", "Murray Gell-Mann", "George Zweig", "Juan Carlos Santisteban"), "Science", "Le Lambda0 est une particule subatomique dont l'existence a été prédite par Murray Gell-Mann et Kazuhiko Nishijima via le concept d'étrangeté, avant sa découverte expérimentale en 1950."),
            en = LocalizedContent("Which scientist discovered the Lambda0?", listOf("Strange and Gell-Mann", "Murray Gell-Mann", "George Zweig", "Juan Carlos Santisteban"), "Science", "The Lambda0 is a subatomic particle whose existence was predicted by Murray Gell-Mann and Kazuhiko Nishijima through the concept of strangeness, before its experimental discovery in 1950."),
            zh = LocalizedContent("哪位科学家发现了Lambda0？", listOf("斯特兰奇和盖尔曼", "默里·盖尔曼", "乔治·茨威格", "胡安·卡洛斯·桑蒂斯特班"), "科学", "Lambda0是一种亚原子粒子，其存在由默里·盖尔曼和中西和彦通过奇异数概念预测，随后于1950年被实验发现。"),
            es = LocalizedContent("¿Qué científico descubrió el Lambda0?", listOf("Strange y Gell-Mann", "Murray Gell-Mann", "George Zweig", "Juan Carlos Santisteban"), "Ciencia", "El Lambda0 es una partícula subatómica cuya existencia fue predicha por Murray Gell-Mann y Kazuhiko Nishijima mediante el concepto de extrañeza, antes de su descubrimiento experimental en 1950.")
        ),
        BilingualQuestion(
            id = 8726, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique de l'ammoniac?", listOf("NH3", "NH4", "NH2", "N2H4"), "Science", "NH3 est la formule chimique de l'ammoniac, composé d'un atome d'azote (N) et de trois atomes d'hydrogène (H)."),
            en = LocalizedContent("What is the chemical symbol for ammonia?", listOf("NH3", "NH4", "NH2", "N2H4"), "Science", "NH3 is the chemical formula for ammonia, composed of one nitrogen atom (N) and three hydrogen atoms (H)."),
            zh = LocalizedContent("氨的化学符号是什么？", listOf("NH3", "NH4", "NH2", "N2H4"), "科学", "NH3是氨的化学式，由一个氮原子（N）和三个氢原子（H）组成。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del amoníaco?", listOf("NH3", "NH4", "NH2", "N2H4"), "Ciencia", "NH3 es la fórmula química del amoníaco, compuesto por un átomo de nitrógeno (N) y tres átomos de hidrógeno (H).")
        ),
        BilingualQuestion(
            id = 8727, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'albumine dans le plasma?", listOf("35-50 g/L", "10-20 g/L", "60-80 g/L", "80-100 g/L"), "Science", "L'albumine est la protéine la plus abondante du plasma, synthétisée par le foie, et sa concentration normale se situe entre 35 et 50 g/L, jouant un rôle clé dans le maintien de la pression oncotique."),
            en = LocalizedContent("What is the concentration of albumin in plasma?", listOf("35-50 g/L", "10-20 g/L", "60-80 g/L", "80-100 g/L"), "Science", "Albumin is the most abundant protein in plasma, synthesized by the liver, and its normal concentration ranges from 35 to 50 g/L, playing a key role in maintaining oncotic pressure."),
            zh = LocalizedContent("血浆中白蛋白的浓度是多少？", listOf("35-50 g/L", "10-20 g/L", "60-80 g/L", "80-100 g/L"), "科学", "白蛋白是血浆中最丰富的蛋白质，由肝脏合成，其正常浓度在35至50 g/L之间，在维持胶体渗透压中起关键作用。"),
            es = LocalizedContent("¿Cuál es la concentración de albúmina en el plasma?", listOf("35-50 g/L", "10-20 g/L", "60-80 g/L", "80-100 g/L"), "Ciencia", "La albúmina es la proteína más abundante del plasma, sintetizada por el hígado, y su concentración normal se sitúa entre 35 y 50 g/L, desempeñando un papel clave en el mantenimiento de la presión oncótica.")
        ),
        BilingualQuestion(
            id = 8728, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a deux électrons de valence?", listOf("Magnésium", "Sodium", "Aluminium", "Silicium"), "Science", "Le magnésium, situé dans la deuxième colonne du tableau périodique, possède deux électrons de valence dans sa couche externe."),
            en = LocalizedContent("Which chemical element has two valence electrons?", listOf("Magnesium", "Sodium", "Aluminum", "Silicon"), "Science", "Magnesium, located in the second column of the periodic table, has two valence electrons in its outer shell."),
            zh = LocalizedContent("哪种化学元素有两个价电子？", listOf("镁", "钠", "铝", "硅"), "科学", "镁位于元素周期表第二列，其最外层有两个价电子。"),
            es = LocalizedContent("¿Qué elemento químico tiene dos electrones de valencia?", listOf("Magnesio", "Sodio", "Aluminio", "Silicio"), "Ciencia", "El magnesio, situado en la segunda columna de la tabla periódica, posee dos electrones de valencia en su capa externa.")
        ),
        BilingualQuestion(
            id = 8729, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le graviton?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Le graviton est une particule hypothétique prédite par la théorie quantique des champs, mais son existence n'a pas été observée expérimentalement, ce qui en fait un concept purement théorique."),
            en = LocalizedContent("Which scientist discovered the graviton?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The graviton is a hypothetical particle predicted by quantum field theory, but its existence has not been observed experimentally, making it a purely theoretical concept."),
            zh = LocalizedContent("哪位科学家发现了引力子？", listOf("理论上的", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "引力子是一种由量子场论预测的假想粒子，但其存在尚未被实验观测到，因此是一个纯粹的理论概念。"),
            es = LocalizedContent("¿Qué científico descubrió el gravitón?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "El gravitón es una partícula hipotética predicha por la teoría cuántica de campos, pero su existencia no ha sido observada experimentalmente, lo que lo convierte en un concepto puramente teórico.")
        ),
        BilingualQuestion(
            id = 8730, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du cyanure d'hydrogène?", listOf("HCN", "H2CN", "HCEN", "HCN2"), "Science", "Le cyanure d'hydrogène est un composé chimique de formule HCN, où H représente l'hydrogène, C le carbone et N l'azote. Ce gaz incolore et hautement toxique est utilisé dans certains procédés industriels."),
            en = LocalizedContent("What is the chemical symbol for hydrogen cyanide?", listOf("HCN", "H2CN", "HCEN", "HCN2"), "Science", "Hydrogen cyanide is a chemical compound with the formula HCN, where H represents hydrogen, C carbon, and N nitrogen. This colorless, highly toxic gas is used in some industrial processes."),
            zh = LocalizedContent("氰化氢的化学符号是什么？", listOf("HCN", "H2CN", "HCEN", "HCN2"), "科学", "氰化氢是一种化学式为HCN的化合物，其中H代表氢，C代表碳，N代表氮。这种无色剧毒气体用于某些工业过程。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del cianuro de hidrógeno?", listOf("HCN", "H2CN", "HCEN", "HCN2"), "Ciencia", "El cianuro de hidrógeno es un compuesto químico de fórmula HCN, donde H representa hidrógeno, C carbono y N nitrógeno. Este gas incoloro y altamente tóxico se utiliza en algunos procesos industriales.")
        ),
        BilingualQuestion(
            id = 8731, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres thoraciques a un humain?", listOf("12", "11", "13", "10"), "Science", "La colonne vertébrale humaine compte 12 vertèbres thoraciques, situées entre les vertèbres cervicales et lombaires, chacune s'articulant avec une paire de côtes."),
            en = LocalizedContent("How many thoracic vertebrae does a human have?", listOf("12", "11", "13", "10"), "Science", "The human spine has 12 thoracic vertebrae, located between the cervical and lumbar vertebrae, each articulating with a pair of ribs."),
            zh = LocalizedContent("人类有多少块胸椎？", listOf("12", "11", "13", "10"), "科学", "人类脊柱有12块胸椎，位于颈椎和腰椎之间，每块与一对肋骨相连。"),
            es = LocalizedContent("¿Cuántas vértebras torácicas tiene un humano?", listOf("12", "11", "13", "10"), "Ciencia", "La columna vertebral humana tiene 12 vértebras torácicas, situadas entre las vértebras cervicales y lumbares, cada una articulada con un par de costillas.")
        ),
        BilingualQuestion(
            id = 8732, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la gastrine?", listOf("Estomac", "Duodénum", "Pancréas", "Foie"), "Science", "La gastrine est une hormone produite par les cellules G de l'estomac, qui stimule la sécrétion d'acide gastrique."),
            en = LocalizedContent("Which gland produces gastrin?", listOf("Stomach", "Duodenum", "Pancreas", "Liver"), "Science", "Gastrin is a hormone produced by G cells in the stomach, which stimulates the secretion of gastric acid."),
            zh = LocalizedContent("哪种腺体产生胃泌素？", listOf("胃", "十二指肠", "胰腺", "肝脏"), "科学", "胃泌素是一种由胃中的G细胞产生的激素，它刺激胃酸的分泌。"),
            es = LocalizedContent("¿Qué glándula produce la gastrina?", listOf("Estómago", "Duodeno", "Páncreas", "Hígado"), "Ciencia", "La gastrina es una hormona producida por las células G del estómago, que estimula la secreción de ácido gástrico.")
        ),
        BilingualQuestion(
            id = 8733, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand polder du monde?", listOf("Polder d'Afsluitdijk", "Polder de Flevoland", "Polder de Haringvliet", "Polder de Wieringermeer"), "Science", "Le polder d'Afsluitdijk aux Pays-Bas est le plus grand du monde, créé après la construction de la digée fermant le Zuiderzee en 1932."),
            en = LocalizedContent("What is the largest polder in the world?", listOf("Afsluitdijk Polder", "Flevoland Polder", "Haringvliet Polder", "Wieringermeer Polder"), "Science", "The Afsluitdijk Polder in the Netherlands is the largest in the world, created after the construction of the dike closing the Zuiderzee in 1932."),
            zh = LocalizedContent("世界上最大的圩田是什么？", listOf("阿夫鲁戴克圩田", "弗莱福兰圩田", "哈灵水道圩田", "维林厄梅尔圩田"), "科学", "荷兰的阿夫鲁戴克圩田是世界上最大的圩田，于1932年修建堤坝封闭须德海后形成。"),
            es = LocalizedContent("¿Cuál es el pólder más grande del mundo?", listOf("Pólder de Afsluitdijk", "Pólder de Flevoland", "Pólder de Haringvliet", "Pólder de Wieringermeer"), "Ciencia", "El pólder de Afsluitdijk en los Países Bajos es el más grande del mundo, creado tras la construcción del dique que cerró el Zuiderzee en 1932.")
        ),
        BilingualQuestion(
            id = 8734, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a théorisé les cordes cosmiques?", listOf("Tom Kibble", "Stephen Hawking", "Paul Dirac", "Dirac"), "Science", "Tom Kibble a proposé le concept de cordes cosmiques dans les années 1970, en lien avec les transitions de phase dans l'univers primordial."),
            en = LocalizedContent("Which scientist theorized cosmic strings?", listOf("Tom Kibble", "Stephen Hawking", "Paul Dirac", "Dirac"), "Science", "Tom Kibble proposed the concept of cosmic strings in the 1970s, in connection with phase transitions in the early universe."),
            zh = LocalizedContent("哪位科学家提出了宇宙弦理论？", listOf("汤姆·基布尔", "斯蒂芬·霍金", "保罗·狄拉克", "狄拉克"), "科学", "汤姆·基布尔在20世纪70年代提出了宇宙弦的概念，与早期宇宙中的相变有关。"),
            es = LocalizedContent("¿Qué científico teorizó las cuerdas cósmicas?", listOf("Tom Kibble", "Stephen Hawking", "Paul Dirac", "Dirac"), "Ciencia", "Tom Kibble propuso el concepto de cuerdas cósmicas en la década de 1970, en relación con las transiciones de fase en el universo primitivo.")
        ),
        BilingualQuestion(
            id = 8735, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du méthanal?", listOf("CH2O", "CH3O", "CHO", "CH4O"), "Science", "Le méthanal, aussi appelé formaldéhyde, est un aldéhyde dont la molécule contient un atome de carbone, deux d'hydrogène et un d'oxygène, d'où le symbole CH2O."),
            en = LocalizedContent("What is the chemical symbol for methanal?", listOf("CH2O", "CH3O", "CHO", "CH4O"), "Science", "Methanal, also called formaldehyde, is an aldehyde whose molecule contains one carbon atom, two hydrogen atoms, and one oxygen atom, hence the symbol CH2O."),
            zh = LocalizedContent("甲醛的化学符号是什么？", listOf("CH2O", "CH3O", "CHO", "CH4O"), "科学", "甲醛是一种醛，其分子含有一个碳原子、两个氢原子和一个氧原子，因此符号为CH2O。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del metanal?", listOf("CH2O", "CH3O", "CHO", "CH4O"), "Ciencia", "El metanal, también llamado formaldehído, es un aldehído cuya molécula contiene un átomo de carbono, dos de hidrógeno y uno de oxígeno, de ahí el símbolo CH2O.")
        ),
        BilingualQuestion(
            id = 8736, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la pression osmotique du plasma sanguin?", listOf("7.7 atm", "5 atm", "10 atm", "3 atm"), "Science", "La pression osmotique du plasma sanguin est d'environ 7,7 atmosphères, valeur qui correspond à l'équilibre des échanges d'eau entre le sang et les tissus."),
            en = LocalizedContent("What is the osmotic pressure of blood plasma?", listOf("7.7 atm", "5 atm", "10 atm", "3 atm"), "Science", "The osmotic pressure of blood plasma is about 7.7 atmospheres, a value that corresponds to the balance of water exchange between blood and tissues."),
            zh = LocalizedContent("血浆的渗透压是多少？", listOf("7.7 atm", "5 atm", "10 atm", "3 atm"), "科学", "血浆的渗透压约为7.7个大气压，该值对应于血液和组织之间水交换的平衡。"),
            es = LocalizedContent("¿Cuál es la presión osmótica del plasma sanguíneo?", listOf("7.7 atm", "5 atm", "10 atm", "3 atm"), "Ciencia", "La presión osmótica del plasma sanguíneo es de aproximadamente 7,7 atmósferas, valor que corresponde al equilibrio del intercambio de agua entre la sangre y los tejidos.")
        ),
        BilingualQuestion(
            id = 8737, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a trois électrons de valence?", listOf("Aluminium", "Sodium", "Magnésium", "Silicium"), "Science", "L'aluminium, situé dans le groupe 13 du tableau périodique, possède trois électrons dans sa couche de valence, ce qui lui confère une valence de +3."),
            en = LocalizedContent("Which chemical element has three valence electrons?", listOf("Aluminium", "Sodium", "Magnesium", "Silicon"), "Science", "Aluminium, located in group 13 of the periodic table, has three electrons in its valence shell, giving it a valence of +3."),
            zh = LocalizedContent("哪种化学元素有三个价电子？", listOf("铝", "钠", "镁", "硅"), "科学", "铝位于元素周期表第13族，其价壳层中有三个电子，因此化合价为+3。"),
            es = LocalizedContent("¿Qué elemento químico tiene tres electrones de valencia?", listOf("Aluminio", "Sodio", "Magnesio", "Silicio"), "Ciencia", "El aluminio, situado en el grupo 13 de la tabla periódica, posee tres electrones en su capa de valencia, lo que le confiere una valencia de +3.")
        ),
        BilingualQuestion(
            id = 8738, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la violation de parité?", listOf("Chien-Shiung Wu", "Tsung-Dao Lee", "Chen Ning Yang", "Wolfgang Pauli"), "Science", "Chien-Shiung Wu a prouvé expérimentalement en 1956 que la loi de conservation de la parité était violée dans les interactions faibles, contredisant une croyance fondamentale en physique."),
            en = LocalizedContent("Which scientist discovered parity violation?", listOf("Chien-Shiung Wu", "Tsung-Dao Lee", "Chen Ning Yang", "Wolfgang Pauli"), "Science", "Chien-Shiung Wu experimentally proved in 1956 that the law of parity conservation was violated in weak interactions, contradicting a fundamental belief in physics."),
            zh = LocalizedContent("哪位科学家发现了宇称不守恒？", listOf("吴健雄", "李政道", "杨振宁", "沃尔夫冈·泡利"), "科学", "吴健雄在1956年通过实验证明宇称守恒定律在弱相互作用中被违反，推翻了物理学中的一个基本信念。"),
            es = LocalizedContent("¿Qué científico descubrió la violación de la paridad?", listOf("Chien-Shiung Wu", "Tsung-Dao Lee", "Chen Ning Yang", "Wolfgang Pauli"), "Ciencia", "Chien-Shiung Wu demostró experimentalmente en 1956 que la ley de conservación de la paridad se violaba en las interacciones débiles, contradiciendo una creencia fundamental en física.")
        ),
        BilingualQuestion(
            id = 8739, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'éthanal?", listOf("CH3CHO", "CH3CH2OH", "CH3COCH3", "CH3CHO2"), "Science", "Le symbole CH3CHO représente la formule semi-développée de l'éthanal, un aldéhyde à deux carbones, où le groupe fonctionnel -CHO est caractéristique."),
            en = LocalizedContent("What is the chemical symbol for ethanal?", listOf("CH3CHO", "CH3CH2OH", "CH3COCH3", "CH3CHO2"), "Science", "The symbol CH3CHO represents the semi-developed formula of ethanal, a two-carbon aldehyde, where the functional group -CHO is characteristic."),
            zh = LocalizedContent("乙醛的化学符号是什么？", listOf("CH3CHO", "CH3CH2OH", "CH3COCH3", "CH3CHO2"), "科学", "符号CH3CHO代表乙醛的半结构式，是一种两个碳的醛，其中官能团-CHO是其特征。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del etanal?", listOf("CH3CHO", "CH3CH2OH", "CH3COCH3", "CH3CHO2"), "Ciencia", "El símbolo CH3CHO representa la fórmula semidesarrollada del etanal, un aldehído de dos carbonos, donde el grupo funcional -CHO es característico.")
        ),
        BilingualQuestion(
            id = 8740, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres lombaires a un humain?", listOf("5", "4", "6", "3"), "Science", "La colonne vertébrale humaine compte cinq vertèbres lombaires, situées entre les vertèbres thoraciques et le sacrum, assurant soutien et flexibilité du bas du dos."),
            en = LocalizedContent("How many lumbar vertebrae does a human have?", listOf("5", "4", "6", "3"), "Science", "The human spine has five lumbar vertebrae, located between the thoracic vertebrae and the sacrum, providing support and flexibility to the lower back."),
            zh = LocalizedContent("人类有多少块腰椎？", listOf("5", "4", "6", "3"), "科学", "人类脊柱有五块腰椎，位于胸椎和骶骨之间，为下背部提供支撑和灵活性。"),
            es = LocalizedContent("¿Cuántas vértebras lumbares tiene un humano?", listOf("5", "4", "6", "3"), "Ciencia", "La columna vertebral humana tiene cinco vértebras lumbares, situadas entre las vértebras torácicas y el sacro, proporcionando soporte y flexibilidad a la parte baja de la espalda.")
        ),
        BilingualQuestion(
            id = 8741, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la secretine?", listOf("Duodénum", "Estomac", "Pancréas", "Foie"), "Science", "La sécrétine est une hormone produite par les cellules S du duodénum en réponse à l'acidité du chyme gastrique, stimulant la sécrétion de bicarbonate par le pancréas."),
            en = LocalizedContent("Which gland produces secretin?", listOf("Duodenum", "Stomach", "Pancreas", "Liver"), "Science", "Secretin is a hormone produced by S cells of the duodenum in response to the acidity of gastric chyme, stimulating bicarbonate secretion by the pancreas."),
            zh = LocalizedContent("哪个腺体产生促胰液素？", listOf("十二指肠", "胃", "胰腺", "肝脏"), "科学", "促胰液素是一种由十二指肠S细胞响应胃食糜的酸性而产生的激素，刺激胰腺分泌碳酸氢盐。"),
            es = LocalizedContent("¿Qué glándula produce la secretina?", listOf("Duodeno", "Estómago", "Páncreas", "Hígado"), "Ciencia", "La secretina es una hormona producida por las células S del duodeno en respuesta a la acidez del quimo gástrico, estimulando la secreción de bicarbonato por el páncreas.")
        ),
        BilingualQuestion(
            id = 8742, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand esker du monde?", listOf("Oak Ridges Moraine", "Vitosha", "Porfyrjöskull", "Salpausselkä"), "Science", "L'esker d'Oak Ridges Moraine, situé en Ontario au Canada, est le plus long esker connu au monde, s'étendant sur environ 200 kilomètres."),
            en = LocalizedContent("What is the largest esker in the world?", listOf("Oak Ridges Moraine", "Vitosha", "Porfyrjöskull", "Salpausselkä"), "Science", "The Oak Ridges Moraine esker, located in Ontario, Canada, is the longest known esker in the world, extending approximately 200 kilometers."),
            zh = LocalizedContent("世界上最大的蛇形丘是什么？", listOf("橡树岭冰碛", "维托沙山", "波菲尔斯库尔", "萨尔保塞尔凯"), "科学", "位于加拿大安大略省的橡树岭冰碛蛇形丘是世界上最长的已知蛇形丘，延伸约200公里。"),
            es = LocalizedContent("¿Cuál es el esker más grande del mundo?", listOf("Oak Ridges Moraine", "Vitosha", "Porfyrjöskull", "Salpausselkä"), "Ciencia", "El esker de Oak Ridges Moraine, ubicado en Ontario, Canadá, es el esker más largo conocido en el mundo, extendiéndose aproximadamente 200 kilómetros.")
        ),
        BilingualQuestion(
            id = 8743, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la résonance magnétique?", listOf("Isidor Rabi", "Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga"), "Science", "Isidor Rabi a reçu le prix Nobel de physique en 1944 pour sa découverte de la résonance magnétique nucléaire, une méthode qui utilise des champs magnétiques pour sonder les propriétés des noyaux atomiques."),
            en = LocalizedContent("Which scientist discovered magnetic resonance?", listOf("Isidor Rabi", "Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga"), "Science", "Isidor Rabi received the Nobel Prize in Physics in 1944 for his discovery of nuclear magnetic resonance, a method that uses magnetic fields to probe the properties of atomic nuclei."),
            zh = LocalizedContent("哪位科学家发现了磁共振？", listOf("伊西多·拉比", "理查德·费曼", "朱利安·施温格", "朝永振一郎"), "科学", "伊西多·拉比因发现核磁共振于1944年获得诺贝尔物理学奖，该方法利用磁场探测原子核的性质。"),
            es = LocalizedContent("¿Qué científico descubrió la resonancia magnética?", listOf("Isidor Rabi", "Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga"), "Ciencia", "Isidor Rabi recibió el Premio Nobel de Física en 1944 por su descubrimiento de la resonancia magnética nuclear, un método que utiliza campos magnéticos para sondear las propiedades de los núcleos atómicos.")
        ),
        BilingualQuestion(
            id = 8744, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'acide acétique?", listOf("CH3COOH", "CH3COH", "CH3CO2", "CH3COOH2"), "Science", "CH3COOH est la formule semi-développée de l'acide acétique, le principal composant du vinaigre."),
            en = LocalizedContent("What is the chemical symbol for acetic acid?", listOf("CH3COOH", "CH3COH", "CH3CO2", "CH3COOH2"), "Science", "CH3COOH is the semi-structural formula of acetic acid, the main component of vinegar."),
            zh = LocalizedContent("乙酸的化学符号是什么？", listOf("CH3COOH", "CH3COH", "CH3CO2", "CH3COOH2"), "科学", "CH3COOH是乙酸的半结构式，是醋的主要成分。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del ácido acético?", listOf("CH3COOH", "CH3COH", "CH3CO2", "CH3COOH2"), "Ciencia", "CH3COOH es la fórmula semidesarrollada del ácido acético, el componente principal del vinagre.")
        ),
        BilingualQuestion(
            id = 8745, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la glucose dans le plasma?", listOf("70-100 mg/100 mL", "100-120 mg/100 mL", "50-70 mg/100 mL", "120-140 mg/100 mL"), "Science", "La glycémie à jeun normale se situe entre 70 et 100 mg/100 mL de plasma, un équilibre maintenu par l'insuline et le glucagon."),
            en = LocalizedContent("What is the concentration of glucose in plasma?", listOf("70-100 mg/100 mL", "100-120 mg/100 mL", "50-70 mg/100 mL", "120-140 mg/100 mL"), "Science", "Normal fasting blood glucose levels range from 70 to 100 mg/100 mL of plasma, a balance maintained by insulin and glucagon."),
            zh = LocalizedContent("血浆中葡萄糖的浓度是多少？", listOf("70-100 mg/100 mL", "100-120 mg/100 mL", "50-70 mg/100 mL", "120-140 mg/100 mL"), "科学", "正常空腹血糖水平在70至100 mg/100 mL血浆之间，这一平衡由胰岛素和胰高血糖素维持。"),
            es = LocalizedContent("¿Cuál es la concentración de glucosa en el plasma?", listOf("70-100 mg/100 mL", "100-120 mg/100 mL", "50-70 mg/100 mL", "120-140 mg/100 mL"), "Ciencia", "La glucemia en ayunas normal se sitúa entre 70 y 100 mg/100 mL de plasma, un equilibrio mantenido por la insulina y el glucagón.")
        ),
        BilingualQuestion(
            id = 8746, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a quatre électrons de valence?", listOf("Carbone", "Sodium", "Magnésium", "Aluminium"), "Science", "Le carbone possède quatre électrons de valence, ce qui lui permet de former quatre liaisons covalentes, une propriété essentielle pour la diversité des molécules organiques."),
            en = LocalizedContent("Which chemical element has four valence electrons?", listOf("Carbon", "Sodium", "Magnesium", "Aluminum"), "Science", "Carbon has four valence electrons, allowing it to form four covalent bonds, a property essential for the diversity of organic molecules."),
            zh = LocalizedContent("哪种化学元素有四个价电子？", listOf("碳", "钠", "镁", "铝"), "科学", "碳有四个价电子，使其能形成四个共价键，这一特性对有机分子的多样性至关重要。"),
            es = LocalizedContent("¿Qué elemento químico tiene cuatro electrones de valencia?", listOf("Carbono", "Sodio", "Magnesio", "Aluminio"), "Ciencia", "El carbono tiene cuatro electrones de valencia, lo que le permite formar cuatro enlaces covalentes, una propiedad esencial para la diversidad de las moléculas orgánicas.")
        ),
        BilingualQuestion(
            id = 8747, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'électrodynamique quantique?", listOf("Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga", "Freeman Dyson"), "Science", "Richard Feynman a formulé l'électrodynamique quantique dans les années 1940, une théorie qui décrit l'interaction entre la lumière et la matière."),
            en = LocalizedContent("Which scientist discovered quantum electrodynamics?", listOf("Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga", "Freeman Dyson"), "Science", "Richard Feynman formulated quantum electrodynamics in the 1940s, a theory that describes the interaction between light and matter."),
            zh = LocalizedContent("哪位科学家发现了量子电动力学？", listOf("理查德·费曼", "朱利安·施温格", "朝永振一郎", "弗里曼·戴森"), "科学", "理查德·费曼在20世纪40年代提出了量子电动力学，这一理论描述了光与物质之间的相互作用。"),
            es = LocalizedContent("¿Qué científico descubrió la electrodinámica cuántica?", listOf("Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga", "Freeman Dyson"), "Ciencia", "Richard Feynman formuló la electrodinámica cuántica en la década de 1940, una teoría que describe la interacción entre la luz y la materia.")
        ),
        BilingualQuestion(
            id = 8748, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'acétone?", listOf("CH3COCH3", "CH3CHO", "CH3CH2OH", "CH3CH2CHO"), "Science", "L'acétone est un composé organique de formule chimique CH3COCH3, où le groupe carbonyle (C=O) est lié à deux groupes méthyle (CH3). Ce symbole représente sa structure moléculaire précise."),
            en = LocalizedContent("What is the chemical symbol for acetone?", listOf("CH3COCH3", "CH3CHO", "CH3CH2OH", "CH3CH2CHO"), "Science", "Acetone is an organic compound with the chemical formula CH3COCH3, where the carbonyl group (C=O) is bonded to two methyl groups (CH3). This symbol represents its precise molecular structure."),
            zh = LocalizedContent("丙酮的化学符号是什么？", listOf("CH3COCH3", "CH3CHO", "CH3CH2OH", "CH3CH2CHO"), "科学", "丙酮是一种有机化合物，化学式为CH3COCH3，其中羰基（C=O）与两个甲基（CH3）相连。该符号代表其精确的分子结构。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la acetona?", listOf("CH3COCH3", "CH3CHO", "CH3CH2OH", "CH3CH2CHO"), "Ciencia", "La acetona es un compuesto orgánico de fórmula química CH3COCH3, donde el grupo carbonilo (C=O) está unido a dos grupos metilo (CH3). Este símbolo representa su estructura molecular precisa.")
        ),
        BilingualQuestion(
            id = 8749, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres sacrées a un humain?", listOf("5", "4", "6", "3"), "Science", "Le sacrum humain est formé par la fusion de cinq vertèbres sacrées, un nombre constant chez l'adulte. Cette fusion se produit généralement entre 18 et 30 ans."),
            en = LocalizedContent("How many sacral vertebrae does a human have?", listOf("5", "4", "6", "3"), "Science", "The human sacrum is formed by the fusion of five sacral vertebrae, a constant number in adults. This fusion typically occurs between ages 18 and 30."),
            zh = LocalizedContent("人类有多少块骶椎？", listOf("5", "4", "6", "3"), "科学", "人类骶骨由五块骶椎融合而成，成人数量恒定。这种融合通常发生在18至30岁之间。"),
            es = LocalizedContent("¿Cuántas vértebras sacras tiene un humano?", listOf("5", "4", "6", "3"), "Ciencia", "El sacro humano está formado por la fusión de cinco vértebras sacras, un número constante en adultos. Esta fusión ocurre típicamente entre los 18 y 30 años.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8750, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la motiline?", listOf("Duodénum", "Estomac", "Pancréas", "Foie"), "Science", "La motiline est une hormone produite par les cellules entérochromaffines du duodénum, qui régule la motilité intestinale en stimulant les contractions de l'estomac et de l'intestin grêle."),
            en = LocalizedContent("Which gland produces motilin?", listOf("Duodenum", "Stomach", "Pancreas", "Liver"), "Science", "Motilin is a hormone produced by enterochromaffin cells of the duodenum, which regulates intestinal motility by stimulating contractions of the stomach and small intestine."),
            zh = LocalizedContent("哪种腺体产生胃动素？", listOf("十二指肠", "胃", "胰腺", "肝脏"), "科学", "胃动素是一种由十二指肠的肠嗜铬细胞产生的激素，通过刺激胃和小肠的收缩来调节肠道运动。"),
            es = LocalizedContent("¿Qué glándula produce la motilina?", listOf("Duodeno", "Estómago", "Páncreas", "Hígado"), "Ciencia", "La motilina es una hormona producida por las células enterocromafines del duodeno, que regula la motilidad intestinal estimulando las contracciones del estómago y el intestino delgado.")
        ),
        BilingualQuestion(
            id = 8751, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand kame du monde?", listOf("Kame d'Islande", "Kame du Yellowstone", "Kame du Kamchatka", "Kame de Nouvelle-Zélande"), "Science", "Le plus grand kame du monde est le Kame d'Islande, une formation géologique de glace et de roche située en Islande, mesurant environ 10 kilomètres de long."),
            en = LocalizedContent("What is the largest kame in the world?", listOf("Kame of Iceland", "Kame of Yellowstone", "Kame of Kamchatka", "Kame of New Zealand"), "Science", "The largest kame in the world is the Kame of Iceland, a geological formation of ice and rock located in Iceland, measuring about 10 kilometers long."),
            zh = LocalizedContent("世界上最大的冰碛丘是什么？", listOf("冰岛冰碛丘", "黄石冰碛丘", "堪察加冰碛丘", "新西兰冰碛丘"), "科学", "世界上最大的冰碛丘是冰岛冰碛丘，位于冰岛，由冰和岩石构成，长约10公里。"),
            es = LocalizedContent("¿Cuál es el kame más grande del mundo?", listOf("Kame de Islandia", "Kame de Yellowstone", "Kame de Kamchatka", "Kame de Nueva Zelanda"), "Ciencia", "El kame más grande del mundo es el Kame de Islandia, una formación geológica de hielo y roca ubicada en Islandia, que mide aproximadamente 10 kilómetros de largo.")
        ),
        BilingualQuestion(
            id = 8752, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie des champs?", listOf("Paul Dirac", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Paul Dirac a formulé la théorie quantique des champs dans les années 1920, unifiant la mécanique quantique et la relativité restreinte pour décrire les particules et leurs interactions."),
            en = LocalizedContent("Which scientist discovered field theory?", listOf("Paul Dirac", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Paul Dirac formulated quantum field theory in the 1920s, unifying quantum mechanics and special relativity to describe particles and their interactions."),
            zh = LocalizedContent("哪位科学家发现了场论？", listOf("保罗·狄拉克", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "保罗·狄拉克在20世纪20年代提出了量子场论，将量子力学和狭义相对论统一起来，用于描述粒子及其相互作用。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de campos?", listOf("Paul Dirac", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Paul Dirac formuló la teoría cuántica de campos en la década de 1920, unificando la mecánica cuántica y la relatividad especial para describir partículas y sus interacciones.")
        ),
        BilingualQuestion(
            id = 8753, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzène?", listOf("C6H6", "C6H5", "C6H8", "C6H4"), "Science", "Le benzène est un hydrocarbure aromatique composé de six atomes de carbone et six atomes d'hydrogène, d'où sa formule chimique C6H6."),
            en = LocalizedContent("What is the chemical symbol for benzene?", listOf("C6H6", "C6H5", "C6H8", "C6H4"), "Science", "Benzene is an aromatic hydrocarbon composed of six carbon atoms and six hydrogen atoms, hence its chemical formula C6H6."),
            zh = LocalizedContent("苯的化学符号是什么？", listOf("C6H6", "C6H5", "C6H8", "C6H4"), "科学", "苯是一种芳香烃，由六个碳原子和六个氢原子组成，因此其化学式为C6H6。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del benceno?", listOf("C6H6", "C6H5", "C6H8", "C6H4"), "Ciencia", "El benceno es un hidrocarburo aromático compuesto por seis átomos de carbono y seis de hidrógeno, de ahí su fórmula química C6H6.")
        ),
        BilingualQuestion(
            id = 8754, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du potassium dans le plasma?", listOf("3.5-5 mEq/L", "1-2 mEq/L", "7-8 mEq/L", "10-12 mEq/L"), "Science", "Le potassium plasmatique est maintenu dans cette étroite fourchette par les reins et les hormones, car des écarts peuvent perturber l'activité électrique du cœur et des nerfs."),
            en = LocalizedContent("What is the concentration of potassium in plasma?", listOf("3.5-5 mEq/L", "1-2 mEq/L", "7-8 mEq/L", "10-12 mEq/L"), "Science", "Plasma potassium is maintained within this narrow range by the kidneys and hormones, as deviations can disrupt the electrical activity of the heart and nerves."),
            zh = LocalizedContent("血浆中钾的浓度是多少？", listOf("3.5-5 mEq/L", "1-2 mEq/L", "7-8 mEq/L", "10-12 mEq/L"), "科学", "血浆钾由肾脏和激素维持在这个狭窄范围内，因为偏差会干扰心脏和神经的电活动。"),
            es = LocalizedContent("¿Cuál es la concentración de potasio en el plasma?", listOf("3.5-5 mEq/L", "1-2 mEq/L", "7-8 mEq/L", "10-12 mEq/L"), "Ciencia", "El potasio plasmático se mantiene dentro de este estrecho rango por los riñones y las hormonas, ya que las desviaciones pueden alterar la actividad eléctrica del corazón y los nervios.")
        ),
        BilingualQuestion(
            id = 8755, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a cinq électrons de valence?", listOf("Azote", "Carbone", "Oxygène", "Phosphore"), "Science", "L'azote, situé dans le groupe 15 du tableau périodique, possède cinq électrons dans sa couche de valence, ce qui lui permet de former trois liaisons covalentes pour atteindre l'octet."),
            en = LocalizedContent("Which chemical element has five valence electrons?", listOf("Nitrogen", "Carbon", "Oxygen", "Phosphorus"), "Science", "Nitrogen, located in group 15 of the periodic table, has five electrons in its valence shell, allowing it to form three covalent bonds to achieve the octet."),
            zh = LocalizedContent("哪种化学元素有五个价电子？", listOf("氮", "碳", "氧", "磷"), "科学", "氮位于元素周期表的第15族，其价壳层有五个电子，使其能够形成三个共价键以达到八电子稳定结构。"),
            es = LocalizedContent("¿Qué elemento químico tiene cinco electrones de valencia?", listOf("Nitrógeno", "Carbono", "Oxígeno", "Fósforo"), "Ciencia", "El nitrógeno, ubicado en el grupo 15 de la tabla periódica, tiene cinco electrones en su capa de valencia, lo que le permite formar tres enlaces covalentes para alcanzar el octeto.")
        ),
        BilingualQuestion(
            id = 8756, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la non-localité?", listOf("John Bell", "Albert Einstein", "Niels Bohr", "David Bohm"), "Science", "John Bell a démontré en 1964 que la mécanique quantique prédit des corrélations non locales, via son théorème et ses inégalités."),
            en = LocalizedContent("Which scientist discovered non-locality?", listOf("John Bell", "Albert Einstein", "Niels Bohr", "David Bohm"), "Science", "John Bell demonstrated in 1964 that quantum mechanics predicts non-local correlations, via his theorem and inequalities."),
            zh = LocalizedContent("哪位科学家发现了非局域性？", listOf("约翰·贝尔", "阿尔伯特·爱因斯坦", "尼尔斯·玻尔", "大卫·玻姆"), "科学", "约翰·贝尔在1964年通过他的定理和不等式证明，量子力学预测了非局域相关性。"),
            es = LocalizedContent("¿Qué científico descubrió la no localidad?", listOf("John Bell", "Albert Einstein", "Niels Bohr", "David Bohm"), "Ciencia", "John Bell demostró en 1964 que la mecánica cuántica predice correlaciones no locales, a través de su teorema y sus desigualdades.")
        ),
        BilingualQuestion(
            id = 8757, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du phénol?", listOf("C6H5OH", "C6H6", "C6H4OH", "C6H3OH"), "Science", "Le phénol est un composé aromatique constitué d'un noyau benzénique (C6H5) lié à un groupe hydroxyle (OH), d'où sa formule chimique C6H5OH."),
            en = LocalizedContent("What is the chemical symbol for phenol?", listOf("C6H5OH", "C6H6", "C6H4OH", "C6H3OH"), "Science", "Phenol is an aromatic compound consisting of a benzene ring (C6H5) bonded to a hydroxyl group (OH), hence its chemical formula C6H5OH."),
            zh = LocalizedContent("苯酚的化学符号是什么？", listOf("C6H5OH", "C6H6", "C6H4OH", "C6H3OH"), "科学", "苯酚是一种芳香族化合物，由一个苯环（C6H5）与一个羟基（OH）键合而成，因此其化学式为C6H5OH。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fenol?", listOf("C6H5OH", "C6H6", "C6H4OH", "C6H3OH"), "Ciencia", "El fenol es un compuesto aromático que consiste en un anillo de benceno (C6H5) unido a un grupo hidroxilo (OH), de ahí su fórmula química C6H5OH.")
        ),
        BilingualQuestion(
            id = 8758, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de côtes sternales a un humain?", listOf("7", "6", "8", "5"), "Science", "L'humain possède 7 paires de côtes sternales, aussi appelées vraies côtes, car elles sont directement reliées au sternum par leur propre cartilage costal."),
            en = LocalizedContent("How many sternal ribs does a human have?", listOf("7", "6", "8", "5"), "Science", "Humans have 7 pairs of sternal ribs, also called true ribs, as they are directly attached to the sternum by their own costal cartilage."),
            zh = LocalizedContent("人类有多少对胸骨肋？", listOf("7", "6", "8", "5"), "科学", "人类有7对胸骨肋，也称为真肋，因为它们通过自身的肋软骨直接连接到胸骨。"),
            es = LocalizedContent("¿Cuántas costillas esternales tiene un humano?", listOf("7", "6", "8", "5"), "Ciencia", "Los humanos tienen 7 pares de costillas esternales, también llamadas costillas verdaderas, ya que están directamente unidas al esternón por su propio cartílago costal.")
        ),
        BilingualQuestion(
            id = 8759, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la cholécystokinine?", listOf("Duodénum", "Estomac", "Pancréas", "Foie"), "Science", "La cholécystokinine est une hormone digestive principalement sécrétée par les cellules de la muqueuse de l'estomac, ainsi que par l'intestin grêle."),
            en = LocalizedContent("Which gland produces cholecystokinin?", listOf("Duodenum", "Stomach", "Pancreas", "Liver"), "Science", "Cholecystokinin is a digestive hormone primarily secreted by cells of the stomach lining, as well as by the small intestine."),
            zh = LocalizedContent("哪种腺体产生胆囊收缩素？", listOf("十二指肠", "胃", "胰腺", "肝脏"), "科学", "胆囊收缩素是一种消化激素，主要由胃黏膜细胞分泌，也由小肠分泌。"),
            es = LocalizedContent("¿Qué glándula produce la colecistoquinina?", listOf("Duodeno", "Estómago", "Páncreas", "Hígado"), "Ciencia", "La colecistoquinina es una hormona digestiva secretada principalmente por las células del revestimiento del estómago, así como por el intestino delgado.")
        ),
        BilingualQuestion(
            id = 8760, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand cône de scories du monde?", listOf("Cinder Cone", "Sunset Crater", "Spatter Cone", "Lava Dome"), "Science", "Le Cinder Cone, situé dans le parc national de Lassen Volcanic en Californie, est le plus grand cône de scories du monde avec une hauteur d'environ 210 mètres."),
            en = LocalizedContent("What is the largest cinder cone in the world?", listOf("Cinder Cone", "Sunset Crater", "Spatter Cone", "Lava Dome"), "Science", "Cinder Cone, located in Lassen Volcanic National Park in California, is the largest cinder cone in the world with a height of about 210 meters."),
            zh = LocalizedContent("世界上最大的火山渣锥是什么？", listOf("Cinder Cone", "Sunset Crater", "Spatter Cone", "Lava Dome"), "科学", "位于加利福尼亚州拉森火山国家公园的Cinder Cone是世界上最大的火山渣锥，高度约210米。"),
            es = LocalizedContent("¿Cuál es el cono de escoria más grande del mundo?", listOf("Cinder Cone", "Sunset Crater", "Spatter Cone", "Lava Dome"), "Ciencia", "El Cinder Cone, ubicado en el Parque Nacional Volcánico Lassen en California, es el cono de escoria más grande del mundo con una altura de aproximadamente 210 metros.")
        ),
        BilingualQuestion(
            id = 8761, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la mécanique statistique?", listOf("Ludwig Boltzmann", "J. Willard Gibbs", "Josiah Willard Gibbs", "Paul Ehrenfest"), "Science", "Ludwig Boltzmann a fondé la mécanique statistique en reliant les propriétés macroscopiques des gaz au comportement des atomes et molécules, formalisant ainsi le lien entre thermodynamique et physique microscopique."),
            en = LocalizedContent("Which scientist discovered statistical mechanics?", listOf("Ludwig Boltzmann", "J. Willard Gibbs", "Josiah Willard Gibbs", "Paul Ehrenfest"), "Science", "Ludwig Boltzmann founded statistical mechanics by linking the macroscopic properties of gases to the behavior of atoms and molecules, formalizing the connection between thermodynamics and microscopic physics."),
            zh = LocalizedContent("哪位科学家发现了统计力学？", listOf("路德维希·玻尔兹曼", "J. 威拉德·吉布斯", "乔赛亚·威拉德·吉布斯", "保罗·埃伦费斯特"), "科学", "路德维希·玻尔兹曼通过将气体的宏观性质与原子和分子的行为联系起来，创立了统计力学，从而形式化了热力学与微观物理学之间的联系。"),
            es = LocalizedContent("¿Qué científico descubrió la mecánica estadística?", listOf("Ludwig Boltzmann", "J. Willard Gibbs", "Josiah Willard Gibbs", "Paul Ehrenfest"), "Ciencia", "Ludwig Boltzmann fundó la mecánica estadística al relacionar las propiedades macroscópicas de los gases con el comportamiento de los átomos y moléculas, formalizando así el vínculo entre la termodinámica y la física microscópica.")
        ),
        BilingualQuestion(
            id = 8762, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du toluène?", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "Science", "Le toluène est un hydrocarbure aromatique de formule C6H5CH3, dérivé du benzène par substitution d'un atome d'hydrogène par un groupe méthyle."),
            en = LocalizedContent("What is the chemical symbol for toluene?", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "Science", "Toluene is an aromatic hydrocarbon with the formula C6H5CH3, derived from benzene by substituting one hydrogen atom with a methyl group."),
            zh = LocalizedContent("甲苯的化学符号是什么？", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "科学", "甲苯是一种芳香烃，化学式为C6H5CH3，由苯中的一个氢原子被甲基取代而成。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tolueno?", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "Ciencia", "El tolueno es un hidrocarburo aromático de fórmula C6H5CH3, derivado del benceno por sustitución de un átomo de hidrógeno por un grupo metilo.")
        ),
        BilingualQuestion(
            id = 8763, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du calcium dans le plasma?", listOf("8.5-10.5 mg/100 mL", "5-7 mg/100 mL", "12-14 mg/100 mL", "15-17 mg/100 mL"), "Science", "Le taux de calcium plasmatique est maintenu dans cette plage étroite par les hormones parathyroïdiennes et la vitamine D, essentiel pour les fonctions nerveuses et musculaires."),
            en = LocalizedContent("What is the concentration of calcium in plasma?", listOf("8.5-10.5 mg/100 mL", "5-7 mg/100 mL", "12-14 mg/100 mL", "15-17 mg/100 mL"), "Science", "Plasma calcium levels are maintained within this narrow range by parathyroid hormones and vitamin D, essential for nerve and muscle functions."),
            zh = LocalizedContent("血浆中钙的浓度是多少？", listOf("8.5-10.5 mg/100 mL", "5-7 mg/100 mL", "12-14 mg/100 mL", "15-17 mg/100 mL"), "科学", "血浆钙水平通过甲状旁腺激素和维生素D维持在这个狭窄范围内，对神经和肌肉功能至关重要。"),
            es = LocalizedContent("¿Cuál es la concentración de calcio en el plasma?", listOf("8.5-10.5 mg/100 mL", "5-7 mg/100 mL", "12-14 mg/100 mL", "15-17 mg/100 mL"), "Ciencia", "Los niveles de calcio plasmático se mantienen dentro de este estrecho rango por las hormonas paratiroideas y la vitamina D, esenciales para las funciones nerviosas y musculares.")
        ),
        BilingualQuestion(
            id = 8764, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a six électrons de valence?", listOf("Oxygène", "Azote", "Carbone", "Soufre"), "Science", "L'oxygène est dans le groupe 16 du tableau périodique, ce qui lui donne six électrons de valence dans sa couche externe."),
            en = LocalizedContent("Which chemical element has six valence electrons?", listOf("Oxygen", "Nitrogen", "Carbon", "Sulfur"), "Science", "Oxygen is in group 16 of the periodic table, giving it six valence electrons in its outer shell."),
            zh = LocalizedContent("哪种化学元素有六个价电子？", listOf("氧", "氮", "碳", "硫"), "科学", "氧位于元素周期表的第16族，其外层有六个价电子。"),
            es = LocalizedContent("¿Qué elemento químico tiene seis electrones de valencia?", listOf("Oxígeno", "Nitrógeno", "Carbono", "Azufre"), "Ciencia", "El oxígeno está en el grupo 16 de la tabla periódica, lo que le da seis electrones de valencia en su capa externa.")
        ),
        BilingualQuestion(
            id = 8765, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la renormalisation?", listOf("Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga", "Freeman Dyson"), "Science", "Richard Feynman a contribué au développement de la renormalisation en électrodynamique quantique, une technique mathématique permettant d'éliminer les infinis dans les calculs théoriques."),
            en = LocalizedContent("Which scientist discovered renormalization?", listOf("Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga", "Freeman Dyson"), "Science", "Richard Feynman contributed to the development of renormalization in quantum electrodynamics, a mathematical technique to eliminate infinities in theoretical calculations."),
            zh = LocalizedContent("哪位科学家发现了重整化？", listOf("理查德·费曼", "朱利安·施温格", "朝永振一郎", "弗里曼·戴森"), "科学", "理查德·费曼对量子电动力学中重整化的发展做出了贡献，这是一种消除理论计算中无穷大的数学技术。"),
            es = LocalizedContent("¿Qué científico descubrió la renormalización?", listOf("Richard Feynman", "Julian Schwinger", "Sin-Itiro Tomonaga", "Freeman Dyson"), "Ciencia", "Richard Feynman contribuyó al desarrollo de la renormalización en electrodinámica cuántica, una técnica matemática para eliminar infinitos en los cálculos teóricos.")
        ),
        BilingualQuestion(
            id = 8766, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du styrène?", listOf("C6H5CH=CH2", "C6H6", "C8H8", "C6H4CH=CH2"), "Science", "Le styrène est un composé organique de formule brute C8H8, souvent représenté par C6H5CH=CH2 pour montrer son groupe phényle lié à un groupe vinyle."),
            en = LocalizedContent("What is the chemical symbol for styrene?", listOf("C6H5CH=CH2", "C6H6", "C8H8", "C6H4CH=CH2"), "Science", "Styrene is an organic compound with the molecular formula C8H8, often represented as C6H5CH=CH2 to show its phenyl group attached to a vinyl group."),
            zh = LocalizedContent("苯乙烯的化学符号是什么？", listOf("C6H5CH=CH2", "C6H6", "C8H8", "C6H4CH=CH2"), "科学", "苯乙烯是一种有机化合物，分子式为C8H8，通常表示为C6H5CH=CH2，以显示其苯基与乙烯基相连。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del estireno?", listOf("C6H5CH=CH2", "C6H6", "C8H8", "C6H4CH=CH2"), "Ciencia", "El estireno es un compuesto orgánico de fórmula molecular C8H8, a menudo representado como C6H5CH=CH2 para mostrar su grupo fenilo unido a un grupo vinilo.")
        ),
        BilingualQuestion(
            id = 8767, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de paires de côtes flottantes a un humain?", listOf("2", "3", "1", "4"), "Science", "L'humain possède 12 paires de côtes, dont les deux dernières (paires 11 et 12) sont dites flottantes car elles ne sont pas reliées au sternum."),
            en = LocalizedContent("How many pairs of floating ribs does a human have?", listOf("2", "3", "1", "4"), "Science", "Humans have 12 pairs of ribs, of which the last two (pairs 11 and 12) are called floating ribs because they are not attached to the sternum."),
            zh = LocalizedContent("人类有多少对浮肋？", listOf("2", "3", "1", "4"), "科学", "人类有12对肋骨，其中最后两对（第11和12对）被称为浮肋，因为它们不与胸骨相连。"),
            es = LocalizedContent("¿Cuántos pares de costillas flotantes tiene un humano?", listOf("2", "3", "1", "4"), "Ciencia", "El humano tiene 12 pares de costillas, de los cuales los dos últimos (pares 11 y 12) se denominan costillas flotantes porque no están unidas al esternón.")
        ),
        BilingualQuestion(
            id = 8768, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit l'enteroglucagon?", listOf("Duodénum", "Estomac", "Pancréas", "Foie"), "Science", "L'entéroglucagon est une hormone sécrétée par les cellules L de l'intestin grêle, principalement localisées dans le duodénum."),
            en = LocalizedContent("Which gland produces enteroglucagon?", listOf("Duodenum", "Stomach", "Pancreas", "Liver"), "Science", "Enteroglucagon is a hormone secreted by L cells of the small intestine, primarily located in the duodenum."),
            zh = LocalizedContent("哪个腺体产生肠高血糖素？", listOf("十二指肠", "胃", "胰腺", "肝脏"), "科学", "肠高血糖素是一种由小肠L细胞分泌的激素，主要位于十二指肠。"),
            es = LocalizedContent("¿Qué glándula produce el enteroglucagón?", listOf("Duodeno", "Estómago", "Páncreas", "Hígado"), "Ciencia", "El enteroglucagón es una hormona secretada por las células L del intestino delgado, localizadas principalmente en el duodeno.")
        ),
        BilingualQuestion(
            id = 8769, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand stratovolcan du monde?", listOf("Ojos del Salado", "Mont Piton", "Mont Fuji", "Mont Merapi"), "Science", "Le volcan Ojos del Salado, situé à la frontière entre le Chili et l'Argentine, culmine à 6 893 mètres d'altitude, ce qui en fait le plus haut stratovolcan actif du monde."),
            en = LocalizedContent("What is the largest stratovolcano in the world?", listOf("Ojos del Salado", "Mount Piton", "Mount Fuji", "Mount Merapi"), "Science", "The Ojos del Salado volcano, located on the border between Chile and Argentina, reaches an altitude of 6,893 meters, making it the highest active stratovolcano in the world."),
            zh = LocalizedContent("世界上最大的成层火山是什么？", listOf("奥霍斯-德尔萨拉多山", "皮顿山", "富士山", "默拉皮火山"), "科学", "奥霍斯-德尔萨拉多火山位于智利和阿根廷边境，海拔6893米，是世界上最高的活成层火山。"),
            es = LocalizedContent("¿Cuál es el estratovolcán más grande del mundo?", listOf("Ojos del Salado", "Monte Piton", "Monte Fuji", "Monte Merapi"), "Ciencia", "El volcán Ojos del Salado, ubicado en la frontera entre Chile y Argentina, alcanza una altitud de 6.893 metros, lo que lo convierte en el estratovolcán activo más alto del mundo.")
        ),
        BilingualQuestion(
            id = 8770, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le calcul des variations?", listOf("Leonhard Euler", "Isaac Newton", "Gottfried Leibniz", "Johann Bernoulli"), "Science", "Leonhard Euler a posé les fondements du calcul des variations au XVIIIe siècle, notamment avec l'équation d'Euler-Lagrange, formalisant la recherche de fonctions qui minimisent ou maximisent des intégrales."),
            en = LocalizedContent("Which scientist discovered the calculus of variations?", listOf("Leonhard Euler", "Isaac Newton", "Gottfried Leibniz", "Johann Bernoulli"), "Science", "Leonhard Euler laid the foundations of the calculus of variations in the 18th century, notably with the Euler-Lagrange equation, formalizing the search for functions that minimize or maximize integrals."),
            zh = LocalizedContent("哪位科学家发现了变分法？", listOf("莱昂哈德·欧拉", "艾萨克·牛顿", "戈特弗里德·莱布尼茨", "约翰·伯努利"), "科学", "莱昂哈德·欧拉在18世纪奠定了变分法的基础，特别是欧拉-拉格朗日方程，形式化了寻找最小化或最大化积分的函数的方法。"),
            es = LocalizedContent("¿Qué científico descubrió el cálculo de variaciones?", listOf("Leonhard Euler", "Isaac Newton", "Gottfried Leibniz", "Johann Bernoulli"), "Ciencia", "Leonhard Euler sentó las bases del cálculo de variaciones en el siglo XVIII, especialmente con la ecuación de Euler-Lagrange, formalizando la búsqueda de funciones que minimizan o maximizan integrales.")
        ),
        BilingualQuestion(
            id = 8771, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du xylène?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Le xylène est un hydrocarbure aromatique de formule brute C8H10, souvent représenté par C6H4(CH3)2 pour indiquer un noyau benzénique avec deux groupes méthyle."),
            en = LocalizedContent("What is the chemical symbol for xylene?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Xylene is an aromatic hydrocarbon with the molecular formula C8H10, often represented as C6H4(CH3)2 to indicate a benzene ring with two methyl groups."),
            zh = LocalizedContent("二甲苯的化学符号是什么？", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "科学", "二甲苯是一种芳香烃，分子式为C8H10，通常表示为C6H4(CH3)2，表示一个苯环带有两个甲基。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del xileno?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Ciencia", "El xileno es un hidrocarburo aromático con fórmula molecular C8H10, a menudo representado como C6H4(CH3)2 para indicar un anillo de benceno con dos grupos metilo.")
        ),
        BilingualQuestion(
            id = 8772, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du sodium dans le plasma?", listOf("135-145 mEq/L", "120-130 mEq/L", "150-160 mEq/L", "100-110 mEq/L"), "Science", "Le sodium est le principal cation du milieu extracellulaire et sa concentration plasmatique normale est maintenue entre 135 et 145 mEq/L par les reins et les hormones."),
            en = LocalizedContent("What is the concentration of sodium in plasma?", listOf("135-145 mEq/L", "120-130 mEq/L", "150-160 mEq/L", "100-110 mEq/L"), "Science", "Sodium is the main cation of the extracellular fluid, and its normal plasma concentration is maintained between 135 and 145 mEq/L by the kidneys and hormones."),
            zh = LocalizedContent("血浆中钠的浓度是多少？", listOf("135-145 mEq/L", "120-130 mEq/L", "150-160 mEq/L", "100-110 mEq/L"), "科学", "钠是细胞外液的主要阳离子，其正常血浆浓度由肾脏和激素维持在135至145 mEq/L之间。"),
            es = LocalizedContent("¿Cuál es la concentración de sodio en el plasma?", listOf("135-145 mEq/L", "120-130 mEq/L", "150-160 mEq/L", "100-110 mEq/L"), "Ciencia", "El sodio es el principal catión del líquido extracelular, y su concentración plasmática normal se mantiene entre 135 y 145 mEq/L por los riñones y las hormonas.")
        ),
        BilingualQuestion(
            id = 8773, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a sept électrons de valence?", listOf("Chlore", "Azote", "Oxygène", "Fluor"), "Science", "Le chlore appartient à la famille des halogènes (groupe 17), ce qui lui confère sept électrons de valence dans sa couche externe."),
            en = LocalizedContent("Which chemical element has seven valence electrons?", listOf("Chlorine", "Nitrogen", "Oxygen", "Fluorine"), "Science", "Chlorine belongs to the halogen family (group 17), which gives it seven valence electrons in its outer shell."),
            zh = LocalizedContent("哪种化学元素有七个价电子？", listOf("氯", "氮", "氧", "氟"), "科学", "氯属于卤素族（第17族），因此其外层有七个价电子。"),
            es = LocalizedContent("¿Qué elemento químico tiene siete electrones de valencia?", listOf("Cloro", "Nitrógeno", "Oxígeno", "Flúor"), "Ciencia", "El cloro pertenece a la familia de los halógenos (grupo 17), lo que le confiere siete electrones de valencia en su capa externa.")
        ),
        BilingualQuestion(
            id = 8774, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les nombres de Stirling?", listOf("James Stirling", "Isaac Newton", "Leonhard Euler", "Gottfried Leibniz"), "Science", "James Stirling, mathématicien écossais du XVIIIe siècle, a introduit ces nombres dans son ouvrage *Methodus Differentialis* pour l'étude des séries et des permutations."),
            en = LocalizedContent("Which scientist discovered Stirling numbers?", listOf("James Stirling", "Isaac Newton", "Leonhard Euler", "Gottfried Leibniz"), "Science", "James Stirling, an 18th-century Scottish mathematician, introduced these numbers in his work *Methodus Differentialis* for the study of series and permutations."),
            zh = LocalizedContent("哪位科学家发现了斯特林数？", listOf("詹姆斯·斯特林", "艾萨克·牛顿", "莱昂哈德·欧拉", "戈特弗里德·莱布尼茨"), "科学", "詹姆斯·斯特林，18世纪的苏格兰数学家，在他的著作《微分方法》中引入了这些数字，用于研究级数和排列。"),
            es = LocalizedContent("¿Qué científico descubrió los números de Stirling?", listOf("James Stirling", "Isaac Newton", "Leonhard Euler", "Gottfried Leibniz"), "Ciencia", "James Stirling, matemático escocés del siglo XVIII, introdujo estos números en su obra *Methodus Differentialis* para el estudio de series y permutaciones.")
        ),
        BilingualQuestion(
            id = 8775, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du naphthalène?", listOf("C10H8", "C10H6", "C12H8", "C10H10"), "Science", "Le naphthalène est un hydrocarbure aromatique composé de 10 atomes de carbone et 8 atomes d'hydrogène, d'où sa formule brute C10H8, souvent utilisée comme symbole chimique."),
            en = LocalizedContent("What is the chemical symbol for naphthalene?", listOf("C10H8", "C10H6", "C12H8", "C10H10"), "Science", "Naphthalene is an aromatic hydrocarbon composed of 10 carbon atoms and 8 hydrogen atoms, hence its molecular formula C10H8, often used as a chemical symbol."),
            zh = LocalizedContent("萘的化学符号是什么？", listOf("C10H8", "C10H6", "C12H8", "C10H10"), "科学", "萘是一种芳香烃，由10个碳原子和8个氢原子组成，因此其分子式为C10H8，常作为化学符号使用。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del naftaleno?", listOf("C10H8", "C10H6", "C12H8", "C10H10"), "Ciencia", "El naftaleno es un hidrocarburo aromático compuesto por 10 átomos de carbono y 8 de hidrógeno, de ahí su fórmula molecular C10H8, a menudo utilizada como símbolo químico.")
        ),
        BilingualQuestion(
            id = 8776, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de paires de côtes vraies a un humain?", listOf("7", "8", "6", "9"), "Science", "Les 7 premières paires de côtes sont dites vraies car elles sont directement reliées au sternum par leur propre cartilage costal."),
            en = LocalizedContent("How many pairs of true ribs does a human have?", listOf("7", "8", "6", "9"), "Science", "The first 7 pairs of ribs are called true ribs because they are directly attached to the sternum by their own costal cartilage."),
            zh = LocalizedContent("人类有多少对真肋？", listOf("7", "8", "6", "9"), "科学", "前7对肋骨称为真肋，因为它们通过自身的肋软骨直接与胸骨相连。"),
            es = LocalizedContent("¿Cuántos pares de costillas verdaderas tiene un humano?", listOf("7", "8", "6", "9"), "Ciencia", "Los primeros 7 pares de costillas se llaman verdaderas porque están directamente unidas al esternón por su propio cartílago costal.")
        ),
        BilingualQuestion(
            id = 8777, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le peptide YY?", listOf("Duodénum", "Estomac", "Pancréas", "Foie"), "Science", "Le peptide YY est une hormone sécrétée par les cellules L du duodénum et de l'iléon, principalement en réponse à l'ingestion de nutriments."),
            en = LocalizedContent("Which gland produces peptide YY?", listOf("Duodenum", "Stomach", "Pancreas", "Liver"), "Science", "Peptide YY is a hormone secreted by L cells of the duodenum and ileum, primarily in response to nutrient ingestion."),
            zh = LocalizedContent("哪个腺体产生肽YY？", listOf("十二指肠", "胃", "胰腺", "肝脏"), "科学", "肽YY是一种由十二指肠和回肠的L细胞分泌的激素，主要响应营养摄入。"),
            es = LocalizedContent("¿Qué glándula produce el péptido YY?", listOf("Duodeno", "Estómago", "Páncreas", "Hígado"), "Ciencia", "El péptido YY es una hormona secretada por las células L del duodeno y el íleon, principalmente en respuesta a la ingesta de nutrientes.")
        ),
        BilingualQuestion(
            id = 8778, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand tableau ou tableau de llave du monde?", listOf("Khara-Khoto", "Petra", "Mesa Verde", "Chaco Canyon"), "Science", "Khara-Khoto est une ancienne cité fortifiée de la route de la soie en Mongolie-Intérieure, et son nom signifie \"ville noire\" en mongol."),
            en = LocalizedContent("What is the largest key table in the world?", listOf("Khara-Khoto", "Petra", "Mesa Verde", "Chaco Canyon"), "Science", "Khara-Khoto is an ancient fortified city on the Silk Road in Inner Mongolia, and its name means \"black city\" in Mongolian."),
            zh = LocalizedContent("世界上最大的钥匙表是什么？", listOf("黑水城", "佩特拉", "梅萨维德", "查科峡谷"), "科学", "黑水城是内蒙古丝绸之路上的一座古城堡，其名称在蒙古语中意为“黑城”。"),
            es = LocalizedContent("¿Cuál es la tabla de llaves más grande del mundo?", listOf("Khara-Khoto", "Petra", "Mesa Verde", "Chaco Canyon"), "Ciencia", "Khara-Khoto es una antigua ciudad fortificada en la Ruta de la Seda en Mongolia Interior, y su nombre significa \"ciudad negra\" en mongol.")
        ),
        BilingualQuestion(
            id = 8779, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'algèbre linéaire?", listOf("Arthur Cayley", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Arthur Cayley a formalisé l'algèbre linéaire au XIXe siècle en développant la théorie des matrices et des déterminants, posant ainsi les bases de cette branche mathématique."),
            en = LocalizedContent("Which scientist discovered linear algebra?", listOf("Arthur Cayley", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Arthur Cayley formalized linear algebra in the 19th century by developing the theory of matrices and determinants, laying the foundations for this branch of mathematics."),
            zh = LocalizedContent("哪位科学家发现了线性代数？", listOf("阿瑟·凯莱", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "阿瑟·凯莱在19世纪通过发展矩阵和行列式理论形式化了线性代数，为这一数学分支奠定了基础。"),
            es = LocalizedContent("¿Qué científico descubrió el álgebra lineal?", listOf("Arthur Cayley", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "Arthur Cayley formalizó el álgebra lineal en el siglo XIX al desarrollar la teoría de matrices y determinantes, sentando las bases de esta rama de las matemáticas.")
        ),
        BilingualQuestion(
            id = 8780, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'anthracène?", listOf("C14H10", "C14H8", "C16H10", "C14H12"), "Science", "L'anthracène est un hydrocarbure aromatique polycyclique composé de 14 atomes de carbone et 10 atomes d'hydrogène, d'où sa formule brute C14H10."),
            en = LocalizedContent("What is the chemical symbol for anthracene?", listOf("C14H10", "C14H8", "C16H10", "C14H12"), "Science", "Anthracene is a polycyclic aromatic hydrocarbon composed of 14 carbon atoms and 10 hydrogen atoms, hence its molecular formula C14H10."),
            zh = LocalizedContent("蒽的化学符号是什么？", listOf("C14H10", "C14H8", "C16H10", "C14H12"), "科学", "蒽是一种多环芳烃，由14个碳原子和10个氢原子组成，因此其分子式为C14H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del antraceno?", listOf("C14H10", "C14H8", "C16H10", "C14H12"), "Ciencia", "El antraceno es un hidrocarburo aromático policíclico compuesto por 14 átomos de carbono y 10 átomos de hidrógeno, de ahí su fórmula molecular C14H10.")
        ),
        BilingualQuestion(
            id = 8781, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du magnésium dans le plasma?", listOf("1.7-2.2 mg/100 mL", "1-1.5 mg/100 mL", "3-3.5 mg/100 mL", "4-4.5 mg/100 mL"), "Science", "La concentration plasmatique de magnésium est normalement comprise entre 1,7 et 2,2 mg/100 mL, car ce minéral est essentiel à de nombreuses réactions enzymatiques et à la fonction neuromusculaire."),
            en = LocalizedContent("What is the concentration of magnesium in plasma?", listOf("1.7-2.2 mg/100 mL", "1-1.5 mg/100 mL", "3-3.5 mg/100 mL", "4-4.5 mg/100 mL"), "Science", "The plasma concentration of magnesium is normally between 1.7 and 2.2 mg/100 mL, as this mineral is essential for many enzymatic reactions and neuromuscular function."),
            zh = LocalizedContent("血浆中镁的浓度是多少？", listOf("1.7-2.2 mg/100 mL", "1-1.5 mg/100 mL", "3-3.5 mg/100 mL", "4-4.5 mg/100 mL"), "科学", "血浆中镁的浓度正常范围为1.7至2.2 mg/100 mL，因为这种矿物质对许多酶促反应和神经肌肉功能至关重要。"),
            es = LocalizedContent("¿Cuál es la concentración de magnesio en el plasma?", listOf("1.7-2.2 mg/100 mL", "1-1.5 mg/100 mL", "3-3.5 mg/100 mL", "4-4.5 mg/100 mL"), "Ciencia", "La concentración plasmática de magnesio normalmente está entre 1.7 y 2.2 mg/100 mL, ya que este mineral es esencial para muchas reacciones enzimáticas y la función neuromuscular.")
        ),
        BilingualQuestion(
            id = 8782, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a huit électrons de valence?", listOf("Oxygène", "Azote", "Carbone", "Néon"), "Science", "L'oxygène est dans la seizième colonne du tableau périodique, ce qui lui donne six électrons de valence, et non huit. L'élément avec huit électrons de valence est un gaz noble comme le néon ou l'argon."),
            en = LocalizedContent("Which chemical element has eight valence electrons?", listOf("Oxygen", "Nitrogen", "Carbon", "Neon"), "Science", "Oxygen is in the sixteenth column of the periodic table, giving it six valence electrons, not eight. The element with eight valence electrons is a noble gas like neon or argon."),
            zh = LocalizedContent("哪种化学元素有八个价电子？", listOf("氧", "氮", "碳", "氖"), "科学", "氧位于元素周期表的第十六列，有六个价电子，而不是八个。具有八个价电子的元素是稀有气体，如氖或氩。"),
            es = LocalizedContent("¿Qué elemento químico tiene ocho electrones de valencia?", listOf("Oxígeno", "Nitrógeno", "Carbono", "Neón"), "Ciencia", "El oxígeno está en la decimosexta columna de la tabla periódica, lo que le da seis electrones de valencia, no ocho. El elemento con ocho electrones de valencia es un gas noble como el neón o el argón.")
        ),
        BilingualQuestion(
            id = 8783, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la géométrie projective?", listOf("Gérard Desargues", "René Descartes", "Blaise Pascal", "Pierre de Fermat"), "Science", "Gérard Desargues, mathématicien et architecte français du XVIIe siècle, a posé les bases de la géométrie projective en étudiant les propriétés des figures qui restent invariantes par projection."),
            en = LocalizedContent("Which scientist discovered projective geometry?", listOf("Gérard Desargues", "René Descartes", "Blaise Pascal", "Pierre de Fermat"), "Science", "Gérard Desargues, a French mathematician and architect of the 17th century, laid the foundations of projective geometry by studying the properties of figures that remain invariant under projection."),
            zh = LocalizedContent("哪位科学家发现了射影几何？", listOf("热拉尔·德扎格", "勒内·笛卡尔", "布莱兹·帕斯卡", "皮埃尔·德·费马"), "科学", "热拉尔·德扎格，17世纪的法国数学家和建筑师，通过研究投影下保持不变的图形性质，奠定了射影几何的基础。"),
            es = LocalizedContent("¿Qué científico descubrió la geometría proyectiva?", listOf("Gérard Desargues", "René Descartes", "Blaise Pascal", "Pierre de Fermat"), "Ciencia", "Gérard Desargues, matemático y arquitecto francés del siglo XVII, sentó las bases de la geometría proyectiva al estudiar las propiedades de las figuras que permanecen invariantes bajo proyección.")
        ),
        BilingualQuestion(
            id = 8784, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du pyrène?", listOf("C16H10", "C16H8", "C18H10", "C16H12"), "Science", "Le pyrène est un hydrocarbure aromatique polycyclique composé de 16 atomes de carbone et 10 atomes d'hydrogène, d'où sa formule brute C16H10."),
            en = LocalizedContent("What is the chemical symbol for pyrene?", listOf("C16H10", "C16H8", "C18H10", "C16H12"), "Science", "Pyrene is a polycyclic aromatic hydrocarbon composed of 16 carbon atoms and 10 hydrogen atoms, hence its molecular formula C16H10."),
            zh = LocalizedContent("芘的化学符号是什么？", listOf("C16H10", "C16H8", "C18H10", "C16H12"), "科学", "芘是一种多环芳烃，由16个碳原子和10个氢原子组成，因此其分子式为C16H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del pireno?", listOf("C16H10", "C16H8", "C18H10", "C16H12"), "Ciencia", "El pireno es un hidrocarburo aromático policíclico compuesto por 16 átomos de carbono y 10 átomos de hidrógeno, de ahí su fórmula molecular C16H10.")
        ),
        BilingualQuestion(
            id = 8785, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de côtes asternales a un humain?", listOf("2", "1", "3", "4"), "Science", "Les côtes asternales, aussi appelées côtes flottantes, sont les deux dernières paires de côtes qui ne sont pas reliées au sternum. Chez l'humain, il y en a donc deux de chaque côté, soit quatre au total, mais la question se réfère souvent au nombre par côté."),
            en = LocalizedContent("How many asternal ribs does a human have?", listOf("2", "1", "3", "4"), "Science", "Asternal ribs, also called floating ribs, are the last two pairs of ribs that are not connected to the sternum. In humans, there are thus two on each side, making four in total, but the question often refers to the number per side."),
            zh = LocalizedContent("人类有多少根浮肋？", listOf("2", "1", "3", "4"), "科学", "浮肋，也称为游离肋，是最后两对不与胸骨相连的肋骨。人类每侧有两根，总共四根，但问题通常指每侧的数量。"),
            es = LocalizedContent("¿Cuántas costillas asternales tiene un humano?", listOf("2", "1", "3", "4"), "Ciencia", "Las costillas asternales, también llamadas costillas flotantes, son los dos últimos pares de costillas que no están conectados al esternón. En los humanos, hay dos a cada lado, haciendo un total de cuatro, pero la pregunta a menudo se refiere al número por lado.")
        ),
        BilingualQuestion(
            id = 8786, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le GLP-1?", listOf("Duodénum", "Estomac", "Pancréas", "Foie"), "Science", "Le GLP-1 est une hormone incrétine sécrétée principalement par les cellules L de l'intestin grêle, notamment dans le duodénum, en réponse à l'ingestion de nutriments."),
            en = LocalizedContent("Which gland produces GLP-1?", listOf("Duodenum", "Stomach", "Pancreas", "Liver"), "Science", "GLP-1 is an incretin hormone secreted mainly by L cells of the small intestine, particularly in the duodenum, in response to nutrient ingestion."),
            zh = LocalizedContent("哪个腺体产生GLP-1？", listOf("十二指肠", "胃", "胰腺", "肝脏"), "科学", "GLP-1是一种肠促胰岛素激素，主要由小肠（尤其是十二指肠）的L细胞在摄入营养物质后分泌。"),
            es = LocalizedContent("¿Qué glándula produce GLP-1?", listOf("Duodeno", "Estómago", "Páncreas", "Hígado"), "Ciencia", "El GLP-1 es una hormona incretina secretada principalmente por las células L del intestino delgado, particularmente en el duodeno, en respuesta a la ingesta de nutrientes.")
        ),
        BilingualQuestion(
            id = 8787, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand tumuli du monde?", listOf("Cahokia Mounds", "Monks Mound", "Serpent Mound", "Grave Creek Mound"), "Science", "Situé dans l'Illinois, le site de Cahokia Mounds abrite le Monks Mound, un tumulus de terre haut de 30 mètres, le plus grand des Amériques et du monde."),
            en = LocalizedContent("What is the largest tumulus in the world?", listOf("Cahokia Mounds", "Monks Mound", "Serpent Mound", "Grave Creek Mound"), "Science", "Located in Illinois, the Cahokia Mounds site contains Monks Mound, an earthen tumulus 30 meters high, the largest in the Americas and the world."),
            zh = LocalizedContent("世界上最大的古墓是什么？", listOf("卡霍基亚土丘", "僧侣土丘", "蛇形土丘", "格雷夫克里克土丘"), "科学", "位于伊利诺伊州的卡霍基亚土丘遗址包含僧侣土丘，这是一个高30米的土制古墓，是美洲乃至世界上最大的。"),
            es = LocalizedContent("¿Cuál es el túmulo más grande del mundo?", listOf("Cahokia Mounds", "Monks Mound", "Serpent Mound", "Grave Creek Mound"), "Ciencia", "Ubicado en Illinois, el sitio de Cahokia Mounds alberga Monks Mound, un túmulo de tierra de 30 metros de altura, el más grande de las Américas y del mundo.")
        ),
        BilingualQuestion(
            id = 8788, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les nombres complexes?", listOf("Carl Friedrich Gauss", "Isaac Newton", "Leonhard Euler", "Gottfried Leibniz"), "Science", "Bien que d'autres mathématiciens comme Cardan aient manipulé des racines de nombres négatifs, c'est Gauss qui a formalisé leur représentation géométrique et leur a donné une légitimité mathématique au XIXe siècle."),
            en = LocalizedContent("Which scientist discovered complex numbers?", listOf("Carl Friedrich Gauss", "Isaac Newton", "Leonhard Euler", "Gottfried Leibniz"), "Science", "Although other mathematicians like Cardan manipulated roots of negative numbers, it was Gauss who formalized their geometric representation and gave them mathematical legitimacy in the 19th century."),
            zh = LocalizedContent("哪位科学家发现了复数？", listOf("卡尔·弗里德里希·高斯", "艾萨克·牛顿", "莱昂哈德·欧拉", "戈特弗里德·莱布尼茨"), "科学", "尽管其他数学家如卡尔达诺曾处理过负数的平方根，但高斯在19世纪将其几何表示形式化并赋予了数学合法性。"),
            es = LocalizedContent("¿Qué científico descubrió los números complejos?", listOf("Carl Friedrich Gauss", "Isaac Newton", "Leonhard Euler", "Gottfried Leibniz"), "Ciencia", "Aunque otros matemáticos como Cardan manipularon raíces de números negativos, fue Gauss quien formalizó su representación geométrica y les dio legitimidad matemática en el siglo XIX.")
        ),
        BilingualQuestion(
            id = 8789, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du chrysène?", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "Science", "Le chrysène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule brute C18H12."),
            en = LocalizedContent("What is the chemical symbol for chrysene?", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "Science", "Chrysene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 12 hydrogen atoms, hence its molecular formula C18H12."),
            zh = LocalizedContent("䓛的化学符号是什么？", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "科学", "䓛是一种多环芳烃，由18个碳原子和12个氢原子组成，因此其分子式为C18H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del criseno?", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "Ciencia", "El criseno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 12 átomos de hidrógeno, de ahí su fórmula molecular C18H12.")
        ),
        BilingualQuestion(
            id = 8790, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du phosphore dans le plasma?", listOf("2.5-4.5 mg/100 mL", "1-2 mg/100 mL", "5-6 mg/100 mL", "7-8 mg/100 mL"), "Science", "Le phosphore plasmatique est principalement présent sous forme d'ions phosphate inorganiques, essentiels au métabolisme osseux et énergétique, avec une concentration normale comprise entre 2,5 et 4,5 mg/100 mL."),
            en = LocalizedContent("What is the concentration of phosphorus in plasma?", listOf("2.5-4.5 mg/100 mL", "1-2 mg/100 mL", "5-6 mg/100 mL", "7-8 mg/100 mL"), "Science", "Plasma phosphorus is mainly present as inorganic phosphate ions, essential for bone and energy metabolism, with a normal concentration between 2.5 and 4.5 mg/100 mL."),
            zh = LocalizedContent("血浆中磷的浓度是多少？", listOf("2.5-4.5 mg/100 mL", "1-2 mg/100 mL", "5-6 mg/100 mL", "7-8 mg/100 mL"), "科学", "血浆磷主要以无机磷酸盐离子形式存在，对骨骼和能量代谢至关重要，正常浓度在2.5-4.5 mg/100 mL之间。"),
            es = LocalizedContent("¿Cuál es la concentración de fósforo en el plasma?", listOf("2.5-4.5 mg/100 mL", "1-2 mg/100 mL", "5-6 mg/100 mL", "7-8 mg/100 mL"), "Ciencia", "El fósforo plasmático se encuentra principalmente como iones de fosfato inorgánico, esenciales para el metabolismo óseo y energético, con una concentración normal entre 2.5 y 4.5 mg/100 mL.")
        ),
        BilingualQuestion(
            id = 8791, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique est un halogène?", listOf("Iode", "Carbone", "Soufre", "Azote"), "Science", "L'iode fait partie de la famille des halogènes, qui comprend également le fluor, le chlore et le brome, située dans la 17e colonne du tableau périodique."),
            en = LocalizedContent("Which chemical element is a halogen?", listOf("Iodine", "Carbon", "Sulfur", "Nitrogen"), "Science", "Iodine belongs to the halogen family, which also includes fluorine, chlorine, and bromine, located in the 17th column of the periodic table."),
            zh = LocalizedContent("哪种化学元素是卤素？", listOf("碘", "碳", "硫", "氮"), "科学", "碘属于卤素家族，还包括氟、氯和溴，位于元素周期表的第17列。"),
            es = LocalizedContent("¿Qué elemento químico es un halógeno?", listOf("Yodo", "Carbono", "Azufre", "Nitrógeno"), "Ciencia", "El yodo pertenece a la familia de los halógenos, que también incluye flúor, cloro y bromo, ubicada en la columna 17 de la tabla periódica.")
        ),
        BilingualQuestion(
            id = 8792, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la décomposition en fractions partielles?", listOf("Gottfried Leibniz", "Isaac Newton", "Leonhard Euler", "Johann Bernoulli"), "Science", "Gottfried Leibniz a introduit la méthode de décomposition en fractions partielles au XVIIe siècle dans le cadre de ses travaux sur le calcul intégral, permettant de simplifier l'intégration de fonctions rationnelles."),
            en = LocalizedContent("Which scientist discovered partial fraction decomposition?", listOf("Gottfried Leibniz", "Isaac Newton", "Leonhard Euler", "Johann Bernoulli"), "Science", "Gottfried Leibniz introduced the method of partial fraction decomposition in the 17th century as part of his work on integral calculus, simplifying the integration of rational functions."),
            zh = LocalizedContent("哪位科学家发现了部分分式分解？", listOf("戈特弗里德·莱布尼茨", "艾萨克·牛顿", "莱昂哈德·欧拉", "约翰·伯努利"), "科学", "戈特弗里德·莱布尼茨在17世纪作为其积分学工作的一部分引入了部分分式分解方法，简化了有理函数的积分。"),
            es = LocalizedContent("¿Qué científico descubrió la descomposición en fracciones parciales?", listOf("Gottfried Leibniz", "Isaac Newton", "Leonhard Euler", "Johann Bernoulli"), "Ciencia", "Gottfried Leibniz introdujo el método de descomposición en fracciones parciales en el siglo XVII como parte de su trabajo sobre cálculo integral, simplificando la integración de funciones racionales.")
        ),
        BilingualQuestion(
            id = 8793, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzo[a]pyrène?", listOf("C20H12", "C20H10", "C22H12", "C20H14"), "Science", "Le benzo[a]pyrène est un hydrocarbure aromatique polycyclique composé de 20 atomes de carbone et 12 d'hydrogène, d'où sa formule chimique C20H12."),
            en = LocalizedContent("What is the chemical formula of benzo[a]pyrene?", listOf("C20H12", "C20H10", "C22H12", "C20H14"), "Science", "Benzo[a]pyrene is a polycyclic aromatic hydrocarbon composed of 20 carbon atoms and 12 hydrogen atoms, hence its chemical formula C20H12."),
            zh = LocalizedContent("苯并[a]芘的化学式是什么？", listOf("C20H12", "C20H10", "C22H12", "C20H14"), "科学", "苯并[a]芘是一种多环芳烃，由20个碳原子和12个氢原子组成，因此其化学式为C20H12。"),
            es = LocalizedContent("¿Cuál es la fórmula química del benzo[a]pireno?", listOf("C20H12", "C20H10", "C22H12", "C20H14"), "Ciencia", "El benzo[a]pireno es un hidrocarburo aromático policíclico compuesto por 20 átomos de carbono y 12 de hidrógeno, de ahí su fórmula química C20H12.")
        ),
        BilingualQuestion(
            id = 8794, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules ganglionnaires a la rétine?", listOf("1 million", "500000", "2 millions", "5 millions"), "Science", "La rétine humaine contient environ 1 million de cellules ganglionnaires, qui transmettent les signaux visuels des photorécepteurs au cerveau via le nerf optique."),
            en = LocalizedContent("How many ganglion cells does the retina have?", listOf("1 million", "500,000", "2 million", "5 million"), "Science", "The human retina contains about 1 million ganglion cells, which transmit visual signals from photoreceptors to the brain via the optic nerve."),
            zh = LocalizedContent("视网膜有多少个神经节细胞？", listOf("100万", "50万", "200万", "500万"), "科学", "人类视网膜约有100万个神经节细胞，它们通过视神经将视觉信号从感光细胞传递到大脑。"),
            es = LocalizedContent("¿Cuántas células ganglionares tiene la retina?", listOf("1 millón", "500,000", "2 millones", "5 millones"), "Ciencia", "La retina humana contiene aproximadamente 1 millón de células ganglionares, que transmiten señales visuales desde los fotorreceptores al cerebro a través del nervio óptico.")
        ),
        BilingualQuestion(
            id = 8795, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la ghréline?", listOf("Estomac", "Pancréas", "Duodénum", "Foie"), "Science", "La ghréline, souvent appelée hormone de la faim, est principalement sécrétée par les cellules de l'estomac pour signaler la sensation de faim au cerveau."),
            en = LocalizedContent("Which gland produces ghrelin?", listOf("Stomach", "Pancreas", "Duodenum", "Liver"), "Science", "Ghrelin, often called the hunger hormone, is mainly secreted by cells in the stomach to signal hunger to the brain."),
            zh = LocalizedContent("哪种腺体产生饥饿素？", listOf("胃", "胰腺", "十二指肠", "肝脏"), "科学", "饥饿素通常被称为饥饿激素，主要由胃中的细胞分泌，向大脑发出饥饿信号。"),
            es = LocalizedContent("¿Qué glándula produce la grelina?", listOf("Estómago", "Páncreas", "Duodeno", "Hígado"), "Ciencia", "La grelina, a menudo llamada hormona del hambre, es secretada principalmente por las células del estómago para señalar la sensación de hambre al cerebro.")
        ),
        BilingualQuestion(
            id = 8796, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand dolmen du monde?", listOf("Dolmen de Bagneux", "Dolmen de la Pierre de Couverture", "Dolmen d'Agius", "Dolmen de Newgrange"), "Science", "Le Dolmen de Bagneux, situé à Saumur en France, est le plus grand dolmen d'Europe avec une table de couverture pesant environ 86 tonnes."),
            en = LocalizedContent("What is the largest dolmen in the world?", listOf("Dolmen of Bagneux", "Dolmen of the Covering Stone", "Dolmen of Agius", "Dolmen of Newgrange"), "Science", "The Dolmen of Bagneux, located in Saumur, France, is the largest dolmen in Europe with a capstone weighing about 86 tons."),
            zh = LocalizedContent("世界上最大的石棚是什么？", listOf("巴纽石棚", "覆盖石石棚", "阿吉乌斯石棚", "纽格莱奇石棚"), "科学", "位于法国索米尔的巴纽石棚是欧洲最大的石棚，其顶石重约86吨。"),
            es = LocalizedContent("¿Cuál es el dolmen más grande del mundo?", listOf("Dolmen de Bagneux", "Dolmen de la Piedra de Cubierta", "Dolmen de Agius", "Dolmen de Newgrange"), "Ciencia", "El Dolmen de Bagneux, situado en Saumur, Francia, es el dolmen más grande de Europa con una losa de cubierta que pesa aproximadamente 86 toneladas.")
        ),
        BilingualQuestion(
            id = 8797, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie des ensembles?", listOf("Georg Cantor", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Georg Cantor a développé la théorie des ensembles à la fin du XIXe siècle, révolutionnant les mathématiques en formalisant les concepts d'infini et de cardinalité."),
            en = LocalizedContent("Which scientist discovered set theory?", listOf("Georg Cantor", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Georg Cantor developed set theory in the late 19th century, revolutionizing mathematics by formalizing concepts of infinity and cardinality."),
            zh = LocalizedContent("哪位科学家发现了集合论？", listOf("格奥尔格·康托尔", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "格奥尔格·康托尔在19世纪末发展了集合论，通过形式化无穷和基数概念彻底改变了数学。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de conjuntos?", listOf("Georg Cantor", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "Georg Cantor desarrolló la teoría de conjuntos a finales del siglo XIX, revolucionando las matemáticas al formalizar los conceptos de infinito y cardinalidad.")
        ),
        BilingualQuestion(
            id = 8798, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du triphenylène?", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "Science", "Le triphenylène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 12 d'hydrogène, d'où sa formule brute C18H12."),
            en = LocalizedContent("What is the chemical formula of triphenylene?", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "Science", "Triphenylene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 12 hydrogen atoms, hence its molecular formula C18H12."),
            zh = LocalizedContent("三亚苯的化学式是什么？", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "科学", "三亚苯是一种多环芳烃，由18个碳原子和12个氢原子组成，因此其分子式为C18H12。"),
            es = LocalizedContent("¿Cuál es la fórmula química del trifenileno?", listOf("C18H12", "C18H10", "C20H12", "C18H14"), "Ciencia", "El trifenileno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 12 de hidrógeno, de ahí su fórmula molecular C18H12.")
        ),
        BilingualQuestion(
            id = 8799, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du cholestérol dans le plasma?", listOf("150-250 mg/100 mL", "100-150 mg/100 mL", "250-350 mg/100 mL", "50-100 mg/100 mL"), "Science", "Le cholestérol plasmatique est normalement compris entre 150 et 250 mg/100 mL, car il est essentiel aux membranes cellulaires et à la synthèse hormonale, mais un taux élevé augmente les risques cardiovasculaires."),
            en = LocalizedContent("What is the concentration of cholesterol in plasma?", listOf("150-250 mg/100 mL", "100-150 mg/100 mL", "250-350 mg/100 mL", "50-100 mg/100 mL"), "Science", "Plasma cholesterol is normally between 150 and 250 mg/100 mL, as it is essential for cell membranes and hormone synthesis, but high levels increase cardiovascular risk."),
            zh = LocalizedContent("血浆中胆固醇的浓度是多少？", listOf("150-250 mg/100 mL", "100-150 mg/100 mL", "250-350 mg/100 mL", "50-100 mg/100 mL"), "科学", "血浆胆固醇正常在150-250 mg/100 mL之间，因为它对细胞膜和激素合成至关重要，但高水平会增加心血管风险。"),
            es = LocalizedContent("¿Cuál es la concentración de colesterol en el plasma?", listOf("150-250 mg/100 mL", "100-150 mg/100 mL", "250-350 mg/100 mL", "50-100 mg/100 mL"), "Ciencia", "El colesterol plasmático normalmente está entre 150 y 250 mg/100 mL, ya que es esencial para las membranas celulares y la síntesis hormonal, pero niveles altos aumentan el riesgo cardiovascular.")
        ),
        BilingualQuestion(
            id = 8800, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel élément chimique est un gaz inerte?", listOf("Argon", "Carbone", "Soufre", "Azote"), "Science", "L'argon est un gaz rare ou inerte car il ne réagit pratiquement pas chimiquement, étant stable avec une couche électronique complète. Il fait partie du groupe des gaz nobles."),
            en = LocalizedContent("Which chemical element is an inert gas?", listOf("Argon", "Carbon", "Sulfur", "Nitrogen"), "Science", "Argon is a noble or inert gas because it hardly reacts chemically, being stable with a complete electron shell. It belongs to the group of noble gases."),
            zh = LocalizedContent("哪种化学元素是惰性气体？", listOf("氩", "碳", "硫", "氮"), "科学", "氩是一种稀有气体或惰性气体，因为它几乎不发生化学反应，具有稳定的完整电子层。它属于稀有气体族。"),
            es = LocalizedContent("¿Qué elemento químico es un gas inerte?", listOf("Argón", "Carbono", "Azufre", "Nitrógeno"), "Ciencia", "El argón es un gas noble o inerte porque apenas reacciona químicamente, siendo estable con una capa electrónica completa. Pertenece al grupo de los gases nobles.")
        ),
        BilingualQuestion(
            id = 8801, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le calcul vectoriel?", listOf("Oliver Heaviside", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Oliver Heaviside, ingénieur et physicien britannique, a reformulé les équations de Maxwell et développé le calcul vectoriel moderne dans les années 1880."),
            en = LocalizedContent("Which scientist discovered vector calculus?", listOf("Oliver Heaviside", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Oliver Heaviside, a British engineer and physicist, reformulated Maxwell's equations and developed modern vector calculus in the 1880s."),
            zh = LocalizedContent("哪位科学家发现了向量微积分？", listOf("奥利弗·赫维赛德", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "奥利弗·赫维赛德，英国工程师和物理学家，在19世纪80年代重新表述了麦克斯韦方程组并发展了现代向量微积分。"),
            es = LocalizedContent("¿Qué científico descubrió el cálculo vectorial?", listOf("Oliver Heaviside", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "Oliver Heaviside, ingeniero y físico británico, reformuló las ecuaciones de Maxwell y desarrolló el cálculo vectorial moderno en la década de 1880.")
        ),
        BilingualQuestion(
            id = 8802, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du 1,4-benzoquinone?", listOf("C6H4O2", "C6H4O", "C6H6O2", "C6H4O3"), "Science", "Le 1,4-benzoquinone, aussi appelé para-benzoquinone, a pour formule brute C6H4O2, indiquant six atomes de carbone, quatre d'hydrogène et deux d'oxygène. C'est un composé organique utilisé notamment comme oxydant en chimie."),
            en = LocalizedContent("What is the chemical symbol for 1,4-benzoquinone?", listOf("C6H4O2", "C6H4O", "C6H6O2", "C6H4O3"), "Science", "1,4-benzoquinone, also called para-benzoquinone, has the molecular formula C6H4O2, indicating six carbon atoms, four hydrogen atoms, and two oxygen atoms. It is an organic compound used as an oxidant in chemistry."),
            zh = LocalizedContent("1,4-苯醌的化学式是什么？", listOf("C6H4O2", "C6H4O", "C6H6O2", "C6H4O3"), "科学", "1,4-苯醌，又称对苯醌，分子式为C6H4O2，表示六个碳原子、四个氢原子和两个氧原子。它是一种有机化合物，在化学中用作氧化剂。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la 1,4-benzoquinona?", listOf("C6H4O2", "C6H4O", "C6H6O2", "C6H4O3"), "Ciencia", "La 1,4-benzoquinona, también llamada para-benzoquinona, tiene la fórmula molecular C6H4O2, que indica seis átomos de carbono, cuatro de hidrógeno y dos de oxígeno. Es un compuesto orgánico utilizado como oxidante en química.")
        ),
        BilingualQuestion(
            id = 8803, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cônes rétiniens a l'œil humain?", listOf("6-7 millions", "3-4 millions", "10-11 millions", "1-2 millions"), "Science", "L'œil humain contient environ 6 à 7 millions de cônes, principalement concentrés dans la fovéa, permettant la vision des couleurs et des détails fins."),
            en = LocalizedContent("How many retinal cones does the human eye have?", listOf("6-7 million", "3-4 million", "10-11 million", "1-2 million"), "Science", "The human eye contains about 6 to 7 million cones, mainly concentrated in the fovea, enabling color vision and fine detail."),
            zh = LocalizedContent("人眼有多少个视网膜视锥细胞？", listOf("600-700万", "300-400万", "1000-1100万", "100-200万"), "科学", "人眼约有600至700万个视锥细胞，主要集中在中央凹，负责颜色视觉和精细细节。"),
            es = LocalizedContent("¿Cuántos conos retinianos tiene el ojo humano?", listOf("6-7 millones", "3-4 millones", "10-11 millones", "1-2 millones"), "Ciencia", "El ojo humano contiene aproximadamente de 6 a 7 millones de conos, concentrados principalmente en la fóvea, permitiendo la visión del color y los detalles finos.")
        ),
        BilingualQuestion(
            id = 8804, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la leptine?", listOf("Tissu adipeux", "Pancréas", "Estomac", "Foie"), "Science", "La leptine est une hormone produite principalement par les cellules adipeuses (tissu adipeux) pour réguler l'appétit et le métabolisme énergétique."),
            en = LocalizedContent("Which gland produces leptin?", listOf("Adipose tissue", "Pancreas", "Stomach", "Liver"), "Science", "Leptin is a hormone produced mainly by fat cells (adipose tissue) to regulate appetite and energy metabolism."),
            zh = LocalizedContent("哪种腺体产生瘦素？", listOf("脂肪组织", "胰腺", "胃", "肝脏"), "科学", "瘦素是一种主要由脂肪细胞（脂肪组织）产生的激素，用于调节食欲和能量代谢。"),
            es = LocalizedContent("¿Qué glándula produce la leptina?", listOf("Tejido adiposo", "Páncreas", "Estómago", "Hígado"), "Ciencia", "La leptina es una hormona producida principalmente por las células grasas (tejido adiposo) para regular el apetito y el metabolismo energético.")
        ),
        BilingualQuestion(
            id = 8805, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand monument datant de la préhistoire?", listOf("Stonehenge", "Les Pyramides", "Angkor Wat", "Machu Picchu"), "Science", "Stonehenge, en Angleterre, est le plus célèbre monument mégalithique préhistorique, construit entre 3000 et 2000 av. J.-C."),
            en = LocalizedContent("What is the largest monument dating from prehistory?", listOf("Stonehenge", "The Pyramids", "Angkor Wat", "Machu Picchu"), "Science", "Stonehenge, in England, is the most famous prehistoric megalithic monument, built between 3000 and 2000 BC."),
            zh = LocalizedContent("史前时期最大的纪念碑是什么？", listOf("巨石阵", "金字塔", "吴哥窟", "马丘比丘"), "科学", "位于英格兰的巨石阵是最著名的史前巨石纪念碑，建于公元前3000年至2000年之间。"),
            es = LocalizedContent("¿Cuál es el monumento más grande que data de la prehistoria?", listOf("Stonehenge", "Las Pirámides", "Angkor Wat", "Machu Picchu"), "Ciencia", "Stonehenge, en Inglaterra, es el monumento megalítico prehistórico más famoso, construido entre el 3000 y el 2000 a.C.")
        ),
        BilingualQuestion(
            id = 8806, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert l'analyse tensorielle?", listOf("Gregorio Ricci-Curbastro", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Gregorio Ricci-Curbastro, mathématicien italien, a développé le calcul tensoriel à la fin du XIXe siècle, avec son élève Tullio Levi-Civita. Cette théorie est devenue un outil fondamental pour la relativité générale d'Einstein."),
            en = LocalizedContent("Which scientist discovered tensor analysis?", listOf("Gregorio Ricci-Curbastro", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Gregorio Ricci-Curbastro, an Italian mathematician, developed tensor calculus in the late 19th century with his student Tullio Levi-Civita. This theory became a fundamental tool for Einstein's general relativity."),
            zh = LocalizedContent("哪位科学家发现了张量分析？", listOf("格雷戈里奥·里奇-库尔巴斯特罗", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "格雷戈里奥·里奇-库尔巴斯特罗，意大利数学家，在19世纪末与他的学生图利奥·列维-奇维塔共同发展了张量微积分。这一理论成为爱因斯坦广义相对论的基础工具。"),
            es = LocalizedContent("¿Qué científico descubrió el análisis tensorial?", listOf("Gregorio Ricci-Curbastro", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "Gregorio Ricci-Curbastro, matemático italiano, desarrolló el cálculo tensorial a finales del siglo XIX con su alumno Tullio Levi-Civita. Esta teoría se convirtió en una herramienta fundamental para la relatividad general de Einstein.")
        ),
        BilingualQuestion(
            id = 8807, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du phénylamine?", listOf("C6H5NH2", "C6H5NH", "C6H5N", "C6H4NH2"), "Science", "Le phénylamine, aussi appelée aniline, a pour formule chimique C6H5NH2, où C6H5 représente le cycle benzénique et NH2 le groupe amine."),
            en = LocalizedContent("What is the chemical symbol for phenylamine?", listOf("C6H5NH2", "C6H5NH", "C6H5N", "C6H4NH2"), "Science", "Phenylamine, also called aniline, has the chemical formula C6H5NH2, where C6H5 represents the benzene ring and NH2 the amine group."),
            zh = LocalizedContent("苯胺的化学式是什么？", listOf("C6H5NH2", "C6H5NH", "C6H5N", "C6H4NH2"), "科学", "苯胺，又称苯胺，化学式为C6H5NH2，其中C6H5代表苯环，NH2代表氨基。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la fenilamina?", listOf("C6H5NH2", "C6H5NH", "C6H5N", "C6H4NH2"), "Ciencia", "La fenilamina, también llamada anilina, tiene la fórmula química C6H5NH2, donde C6H5 representa el anillo bencénico y NH2 el grupo amino.")
        ),
        BilingualQuestion(
            id = 8808, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration des triglycérides dans le plasma?", listOf("50-200 mg/100 mL", "20-50 mg/100 mL", "200-300 mg/100 mL", "300-400 mg/100 mL"), "Science", "Les triglycérides sont des lipides circulant dans le sang, et leur concentration normale à jeun se situe entre 50 et 200 mg/100 mL, au-delà de laquelle on parle d'hypertriglycéridémie."),
            en = LocalizedContent("What is the concentration of triglycerides in plasma?", listOf("50-200 mg/100 mL", "20-50 mg/100 mL", "200-300 mg/100 mL", "300-400 mg/100 mL"), "Science", "Triglycerides are lipids circulating in the blood, and their normal fasting concentration is between 50 and 200 mg/100 mL, above which it is called hypertriglyceridemia."),
            zh = LocalizedContent("血浆中甘油三酯的浓度是多少？", listOf("50-200 mg/100 mL", "20-50 mg/100 mL", "200-300 mg/100 mL", "300-400 mg/100 mL"), "科学", "甘油三酯是血液中循环的脂质，其正常空腹浓度在50至200 mg/100 mL之间，超过此范围称为高甘油三酯血症。"),
            es = LocalizedContent("¿Cuál es la concentración de triglicéridos en el plasma?", listOf("50-200 mg/100 mL", "20-50 mg/100 mL", "200-300 mg/100 mL", "300-400 mg/100 mL"), "Ciencia", "Los triglicéridos son lípidos que circulan en la sangre, y su concentración normal en ayunas se encuentra entre 50 y 200 mg/100 mL, por encima de la cual se habla de hipertrigliceridemia.")
        ),
        BilingualQuestion(
            id = 8809, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a deux valences?", listOf("Cuivre", "Sodium", "Aluminium", "Carbone"), "Science", "Le cuivre possède deux valences principales : +1 (cuivreux) et +2 (cuivrique), ce qui lui permet de former deux types de composés chimiques distincts."),
            en = LocalizedContent("Which chemical element has two valences?", listOf("Copper", "Sodium", "Aluminum", "Carbon"), "Science", "Copper has two main valences: +1 (cuprous) and +2 (cupric), allowing it to form two distinct types of chemical compounds."),
            zh = LocalizedContent("哪种化学元素有两种化合价？", listOf("铜", "钠", "铝", "碳"), "科学", "铜有两种主要化合价：+1（亚铜）和+2（铜），使其能形成两种不同类型的化合物。"),
            es = LocalizedContent("¿Qué elemento químico tiene dos valencias?", listOf("Cobre", "Sodio", "Aluminio", "Carbono"), "Ciencia", "El cobre tiene dos valencias principales: +1 (cuproso) y +2 (cúprico), lo que le permite formar dos tipos distintos de compuestos químicos.")
        ),
        BilingualQuestion(
            id = 8810, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le théorème de Stokes?", listOf("George Gabriel Stokes", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "George Gabriel Stokes, mathématicien et physicien irlandais du XIXe siècle, a formulé ce théorème fondamental en analyse vectorielle, reliant l'intégrale de surface d'un champ vectoriel à son intégrale curviligne."),
            en = LocalizedContent("Which scientist discovered Stokes' theorem?", listOf("George Gabriel Stokes", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "George Gabriel Stokes, a 19th-century Irish mathematician and physicist, formulated this fundamental theorem in vector calculus, relating the surface integral of a vector field to its line integral."),
            zh = LocalizedContent("哪位科学家发现了斯托克斯定理？", listOf("乔治·加布里埃尔·斯托克斯", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "乔治·加布里埃尔·斯托克斯，19世纪爱尔兰数学家和物理学家，提出了这个向量分析中的基本定理，将向量场的曲面积分与其线积分联系起来。"),
            es = LocalizedContent("¿Qué científico descubrió el teorema de Stokes?", listOf("George Gabriel Stokes", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "George Gabriel Stokes, matemático y físico irlandés del siglo XIX, formuló este teorema fundamental en análisis vectorial, relacionando la integral de superficie de un campo vectorial con su integral curvilínea.")
        ),
        BilingualQuestion(
            id = 8811, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du toluène?", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "Science", "Le toluène est un hydrocarbure aromatique de formule C7H8, pas C6H6. Le benzène a pour formule C6H6."),
            en = LocalizedContent("What is the chemical symbol for toluene?", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "Science", "Toluene is an aromatic hydrocarbon with formula C7H8, not C6H6. Benzene has formula C6H6."),
            zh = LocalizedContent("甲苯的化学符号是什么？", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "科学", "甲苯是一种芳香烃，分子式为C7H8，不是C6H6。苯的分子式为C6H6。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tolueno?", listOf("C6H5CH3", "C6H6", "C7H8", "C6H4CH3"), "Ciencia", "El tolueno es un hidrocarburo aromático de fórmula C7H8, no C6H6. El benceno tiene fórmula C6H6.")
        ),
        BilingualQuestion(
            id = 8812, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de bâtonnets rétiniens a l'œil humain?", listOf("120-130 millions", "60-70 millions", "150-160 millions", "30-40 millions"), "Science", "Les bâtonnets sont les photorécepteurs responsables de la vision en basse lumière, et leur nombre, estimé entre 120 et 130 millions, dépasse largement celui des cônes (environ 6 millions)."),
            en = LocalizedContent("How many retinal rods does the human eye have?", listOf("120-130 million", "60-70 million", "150-160 million", "30-40 million"), "Science", "Rods are photoreceptors responsible for low-light vision, and their number, estimated between 120 and 130 million, far exceeds that of cones (about 6 million)."),
            zh = LocalizedContent("人眼有多少个视网膜杆状细胞？", listOf("1.2-1.3亿", "6000-7000万", "1.5-1.6亿", "3000-4000万"), "科学", "杆状细胞是负责弱光视觉的光感受器，其数量估计在1.2亿到1.3亿之间，远远超过视锥细胞（约600万个）。"),
            es = LocalizedContent("¿Cuántos bastones retinianos tiene el ojo humano?", listOf("120-130 millones", "60-70 millones", "150-160 millones", "30-40 millones"), "Ciencia", "Los bastones son fotorreceptores responsables de la visión en condiciones de poca luz, y su número, estimado entre 120 y 130 millones, supera ampliamente al de los conos (aproximadamente 6 millones).")
        ),
        BilingualQuestion(
            id = 8813, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit l'adiponectine?", listOf("Tissu adipeux", "Pancréas", "Estomac", "Foie"), "Science", "L'adiponectine est une hormone sécrétée principalement par les cellules du tissu adipeux, qui régule le métabolisme du glucose et des acides gras."),
            en = LocalizedContent("Which gland produces adiponectin?", listOf("Adipose tissue", "Pancreas", "Stomach", "Liver"), "Science", "Adiponectin is a hormone secreted mainly by cells of adipose tissue, which regulates glucose and fatty acid metabolism."),
            zh = LocalizedContent("哪种腺体产生脂联素？", listOf("脂肪组织", "胰腺", "胃", "肝脏"), "科学", "脂联素是一种主要由脂肪组织细胞分泌的激素，调节葡萄糖和脂肪酸的代谢。"),
            es = LocalizedContent("¿Qué glándula produce la adiponectina?", listOf("Tejido adiposo", "Páncreas", "Estómago", "Hígado"), "Ciencia", "La adiponectina es una hormona secretada principalmente por las células del tejido adiposo, que regula el metabolismo de la glucosa y los ácidos grasos.")
        ),
        BilingualQuestion(
            id = 8814, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand site archéologique connu?", listOf("Angkor", "Les Pyramides", "Pompéi", "Pétra"), "Science", "Angkor, au Cambodge, est considéré comme le plus grand site archéologique au monde, s'étendant sur environ 400 km². Il abrite les vestiges de l'empire khmer, incluant le célèbre temple d'Angkor Vat."),
            en = LocalizedContent("What is the largest known archaeological site?", listOf("Angkor", "The Pyramids", "Pompeii", "Petra"), "Science", "Angkor, in Cambodia, is considered the largest archaeological site in the world, spanning about 400 km². It contains the remains of the Khmer Empire, including the famous Angkor Wat temple."),
            zh = LocalizedContent("已知最大的考古遗址是什么？", listOf("吴哥窟", "金字塔", "庞贝", "佩特拉"), "科学", "柬埔寨的吴哥窟被认为是世界上最大的考古遗址，面积约400平方公里。它包含高棉帝国的遗迹，包括著名的吴哥窟寺庙。"),
            es = LocalizedContent("¿Cuál es el sitio arqueológico más grande conocido?", listOf("Angkor", "Las Pirámides", "Pompeya", "Petra"), "Ciencia", "Angkor, en Camboya, es considerado el sitio arqueológico más grande del mundo, con una extensión de unos 400 km². Alberga los restos del imperio jemer, incluido el famoso templo de Angkor Wat.")
        ),
        BilingualQuestion(
            id = 8815, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le théorème de Green?", listOf("George Green", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "George Green, mathématicien et physicien britannique autodidacte, a formulé ce théorème en 1828 dans son essai sur l'analyse mathématique des phénomènes électriques et magnétiques."),
            en = LocalizedContent("Which scientist discovered Green's theorem?", listOf("George Green", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "George Green, a self-taught British mathematician and physicist, formulated this theorem in 1828 in his essay on the mathematical analysis of electrical and magnetic phenomena."),
            zh = LocalizedContent("哪位科学家发现了格林定理？", listOf("乔治·格林", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "乔治·格林，一位自学成才的英国数学家和物理学家，在1828年关于电和磁现象的数学分析论文中提出了这个定理。"),
            es = LocalizedContent("¿Qué científico descubrió el teorema de Green?", listOf("George Green", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "George Green, matemático y físico británico autodidacta, formuló este teorema en 1828 en su ensayo sobre el análisis matemático de los fenómenos eléctricos y magnéticos.")
        ),
        BilingualQuestion(
            id = 8816, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du para-xylène?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Le para-xylène est un hydrocarbure aromatique de formule C8H10, souvent représenté par C6H4(CH3)2 pour indiquer deux groupes méthyle attachés à un cycle benzénique en position para."),
            en = LocalizedContent("What is the chemical symbol for para-xylene?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Para-xylene is an aromatic hydrocarbon with formula C8H10, often represented as C6H4(CH3)2 to indicate two methyl groups attached to a benzene ring in para position."),
            zh = LocalizedContent("对二甲苯的化学符号是什么？", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "科学", "对二甲苯是一种芳香烃，分子式为C8H10，通常表示为C6H4(CH3)2，表示两个甲基在对位连接到苯环上。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del para-xileno?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Ciencia", "El para-xileno es un hidrocarburo aromático de fórmula C8H10, a menudo representado como C6H4(CH3)2 para indicar dos grupos metilo unidos a un anillo de benceno en posición para.")
        ),
        BilingualQuestion(
            id = 8817, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'urée dans le plasma?", listOf("20-35 mg/100 mL", "10-20 mg/100 mL", "40-50 mg/100 mL", "50-60 mg/100 mL"), "Science", "L'urée est le principal déchet azoté du métabolisme des protéines, filtrée par les reins. Sa concentration plasmatique normale se situe entre 20 et 35 mg/100 mL, reflétant l'équilibre entre production hépatique et excrétion rénale."),
            en = LocalizedContent("What is the concentration of urea in plasma?", listOf("20-35 mg/100 mL", "10-20 mg/100 mL", "40-50 mg/100 mL", "50-60 mg/100 mL"), "Science", "Urea is the main nitrogenous waste from protein metabolism, filtered by the kidneys. Its normal plasma concentration is between 20 and 35 mg/100 mL, reflecting the balance between hepatic production and renal excretion."),
            zh = LocalizedContent("血浆中尿素的浓度是多少？", listOf("20-35 mg/100 mL", "10-20 mg/100 mL", "40-50 mg/100 mL", "50-60 mg/100 mL"), "科学", "尿素是蛋白质代谢的主要含氮废物，由肾脏过滤。其正常血浆浓度在20-35 mg/100 mL之间，反映了肝脏产生和肾脏排泄之间的平衡。"),
            es = LocalizedContent("¿Cuál es la concentración de urea en el plasma?", listOf("20-35 mg/100 mL", "10-20 mg/100 mL", "40-50 mg/100 mL", "50-60 mg/100 mL"), "Ciencia", "La urea es el principal desecho nitrogenado del metabolismo de las proteínas, filtrada por los riñones. Su concentración plasmática normal se sitúa entre 20 y 35 mg/100 mL, reflejando el equilibrio entre la producción hepática y la excreción renal.")
        ),
        BilingualQuestion(
            id = 8818, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a trois valences?", listOf("Aluminium", "Sodium", "Magnésium", "Carbone"), "Science", "L'aluminium a trois électrons de valence dans sa couche externe, ce qui lui permet de former trois liaisons chimiques, comme dans l'oxyde d'aluminium Al2O3."),
            en = LocalizedContent("Which chemical element has three valences?", listOf("Aluminium", "Sodium", "Magnesium", "Carbon"), "Science", "Aluminium has three valence electrons in its outer shell, allowing it to form three chemical bonds, as in aluminium oxide Al2O3."),
            zh = LocalizedContent("哪种化学元素有三个化合价？", listOf("铝", "钠", "镁", "碳"), "科学", "铝在其外层有三个价电子，使其能够形成三个化学键，例如在氧化铝Al2O3中。"),
            es = LocalizedContent("¿Qué elemento químico tiene tres valencias?", listOf("Aluminio", "Sodio", "Magnesio", "Carbono"), "Ciencia", "El aluminio tiene tres electrones de valencia en su capa externa, lo que le permite formar tres enlaces químicos, como en el óxido de aluminio Al2O3.")
        ),
        BilingualQuestion(
            id = 8819, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le théorème de Gauss?", listOf("Carl Friedrich Gauss", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Carl Friedrich Gauss, mathématicien allemand du XIXe siècle, a énoncé ce théorème fondamental en algèbre et en analyse, notamment le théorème fondamental de l'algèbre et le théorème de Gauss en électromagnétisme."),
            en = LocalizedContent("Which scientist discovered Gauss's theorem?", listOf("Carl Friedrich Gauss", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Carl Friedrich Gauss, a 19th-century German mathematician, stated this fundamental theorem in algebra and analysis, notably the fundamental theorem of algebra and Gauss's theorem in electromagnetism."),
            zh = LocalizedContent("哪位科学家发现了高斯定理？", listOf("卡尔·弗里德里希·高斯", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "卡尔·弗里德里希·高斯，19世纪德国数学家，阐述了代数和分析中的这个基本定理，特别是代数基本定理和电磁学中的高斯定理。"),
            es = LocalizedContent("¿Qué científico descubrió el teorema de Gauss?", listOf("Carl Friedrich Gauss", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "Carl Friedrich Gauss, matemático alemán del siglo XIX, enunció este teorema fundamental en álgebra y análisis, especialmente el teorema fundamental del álgebra y el teorema de Gauss en electromagnetismo.")
        ),
        BilingualQuestion(
            id = 8820, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du méta-xylène?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Le méta-xylène est un hydrocarbure aromatique de formule C6H4(CH3)2, où deux groupes méthyle sont fixés sur un noyau benzénique en position méta."),
            en = LocalizedContent("What is the chemical symbol for meta-xylene?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Meta-xylene is an aromatic hydrocarbon with formula C6H4(CH3)2, where two methyl groups are attached to a benzene ring in meta position."),
            zh = LocalizedContent("间二甲苯的化学符号是什么？", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "科学", "间二甲苯是一种芳香烃，化学式为C6H4(CH3)2，其中两个甲基基团在苯环上处于间位。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del meta-xileno?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Ciencia", "El meta-xileno es un hidrocarburo aromático de fórmula C6H4(CH3)2, donde dos grupos metilo están unidos a un anillo de benceno en posición meta.")
        ),
        BilingualQuestion(
            id = 8821, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fibres optiques a le nerf optique?", listOf("1 million", "500000", "2 millions", "5 millions"), "Science", "Le nerf optique humain contient environ 1 million de fibres nerveuses, chacune transmettant des signaux visuels de la rétine au cerveau."),
            en = LocalizedContent("How many optic fibers does the optic nerve have?", listOf("1 million", "500000", "2 million", "5 million"), "Science", "The human optic nerve contains about 1 million nerve fibers, each transmitting visual signals from the retina to the brain."),
            zh = LocalizedContent("视神经有多少根光纤？", listOf("100万", "50万", "200万", "500万"), "科学", "人类视神经包含约100万根神经纤维，每根纤维将视觉信号从视网膜传输到大脑。"),
            es = LocalizedContent("¿Cuántas fibras ópticas tiene el nervio óptico?", listOf("1 millón", "500000", "2 millones", "5 millones"), "Ciencia", "El nervio óptico humano contiene aproximadamente 1 millón de fibras nerviosas, cada una transmitiendo señales visuales desde la retina al cerebro.")
        ),
        BilingualQuestion(
            id = 8822, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la résistine?", listOf("Tissu adipeux", "Pancréas", "Estomac", "Foie"), "Science", "La résistine est une hormone sécrétée principalement par le tissu adipeux, jouant un rôle dans la régulation du métabolisme glucidique et l'insulinorésistance."),
            en = LocalizedContent("Which gland produces resistin?", listOf("Adipose tissue", "Pancreas", "Stomach", "Liver"), "Science", "Resistin is a hormone secreted mainly by adipose tissue, playing a role in the regulation of glucose metabolism and insulin resistance."),
            zh = LocalizedContent("哪种腺体产生抵抗素？", listOf("脂肪组织", "胰腺", "胃", "肝脏"), "科学", "抵抗素是一种主要由脂肪组织分泌的激素，在调节糖代谢和胰岛素抵抗中发挥作用。"),
            es = LocalizedContent("¿Qué glándula produce la resistina?", listOf("Tejido adiposo", "Páncreas", "Estómago", "Hígado"), "Ciencia", "La resistina es una hormona secretada principalmente por el tejido adiposo, que desempeña un papel en la regulación del metabolismo de la glucosa y la resistencia a la insulina.")
        ),
        BilingualQuestion(
            id = 8823, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand site urbain antique?", listOf("Rome", "Athènes", "Babylone", "Alexandrie"), "Science", "Rome était la capitale de l'Empire romain, atteignant une population d'environ un million d'habitants à son apogée, ce qui en fait la plus grande ville de l'Antiquité."),
            en = LocalizedContent("What is the largest ancient urban site?", listOf("Rome", "Athens", "Babylon", "Alexandria"), "Science", "Rome was the capital of the Roman Empire, reaching a population of about one million inhabitants at its peak, making it the largest city in antiquity."),
            zh = LocalizedContent("最大的古代城市遗址是什么？", listOf("罗马", "雅典", "巴比伦", "亚历山大"), "科学", "罗马是罗马帝国的首都，在其鼎盛时期人口约达一百万，使其成为古代最大的城市。"),
            es = LocalizedContent("¿Cuál es el sitio urbano antiguo más grande?", listOf("Roma", "Atenas", "Babilonia", "Alejandría"), "Ciencia", "Roma fue la capital del Imperio Romano, alcanzando una población de aproximadamente un millón de habitantes en su apogeo, lo que la convierte en la ciudad más grande de la antigüedad.")
        ),
        BilingualQuestion(
            id = 8824, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le théorème d'Ampère?", listOf("André-Marie Ampère", "Michael Faraday", "Carl Friedrich Gauss", "Isaac Newton"), "Science", "André-Marie Ampère a formulé ce théorème fondamental de l'électromagnétisme dans les années 1820, reliant le champ magnétique au courant électrique qui le produit."),
            en = LocalizedContent("Which scientist discovered Ampère's theorem?", listOf("André-Marie Ampère", "Michael Faraday", "Carl Friedrich Gauss", "Isaac Newton"), "Science", "André-Marie Ampère formulated this fundamental theorem of electromagnetism in the 1820s, relating the magnetic field to the electric current that produces it."),
            zh = LocalizedContent("哪位科学家发现了安培定理？", listOf("安德烈-玛丽·安培", "迈克尔·法拉第", "卡尔·弗里德里希·高斯", "艾萨克·牛顿"), "科学", "安德烈-玛丽·安培在19世纪20年代提出了这个电磁学的基本定理，将磁场与其产生的电流联系起来。"),
            es = LocalizedContent("¿Qué científico descubrió el teorema de Ampère?", listOf("André-Marie Ampère", "Michael Faraday", "Carl Friedrich Gauss", "Isaac Newton"), "Ciencia", "André-Marie Ampère formuló este teorema fundamental del electromagnetismo en la década de 1820, relacionando el campo magnético con la corriente eléctrica que lo produce.")
        ),
        BilingualQuestion(
            id = 8825, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'ortho-xylène?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "L'ortho-xylène est un hydrocarbure aromatique de formule C6H4(CH3)2, où les deux groupes méthyle sont adjacents sur le cycle benzénique. Ce symbole chimique représente sa structure moléculaire spécifique."),
            en = LocalizedContent("What is the chemical symbol for ortho-xylene?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Science", "Ortho-xylene is an aromatic hydrocarbon with formula C6H4(CH3)2, where the two methyl groups are adjacent on the benzene ring. This chemical symbol represents its specific molecular structure."),
            zh = LocalizedContent("邻二甲苯的化学符号是什么？", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "科学", "邻二甲苯是一种芳香烃，化学式为C6H4(CH3)2，其中两个甲基基团在苯环上相邻。这个化学符号代表其特定的分子结构。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del orto-xileno?", listOf("C6H4(CH3)2", "C6H6", "C8H10", "C6H4CH3"), "Ciencia", "El orto-xileno es un hidrocarburo aromático de fórmula C6H4(CH3)2, donde los dos grupos metilo son adyacentes en el anillo de benceno. Este símbolo químico representa su estructura molecular específica.")
        ),
        BilingualQuestion(
            id = 8826, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'acide urique dans le plasma?", listOf("3-7 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "Science", "L'acide urique est le produit final du métabolisme des purines. Une concentration plasmatique normale se situe entre 3 et 7 mg/100 mL, au-delà de laquelle on parle d'hyperuricémie, facteur de risque de goutte."),
            en = LocalizedContent("What is the concentration of uric acid in plasma?", listOf("3-7 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "Science", "Uric acid is the end product of purine metabolism. A normal plasma concentration is between 3 and 7 mg/100 mL, above which it is called hyperuricemia, a risk factor for gout."),
            zh = LocalizedContent("血浆中尿酸的浓度是多少？", listOf("3-7 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "科学", "尿酸是嘌呤代谢的最终产物。正常血浆浓度在3-7 mg/100 mL之间，超过此值称为高尿酸血症，是痛风的危险因素。"),
            es = LocalizedContent("¿Cuál es la concentración de ácido úrico en el plasma?", listOf("3-7 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "Ciencia", "El ácido úrico es el producto final del metabolismo de las purinas. Una concentración plasmática normal se sitúa entre 3 y 7 mg/100 mL, por encima de la cual se denomina hiperuricemia, un factor de riesgo para la gota.")
        ),
        BilingualQuestion(
            id = 8827, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est ferromagnétique?", listOf("Fer", "Cuivre", "Argent", "Or"), "Science", "Le fer est un matériau ferromagnétique car ses atomes peuvent s'aligner sous un champ magnétique pour former un aimant permanent."),
            en = LocalizedContent("Which chemical element is ferromagnetic?", listOf("Iron", "Copper", "Silver", "Gold"), "Science", "Iron is a ferromagnetic material because its atoms can align under a magnetic field to form a permanent magnet."),
            zh = LocalizedContent("哪种化学元素是铁磁性的？", listOf("铁", "铜", "银", "金"), "科学", "铁是一种铁磁性材料，因为其原子可以在磁场下排列形成永磁体。"),
            es = LocalizedContent("¿Qué elemento químico es ferromagnético?", listOf("Hierro", "Cobre", "Plata", "Oro"), "Ciencia", "El hierro es un material ferromagnético porque sus átomos pueden alinearse bajo un campo magnético para formar un imán permanente.")
        ),
        BilingualQuestion(
            id = 8828, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert l'équation de Schrödinger?", listOf("Erwin Schrödinger", "Werner Heisenberg", "Niels Bohr", "Max Planck"), "Science", "Erwin Schrödinger a formulé cette équation fondamentale de la mécanique quantique en 1926, décrivant l'évolution dans le temps d'une particule quantique."),
            en = LocalizedContent("Which scientist discovered the Schrödinger equation?", listOf("Erwin Schrödinger", "Werner Heisenberg", "Niels Bohr", "Max Planck"), "Science", "Erwin Schrödinger formulated this fundamental equation of quantum mechanics in 1926, describing the time evolution of a quantum particle."),
            zh = LocalizedContent("哪位科学家发现了薛定谔方程？", listOf("埃尔温·薛定谔", "维尔纳·海森堡", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "埃尔温·薛定谔在1926年提出了这个量子力学的基本方程，描述了量子粒子随时间演化。"),
            es = LocalizedContent("¿Qué científico descubrió la ecuación de Schrödinger?", listOf("Erwin Schrödinger", "Werner Heisenberg", "Niels Bohr", "Max Planck"), "Ciencia", "Erwin Schrödinger formuló esta ecuación fundamental de la mecánica cuántica en 1926, describiendo la evolución temporal de una partícula cuántica.")
        ),
        BilingualQuestion(
            id = 8829, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du naphtol?", listOf("C10H7OH", "C10H8", "C10H6OH", "C10H8O"), "Science", "Le naphtol est un composé organique dérivé du naphtalène, dont la formule brute est C10H8, mais avec un groupe hydroxyle (OH) substituant un atome d'hydrogène, d'où la notation C10H7OH."),
            en = LocalizedContent("What is the chemical symbol for naphthol?", listOf("C10H7OH", "C10H8", "C10H6OH", "C10H8O"), "Science", "Naphthol is an organic compound derived from naphthalene, whose molecular formula is C10H8, but with a hydroxyl group (OH) substituting one hydrogen atom, hence the notation C10H7OH."),
            zh = LocalizedContent("萘酚的化学符号是什么？", listOf("C10H7OH", "C10H8", "C10H6OH", "C10H8O"), "科学", "萘酚是一种有机化合物，衍生自萘，萘的分子式为C10H8，但有一个羟基（OH）取代了一个氢原子，因此表示为C10H7OH。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del naftol?", listOf("C10H7OH", "C10H8", "C10H6OH", "C10H8O"), "Ciencia", "El naftol es un compuesto orgánico derivado del naftaleno, cuya fórmula molecular es C10H8, pero con un grupo hidroxilo (OH) sustituyendo un átomo de hidrógeno, de ahí la notación C10H7OH.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8830, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules ganglionnaires rétiniennes a l'œil humain?", listOf("1-1.5 millions", "500000", "2-3 millions", "5 millions"), "Science", "Les cellules ganglionnaires rétiniennes sont les neurones qui transmettent l'information visuelle de la rétine au cerveau via le nerf optique, et leur nombre est estimé entre 1 et 1,5 million par œil."),
            en = LocalizedContent("How many retinal ganglion cells does the human eye have?", listOf("1-1.5 million", "500,000", "2-3 million", "5 million"), "Science", "Retinal ganglion cells are the neurons that transmit visual information from the retina to the brain via the optic nerve, and their number is estimated between 1 and 1.5 million per eye."),
            zh = LocalizedContent("人眼有多少个视网膜神经节细胞？", listOf("1-150万", "50万", "200-300万", "500万"), "科学", "视网膜神经节细胞是通过视神经将视觉信息从视网膜传递到大脑的神经元，每只眼睛的数量估计在100万到150万之间。"),
            es = LocalizedContent("¿Cuántas células ganglionares de la retina tiene el ojo humano?", listOf("1-1.5 millones", "500,000", "2-3 millones", "5 millones"), "Ciencia", "Las células ganglionares de la retina son las neuronas que transmiten la información visual desde la retina al cerebro a través del nervio óptico, y su número se estima entre 1 y 1.5 millones por ojo.")
        ),
        BilingualQuestion(
            id = 8831, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la visfatine?", listOf("Tissu adipeux", "Pancréas", "Estomac", "Foie"), "Science", "La visfatine est une adipokine, une hormone sécrétée principalement par le tissu adipeux (graisse), et non par une glande traditionnelle comme les glandes endocrines."),
            en = LocalizedContent("Which gland produces visfatin?", listOf("Adipose tissue", "Pancreas", "Stomach", "Liver"), "Science", "Visfatin is an adipokine, a hormone secreted mainly by adipose tissue (fat), not by a traditional gland like endocrine glands."),
            zh = LocalizedContent("哪种腺体产生内脂素？", listOf("脂肪组织", "胰腺", "胃", "肝脏"), "科学", "内脂素是一种脂肪因子，主要由脂肪组织分泌，而不是由传统的内分泌腺体分泌。"),
            es = LocalizedContent("¿Qué glándula produce la visfatina?", listOf("Tejido adiposo", "Páncreas", "Estómago", "Hígado"), "Ciencia", "La visfatina es una adipocina, una hormona secretada principalmente por el tejido adiposo (grasa), no por una glándula tradicional como las glándulas endocrinas.")
        ),
        BilingualQuestion(
            id = 8832, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand palais connu antérieurement?", listOf("Knossos", "Persépolis", "Versailles", "Alhambra"), "Science", "Le palais de Knossos, situé en Crète, est le plus grand palais connu de la civilisation minoenne, datant de l'âge du bronze."),
            en = LocalizedContent("What is the largest known palace from antiquity?", listOf("Knossos", "Persepolis", "Versailles", "Alhambra"), "Science", "The Palace of Knossos, located in Crete, is the largest known palace of the Minoan civilization, dating from the Bronze Age."),
            zh = LocalizedContent("古代已知最大的宫殿是什么？", listOf("克诺索斯", "波斯波利斯", "凡尔赛宫", "阿尔罕布拉宫"), "科学", "克诺索斯宫殿位于克里特岛，是米诺斯文明已知最大的宫殿，可追溯到青铜时代。"),
            es = LocalizedContent("¿Cuál es el palacio conocido más grande de la antigüedad?", listOf("Cnosos", "Persépolis", "Versalles", "Alhambra"), "Ciencia", "El palacio de Cnosos, ubicado en Creta, es el palacio más grande conocido de la civilización minoica, que data de la Edad del Bronce.")
        ),
        BilingualQuestion(
            id = 8833, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les matrices?", listOf("Arthur Cayley", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Arthur Cayley a formalisé le concept de matrice dans les années 1850, établissant les bases de l'algèbre matricielle moderne."),
            en = LocalizedContent("Which scientist discovered matrices?", listOf("Arthur Cayley", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Science", "Arthur Cayley formalized the concept of matrices in the 1850s, establishing the foundations of modern matrix algebra."),
            zh = LocalizedContent("哪位科学家发现了矩阵？", listOf("阿瑟·凯莱", "艾萨克·牛顿", "莱昂哈德·欧拉", "奥古斯丁-路易·柯西"), "科学", "阿瑟·凯莱在19世纪50年代正式提出了矩阵的概念，奠定了现代矩阵代数的基础。"),
            es = LocalizedContent("¿Qué científico descubrió las matrices?", listOf("Arthur Cayley", "Isaac Newton", "Leonhard Euler", "Augustin-Louis Cauchy"), "Ciencia", "Arthur Cayley formalizó el concepto de matrices en la década de 1850, estableciendo las bases del álgebra matricial moderna.")
        ),
        BilingualQuestion(
            id = 8834, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du résorcinol?", listOf("C6H4(OH)2", "C6H6O2", "C6H4O2", "C6H5OH"), "Science", "Le résorcinol est un composé organique de formule brute C6H4(OH)2, où deux groupes hydroxyle sont liés à un noyau benzénique. Ce symbole chimique représente sa structure précise."),
            en = LocalizedContent("What is the chemical symbol for resorcinol?", listOf("C6H4(OH)2", "C6H6O2", "C6H4O2", "C6H5OH"), "Science", "Resorcinol is an organic compound with the molecular formula C6H4(OH)2, where two hydroxyl groups are attached to a benzene ring. This chemical symbol represents its precise structure."),
            zh = LocalizedContent("间苯二酚的化学符号是什么？", listOf("C6H4(OH)2", "C6H6O2", "C6H4O2", "C6H5OH"), "科学", "间苯二酚是一种有机化合物，分子式为C6H4(OH)2，其中两个羟基连接在苯环上。这个化学符号代表了它的精确结构。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del resorcinol?", listOf("C6H4(OH)2", "C6H6O2", "C6H4O2", "C6H5OH"), "Ciencia", "El resorcinol es un compuesto orgánico con la fórmula molecular C6H4(OH)2, donde dos grupos hidroxilo están unidos a un anillo de benceno. Este símbolo químico representa su estructura precisa.")
        ),
        BilingualQuestion(
            id = 8835, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'acide citrique dans le plasma?", listOf("4-6 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "Science", "L'acide citrique est un intermédiaire du cycle de Krebs, et sa concentration plasmatique normale se situe entre 4 et 6 mg/100 mL, reflétant un métabolisme énergétique équilibré."),
            en = LocalizedContent("What is the concentration of citric acid in plasma?", listOf("4-6 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "Science", "Citric acid is an intermediate in the Krebs cycle, and its normal plasma concentration ranges between 4 and 6 mg/100 mL, reflecting balanced energy metabolism."),
            zh = LocalizedContent("血浆中柠檬酸的浓度是多少？", listOf("4-6毫克/100毫升", "1-3毫克/100毫升", "8-10毫克/100毫升", "10-12毫克/100毫升"), "科学", "柠檬酸是克雷布斯循环的中间产物，其正常血浆浓度在4-6毫克/100毫升之间，反映了平衡的能量代谢。"),
            es = LocalizedContent("¿Cuál es la concentración de ácido cítrico en el plasma?", listOf("4-6 mg/100 mL", "1-3 mg/100 mL", "8-10 mg/100 mL", "10-12 mg/100 mL"), "Ciencia", "El ácido cítrico es un intermediario del ciclo de Krebs, y su concentración plasmática normal se sitúa entre 4 y 6 mg/100 mL, reflejando un metabolismo energético equilibrado.")
        ),
        BilingualQuestion(
            id = 8836, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est paramagnétique?", listOf("Aluminium", "Cuivre", "Argent", "Or"), "Science", "L'aluminium possède un électron non apparié dans sa configuration électronique, ce qui le rend sensible aux champs magnétiques et donc paramagnétique."),
            en = LocalizedContent("Which chemical element is paramagnetic?", listOf("Aluminium", "Copper", "Silver", "Gold"), "Science", "Aluminium has an unpaired electron in its electron configuration, making it sensitive to magnetic fields and thus paramagnetic."),
            zh = LocalizedContent("哪种化学元素是顺磁性的？", listOf("铝", "铜", "银", "金"), "科学", "铝的电子构型中有一个未成对电子，使其对磁场敏感，因此具有顺磁性。"),
            es = LocalizedContent("¿Qué elemento químico es paramagnético?", listOf("Aluminio", "Cobre", "Plata", "Oro"), "Ciencia", "El aluminio tiene un electrón desapareado en su configuración electrónica, lo que lo hace sensible a los campos magnéticos y, por lo tanto, paramagnético.")
        ),
        BilingualQuestion(
            id = 8837, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'équation de Dirac?", listOf("Paul Dirac", "Werner Heisenberg", "Niels Bohr", "Max Planck"), "Science", "Paul Dirac a formulé cette équation en 1928 pour décrire les fermions relativistes, prédisant ainsi l'existence de l'antimatière."),
            en = LocalizedContent("Which scientist discovered the Dirac equation?", listOf("Paul Dirac", "Werner Heisenberg", "Niels Bohr", "Max Planck"), "Science", "Paul Dirac formulated this equation in 1928 to describe relativistic fermions, thus predicting the existence of antimatter."),
            zh = LocalizedContent("哪位科学家发现了狄拉克方程？", listOf("保罗·狄拉克", "维尔纳·海森堡", "尼尔斯·玻尔", "马克斯·普朗克"), "科学", "保罗·狄拉克于1928年提出了这个方程，用于描述相对论性费米子，从而预言了反物质的存在。"),
            es = LocalizedContent("¿Qué científico descubrió la ecuación de Dirac?", listOf("Paul Dirac", "Werner Heisenberg", "Niels Bohr", "Max Planck"), "Ciencia", "Paul Dirac formuló esta ecuación en 1928 para describir fermiones relativistas, prediciendo así la existencia de la antimateria.")
        ),
        BilingualQuestion(
            id = 8838, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de la pyrogallol?", listOf("C6H3(OH)3", "C6H6O3", "C6H4O3", "C6H5OH"), "Science", "La pyrogallol, un composé aromatique utilisé en photographie et comme antioxydant, a pour formule chimique C6H3(OH)3, indiquant un noyau benzénique avec trois groupes hydroxyle."),
            en = LocalizedContent("What is the chemical symbol for pyrogallol?", listOf("C6H3(OH)3", "C6H6O3", "C6H4O3", "C6H5OH"), "Science", "Pyrogallol, an aromatic compound used in photography and as an antioxidant, has the chemical formula C6H3(OH)3, indicating a benzene ring with three hydroxyl groups."),
            zh = LocalizedContent("焦性没食子酸的化学符号是什么？", listOf("C6H3(OH)3", "C6H6O3", "C6H4O3", "C6H5OH"), "科学", "焦性没食子酸是一种芳香族化合物，用于摄影和作为抗氧化剂，其化学式为C6H3(OH)3，表示一个苯环带有三个羟基。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del pirogalol?", listOf("C6H3(OH)3", "C6H6O3", "C6H4O3", "C6H5OH"), "Ciencia", "El pirogalol, un compuesto aromático utilizado en fotografía y como antioxidante, tiene la fórmula química C6H3(OH)3, que indica un anillo de benceno con tres grupos hidroxilo.")
        ),
        BilingualQuestion(
            id = 8839, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de neurotransmetteurs différents existent?", listOf("50-100", "10-20", "100-200", "200-300"), "Science", "Le nombre exact de neurotransmetteurs n'est pas fixé, mais on en recense généralement entre 50 et 100 dans le système nerveux humain."),
            en = LocalizedContent("How many different neurotransmitters exist?", listOf("50-100", "10-20", "100-200", "200-300"), "Science", "The exact number of neurotransmitters is not fixed, but generally between 50 and 100 are recognized in the human nervous system."),
            zh = LocalizedContent("存在多少种不同的神经递质？", listOf("50-100", "10-20", "100-200", "200-300"), "科学", "神经递质的确切数量尚未确定，但通常认为人类神经系统中存在50到100种。"),
            es = LocalizedContent("¿Cuántos neurotransmisores diferentes existen?", listOf("50-100", "10-20", "100-200", "200-300"), "Ciencia", "El número exacto de neurotransmisores no está fijado, pero generalmente se reconocen entre 50 y 100 en el sistema nervioso humano.")
        ),
        BilingualQuestion(
            id = 8840, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la vasopressine?", listOf("Hypophyse", "Pancréas", "Estomac", "Foie"), "Science", "La vasopressine est une hormone produite par l'hypothalamus, pas par le pancréas, qui sécrète l'insuline et le glucagon."),
            en = LocalizedContent("Which gland produces vasopressin?", listOf("Pituitary", "Pancreas", "Stomach", "Liver"), "Science", "Vasopressin is a hormone produced by the hypothalamus, not by the pancreas, which secretes insulin and glucagon."),
            zh = LocalizedContent("哪个腺体产生加压素？", listOf("垂体", "胰腺", "胃", "肝脏"), "科学", "加压素是由下丘脑产生的激素，而不是由分泌胰岛素和胰高血糖素的胰腺产生。"),
            es = LocalizedContent("¿Qué glándula produce la vasopresina?", listOf("Hipófisis", "Páncreas", "Estómago", "Hígado"), "Ciencia", "La vasopresina es una hormona producida por el hipotálamo, no por el páncreas, que secreta insulina y glucagón.")
        ),
        BilingualQuestion(
            id = 8841, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mur défensif antique?", listOf("Grande Muraille de Chine", "Mur d'Hadrien", "Mur d'Antonin", "Murs de Jéricho"), "Science", "La Grande Muraille de Chine, construite à partir du IIIe siècle avant J.-C., s'étend sur plus de 21 000 kilomètres, ce qui en fait la plus longue structure défensive jamais bâtie dans l'Antiquité."),
            en = LocalizedContent("What is the largest ancient defensive wall?", listOf("Great Wall of China", "Hadrian's Wall", "Antonine Wall", "Walls of Jericho"), "Science", "The Great Wall of China, built from the 3rd century BC, stretches over 21,000 kilometers, making it the longest defensive structure ever built in antiquity."),
            zh = LocalizedContent("最大的古代防御墙是什么？", listOf("中国长城", "哈德良长城", "安东尼长城", "耶利哥城墙"), "科学", "中国长城始建于公元前3世纪，绵延超过21,000公里，是古代建造的最长的防御结构。"),
            es = LocalizedContent("¿Cuál es el muro defensivo antiguo más grande?", listOf("Gran Muralla China", "Muro de Adriano", "Muro de Antonino", "Murallas de Jericó"), "Ciencia", "La Gran Muralla China, construida a partir del siglo III a.C., se extiende por más de 21,000 kilómetros, lo que la convierte en la estructura defensiva más larga jamás construida en la antigüedad.")
        ),
        BilingualQuestion(
            id = 8842, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le spineur?", listOf("Wolfgang Pauli", "Paul Dirac", "Werner Heisenberg", "Max Planck"), "Science", "Wolfgang Pauli a introduit le concept de spineur en 1927 pour décrire le spin des particules en mécanique quantique, ce qui a permis de formuler l'équation de Pauli."),
            en = LocalizedContent("Which scientist discovered the spinor?", listOf("Wolfgang Pauli", "Paul Dirac", "Werner Heisenberg", "Max Planck"), "Science", "Wolfgang Pauli introduced the concept of spinor in 1927 to describe the spin of particles in quantum mechanics, which allowed the formulation of the Pauli equation."),
            zh = LocalizedContent("哪位科学家发现了旋量？", listOf("沃尔夫冈·泡利", "保罗·狄拉克", "维尔纳·海森堡", "马克斯·普朗克"), "科学", "沃尔夫冈·泡利于1927年引入了旋量的概念，用于描述量子力学中粒子的自旋，从而能够推导出泡利方程。"),
            es = LocalizedContent("¿Qué científico descubrió el espinor?", listOf("Wolfgang Pauli", "Paul Dirac", "Werner Heisenberg", "Max Planck"), "Ciencia", "Wolfgang Pauli introdujo el concepto de espinor en 1927 para describir el espín de las partículas en mecánica cuántica, lo que permitió formular la ecuación de Pauli.")
        ),
        BilingualQuestion(
            id = 8843, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzisoxazole?", listOf("C7H5NO", "C7H6NO", "C7H4NO", "C7H7NO"), "Science", "Le benzisoxazole est un composé organique hétérocyclique contenant sept atomes de carbone, cinq d'hydrogène, un d'azote et un d'oxygène, d'où sa formule brute C7H5NO."),
            en = LocalizedContent("What is the chemical symbol of benzisoxazole?", listOf("C7H5NO", "C7H6NO", "C7H4NO", "C7H7NO"), "Science", "Benzisoxazole is a heterocyclic organic compound containing seven carbon atoms, five hydrogen atoms, one nitrogen atom, and one oxygen atom, hence its molecular formula C7H5NO."),
            zh = LocalizedContent("苯并异噁唑的化学式是什么？", listOf("C7H5NO", "C7H6NO", "C7H4NO", "C7H7NO"), "科学", "苯并异噁唑是一种杂环有机化合物，含有七个碳原子、五个氢原子、一个氮原子和一个氧原子，因此其分子式为C7H5NO。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del benzisoxazol?", listOf("C7H5NO", "C7H6NO", "C7H4NO", "C7H7NO"), "Ciencia", "El benzisoxazol es un compuesto orgánico heterocíclico que contiene siete átomos de carbono, cinco de hidrógeno, uno de nitrógeno y uno de oxígeno, de ahí su fórmula molecular C7H5NO.")
        ),
        BilingualQuestion(
            id = 8844, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'acide pyruvique dans le plasma?", listOf("0.5-1.5 mg/100 mL", "0.1-0.5 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "Science", "L'acide pyruvique est un intermédiaire clé du métabolisme glucidique, et sa concentration plasmatique normale se situe entre 0,5 et 1,5 mg/100 mL, reflétant l'équilibre entre production et utilisation cellulaire."),
            en = LocalizedContent("What is the concentration of pyruvic acid in plasma?", listOf("0.5-1.5 mg/100 mL", "0.1-0.5 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "Science", "Pyruvic acid is a key intermediate in carbohydrate metabolism, and its normal plasma concentration ranges between 0.5 and 1.5 mg/100 mL, reflecting the balance between production and cellular utilization."),
            zh = LocalizedContent("血浆中丙酮酸的浓度是多少？", listOf("0.5-1.5 mg/100 mL", "0.1-0.5 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "科学", "丙酮酸是碳水化合物代谢的关键中间体，其正常血浆浓度在0.5至1.5 mg/100 mL之间，反映了生成与细胞利用之间的平衡。"),
            es = LocalizedContent("¿Cuál es la concentración de ácido pirúvico en el plasma?", listOf("0.5-1.5 mg/100 mL", "0.1-0.5 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "Ciencia", "El ácido pirúvico es un intermediario clave en el metabolismo de los carbohidratos, y su concentración plasmática normal se sitúa entre 0,5 y 1,5 mg/100 mL, reflejando el equilibrio entre producción y utilización celular.")
        ),
        BilingualQuestion(
            id = 8845, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est diamagnétique?", listOf("Bismuth", "Aluminium", "Cuivre", "Fer"), "Science", "Le bismuth est l'élément le plus diamagnétique connu, repoussant les champs magnétiques. Cette propriété vient de sa structure électronique sans électrons non appariés."),
            en = LocalizedContent("Which chemical element is diamagnetic?", listOf("Bismuth", "Aluminium", "Copper", "Iron"), "Science", "Bismuth is the most diamagnetic element known, repelling magnetic fields. This property comes from its electronic structure with no unpaired electrons."),
            zh = LocalizedContent("哪种化学元素是抗磁性的？", listOf("铋", "铝", "铜", "铁"), "科学", "铋是已知抗磁性最强的元素，能排斥磁场。这一特性源于其电子结构中没有未配对电子。"),
            es = LocalizedContent("¿Qué elemento químico es diamagnético?", listOf("Bismuto", "Aluminio", "Cobre", "Hierro"), "Ciencia", "El bismuto es el elemento más diamagnético conocido, repeliendo los campos magnéticos. Esta propiedad proviene de su estructura electrónica sin electrones desapareados.")
        ),
        BilingualQuestion(
            id = 8846, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le groupe de Lorentz?", listOf("Hendrik Lorentz", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Le groupe de Lorentz, nommé d'après le physicien néerlandais Hendrik Lorentz, est un groupe de transformations mathématiques qui décrit comment les mesures de l'espace et du temps changent entre deux référentiels en mouvement relatif."),
            en = LocalizedContent("Which scientist discovered the Lorentz group?", listOf("Hendrik Lorentz", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The Lorentz group, named after the Dutch physicist Hendrik Lorentz, is a group of mathematical transformations that describe how measurements of space and time change between two reference frames in relative motion."),
            zh = LocalizedContent("哪位科学家发现了洛伦兹群？", listOf("亨德里克·洛伦兹", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "洛伦兹群以荷兰物理学家亨德里克·洛伦兹命名，是一组数学变换，描述空间和时间测量在两个相对运动的参考系之间如何变化。"),
            es = LocalizedContent("¿Qué científico descubrió el grupo de Lorentz?", listOf("Hendrik Lorentz", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "El grupo de Lorentz, nombrado en honor al físico neerlandés Hendrik Lorentz, es un grupo de transformaciones matemáticas que describe cómo las mediciones del espacio y el tiempo cambian entre dos marcos de referencia en movimiento relativo.")
        ),
        BilingualQuestion(
            id = 8847, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du coumarine?", listOf("C9H6O2", "C9H8O2", "C9H4O2", "C9H10O2"), "Science", "La coumarine est un composé organique de formule brute C9H6O2, présente dans certaines plantes comme la fève tonka."),
            en = LocalizedContent("What is the chemical symbol of coumarin?", listOf("C9H6O2", "C9H8O2", "C9H4O2", "C9H10O2"), "Science", "Coumarin is an organic compound with the molecular formula C9H6O2, found in some plants such as the tonka bean."),
            zh = LocalizedContent("香豆素的化学式是什么？", listOf("C9H6O2", "C9H8O2", "C9H4O2", "C9H10O2"), "科学", "香豆素是一种有机化合物，分子式为C9H6O2，存在于某些植物中，如零陵香豆。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la cumarina?", listOf("C9H6O2", "C9H8O2", "C9H4O2", "C9H10O2"), "Ciencia", "La cumarina es un compuesto orgánico de fórmula molecular C9H6O2, presente en algunas plantas como el haba tonka.")
        ),
        BilingualQuestion(
            id = 8848, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'acides aminés essentiels y a-t-il?", listOf("9", "5", "15", "20"), "Science", "Sur les 20 acides aminés standards, 9 sont dits essentiels car le corps humain ne peut pas les synthétiser et doit les obtenir par l'alimentation."),
            en = LocalizedContent("How many essential amino acids are there?", listOf("9", "5", "15", "20"), "Science", "Of the 20 standard amino acids, 9 are considered essential because the human body cannot synthesize them and must obtain them from the diet."),
            zh = LocalizedContent("有多少种必需氨基酸？", listOf("9", "5", "15", "20"), "科学", "在20种标准氨基酸中，有9种被认为是必需的，因为人体无法合成它们，必须从饮食中获取。"),
            es = LocalizedContent("¿Cuántos aminoácidos esenciales hay?", listOf("9", "5", "15", "20"), "Ciencia", "De los 20 aminoácidos estándar, 9 se consideran esenciales porque el cuerpo humano no puede sintetizarlos y debe obtenerlos de la dieta.")
        ),
        BilingualQuestion(
            id = 8849, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gland produit la prolactine?", listOf("Hypophyse", "Pancréas", "Estomac", "Foie"), "Science", "L'hypophyse, glande endocrine située à la base du cerveau, sécrète la prolactine, une hormone essentielle à la lactation."),
            en = LocalizedContent("Which gland produces prolactin?", listOf("Pituitary", "Pancreas", "Stomach", "Liver"), "Science", "The pituitary gland, an endocrine gland located at the base of the brain, secretes prolactin, a hormone essential for lactation."),
            zh = LocalizedContent("哪个腺体产生催乳素？", listOf("垂体", "胰腺", "胃", "肝脏"), "科学", "垂体是位于大脑底部的内分泌腺，分泌催乳素，这是一种对哺乳至关重要的激素。"),
            es = LocalizedContent("¿Qué glándula produce la prolactina?", listOf("Hipófisis", "Páncreas", "Estómago", "Hígado"), "Ciencia", "La hipófisis, una glándula endocrina situada en la base del cerebro, secreta prolactina, una hormona esencial para la lactancia.")
        ),
        BilingualQuestion(
            id = 8850, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pont-aqueduc romain?", listOf("Pont du Gard", "Aqueduc de Nîmes", "Pont de Alcántara", "Pont Aelianus"), "Science", "Le Pont du Gard, situé dans le sud de la France, est le plus haut pont-aqueduc romain conservé, culminant à près de 49 mètres. Il faisait partie d'un système de 50 km acheminant l'eau vers Nîmes."),
            en = LocalizedContent("What is the largest Roman aqueduct bridge?", listOf("Pont du Gard", "Aqueduct of Nîmes", "Alcántara Bridge", "Aelianus Bridge"), "Science", "The Pont du Gard, located in southern France, is the tallest preserved Roman aqueduct bridge, reaching nearly 49 meters. It was part of a 50 km system that carried water to Nîmes."),
            zh = LocalizedContent("最大的罗马高架引水桥是什么？", listOf("加尔桥", "尼姆引水渠", "阿尔坎塔拉桥", "埃利亚努斯桥"), "科学", "加尔桥位于法国南部，是保存最完好的罗马高架引水桥，最高处近49米。它是长达50公里的引水系统的一部分，将水输送到尼姆。"),
            es = LocalizedContent("¿Cuál es el puente acueducto romano más grande?", listOf("Puente del Gard", "Acueducto de Nîmes", "Puente de Alcántara", "Puente Aelianus"), "Ciencia", "El Puente del Gard, situado en el sur de Francia, es el puente acueducto romano conservado más alto, con casi 49 metros. Formaba parte de un sistema de 50 km que llevaba agua a Nîmes.")
        ),
        BilingualQuestion(
            id = 8851, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la symétrie de jauge?", listOf("Yang et Mills", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Chen Ning Yang et Robert Mills ont formulé la théorie de la symétrie de jauge non abélienne en 1954, jetant les bases du modèle standard de la physique des particules."),
            en = LocalizedContent("Which scientist discovered gauge symmetry?", listOf("Yang and Mills", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Chen Ning Yang and Robert Mills formulated the theory of non-abelian gauge symmetry in 1954, laying the foundation for the standard model of particle physics."),
            zh = LocalizedContent("哪位科学家发现了规范对称性？", listOf("杨振宁和米尔斯", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "杨振宁和罗伯特·米尔斯于1954年提出了非阿贝尔规范对称性理论，为粒子物理标准模型奠定了基础。"),
            es = LocalizedContent("¿Qué científico descubrió la simetría de gauge?", listOf("Yang y Mills", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Chen Ning Yang y Robert Mills formularon la teoría de la simetría de gauge no abeliana en 1954, sentando las bases del modelo estándar de la física de partículas.")
        ),
        BilingualQuestion(
            id = 8852, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du quinoline?", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "Science", "La quinoléine est un composé organique hétérocyclique de formule brute C9H7N, contenant un cycle benzénique fusionné à une pyridine."),
            en = LocalizedContent("What is the chemical symbol for quinoline?", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "Science", "Quinoline is a heterocyclic organic compound with the molecular formula C9H7N, containing a benzene ring fused to a pyridine."),
            zh = LocalizedContent("喹啉的化学式是什么？", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "科学", "喹啉是一种杂环有机化合物，分子式为C9H7N，含有一个苯环与吡啶稠合。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la quinolina?", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "Ciencia", "La quinolina es un compuesto orgánico heterocíclico con fórmula molecular C9H7N, que contiene un anillo de benceno fusionado a una piridina.")
        ),
        BilingualQuestion(
            id = 8853, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'acide lactique dans le plasma?", listOf("0.5-2.0 mg/100 mL", "0.1-0.5 mg/100 mL", "3-4 mg/100 mL", "4-5 mg/100 mL"), "Science", "L'acide lactique est un produit du métabolisme anaérobie, et sa concentration plasmatique normale à jeun se situe entre 0,5 et 2,0 mg/100 mL, reflétant l'équilibre entre production et élimination."),
            en = LocalizedContent("What is the concentration of lactic acid in plasma?", listOf("0.5-2.0 mg/100 mL", "0.1-0.5 mg/100 mL", "3-4 mg/100 mL", "4-5 mg/100 mL"), "Science", "Lactic acid is a product of anaerobic metabolism, and its normal fasting plasma concentration is between 0.5 and 2.0 mg/100 mL, reflecting the balance between production and elimination."),
            zh = LocalizedContent("血浆中乳酸的浓度是多少？", listOf("0.5-2.0 mg/100 mL", "0.1-0.5 mg/100 mL", "3-4 mg/100 mL", "4-5 mg/100 mL"), "科学", "乳酸是无氧代谢的产物，其正常空腹血浆浓度在0.5至2.0 mg/100 mL之间，反映了产生与清除的平衡。"),
            es = LocalizedContent("¿Cuál es la concentración de ácido láctico en el plasma?", listOf("0.5-2.0 mg/100 mL", "0.1-0.5 mg/100 mL", "3-4 mg/100 mL", "4-5 mg/100 mL"), "Ciencia", "El ácido láctico es un producto del metabolismo anaeróbico, y su concentración plasmática normal en ayunas se sitúa entre 0,5 y 2,0 mg/100 mL, reflejando el equilibrio entre producción y eliminación.")
        ),
        BilingualQuestion(
            id = 8854, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est supraconducteur à basse température?", listOf("Yttrium", "Cuivre", "Argent", "Or"), "Science", "L'yttrium, combiné avec du baryum et du cuivre, forme un oxyde céramique qui devient supraconducteur à une température relativement élevée pour ce type de matériau, soit autour de 93 K (-180 °C)."),
            en = LocalizedContent("Which chemical element is superconducting at low temperature?", listOf("Yttrium", "Copper", "Silver", "Gold"), "Science", "Yttrium, combined with barium and copper, forms a ceramic oxide that becomes superconducting at a relatively high temperature for this type of material, around 93 K (-180 °C)."),
            zh = LocalizedContent("哪种化学元素在低温下具有超导性？", listOf("钇", "铜", "银", "金"), "科学", "钇与钡和铜结合形成一种陶瓷氧化物，在相对较高的温度（约93 K，即-180 °C）下成为超导体。"),
            es = LocalizedContent("¿Qué elemento químico es superconductor a baja temperatura?", listOf("Itrio", "Cobre", "Plata", "Oro"), "Ciencia", "El itrio, combinado con bario y cobre, forma un óxido cerámico que se vuelve superconductor a una temperatura relativamente alta para este tipo de material, alrededor de 93 K (-180 °C).")
        ),
        BilingualQuestion(
            id = 8855, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert le modèle standard?", listOf("Sheldon Glashow, Abdus Salam et Steven Weinberg", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Sheldon Glashow, Abdus Salam et Steven Weinberg ont indépendamment formulé la théorie électrofaible, unifiant les forces électromagnétique et faible, ce qui leur a valu le prix Nobel de physique en 1979. Leurs travaux ont jeté les bases du modèle standard de la physique des particules."),
            en = LocalizedContent("Which scientist discovered the Standard Model?", listOf("Sheldon Glashow, Abdus Salam and Steven Weinberg", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Sheldon Glashow, Abdus Salam and Steven Weinberg independently formulated the electroweak theory, unifying the electromagnetic and weak forces, which earned them the Nobel Prize in Physics in 1979. Their work laid the foundation for the Standard Model of particle physics."),
            zh = LocalizedContent("哪位科学家发现了标准模型？", listOf("谢尔登·格拉肖、阿卜杜斯·萨拉姆和史蒂文·温伯格", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "谢尔登·格拉肖、阿卜杜斯·萨拉姆和史蒂文·温伯格独立提出了电弱理论，统一了电磁力和弱力，并因此获得1979年诺贝尔物理学奖。他们的工作为粒子物理标准模型奠定了基础。"),
            es = LocalizedContent("¿Qué científico descubrió el Modelo Estándar?", listOf("Sheldon Glashow, Abdus Salam y Steven Weinberg", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Sheldon Glashow, Abdus Salam y Steven Weinberg formularon independientemente la teoría electrodébil, unificando las fuerzas electromagnética y débil, lo que les valió el Premio Nobel de Física en 1979. Su trabajo sentó las bases del Modelo Estándar de la física de partículas.")
        ),
        BilingualQuestion(
            id = 8856, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'isoquinoline?", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "Science", "L'isoquinoline est un composé organique hétérocyclique de formule brute C9H7N, indiquant la présence de 9 atomes de carbone, 7 d'hydrogène et 1 d'azote."),
            en = LocalizedContent("What is the chemical symbol for isoquinoline?", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "Science", "Isoquinoline is a heterocyclic organic compound with the molecular formula C9H7N, indicating 9 carbon atoms, 7 hydrogen atoms, and 1 nitrogen atom."),
            zh = LocalizedContent("异喹啉的化学式是什么？", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "科学", "异喹啉是一种杂环有机化合物，分子式为C9H7N，表示含有9个碳原子、7个氢原子和1个氮原子。"),
            es = LocalizedContent("¿Cuál es el símbolo químico de la isoquinolina?", listOf("C9H7N", "C9H8N", "C9H5N", "C9H9N"), "Ciencia", "La isoquinolina es un compuesto orgánico heterocíclico con fórmula molecular C9H7N, que indica 9 átomos de carbono, 7 de hidrógeno y 1 de nitrógeno.")
        ),
        BilingualQuestion(
            id = 8857, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de paires de ganglions spinaux a un humain?", listOf("31", "30", "32", "25"), "Science", "Chaque paire de ganglions spinaux correspond à une paire de nerfs rachidiens, et l'humain en possède 31 paires."),
            en = LocalizedContent("How many pairs of spinal ganglia does a human have?", listOf("31", "30", "32", "25"), "Science", "Each pair of spinal ganglia corresponds to a pair of spinal nerves, and humans have 31 pairs."),
            zh = LocalizedContent("人类有多少对脊神经节？", listOf("31", "30", "32", "25"), "科学", "每对脊神经节对应一对脊神经，人类有31对。"),
            es = LocalizedContent("¿Cuántos pares de ganglios espinales tiene un humano?", listOf("31", "30", "32", "25"), "Ciencia", "Cada par de ganglios espinales corresponde a un par de nervios espinales, y los humanos tienen 31 pares.")
        ),
        BilingualQuestion(
            id = 8858, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le GnRH?", listOf("Hypothalamus", "Hypophyse", "Pancréas", "Foie"), "Science", "L'hypothalamus produit la GnRH, une hormone qui stimule l'hypophyse pour réguler la reproduction."),
            en = LocalizedContent("Which gland produces GnRH?", listOf("Hypothalamus", "Pituitary", "Pancreas", "Liver"), "Science", "The hypothalamus produces GnRH, a hormone that stimulates the pituitary to regulate reproduction."),
            zh = LocalizedContent("哪个腺体产生促性腺激素释放激素（GnRH）？", listOf("下丘脑", "垂体", "胰腺", "肝脏"), "科学", "下丘脑产生GnRH，这种激素刺激垂体调节生殖功能。"),
            es = LocalizedContent("¿Qué glándula produce GnRH?", listOf("Hipotálamo", "Hipófisis", "Páncreas", "Hígado"), "Ciencia", "El hipotálamo produce GnRH, una hormona que estimula la hipófisis para regular la reproducción.")
        ),
        BilingualQuestion(
            id = 8859, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand arc de triomphe romain?", listOf("Arc de Septime Sévère", "Arc de Titus", "Arc de Trajan", "Arc de Constantin"), "Science", "L'Arc de Septime Sévère, situé sur le Forum romain, mesure 23 mètres de haut, ce qui en fait le plus grand arc de triomphe romain conservé. Il a été érigé en 203 après J.-C. pour célébrer les victoires de l'empereur Septime Sévère et de ses fils."),
            en = LocalizedContent("What is the largest Roman triumphal arch?", listOf("Arch of Septimius Severus", "Arch of Titus", "Arch of Trajan", "Arch of Constantine"), "Science", "The Arch of Septimius Severus, located in the Roman Forum, is 23 meters high, making it the largest preserved Roman triumphal arch. It was erected in 203 AD to celebrate the victories of Emperor Septimius Severus and his sons."),
            zh = LocalizedContent("最大的罗马凯旋门是什么？", listOf("塞普蒂米乌斯·塞维鲁凯旋门", "提图斯凯旋门", "图拉真凯旋门", "君士坦丁凯旋门"), "科学", "塞普蒂米乌斯·塞维鲁凯旋门位于罗马广场，高23米，是保存最完好的最大罗马凯旋门。它建于公元203年，以纪念塞普蒂米乌斯·塞维鲁皇帝及其儿子的胜利。"),
            es = LocalizedContent("¿Cuál es el arco de triunfo romano más grande?", listOf("Arco de Septimio Severo", "Arco de Tito", "Arco de Trajano", "Arco de Constantino"), "Ciencia", "El Arco de Septimio Severo, situado en el Foro Romano, mide 23 metros de altura, lo que lo convierte en el arco de triunfo romano conservado más grande. Fue erigido en el año 203 d.C. para celebrar las victorias del emperador Septimio Severo y sus hijos.")
        ),
        BilingualQuestion(
            id = 8860, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la gravité quantique?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La gravité quantique est un domaine théorique de la physique qui n'a pas encore été découvert ou confirmé expérimentalement, ce qui explique pourquoi la réponse est \"théorique\"."),
            en = LocalizedContent("Which scientist discovered quantum gravity?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Quantum gravity is a theoretical field of physics that has not yet been discovered or experimentally confirmed, which is why the answer is \"theoretical\"."),
            zh = LocalizedContent("哪位科学家发现了量子引力？", listOf("理论性的", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "量子引力是一个理论物理学领域，尚未被发现或实验证实，因此答案是“理论性的”。"),
            es = LocalizedContent("¿Qué científico descubrió la gravedad cuántica?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La gravedad cuántica es un campo teórico de la física que aún no ha sido descubierto o confirmado experimentalmente, por lo que la respuesta es \"teórico\".")
        ),
        BilingualQuestion(
            id = 8861, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'indole?", listOf("C8H7N", "C8H8N", "C8H5N", "C8H9N"), "Science", "L'indole est un composé organique hétérocyclique dont la formule brute est C8H7N, ce qui signifie qu'il contient 8 atomes de carbone, 7 d'hydrogène et 1 d'azote."),
            en = LocalizedContent("What is the chemical symbol for indole?", listOf("C8H7N", "C8H8N", "C8H5N", "C8H9N"), "Science", "Indole is a heterocyclic organic compound with the molecular formula C8H7N, meaning it contains 8 carbon atoms, 7 hydrogen atoms, and 1 nitrogen atom."),
            zh = LocalizedContent("吲哚的化学符号是什么？", listOf("C8H7N", "C8H8N", "C8H5N", "C8H9N"), "科学", "吲哚是一种杂环有机化合物，分子式为C8H7N，含有8个碳原子、7个氢原子和1个氮原子。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del indol?", listOf("C8H7N", "C8H8N", "C8H5N", "C8H9N"), "Ciencia", "El indol es un compuesto orgánico heterocíclico con fórmula molecular C8H7N, que contiene 8 átomos de carbono, 7 de hidrógeno y 1 de nitrógeno.")
        ),
        BilingualQuestion(
            id = 8862, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'aldolase dans le plasma?", listOf("0-3 UI/L", "10-20 UI/L", "50-100 UI/L", "100-200 UI/L"), "Science", "L'aldolase est une enzyme impliquée dans la glycolyse, principalement présente dans les muscles et le foie. Sa concentration plasmatique normale est très faible, entre 0 et 3 UI/L, car elle n'est libérée dans le sang qu'en cas de lésion tissulaire."),
            en = LocalizedContent("What is the concentration of aldolase in plasma?", listOf("0-3 IU/L", "10-20 IU/L", "50-100 IU/L", "100-200 IU/L"), "Science", "Aldolase is an enzyme involved in glycolysis, mainly present in muscles and liver. Its normal plasma concentration is very low, between 0 and 3 IU/L, as it is only released into the blood upon tissue damage."),
            zh = LocalizedContent("血浆中醛缩酶的浓度是多少？", listOf("0-3 IU/L", "10-20 IU/L", "50-100 IU/L", "100-200 IU/L"), "科学", "醛缩酶是一种参与糖酵解的酶，主要存在于肌肉和肝脏中。其正常血浆浓度非常低，介于0到3 IU/L之间，因为只有在组织损伤时才会释放到血液中。"),
            es = LocalizedContent("¿Cuál es la concentración de aldolasa en el plasma?", listOf("0-3 UI/L", "10-20 UI/L", "50-100 UI/L", "100-200 UI/L"), "Ciencia", "La aldolasa es una enzima involucrada en la glucólisis, presente principalmente en músculos e hígado. Su concentración plasmática normal es muy baja, entre 0 y 3 UI/L, ya que solo se libera a la sangre en caso de daño tisular.")
        ),
        BilingualQuestion(
            id = 8863, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est un isolant électrique?", listOf("Quartz", "Cuivre", "Argent", "Or"), "Science", "Le quartz est un isolant électrique car il est composé de dioxyde de silicium, une structure cristalline qui ne laisse pas passer les électrons."),
            en = LocalizedContent("Which chemical element is an electrical insulator?", listOf("Quartz", "Copper", "Silver", "Gold"), "Science", "Quartz is an electrical insulator because it is composed of silicon dioxide, a crystalline structure that does not allow electrons to pass through."),
            zh = LocalizedContent("哪种化学元素是电绝缘体？", listOf("石英", "铜", "银", "金"), "科学", "石英是一种电绝缘体，因为它由二氧化硅组成，是一种不允许电子通过的晶体结构。"),
            es = LocalizedContent("¿Qué elemento químico es un aislante eléctrico?", listOf("Cuarzo", "Cobre", "Plata", "Oro"), "Ciencia", "El cuarzo es un aislante eléctrico porque está compuesto de dióxido de silicio, una estructura cristalina que no permite el paso de electrones.")
        ),
        BilingualQuestion(
            id = 8864, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la SUSY?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La supersymétrie (SUSY) est une théorie physique qui n'a pas encore été confirmée expérimentalement, donc aucun scientifique unique ne l'a découverte ; elle a été développée par plusieurs théoriciens dans les années 1970."),
            en = LocalizedContent("Which scientist discovered SUSY?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Supersymmetry (SUSY) is a physical theory that has not yet been experimentally confirmed, so no single scientist discovered it; it was developed by several theorists in the 1970s."),
            zh = LocalizedContent("哪位科学家发现了超对称（SUSY）？", listOf("理论性的", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "超对称（SUSY）是一种尚未被实验证实的物理理论，因此没有单一科学家发现它；它是由几位理论家在20世纪70年代发展起来的。"),
            es = LocalizedContent("¿Qué científico descubrió la SUSY?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La supersimetría (SUSY) es una teoría física que aún no ha sido confirmada experimentalmente, por lo que ningún científico único la descubrió; fue desarrollada por varios teóricos en la década de 1970.")
        ),
        BilingualQuestion(
            id = 8865, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du carbazole?", listOf("C12H9N", "C12H8N", "C12H10N", "C12H11N"), "Science", "Le carbazole est un composé organique hétérocyclique, sa formule brute est C12H9N, indiquant 12 atomes de carbone, 9 d'hydrogène et 1 d'azote."),
            en = LocalizedContent("What is the chemical symbol for carbazole?", listOf("C12H9N", "C12H8N", "C12H10N", "C12H11N"), "Science", "Carbazole is a heterocyclic organic compound with the molecular formula C12H9N, indicating 12 carbon atoms, 9 hydrogen atoms, and 1 nitrogen atom."),
            zh = LocalizedContent("咔唑的化学符号是什么？", listOf("C12H9N", "C12H8N", "C12H10N", "C12H11N"), "科学", "咔唑是一种杂环有机化合物，分子式为C12H9N，含有12个碳原子、9个氢原子和1个氮原子。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del carbazol?", listOf("C12H9N", "C12H8N", "C12H10N", "C12H11N"), "Ciencia", "El carbazol es un compuesto orgánico heterocíclico con fórmula molecular C12H9N, que indica 12 átomos de carbono, 9 de hidrógeno y 1 de nitrógeno.")
        ),
        BilingualQuestion(
            id = 8866, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de ganglions lymphatiques a le corps humain?", listOf("600-700", "300-400", "800-900", "1000-1100"), "Science", "Le corps humain contient entre 600 et 700 ganglions lymphatiques, répartis principalement dans le cou, les aisselles et l'aine, jouant un rôle clé dans la filtration de la lymphe et la défense immunitaire."),
            en = LocalizedContent("How many lymph nodes does the human body have?", listOf("600-700", "300-400", "800-900", "1000-1100"), "Science", "The human body contains between 600 and 700 lymph nodes, mainly distributed in the neck, armpits, and groin, playing a key role in filtering lymph and immune defense."),
            zh = LocalizedContent("人体有多少个淋巴结？", listOf("600-700", "300-400", "800-900", "1000-1100"), "科学", "人体含有600到700个淋巴结，主要分布在颈部、腋窝和腹股沟，在过滤淋巴和免疫防御中起关键作用。"),
            es = LocalizedContent("¿Cuántos ganglios linfáticos tiene el cuerpo humano?", listOf("600-700", "300-400", "800-900", "1000-1100"), "Ciencia", "El cuerpo humano contiene entre 600 y 700 ganglios linfáticos, distribuidos principalmente en el cuello, las axilas y la ingle, desempeñando un papel clave en la filtración de la linfa y la defensa inmunitaria.")
        ),
        BilingualQuestion(
            id = 8867, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le CRH?", listOf("Hypothalamus", "Hypophyse", "Pancréas", "Foie"), "Science", "Le CRH (corticotropin-releasing hormone) est une hormone produite par l'hypothalamus pour réguler la réponse au stress et stimuler l'hypophyse."),
            en = LocalizedContent("Which gland produces CRH?", listOf("Hypothalamus", "Pituitary", "Pancreas", "Liver"), "Science", "CRH (corticotropin-releasing hormone) is a hormone produced by the hypothalamus to regulate the stress response and stimulate the pituitary gland."),
            zh = LocalizedContent("哪个腺体产生CRH？", listOf("下丘脑", "垂体", "胰腺", "肝脏"), "科学", "CRH（促肾上腺皮质激素释放激素）是由下丘脑产生的一种激素，用于调节应激反应并刺激垂体。"),
            es = LocalizedContent("¿Qué glándula produce la CRH?", listOf("Hipotálamo", "Hipófisis", "Páncreas", "Hígado"), "Ciencia", "La CRH (hormona liberadora de corticotropina) es una hormona producida por el hipotálamo para regular la respuesta al estrés y estimular la hipófisis.")
        ),
        BilingualQuestion(
            id = 8868, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand cirque romain connu?", listOf("Circus Maximus", "Circus Flaminius", "Colosseum", "Theater Marcellus"), "Science", "Le Circus Maximus, situé entre les collines du Palatin et de l'Aventin à Rome, était le plus grand cirque romain, pouvant accueillir jusqu'à 250 000 spectateurs pour des courses de chars."),
            en = LocalizedContent("What is the largest known Roman circus?", listOf("Circus Maximus", "Circus Flaminius", "Colosseum", "Theater of Marcellus"), "Science", "The Circus Maximus, located between the Palatine and Aventine hills in Rome, was the largest Roman circus, capable of holding up to 250,000 spectators for chariot races."),
            zh = LocalizedContent("已知最大的罗马竞技场是什么？", listOf("马克西穆斯竞技场", "弗拉米尼乌斯竞技场", "罗马斗兽场", "马塞卢斯剧院"), "科学", "马克西穆斯竞技场位于罗马的帕拉蒂尼山和阿文提诺山之间，是最大的罗马竞技场，可容纳多达25万名观众观看战车比赛。"),
            es = LocalizedContent("¿Cuál es el circo romano más grande conocido?", listOf("Circo Máximo", "Circo Flaminio", "Coliseo", "Teatro de Marcelo"), "Ciencia", "El Circo Máximo, ubicado entre las colinas Palatina y Aventina en Roma, era el circo romano más grande, con capacidad para hasta 250,000 espectadores para carreras de carros.")
        ),
        BilingualQuestion(
            id = 8869, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les cordes de supergravité?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les cordes de supergravité sont un concept de la physique théorique, proposé dans les années 1970 par des chercheurs comme John Schwarz et Joël Scherk, dans le cadre de la théorie des cordes."),
            en = LocalizedContent("Which scientist discovered supergravity strings?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Supergravity strings are a concept in theoretical physics, proposed in the 1970s by researchers such as John Schwarz and Joël Scherk, within the framework of string theory."),
            zh = LocalizedContent("哪位科学家发现了超引力弦？", listOf("理论性的", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "超引力弦是理论物理学中的一个概念，由约翰·施瓦茨和乔尔·谢尔克等研究人员在20世纪70年代在弦理论框架下提出。"),
            es = LocalizedContent("¿Qué científico descubrió las cuerdas de supergravedad?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Las cuerdas de supergravedad son un concepto de la física teórica, propuesto en la década de 1970 por investigadores como John Schwarz y Joël Scherk, en el marco de la teoría de cuerdas.")
        ),
        BilingualQuestion(
            id = 8870, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du dibenzothiophène?", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "Science", "Le dibenzothiophène est un composé organique soufré dont la formule chimique est C12H8S, indiquant 12 atomes de carbone, 8 d'hydrogène et 1 de soufre."),
            en = LocalizedContent("What is the chemical symbol of dibenzothiophene?", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "Science", "Dibenzothiophene is an organosulfur compound with the chemical formula C12H8S, indicating 12 carbon atoms, 8 hydrogen atoms, and 1 sulfur atom."),
            zh = LocalizedContent("二苯并噻吩的化学符号是什么？", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "科学", "二苯并噻吩是一种有机硫化合物，化学式为C12H8S，表示12个碳原子、8个氢原子和1个硫原子。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del dibenzotiofeno?", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "Ciencia", "El dibenzotiofeno es un compuesto orgánico de azufre con fórmula química C12H8S, que indica 12 átomos de carbono, 8 de hidrógeno y 1 de azufre.")
        ),
        BilingualQuestion(
            id = 8871, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'amylase dans le plasma?", listOf("30-110 UI/L", "10-30 UI/L", "150-200 UI/L", "200-300 UI/L"), "Science", "L'amylase est une enzyme produite principalement par le pancréas et les glandes salivaires. Sa concentration plasmatique normale se situe entre 30 et 110 UI/L, un taux élevé pouvant indiquer une pancréatite."),
            en = LocalizedContent("What is the concentration of amylase in plasma?", listOf("30-110 IU/L", "10-30 IU/L", "150-200 IU/L", "200-300 IU/L"), "Science", "Amylase is an enzyme produced mainly by the pancreas and salivary glands. Its normal plasma concentration is between 30 and 110 IU/L; elevated levels may indicate pancreatitis."),
            zh = LocalizedContent("血浆中淀粉酶的浓度是多少？", listOf("30-110 IU/L", "10-30 IU/L", "150-200 IU/L", "200-300 IU/L"), "科学", "淀粉酶是一种主要由胰腺和唾液腺产生的酶。其正常血浆浓度在30至110 IU/L之间，升高可能提示胰腺炎。"),
            es = LocalizedContent("¿Cuál es la concentración de amilasa en el plasma?", listOf("30-110 UI/L", "10-30 UI/L", "150-200 UI/L", "200-300 UI/L"), "Ciencia", "La amilasa es una enzima producida principalmente por el páncreas y las glándulas salivales. Su concentración plasmática normal se sitúa entre 30 y 110 UI/L; un nivel elevado puede indicar pancreatitis.")
        ),
        BilingualQuestion(
            id = 8872, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a la plus grande réactivité chimique?", listOf("Fluor", "Chlore", "Brome", "Iode"), "Science", "Le fluor est l'élément le plus électronégatif et possède la plus forte tendance à attirer des électrons, ce qui le rend extrêmement réactif, notamment avec les métaux et l'hydrogène."),
            en = LocalizedContent("Which chemical element has the greatest chemical reactivity?", listOf("Fluorine", "Chlorine", "Bromine", "Iodine"), "Science", "Fluorine is the most electronegative element and has the strongest tendency to attract electrons, making it extremely reactive, especially with metals and hydrogen."),
            zh = LocalizedContent("哪种化学元素的化学反应性最强？", listOf("氟", "氯", "溴", "碘"), "科学", "氟是电负性最强的元素，具有最强的吸引电子趋势，因此反应性极强，特别是与金属和氢反应。"),
            es = LocalizedContent("¿Qué elemento químico tiene la mayor reactividad química?", listOf("Flúor", "Cloro", "Bromo", "Yodo"), "Ciencia", "El flúor es el elemento más electronegativo y tiene la mayor tendencia a atraer electrones, lo que lo hace extremadamente reactivo, especialmente con metales e hidrógeno.")
        ),
        BilingualQuestion(
            id = 8873, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les membranes D?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les membranes D sont un concept issu de la théorie des cordes, proposé par des physiciens théoriciens comme Joseph Polchinski, et non d'une découverte expérimentale directe."),
            en = LocalizedContent("Which scientist discovered D-branes?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "D-branes are a concept from string theory, proposed by theoretical physicists such as Joseph Polchinski, not a direct experimental discovery."),
            zh = LocalizedContent("哪位科学家发现了D膜？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "D膜是弦理论中的一个概念，由约瑟夫·波尔钦斯基等理论物理学家提出，并非直接实验发现。"),
            es = LocalizedContent("¿Qué científico descubrió las D-branas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Las D-branas son un concepto de la teoría de cuerdas, propuesto por físicos teóricos como Joseph Polchinski, no un descubrimiento experimental directo.")
        ),
        BilingualQuestion(
            id = 8874, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du phénanthrène?", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "Science", "Le phénanthrène est un hydrocarbure aromatique polycyclique composé de 14 atomes de carbone et 10 d'hydrogène, d'où sa formule brute C14H10."),
            en = LocalizedContent("What is the chemical symbol of phenanthrene?", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "Science", "Phenanthrene is a polycyclic aromatic hydrocarbon composed of 14 carbon atoms and 10 hydrogen atoms, hence its molecular formula C14H10."),
            zh = LocalizedContent("菲的化学符号是什么？", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "科学", "菲是一种多环芳烃，由14个碳原子和10个氢原子组成，因此其分子式为C14H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fenantreno?", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "Ciencia", "El fenantreno es un hidrocarburo aromático policíclico compuesto por 14 átomos de carbono y 10 de hidrógeno, de ahí su fórmula molecular C14H10.")
        ),
        BilingualQuestion(
            id = 8875, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vaisseaux lymphatiques a le corps humain?", listOf("~500", "~300", "~700", "~900"), "Science", "Le corps humain compte environ 500 ganglions lymphatiques, qui sont de petits organes en forme de haricot répartis le long des vaisseaux lymphatiques, jouant un rôle clé dans la filtration de la lymphe et la défense immunitaire."),
            en = LocalizedContent("How many lymph nodes does the human body have?", listOf("~500", "~300", "~700", "~900"), "Science", "The human body has approximately 500 lymph nodes, which are small bean-shaped organs distributed along lymphatic vessels, playing a key role in filtering lymph and immune defense."),
            zh = LocalizedContent("人体有多少个淋巴结？", listOf("约500个", "约300个", "约700个", "约900个"), "科学", "人体大约有500个淋巴结，它们是沿淋巴管分布的小豆形器官，在过滤淋巴和免疫防御中起关键作用。"),
            es = LocalizedContent("¿Cuántos ganglios linfáticos tiene el cuerpo humano?", listOf("~500", "~300", "~700", "~900"), "Ciencia", "El cuerpo humano tiene aproximadamente 500 ganglios linfáticos, que son pequeños órganos en forma de frijol distribuidos a lo largo de los vasos linfáticos, desempeñando un papel clave en la filtración de la linfa y la defensa inmunitaria.")
        ),
        BilingualQuestion(
            id = 8876, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit le TRH?", listOf("Hypothalamus", "Hypophyse", "Pancréas", "Foie"), "Science", "Le TRH (thyrotropin-releasing hormone) est une hormone produite par l'hypothalamus pour stimuler la libération de TSH par l'hypophyse."),
            en = LocalizedContent("Which gland produces TRH?", listOf("Hypothalamus", "Pituitary", "Pancreas", "Liver"), "Science", "TRH (thyrotropin-releasing hormone) is a hormone produced by the hypothalamus to stimulate the release of TSH from the pituitary."),
            zh = LocalizedContent("哪个腺体产生TRH？", listOf("下丘脑", "垂体", "胰腺", "肝脏"), "科学", "TRH（促甲状腺激素释放激素）是由下丘脑产生的一种激素，用于刺激垂体释放TSH。"),
            es = LocalizedContent("¿Qué glándula produce la TRH?", listOf("Hipotálamo", "Hipófisis", "Páncreas", "Hígado"), "Ciencia", "La TRH (hormona liberadora de tirotropina) es una hormona producida por el hipotálamo para estimular la liberación de TSH por la hipófisis.")
        ),
        BilingualQuestion(
            id = 8877, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand bâtiment public romain connu?", listOf("Panthéon", "Colosseum", "Forum de Trajan", "Theater Marcellus"), "Science", "Le Panthéon de Rome, avec sa coupole de 43,3 mètres de diamètre, est le plus grand bâtiment public romain antique conservé intact."),
            en = LocalizedContent("What is the largest known Roman public building?", listOf("Pantheon", "Colosseum", "Trajan's Forum", "Theater of Marcellus"), "Science", "The Pantheon in Rome, with its dome 43.3 meters in diameter, is the largest intact ancient Roman public building."),
            zh = LocalizedContent("已知最大的罗马公共建筑是什么？", listOf("万神殿", "罗马斗兽场", "图拉真广场", "马塞卢斯剧院"), "科学", "罗马万神殿的穹顶直径43.3米，是保存完好的最大古罗马公共建筑。"),
            es = LocalizedContent("¿Cuál es el edificio público romano más grande conocido?", listOf("Panteón", "Coliseo", "Foro de Trajano", "Teatro de Marcelo"), "Ciencia", "El Panteón de Roma, con su cúpula de 43,3 metros de diámetro, es el edificio público romano antiguo intacto más grande.")
        ),
        BilingualQuestion(
            id = 8878, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les orbifolds?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les orbifolds sont un concept mathématique issu de la théorie des cordes, développé par des physiciens théoriciens comme Dixon, Harvey, Vafa et Witten dans les années 1980."),
            en = LocalizedContent("Which scientist discovered orbifolds?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Orbifolds are a mathematical concept from string theory, developed by theoretical physicists such as Dixon, Harvey, Vafa, and Witten in the 1980s."),
            zh = LocalizedContent("哪位科学家发现了轨形？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "轨形是弦理论中的一个数学概念，由迪克森、哈维、瓦法和威滕等理论物理学家在20世纪80年代提出。"),
            es = LocalizedContent("¿Qué científico descubrió los orbifolds?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Los orbifolds son un concepto matemático de la teoría de cuerdas, desarrollado por físicos teóricos como Dixon, Harvey, Vafa y Witten en la década de 1980.")
        ),
        BilingualQuestion(
            id = 8879, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzo[b]fluorène?", listOf("C17H12", "C17H10", "C17H14", "C17H8"), "Science", "Le benzo[b]fluorène est un hydrocarbure aromatique polycyclique composé de 17 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule chimique C17H12."),
            en = LocalizedContent("What is the chemical symbol of benzo[b]fluorene?", listOf("C17H12", "C17H10", "C17H14", "C17H8"), "Science", "Benzo[b]fluorene is a polycyclic aromatic hydrocarbon composed of 17 carbon atoms and 12 hydrogen atoms, hence its chemical formula C17H12."),
            zh = LocalizedContent("苯并[b]芴的化学符号是什么？", listOf("C17H12", "C17H10", "C17H14", "C17H8"), "科学", "苯并[b]芴是一种多环芳烃，由17个碳原子和12个氢原子组成，因此其化学式为C17H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del benzo[b]fluoreno?", listOf("C17H12", "C17H10", "C17H14", "C17H8"), "Ciencia", "El benzo[b]fluoreno es un hidrocarburo aromático policíclico compuesto por 17 átomos de carbono y 12 de hidrógeno, de ahí su fórmula química C17H12.")
        ),
        BilingualQuestion(
            id = 8880, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la lipase dans le plasma?", listOf("10-150 UI/L", "1-10 UI/L", "200-300 UI/L", "300-400 UI/L"), "Science", "La lipase pancréatique est normalement présente à faible concentration dans le plasma, entre 10 et 150 UI/L, car elle est principalement sécrétée dans le duodénum pour digérer les graisses."),
            en = LocalizedContent("What is the concentration of lipase in plasma?", listOf("10-150 IU/L", "1-10 IU/L", "200-300 IU/L", "300-400 IU/L"), "Science", "Pancreatic lipase is normally present at low concentration in plasma, between 10 and 150 IU/L, as it is mainly secreted into the duodenum to digest fats."),
            zh = LocalizedContent("血浆中脂肪酶的浓度是多少？", listOf("10-150 IU/L", "1-10 IU/L", "200-300 IU/L", "300-400 IU/L"), "科学", "胰腺脂肪酶在血浆中通常以低浓度存在，介于10至150 IU/L之间，因为它主要分泌到十二指肠以消化脂肪。"),
            es = LocalizedContent("¿Cuál es la concentración de lipasa en el plasma?", listOf("10-150 UI/L", "1-10 UI/L", "200-300 UI/L", "300-400 UI/L"), "Ciencia", "La lipasa pancreática normalmente está presente en baja concentración en el plasma, entre 10 y 150 UI/L, ya que se secreta principalmente en el duodeno para digerir las grasas.")
        ),
        BilingualQuestion(
            id = 8881, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a un nombre de masse constant?", listOf("Chaque élément", "Hydrogène", "Carbone", "Oxygène"), "Science", "Le nombre de masse d’un élément est la somme de ses protons et neutrons, mais il peut varier selon les isotopes. Ainsi, aucun élément n’a un nombre de masse constant."),
            en = LocalizedContent("Which chemical element has a constant mass number?", listOf("Each element", "Hydrogen", "Carbon", "Oxygen"), "Science", "The mass number of an element is the sum of its protons and neutrons, but it can vary depending on isotopes. Thus, no element has a constant mass number."),
            zh = LocalizedContent("哪种化学元素具有恒定的质量数？", listOf("每种元素", "氢", "碳", "氧"), "科学", "元素的质量数是其质子数和中子数之和，但可能因同位素而异。因此，没有元素具有恒定的质量数。"),
            es = LocalizedContent("¿Qué elemento químico tiene un número másico constante?", listOf("Cada elemento", "Hidrógeno", "Carbono", "Oxígeno"), "Ciencia", "El número másico de un elemento es la suma de sus protones y neutrones, pero puede variar según los isótopos. Por lo tanto, ningún elemento tiene un número másico constante.")
        ),
        BilingualQuestion(
            id = 8882, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les branes?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Le concept de branes a été développé par des physiciens théoriciens, notamment dans le cadre de la théorie des cordes, sans qu'un seul scientifique ne soit crédité de leur découverte."),
            en = LocalizedContent("Which scientist discovered branes?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The concept of branes was developed by theoretical physicists, particularly within the framework of string theory, without a single scientist being credited with their discovery."),
            zh = LocalizedContent("哪位科学家发现了膜？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "膜的概念是由理论物理学家在弦理论框架内发展起来的，没有单一科学家被归功于其发现。"),
            es = LocalizedContent("¿Qué científico descubrió las branas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "El concepto de branas fue desarrollado por físicos teóricos, particularmente en el marco de la teoría de cuerdas, sin que un solo científico sea acreditado por su descubrimiento.")
        ),
        BilingualQuestion(
            id = 8883, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du triphenylène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Le triphenylène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule brute C18H12."),
            en = LocalizedContent("What is the chemical symbol of triphenylene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Triphenylene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 12 hydrogen atoms, hence its molecular formula C18H12."),
            zh = LocalizedContent("三亚苯的化学符号是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "三亚苯是一种多环芳烃，由18个碳原子和12个氢原子组成，因此其分子式为C18H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del trifenileno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El trifenileno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 12 átomos de hidrógeno, de ahí su fórmula molecular C18H12.")
        ),
        BilingualQuestion(
            id = 8884, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules de Leydig a un testicule?", listOf("~600 millions", "~300 millions", "~900 millions", "~1 milliard"), "Science", "Les cellules de Leydig, situées dans les testicules, produisent la testostérone. Chaque testicule en contient environ 600 millions, un nombre nécessaire pour assurer une production hormonale suffisante."),
            en = LocalizedContent("How many Leydig cells does a testicle have?", listOf("~600 million", "~300 million", "~900 million", "~1 billion"), "Science", "Leydig cells, located in the testes, produce testosterone. Each testicle contains about 600 million of them, a number necessary to ensure sufficient hormonal production."),
            zh = LocalizedContent("一个睾丸有多少个莱迪希细胞？", listOf("约6亿", "约3亿", "约9亿", "约10亿"), "科学", "莱迪希细胞位于睾丸中，产生睾酮。每个睾丸大约含有6亿个，这个数量对于确保足够的激素产生是必要的。"),
            es = LocalizedContent("¿Cuántas células de Leydig tiene un testículo?", listOf("~600 millones", "~300 millones", "~900 millones", "~1 mil millones"), "Ciencia", "Las células de Leydig, ubicadas en los testículos, producen testosterona. Cada testículo contiene alrededor de 600 millones de ellas, un número necesario para asegurar una producción hormonal suficiente.")
        ),
        BilingualQuestion(
            id = 8885, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la FSH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "La FSH est produite par l'hypophyse antérieure, une glande endocrine située à la base du cerveau, qui régule les fonctions des gonades."),
            en = LocalizedContent("Which gland produces FSH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "FSH is produced by the anterior pituitary, an endocrine gland located at the base of the brain, which regulates the functions of the gonads."),
            zh = LocalizedContent("哪个腺体产生FSH？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "FSH由垂体前叶产生，垂体前叶是位于大脑底部的一个内分泌腺，调节性腺的功能。"),
            es = LocalizedContent("¿Qué glándula produce la FSH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "La FSH es producida por la hipófisis anterior, una glándula endocrina ubicada en la base del cerebro, que regula las funciones de las gónadas.")
        ),
        BilingualQuestion(
            id = 8886, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand temple romain connu?", listOf("Temple de Jupiter Optimus Maximus", "Temple de Minerve", "Temple d'Hercule", "Temple de Vesta"), "Science", "Le Temple de Jupiter Optimus Maximus, situé sur le Capitole à Rome, était le plus grand et le plus important temple de la Rome antique, dédié à la triade capitoline."),
            en = LocalizedContent("What is the largest known Roman temple?", listOf("Temple of Jupiter Optimus Maximus", "Temple of Minerva", "Temple of Hercules", "Temple of Vesta"), "Science", "The Temple of Jupiter Optimus Maximus, located on the Capitoline Hill in Rome, was the largest and most important temple in ancient Rome, dedicated to the Capitoline Triad."),
            zh = LocalizedContent("已知最大的罗马神庙是什么？", listOf("朱庇特神庙（最优大朱庇特神庙）", "密涅瓦神庙", "赫拉克勒斯神庙", "维斯塔神庙"), "科学", "朱庇特神庙（最优大朱庇特神庙）位于罗马卡比托利欧山，是古罗马最大、最重要的神庙，供奉卡比托利欧三主神。"),
            es = LocalizedContent("¿Cuál es el templo romano más grande conocido?", listOf("Templo de Júpiter Óptimo Máximo", "Templo de Minerva", "Templo de Hércules", "Templo de Vesta"), "Ciencia", "El Templo de Júpiter Óptimo Máximo, ubicado en la Colina Capitolina en Roma, fue el templo más grande e importante de la antigua Roma, dedicado a la Tríada Capitolina.")
        ),
        BilingualQuestion(
            id = 8887, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la dualité Seiberg-Witten?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Nathan Seiberg et Edward Witten sont des physiciens théoriciens. Leur travail sur la dualité électromagnétique en théorie des cordes a été publié en 1994."),
            en = LocalizedContent("Which scientist discovered the Seiberg-Witten duality?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Nathan Seiberg and Edward Witten are theoretical physicists. Their work on electromagnetic duality in string theory was published in 1994."),
            zh = LocalizedContent("哪位科学家发现了塞伯格-威滕对偶？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "内森·塞伯格和爱德华·威滕是理论物理学家。他们关于弦理论中电磁对偶性的工作于1994年发表。"),
            es = LocalizedContent("¿Qué científico descubrió la dualidad Seiberg-Witten?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Nathan Seiberg y Edward Witten son físicos teóricos. Su trabajo sobre la dualidad electromagnética en la teoría de cuerdas fue publicado en 1994.")
        ),
        BilingualQuestion(
            id = 8888, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzo[a]anthracène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Le benzo[a]anthracène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule chimique C18H12."),
            en = LocalizedContent("What is the chemical symbol of benzo[a]anthracene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Benzo[a]anthracene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 12 hydrogen atoms, hence its chemical formula C18H12."),
            zh = LocalizedContent("苯并[a]蒽的化学符号是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "苯并[a]蒽是一种多环芳烃，由18个碳原子和12个氢原子组成，因此其化学式为C18H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del benzo[a]antraceno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El benzo[a]antraceno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 12 átomos de hidrógeno, de ahí su fórmula química C18H12.")
        ),
        BilingualQuestion(
            id = 8889, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la glutamate déshydrogénase dans le plasma?", listOf("0-9 UI/L", "10-20 UI/L", "50-100 UI/L", "100-200 UI/L"), "Science", "La glutamate déshydrogénase est une enzyme mitochondriale principalement présente dans le foie. Sa concentration plasmatique normale est très faible, entre 0 et 9 UI/L, et une élévation indique une atteinte hépatique sévère."),
            en = LocalizedContent("What is the concentration of glutamate dehydrogenase in plasma?", listOf("0-9 IU/L", "10-20 IU/L", "50-100 IU/L", "100-200 IU/L"), "Science", "Glutamate dehydrogenase is a mitochondrial enzyme mainly present in the liver. Its normal plasma concentration is very low, between 0 and 9 IU/L, and an elevation indicates severe liver damage."),
            zh = LocalizedContent("血浆中谷氨酸脱氢酶的浓度是多少？", listOf("0-9 IU/L", "10-20 IU/L", "50-100 IU/L", "100-200 IU/L"), "科学", "谷氨酸脱氢酶是一种线粒体酶，主要存在于肝脏。其正常血浆浓度非常低，介于0至9 IU/L之间，升高表明严重的肝损伤。"),
            es = LocalizedContent("¿Cuál es la concentración de glutamato deshidrogenasa en el plasma?", listOf("0-9 UI/L", "10-20 UI/L", "50-100 UI/L", "100-200 UI/L"), "Ciencia", "La glutamato deshidrogenasa es una enzima mitocondrial presente principalmente en el hígado. Su concentración plasmática normal es muy baja, entre 0 y 9 UI/L, y una elevación indica daño hepático severo.")
        ),
        BilingualQuestion(
            id = 8890, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a la plus longue demi-vie radioactive?", listOf("Uranium-238", "Thorium-232", "Samarium-147", "Potassium-40"), "Science", "L'uranium-238 a une demi-vie d'environ 4,5 milliards d'années, ce qui le rend utile pour dater les roches anciennes et estimer l'âge de la Terre."),
            en = LocalizedContent("Which chemical element has the longest radioactive half-life?", listOf("Uranium-238", "Thorium-232", "Samarium-147", "Potassium-40"), "Science", "Uranium-238 has a half-life of about 4.5 billion years, making it useful for dating ancient rocks and estimating the age of the Earth."),
            zh = LocalizedContent("哪种化学元素的放射性半衰期最长？", listOf("铀-238", "钍-232", "钐-147", "钾-40"), "科学", "铀-238的半衰期约为45亿年，使其可用于测定古老岩石的年代和估算地球的年龄。"),
            es = LocalizedContent("¿Qué elemento químico tiene la vida media radiactiva más larga?", listOf("Uranio-238", "Torio-232", "Samario-147", "Potasio-40"), "Ciencia", "El uranio-238 tiene una vida media de aproximadamente 4.500 millones de años, lo que lo hace útil para datar rocas antiguas y estimar la edad de la Tierra.")
        ),
        BilingualQuestion(
            id = 8891, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les modèles Calabi-Yau?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Shing-Tung Yau a donné son nom aux variétés de Calabi-Yau, des espaces mathématiques essentiels en théorie des cordes, après avoir démontré la conjecture de Calabi en 1976."),
            en = LocalizedContent("Which scientist discovered the Calabi-Yau manifolds?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Shing-Tung Yau gave his name to Calabi-Yau manifolds, essential mathematical spaces in string theory, after proving the Calabi conjecture in 1976."),
            zh = LocalizedContent("哪位科学家发现了卡拉比-丘流形？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "丘成桐在1976年证明了卡拉比猜想后，以其名字命名了卡拉比-丘流形，这些是弦理论中重要的数学空间。"),
            es = LocalizedContent("¿Qué científico descubrió las variedades de Calabi-Yau?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Shing-Tung Yau dio nombre a las variedades de Calabi-Yau, espacios matemáticos esenciales en la teoría de cuerdas, tras demostrar la conjetura de Calabi en 1976.")
        ),
        BilingualQuestion(
            id = 8892, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du dibenzo[a,h]anthracène?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Science", "Le dibenzo[a,h]anthracène est un hydrocarbure aromatique polycyclique composé de 26 atomes de carbone et 16 atomes d'hydrogène, d'où sa formule brute C26H16."),
            en = LocalizedContent("What is the chemical symbol of dibenzo[a,h]anthracene?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Science", "Dibenzo[a,h]anthracene is a polycyclic aromatic hydrocarbon composed of 26 carbon atoms and 16 hydrogen atoms, hence its molecular formula C26H16."),
            zh = LocalizedContent("二苯并[a,h]蒽的化学式是什么？", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "科学", "二苯并[a,h]蒽是一种多环芳烃，由26个碳原子和16个氢原子组成，因此其分子式为C26H16。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del dibenzo[a,h]antraceno?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Ciencia", "El dibenzo[a,h]antraceno es un hidrocarburo aromático policíclico compuesto por 26 átomos de carbono y 16 de hidrógeno, de ahí su fórmula molecular C26H16.")
        ),
        BilingualQuestion(
            id = 8893, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules de Sertoli a un testicule?", listOf("~300 millions", "~100 millions", "~500 millions", "~1 milliard"), "Science", "Les cellules de Sertoli, qui soutiennent la spermatogenèse, sont environ 300 millions par testicule chez l'homme adulte."),
            en = LocalizedContent("How many Sertoli cells are in a testicle?", listOf("~300 million", "~100 million", "~500 million", "~1 billion"), "Science", "Sertoli cells, which support spermatogenesis, number about 300 million per testicle in adult humans."),
            zh = LocalizedContent("一个睾丸中有多少支持细胞？", listOf("约3亿", "约1亿", "约5亿", "约10亿"), "科学", "支持细胞支持精子发生，在成年男性每个睾丸中约有3亿个。"),
            es = LocalizedContent("¿Cuántas células de Sertoli hay en un testículo?", listOf("~300 millones", "~100 millones", "~500 millones", "~1 billón"), "Ciencia", "Las células de Sertoli, que sostienen la espermatogénesis, son aproximadamente 300 millones por testículo en el hombre adulto.")
        ),
        BilingualQuestion(
            id = 8894, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la LH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "La LH (hormone lutéinisante) est sécrétée par l'hypophyse antérieure, une glande endocrine située à la base du cerveau."),
            en = LocalizedContent("Which gland produces LH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "LH (luteinizing hormone) is secreted by the anterior pituitary, an endocrine gland located at the base of the brain."),
            zh = LocalizedContent("哪个腺体产生促黄体生成素？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "促黄体生成素由垂体前叶分泌，垂体前叶是位于大脑底部的一个内分泌腺。"),
            es = LocalizedContent("¿Qué glándula produce la LH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "La LH (hormona luteinizante) es secretada por la hipófisis anterior, una glándula endocrina situada en la base del cerebro.")
        ),
        BilingualQuestion(
            id = 8895, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand tombeau romain antique?", listOf("Mausolée d'Auguste", "Mausolée d'Hadrien", "Pyramide de Cestius", "Mausolée de Julien"), "Science", "Le Mausolée d'Auguste, construit en 28 av. J.-C., est le plus grand tombeau romain antique avec un diamètre de 87 mètres. Il servait de sépulture à l'empereur Auguste et à sa famille."),
            en = LocalizedContent("What is the largest ancient Roman tomb?", listOf("Mausoleum of Augustus", "Mausoleum of Hadrian", "Pyramid of Cestius", "Mausoleum of Julian"), "Science", "The Mausoleum of Augustus, built in 28 BC, is the largest ancient Roman tomb with a diameter of 87 meters. It served as the burial place for Emperor Augustus and his family."),
            zh = LocalizedContent("最大的古罗马陵墓是什么？", listOf("奥古斯都陵墓", "哈德良陵墓", "塞斯提乌斯金字塔", "朱利安陵墓"), "科学", "奥古斯都陵墓建于公元前28年，直径87米，是最大的古罗马陵墓，用于安葬奥古斯都皇帝及其家族。"),
            es = LocalizedContent("¿Cuál es la tumba romana antigua más grande?", listOf("Mausoleo de Augusto", "Mausoleo de Adriano", "Pirámide de Cestio", "Mausoleo de Juliano"), "Ciencia", "El Mausoleo de Augusto, construido en el 28 a.C., es la tumba romana antigua más grande con un diámetro de 87 metros. Servía como sepultura para el emperador Augusto y su familia.")
        ),
        BilingualQuestion(
            id = 8896, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la supersymétrie?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La supersymétrie n'a pas été découverte par un scientifique unique mais est un concept théorique développé dans les années 1970 par plusieurs physiciens. Elle reste une hypothèse mathématique non confirmée expérimentalement."),
            en = LocalizedContent("Which scientist discovered supersymmetry?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Supersymmetry was not discovered by a single scientist but is a theoretical concept developed in the 1970s by several physicists. It remains an unconfirmed mathematical hypothesis."),
            zh = LocalizedContent("哪位科学家发现了超对称性？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "超对称性并非由某一位科学家发现，而是20世纪70年代由多位物理学家发展的理论概念，至今仍是一个未经实验证实的数学假说。"),
            es = LocalizedContent("¿Qué científico descubrió la supersimetría?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La supersimetría no fue descubierta por un solo científico, sino que es un concepto teórico desarrollado en la década de 1970 por varios físicos. Sigue siendo una hipótesis matemática no confirmada experimentalmente.")
        ),
        BilingualQuestion(
            id = 8897, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du pentaphène?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Science", "Le pentaphène est un hydrocarbure aromatique polycyclique composé de 22 atomes de carbone et 14 atomes d'hydrogène, d'où sa formule brute C22H14."),
            en = LocalizedContent("What is the chemical symbol of pentaphene?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Science", "Pentaphene is a polycyclic aromatic hydrocarbon composed of 22 carbon atoms and 14 hydrogen atoms, hence its molecular formula C22H14."),
            zh = LocalizedContent("五苯的化学式是什么？", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "科学", "五苯是一种多环芳烃，由22个碳原子和14个氢原子组成，因此其分子式为C22H14。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del pentafeno?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Ciencia", "El pentafeno es un hidrocarburo aromático policíclico compuesto por 22 átomos de carbono y 14 de hidrógeno, de ahí su fórmula molecular C22H14.")
        ),
        BilingualQuestion(
            id = 8898, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la phosphatase alcaline dans le plasma?", listOf("25-100 UI/L", "10-25 UI/L", "150-200 UI/L", "200-300 UI/L"), "Science", "La phosphatase alcaline est une enzyme présente dans le foie, les os et les intestins. Sa concentration plasmatique normale de 25-100 UI/L reflète l'équilibre de ces tissus."),
            en = LocalizedContent("What is the concentration of alkaline phosphatase in plasma?", listOf("25-100 IU/L", "10-25 IU/L", "150-200 IU/L", "200-300 IU/L"), "Science", "Alkaline phosphatase is an enzyme present in the liver, bones, and intestines. Its normal plasma concentration of 25-100 IU/L reflects the balance of these tissues."),
            zh = LocalizedContent("血浆中碱性磷酸酶的浓度是多少？", listOf("25-100 IU/L", "10-25 IU/L", "150-200 IU/L", "200-300 IU/L"), "科学", "碱性磷酸酶是一种存在于肝脏、骨骼和肠道中的酶。其正常血浆浓度为25-100 IU/L，反映了这些组织的平衡。"),
            es = LocalizedContent("¿Cuál es la concentración de fosfatasa alcalina en el plasma?", listOf("25-100 UI/L", "10-25 UI/L", "150-200 UI/L", "200-300 UI/L"), "Ciencia", "La fosfatasa alcalina es una enzima presente en el hígado, los huesos y los intestinos. Su concentración plasmática normal de 25-100 UI/L refleja el equilibrio de estos tejidos.")
        ),
        BilingualQuestion(
            id = 8899, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le nombre de masse le plus élevé?", listOf("Oganesson", "Livermorium", "Flerovium", "Copernicium"), "Science", "L'oganesson (Og) possède le numéro atomique le plus élevé (118) et, parmi les éléments connus, le nombre de masse le plus élevé, environ 294. C'est un élément synthétique et radioactif."),
            en = LocalizedContent("Which chemical element has the highest mass number?", listOf("Oganesson", "Livermorium", "Flerovium", "Copernicium"), "Science", "Oganesson (Og) has the highest atomic number (118) and, among known elements, the highest mass number, approximately 294. It is a synthetic and radioactive element."),
            zh = LocalizedContent("哪种化学元素的质量数最高？", listOf("鿫", "𬬻", "𫓧", "鎶"), "科学", "鿫（Og）具有最高的原子序数（118），并且在已知元素中质量数最高，约为294。它是一种合成放射性元素。"),
            es = LocalizedContent("¿Qué elemento químico tiene el número másico más alto?", listOf("Oganesón", "Livermorio", "Flerovio", "Copernicio"), "Ciencia", "El oganesón (Og) posee el número atómico más alto (118) y, entre los elementos conocidos, el número másico más alto, aproximadamente 294. Es un elemento sintético y radiactivo.")
        ),
        BilingualQuestion(
            id = 8900, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la dualité AdS/CFT?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La dualité AdS/CFT est une conjecture en théorie des cordes formulée par le physicien théoricien Juan Maldacena en 1997."),
            en = LocalizedContent("Which scientist discovered the AdS/CFT duality?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The AdS/CFT duality is a conjecture in string theory formulated by theoretical physicist Juan Maldacena in 1997."),
            zh = LocalizedContent("哪位科学家发现了AdS/CFT对偶性？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "AdS/CFT对偶性是弦理论中的一个猜想，由理论物理学家胡安·马尔达西那于1997年提出。"),
            es = LocalizedContent("¿Qué científico descubrió la dualidad AdS/CFT?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La dualidad AdS/CFT es una conjetura en teoría de cuerdas formulada por el físico teórico Juan Maldacena en 1997.")
        ),
        BilingualQuestion(
            id = 8901, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du pyrène?", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "Science", "Le pyrène est un hydrocarbure aromatique polycyclique composé de 16 atomes de carbone et 10 d'hydrogène, d'où sa formule brute C16H10."),
            en = LocalizedContent("What is the chemical symbol for pyrene?", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "Science", "Pyrene is a polycyclic aromatic hydrocarbon composed of 16 carbon atoms and 10 hydrogen atoms, hence its molecular formula C16H10."),
            zh = LocalizedContent("芘的化学式是什么？", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "科学", "芘是一种多环芳烃，由16个碳原子和10个氢原子组成，因此其分子式为C16H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del pireno?", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "Ciencia", "El pireno es un hidrocarburo aromático policíclico compuesto por 16 átomos de carbono y 10 de hidrógeno, de ahí su fórmula molecular C16H10.")
        ),
        BilingualQuestion(
            id = 8902, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules épithéliales l'estomac produit-il par jour?", listOf("300 milliards", "100 milliards", "500 milliards", "1 trillion"), "Science", "L'estomac renouvelle rapidement sa muqueuse pour se protéger de l'acide gastrique, produisant environ 300 milliards de cellules épithéliales par jour."),
            en = LocalizedContent("How many epithelial cells does the stomach produce per day?", listOf("300 billion", "100 billion", "500 billion", "1 trillion"), "Science", "The stomach rapidly renews its lining to protect itself from gastric acid, producing about 300 billion epithelial cells per day."),
            zh = LocalizedContent("胃每天产生多少上皮细胞？", listOf("3000亿", "1000亿", "5000亿", "1万亿"), "科学", "胃快速更新其黏膜以保护自身免受胃酸侵蚀，每天产生约3000亿个上皮细胞。"),
            es = LocalizedContent("¿Cuántas células epiteliales produce el estómago por día?", listOf("300 mil millones", "100 mil millones", "500 mil millones", "1 billón"), "Ciencia", "El estómago renueva rápidamente su revestimiento para protegerse del ácido gástrico, produciendo alrededor de 300 mil millones de células epiteliales por día.")
        ),
        BilingualQuestion(
            id = 8903, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la ACTH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "L'ACTH est une hormone produite par l'hypophyse antérieure qui stimule les glandes surrénales à libérer du cortisol."),
            en = LocalizedContent("Which gland produces ACTH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "ACTH is a hormone produced by the anterior pituitary gland that stimulates the adrenal glands to release cortisol."),
            zh = LocalizedContent("哪个腺体产生ACTH？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "ACTH是由垂体前叶产生的一种激素，刺激肾上腺释放皮质醇。"),
            es = LocalizedContent("¿Qué glándula produce la ACTH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "La ACTH es una hormona producida por la hipófisis anterior que estimula las glándulas suprarrenales para liberar cortisol.")
        ),
        BilingualQuestion(
            id = 8904, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cirque antique connu?", listOf("Circus Maximus", "Circus Flaminius", "Colosseum", "Theater Marcellus"), "Science", "Le Circus Flaminius était le plus grand cirque de la Rome antique, construit en 221 av. J.-C. pour les courses de chars, surpassant le Circus Maximus en taille."),
            en = LocalizedContent("What is the largest known ancient circus?", listOf("Circus Maximus", "Circus Flaminius", "Colosseum", "Theater of Marcellus"), "Science", "The Circus Flaminius was the largest circus in ancient Rome, built in 221 BC for chariot races, surpassing the Circus Maximus in size."),
            zh = LocalizedContent("已知最大的古罗马竞技场是哪个？", listOf("马克西穆斯竞技场", "弗拉米尼乌斯竞技场", "罗马斗兽场", "马塞卢斯剧院"), "科学", "弗拉米尼乌斯竞技场是古罗马最大的竞技场，建于公元前221年，用于战车比赛，规模超过马克西穆斯竞技场。"),
            es = LocalizedContent("¿Cuál es el circo antiguo más grande conocido?", listOf("Circus Maximus", "Circus Flaminius", "Coliseo", "Teatro de Marcelo"), "Ciencia", "El Circus Flaminius fue el circo más grande de la Roma antigua, construido en el 221 a.C. para carreras de carros, superando en tamaño al Circus Maximus.")
        ),
        BilingualQuestion(
            id = 8905, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie de Twistor?", listOf("Roger Penrose", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Roger Penrose a développé la théorie des twisteurs dans les années 1960 pour unifier la relativité générale et la mécanique quantique."),
            en = LocalizedContent("Which scientist discovered the twistor theory?", listOf("Roger Penrose", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Roger Penrose developed twistor theory in the 1960s to unify general relativity and quantum mechanics."),
            zh = LocalizedContent("哪位科学家发现了扭量理论？", listOf("罗杰·彭罗斯", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "罗杰·彭罗斯在20世纪60年代发展了扭量理论，旨在统一广义相对论和量子力学。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de twistores?", listOf("Roger Penrose", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Roger Penrose desarrolló la teoría de twistores en la década de 1960 para unificar la relatividad general y la mecánica cuántica.")
        ),
        BilingualQuestion(
            id = 8906, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du coronène?", listOf("C24H12", "C24H10", "C24H14", "C24H8"), "Science", "Le coronène est un hydrocarbure aromatique polycyclique composé de 24 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule chimique C24H12."),
            en = LocalizedContent("What is the chemical symbol for coronene?", listOf("C24H12", "C24H10", "C24H14", "C24H8"), "Science", "Coronene is a polycyclic aromatic hydrocarbon composed of 24 carbon atoms and 12 hydrogen atoms, hence its chemical formula C24H12."),
            zh = LocalizedContent("晕苯的化学式是什么？", listOf("C24H12", "C24H10", "C24H14", "C24H8"), "科学", "晕苯是一种多环芳烃，由24个碳原子和12个氢原子组成，因此其化学式为C24H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del coroneno?", listOf("C24H12", "C24H10", "C24H14", "C24H8"), "Ciencia", "El coroneno es un hidrocarburo aromático policíclico compuesto por 24 átomos de carbono y 12 de hidrógeno, de ahí su fórmula química C24H12.")
        ),
        BilingualQuestion(
            id = 8907, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la gamma-GT dans le plasma?", listOf("8-60 UI/L", "1-8 UI/L", "100-150 UI/L", "150-200 UI/L"), "Science", "La gamma-glutamyl transférase (gamma-GT) est une enzyme hépatique dont le taux normal dans le plasma se situe entre 8 et 60 UI/L, servant de marqueur pour détecter des lésions du foie ou des voies biliaires."),
            en = LocalizedContent("What is the concentration of gamma-GT in plasma?", listOf("8-60 U/L", "1-8 U/L", "100-150 U/L", "150-200 U/L"), "Science", "Gamma-glutamyl transferase (gamma-GT) is a liver enzyme whose normal plasma level ranges from 8 to 60 U/L, serving as a marker for detecting liver or bile duct damage."),
            zh = LocalizedContent("血浆中γ-谷氨酰转肽酶的浓度是多少？", listOf("8-60 U/L", "1-8 U/L", "100-150 U/L", "150-200 U/L"), "科学", "γ-谷氨酰转肽酶（γ-GT）是一种肝酶，其血浆正常水平在8至60 U/L之间，作为检测肝脏或胆管损伤的标志物。"),
            es = LocalizedContent("¿Cuál es la concentración de gamma-GT en el plasma?", listOf("8-60 U/L", "1-8 U/L", "100-150 U/L", "150-200 U/L"), "Ciencia", "La gamma-glutamil transferasa (gamma-GT) es una enzima hepática cuyo nivel normal en plasma oscila entre 8 y 60 U/L, sirviendo como marcador para detectar daño hepático o biliar.")
        ),
        BilingualQuestion(
            id = 8908, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus petit diamètre atomique?", listOf("Fluor", "Hydrogène", "Hélium", "Azote"), "Science", "Le fluor a le plus petit diamètre atomique car, dans une période du tableau périodique, le rayon atomique diminue de gauche à droite en raison de l'augmentation de la charge nucléaire."),
            en = LocalizedContent("Which chemical element has the smallest atomic diameter?", listOf("Fluorine", "Hydrogen", "Helium", "Nitrogen"), "Science", "Fluorine has the smallest atomic diameter because, in a period of the periodic table, the atomic radius decreases from left to right due to increasing nuclear charge."),
            zh = LocalizedContent("哪种化学元素的原子直径最小？", listOf("氟", "氢", "氦", "氮"), "科学", "氟的原子直径最小，因为在元素周期表的同一周期中，原子半径从左到右因核电荷增加而减小。"),
            es = LocalizedContent("¿Qué elemento químico tiene el diámetro atómico más pequeño?", listOf("Flúor", "Hidrógeno", "Helio", "Nitrógeno"), "Ciencia", "El flúor tiene el diámetro atómico más pequeño porque, en un período de la tabla periódica, el radio atómico disminuye de izquierda a derecha debido al aumento de la carga nuclear.")
        ),
        BilingualQuestion(
            id = 8909, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les amplitudes d'amplification?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "L'amplitude d'amplification est un concept théorique en physique, notamment en mécanique quantique, et n'est pas attribué à un scientifique spécifique, ce qui explique la réponse \"Théorique\"."),
            en = LocalizedContent("Which scientist discovered amplification amplitudes?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Amplification amplitude is a theoretical concept in physics, particularly in quantum mechanics, and is not attributed to a specific scientist, hence the answer \"Theoretical\"."),
            zh = LocalizedContent("哪位科学家发现了放大振幅？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "放大振幅是物理学中的一个理论概念，特别是在量子力学中，并非由特定科学家发现，因此答案为“理论”。"),
            es = LocalizedContent("¿Qué científico descubrió las amplitudes de amplificación?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La amplitud de amplificación es un concepto teórico en física, particularmente en mecánica cuántica, y no se atribuye a un científico específico, por lo que la respuesta es \"Teórico\".")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8910, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du hexacène?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Science", "Le hexacène est un hydrocarbure aromatique polycyclique composé de 26 atomes de carbone et 16 atomes d'hydrogène, d'où son symbole chimique C26H16."),
            en = LocalizedContent("What is the chemical symbol of hexacene?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Science", "Hexacene is a polycyclic aromatic hydrocarbon composed of 26 carbon atoms and 16 hydrogen atoms, hence its chemical symbol C26H16."),
            zh = LocalizedContent("己烯的化学符号是什么？", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "科学", "己烯是一种多环芳烃，由26个碳原子和16个氢原子组成，因此其化学符号为C26H16。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del hexaceno?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Ciencia", "El hexaceno es un hidrocarburo aromático policíclico compuesto por 26 átomos de carbono y 16 átomos de hidrógeno, de ahí su símbolo químico C26H16.")
        ),
        BilingualQuestion(
            id = 8911, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cellules de Merkel a la peau?", listOf("~50 millions", "~10 millions", "~100 millions", "~200 millions"), "Science", "Les cellules de Merkel sont des mécanorécepteurs tactiles situés dans l'épiderme, et leur densité moyenne dans la peau humaine est estimée à environ 50 millions, permettant la perception du toucher fin."),
            en = LocalizedContent("How many Merkel cells does the skin have?", listOf("~50 million", "~10 million", "~100 million", "~200 million"), "Science", "Merkel cells are tactile mechanoreceptors located in the epidermis, and their average density in human skin is estimated at about 50 million, enabling fine touch perception."),
            zh = LocalizedContent("皮肤中有多少个默克尔细胞？", listOf("约5000万", "约1000万", "约1亿", "约2亿"), "科学", "默克尔细胞是位于表皮中的触觉机械感受器，在人体皮肤中的平均密度估计约为5000万个，能够感知精细触觉。"),
            es = LocalizedContent("¿Cuántas células de Merkel tiene la piel?", listOf("~50 millones", "~10 millones", "~100 millones", "~200 millones"), "Ciencia", "Las células de Merkel son mecanorreceptores táctiles ubicados en la epidermis, y su densidad media en la piel humana se estima en unos 50 millones, permitiendo la percepción del tacto fino.")
        ),
        BilingualQuestion(
            id = 8912, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la TSH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "La TSH, ou thyréostimuline, est sécrétée par l'hypophyse antérieure pour réguler la glande thyroïde."),
            en = LocalizedContent("Which gland produces TSH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "TSH, or thyrotropin, is secreted by the anterior pituitary gland to regulate the thyroid gland."),
            zh = LocalizedContent("哪个腺体产生TSH？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "TSH，即促甲状腺激素，由垂体前叶分泌，用于调节甲状腺。"),
            es = LocalizedContent("¿Qué glándula produce la TSH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "La TSH, o tirotropina, es secretada por la hipófisis anterior para regular la glándula tiroides.")
        ),
        BilingualQuestion(
            id = 8913, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mausolée antique?", listOf("Mausolée d'Halicarnasse", "Mausolée d'Auguste", "Mausolée d'Hadrien", "Pyramide de Khéops"), "Science", "Le Mausolée d'Halicarnasse, construit au IVe siècle av. J.-C. pour le roi Mausole, était l'une des Sept Merveilles du monde antique, mesurant environ 45 mètres de haut."),
            en = LocalizedContent("What is the largest ancient mausoleum?", listOf("Mausoleum at Halicarnassus", "Mausoleum of Augustus", "Mausoleum of Hadrian", "Pyramid of Khufu"), "Science", "The Mausoleum at Halicarnassus, built in the 4th century BC for King Mausolus, was one of the Seven Wonders of the Ancient World, standing about 45 meters high."),
            zh = LocalizedContent("最大的古代陵墓是什么？", listOf("哈利卡纳苏斯陵墓", "奥古斯都陵墓", "哈德良陵墓", "胡夫金字塔"), "科学", "哈利卡纳苏斯陵墓建于公元前4世纪，为国王摩索拉斯而建，是古代世界七大奇迹之一，高约45米。"),
            es = LocalizedContent("¿Cuál es el mausoleo antiguo más grande?", listOf("Mausoleo de Halicarnaso", "Mausoleo de Augusto", "Mausoleo de Adriano", "Pirámide de Keops"), "Ciencia", "El Mausoleo de Halicarnaso, construido en el siglo IV a.C. para el rey Mausolo, fue una de las Siete Maravillas del Mundo Antiguo, con unos 45 metros de altura.")
        ),
        BilingualQuestion(
            id = 8914, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie conforme des champs?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La théorie conforme des champs a été développée par plusieurs physiciens théoriciens, dont Alexander Polyakov, Alexander Belavin et Alexander Zamolodchikov dans les années 1970-1980."),
            en = LocalizedContent("Which scientist discovered conformal field theory?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Conformal field theory was developed by several theoretical physicists, including Alexander Polyakov, Alexander Belavin, and Alexander Zamolodchikov in the 1970s-1980s."),
            zh = LocalizedContent("哪位科学家发现了共形场论？", listOf("理论家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "共形场论由多位理论物理学家发展，包括亚历山大·波利亚科夫、亚历山大·别拉温、亚历山大·扎莫洛德奇科夫等，在20世纪70-80年代。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de campos conformes?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La teoría de campos conformes fue desarrollada por varios físicos teóricos, incluyendo a Alexander Polyakov, Alexander Belavin y Alexander Zamolodchikov en las décadas de 1970-1980.")
        ),
        BilingualQuestion(
            id = 8915, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du heptacène?", listOf("C28H18", "C28H16", "C28H20", "C28H14"), "Science", "Le heptacène est un hydrocarbure aromatique polycyclique composé de 28 atomes de carbone et 18 atomes d'hydrogène, d'où sa formule brute C28H18."),
            en = LocalizedContent("What is the chemical symbol of heptacene?", listOf("C28H18", "C28H16", "C28H20", "C28H14"), "Science", "Heptacene is a polycyclic aromatic hydrocarbon composed of 28 carbon atoms and 18 hydrogen atoms, hence its molecular formula C28H18."),
            zh = LocalizedContent("庚烯的化学符号是什么？", listOf("C28H18", "C28H16", "C28H20", "C28H14"), "科学", "庚烯是一种多环芳烃，由28个碳原子和18个氢原子组成，因此其分子式为C28H18。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del heptaceno?", listOf("C28H18", "C28H16", "C28H20", "C28H14"), "Ciencia", "El heptaceno es un hidrocarburo aromático policíclico compuesto por 28 átomos de carbono y 18 átomos de hidrógeno, de ahí su fórmula molecular C28H18.")
        ),
        BilingualQuestion(
            id = 8916, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la transaminase (AST) dans le plasma?", listOf("10-40 UI/L", "1-10 UI/L", "100-150 UI/L", "150-200 UI/L"), "Science", "L'AST est une enzyme normalement présente dans les cellules hépatiques et cardiaques. Sa concentration plasmatique de 10 à 40 UI/L correspond au taux physiologique chez un adulte sain."),
            en = LocalizedContent("What is the concentration of transaminase (AST) in plasma?", listOf("10-40 IU/L", "1-10 IU/L", "100-150 IU/L", "150-200 IU/L"), "Science", "AST is an enzyme normally present in liver and heart cells. Its plasma concentration of 10 to 40 IU/L corresponds to the physiological level in a healthy adult."),
            zh = LocalizedContent("血浆中转氨酶（AST）的浓度是多少？", listOf("10-40 IU/L", "1-10 IU/L", "100-150 IU/L", "150-200 IU/L"), "科学", "AST是一种通常存在于肝细胞和心肌细胞中的酶。其血浆浓度10-40 IU/L对应健康成人的生理水平。"),
            es = LocalizedContent("¿Cuál es la concentración de transaminasa (AST) en el plasma?", listOf("10-40 UI/L", "1-10 UI/L", "100-150 UI/L", "150-200 UI/L"), "Ciencia", "La AST es una enzima normalmente presente en las células hepáticas y cardíacas. Su concentración plasmática de 10 a 40 UI/L corresponde al nivel fisiológico en un adulto sano.")
        ),
        BilingualQuestion(
            id = 8917, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus grand rayon ionique?", listOf("Iodure", "Bromure", "Chlorure", "Fluorure"), "Science", "L'ion iodure (I⁻) possède un rayon ionique plus grand que les autres halogénures car il se situe en bas du groupe 17, avec le plus grand nombre de couches électroniques."),
            en = LocalizedContent("Which chemical element has the largest ionic radius?", listOf("Iodide", "Bromide", "Chloride", "Fluoride"), "Science", "The iodide ion (I⁻) has a larger ionic radius than other halides because it is at the bottom of group 17, with the most electron shells."),
            zh = LocalizedContent("哪种化学元素的离子半径最大？", listOf("碘离子", "溴离子", "氯离子", "氟离子"), "科学", "碘离子（I⁻）的离子半径比其他卤化物离子大，因为它位于第17族底部，具有最多的电子层。"),
            es = LocalizedContent("¿Qué elemento químico tiene el mayor radio iónico?", listOf("Yoduro", "Bromuro", "Cloruro", "Fluoruro"), "Ciencia", "El ion yoduro (I⁻) tiene un radio iónico mayor que otros haluros porque se encuentra en la parte inferior del grupo 17, con el mayor número de capas electrónicas.")
        ),
        BilingualQuestion(
            id = 8918, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les anomalies quantiques?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Le terme \"anomalies quantiques\" est un concept théorique issu de la physique quantique, et non une découverte attribuée à un scientifique particulier."),
            en = LocalizedContent("Which scientist discovered quantum anomalies?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The term 'quantum anomalies' is a theoretical concept from quantum physics, not a discovery attributed to a particular scientist."),
            zh = LocalizedContent("哪位科学家发现了量子反常？", listOf("理论家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "“量子反常”是量子物理学中的一个理论概念，并非归功于某位特定科学家的发现。"),
            es = LocalizedContent("¿Qué científico descubrió las anomalías cuánticas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "El término 'anomalías cuánticas' es un concepto teórico de la física cuántica, no un descubrimiento atribuido a un científico en particular.")
        ),
        BilingualQuestion(
            id = 8919, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du naphthacène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Le naphthacène est un hydrocarbure aromatique polycyclique composé de quatre cycles benzéniques fusionnés, d'où sa formule brute C18H12."),
            en = LocalizedContent("What is the chemical symbol of naphthacene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Naphthacene is a polycyclic aromatic hydrocarbon composed of four fused benzene rings, hence its molecular formula C18H12."),
            zh = LocalizedContent("并四苯的化学符号是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "并四苯是一种多环芳烃，由四个稠合苯环组成，因此其分子式为C18H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del naftaceno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El naftaceno es un hidrocarburo aromático policíclico compuesto por cuatro anillos de benceno fusionados, de ahí su fórmula molecular C18H12.")
        ),
        BilingualQuestion(
            id = 8920, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de corpuscules de Pacini a la peau?", listOf("~3000", "~1000", "~5000", "~10000"), "Science", "Les corpuscules de Pacini sont des récepteurs sensoriels de la peau sensibles aux vibrations et à la pression. On en compte environ 3000 dans l'ensemble du corps humain."),
            en = LocalizedContent("How many Pacinian corpuscles are in the skin?", listOf("~3000", "~1000", "~5000", "~10000"), "Science", "Pacinian corpuscles are sensory receptors in the skin sensitive to vibration and pressure. There are approximately 3000 in the entire human body."),
            zh = LocalizedContent("皮肤中有多少个帕西尼小体？", listOf("~3000", "~1000", "~5000", "~10000"), "科学", "帕西尼小体是皮肤中对振动和压力敏感的感觉受体。整个人体大约有3000个。"),
            es = LocalizedContent("¿Cuántos corpúsculos de Pacini hay en la piel?", listOf("~3000", "~1000", "~5000", "~10000"), "Ciencia", "Los corpúsculos de Pacini son receptores sensoriales de la piel sensibles a las vibraciones y la presión. Hay aproximadamente 3000 en todo el cuerpo humano.")
        ),
        BilingualQuestion(
            id = 8921, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gland produit la prolactine?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "L'hypothalamus produit la prolactine via des neurones spécialisés, mais sa sécrétion est principalement régulée par l'inhibition de la dopamine."),
            en = LocalizedContent("Which gland produces prolactin?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "The hypothalamus produces prolactin via specialized neurons, but its secretion is primarily regulated by dopamine inhibition."),
            zh = LocalizedContent("哪个腺体产生催乳素？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "下丘脑通过专门的神经元产生催乳素，但其分泌主要受多巴胺抑制的调节。"),
            es = LocalizedContent("¿Qué glándula produce la prolactina?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "El hipotálamo produce prolactina a través de neuronas especializadas, pero su secreción está regulada principalmente por la inhibición de la dopamina.")
        ),
        BilingualQuestion(
            id = 8922, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand arc de Noe?", listOf("Arc du Pont-Neuf", "Arc du Carousel", "Arc de l'Étoile", "Arc de la Paix"), "Science", "L'arc du Pont-Neuf est le plus grand arc de Noé, un terme désignant les arches de ponts. Il s'agit du pont le plus ancien de Paris encore debout, dont l'arche principale mesure 20 mètres de portée."),
            en = LocalizedContent("What is the largest arch of Noe?", listOf("Pont-Neuf Arch", "Carousel Arch", "Arc de Triomphe", "Arch of Peace"), "Science", "The Pont-Neuf arch is the largest arch of Noé, a term referring to bridge arches. It is the oldest standing bridge in Paris, with a main arch spanning 20 meters."),
            zh = LocalizedContent("诺亚最大的拱门是什么？", listOf("新桥拱门", "卡鲁塞尔拱门", "凯旋门", "和平拱门"), "科学", "新桥拱门是诺亚最大的拱门，该术语指桥梁拱门。它是巴黎现存最古老的桥梁，主拱跨度20米。"),
            es = LocalizedContent("¿Cuál es el arco más grande de Noé?", listOf("Arco del Pont-Neuf", "Arco del Carrusel", "Arco del Triunfo", "Arco de la Paz"), "Ciencia", "El arco del Pont-Neuf es el arco más grande de Noé, término que designa los arcos de puentes. Es el puente más antiguo de París aún en pie, con un arco principal de 20 metros de luz.")
        ),
        BilingualQuestion(
            id = 8923, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les instantons?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les instantons ont été découverts par les physiciens théoriciens Alexander Polyakov, Gerard 't Hooft, et d'autres dans les années 1970, dans le cadre de la théorie quantique des champs."),
            en = LocalizedContent("Which scientist discovered instantons?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Instantons were discovered by theoretical physicists Alexander Polyakov, Gerard 't Hooft, and others in the 1970s within the framework of quantum field theory."),
            zh = LocalizedContent("哪位科学家发现了瞬子？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "瞬子是由理论物理学家亚历山大·波利亚科夫、杰拉德·特·胡夫特等人在20世纪70年代在量子场论框架下发现的。"),
            es = LocalizedContent("¿Qué científico descubrió los instantones?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Los instantones fueron descubiertos por los físicos teóricos Alexander Polyakov, Gerard 't Hooft y otros en la década de 1970 en el marco de la teoría cuántica de campos.")
        ),
        BilingualQuestion(
            id = 8924, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du tétracène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Le tétracène est un hydrocarbure aromatique polycyclique composé de quatre cycles benzéniques fusionnés, d'où sa formule brute C18H10."),
            en = LocalizedContent("What is the chemical symbol of tetracene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Tetracene is a polycyclic aromatic hydrocarbon composed of four fused benzene rings, hence its molecular formula C18H10."),
            zh = LocalizedContent("并四苯的化学符号是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "并四苯是一种多环芳烃，由四个稠合苯环组成，因此其分子式为C18H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tetraceno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El tetraceno es un hidrocarburo aromático policíclico compuesto por cuatro anillos de benceno fusionados, de ahí su fórmula molecular C18H10.")
        ),
        BilingualQuestion(
            id = 8925, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la transaminase (ALT) dans le plasma?", listOf("7-40 UI/L", "1-7 UI/L", "100-150 UI/L", "150-200 UI/L"), "Science", "L'alanine aminotransférase (ALT) est une enzyme hépatique ; sa concentration plasmatique normale est de 7 à 40 UI/L, une élévation indiquant souvent une lésion du foie."),
            en = LocalizedContent("What is the concentration of transaminase (ALT) in plasma?", listOf("7-40 IU/L", "1-7 IU/L", "100-150 IU/L", "150-200 IU/L"), "Science", "Alanine aminotransferase (ALT) is a liver enzyme; its normal plasma concentration is 7-40 IU/L, with elevation often indicating liver damage."),
            zh = LocalizedContent("血浆中转氨酶（ALT）的浓度是多少？", listOf("7-40 IU/L", "1-7 IU/L", "100-150 IU/L", "150-200 IU/L"), "科学", "丙氨酸氨基转移酶（ALT）是一种肝酶；其正常血浆浓度为7-40 IU/L，升高通常表明肝损伤。"),
            es = LocalizedContent("¿Cuál es la concentración de transaminasa (ALT) en el plasma?", listOf("7-40 UI/L", "1-7 UI/L", "100-150 UI/L", "150-200 UI/L"), "Ciencia", "La alanina aminotransferasa (ALT) es una enzima hepática; su concentración plasmática normal es de 7-40 UI/L, y su elevación suele indicar daño hepático.")
        ),
        BilingualQuestion(
            id = 8926, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus conducteur thermique?", listOf("Argent", "Cuivre", "Or", "Aluminium"), "Science", "L'argent possède la conductivité thermique la plus élevée de tous les éléments, devant le cuivre et l'or, grâce à sa structure cristalline et à ses électrons libres."),
            en = LocalizedContent("Which chemical element is the most thermally conductive?", listOf("Silver", "Copper", "Gold", "Aluminum"), "Science", "Silver has the highest thermal conductivity of all elements, ahead of copper and gold, due to its crystal structure and free electrons."),
            zh = LocalizedContent("哪种化学元素导热性最好？", listOf("银", "铜", "金", "铝"), "科学", "银的导热性是所有元素中最高的，优于铜和金，这归功于其晶体结构和自由电子。"),
            es = LocalizedContent("¿Qué elemento químico es el más conductor térmico?", listOf("Plata", "Cobre", "Oro", "Aluminio"), "Ciencia", "La plata posee la conductividad térmica más alta de todos los elementos, por delante del cobre y el oro, gracias a su estructura cristalina y sus electrones libres.")
        ),
        BilingualQuestion(
            id = 8927, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les monopôles magnétiques?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les monopôles magnétiques n'ont jamais été observés expérimentalement, mais leur existence est prédite par certaines théories physiques, notamment la mécanique quantique. Paul Dirac en a proposé l'existence théorique en 1931."),
            en = LocalizedContent("Which scientist discovered magnetic monopoles?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Magnetic monopoles have never been observed experimentally, but their existence is predicted by some physical theories, notably quantum mechanics. Paul Dirac proposed their theoretical existence in 1931."),
            zh = LocalizedContent("哪位科学家发现了磁单极子？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "磁单极子从未被实验观测到，但某些物理理论（尤其是量子力学）预测了它们的存在。保罗·狄拉克于1931年提出了它们的理论存在。"),
            es = LocalizedContent("¿Qué científico descubrió los monopolos magnéticos?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Los monopolos magnéticos nunca se han observado experimentalmente, pero su existencia es predicha por algunas teorías físicas, especialmente la mecánica cuántica. Paul Dirac propuso su existencia teórica en 1931.")
        ),
        BilingualQuestion(
            id = 8928, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du pentacène?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Science", "Le pentacène est un hydrocarbure aromatique polycyclique composé de 22 atomes de carbone et 14 atomes d'hydrogène, d'où sa formule brute C22H14."),
            en = LocalizedContent("What is the chemical symbol of pentacene?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Science", "Pentacene is a polycyclic aromatic hydrocarbon composed of 22 carbon atoms and 14 hydrogen atoms, hence its molecular formula C22H14."),
            zh = LocalizedContent("并五苯的化学符号是什么？", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "科学", "并五苯是一种多环芳烃，由22个碳原子和14个氢原子组成，因此其分子式为C22H14。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del pentaceno?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Ciencia", "El pentaceno es un hidrocarburo aromático policíclico compuesto por 22 átomos de carbono y 14 átomos de hidrógeno, de ahí su fórmula molecular C22H14.")
        ),
        BilingualQuestion(
            id = 8929, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de corpuscules de Meissner a la peau?", listOf("~40000", "~10000", "~100000", "~200000"), "Science", "Les corpuscules de Meissner sont des récepteurs tactiles situés dans la peau, principalement au niveau des zones sensibles comme les doigts, et leur nombre total est estimé à environ 40 000 chez l'adulte."),
            en = LocalizedContent("How many Meissner's corpuscles are in the skin?", listOf("~40000", "~10000", "~100000", "~200000"), "Science", "Meissner's corpuscles are tactile receptors located in the skin, mainly in sensitive areas like fingers, and their total number is estimated at about 40,000 in adults."),
            zh = LocalizedContent("皮肤中有多少个迈斯纳小体？", listOf("~40000", "~10000", "~100000", "~200000"), "科学", "迈斯纳小体是位于皮肤中的触觉感受器，主要分布在手指等敏感区域，成年人的总数估计约为40,000个。"),
            es = LocalizedContent("¿Cuántos corpúsculos de Meissner hay en la piel?", listOf("~40000", "~10000", "~100000", "~200000"), "Ciencia", "Los corpúsculos de Meissner son receptores táctiles ubicados en la piel, principalmente en áreas sensibles como los dedos, y su número total se estima en aproximadamente 40,000 en adultos.")
        ),
    )
}
