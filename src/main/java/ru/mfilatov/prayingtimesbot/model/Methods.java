package ru.mfilatov.prayingtimesbot.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Methods {
    MWL(3, "Muslim World League"),
    ISNA(2, "Islamic Society of North America (ISNA)"),
    EGYPT(5,"Egyptian General Authority of Survey"),
    MAKKAH(4,"Umm Al-Qura University, Makkah"),
    KARACHI(1, "University of Islamic Sciences, Karachi"),
    TEHRAN(7, "Institute of Geophysics, University of Tehran"),
    JAFARI(0, "Shia Ithna-Ashari, Leva Institute, Qum"),
    GULF(8, "Gulf Region"),
    KUWAIT(9,"Kuwait"),
    QATAR(10,"Qatar"),
    SINGAPORE(11,"Majlis Ugama Islam Singapura, Singapore"),
    FRANCE(12, "Union Organization Islamic de France"),
    TURKEY(13,"Diyanet İşleri Başkanlığı, Turkey"),
    RUSSIA(14, "Spiritual Administration of Muslims of Russia"),
    MOONSIGHTING(15,"Moonsighting Committee Worldwide (Moonsighting.com)");

    private int id;
    private String name;
}
