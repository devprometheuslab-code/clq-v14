package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 1 : 500 questions bilingues */
object QuestionsBilingualGenerated_1 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 1, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule chimique de l'eau ?", listOf("H2O", "CO2", "O2", "H2SO4"), "Science", ""),
            en = LocalizedContent("What is the chemical formula for water?", listOf("H2O", "CO2", "O2", "H2SO4"), "Science", "")
        ),
        BilingualQuestion(
            id = 2, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'os y a-t-il dans le corps humain adulte ?", listOf("206", "186", "226", "196"), "Science", ""),
            en = LocalizedContent("How many bones are there in an adult human body?", listOf("206", "186", "226", "196"), "Science", "")
        ),
        BilingualQuestion(
            id = 3, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique de l'or ?", listOf("Au", "Ag", "Fe", "Or"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for gold?", listOf("Au", "Ag", "Fe", "Or"), "Science", "")
        ),
        BilingualQuestion(
            id = 4, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("À quelle vitesse voyage la lumière (km/s) ?", listOf("299 792", "150 000", "500 000", "199 792"), "Science", ""),
            en = LocalizedContent("At what speed does light travel (km/s)?", listOf("299 792", "150 000", "500 000", "199 792"), "Science", "")
        ),
        BilingualQuestion(
            id = 5, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz est le plus abondant dans l'atmosphère terrestre ?", listOf("Azote", "Oxygène", "CO2", "Argon"), "Science", ""),
            en = LocalizedContent("Which gas is the most abundant in Earth's atmosphere?", listOf("Nitrogen", "Oxygen", "CO2", "Argon"), "Science", "")
        ),
        BilingualQuestion(
            id = 6, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de chromosomes dans une cellule humaine normale ?", listOf("46", "23", "48", "44"), "Science", ""),
            en = LocalizedContent("What is the number of chromosomes in a normal human cell?", listOf("46", "23", "48", "44"), "Science", "")
        ),
        BilingualQuestion(
            id = 7, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la particule élémentaire de charge positive ?", listOf("Proton", "Neutron", "Electron", "Photon"), "Science", ""),
            en = LocalizedContent("What is the elementary particle with positive charge?", listOf("Proton", "Neutron", "Electron", "Photon"), "Science", "")
        ),
        BilingualQuestion(
            id = 8, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle planète a le plus grand nombre de lunes connues ?", listOf("Saturne", "Jupiter", "Uranus", "Neptune"), "Science", ""),
            en = LocalizedContent("Which planet has the greatest number of known moons?", listOf("Saturn", "Jupiter", "Uranus", "Neptune"), "Science", "")
        ),
        BilingualQuestion(
            id = 9, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel element du tableau periodique a le numero atomique 26 ?", listOf("Fe", "Fr", "Fo", "Fi"), "Science", ""),
            en = LocalizedContent("What element on the periodic table has atomic number 26?", listOf("Fe", "Fr", "Fo", "Fi"), "Science", "")
        ),
        BilingualQuestion(
            id = 10, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de planètes composent le système solaire ?", listOf("8", "9", "7", "10"), "Science", ""),
            en = LocalizedContent("How many planets make up the solar system?", listOf("8", "9", "7", "10"), "Science", "")
        ),
        BilingualQuestion(
            id = 11, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la planète la plus proche du Soleil ?", listOf("Mercure", "Vénus", "Mars", "Terre"), "Science", ""),
            en = LocalizedContent("Which planet is closest to the Sun?", listOf("Mercury", "Venus", "Mars", "Earth"), "Science", "")
        ),
        BilingualQuestion(
            id = 12, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a développé la théorie de la relativité ?", listOf("Albert Einstein", "Isaac Newton", "Niels Bohr", "Max Planck"), "Science", ""),
            en = LocalizedContent("Which scientist developed the theory of relativity?", listOf("Albert Einstein", "Isaac Newton", "Niels Bohr", "Max Planck"), "Science", "")
        ),
        BilingualQuestion(
            id = 13, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule chimique du dioxyde de carbone ?", listOf("CO2", "CO", "C2O", "O2C"), "Science", ""),
            en = LocalizedContent("What is the chemical formula for carbon dioxide?", listOf("CO2", "CO", "C2O", "O2C"), "Science", "")
        ),
        BilingualQuestion(
            id = 14, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel organe produit l'insuline ?", listOf("Le pancréas", "Le foie", "Les reins", "La rate"), "Science", ""),
            en = LocalizedContent("Which organ produces insulin?", listOf("The pancreas", "The liver", "The kidneys", "The spleen"), "Science", "")
        ),
        BilingualQuestion(
            id = 15, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la température d'ébullition de l'eau à pression normale (°C) ?", listOf("100", "90", "110", "95"), "Science", ""),
            en = LocalizedContent("What is the boiling point of water at normal pressure (°C)?", listOf("100", "90", "110", "95"), "Science", "")
        ),
        BilingualQuestion(
            id = 16, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'élément le plus léger du tableau périodique ?", listOf("Hydrogène", "Hélium", "Lithium", "Carbone"), "Science", ""),
            en = LocalizedContent("What is the lightest element on the periodic table?", listOf("Hydrogen", "Helium", "Lithium", "Carbon"), "Science", "")
        ),
        BilingualQuestion(
            id = 17, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle force maintient les planètes en orbite autour du Soleil ?", listOf("La gravité", "L'électromagnétisme", "La force nucléaire forte", "La pression solaire"), "Science", ""),
            en = LocalizedContent("What force keeps planets in orbit around the Sun?", listOf("Gravity", "Electromagnetism", "The strong nuclear force", "Solar pressure"), "Science", "")
        ),
        BilingualQuestion(
            id = 18, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents a un adulte avec toutes ses dents de sagesse ?", listOf("32", "28", "30", "34"), "Science", ""),
            en = LocalizedContent("How many teeth does an adult have with all wisdom teeth?", listOf("32", "28", "30", "34"), "Science", "")
        ),
        BilingualQuestion(
            id = 19, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand organe du corps humain ?", listOf("La peau", "Le foie", "Le cerveau", "L'intestin"), "Science", ""),
            en = LocalizedContent("What is the largest organ of the human body?", listOf("The skin", "The liver", "The brain", "The intestines"), "Science", "")
        ),
        BilingualQuestion(
            id = 20, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la distance moyenne Terre-Lune (en km) ?", listOf("384 400", "150 000", "500 000", "240 000"), "Science", ""),
            en = LocalizedContent("What is the average distance between Earth and the Moon (in km)?", listOf("384 400", "150 000", "500 000", "240 000"), "Science", "")
        ),
        BilingualQuestion(
            id = 21, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le numéro atomique de l'oxygène ?", listOf("8", "6", "7", "10"), "Science", ""),
            en = LocalizedContent("What is the atomic number of oxygen?", listOf("8", "6", "7", "10"), "Science", "")
        ),
        BilingualQuestion(
            id = 22, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de chambres contient le cœur humain ?", listOf("4", "2", "3", "6"), "Science", ""),
            en = LocalizedContent("How many chambers does the human heart contain?", listOf("4", "2", "3", "6"), "Science", "")
        ),
        BilingualQuestion(
            id = 23, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle planète est surnommée la 'planète rouge' ?", listOf("Mars", "Jupiter", "Saturne", "Mercure"), "Science", ""),
            en = LocalizedContent("Which planet is nicknamed the 'red planet'?", listOf("Mars", "Jupiter", "Saturn", "Mercury"), "Science", "")
        ),
        BilingualQuestion(
            id = 24, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la loi de Newton reliant force, masse et accélération ?", listOf("F = m × a", "E = mc²", "F = mv", "F = m/a"), "Science", ""),
            en = LocalizedContent("What is Newton's law relating force, mass, and acceleration?", listOf("F = m × a", "E = mc²", "F = mv", "F = m/a"), "Science", "")
        ),
        BilingualQuestion(
            id = 25, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du processus par lequel les plantes fabriquent leur nourriture ?", listOf("Photosynthèse", "Respiration", "Fermentation", "Osmose"), "Science", ""),
            en = LocalizedContent("What is the name of the process by which plants manufacture their food?", listOf("Photosynthesis", "Respiration", "Fermentation", "Osmosis"), "Science", "")
        ),
        BilingualQuestion(
            id = 26, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la vitesse du son dans l'air (m/s) ?", listOf("340", "300", "450", "250"), "Science", ""),
            en = LocalizedContent("What is the speed of sound in air (m/s)?", listOf("340", "300", "450", "250"), "Science", "")
        ),
        BilingualQuestion(
            id = 27, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel os est le plus long du corps humain ?", listOf("Le fémur", "Le tibia", "L'humérus", "Le radius"), "Science", ""),
            en = LocalizedContent("Which bone is the longest in the human body?", listOf("The femur", "The tibia", "The humerus", "The radius"), "Science", "")
        ),
        BilingualQuestion(
            id = 28, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la formule de l'acide chlorhydrique ?", listOf("HCl", "H2SO4", "HNO3", "H3PO4"), "Science", ""),
            en = LocalizedContent("What is the formula for hydrochloric acid?", listOf("HCl", "H2SO4", "HNO3", "H3PO4"), "Science", "")
        ),
        BilingualQuestion(
            id = 29, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("De quoi est composé le noyau atomique ?", listOf("Protons et neutrons", "Electrons et protons", "Neutrons seulement", "Electrons seulement"), "Science", ""),
            en = LocalizedContent("What is the atomic nucleus composed of?", listOf("Protons and neutrons", "Electrons and protons", "Neutrons only", "Electrons only"), "Science", "")
        ),
        BilingualQuestion(
            id = 30, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la constante de Planck (ordre de grandeur) ?", listOf("6.626 × 10⁻³⁴ J·s", "6.022 × 10²³", "1.38 × 10⁻²³ J/K", "9.109 × 10⁻³¹ kg"), "Science", ""),
            en = LocalizedContent("What is Planck's constant (order of magnitude)?", listOf("6.626 × 10⁻³⁴ J·s", "6.022 × 10²³", "1.38 × 10⁻²³ J/K", "9.109 × 10⁻³¹ kg"), "Science", "")
        ),
        BilingualQuestion(
            id = 31, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a formulé le premier le théorème des nombres premiers ?", listOf("Gauss", "Euler", "Euclide", "Riemann"), "Science", ""),
            en = LocalizedContent("Who first formulated the prime number theorem?", listOf("Gauss", "Euler", "Euclid", "Riemann"), "Science", "")
        ),
        BilingualQuestion(
            id = 32, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la plus petite unité de matière selon la physique quantique ?", listOf("Quark", "Proton", "Neutron", "Electron"), "Science", ""),
            en = LocalizedContent("What is the name of the smallest unit of matter according to quantum physics?", listOf("Quark", "Proton", "Neutron", "Electron"), "Science", "")
        ),
        BilingualQuestion(
            id = 33, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pH d'une solution neutre ?", listOf("7", "0", "14", "5"), "Science", ""),
            en = LocalizedContent("What is the pH of a neutral solution?", listOf("7", "0", "14", "5"), "Science", "")
        ),
        BilingualQuestion(
            id = 34, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert la pénicilline ?", listOf("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Robert Koch"), "Science", ""),
            en = LocalizedContent("Which scientist discovered penicillin?", listOf("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Robert Koch"), "Science", "")
        ),
        BilingualQuestion(
            id = 35, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de litres de sang environ contient le corps humain ?", listOf("5 à 6", "2 à 3", "8 à 10", "1 à 2"), "Science", ""),
            en = LocalizedContent("Approximately how many liters of blood does the human body contain?", listOf("5 to 6", "2 to 3", "8 to 10", "1 to 2"), "Science", "")
        ),
        BilingualQuestion(
            id = 36, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la durée d'une révolution de la Terre autour du Soleil ?", listOf("365,25 jours", "360 jours", "366 jours", "354 jours"), "Science", ""),
            en = LocalizedContent("What is the duration of Earth's revolution around the Sun?", listOf("365.25 days", "360 days", "366 days", "354 days"), "Science", "")
        ),
        BilingualQuestion(
            id = 37, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz les plantes absorbent-elles lors de la photosynthèse ?", listOf("CO2", "O2", "N2", "H2"), "Science", ""),
            en = LocalizedContent("What gas do plants absorb during photosynthesis?", listOf("CO2", "O2", "N2", "H2"), "Science", "")
        ),
        BilingualQuestion(
            id = 38, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien y a-t-il d'éléments dans le tableau périodique actuel ?", listOf("118", "92", "108", "126"), "Science", ""),
            en = LocalizedContent("How many elements are in the current periodic table?", listOf("118", "92", "108", "126"), "Science", "")
        ),
        BilingualQuestion(
            id = 39, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la masse approximative de la Terre en kg ?", listOf("5.97 × 10²⁴", "1.99 × 10³⁰", "7.35 × 10²²", "3.30 × 10²³"), "Science", ""),
            en = LocalizedContent("What is the approximate mass of Earth in kg?", listOf("5.97 × 10²⁴", "1.99 × 10³⁰", "7.35 × 10²²", "3.30 × 10²³"), "Science", "")
        ),
        BilingualQuestion(
            id = 40, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de rayonnement electromagnetique est utilise pour chauffer rapidement les aliments dans un four de cuisine ?", listOf("Micro-ondes", "Infrarouges", "UV", "Rayons X"), "Science", ""),
            en = LocalizedContent("What type of electromagnetic radiation is used to quickly heat food in a kitchen microwave oven?", listOf("Microwaves", "Infrared", "UV", "X-rays"), "Science", "")
        ),
        BilingualQuestion(
            id = 101, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a eu lieu la Révolution française ?", listOf("1789", "1799", "1776", "1804"), "Histoire", ""),
            en = LocalizedContent("In which year did the French Revolution take place?", listOf("1789", "1799", "1776", "1804"), "History", "")
        ),
        BilingualQuestion(
            id = 102, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le premier Président des États-Unis ?", listOf("George Washington", "Abraham Lincoln", "Thomas Jefferson", "Benjamin Franklin"), "Histoire", ""),
            en = LocalizedContent("Who was the first President of the United States?", listOf("George Washington", "Abraham Lincoln", "Thomas Jefferson", "Benjamin Franklin"), "History", "")
        ),
        BilingualQuestion(
            id = 103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le mur de Berlin est-il tombé ?", listOf("1989", "1991", "1987", "1985"), "Histoire", ""),
            en = LocalizedContent("In which year did the Berlin Wall fall?", listOf("1989", "1991", "1987", "1985"), "History", "")
        ),
        BilingualQuestion(
            id = 104, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle civilisation a construit les pyramides de Gizeh ?", listOf("Égyptienne", "Romaine", "Grecque", "Mésopotamienne"), "Histoire", ""),
            en = LocalizedContent("Which civilization built the Pyramids of Giza?", listOf("Egyptian", "Roman", "Greek", "Mesopotamian"), "History", "")
        ),
        BilingualQuestion(
            id = 105, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'L'Art de la Guerre' ?", listOf("Sun Tzu", "Confucius", "Lao Tseu", "Zhuge Liang"), "Histoire", ""),
            en = LocalizedContent("Who wrote 'The Art of War'?", listOf("Sun Tzu", "Confucius", "Laozi", "Zhuge Liang"), "History", "")
        ),
        BilingualQuestion(
            id = 106, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il été exilé à Sainte-Hélène ?", listOf("1815", "1812", "1814", "1821"), "Histoire", ""),
            en = LocalizedContent("In which year was Napoleon exiled to Saint Helena?", listOf("1815", "1812", "1814", "1821"), "History", "")
        ),
        BilingualQuestion(
            id = 107, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année fut fondée la ville de Constantinople ?", listOf("330", "476", "285", "395"), "Histoire", ""),
            en = LocalizedContent("In which year was the city of Constantinople founded?", listOf("330", "476", "285", "395"), "History", "")
        ),
        BilingualQuestion(
            id = 108, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle guerre a eu lieu entre 1914 et 1918 ?", listOf("Première Guerre mondiale", "Seconde Guerre mondiale", "Guerre de Crimée", "Guerre franco-prussienne"), "Histoire", ""),
            en = LocalizedContent("Which war took place between 1914 and 1918?", listOf("World War I", "World War II", "Crimean War", "Franco-Prussian War"), "History", "")
        ),
        BilingualQuestion(
            id = 109, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a dirigé l'Allemagne nazie ?", listOf("Adolf Hitler", "Heinrich Himmler", "Joseph Goebbels", "Hermann Göring"), "Histoire", ""),
            en = LocalizedContent("Who led Nazi Germany?", listOf("Adolf Hitler", "Heinrich Himmler", "Joseph Goebbels", "Hermann Göring"), "History", "")
        ),
        BilingualQuestion(
            id = 110, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Christophe Colomb a-t-il découvert l'Amérique ?", listOf("1492", "1498", "1488", "1502"), "Histoire", ""),
            en = LocalizedContent("In which year did Christopher Columbus discover America?", listOf("1492", "1498", "1488", "1502"), "History", "")
        ),
        BilingualQuestion(
            id = 111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la date de la prise de la Bastille ?", listOf("14 juillet 1789", "4 août 1789", "26 août 1789", "5 mai 1789"), "Histoire", ""),
            en = LocalizedContent("What is the date of the storming of the Bastille?", listOf("July 14, 1789", "August 4, 1789", "August 26, 1789", "May 5, 1789"), "History", "")
        ),
        BilingualQuestion(
            id = 112, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était le pharaon lors de la construction de la Grande Pyramide ?", listOf("Khéops", "Ramsès II", "Toutankhamon", "Khéphren"), "Histoire", ""),
            en = LocalizedContent("Who was the pharaoh during the construction of the Great Pyramid?", listOf("Khufu", "Ramesses II", "Tutankhamun", "Khafre"), "History", "")
        ),
        BilingualQuestion(
            id = 113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année s'est terminée la Seconde Guerre mondiale ?", listOf("1945", "1944", "1946", "1943"), "Histoire", ""),
            en = LocalizedContent("In which year did World War II end?", listOf("1945", "1944", "1946", "1943"), "History", "")
        ),
        BilingualQuestion(
            id = 114, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire était le plus grand de l'histoire en superficie ?", listOf("Empire mongol", "Empire britannique", "Empire romain", "Empire ottoman"), "Histoire", ""),
            en = LocalizedContent("Which empire was the largest in history by area?", listOf("Mongol Empire", "British Empire", "Roman Empire", "Ottoman Empire"), "History", "")
        ),
        BilingualQuestion(
            id = 115, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier homme à marcher sur la Lune ?", listOf("Neil Armstrong", "Buzz Aldrin", "Youri Gagarine", "John Glenn"), "Histoire", ""),
            en = LocalizedContent("Who was the first person to walk on the Moon?", listOf("Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "John Glenn"), "History", "")
        ),
        BilingualQuestion(
            id = 116, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la France a-t-elle abolit l'esclavage définitivement ?", listOf("1848", "1789", "1794", "1815"), "Histoire", ""),
            en = LocalizedContent("In which year did France definitively abolish slavery?", listOf("1848", "1789", "1794", "1815"), "History", "")
        ),
        BilingualQuestion(
            id = 117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été assassiné le 22 novembre 1963 ?", listOf("John F. Kennedy", "Martin Luther King", "Malcolm X", "Robert Kennedy"), "Histoire", ""),
            en = LocalizedContent("Who was assassinated on November 22, 1963?", listOf("John F. Kennedy", "Martin Luther King", "Malcolm X", "Robert Kennedy"), "History", "")
        ),
        BilingualQuestion(
            id = 118, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle bataille de 1815 marque la défaite définitive de Napoléon ?", listOf("Waterloo", "Austerlitz", "Borodino", "Leipzig"), "Histoire", ""),
            en = LocalizedContent("Which 1815 battle marked Napoleon's definitive defeat?", listOf("Waterloo", "Austerlitz", "Borodino", "Leipzig"), "History", "")
        ),
        BilingualQuestion(
            id = 119, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a eu lieu la Révolution russe bolchévique ?", listOf("1917", "1905", "1922", "1914"), "Histoire", ""),
            en = LocalizedContent("In which year did the Bolshevik Russian Revolution take place?", listOf("1917", "1905", "1922", "1914"), "History", "")
        ),
        BilingualQuestion(
            id = 120, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le roi de France pendant la Révolution française ?", listOf("Louis XVI", "Louis XIV", "Louis XV", "Charles X"), "Histoire", ""),
            en = LocalizedContent("Who was the King of France during the French Revolution?", listOf("Louis XVI", "Louis XIV", "Louis XV", "Charles X"), "History", "")
        ),
        BilingualQuestion(
            id = 121, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle cité antique a été détruite par l'éruption du Vésuve en 79 ap. J.-C. ?", listOf("Pompéi", "Herculanum", "Stabies", "Oplontis"), "Histoire", ""),
            en = LocalizedContent("Which ancient city was destroyed by the eruption of Mount Vesuvius in 79 AD?", listOf("Pompeii", "Herculaneum", "Stabiae", "Oplontis"), "History", "")
        ),
        BilingualQuestion(
            id = 122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la France a-t-elle été libérée de l'occupation nazie ?", listOf("1944", "1943", "1945", "1942"), "Histoire", ""),
            en = LocalizedContent("In which year was France liberated from Nazi occupation?", listOf("1944", "1943", "1945", "1942"), "History", "")
        ),
        BilingualQuestion(
            id = 123, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a dirigé l'URSS pendant la Seconde Guerre mondiale ?", listOf("Staline", "Lénine", "Khrouchtchev", "Brejnev"), "Histoire", ""),
            en = LocalizedContent("Who led the USSR during World War II?", listOf("Stalin", "Lenin", "Khrushchev", "Brezhnev"), "History", "")
        ),
        BilingualQuestion(
            id = 124, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Nelson Mandela est-il sorti de prison ?", listOf("1990", "1994", "1988", "1992"), "Histoire", ""),
            en = LocalizedContent("In which year was Nelson Mandela released from prison?", listOf("1990", "1994", "1988", "1992"), "History", "")
        ),
        BilingualQuestion(
            id = 125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle guerre a duré de 1950 à 1953 ?", listOf("Guerre de Corée", "Guerre du Vietnam", "Guerre des Malouines", "Guerre d'Indochine"), "Histoire", ""),
            en = LocalizedContent("Which war lasted from 1950 to 1953?", listOf("Korean War", "Vietnam War", "Falkland Islands War", "Indochina War"), "History", "")
        ),
        BilingualQuestion(
            id = 126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a eu lieu l'attentat du 11 septembre ?", listOf("2001", "2003", "1999", "2005"), "Histoire", ""),
            en = LocalizedContent("In which year did the September 11 attacks occur?", listOf("2001", "2003", "1999", "2005"), "History", "")
        ),
        BilingualQuestion(
            id = 127, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi d'Angleterre a eu six femmes ?", listOf("Henri VIII", "Henri IV", "Charles II", "Richard III"), "Histoire", ""),
            en = LocalizedContent("Which King of England had six wives?", listOf("Henry VIII", "Henry IV", "Charles II", "Richard III"), "History", "")
        ),
        BilingualQuestion(
            id = 128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle était la monnaie de la France avant l'euro ?", listOf("Le franc", "Le louis", "L'écu", "La livre"), "Histoire", ""),
            en = LocalizedContent("What was France's currency before the euro?", listOf("The franc", "The louis", "The ecu", "The pound"), "History", "")
        ),
        BilingualQuestion(
            id = 129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Chine populaire a-t-elle été fondée ?", listOf("1949", "1945", "1955", "1937"), "Histoire", ""),
            en = LocalizedContent("In which year was the People's Republic of China founded?", listOf("1949", "1945", "1955", "1937"), "History", "")
        ),
        BilingualQuestion(
            id = 130, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel général a prononcé l'Appel du 18 juin 1940 ?", listOf("Charles de Gaulle", "Philippe Pétain", "Jean de Lattre de Tassigny", "Georges Pompidou"), "Histoire", ""),
            en = LocalizedContent("Which general made the Appeal of June 18, 1940?", listOf("Charles de Gaulle", "Philippe Pétain", "Jean de Lattre de Tassigny", "Georges Pompidou"), "History", "")
        ),
        BilingualQuestion(
            id = 201, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Japon ?", listOf("Tokyo", "Osaka", "Kyoto", "Hiroshima"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Japan?", listOf("Tokyo", "Osaka", "Kyoto", "Hiroshima"), "Geography", "")
        ),
        BilingualQuestion(
            id = 202, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus long fleuve du monde ?", listOf("Le Nil", "L'Amazone", "Le Yangtsé", "Le Mississippi"), "Géographie", ""),
            en = LocalizedContent("What is the longest river in the world?", listOf("The Nile", "The Amazon", "The Yangtze", "The Mississippi"), "Geography", "")
        ),
        BilingualQuestion(
            id = 203, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pays composent l'Afrique ?", listOf("54", "48", "52", "56"), "Géographie", ""),
            en = LocalizedContent("How many countries are in Africa?", listOf("54", "48", "52", "56"), "Geography", "")
        ),
        BilingualQuestion(
            id = 204, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert du monde ?", listOf("Antarctique", "Sahara", "Gobi", "Arabie"), "Géographie", ""),
            en = LocalizedContent("What is the largest desert in the world?", listOf("Antarctica", "Sahara", "Gobi", "Arabian"), "Geography", "")
        ),
        BilingualQuestion(
            id = 205, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de l'Australie ?", listOf("Canberra", "Sydney", "Melbourne", "Brisbane"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Australia?", listOf("Canberra", "Sydney", "Melbourne", "Brisbane"), "Geography", "")
        ),
        BilingualQuestion(
            id = 206, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le pays avec le plus de fuseaux horaires ?", listOf("France", "Russie", "États-Unis", "Chine"), "Géographie", ""),
            en = LocalizedContent("Which country has the most time zones?", listOf("France", "Russia", "United States", "China"), "Geography", "")
        ),
        BilingualQuestion(
            id = 207, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Brésil ?", listOf("Brasilia", "Rio de Janeiro", "São Paulo", "Salvador"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Brazil?", listOf("Brasília", "Rio de Janeiro", "São Paulo", "Salvador"), "Geography", "")
        ),
        BilingualQuestion(
            id = 208, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet du monde ?", listOf("L'Everest", "Le K2", "Le Kangchenjunga", "Le Lhotse"), "Géographie", ""),
            en = LocalizedContent("What is the highest peak in the world?", listOf("Mount Everest", "K2", "Kangchenjunga", "Lhotse"), "Geography", "")
        ),
        BilingualQuestion(
            id = 209, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Argentine ?", listOf("Buenos Aires", "Córdoba", "Rosario", "Mendoza"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Argentina?", listOf("Buenos Aires", "Córdoba", "Rosario", "Mendoza"), "Geography", "")
        ),
        BilingualQuestion(
            id = 210, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel ocean est le plus grand ?", listOf("Pacifique", "Atlantique", "Indien", "Arctique"), "Géographie", ""),
            en = LocalizedContent("Which ocean is the largest?", listOf("Pacific", "Atlantic", "Indian", "Arctic"), "Geography", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 211, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Inde ?", listOf("New Delhi", "Mumbai", "Calcutta", "Chennai"), "Géographie", ""),
            en = LocalizedContent("What is the capital of India?", listOf("New Delhi", "Mumbai", "Kolkata", "Chennai"), "Geography", "")
        ),
        BilingualQuestion(
            id = 212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays le plus peuplé du monde ?", listOf("Inde", "Chine", "États-Unis", "Indonésie"), "Géographie", ""),
            en = LocalizedContent("What is the most populous country in the world?", listOf("India", "China", "United States", "Indonesia"), "Geography", "")
        ),
        BilingualQuestion(
            id = 213, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Canada ?", listOf("Ottawa", "Toronto", "Montréal", "Vancouver"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Canada?", listOf("Ottawa", "Toronto", "Montreal", "Vancouver"), "Geography", "")
        ),
        BilingualQuestion(
            id = 214, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la plus grande île du monde ?", listOf("Groenland", "Nouvelle-Guinée", "Bornéo", "Madagascar"), "Géographie", ""),
            en = LocalizedContent("What is the largest island in the world?", listOf("Greenland", "New Guinea", "Borneo", "Madagascar"), "Geography", "")
        ),
        BilingualQuestion(
            id = 215, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays le plus grand du monde en superficie ?", listOf("Russie", "Canada", "États-Unis", "Chine"), "Géographie", ""),
            en = LocalizedContent("What is the largest country in the world by area?", listOf("Russia", "Canada", "United States", "China"), "Geography", "")
        ),
        BilingualQuestion(
            id = 216, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Espagne ?", listOf("Madrid", "Barcelone", "Séville", "Valence"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Spain?", listOf("Madrid", "Barcelona", "Seville", "Valencia"), "Geography", "")
        ),
        BilingualQuestion(
            id = 217, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays d'Afrique en superficie ?", listOf("Algérie", "RDC", "Soudan", "Libye"), "Géographie", ""),
            en = LocalizedContent("What is the largest country in Africa by area?", listOf("Algeria", "Democratic Republic of the Congo", "Sudan", "Libya"), "Geography", "")
        ),
        BilingualQuestion(
            id = 218, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la tour Eiffel ?", listOf("France", "Belgique", "Suisse", "Luxembourg"), "Géographie", ""),
            en = LocalizedContent("In which country is the Eiffel Tower located?", listOf("France", "Belgium", "Switzerland", "Luxembourg"), "Geography", "")
        ),
        BilingualQuestion(
            id = 219, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle mer sépare l'Europe de l'Afrique au niveau de Gibraltar ?", listOf("Mer Méditerranée", "Mer Noire", "Mer Rouge", "Mer du Nord"), "Géographie", ""),
            en = LocalizedContent("Which sea separates Europe from Africa at the level of Gibraltar?", listOf("Mediterranean Sea", "Black Sea", "Red Sea", "North Sea"), "Geography", "")
        ),
        BilingualQuestion(
            id = 220, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Mexique ?", listOf("Mexico City", "Guadalajara", "Monterrey", "Cancún"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Mexico?", listOf("Mexico City", "Guadalajara", "Monterrey", "Cancún"), "Geography", "")
        ),
        BilingualQuestion(
            id = 221, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve traverse la ville de Paris ?", listOf("La Seine", "La Loire", "Le Rhône", "La Garonne"), "Géographie", ""),
            en = LocalizedContent("Which river flows through the city of Paris?", listOf("The Seine", "The Loire", "The Rhône", "The Garonne"), "Geography", "")
        ),
        BilingualQuestion(
            id = 222, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de continents y a-t-il sur Terre ?", listOf("7", "5", "6", "8"), "Géographie", ""),
            en = LocalizedContent("How many continents are there on Earth?", listOf("7", "5", "6", "8"), "Geography", "")
        ),
        BilingualQuestion(
            id = 223, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Chine ?", listOf("Pékin", "Shanghai", "Canton", "Nankin"), "Géographie", ""),
            en = LocalizedContent("What is the capital of China?", listOf("Beijing", "Shanghai", "Guangzhou", "Nanjing"), "Geography", "")
        ),
        BilingualQuestion(
            id = 224, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays possède le plus grand réseau fluvial navigable ?", listOf("Brésil", "Russie", "Chine", "États-Unis"), "Géographie", ""),
            en = LocalizedContent("Which country has the largest navigable river network?", listOf("Brazil", "Russia", "China", "United States"), "Geography", "")
        ),
        BilingualQuestion(
            id = 225, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le point le plus bas de la surface terrestre ?", listOf("Mer Morte", "Lac Caspien", "Fosse des Mariannes", "Lac Assal"), "Géographie", ""),
            en = LocalizedContent("What is the lowest point on Earth's surface?", listOf("Dead Sea", "Caspian Sea", "Mariana Trench", "Lake Assal"), "Geography", "")
        ),
        BilingualQuestion(
            id = 226, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Italie ?", listOf("Rome", "Milan", "Naples", "Turin"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Italy?", listOf("Rome", "Milan", "Naples", "Turin"), "Geography", "")
        ),
        BilingualQuestion(
            id = 227, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Par combien de pays la France est-elle entourée ?", listOf("8", "6", "7", "5"), "Géographie", ""),
            en = LocalizedContent("How many countries surround France?", listOf("8", "6", "7", "5"), "Geography", "")
        ),
        BilingualQuestion(
            id = 228, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays a la plus longue frontière terrestre avec la Russie ?", listOf("Kazakhstan", "Chine", "Ukraine", "Finlande"), "Géographie", ""),
            en = LocalizedContent("Which country has the longest land border with Russia?", listOf("Kazakhstan", "China", "Ukraine", "Finland"), "Geography", "")
        ),
        BilingualQuestion(
            id = 229, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve Machu Picchu ?", listOf("Pérou", "Bolivie", "Chili", "Colombie"), "Géographie", ""),
            en = LocalizedContent("In which country is Machu Picchu located?", listOf("Peru", "Bolivia", "Chile", "Colombia"), "Geography", "")
        ),
        BilingualQuestion(
            id = 230, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'Afrique ?", listOf("Lac Victoria", "Lac Tanganyika", "Lac Malawi", "Lac Turkana"), "Géographie", ""),
            en = LocalizedContent("What is the largest lake in Africa?", listOf("Lake Victoria", "Lake Tanganyika", "Lake Malawi", "Lake Turkana"), "Geography", "")
        ),
        BilingualQuestion(
            id = 301, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cordes a une guitare classique ?", listOf("6", "4", "8", "5"), "Culture", ""),
            en = LocalizedContent("How many strings does a classical guitar have?", listOf("6", "4", "8", "5"), "Culture", "")
        ),
        BilingualQuestion(
            id = 302, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a peint la Joconde ?", listOf("Léonard de Vinci", "Michel-Ange", "Raphaël", "Botticelli"), "Culture", ""),
            en = LocalizedContent("Who painted the Mona Lisa?", listOf("Leonardo da Vinci", "Michelangelo", "Raphael", "Botticelli"), "Culture", "")
        ),
        BilingualQuestion(
            id = 303, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus pratiqué au monde ?", listOf("Football", "Basketball", "Cricket", "Tennis"), "Culture", ""),
            en = LocalizedContent("What is the most practiced sport in the world?", listOf("Football", "Basketball", "Cricket", "Tennis"), "Culture", "")
        ),
        BilingualQuestion(
            id = 304, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs composent une équipe de rugby à XV ?", listOf("15", "13", "11", "17"), "Culture", ""),
            en = LocalizedContent("How many players make up a rugby union team?", listOf("15", "13", "11", "17"), "Culture", "")
        ),
        BilingualQuestion(
            id = 305, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Les Misérables' ?", listOf("Victor Hugo", "Émile Zola", "Honoré de Balzac", "Alexandre Dumas"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Les Misérables'?", listOf("Victor Hugo", "Émile Zola", "Honoré de Balzac", "Alexandre Dumas"), "Culture", "")
        ),
        BilingualQuestion(
            id = 306, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays hôte des premiers Jeux olympiques modernes en 1896 ?", listOf("Grèce", "France", "Angleterre", "USA"), "Culture", ""),
            en = LocalizedContent("Which country hosted the first modern Olympic Games in 1896?", listOf("Greece", "France", "England", "USA"), "Culture", "")
        ),
        BilingualQuestion(
            id = 307, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste a peint la Chapelle Sixtine ?", listOf("Michel-Ange", "Léonard de Vinci", "Raphaël", "Botticelli"), "Culture", ""),
            en = LocalizedContent("Which artist painted the Sistine Chapel?", listOf("Michelangelo", "Leonardo da Vinci", "Raphael", "Botticelli"), "Culture", "")
        ),
        BilingualQuestion(
            id = 308, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la Cinquième Symphonie ?", listOf("Beethoven", "Mozart", "Bach", "Chopin"), "Culture", ""),
            en = LocalizedContent("Who composed the Fifth Symphony?", listOf("Beethoven", "Mozart", "Bach", "Chopin"), "Culture", "")
        ),
        BilingualQuestion(
            id = 309, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel celebre roman de Jules Verne suit Phileas Fogg dans son pari de faire le tour du globe ?", listOf("Le Tour du monde en 80 jours", "Vingt mille lieues sous les mers", "De la Terre à la Lune", "Voyage au centre de la Terre"), "Culture", ""),
            en = LocalizedContent("Which famous Jules Verne novel follows Phileas Fogg on his wager to travel around the world?", listOf("Around the World in Eighty Days", "Twenty Thousand Leagues Under the Sea", "From the Earth to the Moon", "Journey to the Center of the Earth"), "Culture", "")
        ),
        BilingualQuestion(
            id = 310, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le musée le plus visité au monde ?", listOf("Le Louvre", "Le British Museum", "Le Metropolitan Museum", "Le Vatican"), "Culture", ""),
            en = LocalizedContent("What is the most visited museum in the world?", listOf("The Louvre", "The British Museum", "The Metropolitan Museum", "The Vatican"), "Culture", "")
        ),
        BilingualQuestion(
            id = 311, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé le film 'Titanic' (1997) ?", listOf("James Cameron", "Steven Spielberg", "Peter Jackson", "Ridley Scott"), "Culture", ""),
            en = LocalizedContent("Who directed the film 'Titanic' (1997)?", listOf("James Cameron", "Steven Spielberg", "Peter Jackson", "Ridley Scott"), "Culture", "")
        ),
        BilingualQuestion(
            id = 312, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays est né Mozart ?", listOf("Autriche", "Allemagne", "Hongrie", "Suisse"), "Culture", ""),
            en = LocalizedContent("In which country was Mozart born?", listOf("Austria", "Germany", "Hungary", "Switzerland"), "Culture", "")
        ),
        BilingualQuestion(
            id = 313, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de livres composent la Bible chrétienne catholique ?", listOf("73", "66", "80", "60"), "Culture", ""),
            en = LocalizedContent("How many books make up the Catholic Christian Bible?", listOf("73", "66", "80", "60"), "Culture", "")
        ),
        BilingualQuestion(
            id = 314, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Don Quichotte' ?", listOf("Miguel de Cervantes", "Lope de Vega", "Francisco de Quevedo", "Tirso de Molina"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Don Quixote'?", listOf("Miguel de Cervantes", "Lope de Vega", "Francisco de Quevedo", "Tirso de Molina"), "Culture", "")
        ),
        BilingualQuestion(
            id = 315, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre est connu pour ses tableaux de tournesols ?", listOf("Van Gogh", "Monet", "Renoir", "Cézanne"), "Culture", ""),
            en = LocalizedContent("Which painter is known for his paintings of sunflowers?", listOf("Van Gogh", "Monet", "Renoir", "Cézanne"), "Culture", "")
        ),
        BilingualQuestion(
            id = 316, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de films composent la saga Star Wars originale ?", listOf("9", "6", "3", "12"), "Culture", ""),
            en = LocalizedContent("How many films make up the original Star Wars saga?", listOf("9", "6", "3", "12"), "Culture", "")
        ),
        BilingualQuestion(
            id = 317, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vrai nom de Marilyn Monroe ?", listOf("Norma Jeane Mortenson", "Betty Joan Perske", "Frances Ethel Gumm", "Anna Mae Bullock"), "Culture", ""),
            en = LocalizedContent("What is Marilyn Monroe's real name?", listOf("Norma Jeane Mortenson", "Betty Joan Perske", "Frances Ethel Gumm", "Anna Mae Bullock"), "Culture", "")
        ),
        BilingualQuestion(
            id = 318, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe de musique a sorti l'album 'Thriller' ?", listOf("Michael Jackson (seul)", "The Jackson 5", "Earth, Wind & Fire", "James Brown"), "Culture", ""),
            en = LocalizedContent("Which musical artist released the album 'Thriller'?", listOf("Michael Jackson", "The Jackson 5", "Earth, Wind & Fire", "James Brown"), "Culture", "")
        ),
        BilingualQuestion(
            id = 319, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de mètres mesure la tour Eiffel ?", listOf("330", "300", "275", "350"), "Culture", ""),
            en = LocalizedContent("How many meters tall is the Eiffel Tower?", listOf("330", "300", "275", "350"), "Culture", "")
        ),
        BilingualQuestion(
            id = 320, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Hamlet' ?", listOf("William Shakespeare", "Christopher Marlowe", "Ben Jonson", "John Milton"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Hamlet'?", listOf("William Shakespeare", "Christopher Marlowe", "Ben Jonson", "John Milton"), "Culture", "")
        ),
        BilingualQuestion(
            id = 321, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la langue la plus parlée au monde ?", listOf("Anglais", "Mandarin", "Espagnol", "Hindi"), "Culture", ""),
            en = LocalizedContent("What is the most spoken language in the world?", listOf("English", "Mandarin", "Spanish", "Hindi"), "Culture", ""),
            zh = LocalizedContent("世界上使用人数最多的语言是什么？", listOf("英语", "普通话", "西班牙语", "印地语"), "文化", ""),
            es = LocalizedContent("¿Cuál es el idioma más hablado del mundo?", listOf("Inglés", "Mandarín", "Español", "Hindi"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 322, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a peint 'La Nuit étoilée' ?", listOf("Van Gogh", "Gauguin", "Monet", "Renoir"), "Culture", ""),
            en = LocalizedContent("Who painted 'The Starry Night'?", listOf("Van Gogh", "Gauguin", "Monet", "Renoir"), "Culture", ""),
            zh = LocalizedContent("谁画了《星夜》？", listOf("梵高", "高更", "莫奈", "雷诺阿"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'La noche estrellada'?", listOf("Van Gogh", "Gauguin", "Monet", "Renoir"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 323, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel film a remporté le premier Oscar du meilleur film en 1929 ?", listOf("Les Ailes", "Sunrise", "Emil Jannings", "The Jazz Singer"), "Culture", ""),
            en = LocalizedContent("Which film won the first Academy Award for Best Picture in 1929?", listOf("Wings", "Sunrise", "Emil Jannings", "The Jazz Singer"), "Culture", ""),
            zh = LocalizedContent("哪部电影在1929年获得了第一届奥斯卡最佳影片奖？", listOf("翼", "日出", "埃米尔·詹宁斯", "爵士歌手"), "文化", ""),
            es = LocalizedContent("¿Qué película ganó el primer Premio de la Academia a la Mejor Película en 1929?", listOf("Alas", "Amanecer", "Emil Jannings", "El cantante de jazz"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 324, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel sportif a remporté le plus de médailles d'or olympiques ?", listOf("Michael Phelps", "Usain Bolt", "Carl Lewis", "Mark Spitz"), "Culture", ""),
            en = LocalizedContent("Which athlete has won the most Olympic gold medals?", listOf("Michael Phelps", "Usain Bolt", "Carl Lewis", "Mark Spitz"), "Culture", ""),
            zh = LocalizedContent("哪位运动员获得了最多的奥运金牌？", listOf("迈克尔·菲尔普斯", "尤塞恩·博尔特", "卡尔·刘易斯", "马克·施皮茨"), "文化", ""),
            es = LocalizedContent("¿Qué deportista ha ganado más medallas de oro olímpicas?", listOf("Michael Phelps", "Usain Bolt", "Carl Lewis", "Mark Spitz"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 325, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays est né Pablo Picasso ?", listOf("Espagne", "France", "Italie", "Portugal"), "Culture", ""),
            en = LocalizedContent("In which country was Pablo Picasso born?", listOf("Spain", "France", "Italy", "Portugal"), "Culture", ""),
            zh = LocalizedContent("巴勃罗·毕加索出生在哪个国家？", listOf("西班牙", "法国", "意大利", "葡萄牙"), "文化", ""),
            es = LocalizedContent("¿En qué país nació Pablo Picasso?", listOf("España", "Francia", "Italia", "Portugal"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 326, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier livre imprimé avec des caractères mobiles en Europe ?", listOf("La Bible de Gutenberg", "Les Canterbury Tales", "La Divine Comédie", "Don Quichotte"), "Culture", ""),
            en = LocalizedContent("What is the first book printed with movable type in Europe?", listOf("Gutenberg's Bible", "The Canterbury Tales", "The Divine Comedy", "Don Quixote"), "Culture", ""),
            zh = LocalizedContent("欧洲第一本用活字印刷的书是什么？", listOf("古腾堡圣经", "坎特伯雷故事集", "神曲", "堂吉诃德"), "文化", ""),
            es = LocalizedContent("¿Cuál es el primer libro impreso con tipos móviles en Europa?", listOf("La Biblia de Gutenberg", "Los cuentos de Canterbury", "La Divina Comedia", "Don Quijote"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 327, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'La République' ?", listOf("Platon", "Aristote", "Socrate", "Épicure"), "Culture", ""),
            en = LocalizedContent("Which philosopher wrote 'The Republic'?", listOf("Plato", "Aristotle", "Socrates", "Epicurus"), "Culture", ""),
            zh = LocalizedContent("哪位哲学家写了《理想国》？", listOf("柏拉图", "亚里士多德", "苏格拉底", "伊壁鸠鲁"), "文化", ""),
            es = LocalizedContent("¿Qué filósofo escribió 'La República'?", listOf("Platón", "Aristóteles", "Sócrates", "Epicuro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 328, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de sonnets Shakespeare a-t-il écrits ?", listOf("154", "100", "200", "120"), "Culture", ""),
            en = LocalizedContent("How many sonnets did Shakespeare write?", listOf("154", "100", "200", "120"), "Culture", ""),
            zh = LocalizedContent("莎士比亚写了多少首十四行诗？", listOf("154", "100", "200", "120"), "文化", ""),
            es = LocalizedContent("¿Cuántos sonetos escribió Shakespeare?", listOf("154", "100", "200", "120"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 329, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus long roman jamais écrit (en nombre de mots) ?", listOf("À la recherche du temps perdu", "Guerre et Paix", "Les Misérables", "Don Quichotte"), "Culture", ""),
            en = LocalizedContent("What is the longest novel ever written (in number of words)?", listOf("In Search of Lost Time", "War and Peace", "Les Misérables", "Don Quixote"), "Culture", ""),
            zh = LocalizedContent("有史以来最长的小说（按字数计）是哪一部？", listOf("追忆似水年华", "战争与和平", "悲惨世界", "堂吉诃德"), "文化", ""),
            es = LocalizedContent("¿Cuál es la novela más larga jamás escrita (en número de palabras)?", listOf("En busca del tiempo perdido", "Guerra y paz", "Los miserables", "Don Quijote"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 330, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle grande ville australienne se trouve le celebre opera en forme de coquillage ?", listOf("Sydney", "Melbourne", "Canberra", "Brisbane"), "Culture", ""),
            en = LocalizedContent("In which major Australian city is the famous shell-shaped opera house located?", listOf("Sydney", "Melbourne", "Canberra", "Brisbane"), "Culture", ""),
            zh = LocalizedContent("著名的贝壳形歌剧院位于澳大利亚的哪个主要城市？", listOf("悉尼", "墨尔本", "堪培拉", "布里斯班"), "文化", ""),
            es = LocalizedContent("¿En qué gran ciudad australiana se encuentra la famosa ópera con forma de concha?", listOf("Sídney", "Melbourne", "Canberra", "Brisbane"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 401, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier iPhone a-t-il été présenté ?", listOf("2007", "2005", "2009", "2003"), "Tech", ""),
            en = LocalizedContent("In which year was the first iPhone introduced?", listOf("2007", "2005", "2009", "2003"), "Technology", ""),
            zh = LocalizedContent("第一代iPhone是在哪一年发布的？", listOf("2007", "2005", "2009", "2003"), "科技", ""),
            es = LocalizedContent("¿En qué año se presentó el primer iPhone?", listOf("2007", "2005", "2009", "2003"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 402, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'CPU' ?", listOf("Central Processing Unit", "Core Power Unit", "Central Power Unit", "Computing Process Unit"), "Tech", ""),
            en = LocalizedContent("What does 'CPU' stand for?", listOf("Central Processing Unit", "Core Power Unit", "Central Power Unit", "Computing Process Unit"), "Technology", ""),
            zh = LocalizedContent("“CPU”代表什么？", listOf("中央处理器", "核心电源单元", "中央电源单元", "计算处理单元"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'CPU'?", listOf("Unidad Central de Procesamiento", "Unidad de Potencia Central", "Unidad Central de Energía", "Unidad de Proceso de Cómputo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 403, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage est utilisé pour styliser les pages web ?", listOf("CSS", "HTML", "JavaScript", "Python"), "Tech", ""),
            en = LocalizedContent("Which language is used to style web pages?", listOf("CSS", "HTML", "JavaScript", "Python"), "Technology", ""),
            zh = LocalizedContent("哪种语言用于网页样式设计？", listOf("CSS", "HTML", "JavaScript", "Python"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje se utiliza para dar estilo a las páginas web?", listOf("CSS", "HTML", "JavaScript", "Python"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 404, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de bits composent un octet ?", listOf("8", "4", "16", "32"), "Tech", ""),
            en = LocalizedContent("How many bits make up a byte?", listOf("8", "4", "16", "32"), "Technology", ""),
            zh = LocalizedContent("一个字节由多少位组成？", listOf("8", "4", "16", "32"), "科技", ""),
            es = LocalizedContent("¿Cuántos bits componen un byte?", listOf("8", "4", "16", "32"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 405, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé Microsoft ?", listOf("Bill Gates", "Steve Jobs", "Jeff Bezos", "Mark Zuckerberg"), "Tech", ""),
            en = LocalizedContent("Who founded Microsoft?", listOf("Bill Gates", "Steve Jobs", "Jeff Bezos", "Mark Zuckerberg"), "Technology", ""),
            zh = LocalizedContent("谁创立了微软？", listOf("比尔·盖茨", "史蒂夫·乔布斯", "杰夫·贝佐斯", "马克·扎克伯格"), "科技", ""),
            es = LocalizedContent("¿Quién fundó Microsoft?", listOf("Bill Gates", "Steve Jobs", "Jeff Bezos", "Mark Zuckerberg"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 406, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le World Wide Web a-t-il été inventé ?", listOf("1989", "1985", "1993", "1999"), "Tech", ""),
            en = LocalizedContent("In which year was the World Wide Web invented?", listOf("1989", "1985", "1993", "1999"), "Technology", ""),
            zh = LocalizedContent("万维网是在哪一年发明的？", listOf("1989", "1985", "1993", "1999"), "科技", ""),
            es = LocalizedContent("¿En qué año se inventó la World Wide Web?", listOf("1989", "1985", "1993", "1999"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 407, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système d'exploitation mobile le plus utilisé dans le monde ?", listOf("Android", "iOS", "Windows Phone", "Symbian"), "Tech", ""),
            en = LocalizedContent("What is the most used mobile operating system in the world?", listOf("Android", "iOS", "Windows Phone", "Symbian"), "Technology", ""),
            zh = LocalizedContent("世界上使用最广泛的移动操作系统是什么？", listOf("Android", "iOS", "Windows Phone", "Symbian"), "科技", ""),
            es = LocalizedContent("¿Cuál es el sistema operativo móvil más utilizado en el mundo?", listOf("Android", "iOS", "Windows Phone", "Symbian"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 408, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie 'HTTP' ?", listOf("HyperText Transfer Protocol", "High Transfer Text Protocol", "Hyper Transfer Technology Protocol", "HyperText Technology Protocol"), "Tech", ""),
            en = LocalizedContent("What does 'HTTP' stand for?", listOf("HyperText Transfer Protocol", "High Transfer Text Protocol", "Hyper Transfer Technology Protocol", "HyperText Technology Protocol"), "Technology", ""),
            zh = LocalizedContent("“HTTP”代表什么？", listOf("超文本传输协议", "高传输文本协议", "超传输技术协议", "超文本技术协议"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'HTTP'?", listOf("Protocolo de Transferencia de Hipertexto", "Protocolo de Texto de Alta Transferencia", "Protocolo de Tecnología de Hiper Transferencia", "Protocolo de Tecnología de Hipertexto"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 409, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le langage Python ?", listOf("Guido van Rossum", "James Gosling", "Brendan Eich", "Dennis Ritchie"), "Tech", ""),
            en = LocalizedContent("Who created the Python language?", listOf("Guido van Rossum", "James Gosling", "Brendan Eich", "Dennis Ritchie"), "Technology", ""),
            zh = LocalizedContent("谁创造了Python语言？", listOf("吉多·范罗苏姆", "詹姆斯·高斯林", "布兰登·艾奇", "丹尼斯·里奇"), "科技", ""),
            es = LocalizedContent("¿Quién creó el lenguaje Python?", listOf("Guido van Rossum", "James Gosling", "Brendan Eich", "Dennis Ritchie"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 410, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien vaut 1 To (téraoctet) ?", listOf("1 000 Go", "100 Go", "10 000 Go", "500 Go"), "Tech", ""),
            en = LocalizedContent("How much is 1 TB (terabyte)?", listOf("1,000 GB", "100 GB", "10,000 GB", "500 GB"), "Technology", ""),
            zh = LocalizedContent("1 TB（太字节）等于多少？", listOf("1000 GB", "100 GB", "10000 GB", "500 GB"), "科技", ""),
            es = LocalizedContent("¿Cuánto es 1 TB (terabyte)?", listOf("1,000 GB", "100 GB", "10,000 GB", "500 GB"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 411, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel protocole est utilisé pour envoyer des emails ?", listOf("SMTP", "FTP", "HTTP", "SSH"), "Tech", ""),
            en = LocalizedContent("Which protocol is used to send emails?", listOf("SMTP", "FTP", "HTTP", "SSH"), "Technology", ""),
            zh = LocalizedContent("哪个协议用于发送电子邮件？", listOf("SMTP", "FTP", "HTTP", "SSH"), "科技", ""),
            es = LocalizedContent("¿Qué protocolo se utiliza para enviar correos electrónicos?", listOf("SMTP", "FTP", "HTTP", "SSH"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 412, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a inventé le téléphone ?", listOf("Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "Samuel Morse"), "Tech", ""),
            en = LocalizedContent("Who invented the telephone?", listOf("Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "Samuel Morse"), "Technology", ""),
            zh = LocalizedContent("谁发明了电话？", listOf("亚历山大·格拉汉姆·贝尔", "托马斯·爱迪生", "尼古拉·特斯拉", "塞缪尔·莫尔斯"), "科技", ""),
            es = LocalizedContent("¿Quién inventó el teléfono?", listOf("Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "Samuel Morse"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 413, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le réseau social le plus utilisé dans le monde ?", listOf("Facebook", "Instagram", "TikTok", "Twitter"), "Tech", ""),
            en = LocalizedContent("What is the most used social network in the world?", listOf("Facebook", "Instagram", "TikTok", "Twitter"), "Technology", ""),
            zh = LocalizedContent("世界上使用最多的社交网络是什么？", listOf("Facebook", "Instagram", "TikTok", "Twitter"), "科技", ""),
            es = LocalizedContent("¿Cuál es la red social más utilizada en el mundo?", listOf("Facebook", "Instagram", "TikTok", "Twitter"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 414, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'RAM' ?", listOf("Random Access Memory", "Read Access Memory", "Rapid Access Memory", "Remote Access Memory"), "Tech", ""),
            en = LocalizedContent("What does 'RAM' stand for?", listOf("Random Access Memory", "Read Access Memory", "Rapid Access Memory", "Remote Access Memory"), "Technology", ""),
            zh = LocalizedContent("“RAM”代表什么？", listOf("随机存取存储器", "读取存取存储器", "快速存取存储器", "远程存取存储器"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'RAM'?", listOf("Random Access Memory", "Read Access Memory", "Rapid Access Memory", "Remote Access Memory"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 415, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a été fondée Apple ?", listOf("1976", "1984", "1972", "1980"), "Tech", ""),
            en = LocalizedContent("In which year was Apple founded?", listOf("1976", "1984", "1972", "1980"), "Technology", ""),
            zh = LocalizedContent("苹果公司成立于哪一年？", listOf("1976", "1984", "1972", "1980"), "科技", ""),
            es = LocalizedContent("¿En qué año se fundó Apple?", listOf("1976", "1984", "1972", "1980"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 416, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel langage de programmation est surnommé 'le couteau suisse du web' ?", listOf("JavaScript", "PHP", "Python", "Ruby"), "Tech", ""),
            en = LocalizedContent("Which programming language is nicknamed 'the Swiss Army knife of the web'?", listOf("JavaScript", "PHP", "Python", "Ruby"), "Technology", ""),
            zh = LocalizedContent("哪种编程语言被称为“网络瑞士军刀”？", listOf("JavaScript", "PHP", "Python", "Ruby"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje de programación es apodado 'la navaja suiza de la web'?", listOf("JavaScript", "PHP", "Python", "Ruby"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 417, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'heures dure une charge complète d'une batterie de téléphone typique ?", listOf("Variable selon modèle", "12h", "24h", "48h"), "Tech", ""),
            en = LocalizedContent("How many hours does a full charge of a typical phone battery last?", listOf("Varies by model", "12h", "24h", "48h"), "Technology", ""),
            zh = LocalizedContent("典型手机电池充满电后能使用多少小时？", listOf("因型号而异", "12小时", "24小时", "48小时"), "科技", ""),
            es = LocalizedContent("¿Cuántas horas dura una carga completa de una batería de teléfono típica?", listOf("Varía según el modelo", "12h", "24h", "48h"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 418, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel composant est le 'cerveau' d'un ordinateur ?", listOf("CPU", "GPU", "RAM", "SSD"), "Tech", ""),
            en = LocalizedContent("Which component is the 'brain' of a computer?", listOf("CPU", "GPU", "RAM", "SSD"), "Technology", ""),
            zh = LocalizedContent("哪个组件是计算机的“大脑”？", listOf("CPU", "GPU", "RAM", "SSD"), "科技", ""),
            es = LocalizedContent("¿Qué componente es el 'cerebro' de una computadora?", listOf("CPU", "GPU", "RAM", "SSD"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 419, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'AI' en informatique ?", listOf("Artificial Intelligence", "Automated Interface", "Advanced Indexing", "Automatic Integration"), "Tech", ""),
            en = LocalizedContent("What does 'AI' stand for in computing?", listOf("Artificial Intelligence", "Automated Interface", "Advanced Indexing", "Automatic Integration"), "Technology", ""),
            zh = LocalizedContent("在计算机科学中，“AI”代表什么？", listOf("人工智能", "自动化接口", "高级索引", "自动集成"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'AI' en informática?", listOf("Artificial Intelligence", "Automated Interface", "Advanced Indexing", "Automatic Integration"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 420, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le moteur de recherche le plus utilisé au monde ?", listOf("Google", "Bing", "Yahoo", "DuckDuckGo"), "Tech", ""),
            en = LocalizedContent("What is the most used search engine in the world?", listOf("Google", "Bing", "Yahoo", "DuckDuckGo"), "Technology", ""),
            zh = LocalizedContent("世界上使用最多的搜索引擎是什么？", listOf("Google", "Bing", "Yahoo", "DuckDuckGo"), "科技", ""),
            es = LocalizedContent("¿Cuál es el motor de búsqueda más utilizado en el mundo?", listOf("Google", "Bing", "Yahoo", "DuckDuckGo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 421, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le premier ordinateur programmable ?", listOf("Alan Turing", "Bill Gates", "Steve Jobs", "Charles Babbage"), "Tech", ""),
            en = LocalizedContent("Who invented the first programmable computer?", listOf("Alan Turing", "Bill Gates", "Steve Jobs", "Charles Babbage"), "Technology", ""),
            zh = LocalizedContent("谁发明了第一台可编程计算机？", listOf("艾伦·图灵", "比尔·盖茨", "史蒂夫·乔布斯", "查尔斯·巴贝奇"), "科技", ""),
            es = LocalizedContent("¿Quién inventó la primera computadora programable?", listOf("Alan Turing", "Bill Gates", "Steve Jobs", "Charles Babbage"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 422, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie 'URL' ?", listOf("Uniform Resource Locator", "Universal Resource Link", "Unified Resource Locator", "Unique Resource Locator"), "Tech", ""),
            en = LocalizedContent("What does 'URL' stand for?", listOf("Uniform Resource Locator", "Universal Resource Link", "Unified Resource Locator", "Unique Resource Locator"), "Technology", ""),
            zh = LocalizedContent("“URL”代表什么？", listOf("统一资源定位符", "通用资源链接", "统一资源定位器", "唯一资源定位器"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'URL'?", listOf("Localizador Uniforme de Recursos", "Enlace Universal de Recursos", "Localizador Unificado de Recursos", "Localizador Único de Recursos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 423, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier satellite artificiel Spoutnik a-t-il été lancé ?", listOf("1957", "1961", "1955", "1965"), "Tech", ""),
            en = LocalizedContent("In which year was the first artificial satellite Sputnik launched?", listOf("1957", "1961", "1955", "1965"), "Technology", ""),
            zh = LocalizedContent("第一颗人造卫星斯普特尼克号是在哪一年发射的？", listOf("1957", "1961", "1955", "1965"), "科技", ""),
            es = LocalizedContent("¿En qué año se lanzó el primer satélite artificial Sputnik?", listOf("1957", "1961", "1955", "1965"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 424, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel format de fichier est utilisé pour les images de haute qualité sans perte ?", listOf("PNG", "JPEG", "GIF", "BMP"), "Tech", ""),
            en = LocalizedContent("Which file format is used for high-quality lossless images?", listOf("PNG", "JPEG", "GIF", "BMP"), "Technology", ""),
            zh = LocalizedContent("哪种文件格式用于高质量无损图像？", listOf("PNG", "JPEG", "GIF", "BMP"), "科技", ""),
            es = LocalizedContent("¿Qué formato de archivo se utiliza para imágenes de alta calidad sin pérdida?", listOf("PNG", "JPEG", "GIF", "BMP"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 425, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel algorithme de tri est le plus efficace en moyenne ?", listOf("Quicksort", "Bubble sort", "Insertion sort", "Selection sort"), "Tech", ""),
            en = LocalizedContent("Which sorting algorithm is most efficient on average?", listOf("Quicksort", "Bubble sort", "Insertion sort", "Selection sort"), "Technology", ""),
            zh = LocalizedContent("哪种排序算法平均效率最高？", listOf("快速排序", "冒泡排序", "插入排序", "选择排序"), "科技", ""),
            es = LocalizedContent("¿Qué algoritmo de ordenamiento es más eficiente en promedio?", listOf("Quicksort", "Bubble sort", "Insertion sort", "Selection sort"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 426, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de transistors environ contient un processeur moderne ?", listOf("Des milliards", "Des millions", "Des milliers", "Des centaines"), "Tech", ""),
            en = LocalizedContent("Approximately how many transistors does a modern processor contain?", listOf("Billions", "Millions", "Thousands", "Hundreds"), "Technology", ""),
            zh = LocalizedContent("现代处理器大约包含多少个晶体管？", listOf("数十亿", "数百万", "数千", "数百"), "科技", ""),
            es = LocalizedContent("¿Aproximadamente cuántos transistores contiene un procesador moderno?", listOf("Miles de millones", "Millones", "Miles", "Cientos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 427, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie 'VPN' ?", listOf("Virtual Private Network", "Virtual Protocol Network", "Verified Private Network", "Visual Protocol Network"), "Tech", ""),
            en = LocalizedContent("What does 'VPN' stand for?", listOf("Virtual Private Network", "Virtual Protocol Network", "Verified Private Network", "Visual Protocol Network"), "Technology", ""),
            zh = LocalizedContent("“VPN”代表什么？", listOf("虚拟专用网络", "虚拟协议网络", "验证专用网络", "视觉协议网络"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'VPN'?", listOf("Red Privada Virtual", "Red de Protocolo Virtual", "Red Privada Verificada", "Red de Protocolo Visual"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 428, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage est utilisé pour la structure des pages web ?", listOf("HTML", "CSS", "JavaScript", "XML"), "Tech", ""),
            en = LocalizedContent("Which language is used for the structure of web pages?", listOf("HTML", "CSS", "JavaScript", "XML"), "Technology", ""),
            zh = LocalizedContent("哪种语言用于网页的结构？", listOf("HTML", "CSS", "JavaScript", "XML"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje se utiliza para la estructura de las páginas web?", listOf("HTML", "CSS", "JavaScript", "XML"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 429, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fabricant de microprocesseurs ?", listOf("Intel", "AMD", "Qualcomm", "Apple"), "Tech", ""),
            en = LocalizedContent("Who is the largest manufacturer of microprocessors?", listOf("Intel", "AMD", "Qualcomm", "Apple"), "Technology", ""),
            zh = LocalizedContent("最大的微处理器制造商是谁？", listOf("英特尔", "AMD", "高通", "苹果"), "科技", ""),
            es = LocalizedContent("¿Quién es el mayor fabricante de microprocesadores?", listOf("Intel", "AMD", "Qualcomm", "Apple"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 430, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle notation est utilisée en informatique pour représenter les nombres en base 16 ?", listOf("Hexadécimale", "Octale", "Binaire", "Décimale"), "Tech", ""),
            en = LocalizedContent("Which notation is used in computing to represent numbers in base 16?", listOf("Hexadecimal", "Octal", "Binary", "Decimal"), "Technology", ""),
            zh = LocalizedContent("计算机中用于表示十六进制数的记数法是什么？", listOf("十六进制", "八进制", "二进制", "十进制"), "科技", ""),
            es = LocalizedContent("¿Qué notación se utiliza en informática para representar números en base 16?", listOf("Hexadecimal", "Octal", "Binario", "Decimal"), "Tecnología", "")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 501, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle équipe a remporté le plus de Coupes du Monde de football ?", listOf("Brésil", "Allemagne", "Italie", "Argentine"), "Sport", ""),
            en = LocalizedContent("Which team has won the most FIFA World Cups?", listOf("Brazil", "Germany", "Italy", "Argentina"), "Sports", ""),
            zh = LocalizedContent("哪支球队赢得了最多的世界杯冠军？", listOf("巴西", "德国", "意大利", "阿根廷"), "体育", ""),
            es = LocalizedContent("¿Qué equipo ha ganado más Copas del Mundo de fútbol?", listOf("Brasil", "Alemania", "Italia", "Argentina"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 502, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 100m masculin et qui le détient ?", listOf("9.58s - Usain Bolt", "9.69s - Tyson Gay", "9.72s - Asafa Powell", "9.74s - Ben Johnson"), "Sport", ""),
            en = LocalizedContent("What is the men's 100m world record and who holds it?", listOf("9.58s - Usain Bolt", "9.69s - Tyson Gay", "9.72s - Asafa Powell", "9.74s - Ben Johnson"), "Sports", ""),
            zh = LocalizedContent("男子100米世界纪录是多少，由谁保持？", listOf("9.58秒 - 尤塞恩·博尔特", "9.69秒 - 泰森·盖伊", "9.72秒 - 阿萨法·鲍威尔", "9.74秒 - 本·约翰逊"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial de 100m masculino y quién lo posee?", listOf("9.58s - Usain Bolt", "9.69s - Tyson Gay", "9.72s - Asafa Powell", "9.74s - Ben Johnson"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 503, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sets gagne-t-on pour remporter un match de tennis en Grand Chelem masculin ?", listOf("3", "2", "4", "5"), "Sport", ""),
            en = LocalizedContent("How many sets are needed to win a men's Grand Slam tennis match?", listOf("3", "2", "4", "5"), "Sports", ""),
            zh = LocalizedContent("男子大满贯网球比赛需要赢多少盘？", listOf("3", "2", "4", "5"), "体育", ""),
            es = LocalizedContent("¿Cuántos sets se necesitan para ganar un partido de tenis masculino de Grand Slam?", listOf("3", "2", "4", "5"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 504, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel joueur a remporté le plus de Ballons d'Or dans l'histoire ?", listOf("Lionel Messi", "Cristiano Ronaldo", "Ronaldinho", "Zinédine Zidane"), "Sport", ""),
            en = LocalizedContent("Which player has won the most Ballon d'Or awards in history?", listOf("Lionel Messi", "Cristiano Ronaldo", "Ronaldinho", "Zinedine Zidane"), "Sports", ""),
            zh = LocalizedContent("历史上哪位球员赢得了最多的金球奖？", listOf("莱昂内尔·梅西", "克里斯蒂亚诺·罗纳尔多", "罗纳尔迪尼奥", "齐内丁·齐达内"), "体育", ""),
            es = LocalizedContent("¿Qué jugador ha ganado más Balones de Oro en la historia?", listOf("Lionel Messi", "Cristiano Ronaldo", "Ronaldinho", "Zinedine Zidane"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 505, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la France a-t-elle remporté sa première Coupe du Monde de football ?", listOf("1998", "2018", "2006", "1984"), "Sport", ""),
            en = LocalizedContent("In which year did France win its first FIFA World Cup?", listOf("1998", "2018", "2006", "1984"), "Sports", ""),
            zh = LocalizedContent("法国在哪一年赢得了它的第一个世界杯冠军？", listOf("1998", "2018", "2006", "1984"), "体育", ""),
            es = LocalizedContent("¿En qué año ganó Francia su primera Copa del Mundo de fútbol?", listOf("1998", "2018", "2006", "1984"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 506, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport se pratique à Wimbledon ?", listOf("Tennis", "Cricket", "Badminton", "Squash"), "Sport", ""),
            en = LocalizedContent("Which sport is played at Wimbledon?", listOf("Tennis", "Cricket", "Badminton", "Squash"), "Sports", ""),
            zh = LocalizedContent("温布尔登举办的是哪项运动？", listOf("网球", "板球", "羽毛球", "壁球"), "体育", ""),
            es = LocalizedContent("¿Qué deporte se practica en Wimbledon?", listOf("Tenis", "Críquet", "Bádminton", "Squash"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 507, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs composent une équipe de basketball sur le terrain ?", listOf("5", "6", "4", "7"), "Sport", ""),
            en = LocalizedContent("How many players are on the court for a basketball team?", listOf("5", "6", "4", "7"), "Sports", ""),
            zh = LocalizedContent("一支篮球队在场上比赛的有多少名球员？", listOf("5", "6", "4", "7"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores componen un equipo de baloncesto en la cancha?", listOf("5", "6", "4", "7"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 508, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a inventé le basketball ?", listOf("Canada/USA", "France", "Angleterre", "Brésil"), "Sport", ""),
            en = LocalizedContent("Which country invented basketball?", listOf("Canada/USA", "France", "England", "Brazil"), "Sports", ""),
            zh = LocalizedContent("哪个国家发明了篮球？", listOf("加拿大/美国", "法国", "英格兰", "巴西"), "体育", ""),
            es = LocalizedContent("¿Qué país inventó el baloncesto?", listOf("Canadá/EE.UU.", "Francia", "Inglaterra", "Brasil"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 509, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de points vaut un essai au rugby ?", listOf("5", "3", "4", "6"), "Sport", ""),
            en = LocalizedContent("How many points is a try worth in rugby?", listOf("5", "3", "4", "6"), "Sports", ""),
            zh = LocalizedContent("橄榄球中一次达阵得多少分？", listOf("5", "3", "4", "6"), "体育", ""),
            es = LocalizedContent("¿Cuántos puntos vale un ensayo en rugby?", listOf("5", "3", "4", "6"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 510, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sportif est surnommé 'Le King' dans son sport ?", listOf("LeBron James (basket)", "Pelé (football)", "Tiger Woods (golf)", "Roger Federer (tennis)"), "Sport", ""),
            en = LocalizedContent("Which athlete is nicknamed 'The King' in their sport?", listOf("LeBron James (basketball)", "Pelé (football)", "Tiger Woods (golf)", "Roger Federer (tennis)"), "Sports", ""),
            zh = LocalizedContent("哪位运动员在其运动项目中被昵称为“国王”？", listOf("勒布朗·詹姆斯（篮球）", "贝利（足球）", "泰格·伍兹（高尔夫）", "罗杰·费德勒（网球）"), "体育", ""),
            es = LocalizedContent("¿Qué deportista es apodado 'El Rey' en su deporte?", listOf("LeBron James (baloncesto)", "Pelé (fútbol)", "Tiger Woods (golf)", "Roger Federer (tenis)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 511, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se sont déroulés les JO d'été de 2024 ?", listOf("France", "Japon", "USA", "Chine"), "Sport", ""),
            en = LocalizedContent("In which country were the 2024 Summer Olympics held?", listOf("France", "Japan", "USA", "China"), "Sports", ""),
            zh = LocalizedContent("2024年夏季奥运会在哪个国家举办？", listOf("法国", "日本", "美国", "中国"), "体育", ""),
            es = LocalizedContent("¿En qué país se celebraron los Juegos Olímpicos de Verano de 2024?", listOf("Francia", "Japón", "EE.UU.", "China"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 512, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tours dispute-t-on dans le Tour de France cycliste ?", listOf("21", "18", "23", "25"), "Sport", ""),
            en = LocalizedContent("How many stages are there in the Tour de France cycling race?", listOf("21", "18", "23", "25"), "Sports", ""),
            zh = LocalizedContent("环法自行车赛有多少个赛段？", listOf("21", "18", "23", "25"), "体育", ""),
            es = LocalizedContent("¿Cuántas etapas tiene el Tour de Francia ciclista?", listOf("21", "18", "23", "25"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 513, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le club de football le plus titré en Ligue des Champions ?", listOf("Real Madrid", "FC Barcelone", "Bayern Munich", "AC Milan"), "Sport", ""),
            en = LocalizedContent("Which football club has won the most UEFA Champions League titles?", listOf("Real Madrid", "FC Barcelona", "Bayern Munich", "AC Milan"), "Sports", ""),
            zh = LocalizedContent("哪家足球俱乐部赢得欧冠冠军次数最多？", listOf("皇家马德里", "巴塞罗那", "拜仁慕尼黑", "AC米兰"), "体育", ""),
            es = LocalizedContent("¿Qué club de fútbol ha ganado más títulos de la Liga de Campeones?", listOf("Real Madrid", "FC Barcelona", "Bayern Múnich", "AC Milan"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 514, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de grammes pèse une balle de tennis officielle ?", listOf("56 à 59,4g", "45 à 50g", "60 à 65g", "50 à 55g"), "Sport", ""),
            en = LocalizedContent("How many grams does an official tennis ball weigh?", listOf("56 to 59.4g", "45 to 50g", "60 to 65g", "50 to 55g"), "Sports", ""),
            zh = LocalizedContent("官方网球重多少克？", listOf("56至59.4克", "45至50克", "60至65克", "50至55克"), "体育", ""),
            es = LocalizedContent("¿Cuántos gramos pesa una pelota de tenis oficial?", listOf("56 a 59,4g", "45 a 50g", "60 a 65g", "50 a 55g"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 515, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel nageur a remporté le plus de médailles olympiques de l'histoire ?", listOf("Michael Phelps", "Mark Spitz", "Ryan Lochte", "Ian Thorpe"), "Sport", ""),
            en = LocalizedContent("Which swimmer has won the most Olympic medals in history?", listOf("Michael Phelps", "Mark Spitz", "Ryan Lochte", "Ian Thorpe"), "Sports", ""),
            zh = LocalizedContent("哪位游泳运动员获得奥运奖牌最多？", listOf("迈克尔·菲尔普斯", "马克·斯皮茨", "瑞安·罗切特", "伊恩·索普"), "体育", ""),
            es = LocalizedContent("¿Qué nadador ha ganado más medallas olímpicas en la historia?", listOf("Michael Phelps", "Mark Spitz", "Ryan Lochte", "Ian Thorpe"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 516, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle distance court-on lors d'un marathon ?", listOf("42,195 km", "40 km", "45 km", "50 km"), "Sport", ""),
            en = LocalizedContent("What distance is run in a marathon?", listOf("42.195 km", "40 km", "45 km", "50 km"), "Sports", ""),
            zh = LocalizedContent("马拉松比赛的距离是多少？", listOf("42.195公里", "40公里", "45公里", "50公里"), "体育", ""),
            es = LocalizedContent("¿Qué distancia se corre en un maratón?", listOf("42,195 km", "40 km", "45 km", "50 km"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 517, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté le plus de Coupes du Monde de rugby ?", listOf("Nouvelle-Zélande", "Australie", "Afrique du Sud", "Angleterre"), "Sport", ""),
            en = LocalizedContent("Which country has won the most Rugby World Cups?", listOf("New Zealand", "Australia", "South Africa", "England"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得橄榄球世界杯次数最多？", listOf("新西兰", "澳大利亚", "南非", "英格兰"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más Copas del Mundo de rugby?", listOf("Nueva Zelanda", "Australia", "Sudáfrica", "Inglaterra"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 518, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de points faut-il pour gagner un set au tennis ?", listOf("6 (avec 2 de différence)", "7", "5", "8"), "Sport", ""),
            en = LocalizedContent("How many points are needed to win a set in tennis?", listOf("6 (with a 2-game lead)", "7", "5", "8"), "Sports", ""),
            zh = LocalizedContent("网球中赢得一盘需要多少局？", listOf("6（领先2局）", "7", "5", "8"), "体育", ""),
            es = LocalizedContent("¿Cuántos juegos se necesitan para ganar un set en tenis?", listOf("6 (con diferencia de 2)", "7", "5", "8"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 519, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année le football est-il devenu un sport olympique ?", listOf("1900", "1896", "1904", "1908"), "Sport", ""),
            en = LocalizedContent("In which year did football become an Olympic sport?", listOf("1900", "1896", "1904", "1908"), "Sports", ""),
            zh = LocalizedContent("足球在哪一年成为奥运项目？", listOf("1900", "1896", "1904", "1908"), "体育", ""),
            es = LocalizedContent("¿En qué año el fútbol se convirtió en deporte olímpico?", listOf("1900", "1896", "1904", "1908"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 520, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles d'or aux JO de l'histoire (total) ?", listOf("USA", "URSS", "Chine", "Allemagne"), "Sport", ""),
            en = LocalizedContent("Which country has won the most gold medals in Olympic history (total)?", listOf("USA", "USSR", "China", "Germany"), "Sports", ""),
            zh = LocalizedContent("哪个国家在奥运历史上获得金牌总数最多？", listOf("美国", "苏联", "中国", "德国"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más medallas de oro en la historia de los Juegos Olímpicos (total)?", listOf("EE.UU.", "URSS", "China", "Alemania"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 521, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'équipes participent à la phase finale de la Coupe du Monde FIFA ?", listOf("32", "24", "16", "48"), "Sport", ""),
            en = LocalizedContent("How many teams participate in the final phase of the FIFA World Cup?", listOf("32", "24", "16", "48"), "Sports", ""),
            zh = LocalizedContent("有多少支球队参加国际足联世界杯决赛阶段比赛？", listOf("32", "24", "16", "48"), "体育", ""),
            es = LocalizedContent("¿Cuántos equipos participan en la fase final de la Copa Mundial de la FIFA?", listOf("32", "24", "16", "48"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 522, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de tennis a remporté le plus de tournois du Grand Chelem (hommes) ?", listOf("Novak Djokovic", "Roger Federer", "Rafael Nadal", "Pete Sampras"), "Sport", ""),
            en = LocalizedContent("Which tennis player has won the most Grand Slam tournaments (men's)?", listOf("Novak Djokovic", "Roger Federer", "Rafael Nadal", "Pete Sampras"), "Sports", ""),
            zh = LocalizedContent("哪位网球运动员赢得了最多的大满贯赛事（男子）？", listOf("诺瓦克·德约科维奇", "罗杰·费德勒", "拉斐尔·纳达尔", "皮特·桑普拉斯"), "体育", ""),
            es = LocalizedContent("¿Qué tenista ha ganado más torneos de Grand Slam (hombres)?", listOf("Novak Djokovic", "Roger Federer", "Rafael Nadal", "Pete Sampras"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 523, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle équipe de football a remporté le plus de championnats de France ?", listOf("Saint-Étienne", "Olympique de Marseille", "PSG", "Monaco"), "Sport", ""),
            en = LocalizedContent("Which football team has won the most French championships?", listOf("Saint-Étienne", "Olympique de Marseille", "PSG", "Monaco"), "Sports", ""),
            zh = LocalizedContent("哪支足球队赢得了最多的法国冠军？", listOf("圣埃蒂安", "马赛奥林匹克", "巴黎圣日耳曼", "摩纳哥"), "体育", ""),
            es = LocalizedContent("¿Qué equipo de fútbol ha ganado más campeonatos de Francia?", listOf("Saint-Étienne", "Olympique de Marseille", "PSG", "Mónaco"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 524, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de joueurs compose une équipe de baseball sur le terrain ?", listOf("9", "11", "7", "10"), "Sport", ""),
            en = LocalizedContent("How many players make up a baseball team on the field?", listOf("9", "11", "7", "10"), "Sports", ""),
            zh = LocalizedContent("一支棒球队在场上由多少名球员组成？", listOf("9", "11", "7", "10"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores componen un equipo de béisbol en el campo?", listOf("9", "11", "7", "10"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 525, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète kényan est considéré comme le plus grand marathonien de l'histoire ?", listOf("Eliud Kipchoge", "Paul Tergat", "Moses Tanui", "Geoffrey Mutai"), "Sport", ""),
            en = LocalizedContent("Which Kenyan athlete is considered the greatest marathon runner in history?", listOf("Eliud Kipchoge", "Paul Tergat", "Moses Tanui", "Geoffrey Mutai"), "Sports", ""),
            zh = LocalizedContent("哪位肯尼亚运动员被认为是历史上最伟大的马拉松运动员？", listOf("埃利乌德·基普乔格", "保罗·特加特", "摩西·塔努伊", "杰弗里·穆泰"), "体育", ""),
            es = LocalizedContent("¿Qué atleta keniano es considerado el mejor maratonista de la historia?", listOf("Eliud Kipchoge", "Paul Tergat", "Moses Tanui", "Geoffrey Mutai"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 601, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté le plus d'Oscars dans l'histoire (11) ?", listOf("Le Seigneur des Anneaux : Le Retour du Roi", "Titanic", "Ben-Hur", "Autant en emporte le vent"), "Cinéma", ""),
            en = LocalizedContent("Which film has won the most Oscars in history (11)?", listOf("The Lord of the Rings: The Return of the King", "Titanic", "Ben-Hur", "Gone with the Wind"), "Cinema", ""),
            zh = LocalizedContent("哪部电影在历史上获得了最多的奥斯卡奖（11项）？", listOf("指环王：王者归来", "泰坦尼克号", "宾虚", "乱世佳人"), "电影", ""),
            es = LocalizedContent("¿Qué película ha ganado más premios Óscar en la historia (11)?", listOf("El Señor de los Anillos: el retorno del Rey", "Titanic", "Ben-Hur", "Lo que el viento se llevó"), "Cine", "")
        ),
        BilingualQuestion(
            id = 602, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle de Jack Dawson dans Titanic ?", listOf("Leonardo DiCaprio", "Brad Pitt", "Tom Cruise", "Johnny Depp"), "Cinéma", ""),
            en = LocalizedContent("Who plays the role of Jack Dawson in Titanic?", listOf("Leonardo DiCaprio", "Brad Pitt", "Tom Cruise", "Johnny Depp"), "Cinema", ""),
            zh = LocalizedContent("谁在《泰坦尼克号》中扮演杰克·道森？", listOf("莱昂纳多·迪卡普里奥", "布拉德·皮特", "汤姆·克鲁斯", "约翰尼·德普"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta el papel de Jack Dawson en Titanic?", listOf("Leonardo DiCaprio", "Brad Pitt", "Tom Cruise", "Johnny Depp"), "Cine", "")
        ),
        BilingualQuestion(
            id = 603, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle série apparaît le personnage de Walter White ?", listOf("Breaking Bad", "Better Call Saul", "Narcos", "The Wire"), "Cinéma", ""),
            en = LocalizedContent("In which series does the character Walter White appear?", listOf("Breaking Bad", "Better Call Saul", "Narcos", "The Wire"), "Cinema", ""),
            zh = LocalizedContent("沃尔特·怀特这个角色出现在哪部系列剧中？", listOf("绝命毒师", "风骚律师", "毒枭", "火线"), "电影", ""),
            es = LocalizedContent("¿En qué serie aparece el personaje de Walter White?", listOf("Breaking Bad", "Better Call Saul", "Narcos", "The Wire"), "Cine", "")
        ),
        BilingualQuestion(
            id = 604, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui réalise la saga 'Le Seigneur des Anneaux' ?", listOf("Peter Jackson", "James Cameron", "Ridley Scott", "Steven Spielberg"), "Cinéma", ""),
            en = LocalizedContent("Who directed the 'Lord of the Rings' saga?", listOf("Peter Jackson", "James Cameron", "Ridley Scott", "Steven Spielberg"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《指环王》系列？", listOf("彼得·杰克逊", "詹姆斯·卡梅隆", "雷德利·斯科特", "史蒂文·斯皮尔伯格"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió la saga 'El Señor de los Anillos'?", listOf("Peter Jackson", "James Cameron", "Ridley Scott", "Steven Spielberg"), "Cine", "")
        ),
        BilingualQuestion(
            id = 605, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue Tony Stark / Iron Man dans le MCU ?", listOf("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"), "Cinéma", ""),
            en = LocalizedContent("Which actor plays Tony Stark / Iron Man in the MCU?", listOf("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在漫威电影宇宙中扮演托尼·斯塔克/钢铁侠？", listOf("小罗伯特·唐尼", "克里斯·埃文斯", "克里斯·海姆斯沃斯", "马克·鲁弗洛"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpreta a Tony Stark / Iron Man en el UCM?", listOf("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"), "Cine", "")
        ),
        BilingualQuestion(
            id = 606, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film entend-on la réplique 'Je suis ton père' ?", listOf("Star Wars : L'Empire contre-attaque", "Star Wars : Un Nouvel Espoir", "Star Wars : Le Retour du Jedi", "Star Wars : La Revanche des Sith"), "Cinéma", ""),
            en = LocalizedContent("In which film do we hear the line 'I am your father'?", listOf("Star Wars: The Empire Strikes Back", "Star Wars: A New Hope", "Star Wars: Return of the Jedi", "Star Wars: Revenge of the Sith"), "Cinema", ""),
            zh = LocalizedContent("在哪部电影中听到台词'我是你父亲'？", listOf("星球大战：帝国反击战", "星球大战：新希望", "星球大战：绝地归来", "星球大战：西斯的复仇"), "电影", ""),
            es = LocalizedContent("¿En qué película se escucha la frase 'Yo soy tu padre'?", listOf("Star Wars: El Imperio Contraataca", "Star Wars: Una Nueva Esperanza", "Star Wars: El Retorno del Jedi", "Star Wars: La Venganza de los Sith"), "Cine", "")
        ),
        BilingualQuestion(
            id = 607, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle série Netflix raconte la vie d'une reine d'Angleterre ?", listOf("The Crown", "Bridgerton", "Downton Abbey", "Victoria"), "Cinéma", ""),
            en = LocalizedContent("Which Netflix series tells the life of a queen of England?", listOf("The Crown", "Bridgerton", "Downton Abbey", "Victoria"), "Cinema", ""),
            zh = LocalizedContent("哪部Netflix剧集讲述了一位英国女王的生活？", listOf("王冠", "布里奇顿", "唐顿庄园", "维多利亚"), "电影", ""),
            es = LocalizedContent("¿Qué serie de Netflix cuenta la vida de una reina de Inglaterra?", listOf("The Crown", "Bridgerton", "Downton Abbey", "Victoria"), "Cine", "")
        ),
        BilingualQuestion(
            id = 608, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Pulp Fiction' ?", listOf("Quentin Tarantino", "Martin Scorsese", "Francis Ford Coppola", "David Fincher"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Pulp Fiction'?", listOf("Quentin Tarantino", "Martin Scorsese", "Francis Ford Coppola", "David Fincher"), "Cinema", ""),
            zh = LocalizedContent("谁导演了《低俗小说》？", listOf("昆汀·塔伦蒂诺", "马丁·斯科塞斯", "弗朗西斯·福特·科波拉", "大卫·芬奇"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Pulp Fiction'?", listOf("Quentin Tarantino", "Martin Scorsese", "Francis Ford Coppola", "David Fincher"), "Cine", "")
        ),
        BilingualQuestion(
            id = 609, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'animation Disney raconte l'histoire d'un lion cub ?", listOf("Le Roi Lion", "Bambi", "La Belle et la Bête", "Aladdin"), "Cinéma", ""),
            en = LocalizedContent("Which Disney animated film tells the story of a lion cub?", listOf("The Lion King", "Bambi", "Beauty and the Beast", "Aladdin"), "Cinema", ""),
            zh = LocalizedContent("哪部迪士尼动画电影讲述了一只小狮子的故事？", listOf("狮子王", "小鹿斑比", "美女与野兽", "阿拉丁"), "电影", ""),
            es = LocalizedContent("¿Qué película animada de Disney cuenta la historia de un cachorro de león?", listOf("El Rey León", "Bambi", "La Bella y la Bestia", "Aladdín"), "Cine", "")
        ),
        BilingualQuestion(
            id = 610, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle ville se déroule la série 'Friends' ?", listOf("New York", "Los Angeles", "Chicago", "Boston"), "Cinéma", ""),
            en = LocalizedContent("In which city is the series 'Friends' set?", listOf("New York", "Los Angeles", "Chicago", "Boston"), "Cinema", ""),
            zh = LocalizedContent("电视剧《老友记》的故事发生在哪个城市？", listOf("纽约", "洛杉矶", "芝加哥", "波士顿"), "电影", ""),
            es = LocalizedContent("¿En qué ciudad se desarrolla la serie 'Friends'?", listOf("Nueva York", "Los Ángeles", "Chicago", "Boston"), "Cine", "")
        ),
        BilingualQuestion(
            id = 611, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue Hermione Granger dans la saga Harry Potter ?", listOf("Emma Watson", "Emma Stone", "Emma Roberts", "Emma Thompson"), "Cinéma", ""),
            en = LocalizedContent("Who plays Hermione Granger in the Harry Potter saga?", listOf("Emma Watson", "Emma Stone", "Emma Roberts", "Emma Thompson"), "Cinema", ""),
            zh = LocalizedContent("谁在《哈利·波特》系列中饰演赫敏·格兰杰？", listOf("艾玛·沃特森", "艾玛·斯通", "艾玛·罗伯茨", "艾玛·汤普森"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta a Hermione Granger en la saga de Harry Potter?", listOf("Emma Watson", "Emma Stone", "Emma Roberts", "Emma Thompson"), "Cine", "")
        ),
        BilingualQuestion(
            id = 612, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Pixar raconte l'histoire d'un petit poisson perdu ?", listOf("Le Monde de Nemo", "Dory", "Cars", "Ratatouille"), "Cinéma", ""),
            en = LocalizedContent("Which Pixar film tells the story of a little lost fish?", listOf("Finding Nemo", "Dory", "Cars", "Ratatouille"), "Cinema", ""),
            zh = LocalizedContent("哪部皮克斯电影讲述了一条迷路的小鱼的故事？", listOf("海底总动员", "多莉去哪儿？", "赛车总动员", "美食总动员"), "电影", ""),
            es = LocalizedContent("¿Qué película de Pixar cuenta la historia de un pececito perdido?", listOf("Buscando a Nemo", "Dory", "Cars", "Ratatouille"), "Cine", "")
        ),
        BilingualQuestion(
            id = 613, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le réalisateur de 'Schindler's List' ?", listOf("Steven Spielberg", "Oliver Stone", "Clint Eastwood", "Martin Scorsese"), "Cinéma", ""),
            en = LocalizedContent("Who is the director of 'Schindler's List'?", listOf("Steven Spielberg", "Oliver Stone", "Clint Eastwood", "Martin Scorsese"), "Cinema", ""),
            zh = LocalizedContent("《辛德勒的名单》的导演是谁？", listOf("史蒂文·斯皮尔伯格", "奥利弗·斯通", "克林特·伊斯特伍德", "马丁·斯科塞斯"), "电影", ""),
            es = LocalizedContent("¿Quién es el director de 'La lista de Schindler'?", listOf("Steven Spielberg", "Oliver Stone", "Clint Eastwood", "Martin Scorsese"), "Cine", "")
        ),
        BilingualQuestion(
            id = 614, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue le Joker dans 'Joker' (2019) ?", listOf("Joaquin Phoenix", "Heath Ledger", "Jack Nicholson", "Jared Leto"), "Cinéma", ""),
            en = LocalizedContent("Which actor plays the Joker in 'Joker' (2019)?", listOf("Joaquin Phoenix", "Heath Ledger", "Jack Nicholson", "Jared Leto"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《小丑》（2019）中饰演小丑？", listOf("华金·菲尼克斯", "希斯·莱杰", "杰克·尼科尔森", "杰瑞德·莱托"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpreta al Joker en 'Joker' (2019)?", listOf("Joaquin Phoenix", "Heath Ledger", "Jack Nicholson", "Jared Leto"), "Cine", "")
        ),
        BilingualQuestion(
            id = 615, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle série voit-on les familles Stark et Lannister ?", listOf("Game of Thrones", "Vikings", "The Last Kingdom", "Merlin"), "Cinéma", ""),
            en = LocalizedContent("In which series do we see the Stark and Lannister families?", listOf("Game of Thrones", "Vikings", "The Last Kingdom", "Merlin"), "Cinema", ""),
            zh = LocalizedContent("在哪部剧中可以看到史塔克家族和兰尼斯特家族？", listOf("权力的游戏", "维京传奇", "最后的王国", "梅林传奇"), "电影", ""),
            es = LocalizedContent("¿En qué serie vemos a las familias Stark y Lannister?", listOf("Game of Thrones", "Vikings", "The Last Kingdom", "Merlin"), "Cine", "")
        ),
        BilingualQuestion(
            id = 616, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film le plus rentable de l'histoire (recettes mondiales) ?", listOf("Avatar", "Avengers: Endgame", "Titanic", "Star Wars: Le Réveil de la Force"), "Cinéma", ""),
            en = LocalizedContent("What is the highest-grossing film of all time (worldwide)?", listOf("Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens"), "Cinema", ""),
            zh = LocalizedContent("全球票房最高的电影是哪一部？", listOf("阿凡达", "复仇者联盟4：终局之战", "泰坦尼克号", "星球大战：原力觉醒"), "电影", ""),
            es = LocalizedContent("¿Cuál es la película más taquillera de la historia (ingresos mundiales)?", listOf("Avatar", "Avengers: Endgame", "Titanic", "Star Wars: El Despertar de la Fuerza"), "Cine", "")
        ),
        BilingualQuestion(
            id = 617, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le personnage de James Bond dans 'Casino Royale' (2006) ?", listOf("Daniel Craig", "Pierce Brosnan", "Sean Connery", "Timothy Dalton"), "Cinéma", ""),
            en = LocalizedContent("Who plays James Bond in 'Casino Royale' (2006)?", listOf("Daniel Craig", "Pierce Brosnan", "Sean Connery", "Timothy Dalton"), "Cinema", ""),
            zh = LocalizedContent("在2006年的《皇家赌场》中，谁扮演詹姆斯·邦德？", listOf("丹尼尔·克雷格", "皮尔斯·布鲁斯南", "肖恩·康纳利", "蒂莫西·道尔顿"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta a James Bond en 'Casino Royale' (2006)?", listOf("Daniel Craig", "Pierce Brosnan", "Sean Connery", "Timothy Dalton"), "Cine", "")
        ),
        BilingualQuestion(
            id = 618, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé les films 'E.T.' et 'Indiana Jones' ?", listOf("Steven Spielberg", "George Lucas", "Brian De Palma", "Robert Zemeckis"), "Cinéma", ""),
            en = LocalizedContent("Which director created the films 'E.T.' and 'Indiana Jones'?", listOf("Steven Spielberg", "George Lucas", "Brian De Palma", "Robert Zemeckis"), "Cinema", ""),
            zh = LocalizedContent("哪位导演创作了《E.T.》和《夺宝奇兵》？", listOf("史蒂文·斯皮尔伯格", "乔治·卢卡斯", "布莱恩·德·帕尔玛", "罗伯特·泽米吉斯"), "电影", ""),
            es = LocalizedContent("¿Qué director creó las películas 'E.T.' e 'Indiana Jones'?", listOf("Steven Spielberg", "George Lucas", "Brian De Palma", "Robert Zemeckis"), "Cine", "")
        ),
        BilingualQuestion(
            id = 619, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'épisodes compte la série originale 'Game of Thrones' ?", listOf("73", "60", "80", "66"), "Cinéma", ""),
            en = LocalizedContent("How many episodes does the original series 'Game of Thrones' have?", listOf("73", "60", "80", "66"), "Cinema", ""),
            zh = LocalizedContent("原版《权力的游戏》系列有多少集？", listOf("73", "60", "80", "66"), "电影", ""),
            es = LocalizedContent("¿Cuántos episodios tiene la serie original 'Game of Thrones'?", listOf("73", "60", "80", "66"), "Cine", "")
        ),
        BilingualQuestion(
            id = 620, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film met en scène Tom Hanks coincé dans un aéroport ?", listOf("Le Terminal", "Forrest Gump", "Cast Away", "Philadelphia"), "Cinéma", ""),
            en = LocalizedContent("Which film features Tom Hanks stranded in an airport?", listOf("The Terminal", "Forrest Gump", "Cast Away", "Philadelphia"), "Cinema", ""),
            zh = LocalizedContent("哪部电影中汤姆·汉克斯被困在机场？", listOf("幸福终点站", "阿甘正传", "荒岛余生", "费城故事"), "电影", ""),
            es = LocalizedContent("¿Qué película muestra a Tom Hanks varado en un aeropuerto?", listOf("La Terminal", "Forrest Gump", "Náufrago", "Philadelphia"), "Cine", "")
        ),
        BilingualQuestion(
            id = 701, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la sauce principale d'une pizza Margherita ?", listOf("Tomate", "Béchamel", "Pesto", "Crème fraîche"), "Gastronomie", ""),
            en = LocalizedContent("What is the main sauce of a Margherita pizza?", listOf("Tomato", "Béchamel", "Pesto", "Crème fraîche"), "Gastronomy", ""),
            zh = LocalizedContent("玛格丽特披萨的主要酱料是什么？", listOf("番茄酱", "白酱", "青酱", "酸奶油"), "美食", ""),
            es = LocalizedContent("¿Cuál es la salsa principal de una pizza Margherita?", listOf("Tomate", "Bechamel", "Pesto", "Crema fresca"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 702, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays est né le sushi ?", listOf("Japon", "Chine", "Corée", "Thaïlande"), "Gastronomie", ""),
            en = LocalizedContent("In which country was sushi born?", listOf("Japan", "China", "Korea", "Thailand"), "Gastronomy", ""),
            zh = LocalizedContent("寿司起源于哪个国家？", listOf("日本", "中国", "韩国", "泰国"), "美食", ""),
            es = LocalizedContent("¿En qué país nació el sushi?", listOf("Japón", "China", "Corea", "Tailandia"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 703, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fromage français est surnommé 'le roi des fromages' ?", listOf("Brie de Meaux", "Camembert", "Roquefort", "Comté"), "Gastronomie", ""),
            en = LocalizedContent("Which French cheese is nicknamed 'the king of cheeses'?", listOf("Brie de Meaux", "Camembert", "Roquefort", "Comté"), "Gastronomy", ""),
            zh = LocalizedContent("哪种法国奶酪被称为“奶酪之王”？", listOf("莫城布里奶酪", "卡门贝尔奶酪", "罗克福奶酪", "孔泰奶酪"), "美食", ""),
            es = LocalizedContent("¿Qué queso francés es apodado 'el rey de los quesos'?", listOf("Brie de Meaux", "Camembert", "Roquefort", "Comté"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 704, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle épice est la plus chère au monde au kilo ?", listOf("Safran", "Vanille", "Cardamome", "Truffe noire"), "Gastronomie", ""),
            en = LocalizedContent("Which spice is the most expensive in the world per kilo?", listOf("Saffron", "Vanilla", "Cardamom", "Black truffle"), "Gastronomy", ""),
            zh = LocalizedContent("哪种香料每公斤世界上最贵？", listOf("藏红花", "香草", "小豆蔻", "黑松露"), "美食", ""),
            es = LocalizedContent("¿Qué especia es la más cara del mundo por kilo?", listOf("Azafrán", "Vainilla", "Cardamomo", "Trufa negra"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 705, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays est originaire la paella ?", listOf("Espagne", "Italie", "Portugal", "Mexique"), "Gastronomie", ""),
            en = LocalizedContent("In which country does paella originate?", listOf("Spain", "Italy", "Portugal", "Mexico"), "Gastronomy", ""),
            zh = LocalizedContent("海鲜饭起源于哪个国家？", listOf("西班牙", "意大利", "葡萄牙", "墨西哥"), "美食", ""),
            es = LocalizedContent("¿En qué país se origina la paella?", listOf("España", "Italia", "Portugal", "México"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 706, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'ingrédient principal du guacamole ?", listOf("Avocat", "Citron", "Tomate", "Oignon"), "Gastronomie", ""),
            en = LocalizedContent("What is the main ingredient of guacamole?", listOf("Avocado", "Lemon", "Tomato", "Onion"), "Gastronomy", ""),
            zh = LocalizedContent("鳄梨酱的主要成分是什么？", listOf("鳄梨", "柠檬", "番茄", "洋葱"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente principal del guacamole?", listOf("Aguacate", "Limón", "Tomate", "Cebolla"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 707, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville française est connue pour ses quenelles ?", listOf("Lyon", "Paris", "Marseille", "Bordeaux"), "Gastronomie", ""),
            en = LocalizedContent("Which French city is known for its quenelles?", listOf("Lyon", "Paris", "Marseille", "Bordeaux"), "Gastronomy", ""),
            zh = LocalizedContent("哪个法国城市以其肉肠（quenelles）闻名？", listOf("里昂", "巴黎", "马赛", "波尔多"), "美食", ""),
            es = LocalizedContent("¿Qué ciudad francesa es conocida por sus quenelles?", listOf("Lyon", "París", "Marsella", "Burdeos"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 708, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fromage suisse avec des trous ?", listOf("Emmental", "Gruyère", "Appenzeller", "Raclette"), "Gastronomie", ""),
            en = LocalizedContent("Which Swiss cheese has holes?", listOf("Emmental", "Gruyère", "Appenzeller", "Raclette"), "Gastronomy", ""),
            zh = LocalizedContent("哪种瑞士奶酪有孔？", listOf("埃曼塔尔奶酪", "格鲁耶尔奶酪", "阿彭策尔奶酪", "拉克莱特奶酪"), "美食", ""),
            es = LocalizedContent("¿Qué queso suizo tiene agujeros?", listOf("Emmental", "Gruyère", "Appenzeller", "Raclette"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 709, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de types de champagne existe-t-il selon l'édition de sucre ?", listOf("6", "3", "8", "4"), "Gastronomie", ""),
            en = LocalizedContent("How many types of champagne are there according to sugar content?", listOf("6", "3", "8", "4"), "Gastronomy", ""),
            zh = LocalizedContent("根据含糖量，香槟有多少种类型？", listOf("6", "3", "8", "4"), "美食", ""),
            es = LocalizedContent("¿Cuántos tipos de champán existen según el contenido de azúcar?", listOf("6", "3", "8", "4"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 710, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays producteur du café Arabica le plus réputé ?", listOf("Éthiopie", "Brésil", "Colombie", "Vietnam"), "Gastronomie", ""),
            en = LocalizedContent("Which country is the most renowned producer of Arabica coffee?", listOf("Ethiopia", "Brazil", "Colombia", "Vietnam"), "Gastronomy", ""),
            zh = LocalizedContent("哪个国家是最著名的阿拉比卡咖啡生产国？", listOf("埃塞俄比亚", "巴西", "哥伦比亚", "越南"), "美食", ""),
            es = LocalizedContent("¿Qué país es el productor más renombrado de café arábica?", listOf("Etiopía", "Brasil", "Colombia", "Vietnam"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 801, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la théorie qui décrit l'expansion de l'univers ?", listOf("Big Bang", "Théorie des cordes", "Relativité générale", "Inflation cosmique"), "Science", ""),
            en = LocalizedContent("What is the name of the theory that describes the expansion of the universe?", listOf("Big Bang", "String theory", "General relativity", "Cosmic inflation"), "Science", ""),
            zh = LocalizedContent("描述宇宙膨胀的理论叫什么？", listOf("大爆炸", "弦理论", "广义相对论", "宇宙暴胀"), "科学", ""),
            es = LocalizedContent("¿Cómo se llama la teoría que describe la expansión del universo?", listOf("Big Bang", "Teoría de cuerdas", "Relatividad general", "Inflación cósmica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 802, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la distance d'une unité astronomique (UA) en km ?", listOf("150 millions", "384 400", "9,46 × 10¹²", "1 000"), "Science", ""),
            en = LocalizedContent("What is the distance of one astronomical unit (AU) in km?", listOf("150 million", "384,400", "9.46 × 10¹²", "1,000"), "Science", ""),
            zh = LocalizedContent("一个天文单位（AU）的距离是多少公里？", listOf("1.5亿", "384400", "9.46 × 10¹²", "1000"), "科学", ""),
            es = LocalizedContent("¿Cuál es la distancia de una unidad astronómica (UA) en km?", listOf("150 millones", "384 400", "9,46 × 10¹²", "1 000"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 803, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le neurotransmetteur associé au plaisir et à la récompense ?", listOf("Dopamine", "Sérotonine", "Adrénaline", "Noradrénaline"), "Science", ""),
            en = LocalizedContent("Which neurotransmitter is associated with pleasure and reward?", listOf("Dopamine", "Serotonin", "Adrenaline", "Noradrenaline"), "Science", ""),
            zh = LocalizedContent("哪种神经递质与愉悦和奖赏相关？", listOf("多巴胺", "血清素", "肾上腺素", "去甲肾上腺素"), "科学", ""),
            es = LocalizedContent("¿Qué neurotransmisor está asociado con el placer y la recompensa?", listOf("Dopamina", "Serotonina", "Adrenalina", "Noradrenalina"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 804, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de paires de côtes le corps humain possède-t-il ?", listOf("12", "10", "14", "8"), "Science", ""),
            en = LocalizedContent("How many pairs of ribs does the human body have?", listOf("12", "10", "14", "8"), "Science", ""),
            zh = LocalizedContent("人体有多少对肋骨？", listOf("12", "10", "14", "8"), "科学", ""),
            es = LocalizedContent("¿Cuántos pares de costillas tiene el cuerpo humano?", listOf("12", "10", "14", "8"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 805, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le métal le plus conducteur de l'électricité ?", listOf("Argent", "Cuivre", "Or", "Aluminium"), "Science", ""),
            en = LocalizedContent("Which metal is the best conductor of electricity?", listOf("Silver", "Copper", "Gold", "Aluminum"), "Science", ""),
            zh = LocalizedContent("哪种金属导电性最好？", listOf("银", "铜", "金", "铝"), "科学", ""),
            es = LocalizedContent("¿Qué metal es el mejor conductor de la electricidad?", listOf("Plata", "Cobre", "Oro", "Aluminio"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 806, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("À quelle température l'eau gèle-t-elle à une altitude de 8000 mètres ?", listOf("Environ -0,5°C", "0°C", "-5°C", "-10°C"), "Science", ""),
            en = LocalizedContent("At what temperature does water freeze at an altitude of 8000 meters?", listOf("Approximately -0.5°C", "0°C", "-5°C", "-10°C"), "Science", ""),
            zh = LocalizedContent("在海拔8000米处，水在什么温度结冰？", listOf("约-0.5°C", "0°C", "-5°C", "-10°C"), "科学", ""),
            es = LocalizedContent("¿A qué temperatura se congela el agua a una altitud de 8000 metros?", listOf("Aproximadamente -0.5°C", "0°C", "-5°C", "-10°C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 807, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la durée approximative d'une révolution de Jupiter autour du Soleil ?", listOf("12 ans", "5 ans", "29 ans", "84 ans"), "Science", ""),
            en = LocalizedContent("What is the approximate duration of Jupiter's revolution around the Sun?", listOf("12 years", "5 years", "29 years", "84 years"), "Science", ""),
            zh = LocalizedContent("木星绕太阳公转的近似周期是多少？", listOf("12年", "5年", "29年", "84年"), "科学", ""),
            es = LocalizedContent("¿Cuál es la duración aproximada de la revolución de Júpiter alrededor del Sol?", listOf("12 años", "5 años", "29 años", "84 años"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 808, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le type de roche formé par refroidissement du magma ?", listOf("Roche ignée", "Roche sédimentaire", "Roche métamorphique", "Roche volcanique secondaire"), "Science", ""),
            en = LocalizedContent("What type of rock is formed by the cooling of magma?", listOf("Igneous rock", "Sedimentary rock", "Metamorphic rock", "Secondary volcanic rock"), "Science", ""),
            zh = LocalizedContent("岩浆冷却形成哪种类型的岩石？", listOf("火成岩", "沉积岩", "变质岩", "次生火山岩"), "科学", ""),
            es = LocalizedContent("¿Qué tipo de roca se forma por el enfriamiento del magma?", listOf("Roca ígnea", "Roca sedimentaria", "Roca metamórfica", "Roca volcánica secundaria"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 809, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien vaut le nombre d'Avogadro ?", listOf("6.022 × 10²³", "6.626 × 10⁻³⁴", "1.38 × 10⁻²³", "9.109 × 10⁻³¹"), "Science", ""),
            en = LocalizedContent("What is the value of Avogadro's number?", listOf("6.022 × 10²³", "6.626 × 10⁻³⁴", "1.38 × 10⁻²³", "9.109 × 10⁻³¹"), "Science", ""),
            zh = LocalizedContent("阿伏伽德罗常数的值是多少？", listOf("6.022 × 10²³", "6.626 × 10⁻³⁴", "1.38 × 10⁻²³", "9.109 × 10⁻³¹"), "科学", ""),
            es = LocalizedContent("¿Cuál es el valor del número de Avogadro?", listOf("6.022 × 10²³", "6.626 × 10⁻³⁴", "1.38 × 10⁻²³", "9.109 × 10⁻³¹"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 810, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le phénomène par lequel certains matériaux conduisent l'électricité sans résistance ?", listOf("Supraconductivité", "Semi-conductivité", "Résistivité nulle", "Conductivité parfaite"), "Science", ""),
            en = LocalizedContent("What is the phenomenon by which certain materials conduct electricity without resistance?", listOf("Superconductivity", "Semiconductivity", "Zero resistivity", "Perfect conductivity"), "Science", ""),
            zh = LocalizedContent("某些材料无电阻导电的现象叫什么？", listOf("超导", "半导体", "零电阻率", "完美导电"), "科学", ""),
            es = LocalizedContent("¿Cuál es el fenómeno por el cual ciertos materiales conducen electricidad sin resistencia?", listOf("Superconductividad", "Semiconductividad", "Resistividad cero", "Conductividad perfecta"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2000, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est l'unité SI de la force ?", listOf("Newton", "Joule", "Watt", "Pascal"), "Science", ""),
            en = LocalizedContent("What is the SI unit of force?", listOf("Newton", "Joule", "Watt", "Pascal"), "Science", ""),
            zh = LocalizedContent("力的国际单位制单位是什么？", listOf("牛顿", "焦耳", "瓦特", "帕斯卡"), "科学", ""),
            es = LocalizedContent("¿Cuál es la unidad SI de la fuerza?", listOf("Newton", "Joule", "Watt", "Pascal"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2001, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel physicien a découvert la loi de la gravitation universelle ?", listOf("Isaac Newton", "Albert Einstein", "Galilée", "Johannes Kepler"), "Science", ""),
            en = LocalizedContent("Which physicist discovered the law of universal gravitation?", listOf("Isaac Newton", "Albert Einstein", "Galileo", "Johannes Kepler"), "Science", ""),
            zh = LocalizedContent("哪位物理学家发现了万有引力定律？", listOf("艾萨克·牛顿", "阿尔伯特·爱因斯坦", "伽利略", "约翰内斯·开普勒"), "科学", ""),
            es = LocalizedContent("¿Qué físico descubrió la ley de la gravitación universal?", listOf("Isaac Newton", "Albert Einstein", "Galileo", "Johannes Kepler"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2002, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la fusion nucléaire ?", listOf("Union de deux noyaux légers", "Division d'un noyau lourd", "Réaction chimique exothermique", "Désintégration radioactive"), "Science", ""),
            en = LocalizedContent("What is nuclear fusion?", listOf("Union of two light nuclei", "Division of a heavy nucleus", "Exothermic chemical reaction", "Radioactive decay"), "Science", ""),
            zh = LocalizedContent("什么是核聚变？", listOf("两个轻核结合", "一个重核分裂", "放热化学反应", "放射性衰变"), "科学", ""),
            es = LocalizedContent("¿Qué es la fusión nuclear?", listOf("Unión de dos núcleos ligeros", "División de un núcleo pesado", "Reacción química exotérmica", "Desintegración radiactiva"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2003, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est l'unité de mesure de la pression ?", listOf("Pascal", "Newton", "Joule", "Ampère"), "Science", ""),
            en = LocalizedContent("What is the unit of measurement for pressure?", listOf("Pascal", "Newton", "Joule", "Ampere"), "Science", ""),
            zh = LocalizedContent("压强的测量单位是什么？", listOf("帕斯卡", "牛顿", "焦耳", "安培"), "科学", ""),
            es = LocalizedContent("¿Cuál es la unidad de medida de la presión?", listOf("Pascal", "Newton", "Joule", "Amperio"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2004, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le zéro absolu en Kelvin ?", listOf("0 K (-273,15°C)", "0°C", "-100 K", "-300°C"), "Science", ""),
            en = LocalizedContent("What is absolute zero in Kelvin?", listOf("0 K (-273.15°C)", "0°C", "-100 K", "-300°C"), "Science", ""),
            zh = LocalizedContent("开尔文温标下的绝对零度是多少？", listOf("0 K (-273.15°C)", "0°C", "-100 K", "-300°C"), "科学", ""),
            es = LocalizedContent("¿Qué es el cero absoluto en Kelvin?", listOf("0 K (-273.15°C)", "0°C", "-100 K", "-300°C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2005, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel phénomène explique pourquoi le ciel est bleu ?", listOf("Diffusion de Rayleigh", "Réfraction", "Réflexion", "Absorption"), "Science", ""),
            en = LocalizedContent("What phenomenon explains why the sky is blue?", listOf("Rayleigh scattering", "Refraction", "Reflection", "Absorption"), "Science", ""),
            zh = LocalizedContent("什么现象解释了天空为什么是蓝色的？", listOf("瑞利散射", "折射", "反射", "吸收"), "科学", ""),
            es = LocalizedContent("¿Qué fenómeno explica por qué el cielo es azul?", listOf("Dispersión de Rayleigh", "Refracción", "Reflexión", "Absorción"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2006, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la charge de l'électron en coulombs ?", listOf("1,6 × 10⁻¹⁹ C", "1,6 × 10⁻³¹ C", "9,1 × 10⁻³¹ C", "6,6 × 10⁻³⁴ C"), "Science", ""),
            en = LocalizedContent("What is the charge of the electron in coulombs?", listOf("1.6 × 10⁻¹⁹ C", "1.6 × 10⁻³¹ C", "9.1 × 10⁻³¹ C", "6.6 × 10⁻³⁴ C"), "Science", ""),
            zh = LocalizedContent("电子的电荷是多少库仑？", listOf("1.6 × 10⁻¹⁹ C", "1.6 × 10⁻³¹ C", "9.1 × 10⁻³¹ C", "6.6 × 10⁻³⁴ C"), "科学", ""),
            es = LocalizedContent("¿Cuál es la carga del electrón en culombios?", listOf("1,6 × 10⁻¹⁹ C", "1,6 × 10⁻³¹ C", "9,1 × 10⁻³¹ C", "6,6 × 10⁻³⁴ C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2007, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le principe d'incertitude de Heisenberg ?", listOf("On ne peut pas connaître simultanément position et vitesse avec précision", "L'énergie est toujours conservée", "La lumière a une vitesse constante", "Toute action a une réaction"), "Science", ""),
            en = LocalizedContent("What is Heisenberg's uncertainty principle?", listOf("One cannot simultaneously know position and velocity with precision", "Energy is always conserved", "Light has a constant speed", "Every action has a reaction"), "Science", ""),
            zh = LocalizedContent("什么是海森堡不确定性原理？", listOf("无法同时精确知道位置和速度", "能量总是守恒的", "光速恒定", "每个作用都有反作用"), "科学", ""),
            es = LocalizedContent("¿Qué es el principio de incertidumbre de Heisenberg?", listOf("No se puede conocer simultáneamente la posición y la velocidad con precisión", "La energía siempre se conserva", "La luz tiene una velocidad constante", "Toda acción tiene una reacción"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2008, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de lois du mouvement Newton a-t-il énoncées ?", listOf("3", "2", "4", "5"), "Science", ""),
            en = LocalizedContent("How many laws of motion did Newton state?", listOf("3", "2", "4", "5"), "Science", ""),
            zh = LocalizedContent("牛顿提出了几条运动定律？", listOf("3", "2", "4", "5"), "科学", ""),
            es = LocalizedContent("¿Cuántas leyes del movimiento enunció Newton?", listOf("3", "2", "4", "5"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2009, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le phénomène par lequel un corps plongé dans un fluide reçoit une poussée verticale ?", listOf("Poussée d'Archimède", "Effet Bernoulli", "Loi de Pascal", "Capillarité"), "Science", ""),
            en = LocalizedContent("What is the phenomenon by which a body immersed in a fluid experiences an upward thrust?", listOf("Archimedes' principle", "Bernoulli effect", "Pascal's law", "Capillarity"), "Science", ""),
            zh = LocalizedContent("物体浸入流体中受到向上推力的现象是什么？", listOf("阿基米德原理", "伯努利效应", "帕斯卡定律", "毛细现象"), "科学", ""),
            es = LocalizedContent("¿Cuál es el fenómeno por el cual un cuerpo sumergido en un fluido recibe un empuje vertical?", listOf("Principio de Arquímedes", "Efecto Bernoulli", "Ley de Pascal", "Capilaridad"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la formule de l'énergie cinétique ?", listOf("½mv²", "mv", "mgh", "mc²"), "Science", ""),
            en = LocalizedContent("What is the formula for kinetic energy?", listOf("½mv²", "mv", "mgh", "mc²"), "Science", ""),
            zh = LocalizedContent("动能的公式是什么？", listOf("½mv²", "mv", "mgh", "mc²"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula de la energía cinética?", listOf("½mv²", "mv", "mgh", "mc²"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2011, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un trou noir ?", listOf("Région de l'espace dont la gravité est si forte que rien ne peut en échapper", "Une étoile en fin de vie", "Un vide interstellaire", "Une nébuleuse sombre"), "Science", ""),
            en = LocalizedContent("What is a black hole?", listOf("A region of space where gravity is so strong that nothing can escape", "A star at the end of its life", "An interstellar void", "A dark nebula"), "Science", ""),
            zh = LocalizedContent("什么是黑洞？", listOf("引力极强、任何东西都无法逃脱的空间区域", "一颗生命末期的恒星", "星际虚空", "暗星云"), "科学", ""),
            es = LocalizedContent("¿Qué es un agujero negro?", listOf("Región del espacio donde la gravedad es tan fuerte que nada puede escapar", "Una estrella al final de su vida", "Un vacío interestelar", "Una nebulosa oscura"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2012, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle planète tourne sur elle-même dans le sens opposé aux autres ?", listOf("Vénus", "Mercure", "Mars", "Uranus"), "Science", ""),
            en = LocalizedContent("Which planet rotates on its axis in the opposite direction to the others?", listOf("Venus", "Mercury", "Mars", "Uranus"), "Science", ""),
            zh = LocalizedContent("哪颗行星自转方向与其他行星相反？", listOf("金星", "水星", "火星", "天王星"), "科学", ""),
            es = LocalizedContent("¿Qué planeta gira sobre sí mismo en sentido contrario a los demás?", listOf("Venus", "Mercurio", "Marte", "Urano"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2013, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps met la lumière du Soleil pour atteindre la Terre ?", listOf("8 minutes", "1 heure", "1 seconde", "1 jour"), "Science", ""),
            en = LocalizedContent("How long does it take for light from the Sun to reach Earth?", listOf("8 minutes", "1 hour", "1 second", "1 day"), "Science", ""),
            zh = LocalizedContent("太阳光到达地球需要多长时间？", listOf("8分钟", "1小时", "1秒", "1天"), "科学", ""),
            es = LocalizedContent("¿Cuánto tarda la luz del Sol en llegar a la Tierra?", listOf("8 minutos", "1 hora", "1 segundo", "1 día"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2014, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de conservation le plus fondamental en physique ?", listOf("Conservation de l'énergie", "Conservation de la masse", "Conservation de la vitesse", "Conservation du volume"), "Science", ""),
            en = LocalizedContent("What is the most fundamental conservation principle in physics?", listOf("Conservation of energy", "Conservation of mass", "Conservation of speed", "Conservation of volume"), "Science", ""),
            zh = LocalizedContent("物理学中最基本的守恒原理是什么？", listOf("能量守恒", "质量守恒", "速度守恒", "体积守恒"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principio de conservación más fundamental en física?", listOf("Conservación de la energía", "Conservación de la masa", "Conservación de la velocidad", "Conservación del volumen"), "Ciencia", "")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 2015, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique de l'argent ?", listOf("Ag", "Ar", "Si", "Al"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for silver?", listOf("Ag", "Ar", "Si", "Al"), "Science", ""),
            zh = LocalizedContent("银的化学符号是什么？", listOf("Ag", "Ar", "Si", "Al"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico de la plata?", listOf("Ag", "Ar", "Si", "Al"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2016, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du plomb ?", listOf("Pb", "Pl", "Ld", "Le"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for lead?", listOf("Pb", "Pl", "Ld", "Le"), "Science", ""),
            zh = LocalizedContent("铅的化学符号是什么？", listOf("Pb", "Pl", "Ld", "Le"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico del plomo?", listOf("Pb", "Pl", "Ld", "Le"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2017, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule du méthane ?", listOf("CH₄", "C₂H₆", "CO₂", "H₂CO₃"), "Science", ""),
            en = LocalizedContent("What is the formula for methane?", listOf("CH₄", "C₂H₆", "CO₂", "H₂CO₃"), "Science", ""),
            zh = LocalizedContent("甲烷的化学式是什么？", listOf("CH₄", "C₂H₆", "CO₂", "H₂CO₃"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula del metano?", listOf("CH₄", "C₂H₆", "CO₂", "H₂CO₃"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2018, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une réaction d'oxydoréduction ?", listOf("Un transfert d'électrons entre réactifs", "Un transfert de protons", "Une dissolution dans l'eau", "Une réaction endothermique"), "Science", ""),
            en = LocalizedContent("What is a redox reaction?", listOf("A transfer of electrons between reactants", "A transfer of protons", "A dissolution in water", "An endothermic reaction"), "Science", ""),
            zh = LocalizedContent("什么是氧化还原反应？", listOf("反应物之间的电子转移", "质子转移", "在水中溶解", "吸热反应"), "科学", ""),
            es = LocalizedContent("¿Qué es una reacción de oxidación-reducción?", listOf("Una transferencia de electrones entre reactivos", "Una transferencia de protones", "Una disolución en agua", "Una reacción endotérmica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2019, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pH du sang humain normal ?", listOf("7,4", "7,0", "6,8", "8,0"), "Science", ""),
            en = LocalizedContent("What is the pH of normal human blood?", listOf("7.4", "7.0", "6.8", "8.0"), "Science", ""),
            zh = LocalizedContent("正常人体血液的pH值是多少？", listOf("7.4", "7.0", "6.8", "8.0"), "科学", ""),
            es = LocalizedContent("¿Cuál es el pH de la sangre humana normal?", listOf("7,4", "7,0", "6,8", "8,0"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2020, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule de l'ammoniac ?", listOf("NH₃", "NO₂", "N₂O", "NaOH"), "Science", ""),
            en = LocalizedContent("What is the formula for ammonia?", listOf("NH₃", "NO₂", "N₂O", "NaOH"), "Science", ""),
            zh = LocalizedContent("氨的化学式是什么？", listOf("NH₃", "NO₂", "N₂O", "NaOH"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula del amoníaco?", listOf("NH₃", "NO₂", "N₂O", "NaOH"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2021, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'isomères possède le butane ?", listOf("2", "1", "3", "4"), "Science", ""),
            en = LocalizedContent("How many isomers does butane have?", listOf("2", "1", "3", "4"), "Science", ""),
            zh = LocalizedContent("丁烷有多少种同分异构体？", listOf("2", "1", "3", "4"), "科学", ""),
            es = LocalizedContent("¿Cuántos isómeros tiene el butano?", listOf("2", "1", "3", "4"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2022, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le gaz noble le plus utilisé dans les enseignes lumineuses ?", listOf("Néon", "Argon", "Hélium", "Krypton"), "Science", ""),
            en = LocalizedContent("Which noble gas is most used in neon signs?", listOf("Neon", "Argon", "Helium", "Krypton"), "Science", ""),
            zh = LocalizedContent("哪种稀有气体最常用于霓虹灯？", listOf("氖", "氩", "氦", "氪"), "科学", ""),
            es = LocalizedContent("¿Qué gas noble es el más utilizado en los letreros luminosos?", listOf("Neón", "Argón", "Helio", "Kriptón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2023, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la saponification ?", listOf("Fabrication du savon par réaction d'un ester avec une base", "Dissolution d'un sel dans l'eau", "Polymérisation d'un plastique", "Fermentation alcoolique"), "Science", ""),
            en = LocalizedContent("What is saponification?", listOf("Manufacture of soap by reaction of an ester with a base", "Dissolution of a salt in water", "Polymerization of a plastic", "Alcoholic fermentation"), "Science", ""),
            zh = LocalizedContent("什么是皂化反应？", listOf("酯与碱反应制造肥皂", "盐在水中溶解", "塑料的聚合", "酒精发酵"), "科学", ""),
            es = LocalizedContent("¿Qué es la saponificación?", listOf("Fabricación de jabón mediante reacción de un éster con una base", "Disolución de una sal en agua", "Polimerización de un plástico", "Fermentación alcohólica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel métal est liquide à température ambiante ?", listOf("Mercure", "Gallium", "Césium", "Cuivre"), "Science", ""),
            en = LocalizedContent("Which metal is liquid at room temperature?", listOf("Mercury", "Gallium", "Cesium", "Copper"), "Science", ""),
            zh = LocalizedContent("哪种金属在室温下是液态？", listOf("汞", "镓", "铯", "铜"), "科学", ""),
            es = LocalizedContent("¿Qué metal es líquido a temperatura ambiente?", listOf("Mercurio", "Galio", "Cesio", "Cobre"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2025, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la formule du sulfate de cuivre ?", listOf("CuSO₄", "Cu₂S", "CuO₂", "Cu(OH)₂"), "Science", ""),
            en = LocalizedContent("What is the formula of copper sulfate?", listOf("CuSO₄", "Cu₂S", "CuO₂", "Cu(OH)₂"), "Science", ""),
            zh = LocalizedContent("硫酸铜的化学式是什么？", listOf("CuSO₄", "Cu₂S", "CuO₂", "Cu(OH)₂"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula del sulfato de cobre?", listOf("CuSO₄", "Cu₂S", "CuO₂", "Cu(OH)₂"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2026, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la chromatographie ?", listOf("Technique de séparation des constituants d'un mélange", "Mesure de la température de fusion", "Synthèse d'une molécule organique", "Analyse spectroscopique"), "Science", ""),
            en = LocalizedContent("What is chromatography?", listOf("Technique for separating components of a mixture", "Measurement of melting point", "Synthesis of an organic molecule", "Spectroscopic analysis"), "Science", ""),
            zh = LocalizedContent("什么是色谱法？", listOf("分离混合物组分的技术", "测量熔点", "合成有机分子", "光谱分析"), "科学", ""),
            es = LocalizedContent("¿Qué es la cromatografía?", listOf("Técnica de separación de los componentes de una mezcla", "Medición del punto de fusión", "Síntesis de una molécula orgánica", "Análisis espectroscópico"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principal constituant du gaz naturel ?", listOf("Méthane", "Propane", "Butane", "Éthane"), "Science", ""),
            en = LocalizedContent("What is the main component of natural gas?", listOf("Methane", "Propane", "Butane", "Ethane"), "Science", ""),
            zh = LocalizedContent("天然气的主要成分是什么？", listOf("甲烷", "丙烷", "丁烷", "乙烷"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principal componente del gas natural?", listOf("Metano", "Propano", "Butano", "Etano"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle liaison chimique est la plus forte ?", listOf("Liaison covalente", "Liaison ionique", "Liaison hydrogène", "Liaison de Van der Waals"), "Science", ""),
            en = LocalizedContent("Which chemical bond is the strongest?", listOf("Covalent bond", "Ionic bond", "Hydrogen bond", "Van der Waals bond"), "Science", ""),
            zh = LocalizedContent("哪种化学键最强？", listOf("共价键", "离子键", "氢键", "范德华力"), "科学", ""),
            es = LocalizedContent("¿Qué enlace químico es el más fuerte?", listOf("Enlace covalente", "Enlace iónico", "Enlace de hidrógeno", "Enlace de Van der Waals"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2029, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acide est présent dans le vinaigre ?", listOf("Acide acétique", "Acide citrique", "Acide chlorhydrique", "Acide sulfurique"), "Science", ""),
            en = LocalizedContent("Which acid is present in vinegar?", listOf("Acetic acid", "Citric acid", "Hydrochloric acid", "Sulfuric acid"), "Science", ""),
            zh = LocalizedContent("醋中含有哪种酸？", listOf("乙酸", "柠檬酸", "盐酸", "硫酸"), "科学", ""),
            es = LocalizedContent("¿Qué ácido está presente en el vinagre?", listOf("Ácido acético", "Ácido cítrico", "Ácido clorhídrico", "Ácido sulfúrico"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2030, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'électrolyse ?", listOf("Décomposition d'un composé par le courant électrique", "Synthèse par réaction chimique", "Distillation d'un mélange", "Neutralisation acide-base"), "Science", ""),
            en = LocalizedContent("What is electrolysis?", listOf("Decomposition of a compound by electric current", "Synthesis by chemical reaction", "Distillation of a mixture", "Acid-base neutralization"), "Science", ""),
            zh = LocalizedContent("什么是电解？", listOf("通过电流分解化合物", "通过化学反应合成", "蒸馏混合物", "酸碱中和"), "科学", ""),
            es = LocalizedContent("¿Qué es la electrólisis?", listOf("Descomposición de un compuesto por corriente eléctrica", "Síntesis por reacción química", "Destilación de una mezcla", "Neutralización ácido-base"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la molécule qui transporte l'oxygène dans le sang ?", listOf("Hémoglobine", "Insuline", "Kératine", "Myoglobine"), "Science", ""),
            en = LocalizedContent("What is the name of the molecule that carries oxygen in the blood?", listOf("Hemoglobin", "Insulin", "Keratin", "Myoglobin"), "Science", ""),
            zh = LocalizedContent("血液中携带氧气的分子叫什么？", listOf("血红蛋白", "胰岛素", "角蛋白", "肌红蛋白"), "科学", ""),
            es = LocalizedContent("¿Cuál es el nombre de la molécula que transporta oxígeno en la sangre?", listOf("Hemoglobina", "Insulina", "Queratina", "Mioglobina"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2032, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de paires de bases azotées compose une molécule d'ADN humain ?", listOf("3 milliards", "1 milliard", "10 milliards", "500 millions"), "Science", ""),
            en = LocalizedContent("How many base pairs make up a human DNA molecule?", listOf("3 billion", "1 billion", "10 billion", "500 million"), "Science", ""),
            zh = LocalizedContent("人类DNA分子由多少对碱基组成？", listOf("30亿", "10亿", "100亿", "5亿"), "科学", ""),
            es = LocalizedContent("¿Cuántos pares de bases componen una molécula de ADN humano?", listOf("3 mil millones", "1 mil millones", "10 mil millones", "500 millones"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2033, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel organe produit la bile ?", listOf("Le foie", "Le pancréas", "La vésicule biliaire", "Les reins"), "Science", ""),
            en = LocalizedContent("Which organ produces bile?", listOf("The liver", "The pancreas", "The gallbladder", "The kidneys"), "Science", ""),
            zh = LocalizedContent("哪个器官产生胆汁？", listOf("肝脏", "胰腺", "胆囊", "肾脏"), "科学", ""),
            es = LocalizedContent("¿Qué órgano produce la bilis?", listOf("El hígado", "El páncreas", "La vesícula biliar", "Los riñones"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2034, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la durée de vie moyenne d'un globule rouge ?", listOf("120 jours", "30 jours", "1 an", "7 jours"), "Science", ""),
            en = LocalizedContent("What is the average lifespan of a red blood cell?", listOf("120 days", "30 days", "1 year", "7 days"), "Science", ""),
            zh = LocalizedContent("红细胞的平均寿命是多少？", listOf("120天", "30天", "1年", "7天"), "科学", ""),
            es = LocalizedContent("¿Cuál es la vida media de un glóbulo rojo?", listOf("120 días", "30 días", "1 año", "7 días"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2035, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la mitose ?", listOf("Division cellulaire produisant deux cellules identiques", "Fusion de deux cellules", "Transport de nutriments", "Synthèse protéique"), "Science", ""),
            en = LocalizedContent("What is mitosis?", listOf("Cell division producing two identical cells", "Fusion of two cells", "Nutrient transport", "Protein synthesis"), "Science", ""),
            zh = LocalizedContent("什么是有丝分裂？", listOf("产生两个相同细胞的细胞分裂", "两个细胞的融合", "营养运输", "蛋白质合成"), "科学", ""),
            es = LocalizedContent("¿Qué es la mitosis?", listOf("División celular que produce dos células idénticas", "Fusión de dos células", "Transporte de nutrientes", "Síntesis de proteínas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2036, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus petit os du corps humain ?", listOf("L'étrier (oreille)", "La rotule", "La phalange", "Le sésamoïde"), "Science", ""),
            en = LocalizedContent("What is the smallest bone in the human body?", listOf("Stapes (ear)", "Patella", "Phalanx", "Sesamoid"), "Science", ""),
            zh = LocalizedContent("人体中最小的骨头是什么？", listOf("镫骨（耳朵）", "髌骨", "指骨", "籽骨"), "科学", ""),
            es = LocalizedContent("¿Cuál es el hueso más pequeño del cuerpo humano?", listOf("El estribo (oído)", "La rótula", "La falange", "El sesamoideo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2037, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de vertèbres compte la colonne vertébrale humaine ?", listOf("33", "24", "30", "26"), "Science", ""),
            en = LocalizedContent("How many vertebrae does the human spine have?", listOf("33", "24", "30", "26"), "Science", ""),
            zh = LocalizedContent("人类脊柱有多少块椎骨？", listOf("33", "24", "30", "26"), "科学", ""),
            es = LocalizedContent("¿Cuántas vértebras tiene la columna vertebral humana?", listOf("33", "24", "30", "26"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2038, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la fréquence cardiaque normale au repos ?", listOf("60-100 bpm", "40-60 bpm", "100-120 bpm", "30-50 bpm"), "Science", ""),
            en = LocalizedContent("What is the normal resting heart rate?", listOf("60-100 bpm", "40-60 bpm", "100-120 bpm", "30-50 bpm"), "Science", ""),
            zh = LocalizedContent("正常静息心率是多少？", listOf("60-100 次/分钟", "40-60 次/分钟", "100-120 次/分钟", "30-50 次/分钟"), "科学", ""),
            es = LocalizedContent("¿Cuál es la frecuencia cardíaca normal en reposo?", listOf("60-100 lpm", "40-60 lpm", "100-120 lpm", "30-50 lpm"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2039, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel nerf est le plus long du corps humain ?", listOf("Nerf sciatique", "Nerf vague", "Nerf optique", "Nerf facial"), "Science", ""),
            en = LocalizedContent("Which nerve is the longest in the human body?", listOf("Sciatic nerve", "Vagus nerve", "Optic nerve", "Facial nerve"), "Science", ""),
            zh = LocalizedContent("人体中最长的神经是哪一条？", listOf("坐骨神经", "迷走神经", "视神经", "面神经"), "科学", ""),
            es = LocalizedContent("¿Cuál es el nervio más largo del cuerpo humano?", listOf("Nervio ciático", "Nervio vago", "Nervio óptico", "Nervio facial"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2040, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le génome humain ?", listOf("L'ensemble du matériel génétique d'un être humain", "Un chromosome particulier", "L'ADN mitochondrial", "Les gènes actifs uniquement"), "Science", ""),
            en = LocalizedContent("What is the human genome?", listOf("The complete set of genetic material of a human being", "A particular chromosome", "Mitochondrial DNA", "Only active genes"), "Science", ""),
            zh = LocalizedContent("什么是人类基因组？", listOf("人类全部遗传物质的总和", "某一条染色体", "线粒体DNA", "仅活跃基因"), "科学", ""),
            es = LocalizedContent("¿Qué es el genoma humano?", listOf("El conjunto completo de material genético de un ser humano", "Un cromosoma particular", "El ADN mitocondrial", "Solo los genes activos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le principal gaz échangé lors de la respiration cellulaire ?", listOf("Dioxyde de carbone et oxygène", "Azote et oxygène", "Monoxyde de carbone", "Hydrogène et oxygène"), "Science", ""),
            en = LocalizedContent("What is the main gas exchanged during cellular respiration?", listOf("Carbon dioxide and oxygen", "Nitrogen and oxygen", "Carbon monoxide", "Hydrogen and oxygen"), "Science", ""),
            zh = LocalizedContent("细胞呼吸过程中交换的主要气体是什么？", listOf("二氧化碳和氧气", "氮气和氧气", "一氧化碳", "氢气和氧气"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principal gas intercambiado durante la respiración celular?", listOf("Dióxido de carbono y oxígeno", "Nitrógeno y oxígeno", "Monóxido de carbono", "Hidrógeno y oxígeno"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2042, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de types de globules blancs existe-t-il ?", listOf("5", "3", "7", "2"), "Science", ""),
            en = LocalizedContent("How many types of white blood cells are there?", listOf("5", "3", "7", "2"), "Science", ""),
            zh = LocalizedContent("有多少种白细胞？", listOf("5", "3", "7", "2"), "科学", ""),
            es = LocalizedContent("¿Cuántos tipos de glóbulos blancos existen?", listOf("5", "3", "7", "2"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2043, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la vitesse de transmission d'une impulsion nerveuse ?", listOf("Jusqu'à 120 m/s", "1 m/s", "10 m/s", "300 m/s"), "Science", ""),
            en = LocalizedContent("What is the transmission speed of a nerve impulse?", listOf("Up to 120 m/s", "1 m/s", "10 m/s", "300 m/s"), "Science", ""),
            zh = LocalizedContent("神经冲动的传导速度是多少？", listOf("高达 120 米/秒", "1 米/秒", "10 米/秒", "300 米/秒"), "科学", ""),
            es = LocalizedContent("¿Cuál es la velocidad de transmisión de un impulso nervioso?", listOf("Hasta 120 m/s", "1 m/s", "10 m/s", "300 m/s"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2044, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la méiose ?", listOf("Division cellulaire produisant des gamètes", "Division cellulaire ordinaire", "Apoptose cellulaire", "Différenciation cellulaire"), "Science", ""),
            en = LocalizedContent("What is meiosis?", listOf("Cell division producing gametes", "Ordinary cell division", "Cell apoptosis", "Cell differentiation"), "Science", ""),
            zh = LocalizedContent("什么是减数分裂？", listOf("产生配子的细胞分裂", "普通细胞分裂", "细胞凋亡", "细胞分化"), "科学", ""),
            es = LocalizedContent("¿Qué es la meiosis?", listOf("División celular que produce gametos", "División celular ordinaria", "Apoptosis celular", "Diferenciación celular"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2045, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle principal des mitochondries ?", listOf("Production d'énergie (ATP)", "Synthèse des protéines", "Stockage de l'ADN", "Division cellulaire"), "Science", ""),
            en = LocalizedContent("What is the main role of mitochondria?", listOf("Energy production (ATP)", "Protein synthesis", "DNA storage", "Cell division"), "Science", ""),
            zh = LocalizedContent("线粒体的主要作用是什么？", listOf("产生能量（ATP）", "蛋白质合成", "储存DNA", "细胞分裂"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel principal de las mitocondrias?", listOf("Producción de energía (ATP)", "Síntesis de proteínas", "Almacenamiento de ADN", "División celular"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2046, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle étoile est la plus proche du Soleil ?", listOf("Proxima Centauri", "Sirius", "Bételgeuse", "Vega"), "Science", ""),
            en = LocalizedContent("Which star is closest to the Sun?", listOf("Proxima Centauri", "Sirius", "Betelgeuse", "Vega"), "Science", ""),
            zh = LocalizedContent("哪颗恒星离太阳最近？", listOf("比邻星", "天狼星", "参宿四", "织女星"), "科学", ""),
            es = LocalizedContent("¿Qué estrella está más cerca del Sol?", listOf("Próxima Centauri", "Sirio", "Betelgeuse", "Vega"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2047, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une supernova ?", listOf("Explosion d'une étoile en fin de vie", "Naissance d'une étoile", "Collision de galaxies", "Éruption solaire"), "Science", ""),
            en = LocalizedContent("What is a supernova?", listOf("Explosion of a star at the end of its life", "Birth of a star", "Collision of galaxies", "Solar flare"), "Science", ""),
            zh = LocalizedContent("什么是超新星？", listOf("恒星生命末期的爆炸", "恒星的诞生", "星系碰撞", "太阳耀斑"), "科学", ""),
            es = LocalizedContent("¿Qué es una supernova?", listOf("Explosión de una estrella al final de su vida", "Nacimiento de una estrella", "Colisión de galaxias", "Erupción solar"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2048, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois le Soleil tiendrait dans Jupiter ?", listOf("1 000", "100", "10 000", "500"), "Science", ""),
            en = LocalizedContent("How many times could the Sun fit inside Jupiter?", listOf("1,000", "100", "10,000", "500"), "Science", ""),
            zh = LocalizedContent("太阳的体积是木星的多少倍？", listOf("1000", "100", "10000", "500"), "科学", ""),
            es = LocalizedContent("¿Cuántas veces cabría el Sol dentro de Júpiter?", listOf("1000", "100", "10000", "500"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2049, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la composition principale du Soleil ?", listOf("Hydrogène et hélium", "Oxygène et carbone", "Azote et néon", "Fer et nickel"), "Science", ""),
            en = LocalizedContent("What is the main composition of the Sun?", listOf("Hydrogen and helium", "Oxygen and carbon", "Nitrogen and neon", "Iron and nickel"), "Science", ""),
            zh = LocalizedContent("太阳的主要成分是什么？", listOf("氢和氦", "氧和碳", "氮和氖", "铁和镍"), "科学", ""),
            es = LocalizedContent("¿Cuál es la composición principal del Sol?", listOf("Hidrógeno y helio", "Oxígeno y carbono", "Nitrógeno y neón", "Hierro y níquel"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une année-lumière ?", listOf("La distance parcourue par la lumière en un an", "La durée d'un cycle solaire", "L'unité de temps astronomique", "La distance Terre-Soleil"), "Science", ""),
            en = LocalizedContent("What is a light-year?", listOf("The distance light travels in one year", "The duration of a solar cycle", "The astronomical unit of time", "The Earth-Sun distance"), "Science", ""),
            zh = LocalizedContent("什么是光年？", listOf("光在一年内传播的距离", "一个太阳周期的持续时间", "天文时间单位", "地球到太阳的距离"), "科学", ""),
            es = LocalizedContent("¿Qué es un año luz?", listOf("La distancia que recorre la luz en un año", "La duración de un ciclo solar", "La unidad de tiempo astronómica", "La distancia Tierra-Sol"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2051, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le diamètre approximatif du Soleil en km ?", listOf("1 390 000 km", "140 000 km", "13 900 km", "13 900 000 km"), "Science", ""),
            en = LocalizedContent("What is the approximate diameter of the Sun in km?", listOf("1,390,000 km", "140,000 km", "13,900 km", "13,900,000 km"), "Science", ""),
            zh = LocalizedContent("太阳的直径大约是多少公里？", listOf("1390000公里", "140000公里", "13900公里", "13900000公里"), "科学", ""),
            es = LocalizedContent("¿Cuál es el diámetro aproximado del Sol en km?", listOf("1.390.000 km", "140.000 km", "13.900 km", "13.900.000 km"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2052, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle planète a les anneaux les plus visibles ?", listOf("Saturne", "Jupiter", "Uranus", "Neptune"), "Science", ""),
            en = LocalizedContent("Which planet has the most visible rings?", listOf("Saturn", "Jupiter", "Uranus", "Neptune"), "Science", ""),
            zh = LocalizedContent("哪颗行星拥有最明显的环？", listOf("土星", "木星", "天王星", "海王星"), "科学", ""),
            es = LocalizedContent("¿Qué planeta tiene los anillos más visibles?", listOf("Saturno", "Júpiter", "Urano", "Neptuno"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2053, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la matière noire ?", listOf("Matière invisible qui interagit gravitationnellement", "Trous noirs en fusion", "Gaz interstellaire sombre", "Étoiles éteintes"), "Science", ""),
            en = LocalizedContent("What is dark matter?", listOf("Invisible matter that interacts gravitationally", "Merging black holes", "Dark interstellar gas", "Dead stars"), "Science", ""),
            zh = LocalizedContent("什么是暗物质？", listOf("通过引力相互作用的不可见物质", "合并的黑洞", "暗星际气体", "死亡的恒星"), "科学", ""),
            es = LocalizedContent("¿Qué es la materia oscura?", listOf("Materia invisible que interactúa gravitacionalmente", "Agujeros negros en fusión", "Gas interestelar oscuro", "Estrellas muertas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2054, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel vaisseau spatial a quitté le système solaire en premier ?", listOf("Voyager 1", "Pioneer 10", "New Horizons", "Cassini"), "Science", ""),
            en = LocalizedContent("Which spacecraft left the solar system first?", listOf("Voyager 1", "Pioneer 10", "New Horizons", "Cassini"), "Science", ""),
            zh = LocalizedContent("哪艘航天器最先离开太阳系？", listOf("旅行者1号", "先驱者10号", "新视野号", "卡西尼号"), "科学", ""),
            es = LocalizedContent("¿Qué nave espacial salió primero del sistema solar?", listOf("Voyager 1", "Pioneer 10", "New Horizons", "Cassini"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2055, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la température de surface du Soleil ?", listOf("5 500°C", "1 000°C", "15 000°C", "500°C"), "Science", ""),
            en = LocalizedContent("What is the surface temperature of the Sun?", listOf("5,500°C", "1,000°C", "15,000°C", "500°C"), "Science", ""),
            zh = LocalizedContent("太阳的表面温度是多少？", listOf("5,500°C", "1,000°C", "15,000°C", "500°C"), "科学", ""),
            es = LocalizedContent("¿Cuál es la temperatura superficial del Sol?", listOf("5,500°C", "1,000°C", "15,000°C", "500°C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2056, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une éclipse solaire ?", listOf("La Lune passe devant le Soleil", "La Terre passe devant le Soleil", "Le Soleil disparaît", "Une tempête solaire"), "Science", ""),
            en = LocalizedContent("What is a solar eclipse?", listOf("The Moon passes in front of the Sun", "The Earth passes in front of the Sun", "The Sun disappears", "A solar storm"), "Science", ""),
            zh = LocalizedContent("什么是日食？", listOf("月球从太阳前面经过", "地球从太阳前面经过", "太阳消失", "太阳风暴"), "科学", ""),
            es = LocalizedContent("¿Qué es un eclipse solar?", listOf("La Luna pasa frente al Sol", "La Tierra pasa frente al Sol", "El Sol desaparece", "Una tormenta solar"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2057, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de temps dure une rotation de la Terre sur elle-même ?", listOf("24 heures (23h 56min)", "12 heures", "48 heures", "6 heures"), "Science", ""),
            en = LocalizedContent("How long does one rotation of the Earth on its axis take?", listOf("24 hours (23h 56min)", "12 hours", "48 hours", "6 hours"), "Science", ""),
            zh = LocalizedContent("地球自转一周需要多长时间？", listOf("24小时（23小时56分钟）", "12小时", "48小时", "6小时"), "科学", ""),
            es = LocalizedContent("¿Cuánto dura una rotación de la Tierra sobre su eje?", listOf("24 horas (23h 56min)", "12 horas", "48 horas", "6 horas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2058, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la taille de la Voie Lactée en années-lumière ?", listOf("100 000", "1 000", "1 000 000", "10 000"), "Science", ""),
            en = LocalizedContent("What is the size of the Milky Way in light-years?", listOf("100,000", "1,000", "1,000,000", "10,000"), "Science", ""),
            zh = LocalizedContent("银河系的直径是多少光年？", listOf("100,000", "1,000", "1,000,000", "10,000"), "科学", ""),
            es = LocalizedContent("¿Cuál es el tamaño de la Vía Láctea en años luz?", listOf("100,000", "1,000", "1,000,000", "10,000"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'effet Doppler en astronomie ?", listOf("Décalage de la fréquence d'une onde selon le mouvement de la source", "Augmentation de luminosité d'une étoile", "Déflexion de la lumière par gravité", "Expansion de l'univers"), "Science", ""),
            en = LocalizedContent("What is the Doppler effect in astronomy?", listOf("Shift in the frequency of a wave due to the motion of the source", "Increase in a star's brightness", "Deflection of light by gravity", "Expansion of the universe"), "Science", ""),
            zh = LocalizedContent("天文学中的多普勒效应是什么？", listOf("由于波源运动导致的波的频率偏移", "恒星亮度的增加", "光线被引力偏折", "宇宙膨胀"), "科学", ""),
            es = LocalizedContent("¿Qué es el efecto Doppler en astronomía?", listOf("Desplazamiento en la frecuencia de una onda debido al movimiento de la fuente", "Aumento del brillo de una estrella", "Desviación de la luz por gravedad", "Expansión del universo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2060, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la première femme dans l'espace ?", listOf("Valentina Terechkova", "Sally Ride", "Eileen Collins", "Svetlana Savitskaya"), "Science", ""),
            en = LocalizedContent("What is the name of the first woman in space?", listOf("Valentina Tereshkova", "Sally Ride", "Eileen Collins", "Svetlana Savitskaya"), "Science", ""),
            zh = LocalizedContent("第一位进入太空的女性叫什么名字？", listOf("瓦莲京娜·捷列什科娃", "萨莉·赖德", "艾琳·柯林斯", "斯韦特兰娜·萨维茨卡娅"), "科学", ""),
            es = LocalizedContent("¿Cuál es el nombre de la primera mujer en el espacio?", listOf("Valentina Tereshkova", "Sally Ride", "Eileen Collins", "Svetlana Savitskaya"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2061, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le nombre π (pi) ?", listOf("Rapport circonférence/diamètre d'un cercle", "Carré de la racine de 2", "Base du logarithme naturel", "Constante de Planck"), "Science", ""),
            en = LocalizedContent("What is the number π (pi)?", listOf("Ratio of a circle's circumference to its diameter", "Square of the square root of 2", "Base of natural logarithm", "Planck's constant"), "Science", ""),
            zh = LocalizedContent("π（圆周率）是什么？", listOf("圆的周长与直径之比", "2的平方根的平方", "自然对数的底数", "普朗克常数"), "科学", ""),
            es = LocalizedContent("¿Qué es el número π (pi)?", listOf("Relación entre la circunferencia y el diámetro de un círculo", "Cuadrado de la raíz cuadrada de 2", "Base del logaritmo natural", "Constante de Planck"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2062, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la valeur de e (nombre d'Euler) approximativement ?", listOf("2,718", "3,141", "1,618", "2,303"), "Science", ""),
            en = LocalizedContent("What is the approximate value of e (Euler's number)?", listOf("2.718", "3.141", "1.618", "2.303"), "Science", ""),
            zh = LocalizedContent("e（欧拉数）的近似值是多少？", listOf("2.718", "3.141", "1.618", "2.303"), "科学", ""),
            es = LocalizedContent("¿Cuál es el valor aproximado de e (número de Euler)?", listOf("2.718", "3.141", "1.618", "2.303"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2063, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien y a-t-il de nombres premiers inférieurs à 100 ?", listOf("25", "20", "30", "15"), "Science", ""),
            en = LocalizedContent("How many prime numbers are there less than 100?", listOf("25", "20", "30", "15"), "Science", ""),
            zh = LocalizedContent("小于100的质数有多少个？", listOf("25", "20", "30", "15"), "科学", ""),
            es = LocalizedContent("¿Cuántos números primos hay menores de 100?", listOf("25", "20", "30", "15"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2064, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une fonction injective ?", listOf("Deux éléments distincts ont des images distinctes", "Tout élément a une image unique", "La fonction est continue", "La fonction est dérivable"), "Science", ""),
            en = LocalizedContent("What is an injective function?", listOf("Two distinct elements have distinct images", "Every element has a unique image", "The function is continuous", "The function is differentiable"), "Science", ""),
            zh = LocalizedContent("什么是单射函数？", listOf("两个不同的元素有不同的像", "每个元素都有唯一的像", "函数是连续的", "函数是可导的"), "科学", ""),
            es = LocalizedContent("¿Qué es una función inyectiva?", listOf("Dos elementos distintos tienen imágenes distintas", "Todo elemento tiene una imagen única", "La función es continua", "La función es derivable"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2065, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la formule du volume d'une sphère ?", listOf("4/3 × π × r³", "π × r²", "4 × π × r²", "2/3 × π × r³"), "Science", ""),
            en = LocalizedContent("What is the formula for the volume of a sphere?", listOf("4/3 × π × r³", "π × r²", "4 × π × r²", "2/3 × π × r³"), "Science", ""),
            zh = LocalizedContent("球体体积的公式是什么？", listOf("4/3 × π × r³", "π × r²", "4 × π × r²", "2/3 × π × r³"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula del volumen de una esfera?", listOf("4/3 × π × r³", "π × r²", "4 × π × r²", "2/3 × π × r³"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2066, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le théorème de Pythagore ?", listOf("Dans un triangle rectangle, c² = a² + b²", "La somme des angles d'un triangle est 180°", "Deux droites parallèles ne se croisent pas", "L'aire d'un cercle est πr²"), "Science", ""),
            en = LocalizedContent("What is the Pythagorean theorem?", listOf("In a right triangle, c² = a² + b²", "The sum of angles in a triangle is 180°", "Two parallel lines never intersect", "The area of a circle is πr²"), "Science", ""),
            zh = LocalizedContent("什么是勾股定理？", listOf("在直角三角形中，c² = a² + b²", "三角形内角和为180°", "两条平行线永不相交", "圆的面积是πr²"), "科学", ""),
            es = LocalizedContent("¿Qué es el teorema de Pitágoras?", listOf("En un triángulo rectángulo, c² = a² + b²", "La suma de los ángulos de un triángulo es 180°", "Dos rectas paralelas no se cruzan", "El área de un círculo es πr²"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la dérivée de sin(x) ?", listOf("cos(x)", "-cos(x)", "-sin(x)", "tan(x)"), "Science", ""),
            en = LocalizedContent("What is the derivative of sin(x)?", listOf("cos(x)", "-cos(x)", "-sin(x)", "tan(x)"), "Science", ""),
            zh = LocalizedContent("sin(x)的导数是什么？", listOf("cos(x)", "-cos(x)", "-sin(x)", "tan(x)"), "科学", ""),
            es = LocalizedContent("¿Cuál es la derivada de sin(x)?", listOf("cos(x)", "-cos(x)", "-sin(x)", "tan(x)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2068, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la suite de Fibonacci ?", listOf("Chaque terme est la somme des deux précédents", "Chaque terme est le double du précédent", "Suite des nombres premiers", "Suite des carrés parfaits"), "Science", ""),
            en = LocalizedContent("What is the Fibonacci sequence?", listOf("Each term is the sum of the two preceding ones", "Each term is double the previous one", "Sequence of prime numbers", "Sequence of perfect squares"), "Science", ""),
            zh = LocalizedContent("什么是斐波那契数列？", listOf("每一项是前两项之和", "每一项是前一项的两倍", "质数数列", "完全平方数列"), "科学", ""),
            es = LocalizedContent("¿Qué es la sucesión de Fibonacci?", listOf("Cada término es la suma de los dos anteriores", "Cada término es el doble del anterior", "Sucesión de números primos", "Sucesión de cuadrados perfectos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le résultat de 2^10 ?", listOf("1024", "512", "2048", "1000"), "Science", ""),
            en = LocalizedContent("What is the result of 2^10?", listOf("1024", "512", "2048", "1000"), "Science", ""),
            zh = LocalizedContent("2^10的结果是多少？", listOf("1024", "512", "2048", "1000"), "科学", ""),
            es = LocalizedContent("¿Cuál es el resultado de 2^10?", listOf("1024", "512", "2048", "1000"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2070, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un nombre complexe ?", listOf("Nombre de la forme a + bi avec i² = -1", "Nombre supérieur à 1 million", "Nombre irrationnel", "Nombre à plusieurs décimales"), "Science", ""),
            en = LocalizedContent("What is a complex number?", listOf("Number of the form a + bi with i² = -1", "Number greater than 1 million", "Irrational number", "Number with many decimal places"), "Science", ""),
            zh = LocalizedContent("什么是复数？", listOf("形如a + bi且i² = -1的数", "大于100万的数", "无理数", "多位小数的数"), "科学", ""),
            es = LocalizedContent("¿Qué es un número complejo?", listOf("Número de la forma a + bi con i² = -1", "Número mayor que 1 millón", "Número irracional", "Número con muchos decimales"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la probabilité d'obtenir pile deux fois en lançant une pièce deux fois ?", listOf("1/4", "1/2", "1/3", "1/8"), "Science", ""),
            en = LocalizedContent("What is the probability of getting heads twice when flipping a coin twice?", listOf("1/4", "1/2", "1/3", "1/8"), "Science", ""),
            zh = LocalizedContent("抛两次硬币，两次都得到正面的概率是多少？", listOf("1/4", "1/2", "1/3", "1/8"), "科学", ""),
            es = LocalizedContent("¿Cuál es la probabilidad de obtener cara dos veces al lanzar una moneda dos veces?", listOf("1/4", "1/2", "1/3", "1/8"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2072, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le logarithme naturel de e ?", listOf("1", "0", "e", "2,718"), "Science", ""),
            en = LocalizedContent("What is the natural logarithm of e?", listOf("1", "0", "e", "2.718"), "Science", ""),
            zh = LocalizedContent("e的自然对数是多少？", listOf("1", "0", "e", "2.718"), "科学", ""),
            es = LocalizedContent("¿Cuál es el logaritmo natural de e?", listOf("1", "0", "e", "2.718"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2073, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de faces a un icosaèdre régulier ?", listOf("20", "12", "8", "16"), "Science", ""),
            en = LocalizedContent("How many faces does a regular icosahedron have?", listOf("20", "12", "8", "16"), "Science", ""),
            zh = LocalizedContent("正二十面体有多少个面？", listOf("20", "12", "8", "16"), "科学", ""),
            es = LocalizedContent("¿Cuántas caras tiene un icosaedro regular?", listOf("20", "12", "8", "16"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2074, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une matrice carrée inversible ?", listOf("Une matrice dont le déterminant est non nul", "Une matrice symétrique", "Une matrice diagonale", "Une matrice orthogonale"), "Science", ""),
            en = LocalizedContent("What is an invertible square matrix?", listOf("A matrix with non-zero determinant", "A symmetric matrix", "A diagonal matrix", "An orthogonal matrix"), "Science", ""),
            zh = LocalizedContent("什么是可逆方阵？", listOf("行列式非零的矩阵", "对称矩阵", "对角矩阵", "正交矩阵"), "科学", ""),
            es = LocalizedContent("¿Qué es una matriz cuadrada invertible?", listOf("Una matriz con determinante no nulo", "Una matriz simétrica", "Una matriz diagonal", "Una matriz ortogonal"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2075, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la somme des angles intérieurs d'un hexagone régulier ?", listOf("720°", "540°", "360°", "900°"), "Science", ""),
            en = LocalizedContent("What is the sum of interior angles of a regular hexagon?", listOf("720°", "540°", "360°", "900°"), "Science", ""),
            zh = LocalizedContent("正六边形的内角和是多少？", listOf("720°", "540°", "360°", "900°"), "科学", ""),
            es = LocalizedContent("¿Cuál es la suma de los ángulos interiores de un hexágono regular?", listOf("720°", "540°", "360°", "900°"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 2076, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire romain d'Orient a survécu jusqu'en 1453 ?", listOf("Empire byzantin", "Empire ottoman", "Empire macédonien", "Empire parthe"), "Histoire", ""),
            en = LocalizedContent("Which Eastern Roman Empire survived until 1453?", listOf("Byzantine Empire", "Ottoman Empire", "Macedonian Empire", "Parthian Empire"), "History", ""),
            zh = LocalizedContent("哪个东罗马帝国一直存在到1453年？", listOf("拜占庭帝国", "奥斯曼帝国", "马其顿帝国", "帕提亚帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio romano de Oriente sobrevivió hasta 1453?", listOf("Imperio bizantino", "Imperio otomano", "Imperio macedonio", "Imperio parto"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2077, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé l'empire Alexandre le Grand ?", listOf("Alexandre III de Macédoine", "Philippe II", "Ptolémée", "Séleucus"), "Histoire", ""),
            en = LocalizedContent("Who founded the empire of Alexander the Great?", listOf("Alexander III of Macedon", "Philip II", "Ptolemy", "Seleucus"), "History", ""),
            zh = LocalizedContent("谁建立了亚历山大大帝的帝国？", listOf("马其顿的亚历山大三世", "腓力二世", "托勒密", "塞琉古"), "历史", ""),
            es = LocalizedContent("¿Quién fundó el imperio de Alejandro Magno?", listOf("Alejandro III de Macedonia", "Filipo II", "Ptolomeo", "Seleuco"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2078, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Rome a-t-elle été fondée selon la tradition ?", listOf("753 av. J.-C.", "500 av. J.-C.", "1000 av. J.-C.", "300 av. J.-C."), "Histoire", ""),
            en = LocalizedContent("In what year was Rome founded according to tradition?", listOf("753 BC", "500 BC", "1000 BC", "300 BC"), "History", ""),
            zh = LocalizedContent("根据传统，罗马建于哪一年？", listOf("公元前753年", "公元前500年", "公元前1000年", "公元前300年"), "历史", ""),
            es = LocalizedContent("¿En qué año fue fundada Roma según la tradición?", listOf("753 a.C.", "500 a.C.", "1000 a.C.", "300 a.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 2079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle bataille en 490 av. J.-C. opposa Grecs et Perses ?", listOf("Marathon", "Salamine", "Platées", "Thermopyles"), "Histoire", ""),
            en = LocalizedContent("Which battle in 490 BC pitted Greeks against Persians?", listOf("Marathon", "Salamis", "Plataea", "Thermopylae"), "History", ""),
            zh = LocalizedContent("公元前490年哪场战役是希腊人与波斯人的对决？", listOf("马拉松战役", "萨拉米斯战役", "普拉提亚战役", "温泉关战役"), "历史", ""),
            es = LocalizedContent("¿Qué batalla en el 490 a.C. enfrentó a griegos y persas?", listOf("Maratón", "Salamina", "Platea", "Termópilas"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2080, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était Cléopâtre VII ?", listOf("Dernière reine d'Égypte ptolémaïque", "Reine de Carthage", "Reine de Sparte", "Impératrice romaine"), "Histoire", ""),
            en = LocalizedContent("Who was Cleopatra VII?", listOf("Last queen of Ptolemaic Egypt", "Queen of Carthage", "Queen of Sparta", "Roman empress"), "History", ""),
            zh = LocalizedContent("克利奥帕特拉七世是谁？", listOf("托勒密埃及的最后一位女王", "迦太基女王", "斯巴达女王", "罗马皇后"), "历史", ""),
            es = LocalizedContent("¿Quién fue Cleopatra VII?", listOf("Última reina del Egipto ptolemaico", "Reina de Cartago", "Reina de Esparta", "Emperatriz romana"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2081, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peuple a construit Carthage ?", listOf("Phéniciens", "Grecs", "Romains", "Berbères"), "Histoire", ""),
            en = LocalizedContent("Which people built Carthage?", listOf("Phoenicians", "Greeks", "Romans", "Berbers"), "History", ""),
            zh = LocalizedContent("哪个民族建造了迦太基？", listOf("腓尼基人", "希腊人", "罗马人", "柏柏尔人"), "历史", ""),
            es = LocalizedContent("¿Qué pueblo construyó Cartago?", listOf("Fenicios", "Griegos", "Romanos", "Bereberes"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2082, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Rome a-t-elle été saccagée par les Wisigoths ?", listOf("410 apr. J.-C.", "476 apr. J.-C.", "455 apr. J.-C.", "380 apr. J.-C."), "Histoire", ""),
            en = LocalizedContent("In what year was Rome sacked by the Visigoths?", listOf("410 AD", "476 AD", "455 AD", "380 AD"), "History", ""),
            zh = LocalizedContent("罗马在哪一年被西哥特人洗劫？", listOf("公元410年", "公元476年", "公元455年", "公元380年"), "历史", ""),
            es = LocalizedContent("¿En qué año fue saqueada Roma por los visigodos?", listOf("410 d.C.", "476 d.C.", "455 d.C.", "380 d.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 2083, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle civilisation a inventé l'écriture cunéiforme ?", listOf("Mésopotamie (Sumériens)", "Égyptiens", "Phéniciens", "Minoens"), "Histoire", ""),
            en = LocalizedContent("Which civilization invented cuneiform writing?", listOf("Mesopotamia (Sumerians)", "Egyptians", "Phoenicians", "Minoans"), "History", ""),
            zh = LocalizedContent("哪个文明发明了楔形文字？", listOf("美索不达米亚（苏美尔人）", "埃及人", "腓尼基人", "米诺斯人"), "历史", ""),
            es = LocalizedContent("¿Qué civilización inventó la escritura cuneiforme?", listOf("Mesopotamia (sumerios)", "Egipcios", "Fenicios", "Minoicos"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a été le premier empereur de Chine ?", listOf("Qin Shi Huang", "Han Wudi", "Tang Taizong", "Zhou Wuwang"), "Histoire", ""),
            en = LocalizedContent("Who was the first emperor of China?", listOf("Qin Shi Huang", "Han Wudi", "Tang Taizong", "Zhou Wuwang"), "History", ""),
            zh = LocalizedContent("谁是中国第一位皇帝？", listOf("秦始皇", "汉武帝", "唐太宗", "周武王"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer emperador de China?", listOf("Qin Shi Huang", "Han Wudi", "Tang Taizong", "Zhou Wuwang"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2085, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire dominait l'Amérique centrale à l'arrivée des Espagnols ?", listOf("Aztèque", "Maya", "Inca", "Olmèque"), "Histoire", ""),
            en = LocalizedContent("Which empire dominated Central America when the Spanish arrived?", listOf("Aztec", "Maya", "Inca", "Olmec"), "History", ""),
            zh = LocalizedContent("西班牙人到达时，哪个帝国统治着中美洲？", listOf("阿兹特克", "玛雅", "印加", "奥尔梅克"), "历史", ""),
            es = LocalizedContent("¿Qué imperio dominaba América Central cuando llegaron los españoles?", listOf("Azteca", "Maya", "Inca", "Olmeca"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2086, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Jules César a-t-il été assassiné ?", listOf("44 av. J.-C.", "31 av. J.-C.", "55 av. J.-C.", "27 av. J.-C."), "Histoire", ""),
            en = LocalizedContent("In which year was Julius Caesar assassinated?", listOf("44 BC", "31 BC", "55 BC", "27 BC"), "History", ""),
            zh = LocalizedContent("尤利乌斯·凯撒在哪一年被刺杀？", listOf("公元前44年", "公元前31年", "公元前55年", "公元前27年"), "历史", ""),
            es = LocalizedContent("¿En qué año fue asesinado Julio César?", listOf("44 a.C.", "31 a.C.", "55 a.C.", "27 a.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 2087, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a construit les murs d'Hadrien en Angleterre ?", listOf("L'empereur Hadrien", "Jules César", "Auguste", "Trajan"), "Histoire", ""),
            en = LocalizedContent("Who built Hadrian's Wall in England?", listOf("Emperor Hadrian", "Julius Caesar", "Augustus", "Trajan"), "History", ""),
            zh = LocalizedContent("谁在英格兰建造了哈德良长城？", listOf("哈德良皇帝", "尤利乌斯·凯撒", "奥古斯都", "图拉真"), "历史", ""),
            es = LocalizedContent("¿Quién construyó el Muro de Adriano en Inglaterra?", listOf("El emperador Adriano", "Julio César", "Augusto", "Trajano"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2088, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la langue officielle de l'Empire romain d'Orient ?", listOf("Grec", "Latin", "Araméen", "Arabe"), "Histoire", ""),
            en = LocalizedContent("What was the official language of the Eastern Roman Empire?", listOf("Greek", "Latin", "Aramaic", "Arabic"), "History", ""),
            zh = LocalizedContent("东罗马帝国的官方语言是什么？", listOf("希腊语", "拉丁语", "阿拉姆语", "阿拉伯语"), "历史", ""),
            es = LocalizedContent("¿Cuál era la lengua oficial del Imperio Romano de Oriente?", listOf("Griego", "Latín", "Arameo", "Árabe"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pharaon est associé à l'exode des Hébreux selon la Bible ?", listOf("Ramsès II", "Toutankhamon", "Akhenaton", "Thoutmosis III"), "Histoire", ""),
            en = LocalizedContent("Which pharaoh is associated with the Exodus of the Hebrews according to the Bible?", listOf("Ramesses II", "Tutankhamun", "Akhenaten", "Thutmose III"), "History", ""),
            zh = LocalizedContent("根据圣经，哪位法老与希伯来人的出埃及有关？", listOf("拉美西斯二世", "图坦卡蒙", "阿肯那顿", "图特摩斯三世"), "历史", ""),
            es = LocalizedContent("¿Qué faraón está asociado con el Éxodo de los hebreos según la Biblia?", listOf("Ramsés II", "Tutankamón", "Akenatón", "Tutmosis III"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2090, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année s'est produit le sac de Jérusalem par Titus ?", listOf("70 apr. J.-C.", "135 apr. J.-C.", "30 apr. J.-C.", "66 apr. J.-C."), "Histoire", ""),
            en = LocalizedContent("In which year did the sack of Jerusalem by Titus occur?", listOf("70 AD", "135 AD", "30 AD", "66 AD"), "History", ""),
            zh = LocalizedContent("提图斯攻陷耶路撒冷发生在哪一年？", listOf("公元70年", "公元135年", "公元30年", "公元66年"), "历史", ""),
            es = LocalizedContent("¿En qué año ocurrió el saqueo de Jerusalén por Tito?", listOf("70 d.C.", "135 d.C.", "30 d.C.", "66 d.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 2091, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a eu lieu la bataille de Hastings ?", listOf("1066", "1085", "1057", "1100"), "Histoire", ""),
            en = LocalizedContent("In which year did the Battle of Hastings take place?", listOf("1066", "1085", "1057", "1100"), "History", ""),
            zh = LocalizedContent("黑斯廷斯战役发生在哪一年？", listOf("1066年", "1085年", "1057年", "1100年"), "历史", ""),
            es = LocalizedContent("¿En qué año tuvo lugar la batalla de Hastings?", listOf("1066", "1085", "1057", "1100"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2092, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était Charlemagne ?", listOf("Roi des Francs couronné premier empereur d'Occident", "Premier roi de France", "Roi des Saxons", "Pape du IXe siècle"), "Histoire", ""),
            en = LocalizedContent("Who was Charlemagne?", listOf("King of the Franks crowned first Emperor of the West", "First king of France", "King of the Saxons", "Pope of the 9th century"), "History", ""),
            zh = LocalizedContent("查理曼是谁？", listOf("法兰克国王，加冕为第一位西方皇帝", "法国第一位国王", "撒克逊人的国王", "9世纪的教皇"), "历史", ""),
            es = LocalizedContent("¿Quién fue Carlomagno?", listOf("Rey de los francos coronado primer emperador de Occidente", "Primer rey de Francia", "Rey de los sajones", "Papa del siglo IX"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2093, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle épidémie a ravagé l'Europe au XIVe siècle ?", listOf("La Peste noire", "La variole", "Le choléra", "La typhoïde"), "Histoire", ""),
            en = LocalizedContent("Which epidemic ravaged Europe in the 14th century?", listOf("The Black Death", "Smallpox", "Cholera", "Typhoid"), "History", ""),
            zh = LocalizedContent("哪种流行病在14世纪肆虐欧洲？", listOf("黑死病", "天花", "霍乱", "伤寒"), "历史", ""),
            es = LocalizedContent("¿Qué epidemia asoló Europa en el siglo XIV?", listOf("La Peste Negra", "La viruela", "El cólera", "La tifoidea"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2094, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année ont débuté les premières Croisades ?", listOf("1096", "1054", "1147", "1110"), "Histoire", ""),
            en = LocalizedContent("In which year did the first Crusades begin?", listOf("1096", "1054", "1147", "1110"), "History", ""),
            zh = LocalizedContent("第一次十字军东征始于哪一年？", listOf("1096年", "1054年", "1147年", "1110年"), "历史", ""),
            es = LocalizedContent("¿En qué año comenzaron las primeras Cruzadas?", listOf("1096", "1054", "1147", "1110"), "Historia", "")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 2095, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été Jeanne d'Arc ?", listOf("Héroïne française de la Guerre de Cent Ans", "Reine de France", "Sainte patronne de Paris", "Résistante contre les Maures"), "Histoire", ""),
            en = LocalizedContent("Who was Joan of Arc?", listOf("French heroine of the Hundred Years' War", "Queen of France", "Patron saint of Paris", "Resistance fighter against the Moors"), "History", ""),
            zh = LocalizedContent("圣女贞德是谁？", listOf("百年战争的法国女英雄", "法国王后", "巴黎的主保圣人", "对抗摩尔人的抵抗者"), "历史", ""),
            es = LocalizedContent("¿Quién fue Juana de Arco?", listOf("Heroína francesa de la Guerra de los Cien Años", "Reina de Francia", "Santa patrona de París", "Resistente contra los moros"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2096, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a pris fin la Guerre de Cent Ans ?", listOf("1453", "1415", "1431", "1480"), "Histoire", ""),
            en = LocalizedContent("In which year did the Hundred Years' War end?", listOf("1453", "1415", "1431", "1480"), "History", ""),
            zh = LocalizedContent("百年战争在哪一年结束？", listOf("1453年", "1415年", "1431年", "1480年"), "历史", ""),
            es = LocalizedContent("¿En qué año terminó la Guerra de los Cien Años?", listOf("1453", "1415", "1431", "1480"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2097, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel ordre religieux a fondé de nombreuses universités médiévales ?", listOf("Dominicains", "Franciscains", "Bénédictins", "Jésuites"), "Histoire", ""),
            en = LocalizedContent("Which religious order founded many medieval universities?", listOf("Dominicans", "Franciscans", "Benedictines", "Jesuits"), "History", ""),
            zh = LocalizedContent("哪个修会创立了许多中世纪大学？", listOf("多明我会", "方济各会", "本笃会", "耶稣会"), "历史", ""),
            es = LocalizedContent("¿Qué orden religiosa fundó muchas universidades medievales?", listOf("Dominicos", "Franciscanos", "Benedictinos", "Jesuitas"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2098, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit La Divine Comédie au XIVe siècle ?", listOf("Dante Alighieri", "Pétrarque", "Boccace", "Thomas d'Aquin"), "Histoire", ""),
            en = LocalizedContent("Who wrote The Divine Comedy in the 14th century?", listOf("Dante Alighieri", "Petrarch", "Boccaccio", "Thomas Aquinas"), "History", ""),
            zh = LocalizedContent("谁在14世纪写了《神曲》？", listOf("但丁·阿利吉耶里", "彼特拉克", "薄伽丘", "托马斯·阿奎那"), "历史", ""),
            es = LocalizedContent("¿Quién escribió La Divina Comedia en el siglo XIV?", listOf("Dante Alighieri", "Petrarca", "Boccaccio", "Tomás de Aquino"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2099, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Gutenberg a-t-il imprimé sa Bible ?", listOf("1455", "1440", "1480", "1500"), "Histoire", ""),
            en = LocalizedContent("In which year did Gutenberg print his Bible?", listOf("1455", "1440", "1480", "1500"), "History", ""),
            zh = LocalizedContent("古腾堡在哪一年印刷了他的圣经？", listOf("1455年", "1440年", "1480年", "1500年"), "历史", ""),
            es = LocalizedContent("¿En qué año imprimió Gutenberg su Biblia?", listOf("1455", "1440", "1480", "1500"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2100, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement marque traditionnellement la fin du Moyen Âge ?", listOf("La chute de Constantinople (1453)", "La découverte de l'Amérique", "La Réforme protestante", "La Renaissance italienne"), "Histoire", ""),
            en = LocalizedContent("Which event traditionally marks the end of the Middle Ages?", listOf("Fall of Constantinople (1453)", "Discovery of America", "Protestant Reformation", "Italian Renaissance"), "History", ""),
            zh = LocalizedContent("哪个事件传统上标志着中世纪的结束？", listOf("君士坦丁堡陷落（1453年）", "发现美洲", "宗教改革", "意大利文艺复兴"), "历史", ""),
            es = LocalizedContent("¿Qué evento marca tradicionalmente el final de la Edad Media?", listOf("Caída de Constantinopla (1453)", "Descubrimiento de América", "Reforma protestante", "Renacimiento italiano"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2101, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Richard Cœur de Lion ?", listOf("Roi d'Angleterre participant à la 3e Croisade", "Roi de France", "Chef de la 1re Croisade", "Prince de Galles"), "Histoire", ""),
            en = LocalizedContent("Who was Richard the Lionheart?", listOf("King of England participating in the 3rd Crusade", "King of France", "Leader of the 1st Crusade", "Prince of Wales"), "History", ""),
            zh = LocalizedContent("狮心王理查是谁？", listOf("参加第三次十字军东征的英格兰国王", "法国国王", "第一次十字军东征的领袖", "威尔士亲王"), "历史", ""),
            es = LocalizedContent("¿Quién fue Ricardo Corazón de León?", listOf("Rey de Inglaterra que participó en la 3.ª Cruzada", "Rey de Francia", "Líder de la 1.ª Cruzada", "Príncipe de Gales"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2102, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a été signé la Magna Carta ?", listOf("1215", "1189", "1265", "1302"), "Histoire", ""),
            en = LocalizedContent("In which year was the Magna Carta signed?", listOf("1215", "1189", "1265", "1302"), "History", ""),
            zh = LocalizedContent("《大宪章》在哪一年签署？", listOf("1215年", "1189年", "1265年", "1302年"), "历史", ""),
            es = LocalizedContent("¿En qué año se firmó la Carta Magna?", listOf("1215", "1189", "1265", "1302"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire mongol a été fondé par Gengis Khan ?", listOf("Le plus grand empire d'un seul tenant de l'histoire", "Le premier empire islamique", "L'empire de Chine médiévale", "L'empire de la steppe"), "Histoire", ""),
            en = LocalizedContent("Which Mongol empire was founded by Genghis Khan?", listOf("The largest contiguous empire in history", "The first Islamic empire", "The empire of medieval China", "The steppe empire"), "History", ""),
            zh = LocalizedContent("成吉思汗建立了哪个蒙古帝国？", listOf("历史上最大的连续帝国", "第一个伊斯兰帝国", "中世纪中华帝国", "草原帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio mongol fue fundado por Gengis Kan?", listOf("El imperio contiguo más grande de la historia", "El primer imperio islámico", "El imperio de la China medieval", "El imperio de la estepa"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2104, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était Averroès ?", listOf("Philosophe et médecin arabo-andalou du XIIe siècle", "Calife de Bagdad", "Philosophe perse", "Mathématicien arabe"), "Histoire", ""),
            en = LocalizedContent("Who was Averroes?", listOf("Andalusian Arab philosopher and physician of the 12th century", "Caliph of Baghdad", "Persian philosopher", "Arab mathematician"), "History", ""),
            zh = LocalizedContent("阿威罗伊是谁？", listOf("12世纪的安达卢西亚阿拉伯哲学家和医生", "巴格达哈里发", "波斯哲学家", "阿拉伯数学家"), "历史", ""),
            es = LocalizedContent("¿Quién fue Averroes?", listOf("Filósofo y médico andalusí del siglo XII", "Califa de Bagdad", "Filósofo persa", "Matemático árabe"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2105, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année a été fondée l'Université de Paris ?", listOf("1150", "1200", "1100", "1250"), "Histoire", ""),
            en = LocalizedContent("In which year was the University of Paris founded?", listOf("1150", "1200", "1100", "1250"), "History", ""),
            zh = LocalizedContent("巴黎大学成立于哪一年？", listOf("1150年", "1200年", "1100年", "1250年"), "历史", ""),
            es = LocalizedContent("¿En qué año se fundó la Universidad de París?", listOf("1150", "1200", "1100", "1250"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2106, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a proclamé l'indépendance des États-Unis ?", listOf("Thomas Jefferson (auteur de la Déclaration)", "George Washington", "Benjamin Franklin", "John Adams"), "Histoire", ""),
            en = LocalizedContent("Who proclaimed the independence of the United States?", listOf("Thomas Jefferson (author of the Declaration)", "George Washington", "Benjamin Franklin", "John Adams"), "History", ""),
            zh = LocalizedContent("谁宣布了美国的独立？", listOf("托马斯·杰斐逊（《独立宣言》作者）", "乔治·华盛顿", "本杰明·富兰克林", "约翰·亚当斯"), "历史", ""),
            es = LocalizedContent("¿Quién proclamó la independencia de los Estados Unidos?", listOf("Thomas Jefferson (autor de la Declaración)", "George Washington", "Benjamin Franklin", "John Adams"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2107, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a eu lieu la Commune de Paris ?", listOf("1871", "1848", "1830", "1789"), "Histoire", ""),
            en = LocalizedContent("In which year did the Paris Commune take place?", listOf("1871", "1848", "1830", "1789"), "History", ""),
            zh = LocalizedContent("巴黎公社发生在哪一年？", listOf("1871年", "1848年", "1830年", "1789年"), "历史", ""),
            es = LocalizedContent("¿En qué año tuvo lugar la Comuna de París?", listOf("1871", "1848", "1830", "1789"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2108, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Bismarck ?", listOf("Chancelier qui a unifié l'Allemagne", "Kaiser d'Allemagne", "Général prussien", "Roi de Prusse"), "Histoire", ""),
            en = LocalizedContent("Who was Bismarck?", listOf("Chancellor who unified Germany", "Kaiser of Germany", "Prussian general", "King of Prussia"), "History", ""),
            zh = LocalizedContent("俾斯麦是谁？", listOf("统一德国的首相", "德国皇帝", "普鲁士将军", "普鲁士国王"), "历史", ""),
            es = LocalizedContent("¿Quién fue Bismarck?", listOf("Canciller que unificó Alemania", "Káiser de Alemania", "General prusiano", "Rey de Prusia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2109, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'Allemagne a-t-elle été réunifiée ?", listOf("1990", "1989", "1991", "1992"), "Histoire", ""),
            en = LocalizedContent("In which year was Germany reunified?", listOf("1990", "1989", "1991", "1992"), "History", ""),
            zh = LocalizedContent("德国在哪一年重新统一？", listOf("1990年", "1989年", "1991年", "1992年"), "历史", ""),
            es = LocalizedContent("¿En qué año se reunificó Alemania?", listOf("1990", "1989", "1991", "1992"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2110, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel traité a mis fin à la Première Guerre mondiale ?", listOf("Traité de Versailles", "Traité de Vienne", "Traité de Paris", "Armistice de Compiègne"), "Histoire", ""),
            en = LocalizedContent("Which treaty ended World War I?", listOf("Treaty of Versailles", "Treaty of Vienna", "Treaty of Paris", "Armistice of Compiègne"), "History", ""),
            zh = LocalizedContent("哪项条约结束了第一次世界大战？", listOf("凡尔赛条约", "维也纳条约", "巴黎条约", "贡比涅停战协定"), "历史", ""),
            es = LocalizedContent("¿Qué tratado puso fin a la Primera Guerra Mundial?", listOf("Tratado de Versalles", "Tratado de Viena", "Tratado de París", "Armisticio de Compiègne"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2111, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a eu lieu la Déclaration d'Indépendance américaine ?", listOf("1776", "1783", "1775", "1789"), "Histoire", ""),
            en = LocalizedContent("In which year did the American Declaration of Independence take place?", listOf("1776", "1783", "1775", "1789"), "History", ""),
            zh = LocalizedContent("美国《独立宣言》发生在哪一年？", listOf("1776年", "1783年", "1775年", "1789年"), "历史", ""),
            es = LocalizedContent("¿En qué año tuvo lugar la Declaración de Independencia de los Estados Unidos?", listOf("1776", "1783", "1775", "1789"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2112, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Simón Bolívar ?", listOf("Libérateur de l'Amérique du Sud", "Président du Mexique", "Révolutionnaire cubain", "Général argentin"), "Histoire", ""),
            en = LocalizedContent("Who was Simón Bolívar?", listOf("Liberator of South America", "President of Mexico", "Cuban revolutionary", "Argentine general"), "History", ""),
            zh = LocalizedContent("西蒙·玻利瓦尔是谁？", listOf("南美洲解放者", "墨西哥总统", "古巴革命者", "阿根廷将军"), "历史", ""),
            es = LocalizedContent("¿Quién fue Simón Bolívar?", listOf("Libertador de América del Sur", "Presidente de México", "Revolucionario cubano", "General argentino"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Japon a-t-il capitulé lors de la Seconde Guerre mondiale ?", listOf("1945", "1944", "1946", "1943"), "Histoire", ""),
            en = LocalizedContent("In which year did Japan surrender in World War II?", listOf("1945", "1944", "1946", "1943"), "History", ""),
            zh = LocalizedContent("日本在第二次世界大战中投降是在哪一年？", listOf("1945年", "1944年", "1946年", "1943年"), "历史", ""),
            es = LocalizedContent("¿En qué año capituló Japón en la Segunda Guerra Mundial?", listOf("1945", "1944", "1946", "1943"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2114, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a le premier utilisé une bombe atomique en temps de guerre ?", listOf("États-Unis", "URSS", "Royaume-Uni", "Allemagne"), "Histoire", ""),
            en = LocalizedContent("Which country first used an atomic bomb in wartime?", listOf("United States", "USSR", "United Kingdom", "Germany"), "History", ""),
            zh = LocalizedContent("哪个国家在战争中首次使用了原子弹？", listOf("美国", "苏联", "英国", "德国"), "历史", ""),
            es = LocalizedContent("¿Qué país utilizó por primera vez una bomba atómica en tiempos de guerra?", listOf("Estados Unidos", "URSS", "Reino Unido", "Alemania"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2115, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a été fondée l'ONU ?", listOf("1945", "1919", "1948", "1944"), "Histoire", ""),
            en = LocalizedContent("In which year was the UN founded?", listOf("1945", "1919", "1948", "1944"), "History", ""),
            zh = LocalizedContent("联合国成立于哪一年？", listOf("1945", "1919", "1948", "1944"), "历史", ""),
            es = LocalizedContent("¿En qué año se fundó la ONU?", listOf("1945", "1919", "1948", "1944"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était Gandhi ?", listOf("Leader du mouvement d'indépendance indien par non-violence", "Premier ministre de l'Inde", "Révolutionnaire hindou", "Fondateur du Pakistan"), "Histoire", ""),
            en = LocalizedContent("Who was Gandhi?", listOf("Leader of the Indian independence movement through non-violence", "Prime Minister of India", "Hindu revolutionary", "Founder of Pakistan"), "History", ""),
            zh = LocalizedContent("甘地是谁？", listOf("印度非暴力独立运动的领袖", "印度总理", "印度教革命者", "巴基斯坦的创始人"), "历史", ""),
            es = LocalizedContent("¿Quién fue Gandhi?", listOf("Líder del movimiento de independencia indio mediante la no violencia", "Primer ministro de la India", "Revolucionario hindú", "Fundador de Pakistán"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2117, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Turquie est-elle devenue une république ?", listOf("1923", "1918", "1920", "1930"), "Histoire", ""),
            en = LocalizedContent("In which year did Turkey become a republic?", listOf("1923", "1918", "1920", "1930"), "History", ""),
            zh = LocalizedContent("土耳其在哪一年成为共和国？", listOf("1923", "1918", "1920", "1930"), "历史", ""),
            es = LocalizedContent("¿En qué año se convirtió Turquía en república?", listOf("1923", "1918", "1920", "1930"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2118, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel événement de 1929 a déclenché la Grande Dépression ?", listOf("Krach boursier de Wall Street", "Faillite des banques européennes", "Guerre commerciale USA-Europe", "Sécheresse mondiale"), "Histoire", ""),
            en = LocalizedContent("Which event in 1929 triggered the Great Depression?", listOf("Wall Street stock market crash", "Bankruptcy of European banks", "US-Europe trade war", "Global drought"), "History", ""),
            zh = LocalizedContent("1929年的哪个事件引发了经济大萧条？", listOf("华尔街股市崩盘", "欧洲银行破产", "美欧贸易战", "全球干旱"), "历史", ""),
            es = LocalizedContent("¿Qué evento de 1929 desencadenó la Gran Depresión?", listOf("Caída de la bolsa de Wall Street", "Quiebra de los bancos europeos", "Guerra comercial entre EE. UU. y Europa", "Sequía mundial"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2119, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit Mein Kampf ?", listOf("Adolf Hitler", "Heinrich Himmler", "Rudolf Hess", "Joseph Goebbels"), "Histoire", ""),
            en = LocalizedContent("Who wrote Mein Kampf?", listOf("Adolf Hitler", "Heinrich Himmler", "Rudolf Hess", "Joseph Goebbels"), "History", ""),
            zh = LocalizedContent("谁写了《我的奋斗》？", listOf("阿道夫·希特勒", "海因里希·希姆莱", "鲁道夫·赫斯", "约瑟夫·戈培尔"), "历史", ""),
            es = LocalizedContent("¿Quién escribió Mein Kampf?", listOf("Adolf Hitler", "Heinrich Himmler", "Rudolf Hess", "Joseph Goebbels"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2120, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Israël a-t-il déclaré son indépendance ?", listOf("1948", "1945", "1950", "1952"), "Histoire", ""),
            en = LocalizedContent("In which year did Israel declare its independence?", listOf("1948", "1945", "1950", "1952"), "History", ""),
            zh = LocalizedContent("以色列在哪一年宣布独立？", listOf("1948", "1945", "1950", "1952"), "历史", ""),
            es = LocalizedContent("¿En qué año declaró Israel su independencia?", listOf("1948", "1945", "1950", "1952"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2121, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi de France est surnommé le Roi-Soleil ?", listOf("Louis XIV", "Louis XIII", "Henri IV", "Louis XVI"), "Histoire", ""),
            en = LocalizedContent("Which king of France is nicknamed the Sun King?", listOf("Louis XIV", "Louis XIII", "Henry IV", "Louis XVI"), "History", ""),
            zh = LocalizedContent("哪位法国国王被称为太阳王？", listOf("路易十四", "路易十三", "亨利四世", "路易十六"), "历史", ""),
            es = LocalizedContent("¿Qué rey de Francia es apodado el Rey Sol?", listOf("Luis XIV", "Luis XIII", "Enrique IV", "Luis XVI"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Henri IV a-t-il signé l'Édit de Nantes ?", listOf("1598", "1589", "1610", "1580"), "Histoire", ""),
            en = LocalizedContent("In which year did Henry IV sign the Edict of Nantes?", listOf("1598", "1589", "1610", "1580"), "History", ""),
            zh = LocalizedContent("亨利四世在哪一年签署了南特敕令？", listOf("1598", "1589", "1610", "1580"), "历史", ""),
            es = LocalizedContent("¿En qué año firmó Enrique IV el Edicto de Nantes?", listOf("1598", "1589", "1610", "1580"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2123, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Vercingétorix ?", listOf("Chef gaulois vaincu par César à Alésia", "Roi des Francs", "Chef gaulois vainqueur à Gergovie", "Premier roi de France"), "Histoire", ""),
            en = LocalizedContent("Who was Vercingetorix?", listOf("Gaulish chief defeated by Caesar at Alesia", "King of the Franks", "Gaulish chief victorious at Gergovia", "First king of France"), "History", ""),
            zh = LocalizedContent("维钦托利是谁？", listOf("在阿莱西亚被凯撒击败的高卢首领", "法兰克国王", "在日尔戈维亚获胜的高卢首领", "法国第一位国王"), "历史", ""),
            es = LocalizedContent("¿Quién fue Vercingetórix?", listOf("Jefe galo derrotado por César en Alesia", "Rey de los francos", "Jefe galo vencedor en Gergovia", "Primer rey de Francia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2124, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Clovis a-t-il été baptisé ?", listOf("496", "481", "507", "511"), "Histoire", ""),
            en = LocalizedContent("In which year was Clovis baptized?", listOf("496", "481", "507", "511"), "History", ""),
            zh = LocalizedContent("克洛维在哪一年受洗？", listOf("496", "481", "507", "511"), "历史", ""),
            es = LocalizedContent("¿En qué año fue bautizado Clodoveo?", listOf("496", "481", "507", "511"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel traité mit fin aux guerres napoléoniennes en 1815 ?", listOf("Congrès de Vienne", "Traité de Versailles", "Traité de Paris", "Traité d'Amiens"), "Histoire", ""),
            en = LocalizedContent("Which treaty ended the Napoleonic Wars in 1815?", listOf("Congress of Vienna", "Treaty of Versailles", "Treaty of Paris", "Treaty of Amiens"), "History", ""),
            zh = LocalizedContent("哪项条约在1815年结束了拿破仑战争？", listOf("维也纳会议", "凡尔赛条约", "巴黎条约", "亚眠条约"), "历史", ""),
            es = LocalizedContent("¿Qué tratado puso fin a las guerras napoleónicas en 1815?", listOf("Congreso de Viena", "Tratado de Versalles", "Tratado de París", "Tratado de Amiens"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier Président de la Ve République ?", listOf("Charles de Gaulle", "René Coty", "Georges Pompidou", "Valéry Giscard d'Estaing"), "Histoire", ""),
            en = LocalizedContent("Who was the first President of the Fifth Republic?", listOf("Charles de Gaulle", "René Coty", "Georges Pompidou", "Valéry Giscard d'Estaing"), "History", ""),
            zh = LocalizedContent("谁是法兰西第五共和国的第一任总统？", listOf("夏尔·戴高乐", "勒内·科蒂", "乔治·蓬皮杜", "瓦莱里·吉斯卡尔·德斯坦"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer presidente de la Quinta República?", listOf("Charles de Gaulle", "René Coty", "Georges Pompidou", "Valéry Giscard d'Estaing"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2127, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bretagne a-t-elle été rattachée à la France ?", listOf("1532", "1499", "1453", "1598"), "Histoire", ""),
            en = LocalizedContent("In which year was Brittany annexed to France?", listOf("1532", "1499", "1453", "1598"), "History", ""),
            zh = LocalizedContent("布列塔尼在哪一年并入法国？", listOf("1532", "1499", "1453", "1598"), "历史", ""),
            es = LocalizedContent("¿En qué año se anexionó Bretaña a Francia?", listOf("1532", "1499", "1453", "1598"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2128, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel général a commandé les armées françaises à Verdun (1916) ?", listOf("Philippe Pétain", "Ferdinand Foch", "Joseph Joffre", "Maxime Weygand"), "Histoire", ""),
            en = LocalizedContent("Which general commanded the French armies at Verdun (1916)?", listOf("Philippe Pétain", "Ferdinand Foch", "Joseph Joffre", "Maxime Weygand"), "History", ""),
            zh = LocalizedContent("哪位将军在凡尔登（1916年）指挥法国军队？", listOf("菲利普·贝当", "费迪南·福煦", "约瑟夫·霞飞", "马克西姆·魏刚"), "历史", ""),
            es = LocalizedContent("¿Qué general comandó los ejércitos franceses en Verdún (1916)?", listOf("Philippe Pétain", "Ferdinand Foch", "Joseph Joffre", "Maxime Weygand"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Colbert ?", listOf("Ministre de Louis XIV, père du mercantilisme", "Premier ministre de Richelieu", "Général de Louis XIV", "Évêque du XVIIe siècle"), "Histoire", ""),
            en = LocalizedContent("Who was Colbert?", listOf("Minister of Louis XIV, father of mercantilism", "Prime minister of Richelieu", "General of Louis XIV", "Bishop of the 17th century"), "History", ""),
            zh = LocalizedContent("科尔贝是谁？", listOf("路易十四的大臣，重商主义之父", "黎塞留的首相", "路易十四的将军", "17世纪的主教"), "历史", ""),
            es = LocalizedContent("¿Quién fue Colbert?", listOf("Ministro de Luis XIV, padre del mercantilismo", "Primer ministro de Richelieu", "General de Luis XIV", "Obispo del siglo XVII"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2130, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Tour Eiffel a-t-elle été construite ?", listOf("1889", "1900", "1885", "1895"), "Histoire", ""),
            en = LocalizedContent("In which year was the Eiffel Tower built?", listOf("1889", "1900", "1885", "1895"), "History", ""),
            zh = LocalizedContent("埃菲尔铁塔建于哪一年？", listOf("1889", "1900", "1885", "1895"), "历史", ""),
            es = LocalizedContent("¿En qué año se construyó la Torre Eiffel?", listOf("1889", "1900", "1885", "1895"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2131, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était Lazare Carnot ?", listOf("Organisateur de la victoire révolutionnaire", "Général napoléonien", "Premier président français", "Révolutionnaire girondin"), "Histoire", ""),
            en = LocalizedContent("Who was Lazare Carnot?", listOf("Organizer of the revolutionary victory", "Napoleonic general", "First French president", "Girondin revolutionary"), "History", ""),
            zh = LocalizedContent("拉扎尔·卡诺是谁？", listOf("革命胜利的组织者", "拿破仑时代的将军", "法国第一任总统", "吉伦特派革命者"), "历史", ""),
            es = LocalizedContent("¿Quién fue Lazare Carnot?", listOf("Organizador de la victoria revolucionaria", "General napoleónico", "Primer presidente francés", "Revolucionario girondino"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2132, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année fut créée la Légion d'honneur ?", listOf("1802", "1799", "1815", "1804"), "Histoire", ""),
            en = LocalizedContent("In which year was the Legion of Honour created?", listOf("1802", "1799", "1815", "1804"), "History", ""),
            zh = LocalizedContent("荣誉军团勋章创立于哪一年？", listOf("1802", "1799", "1815", "1804"), "历史", ""),
            es = LocalizedContent("¿En qué año se creó la Legión de Honor?", listOf("1802", "1799", "1815", "1804"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2133, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi de France a été surnommé le Bien-Aimé ?", listOf("Louis XV", "Louis XIV", "Louis XVI", "Louis XVIII"), "Histoire", ""),
            en = LocalizedContent("Which king of France was nicknamed the Well-Beloved?", listOf("Louis XV", "Louis XIV", "Louis XVI", "Louis XVIII"), "History", ""),
            zh = LocalizedContent("哪位法国国王被称为“受爱戴者”？", listOf("路易十五", "路易十四", "路易十六", "路易十八"), "历史", ""),
            es = LocalizedContent("¿Qué rey de Francia fue apodado el Bien Amado?", listOf("Luis XV", "Luis XIV", "Luis XVI", "Luis XVIII"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2134, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année fut signé le traité franco-prussien après la guerre de 1870 ?", listOf("1871", "1870", "1872", "1873"), "Histoire", ""),
            en = LocalizedContent("In which year was the Franco-Prussian treaty signed after the 1870 war?", listOf("1871", "1870", "1872", "1873"), "History", ""),
            zh = LocalizedContent("1870年战争后，法普条约在哪一年签署？", listOf("1871", "1870", "1872", "1873"), "历史", ""),
            es = LocalizedContent("¿En qué año se firmó el tratado franco-prusiano tras la guerra de 1870?", listOf("1871", "1870", "1872", "1873"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2135, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a dirigé le gouvernement de Vichy pendant la Seconde Guerre mondiale ?", listOf("Philippe Pétain", "Pierre Laval", "Maxime Weygand", "François Darlan"), "Histoire", ""),
            en = LocalizedContent("Who led the Vichy government during World War II?", listOf("Philippe Pétain", "Pierre Laval", "Maxime Weygand", "François Darlan"), "History", ""),
            zh = LocalizedContent("二战期间谁领导了维希政府？", listOf("菲利普·贝当", "皮埃尔·赖伐尔", "马克西姆·魏刚", "弗朗索瓦·达尔朗"), "历史", ""),
            es = LocalizedContent("¿Quién dirigió el gobierno de Vichy durante la Segunda Guerra Mundial?", listOf("Philippe Pétain", "Pierre Laval", "Maxime Weygand", "François Darlan"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2136, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Russie a-t-elle vendu l'Alaska aux États-Unis ?", listOf("1867", "1900", "1848", "1890"), "Histoire", ""),
            en = LocalizedContent("In what year did Russia sell Alaska to the United States?", listOf("1867", "1900", "1848", "1890"), "History", ""),
            zh = LocalizedContent("俄罗斯在哪一年将阿拉斯加卖给美国？", listOf("1867", "1900", "1848", "1890"), "历史", ""),
            es = LocalizedContent("¿En qué año Rusia vendió Alaska a los Estados Unidos?", listOf("1867", "1900", "1848", "1890"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2137, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a découvert l'Australie pour l'Europe ?", listOf("James Cook", "Abel Tasman", "Francis Drake", "Willem Jansz"), "Histoire", ""),
            en = LocalizedContent("Who discovered Australia for Europe?", listOf("James Cook", "Abel Tasman", "Francis Drake", "Willem Jansz"), "History", ""),
            zh = LocalizedContent("谁为欧洲发现了澳大利亚？", listOf("詹姆斯·库克", "亚伯·塔斯曼", "弗朗西斯·德雷克", "威廉·扬茨"), "历史", ""),
            es = LocalizedContent("¿Quién descubrió Australia para Europa?", listOf("James Cook", "Abel Tasman", "Francis Drake", "Willem Jansz"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2138, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Mao Zedong a-t-il fondé la République populaire de Chine ?", listOf("1949", "1945", "1948", "1950"), "Histoire", ""),
            en = LocalizedContent("In what year did Mao Zedong found the People's Republic of China?", listOf("1949", "1945", "1948", "1950"), "History", ""),
            zh = LocalizedContent("毛泽东在哪一年建立了中华人民共和国？", listOf("1949", "1945", "1948", "1950"), "历史", ""),
            es = LocalizedContent("¿En qué año Mao Zedong fundó la República Popular China?", listOf("1949", "1945", "1948", "1950"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2139, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle guerre a duré de 1950 à 1953 dans la péninsule asiatique ?", listOf("Guerre de Corée", "Guerre du Vietnam", "Guerre d'Indochine", "Guerre sino-japonaise"), "Histoire", ""),
            en = LocalizedContent("Which war lasted from 1950 to 1953 on the Asian peninsula?", listOf("Korean War", "Vietnam War", "Indochina War", "Sino-Japanese War"), "History", ""),
            zh = LocalizedContent("哪场战争在亚洲半岛上从1950年持续到1953年？", listOf("朝鲜战争", "越南战争", "印度支那战争", "中日战争"), "历史", ""),
            es = LocalizedContent("¿Qué guerra duró de 1950 a 1953 en la península asiática?", listOf("Guerra de Corea", "Guerra de Vietnam", "Guerra de Indochina", "Guerra sino-japonesa"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2140, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était Lénine ?", listOf("Chef de la Révolution russe bolchévique", "Fondateur du Parti communiste soviétique", "Premier secrétaire général du PCUS", "Président de l'URSS"), "Histoire", ""),
            en = LocalizedContent("Who was Lenin?", listOf("Leader of the Bolshevik Russian Revolution", "Founder of the Soviet Communist Party", "First General Secretary of the CPSU", "President of the USSR"), "History", ""),
            zh = LocalizedContent("列宁是谁？", listOf("布尔什维克俄国革命的领袖", "苏联共产党的创始人", "苏共中央第一总书记", "苏联总统"), "历史", ""),
            es = LocalizedContent("¿Quién fue Lenin?", listOf("Líder de la Revolución rusa bolchevique", "Fundador del Partido Comunista soviético", "Primer secretario general del PCUS", "Presidente de la URSS"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2141, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'URSS s'est-elle dissoute ?", listOf("1991", "1989", "1990", "1992"), "Histoire", ""),
            en = LocalizedContent("In what year did the USSR dissolve?", listOf("1991", "1989", "1990", "1992"), "History", ""),
            zh = LocalizedContent("苏联在哪一年解体？", listOf("1991", "1989", "1990", "1992"), "历史", ""),
            es = LocalizedContent("¿En qué año se disolvió la URSS?", listOf("1991", "1989", "1990", "1992"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2142, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement a déclenché la Première Guerre mondiale ?", listOf("Assassinat de l'archiduc François-Ferdinand", "Invasion de la Belgique", "Ultimatum austro-hongrois à la Serbie", "Mobilisation russe"), "Histoire", ""),
            en = LocalizedContent("What event triggered World War I?", listOf("Assassination of Archduke Franz Ferdinand", "Invasion of Belgium", "Austro-Hungarian ultimatum to Serbia", "Russian mobilization"), "History", ""),
            zh = LocalizedContent("什么事件引发了第一次世界大战？", listOf("斐迪南大公遇刺", "入侵比利时", "奥匈帝国对塞尔维亚的最后通牒", "俄国动员"), "历史", ""),
            es = LocalizedContent("¿Qué evento desencadenó la Primera Guerra Mundial?", listOf("Asesinato del archiduque Francisco Fernando", "Invasión de Bélgica", "Ultimátum austrohúngaro a Serbia", "Movilización rusa"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2143, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était Martin Luther King ?", listOf("Leader des droits civiques aux États-Unis", "Pasteur baptiste de Montgomery", "Fondateur du mouvement Black Power", "Sénateur américain"), "Histoire", ""),
            en = LocalizedContent("Who was Martin Luther King?", listOf("Civil rights leader in the United States", "Baptist pastor from Montgomery", "Founder of the Black Power movement", "American senator"), "History", ""),
            zh = LocalizedContent("马丁·路德·金是谁？", listOf("美国民权领袖", "蒙哥马利的浸信会牧师", "黑人权力运动的创始人", "美国参议员"), "历史", ""),
            es = LocalizedContent("¿Quién fue Martin Luther King?", listOf("Líder de derechos civiles en Estados Unidos", "Pastor bautista de Montgomery", "Fundador del movimiento Black Power", "Senador estadounidense"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'apartheid a-t-il officiellement pris fin en Afrique du Sud ?", listOf("1994", "1990", "1991", "1992"), "Histoire", ""),
            en = LocalizedContent("In what year did apartheid officially end in South Africa?", listOf("1994", "1990", "1991", "1992"), "History", ""),
            zh = LocalizedContent("南非的种族隔离制度在哪一年正式结束？", listOf("1994", "1990", "1991", "1992"), "历史", ""),
            es = LocalizedContent("¿En qué año terminó oficialmente el apartheid en Sudáfrica?", listOf("1994", "1990", "1991", "1992"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2145, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Ho Chi Minh ?", listOf("Leader révolutionnaire et président du Vietnam du Nord", "Général vietnamien", "Fondateur du Viet Cong", "Premier ministre du Vietnam"), "Histoire", ""),
            en = LocalizedContent("Who was Ho Chi Minh?", listOf("Revolutionary leader and President of North Vietnam", "Vietnamese general", "Founder of the Viet Cong", "Prime Minister of Vietnam"), "History", ""),
            zh = LocalizedContent("胡志明是谁？", listOf("革命领袖和北越主席", "越南将军", "越共创始人", "越南总理"), "历史", ""),
            es = LocalizedContent("¿Quién fue Ho Chi Minh?", listOf("Líder revolucionario y presidente de Vietnam del Norte", "General vietnamita", "Fundador del Viet Cong", "Primer ministro de Vietnam"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2146, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Turquie est-elle entrée dans l'OTAN ?", listOf("1952", "1949", "1955", "1960"), "Histoire", ""),
            en = LocalizedContent("In which year did Turkey join NATO?", listOf("1952", "1949", "1955", "1960"), "History", ""),
            zh = LocalizedContent("土耳其哪一年加入北约？", listOf("1952", "1949", "1955", "1960"), "历史", ""),
            es = LocalizedContent("¿En qué año se unió Turquía a la OTAN?", listOf("1952", "1949", "1955", "1960"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2147, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a connu le génocide de 1994 ?", listOf("Rwanda", "Bosnie", "Cambodge", "Darfour"), "Histoire", ""),
            en = LocalizedContent("Which country experienced the 1994 genocide?", listOf("Rwanda", "Bosnia", "Cambodia", "Darfur"), "History", ""),
            zh = LocalizedContent("哪个国家发生了1994年的种族灭绝？", listOf("卢旺达", "波斯尼亚", "柬埔寨", "达尔富尔"), "历史", ""),
            es = LocalizedContent("¿Qué país sufrió el genocidio de 1994?", listOf("Ruanda", "Bosnia", "Camboya", "Darfur"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2148, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Simone de Beauvoir ?", listOf("Philosophe existentialiste et féministe française", "Écrivaine du Nouveau Roman", "Fondatrice du MLF", "Politique française"), "Histoire", ""),
            en = LocalizedContent("Who was Simone de Beauvoir?", listOf("French existentialist philosopher and feminist", "New Novel writer", "Founder of the MLF", "French politician"), "History", ""),
            zh = LocalizedContent("西蒙娜·德·波伏娃是谁？", listOf("法国存在主义哲学家和女权主义者", "新小说作家", "妇女解放运动创始人", "法国政治家"), "历史", ""),
            es = LocalizedContent("¿Quién fue Simone de Beauvoir?", listOf("Filósofa existencialista y feminista francesa", "Escritora del Nouveau Roman", "Fundadora del MLF", "Política francesa"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2149, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'Union européenne a-t-elle été créée (traité de Maastricht) ?", listOf("1992", "1986", "1999", "1995"), "Histoire", ""),
            en = LocalizedContent("In which year was the European Union created (Maastricht Treaty)?", listOf("1992", "1986", "1999", "1995"), "History", ""),
            zh = LocalizedContent("欧盟（马斯特里赫特条约）是哪一年成立的？", listOf("1992", "1986", "1999", "1995"), "历史", ""),
            es = LocalizedContent("¿En qué año se creó la Unión Europea (Tratado de Maastricht)?", listOf("1992", "1986", "1999", "1995"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2150, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel accord de paix a mis fin aux Troubles en Irlande du Nord ?", listOf("Accord du Vendredi Saint (1998)", "Accord de Hillsborough (1985)", "Traité anglo-irlandais (1921)", "Accord de Sunningdale (1973)"), "Histoire", ""),
            en = LocalizedContent("Which peace agreement ended the Troubles in Northern Ireland?", listOf("Good Friday Agreement (1998)", "Hillsborough Agreement (1985)", "Anglo-Irish Treaty (1921)", "Sunningdale Agreement (1973)"), "History", ""),
            zh = LocalizedContent("哪项和平协议结束了北爱尔兰的冲突？", listOf("贝尔法斯特协议（1998）", "希尔斯伯勒协议（1985）", "英爱条约（1921）", "桑宁代尔协议（1973）"), "历史", ""),
            es = LocalizedContent("¿Qué acuerdo de paz puso fin al conflicto en Irlanda del Norte?", listOf("Acuerdo de Viernes Santo (1998)", "Acuerdo de Hillsborough (1985)", "Tratado anglo-irlandés (1921)", "Acuerdo de Sunningdale (1973)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 2151, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Norvège ?", listOf("Oslo", "Bergen", "Stavanger", "Trondheim"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Norway?", listOf("Oslo", "Bergen", "Stavanger", "Trondheim"), "Geography", ""),
            zh = LocalizedContent("挪威的首都是哪里？", listOf("奥斯陆", "卑尔根", "斯塔万格", "特隆赫姆"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Noruega?", listOf("Oslo", "Bergen", "Stavanger", "Trondheim"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2152, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays le plus petit du monde ?", listOf("Vatican", "Monaco", "Saint-Marin", "Liechtenstein"), "Géographie", ""),
            en = LocalizedContent("What is the smallest country in the world?", listOf("Vatican City", "Monaco", "San Marino", "Liechtenstein"), "Geography", ""),
            zh = LocalizedContent("世界上最小的国家是哪个？", listOf("梵蒂冈", "摩纳哥", "圣马力诺", "列支敦士登"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más pequeño del mundo?", listOf("Ciudad del Vaticano", "Mónaco", "San Marino", "Liechtenstein"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2153, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel continent se trouve le Kalahari ?", listOf("Afrique", "Australie", "Amérique du Sud", "Asie centrale"), "Géographie", ""),
            en = LocalizedContent("On which continent is the Kalahari located?", listOf("Africa", "Australia", "South America", "Central Asia"), "Geography", ""),
            zh = LocalizedContent("卡拉哈里沙漠位于哪个大陆？", listOf("非洲", "澳大利亚", "南美洲", "中亚"), "地理", ""),
            es = LocalizedContent("¿En qué continente se encuentra el Kalahari?", listOf("África", "Australia", "América del Sur", "Asia Central"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2154, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de la Nouvelle-Zélande ?", listOf("Wellington", "Auckland", "Christchurch", "Hamilton"), "Géographie", ""),
            en = LocalizedContent("What is the capital of New Zealand?", listOf("Wellington", "Auckland", "Christchurch", "Hamilton"), "Geography", ""),
            zh = LocalizedContent("新西兰的首都是哪里？", listOf("惠灵顿", "奥克兰", "基督城", "汉密尔顿"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Nueva Zelanda?", listOf("Wellington", "Auckland", "Christchurch", "Hamilton"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2155, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fleuve le plus long d'Europe ?", listOf("La Volga", "Le Danube", "Le Rhin", "Le Dniepr"), "Géographie", ""),
            en = LocalizedContent("What is the longest river in Europe?", listOf("Volga", "Danube", "Rhine", "Dnieper"), "Geography", ""),
            zh = LocalizedContent("欧洲最长的河流是什么？", listOf("伏尔加河", "多瑙河", "莱茵河", "第聂伯河"), "地理", ""),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("Volga", "Danubio", "Rin", "Dniéper"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2156, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la chaîne de montagnes la plus longue du monde ?", listOf("Les Andes", "Les Himalayas", "Les Rocheuses", "L'Atlas"), "Géographie", ""),
            en = LocalizedContent("What is the longest mountain range in the world?", listOf("Andes", "Himalayas", "Rocky Mountains", "Atlas"), "Geography", ""),
            zh = LocalizedContent("世界上最长的山脉是什么？", listOf("安第斯山脉", "喜马拉雅山脉", "落基山脉", "阿特拉斯山脉"), "地理", ""),
            es = LocalizedContent("¿Cuál es la cordillera más larga del mundo?", listOf("Andes", "Himalaya", "Montañas Rocosas", "Atlas"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2157, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Dubai ?", listOf("Émirats arabes unis", "Qatar", "Arabie Saoudite", "Koweït"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Dubai located?", listOf("United Arab Emirates", "Qatar", "Saudi Arabia", "Kuwait"), "Geography", ""),
            zh = LocalizedContent("迪拜位于哪个国家？", listOf("阿拉伯联合酋长国", "卡塔尔", "沙特阿拉伯", "科威特"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Dubái?", listOf("Emiratos Árabes Unidos", "Catar", "Arabia Saudita", "Kuwait"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2158, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Pakistan ?", listOf("Islamabad", "Karachi", "Lahore", "Peshawar"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Pakistan?", listOf("Islamabad", "Karachi", "Lahore", "Peshawar"), "Geography", ""),
            zh = LocalizedContent("巴基斯坦的首都是什么？", listOf("伊斯兰堡", "卡拉奇", "拉合尔", "白沙瓦"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Pakistán?", listOf("Islamabad", "Karachi", "Lahore", "Peshawar"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2159, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut volcan actif du monde ?", listOf("Ojos del Salado", "Mauna Loa", "Vésuve", "Mont Kilimandjaro"), "Géographie", ""),
            en = LocalizedContent("What is the highest active volcano in the world?", listOf("Ojos del Salado", "Mauna Loa", "Vesuvius", "Mount Kilimanjaro"), "Geography", ""),
            zh = LocalizedContent("世界上最高的活火山是什么？", listOf("奥霍斯德尔萨拉多山", "莫纳罗亚山", "维苏威火山", "乞力马扎罗山"), "地理", ""),
            es = LocalizedContent("¿Cuál es el volcán activo más alto del mundo?", listOf("Ojos del Salado", "Mauna Loa", "Vesubio", "Monte Kilimanjaro"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2160, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve Angkor Wat ?", listOf("Cambodge", "Thaïlande", "Vietnam", "Myanmar"), "Géographie", ""),
            en = LocalizedContent("In which country is Angkor Wat located?", listOf("Cambodia", "Thailand", "Vietnam", "Myanmar"), "Geography", ""),
            zh = LocalizedContent("吴哥窟位于哪个国家？", listOf("柬埔寨", "泰国", "越南", "缅甸"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra Angkor Wat?", listOf("Camboya", "Tailandia", "Vietnam", "Myanmar"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2161, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Suède ?", listOf("Stockholm", "Göteborg", "Malmö", "Uppsala"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Sweden?", listOf("Stockholm", "Gothenburg", "Malmö", "Uppsala"), "Geography", ""),
            zh = LocalizedContent("瑞典的首都是什么？", listOf("斯德哥尔摩", "哥德堡", "马尔默", "乌普萨拉"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Suecia?", listOf("Estocolmo", "Gotemburgo", "Malmö", "Uppsala"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2162, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand archipel du monde ?", listOf("Indonésie", "Philippines", "Japon", "Maldives"), "Géographie", ""),
            en = LocalizedContent("What is the largest archipelago in the world?", listOf("Indonesia", "Philippines", "Japan", "Maldives"), "Geography", ""),
            zh = LocalizedContent("世界上最大的群岛是什么？", listOf("印度尼西亚", "菲律宾", "日本", "马尔代夫"), "地理", ""),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del mundo?", listOf("Indonesia", "Filipinas", "Japón", "Maldivas"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2163, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle mer se trouve entre l'Europe et l'Afrique du Nord ?", listOf("Mer Méditerranée", "Mer du Nord", "Mer Noire", "Mer Rouge"), "Géographie", ""),
            en = LocalizedContent("Which sea lies between Europe and North Africa?", listOf("Mediterranean Sea", "North Sea", "Black Sea", "Red Sea"), "Geography", ""),
            zh = LocalizedContent("哪个海位于欧洲和北非之间？", listOf("地中海", "北海", "黑海", "红海"), "地理", ""),
            es = LocalizedContent("¿Qué mar se encuentra entre Europa y el norte de África?", listOf("Mar Mediterráneo", "Mar del Norte", "Mar Negro", "Mar Rojo"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2164, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le Taj Mahal ?", listOf("Inde", "Pakistan", "Bangladesh", "Sri Lanka"), "Géographie", ""),
            en = LocalizedContent("In which country is the Taj Mahal located?", listOf("India", "Pakistan", "Bangladesh", "Sri Lanka"), "Geography", ""),
            zh = LocalizedContent("泰姬陵位于哪个国家？", listOf("印度", "巴基斯坦", "孟加拉国", "斯里兰卡"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el Taj Mahal?", listOf("India", "Pakistán", "Bangladés", "Sri Lanka"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 2165, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de l'Éthiopie ?", listOf("Addis-Abeba", "Nairobi", "Khartoum", "Djibouti"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Ethiopia?", listOf("Addis Ababa", "Nairobi", "Khartoum", "Djibouti"), "Geography", ""),
            zh = LocalizedContent("埃塞俄比亚的首都是哪里？", listOf("亚的斯亚贝巴", "内罗毕", "喀土穆", "吉布提"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Etiopía?", listOf("Adís Abeba", "Nairobi", "Jartum", "Yibuti"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2166, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande façade côtière du monde ?", listOf("Canada", "Russie", "Indonésie", "Australie"), "Géographie", ""),
            en = LocalizedContent("Which country has the longest coastline in the world?", listOf("Canada", "Russia", "Indonesia", "Australia"), "Geography", ""),
            zh = LocalizedContent("哪个国家拥有世界上最长的海岸线？", listOf("加拿大", "俄罗斯", "印度尼西亚", "澳大利亚"), "地理", ""),
            es = LocalizedContent("¿Qué país tiene la costa más larga del mundo?", listOf("Canadá", "Rusia", "Indonesia", "Australia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2167, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve le lac Titicaca ?", listOf("Bolivie/Pérou", "Argentine", "Chili", "Équateur"), "Géographie", ""),
            en = LocalizedContent("In which country is Lake Titicaca located?", listOf("Bolivia/Peru", "Argentina", "Chile", "Ecuador"), "Geography", ""),
            zh = LocalizedContent("的的喀喀湖位于哪个国家？", listOf("玻利维亚/秘鲁", "阿根廷", "智利", "厄瓜多尔"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el lago Titicaca?", listOf("Bolivia/Perú", "Argentina", "Chile", "Ecuador"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2168, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Ukraine ?", listOf("Kiev", "Kharkiv", "Odessa", "Lviv"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Ukraine?", listOf("Kyiv", "Kharkiv", "Odessa", "Lviv"), "Geography", ""),
            zh = LocalizedContent("乌克兰的首都是哪里？", listOf("基辅", "哈尔科夫", "敖德萨", "利沃夫"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Ucrania?", listOf("Kiev", "Járkov", "Odesa", "Leópolis"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2169, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le détroit qui sépare l'Espagne du Maroc ?", listOf("Détroit de Gibraltar", "Détroit de Malacca", "Détroit de Bab-el-Mandeb", "Détroit de Suez"), "Géographie", ""),
            en = LocalizedContent("Which strait separates Spain from Morocco?", listOf("Strait of Gibraltar", "Strait of Malacca", "Bab-el-Mandeb", "Suez Strait"), "Geography", ""),
            zh = LocalizedContent("哪个海峡分隔西班牙和摩洛哥？", listOf("直布罗陀海峡", "马六甲海峡", "曼德海峡", "苏伊士海峡"), "地理", ""),
            es = LocalizedContent("¿Qué estrecho separa España de Marruecos?", listOf("Estrecho de Gibraltar", "Estrecho de Malaca", "Estrecho de Bab-el-Mandeb", "Estrecho de Suez"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2170, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la forêt amazonienne (majorité) ?", listOf("Brésil", "Pérou", "Colombie", "Venezuela"), "Géographie", ""),
            en = LocalizedContent("In which country is the majority of the Amazon rainforest located?", listOf("Brazil", "Peru", "Colombia", "Venezuela"), "Geography", ""),
            zh = LocalizedContent("亚马逊雨林大部分位于哪个国家？", listOf("巴西", "秘鲁", "哥伦比亚", "委内瑞拉"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la mayor parte de la selva amazónica?", listOf("Brasil", "Perú", "Colombia", "Venezuela"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2171, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Grèce ?", listOf("Athènes", "Thessalonique", "Héraklion", "Corinthe"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Greece?", listOf("Athens", "Thessaloniki", "Heraklion", "Corinth"), "Geography", ""),
            zh = LocalizedContent("希腊的首都是哪里？", listOf("雅典", "塞萨洛尼基", "伊拉克利翁", "科林斯"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Grecia?", listOf("Atenas", "Tesalónica", "Heraclión", "Corinto"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2172, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le point le plus haut d'Afrique ?", listOf("Kilimandjaro (5895m)", "Mont Kenya (5199m)", "Rwenzori (5109m)", "Éthiopie (4620m)"), "Géographie", ""),
            en = LocalizedContent("What is the highest point in Africa?", listOf("Kilimanjaro (5895m)", "Mount Kenya (5199m)", "Rwenzori (5109m)", "Ethiopia (4620m)"), "Geography", ""),
            zh = LocalizedContent("非洲的最高点是什么？", listOf("乞力马扎罗山（5895米）", "肯尼亚山（5199米）", "鲁文佐里山（5109米）", "埃塞俄比亚（4620米）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el punto más alto de África?", listOf("Kilimanjaro (5895m)", "Monte Kenia (5199m)", "Rwenzori (5109m)", "Etiopía (4620m)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2173, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Casablanca ?", listOf("Maroc", "Algérie", "Tunisie", "Libye"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Casablanca located?", listOf("Morocco", "Algeria", "Tunisia", "Libya"), "Geography", ""),
            zh = LocalizedContent("卡萨布兰卡位于哪个国家？", listOf("摩洛哥", "阿尔及利亚", "突尼斯", "利比亚"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Casablanca?", listOf("Marruecos", "Argelia", "Túnez", "Libia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2174, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Pologne ?", listOf("Varsovie", "Cracovie", "Gdańsk", "Wrocław"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Poland?", listOf("Warsaw", "Krakow", "Gdańsk", "Wrocław"), "Geography", ""),
            zh = LocalizedContent("波兰的首都是哪里？", listOf("华沙", "克拉科夫", "格但斯克", "弗罗茨瓦夫"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Polonia?", listOf("Varsovia", "Cracovia", "Gdansk", "Breslavia"), "Geografia", "")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 2175, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long tunnel ferroviaire du monde ?", listOf("Tunnel de base du Gothard (Suisse)", "Tunnel sous la Manche", "Tunnel du Seikan (Japon)", "Tunnel de Lötschberg"), "Géographie", ""),
            en = LocalizedContent("What is the longest railway tunnel in the world?", listOf("Gotthard Base Tunnel (Switzerland)", "Channel Tunnel", "Seikan Tunnel (Japan)", "Lötschberg Tunnel"), "Geography", ""),
            zh = LocalizedContent("世界上最长的铁路隧道是什么？", listOf("圣哥达基线隧道（瑞士）", "英吉利海峡隧道", "青函隧道（日本）", "勒奇山隧道"), "地理", ""),
            es = LocalizedContent("¿Cuál es el túnel ferroviario más largo del mundo?", listOf("Túnel de base de San Gotardo (Suiza)", "Túnel del Canal de la Mancha", "Túnel Seikan (Japón)", "Túnel de Lötschberg"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2176, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve Petra ?", listOf("Jordanie", "Israël", "Syrie", "Arabie Saoudite"), "Géographie", ""),
            en = LocalizedContent("In which country is Petra located?", listOf("Jordan", "Israel", "Syria", "Saudi Arabia"), "Geography", ""),
            zh = LocalizedContent("佩特拉位于哪个国家？", listOf("约旦", "以色列", "叙利亚", "沙特阿拉伯"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra Petra?", listOf("Jordania", "Israel", "Siria", "Arabia Saudita"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2177, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de la Turquie ?", listOf("Ankara", "Istanbul", "İzmir", "Bursa"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Turkey?", listOf("Ankara", "Istanbul", "İzmir", "Bursa"), "Geography", ""),
            zh = LocalizedContent("土耳其的首都是什么？", listOf("安卡拉", "伊斯坦布尔", "伊兹密尔", "布尔萨"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Turquía?", listOf("Ankara", "Estambul", "Esmirna", "Bursa"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2178, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traversent les chutes Victoria ?", listOf("Zambèze", "Congo", "Niger", "Nil Bleu"), "Géographie", ""),
            en = LocalizedContent("Which river do the Victoria Falls cross?", listOf("Zambezi", "Congo", "Niger", "Blue Nile"), "Geography", ""),
            zh = LocalizedContent("维多利亚瀑布横跨哪条河流？", listOf("赞比西河", "刚果河", "尼日尔河", "青尼罗河"), "地理", ""),
            es = LocalizedContent("¿Qué río atraviesan las Cataratas Victoria?", listOf("Zambeze", "Congo", "Níger", "Nilo Azul"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2179, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le mont Fuji ?", listOf("Japon", "Chine", "Corée du Sud", "Taïwan"), "Géographie", ""),
            en = LocalizedContent("In which country is Mount Fuji located?", listOf("Japan", "China", "South Korea", "Taiwan"), "Geography", ""),
            zh = LocalizedContent("富士山位于哪个国家？", listOf("日本", "中国", "韩国", "台湾"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el Monte Fuji?", listOf("Japón", "China", "Corea del Sur", "Taiwán"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2180, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la superficie de la France métropolitaine (km²) ?", listOf("551 695", "450 000", "650 000", "500 000"), "Géographie", ""),
            en = LocalizedContent("What is the area of metropolitan France (km²)?", listOf("551,695", "450,000", "650,000", "500,000"), "Geography", ""),
            zh = LocalizedContent("法国本土的面积是多少（平方公里）？", listOf("551695", "450000", "650000", "500000"), "地理", ""),
            es = LocalizedContent("¿Cuál es la superficie de la Francia metropolitana (km²)?", listOf("551 695", "450 000", "650 000", "500 000"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2181, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'eau douce du monde ?", listOf("Lac Supérieur", "Lac Baïkal", "Lac Victoria", "Lac Huron"), "Géographie", ""),
            en = LocalizedContent("What is the largest freshwater lake in the world?", listOf("Lake Superior", "Lake Baikal", "Lake Victoria", "Lake Huron"), "Geography", ""),
            zh = LocalizedContent("世界上最大的淡水湖是什么？", listOf("苏必利尔湖", "贝加尔湖", "维多利亚湖", "休伦湖"), "地理", ""),
            es = LocalizedContent("¿Cuál es el lago de agua dulce más grande del mundo?", listOf("Lago Superior", "Lago Baikal", "Lago Victoria", "Lago Hurón"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2182, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans quel pays se trouve Timbuktu ?", listOf("Mali", "Niger", "Mauritanie", "Sénégal"), "Géographie", ""),
            en = LocalizedContent("In which country is Timbuktu located?", listOf("Mali", "Niger", "Mauritania", "Senegal"), "Geography", ""),
            zh = LocalizedContent("廷巴克图位于哪个国家？", listOf("马里", "尼日尔", "毛里塔尼亚", "塞内加尔"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra Tombuctú?", listOf("Malí", "Níger", "Mauritania", "Senegal"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2183, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la capitale des Pays-Bas (siège du gouvernement) ?", listOf("La Haye", "Amsterdam", "Rotterdam", "Utrecht"), "Géographie", ""),
            en = LocalizedContent("What is the capital of the Netherlands (seat of government)?", listOf("The Hague", "Amsterdam", "Rotterdam", "Utrecht"), "Geography", ""),
            zh = LocalizedContent("荷兰的首都（政府所在地）是哪里？", listOf("海牙", "阿姆斯特丹", "鹿特丹", "乌得勒支"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de los Países Bajos (sede del gobierno)?", listOf("La Haya", "Ámsterdam", "Róterdam", "Utrecht"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2184, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fleuve le plus long d'Amérique du Nord ?", listOf("Missouri-Mississippi", "Mackenzie", "Yukon", "Rio Grande"), "Géographie", ""),
            en = LocalizedContent("What is the longest river in North America?", listOf("Missouri-Mississippi", "Mackenzie", "Yukon", "Rio Grande"), "Geography", ""),
            zh = LocalizedContent("北美最长的河流是什么？", listOf("密苏里-密西西比河", "马更些河", "育空河", "格兰德河"), "地理", ""),
            es = LocalizedContent("¿Cuál es el río más largo de América del Norte?", listOf("Misisuri-Misisipí", "Mackenzie", "Yukón", "Río Bravo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2185, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville sainte de La Mecque ?", listOf("Arabie Saoudite", "Jordanie", "Irak", "Égypte"), "Géographie", ""),
            en = LocalizedContent("In which country is the holy city of Mecca located?", listOf("Saudi Arabia", "Jordan", "Iraq", "Egypt"), "Geography", ""),
            zh = LocalizedContent("圣城麦加位于哪个国家？", listOf("沙特阿拉伯", "约旦", "伊拉克", "埃及"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad santa de La Meca?", listOf("Arabia Saudita", "Jordania", "Irak", "Egipto"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2186, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de l'Arabie Saoudite ?", listOf("Riyad", "Djeddah", "La Mecque", "Médine"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Saudi Arabia?", listOf("Riyadh", "Jeddah", "Mecca", "Medina"), "Geography", ""),
            zh = LocalizedContent("沙特阿拉伯的首都是哪里？", listOf("利雅得", "吉达", "麦加", "麦地那"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Arabia Saudita?", listOf("Riad", "Yeda", "La Meca", "Medina"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2187, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port mondial par volume de trafic ?", listOf("Shanghai", "Singapour", "Rotterdam", "Los Angeles"), "Géographie", ""),
            en = LocalizedContent("What is the world's largest port by traffic volume?", listOf("Shanghai", "Singapore", "Rotterdam", "Los Angeles"), "Geography", ""),
            zh = LocalizedContent("按货运量计算，世界上最大的港口是哪个？", listOf("上海", "新加坡", "鹿特丹", "洛杉矶"), "地理", ""),
            es = LocalizedContent("¿Cuál es el puerto más grande del mundo por volumen de tráfico?", listOf("Shanghái", "Singapur", "Róterdam", "Los Ángeles"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2188, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve le lac Baïkal ?", listOf("Russie", "Kazakhstan", "Mongolie", "Chine"), "Géographie", ""),
            en = LocalizedContent("In which country is Lake Baikal located?", listOf("Russia", "Kazakhstan", "Mongolia", "China"), "Geography", ""),
            zh = LocalizedContent("贝加尔湖位于哪个国家？", listOf("俄罗斯", "哈萨克斯坦", "蒙古", "中国"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el lago Baikal?", listOf("Rusia", "Kazajistán", "Mongolia", "China"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2189, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Iran ?", listOf("Téhéran", "Ispahan", "Chiraz", "Tabriz"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Iran?", listOf("Tehran", "Isfahan", "Shiraz", "Tabriz"), "Geography", ""),
            zh = LocalizedContent("伊朗的首都是哪里？", listOf("德黑兰", "伊斯法罕", "设拉子", "大不里士"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Irán?", listOf("Teherán", "Isfahán", "Shiraz", "Tabriz"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2190, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays africain était anciennement appelé Rhodésie du Sud ?", listOf("Zimbabwe", "Zambie", "Mozambique", "Namibie"), "Géographie", ""),
            en = LocalizedContent("Which African country was formerly called Southern Rhodesia?", listOf("Zimbabwe", "Zambia", "Mozambique", "Namibia"), "Geography", ""),
            zh = LocalizedContent("哪个非洲国家以前被称为南罗得西亚？", listOf("津巴布韦", "赞比亚", "莫桑比克", "纳米比亚"), "地理", ""),
            es = LocalizedContent("¿Qué país africano se llamaba anteriormente Rodesia del Sur?", listOf("Zimbabue", "Zambia", "Mozambique", "Namibia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 2191, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Le Petit Prince' ?", listOf("Antoine de Saint-Exupéry", "Albert Camus", "Jean-Paul Sartre", "André Gide"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Little Prince'?", listOf("Antoine de Saint-Exupéry", "Albert Camus", "Jean-Paul Sartre", "André Gide"), "Culture", ""),
            zh = LocalizedContent("谁写了《小王子》？", listOf("安托万·德·圣-埃克苏佩里", "阿尔贝·加缪", "让-保罗·萨特", "安德烈·纪德"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'El Principito'?", listOf("Antoine de Saint-Exupéry", "Albert Camus", "Jean-Paul Sartre", "André Gide"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2192, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est connu pour ses installations de ballons animaux ?", listOf("Jeff Koons", "Damien Hirst", "Banksy", "Jean-Michel Basquiat"), "Culture", ""),
            en = LocalizedContent("Which artist is known for his animal balloon installations?", listOf("Jeff Koons", "Damien Hirst", "Banksy", "Jean-Michel Basquiat"), "Culture", ""),
            zh = LocalizedContent("哪位艺术家以其动物气球装置作品而闻名？", listOf("杰夫·昆斯", "达米恩·赫斯特", "班克西", "让-米歇尔·巴斯奎特"), "文化", ""),
            es = LocalizedContent("¿Qué artista es conocido por sus instalaciones de globos con forma de animales?", listOf("Jeff Koons", "Damien Hirst", "Banksy", "Jean-Michel Basquiat"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2193, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe britannique a sorti l'album 'Abbey Road' ?", listOf("Les Beatles", "Les Rolling Stones", "Les Who", "Led Zeppelin"), "Culture", ""),
            en = LocalizedContent("Which British band released the album 'Abbey Road'?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Culture", ""),
            zh = LocalizedContent("哪个英国乐队发行了专辑《Abbey Road》？", listOf("披头士", "滚石乐队", "谁人乐队", "齐柏林飞艇"), "文化", ""),
            es = LocalizedContent("¿Qué banda británica lanzó el álbum 'Abbey Road'?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2194, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année a été créé le festival de Cannes ?", listOf("1946", "1935", "1952", "1960"), "Culture", ""),
            en = LocalizedContent("In which year was the Cannes Film Festival created?", listOf("1946", "1935", "1952", "1960"), "Culture", ""),
            zh = LocalizedContent("戛纳电影节是哪一年创立的？", listOf("1946", "1935", "1952", "1960"), "文化", ""),
            es = LocalizedContent("¿En qué año se creó el Festival de Cannes?", listOf("1946", "1935", "1952", "1960"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2195, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'Les Demoiselles d'Avignon' ?", listOf("Pablo Picasso", "Georges Braque", "Fernand Léger", "Joan Miró"), "Culture", ""),
            en = LocalizedContent("Who painted 'Les Demoiselles d'Avignon'?", listOf("Pablo Picasso", "Georges Braque", "Fernand Léger", "Joan Miró"), "Culture", ""),
            zh = LocalizedContent("谁画了《亚维农的少女》？", listOf("巴勃罗·毕加索", "乔治·布拉克", "费尔南·莱热", "胡安·米罗"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'Las señoritas de Avignon'?", listOf("Pablo Picasso", "Georges Braque", "Fernand Léger", "Joan Miró"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2196, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur russe a écrit 'Guerre et Paix' ?", listOf("Léon Tolstoï", "Fiodor Dostoïevski", "Anton Tchekhov", "Ivan Tourgueniev"), "Culture", ""),
            en = LocalizedContent("Which Russian author wrote 'War and Peace'?", listOf("Leo Tolstoy", "Fyodor Dostoevsky", "Anton Chekhov", "Ivan Turgenev"), "Culture", ""),
            zh = LocalizedContent("哪位俄罗斯作家写了《战争与和平》？", listOf("列夫·托尔斯泰", "费奥多尔·陀思妥耶夫斯基", "安东·契诃夫", "伊万·屠格涅夫"), "文化", ""),
            es = LocalizedContent("¿Qué autor ruso escribió 'Guerra y Paz'?", listOf("León Tolstói", "Fiódor Dostoyevski", "Antón Chéjov", "Iván Turguénev"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2197, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument joue Yo-Yo Ma ?", listOf("Violoncelle", "Violon", "Alto", "Contrebasse"), "Culture", ""),
            en = LocalizedContent("What instrument does Yo-Yo Ma play?", listOf("Cello", "Violin", "Viola", "Double bass"), "Culture", ""),
            zh = LocalizedContent("马友友演奏什么乐器？", listOf("大提琴", "小提琴", "中提琴", "低音提琴"), "文化", ""),
            es = LocalizedContent("¿Qué instrumento toca Yo-Yo Ma?", listOf("Violonchelo", "Violín", "Viola", "Contrabajo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2198, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel poète français a écrit 'Les Fleurs du Mal' ?", listOf("Charles Baudelaire", "Paul Verlaine", "Arthur Rimbaud", "Stéphane Mallarmé"), "Culture", ""),
            en = LocalizedContent("Which French poet wrote 'Les Fleurs du Mal'?", listOf("Charles Baudelaire", "Paul Verlaine", "Arthur Rimbaud", "Stéphane Mallarmé"), "Culture", ""),
            zh = LocalizedContent("哪位法国诗人写了《恶之花》？", listOf("夏尔·波德莱尔", "保罗·魏尔伦", "阿蒂尔·兰波", "斯特凡·马拉美"), "文化", ""),
            es = LocalizedContent("¿Qué poeta francés escribió 'Las flores del mal'?", listOf("Charles Baudelaire", "Paul Verlaine", "Arthur Rimbaud", "Stéphane Mallarmé"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2199, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve le musée du Prado ?", listOf("Espagne", "Portugal", "Italie", "France"), "Culture", ""),
            en = LocalizedContent("In which country is the Prado Museum located?", listOf("Spain", "Portugal", "Italy", "France"), "Culture", ""),
            zh = LocalizedContent("普拉多博物馆位于哪个国家？", listOf("西班牙", "葡萄牙", "意大利", "法国"), "文化", ""),
            es = LocalizedContent("¿En qué país se encuentra el Museo del Prado?", listOf("España", "Portugal", "Italia", "Francia"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2200, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur est connu pour ses Variations Goldberg ?", listOf("Johann Sebastian Bach", "Georg Friedrich Haendel", "Claudio Monteverdi", "Henry Purcell"), "Culture", ""),
            en = LocalizedContent("Which composer is known for his Goldberg Variations?", listOf("Johann Sebastian Bach", "George Frideric Handel", "Claudio Monteverdi", "Henry Purcell"), "Culture", ""),
            zh = LocalizedContent("哪位作曲家以其《哥德堡变奏曲》闻名？", listOf("约翰·塞巴斯蒂安·巴赫", "乔治·弗里德里希·亨德尔", "克劳迪奥·蒙特威尔第", "亨利·珀塞尔"), "文化", ""),
            es = LocalizedContent("¿Qué compositor es conocido por sus Variaciones Goldberg?", listOf("Johann Sebastian Bach", "Georg Friedrich Händel", "Claudio Monteverdi", "Henry Purcell"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2201, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit '1984' ?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"), "Culture", ""),
            en = LocalizedContent("Which author wrote '1984'?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《1984》？", listOf("乔治·奥威尔", "奥尔德斯·赫胥黎", "雷·布拉德伯里", "赫伯特·乔治·威尔斯"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió '1984'?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre impressionniste est célèbre pour ses nénuphars ?", listOf("Claude Monet", "Auguste Renoir", "Edgar Degas", "Camille Pissarro"), "Culture", ""),
            en = LocalizedContent("Which Impressionist painter is famous for his water lilies?", listOf("Claude Monet", "Auguste Renoir", "Edgar Degas", "Camille Pissarro"), "Culture", ""),
            zh = LocalizedContent("哪位印象派画家以其睡莲画作闻名？", listOf("克劳德·莫奈", "奥古斯特·雷诺阿", "埃德加·德加", "卡米耶·毕沙罗"), "文化", ""),
            es = LocalizedContent("¿Qué pintor impresionista es famoso por sus nenúfares?", listOf("Claude Monet", "Auguste Renoir", "Edgar Degas", "Camille Pissarro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2203, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel orchestre est considéré comme le plus prestigieux du monde ?", listOf("Philharmonique de Berlin", "Orchestre du Metropolitan Opera", "Philharmonique de Vienne", "London Symphony Orchestra"), "Culture", ""),
            en = LocalizedContent("Which orchestra is considered the most prestigious in the world?", listOf("Berlin Philharmonic", "Metropolitan Opera Orchestra", "Vienna Philharmonic", "London Symphony Orchestra"), "Culture", ""),
            zh = LocalizedContent("哪个管弦乐团被认为是世界上最负盛名的？", listOf("柏林爱乐乐团", "大都会歌剧院管弦乐团", "维也纳爱乐乐团", "伦敦交响乐团"), "文化", ""),
            es = LocalizedContent("¿Qué orquesta es considerada la más prestigiosa del mundo?", listOf("Filarmónica de Berlín", "Orquesta del Metropolitan Opera", "Filarmónica de Viena", "Orquesta Sinfónica de Londres"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2204, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'L'Odyssée' ?", listOf("Homère", "Virgile", "Ovide", "Hésiode"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Odyssey'?", listOf("Homer", "Virgil", "Ovid", "Hesiod"), "Culture", ""),
            zh = LocalizedContent("谁写了《奥德赛》？", listOf("荷马", "维吉尔", "奥维德", "赫西俄德"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'La Odisea'?", listOf("Homero", "Virgilio", "Ovidio", "Hesíodo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2205, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a réalisé l'installation 'The Physical Impossibility of Death...' (requin dans le formol) ?", listOf("Damien Hirst", "Jeff Koons", "Tracey Emin", "Antony Gormley"), "Culture", ""),
            en = LocalizedContent("Which artist created the installation 'The Physical Impossibility of Death...' (shark in formaldehyde)?", listOf("Damien Hirst", "Jeff Koons", "Tracey Emin", "Antony Gormley"), "Culture", ""),
            zh = LocalizedContent("哪位艺术家创作了装置作品《生者无法理解死亡》（甲醛中的鲨鱼）？", listOf("达米恩·赫斯特", "杰夫·昆斯", "翠西·艾敏", "安东尼·葛姆雷"), "文化", ""),
            es = LocalizedContent("¿Qué artista realizó la instalación 'The Physical Impossibility of Death...' (tiburón en formol)?", listOf("Damien Hirst", "Jeff Koons", "Tracey Emin", "Antony Gormley"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2206, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roman de Victor Hugo se déroule à Paris au Moyen Âge ?", listOf("Notre-Dame de Paris", "Les Misérables", "L'Homme qui rit", "Quatre-vingt-treize"), "Culture", ""),
            en = LocalizedContent("Which novel by Victor Hugo is set in medieval Paris?", listOf("The Hunchback of Notre-Dame", "Les Misérables", "The Man Who Laughs", "Ninety-Three"), "Culture", ""),
            zh = LocalizedContent("维克多·雨果的哪部小说以中世纪巴黎为背景？", listOf("巴黎圣母院", "悲惨世界", "笑面人", "九三年"), "文化", ""),
            es = LocalizedContent("¿Qué novela de Victor Hugo transcurre en el París medieval?", listOf("Nuestra Señora de París", "Los miserables", "El hombre que ríe", "Noventa y tres"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2207, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle actrice a été la star de 'Breakfast at Tiffany's' (1961) ?", listOf("Audrey Hepburn", "Marilyn Monroe", "Grace Kelly", "Sophia Loren"), "Culture", ""),
            en = LocalizedContent("Which actress was the star of 'Breakfast at Tiffany's' (1961)?", listOf("Audrey Hepburn", "Marilyn Monroe", "Grace Kelly", "Sophia Loren"), "Culture", ""),
            zh = LocalizedContent("哪位女演员是《蒂凡尼的早餐》（1961）的主演？", listOf("奥黛丽·赫本", "玛丽莲·梦露", "格蕾丝·凯利", "索菲娅·罗兰"), "文化", ""),
            es = LocalizedContent("¿Qué actriz fue la estrella de 'Desayuno con diamantes' (1961)?", listOf("Audrey Hepburn", "Marilyn Monroe", "Grace Kelly", "Sophia Loren"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2208, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a sorti l'album 'Dark Side of the Moon' ?", listOf("Pink Floyd", "Led Zeppelin", "Deep Purple", "The Doors"), "Culture", ""),
            en = LocalizedContent("Which band released the album 'Dark Side of the Moon'?", listOf("Pink Floyd", "Led Zeppelin", "Deep Purple", "The Doors"), "Culture", ""),
            zh = LocalizedContent("哪个乐队发行了专辑《月之暗面》？", listOf("平克·弗洛伊德", "齐柏林飞艇", "深紫", "大门乐队"), "文化", ""),
            es = LocalizedContent("¿Qué banda lanzó el álbum 'Dark Side of the Moon'?", listOf("Pink Floyd", "Led Zeppelin", "Deep Purple", "The Doors"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2209, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'En attendant Godot' ?", listOf("Samuel Beckett", "Eugène Ionesco", "Jean Genet", "Albert Camus"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Waiting for Godot'?", listOf("Samuel Beckett", "Eugène Ionesco", "Jean Genet", "Albert Camus"), "Culture", ""),
            zh = LocalizedContent("谁写了《等待戈多》？", listOf("塞缪尔·贝克特", "欧仁·尤内斯库", "让·热内", "阿尔贝·加缪"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Esperando a Godot'?", listOf("Samuel Beckett", "Eugène Ionesco", "Jean Genet", "Albert Camus"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2210, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste baroque est connu pour ses clair-obscurs dramatiques ?", listOf("Le Caravage", "Nicolas Poussin", "Rubens", "Van Dyck"), "Culture", ""),
            en = LocalizedContent("Which Baroque artist is known for dramatic chiaroscuro?", listOf("Caravaggio", "Nicolas Poussin", "Rubens", "Van Dyck"), "Culture", ""),
            zh = LocalizedContent("哪位巴洛克艺术家以戏剧性的明暗对比而闻名？", listOf("卡拉瓦乔", "尼古拉·普桑", "鲁本斯", "凡·戴克"), "文化", ""),
            es = LocalizedContent("¿Qué artista barroco es conocido por sus dramáticos claroscuros?", listOf("Caravaggio", "Nicolas Poussin", "Rubens", "Van Dyck"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2211, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel opéra de Verdi est basé sur une pièce de Shakespeare sur un More ?", listOf("Otello", "Falstaff", "Macbeth", "Rigoletto"), "Culture", ""),
            en = LocalizedContent("Which Verdi opera is based on a Shakespeare play about a Moor?", listOf("Otello", "Falstaff", "Macbeth", "Rigoletto"), "Culture", ""),
            zh = LocalizedContent("威尔第的哪部歌剧基于莎士比亚关于摩尔人的戏剧？", listOf("奥赛罗", "法斯塔夫", "麦克白", "弄臣"), "文化", ""),
            es = LocalizedContent("¿Qué ópera de Verdi está basada en una obra de Shakespeare sobre un moro?", listOf("Otello", "Falstaff", "Macbeth", "Rigoletto"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Crime et Châtiment' ?", listOf("Fiodor Dostoïevski", "Léon Tolstoï", "Nikolaï Gogol", "Ivan Tourgueniev"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Crime and Punishment'?", listOf("Fyodor Dostoevsky", "Leo Tolstoy", "Nikolai Gogol", "Ivan Turgenev"), "Culture", ""),
            zh = LocalizedContent("谁写了《罪与罚》？", listOf("费奥多尔·陀思妥耶夫斯基", "列夫·托尔斯泰", "尼古拉·果戈理", "伊万·屠格涅夫"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Crimen y castigo'?", listOf("Fiódor Dostoyevski", "León Tolstói", "Nikolái Gógol", "Iván Turguénev"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2213, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel musée se trouve dans l'ancien palais royal de Madrid ?", listOf("Prado", "Thyssen-Bornemisza", "Reina Sofía", "Guggenheim Bilbao"), "Culture", ""),
            en = LocalizedContent("Which museum is located in the former royal palace of Madrid?", listOf("Prado", "Thyssen-Bornemisza", "Reina Sofía", "Guggenheim Bilbao"), "Culture", ""),
            zh = LocalizedContent("哪个博物馆位于马德里的前皇宫内？", listOf("普拉多博物馆", "提森-博内米萨博物馆", "索菲亚王后国家艺术中心博物馆", "毕尔巴鄂古根海姆博物馆"), "文化", ""),
            es = LocalizedContent("¿Qué museo se encuentra en el antiguo palacio real de Madrid?", listOf("Prado", "Thyssen-Bornemisza", "Reina Sofía", "Guggenheim Bilbao"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2214, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Pablo Neruda ?", listOf("Poète chilien, prix Nobel de littérature", "Romancier argentin", "Poète cubain", "Dramaturge mexicain"), "Culture", ""),
            en = LocalizedContent("Who was Pablo Neruda?", listOf("Chilean poet, Nobel Prize in Literature", "Argentine novelist", "Cuban poet", "Mexican playwright"), "Culture", ""),
            zh = LocalizedContent("巴勃罗·聂鲁达是谁？", listOf("智利诗人，诺贝尔文学奖得主", "阿根廷小说家", "古巴诗人", "墨西哥剧作家"), "文化", ""),
            es = LocalizedContent("¿Quién fue Pablo Neruda?", listOf("Poeta chileno, premio Nobel de Literatura", "Novelista argentino", "Poeta cubano", "Dramaturgo mexicano"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2215, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le roman le plus vendu de l'histoire après la Bible ?", listOf("Don Quichotte", "Le Petit Prince", "Harry Potter", "Deux mille lieues sous les mers"), "Culture", ""),
            en = LocalizedContent("What is the best-selling novel in history after the Bible?", listOf("Don Quixote", "The Little Prince", "Harry Potter", "Twenty Thousand Leagues Under the Sea"), "Culture", ""),
            zh = LocalizedContent("历史上销量仅次于《圣经》的小说是什么？", listOf("《堂吉诃德》", "《小王子》", "《哈利·波特》", "《海底两万里》"), "文化", ""),
            es = LocalizedContent("¿Cuál es la novela más vendida de la historia después de la Biblia?", listOf("Don Quijote", "El Principito", "Harry Potter", "Veinte mil leguas de viaje submarino"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2216, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'La Flûte enchantée' ?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Joseph Haydn"), "Culture", ""),
            en = LocalizedContent("Which composer wrote 'The Magic Flute'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Joseph Haydn"), "Culture", ""),
            zh = LocalizedContent("哪位作曲家创作了《魔笛》？", listOf("沃尔夫冈·阿马德乌斯·莫扎特", "路德维希·范·贝多芬", "弗朗茨·舒伯特", "约瑟夫·海顿"), "文化", ""),
            es = LocalizedContent("¿Qué compositor escribió 'La flauta mágica'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Joseph Haydn"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2217, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre est connu pour 'La Persistance de la mémoire' (montres molles) ?", listOf("Salvador Dalí", "René Magritte", "Max Ernst", "Giorgio de Chirico"), "Culture", ""),
            en = LocalizedContent("Which painter is known for 'The Persistence of Memory' (melting clocks)?", listOf("Salvador Dalí", "René Magritte", "Max Ernst", "Giorgio de Chirico"), "Culture", ""),
            zh = LocalizedContent("哪位画家以《记忆的永恒》（软钟）而闻名？", listOf("萨尔瓦多·达利", "勒内·马格利特", "马克斯·恩斯特", "乔治·德·基里科"), "文化", ""),
            es = LocalizedContent("¿Qué pintor es conocido por 'La persistencia de la memoria' (relojes blandos)?", listOf("Salvador Dalí", "René Magritte", "Max Ernst", "Giorgio de Chirico"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2218, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'À la recherche du temps perdu' ?", listOf("Marcel Proust", "André Gide", "Stendhal", "Gustave Flaubert"), "Culture", ""),
            en = LocalizedContent("Who wrote 'In Search of Lost Time'?", listOf("Marcel Proust", "André Gide", "Stendhal", "Gustave Flaubert"), "Culture", ""),
            zh = LocalizedContent("谁写了《追忆似水年华》？", listOf("马塞尔·普鲁斯特", "安德烈·纪德", "司汤达", "居斯塔夫·福楼拜"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'En busca del tiempo perdido'?", listOf("Marcel Proust", "André Gide", "Stendhal", "Gustave Flaubert"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2219, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le sport national du Japon ?", listOf("Sumo", "Judo", "Karaté", "Kendo"), "Culture", ""),
            en = LocalizedContent("What is the national sport of Japan?", listOf("Sumo", "Judo", "Karate", "Kendo"), "Culture", ""),
            zh = LocalizedContent("日本的国技是什么？", listOf("相扑", "柔道", "空手道", "剑道"), "文化", ""),
            es = LocalizedContent("¿Cuál es el deporte nacional de Japón?", listOf("Sumo", "Judo", "Kárate", "Kendo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2220, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste américain est connu pour ses Campbell's Soup Cans ?", listOf("Andy Warhol", "Roy Lichtenstein", "Jasper Johns", "Robert Rauschenberg"), "Culture", ""),
            en = LocalizedContent("Which American artist is known for his Campbell's Soup Cans?", listOf("Andy Warhol", "Roy Lichtenstein", "Jasper Johns", "Robert Rauschenberg"), "Culture", ""),
            zh = LocalizedContent("哪位美国艺术家以他的《金宝汤罐头》而闻名？", listOf("安迪·沃霍尔", "罗伊·利希滕斯坦", "贾斯珀·约翰斯", "罗伯特·劳森伯格"), "文化", ""),
            es = LocalizedContent("¿Qué artista estadounidense es conocido por sus latas de sopa Campbell's?", listOf("Andy Warhol", "Roy Lichtenstein", "Jasper Johns", "Robert Rauschenberg"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 2221, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le langage de programmation le plus utilisé pour le développement Android ?", listOf("Kotlin", "Java", "Swift", "C++"), "Tech", ""),
            en = LocalizedContent("What is the most used programming language for Android development?", listOf("Kotlin", "Java", "Swift", "C++"), "Technology", ""),
            zh = LocalizedContent("Android开发中最常用的编程语言是什么？", listOf("Kotlin", "Java", "Swift", "C++"), "科技", ""),
            es = LocalizedContent("¿Cuál es el lenguaje de programación más utilizado para el desarrollo de Android?", listOf("Kotlin", "Java", "Swift", "C++"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2222, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'IoT' ?", listOf("Internet of Things", "Internet of Technology", "Integrated Objects Technology", "Input/Output Transmission"), "Tech", ""),
            en = LocalizedContent("What does 'IoT' stand for?", listOf("Internet of Things", "Internet of Technology", "Integrated Objects Technology", "Input/Output Transmission"), "Technology", ""),
            zh = LocalizedContent("'IoT'代表什么？", listOf("物联网", "互联网技术", "集成对象技术", "输入/输出传输"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'IoT'?", listOf("Internet de las Cosas", "Internet de la Tecnología", "Tecnología de Objetos Integrados", "Transmisión de Entrada/Salida"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2223, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel protocole sécurise les connexions web (HTTPS) ?", listOf("TLS/SSL", "HTTP", "FTP", "SSH"), "Tech", ""),
            en = LocalizedContent("Which protocol secures web connections (HTTPS)?", listOf("TLS/SSL", "HTTP", "FTP", "SSH"), "Technology", ""),
            zh = LocalizedContent("哪个协议保护网页连接（HTTPS）？", listOf("TLS/SSL", "HTTP", "FTP", "SSH"), "科技", ""),
            es = LocalizedContent("¿Qué protocolo asegura las conexiones web (HTTPS)?", listOf("TLS/SSL", "HTTP", "FTP", "SSH"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2224, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle entreprise a développé le langage Swift ?", listOf("Apple", "Google", "Microsoft", "Meta"), "Tech", ""),
            en = LocalizedContent("Which company developed the Swift language?", listOf("Apple", "Google", "Microsoft", "Meta"), "Technology", ""),
            zh = LocalizedContent("哪家公司开发了Swift语言？", listOf("苹果", "谷歌", "微软", "Meta"), "科技", ""),
            es = LocalizedContent("¿Qué empresa desarrolló el lenguaje Swift?", listOf("Apple", "Google", "Microsoft", "Meta"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2225, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le machine learning ?", listOf("Apprentissage automatique par algorithmes sur des données", "Programmation manuelle de règles", "Simulation de circuits neuronaux biologiques", "Automatisation de tâches répétitives"), "Tech", ""),
            en = LocalizedContent("What is machine learning?", listOf("Automatic learning by algorithms on data", "Manual programming of rules", "Simulation of biological neural circuits", "Automation of repetitive tasks"), "Technology", ""),
            zh = LocalizedContent("什么是机器学习？", listOf("通过算法对数据进行自动学习", "手动编写规则", "模拟生物神经回路", "重复性任务的自动化"), "科技", ""),
            es = LocalizedContent("¿Qué es el machine learning?", listOf("Aprendizaje automático mediante algoritmos sobre datos", "Programación manual de reglas", "Simulación de circuitos neuronales biológicos", "Automatización de tareas repetitivas"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2226, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel algorithme de recherche sur un graphe porte le nom de son inventeur néerlandais ?", listOf("Dijkstra", "Bellman-Ford", "Floyd-Warshall", "A*"), "Tech", ""),
            en = LocalizedContent("Which graph search algorithm is named after its Dutch inventor?", listOf("Dijkstra", "Bellman-Ford", "Floyd-Warshall", "A*"), "Technology", ""),
            zh = LocalizedContent("哪种图搜索算法以其荷兰发明者的名字命名？", listOf("Dijkstra", "Bellman-Ford", "Floyd-Warshall", "A*"), "科技", ""),
            es = LocalizedContent("¿Qué algoritmo de búsqueda en grafos lleva el nombre de su inventor neerlandés?", listOf("Dijkstra", "Bellman-Ford", "Floyd-Warshall", "A*"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2227, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la différence entre RAM et ROM ?", listOf("RAM est volatile, ROM est permanente", "RAM stocke les données, ROM stocke les programmes", "RAM est plus rapide, ROM plus lente", "ROM est volatile, RAM permanente"), "Tech", ""),
            en = LocalizedContent("What is the difference between RAM and ROM?", listOf("RAM is volatile, ROM is permanent", "RAM stores data, ROM stores programs", "RAM is faster, ROM is slower", "ROM is volatile, RAM is permanent"), "Technology", ""),
            zh = LocalizedContent("RAM和ROM有什么区别？", listOf("RAM是易失性的，ROM是永久性的", "RAM存储数据，ROM存储程序", "RAM更快，ROM更慢", "ROM是易失性的，RAM是永久性的"), "科技", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre RAM y ROM?", listOf("La RAM es volátil, la ROM es permanente", "La RAM almacena datos, la ROM almacena programas", "La RAM es más rápida, la ROM es más lenta", "La ROM es volátil, la RAM es permanente"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2228, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un algorithme de hachage ?", listOf("Fonction transformant des données en empreinte de taille fixe", "Algorithme de compression de données", "Méthode de cryptage symétrique", "Protocole réseau"), "Tech", ""),
            en = LocalizedContent("What is a hash algorithm?", listOf("Function that transforms data into a fixed-size fingerprint", "Data compression algorithm", "Symmetric encryption method", "Network protocol"), "Technology", ""),
            zh = LocalizedContent("什么是哈希算法？", listOf("将数据转换为固定大小指纹的函数", "数据压缩算法", "对称加密方法", "网络协议"), "科技", ""),
            es = LocalizedContent("¿Qué es un algoritmo de hash?", listOf("Función que transforma datos en una huella de tamaño fijo", "Algoritmo de compresión de datos", "Método de cifrado simétrico", "Protocolo de red"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2229, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système de gestion de versions le plus populaire ?", listOf("Git", "SVN", "Mercurial", "CVS"), "Tech", ""),
            en = LocalizedContent("What is the most popular version control system?", listOf("Git", "SVN", "Mercurial", "CVS"), "Technology", ""),
            zh = LocalizedContent("最流行的版本控制系统是什么？", listOf("Git", "SVN", "Mercurial", "CVS"), "科技", ""),
            es = LocalizedContent("¿Cuál es el sistema de control de versiones más popular?", listOf("Git", "SVN", "Mercurial", "CVS"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2230, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'API' ?", listOf("Application Programming Interface", "Automated Programming Interface", "Application Process Integration", "Advanced Protocol Interface"), "Tech", ""),
            en = LocalizedContent("What does 'API' stand for?", listOf("Application Programming Interface", "Automated Programming Interface", "Application Process Integration", "Advanced Protocol Interface"), "Technology", ""),
            zh = LocalizedContent("API代表什么？", listOf("应用程序编程接口", "自动编程接口", "应用程序流程集成", "高级协议接口"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'API'?", listOf("Application Programming Interface", "Automated Programming Interface", "Application Process Integration", "Advanced Protocol Interface"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2231, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le langage utilisé pour créer des smart contracts sur Ethereum ?", listOf("Solidity", "Rust", "Go", "Python"), "Tech", ""),
            en = LocalizedContent("Which language is used to create smart contracts on Ethereum?", listOf("Solidity", "Rust", "Go", "Python"), "Technology", ""),
            zh = LocalizedContent("哪种语言用于在以太坊上创建智能合约？", listOf("Solidity", "Rust", "Go", "Python"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje se utiliza para crear contratos inteligentes en Ethereum?", listOf("Solidity", "Rust", "Go", "Python"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2232, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la technologie blockchain ?", listOf("Registre distribué et immuable de transactions", "Base de données centralisée", "Réseau peer-to-peer de streaming", "Protocole de sécurité Internet"), "Tech", ""),
            en = LocalizedContent("What is blockchain technology?", listOf("Distributed and immutable ledger of transactions", "Centralized database", "Peer-to-peer streaming network", "Internet security protocol"), "Technology", ""),
            zh = LocalizedContent("什么是区块链技术？", listOf("分布式且不可篡改的交易账本", "中心化数据库", "点对点流媒体网络", "互联网安全协议"), "科技", ""),
            es = LocalizedContent("¿Qué es la tecnología blockchain?", listOf("Registro distribuido e inmutable de transacciones", "Base de datos centralizada", "Red de streaming peer-to-peer", "Protocolo de seguridad de Internet"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2233, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier microprocesseur commercial ?", listOf("Intel 4004 (1971)", "Intel 8008 (1972)", "Motorola 6800 (1974)", "Zilog Z80 (1976)"), "Tech", ""),
            en = LocalizedContent("What was the first commercial microprocessor?", listOf("Intel 4004 (1971)", "Intel 8008 (1972)", "Motorola 6800 (1974)", "Zilog Z80 (1976)"), "Technology", ""),
            zh = LocalizedContent("第一款商用微处理器是什么？", listOf("Intel 4004 (1971年)", "Intel 8008 (1972年)", "Motorola 6800 (1974年)", "Zilog Z80 (1976年)"), "科技", ""),
            es = LocalizedContent("¿Cuál fue el primer microprocesador comercial?", listOf("Intel 4004 (1971)", "Intel 8008 (1972)", "Motorola 6800 (1974)", "Zilog Z80 (1976)"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2234, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'SSD' ?", listOf("Solid State Drive", "Super Speed Disk", "Secure Storage Device", "System Software Drive"), "Tech", ""),
            en = LocalizedContent("What does 'SSD' stand for?", listOf("Solid State Drive", "Super Speed Disk", "Secure Storage Device", "System Software Drive"), "Technology", ""),
            zh = LocalizedContent("SSD代表什么？", listOf("固态硬盘", "超高速磁盘", "安全存储设备", "系统软件驱动器"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'SSD'?", listOf("Solid State Drive", "Super Speed Disk", "Secure Storage Device", "System Software Drive"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2235, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel langage est utilisé pour programmer des microcontrôleurs Arduino ?", listOf("C/C++", "Python", "Java", "MicroPython"), "Tech", ""),
            en = LocalizedContent("Which language is used to program Arduino microcontrollers?", listOf("C/C++", "Python", "Java", "MicroPython"), "Technology", ""),
            zh = LocalizedContent("哪种语言用于编程Arduino微控制器？", listOf("C/C++", "Python", "Java", "MicroPython"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje se utiliza para programar microcontroladores Arduino?", listOf("C/C++", "Python", "Java", "MicroPython"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2236, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la latence dans un réseau informatique ?", listOf("Délai de transmission des données", "Bande passante maximale", "Perte de paquets", "Vitesse de connexion"), "Tech", ""),
            en = LocalizedContent("What is latency in a computer network?", listOf("Data transmission delay", "Maximum bandwidth", "Packet loss", "Connection speed"), "Technology", ""),
            zh = LocalizedContent("计算机网络中的延迟是什么？", listOf("数据传输延迟", "最大带宽", "数据包丢失", "连接速度"), "科技", ""),
            es = LocalizedContent("¿Qué es la latencia en una red informática?", listOf("Retardo en la transmisión de datos", "Ancho de banda máximo", "Pérdida de paquetes", "Velocidad de conexión"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2237, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le format de compression d'images le plus commun pour le web ?", listOf("JPEG/WebP", "BMP", "TIFF", "RAW"), "Tech", ""),
            en = LocalizedContent("What is the most common image compression format for the web?", listOf("JPEG/WebP", "BMP", "TIFF", "RAW"), "Technology", ""),
            zh = LocalizedContent("网页中最常见的图像压缩格式是什么？", listOf("JPEG/WebP", "BMP", "TIFF", "RAW"), "科技", ""),
            es = LocalizedContent("¿Cuál es el formato de compresión de imágenes más común para la web?", listOf("JPEG/WebP", "BMP", "TIFF", "RAW"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2238, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que Docker ?", listOf("Plateforme de conteneurisation d'applications", "Système d'exploitation serveur", "Framework de développement web", "Service cloud de stockage"), "Tech", ""),
            en = LocalizedContent("What is Docker?", listOf("Application containerization platform", "Server operating system", "Web development framework", "Cloud storage service"), "Technology", ""),
            zh = LocalizedContent("什么是Docker？", listOf("应用程序容器化平台", "服务器操作系统", "Web开发框架", "云存储服务"), "科技", ""),
            es = LocalizedContent("¿Qué es Docker?", listOf("Plataforma de contenedorización de aplicaciones", "Sistema operativo de servidor", "Framework de desarrollo web", "Servicio de almacenamiento en la nube"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2239, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole utilisé pour la messagerie instantanée (WhatsApp, etc.) ?", listOf("XMPP/Signal Protocol", "SMTP", "FTP", "HTTP"), "Tech", ""),
            en = LocalizedContent("Which protocol is used for instant messaging (WhatsApp, etc.)?", listOf("XMPP/Signal Protocol", "SMTP", "FTP", "HTTP"), "Technology", ""),
            zh = LocalizedContent("即时通讯（如WhatsApp）使用哪种协议？", listOf("XMPP/Signal协议", "SMTP", "FTP", "HTTP"), "科技", ""),
            es = LocalizedContent("¿Qué protocolo se utiliza para la mensajería instantánea (WhatsApp, etc.)?", listOf("XMPP/Protocolo Signal", "SMTP", "FTP", "HTTP"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2240, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la cryptographie asymétrique ?", listOf("Utilisation d'une clé publique et d'une clé privée", "Même clé pour chiffrer et déchiffrer", "Codage par substitution", "Cryptage par flux de bits"), "Tech", ""),
            en = LocalizedContent("What is asymmetric cryptography?", listOf("Use of a public key and a private key", "Same key for encryption and decryption", "Substitution cipher", "Bit stream encryption"), "Technology", ""),
            zh = LocalizedContent("什么是不对称加密？", listOf("使用公钥和私钥", "加密和解密使用相同密钥", "替换密码", "比特流加密"), "科技", ""),
            es = LocalizedContent("¿Qué es la criptografía asimétrica?", listOf("Uso de una clave pública y una clave privada", "Misma clave para cifrar y descifrar", "Cifrado por sustitución", "Cifrado por flujo de bits"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2241, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système d'exploitation le plus utilisé sur les serveurs web ?", listOf("Linux", "Windows Server", "macOS Server", "FreeBSD"), "Tech", ""),
            en = LocalizedContent("Which operating system is most used on web servers?", listOf("Linux", "Windows Server", "macOS Server", "FreeBSD"), "Technology", ""),
            zh = LocalizedContent("哪种操作系统在Web服务器上使用最多？", listOf("Linux", "Windows Server", "macOS Server", "FreeBSD"), "科技", ""),
            es = LocalizedContent("¿Qué sistema operativo es el más utilizado en servidores web?", listOf("Linux", "Windows Server", "macOS Server", "FreeBSD"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2242, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie 'IPv6' ?", listOf("Internet Protocol version 6 (128 bits)", "Internet Protocol version 6 (64 bits)", "Internet Protocol version 6 (32 bits)", "Sixième protocole internet"), "Tech", ""),
            en = LocalizedContent("What does 'IPv6' mean?", listOf("Internet Protocol version 6 (128 bits)", "Internet Protocol version 6 (64 bits)", "Internet Protocol version 6 (32 bits)", "Sixth internet protocol"), "Technology", ""),
            zh = LocalizedContent("“IPv6”是什么意思？", listOf("互联网协议第6版（128位）", "互联网协议第6版（64位）", "互联网协议第6版（32位）", "第六个互联网协议"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'IPv6'?", listOf("Protocolo de Internet versión 6 (128 bits)", "Protocolo de Internet versión 6 (64 bits)", "Protocolo de Internet versión 6 (32 bits)", "Sexto protocolo de Internet"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2243, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation créé par James Gosling ?", listOf("Java", "C#", "Python", "Kotlin"), "Tech", ""),
            en = LocalizedContent("Which programming language was created by James Gosling?", listOf("Java", "C#", "Python", "Kotlin"), "Technology", ""),
            zh = LocalizedContent("哪种编程语言是由James Gosling创建的？", listOf("Java", "C#", "Python", "Kotlin"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje de programación fue creado por James Gosling?", listOf("Java", "C#", "Python", "Kotlin"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2244, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un réseau de neurones convolutif (CNN) ?", listOf("Architecture de deep learning pour les images", "Réseau neuronal pour le texte", "Algorithme de recommandation", "Modèle statistique classique"), "Tech", ""),
            en = LocalizedContent("What is a convolutional neural network (CNN)?", listOf("Deep learning architecture for images", "Neural network for text", "Recommendation algorithm", "Classical statistical model"), "Technology", ""),
            zh = LocalizedContent("什么是卷积神经网络（CNN）？", listOf("用于图像的深度学习架构", "用于文本的神经网络", "推荐算法", "经典统计模型"), "科技", ""),
            es = LocalizedContent("¿Qué es una red neuronal convolucional (CNN)?", listOf("Arquitectura de deep learning para imágenes", "Red neuronal para texto", "Algoritmo de recomendación", "Modelo estadístico clásico"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2245, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel composant fait le rendu graphique dans un ordinateur ?", listOf("GPU", "CPU", "RAM", "SSD"), "Tech", ""),
            en = LocalizedContent("Which component handles graphics rendering in a computer?", listOf("GPU", "CPU", "RAM", "SSD"), "Technology", ""),
            zh = LocalizedContent("计算机中哪个组件负责图形渲染？", listOf("GPU", "CPU", "RAM", "SSD"), "科技", ""),
            es = LocalizedContent("¿Qué componente realiza el renderizado gráfico en un ordenador?", listOf("GPU", "CPU", "RAM", "SSD"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2246, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie 'REST' en développement web ?", listOf("Representational State Transfer", "Remote Execution Standard Transfer", "Resource State Transfer", "Rapid Execution Service Technology"), "Tech", ""),
            en = LocalizedContent("What does 'REST' stand for in web development?", listOf("Representational State Transfer", "Remote Execution Standard Transfer", "Resource State Transfer", "Rapid Execution Service Technology"), "Technology", ""),
            zh = LocalizedContent("在Web开发中，“REST”代表什么？", listOf("Representational State Transfer", "Remote Execution Standard Transfer", "Resource State Transfer", "Rapid Execution Service Technology"), "科技", ""),
            es = LocalizedContent("¿Qué significa 'REST' en desarrollo web?", listOf("Representational State Transfer", "Remote Execution Standard Transfer", "Resource State Transfer", "Rapid Execution Service Technology"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2247, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le protocole de communication utilisé par le web ?", listOf("HTTP/HTTPS", "FTP", "SMTP", "SSH"), "Tech", ""),
            en = LocalizedContent("What is the communication protocol used by the web?", listOf("HTTP/HTTPS", "FTP", "SMTP", "SSH"), "Technology", ""),
            zh = LocalizedContent("Web使用的通信协议是什么？", listOf("HTTP/HTTPS", "FTP", "SMTP", "SSH"), "科技", ""),
            es = LocalizedContent("¿Cuál es el protocolo de comunicación utilizado por la web?", listOf("HTTP/HTTPS", "FTP", "SMTP", "SSH"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2248, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le cloud computing ?", listOf("Utilisation de ressources informatiques via internet", "Stockage physique externe", "Réseau local d'entreprise", "Logiciel de collaboration"), "Tech", ""),
            en = LocalizedContent("What is cloud computing?", listOf("Use of computing resources via the internet", "External physical storage", "Local corporate network", "Collaboration software"), "Technology", ""),
            zh = LocalizedContent("什么是云计算？", listOf("通过互联网使用计算资源", "外部物理存储", "企业本地网络", "协作软件"), "科技", ""),
            es = LocalizedContent("¿Qué es la computación en la nube?", listOf("Uso de recursos informáticos a través de internet", "Almacenamiento físico externo", "Red local empresarial", "Software de colaboración"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2249, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage de script est intégré nativement dans les navigateurs web ?", listOf("JavaScript", "TypeScript", "Python", "PHP"), "Tech", ""),
            en = LocalizedContent("Which scripting language is natively integrated into web browsers?", listOf("JavaScript", "TypeScript", "Python", "PHP"), "Technology", ""),
            zh = LocalizedContent("哪种脚本语言原生集成在Web浏览器中？", listOf("JavaScript", "TypeScript", "Python", "PHP"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje de script está integrado de forma nativa en los navegadores web?", listOf("JavaScript", "TypeScript", "Python", "PHP"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2250, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la réalité augmentée ?", listOf("Superposition d'éléments virtuels sur le monde réel", "Simulation d'environnements totalement virtuels", "Reconnaissance d'images par IA", "Interface holographique"), "Tech", ""),
            en = LocalizedContent("What is augmented reality?", listOf("Overlay of virtual elements on the real world", "Simulation of fully virtual environments", "Image recognition by AI", "Holographic interface"), "Technology", ""),
            zh = LocalizedContent("什么是增强现实？", listOf("在现实世界上叠加虚拟元素", "完全虚拟环境的模拟", "AI图像识别", "全息界面"), "科技", ""),
            es = LocalizedContent("¿Qué es la realidad aumentada?", listOf("Superposición de elementos virtuales sobre el mundo real", "Simulación de entornos totalmente virtuales", "Reconocimiento de imágenes por IA", "Interfaz holográfica"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 2251, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sets gagne une joueuse pour remporter un match de tennis en Grand Chelem féminin ?", listOf("2", "3", "1", "4"), "Sport", ""),
            en = LocalizedContent("How many sets does a player need to win a women's Grand Slam tennis match?", listOf("2", "3", "1", "4"), "Sports", ""),
            zh = LocalizedContent("女子网球大满贯比赛中，一名选手需要赢多少盘才能获胜？", listOf("2", "3", "1", "4"), "体育", ""),
            es = LocalizedContent("¿Cuántos sets necesita ganar una jugadora para ganar un partido de tenis de Grand Slam femenino?", listOf("2", "3", "1", "4"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2252, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays qui a remporté le plus de Coupes du Monde de cricket ?", listOf("Australie", "Inde", "Angleterre", "Pakistan"), "Sport", ""),
            en = LocalizedContent("Which country has won the most Cricket World Cups?", listOf("Australia", "India", "England", "Pakistan"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得了最多的板球世界杯？", listOf("澳大利亚", "印度", "英格兰", "巴基斯坦"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más Copas Mundiales de críquet?", listOf("Australia", "India", "Inglaterra", "Pakistán"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2253, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle discipline est le pentathlon moderne ?", listOf("Natation, escrime, tir, équitation, course à pied", "Athlétisme, natation, cyclisme, boxe, lutte", "Triathlon + 2 disciplines", "5 disciplines d'athlétisme"), "Sport", ""),
            en = LocalizedContent("What disciplines make up the modern pentathlon?", listOf("Swimming, fencing, shooting, equestrian, running", "Athletics, swimming, cycling, boxing, wrestling", "Triathlon + 2 disciplines", "5 athletics disciplines"), "Sports", ""),
            zh = LocalizedContent("现代五项包括哪些项目？", listOf("游泳、击剑、射击、马术、跑步", "田径、游泳、自行车、拳击、摔跤", "铁人三项加两项", "五项田径项目"), "体育", ""),
            es = LocalizedContent("¿Qué disciplinas componen el pentatlón moderno?", listOf("Natación, esgrima, tiro, equitación, carrera a pie", "Atletismo, natación, ciclismo, boxeo, lucha", "Triatlón + 2 disciplinas", "5 disciplinas de atletismo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2254, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de points marque-t-on avec un penalty transformé au rugby ?", listOf("3", "5", "2", "4"), "Sport", ""),
            en = LocalizedContent("How many points are scored with a converted penalty in rugby?", listOf("3", "5", "2", "4"), "Sports", ""),
            zh = LocalizedContent("橄榄球中，罚踢射门成功得多少分？", listOf("3", "5", "2", "4"), "体育", ""),
            es = LocalizedContent("¿Cuántos puntos se marcan con un penal transformado en rugby?", listOf("3", "5", "2", "4"), "Deportes", "")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 2255, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté le plus de titres de Champion d'Europe de football ?", listOf("Espagne", "Allemagne", "France", "Italie"), "Sport", ""),
            en = LocalizedContent("Which country has won the most European Football Championship titles?", listOf("Spain", "Germany", "France", "Italy"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得了最多的欧洲足球锦标赛冠军？", listOf("西班牙", "德国", "法国", "意大利"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más títulos de Campeonato Europeo de fútbol?", listOf("España", "Alemania", "Francia", "Italia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2256, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs composent une équipe de volleyball sur le terrain ?", listOf("6", "5", "7", "8"), "Sport", ""),
            en = LocalizedContent("How many players make up a volleyball team on the court?", listOf("6", "5", "7", "8"), "Sports", ""),
            zh = LocalizedContent("一支排球队在场上由多少名球员组成？", listOf("6", "5", "7", "8"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores componen un equipo de voleibol en la cancha?", listOf("6", "5", "7", "8"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2257, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le football a-t-il été introduit aux Jeux olympiques modernes ?", listOf("1900", "1908", "1896", "1912"), "Sport", ""),
            en = LocalizedContent("In which year was football introduced to the modern Olympic Games?", listOf("1900", "1908", "1896", "1912"), "Sports", ""),
            zh = LocalizedContent("足球在哪一年被引入现代奥运会？", listOf("1900", "1908", "1896", "1912"), "体育", ""),
            es = LocalizedContent("¿En qué año se introdujo el fútbol en los Juegos Olímpicos modernos?", listOf("1900", "1908", "1896", "1912"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2258, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 100m féminin ?", listOf("10,49s - Florence Griffith-Joyner", "10,60s - Shelly-Ann Fraser-Pryce", "10,54s - Marion Jones", "10,64s - Christine Arron"), "Sport", ""),
            en = LocalizedContent("What is the women's 100m world record?", listOf("10.49s - Florence Griffith-Joyner", "10.60s - Shelly-Ann Fraser-Pryce", "10.54s - Marion Jones", "10.64s - Christine Arron"), "Sports", ""),
            zh = LocalizedContent("女子100米世界纪录是多少？", listOf("10.49秒 - 弗洛伦斯·格里菲斯-乔伊娜", "10.60秒 - 谢莉-安·弗雷泽-普莱斯", "10.54秒 - 玛丽昂·琼斯", "10.64秒 - 克里斯蒂娜·阿龙"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial femenino de 100m?", listOf("10,49s - Florence Griffith-Joyner", "10,60s - Shelly-Ann Fraser-Pryce", "10,54s - Marion Jones", "10,64s - Christine Arron"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2259, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de joueurs y a-t-il au polo ?", listOf("4", "3", "6", "5"), "Sport", ""),
            en = LocalizedContent("How many players are there in polo?", listOf("4", "3", "6", "5"), "Sports", ""),
            zh = LocalizedContent("马球比赛中有多少名球员？", listOf("4", "3", "6", "5"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores hay en el polo?", listOf("4", "3", "6", "5"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2260, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle nation a gagné le plus de médailles d'or en natation aux JO ?", listOf("États-Unis", "Australie", "Allemagne", "Chine"), "Sport", ""),
            en = LocalizedContent("Which nation has won the most gold medals in swimming at the Olympics?", listOf("United States", "Australia", "Germany", "China"), "Sports", ""),
            zh = LocalizedContent("哪个国家在奥运会游泳项目中获得了最多的金牌？", listOf("美国", "澳大利亚", "德国", "中国"), "体育", ""),
            es = LocalizedContent("¿Qué nación ha ganado más medallas de oro en natación en los Juegos Olímpicos?", listOf("Estados Unidos", "Australia", "Alemania", "China"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2261, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le temps minimum d'une épreuve cycliste pour être qualifiée de Grand Tour ?", listOf("3 semaines", "2 semaines", "1 semaine", "4 semaines"), "Sport", ""),
            en = LocalizedContent("What is the minimum duration of a cycling race to be classified as a Grand Tour?", listOf("3 weeks", "2 weeks", "1 week", "4 weeks"), "Sports", ""),
            zh = LocalizedContent("一场自行车赛要被称为大环赛，最短持续时间是多少？", listOf("3周", "2周", "1周", "4周"), "体育", ""),
            es = LocalizedContent("¿Cuál es la duración mínima de una carrera ciclista para ser clasificada como Gran Vuelta?", listOf("3 semanas", "2 semanas", "1 semana", "4 semanas"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2262, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de buts a marqué Pelé en carrière professionnelle (officiel) ?", listOf("1281", "768", "1000", "891"), "Sport", ""),
            en = LocalizedContent("How many goals did Pelé score in his professional career (official)?", listOf("1281", "768", "1000", "891"), "Sports", ""),
            zh = LocalizedContent("贝利在职业生涯中（官方）打进了多少球？", listOf("1281", "768", "1000", "891"), "体育", ""),
            es = LocalizedContent("¿Cuántos goles marcó Pelé en su carrera profesional (oficial)?", listOf("1281", "768", "1000", "891"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2263, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté la Coupe du Monde de football le plus souvent à domicile ?", listOf("Angleterre (1966)", "France (1998)", "Allemagne (1974)", "Argentine (1978)"), "Sport", ""),
            en = LocalizedContent("Which country has won the FIFA World Cup most often at home?", listOf("England (1966)", "France (1998)", "Germany (1974)", "Argentina (1978)"), "Sports", ""),
            zh = LocalizedContent("哪个国家在本土赢得世界杯的次数最多？", listOf("英格兰（1966年）", "法国（1998年）", "德国（1974年）", "阿根廷（1978年）"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado la Copa Mundial de la FIFA más veces en casa?", listOf("Inglaterra (1966)", "Francia (1998)", "Alemania (1974)", "Argentina (1978)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2264, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se déroule le tournoi de golf des Masters ?", listOf("États-Unis (Augusta)", "Royaume-Uni", "Écosse", "Irlande"), "Sport", ""),
            en = LocalizedContent("In which country is the Masters golf tournament held?", listOf("United States (Augusta)", "United Kingdom", "Scotland", "Ireland"), "Sports", ""),
            zh = LocalizedContent("高尔夫大师赛在哪个国家举行？", listOf("美国（奥古斯塔）", "英国", "苏格兰", "爱尔兰"), "体育", ""),
            es = LocalizedContent("¿En qué país se celebra el torneo de golf Masters?", listOf("Estados Unidos (Augusta)", "Reino Unido", "Escocia", "Irlanda"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2265, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle discipline des JO consiste à tirer sur des cibles en équitation ?", listOf("Pentathlon moderne", "Biathlon", "Tir à l'arc monté", "Équitation de combat"), "Sport", ""),
            en = LocalizedContent("Which Olympic discipline involves shooting at targets while riding a horse?", listOf("Modern pentathlon", "Biathlon", "Mounted archery", "Combat equestrian"), "Sports", ""),
            zh = LocalizedContent("哪项奥运项目涉及骑马射击目标？", listOf("现代五项", "冬季两项", "骑马射箭", "战斗马术"), "体育", ""),
            es = LocalizedContent("¿Qué disciplina olímpica consiste en disparar a objetivos mientras se monta a caballo?", listOf("Pentatlón moderno", "Biatlón", "Tiro con arco a caballo", "Equitación de combate"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2266, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tours compte le Tour d'Italie (Giro) ?", listOf("21", "20", "23", "18"), "Sport", ""),
            en = LocalizedContent("How many stages does the Tour of Italy (Giro) have?", listOf("21", "20", "23", "18"), "Sports", ""),
            zh = LocalizedContent("环意大利自行车赛（Giro）有多少个赛段？", listOf("21", "20", "23", "18"), "体育", ""),
            es = LocalizedContent("¿Cuántas etapas tiene el Tour de Italia (Giro)?", listOf("21", "20", "23", "18"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2267, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel footballeur est surnommé 'El Fenomeno' ?", listOf("Ronaldo (brésilien)", "Cristiano Ronaldo", "Ronaldinho", "Roberto Carlos"), "Sport", ""),
            en = LocalizedContent("Which footballer is nicknamed 'El Fenomeno'?", listOf("Ronaldo (Brazilian)", "Cristiano Ronaldo", "Ronaldinho", "Roberto Carlos"), "Sports", ""),
            zh = LocalizedContent("哪位足球运动员绰号'El Fenomeno'？", listOf("罗纳尔多（巴西）", "克里斯蒂亚诺·罗纳尔多", "罗纳尔迪尼奥", "罗伯特·卡洛斯"), "体育", ""),
            es = LocalizedContent("¿Qué futbolista es apodado 'El Fenómeno'?", listOf("Ronaldo (brasileño)", "Cristiano Ronaldo", "Ronaldinho", "Roberto Carlos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2268, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sets gagne-t-on au volleyball pour remporter un match ?", listOf("3 (sur 5)", "2 (sur 3)", "3 (sur 4)", "4 (sur 7)"), "Sport", ""),
            en = LocalizedContent("How many sets do you need to win to win a volleyball match?", listOf("3 (out of 5)", "2 (out of 3)", "3 (out of 4)", "4 (out of 7)"), "Sports", ""),
            zh = LocalizedContent("在排球比赛中，赢得多少局才能获胜？", listOf("3（共5局）", "2（共3局）", "3（共4局）", "4（共7局）"), "体育", ""),
            es = LocalizedContent("¿Cuántos sets se necesitan ganar para ganar un partido de voleibol?", listOf("3 (de 5)", "2 (de 3)", "3 (de 4)", "4 (de 7)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2269, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le sport le plus pratiqué en Inde ?", listOf("Cricket", "Hockey sur gazon", "Badminton", "Football"), "Sport", ""),
            en = LocalizedContent("What is the most popular sport in India?", listOf("Cricket", "Field hockey", "Badminton", "Football"), "Sports", ""),
            zh = LocalizedContent("印度最流行的运动是什么？", listOf("板球", "曲棍球", "羽毛球", "足球"), "体育", ""),
            es = LocalizedContent("¿Cuál es el deporte más popular en India?", listOf("Críquet", "Hockey sobre hierba", "Bádminton", "Fútbol"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2270, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Zinédine Zidane a-t-il été élu meilleur joueur du monde pour la première fois ?", listOf("1998", "2003", "2000", "2001"), "Sport", ""),
            en = LocalizedContent("In which year was Zinedine Zidane elected World Player of the Year for the first time?", listOf("1998", "2003", "2000", "2001"), "Sports", ""),
            zh = LocalizedContent("齐内丁·齐达内首次当选世界足球先生是在哪一年？", listOf("1998", "2003", "2000", "2001"), "体育", ""),
            es = LocalizedContent("¿En qué año fue elegido Zinedine Zidane mejor jugador del mundo por primera vez?", listOf("1998", "2003", "2000", "2001"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2271, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de disciplines composent le décathlon ?", listOf("10", "7", "8", "12"), "Sport", ""),
            en = LocalizedContent("How many events make up the decathlon?", listOf("10", "7", "8", "12"), "Sports", ""),
            zh = LocalizedContent("十项全能由多少个项目组成？", listOf("10", "7", "8", "12"), "体育", ""),
            es = LocalizedContent("¿Cuántas pruebas componen el decatlón?", listOf("10", "7", "8", "12"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2272, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de Coupes du Monde de handball masculin ?", listOf("France", "Danemark", "Espagne", "Allemagne"), "Sport", ""),
            en = LocalizedContent("Which country has won the most Men's Handball World Championships?", listOf("France", "Denmark", "Spain", "Germany"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得男子手球世界锦标赛次数最多？", listOf("法国", "丹麦", "西班牙", "德国"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más Campeonatos Mundiales de Balonmano masculino?", listOf("Francia", "Dinamarca", "España", "Alemania"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2273, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Serena Williams a-t-elle remporté son premier titre en Grand Chelem ?", listOf("1999", "2001", "2002", "1998"), "Sport", ""),
            en = LocalizedContent("In which year did Serena Williams win her first Grand Slam title?", listOf("1999", "2001", "2002", "1998"), "Sports", ""),
            zh = LocalizedContent("塞雷娜·威廉姆斯在哪一年赢得她的第一个大满贯冠军？", listOf("1999", "2001", "2002", "1998"), "体育", ""),
            es = LocalizedContent("¿En qué año ganó Serena Williams su primer título de Grand Slam?", listOf("1999", "2001", "2002", "1998"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2274, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le poids d'un ballon de football officiel ?", listOf("410-450g", "350-380g", "380-400g", "450-500g"), "Sport", ""),
            en = LocalizedContent("What is the weight of an official football (soccer ball)?", listOf("410-450g", "350-380g", "380-400g", "450-500g"), "Sports", ""),
            zh = LocalizedContent("官方足球的重量是多少？", listOf("410-450克", "350-380克", "380-400克", "450-500克"), "体育", ""),
            es = LocalizedContent("¿Cuál es el peso de un balón de fútbol oficial?", listOf("410-450g", "350-380g", "380-400g", "450-500g"), "Deportes", "")
        ),
    )
}
