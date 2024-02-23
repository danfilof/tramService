package com.anfilofyev.routes;

import com.anfilofyev.stations.StationsEnum;
import com.anfilofyev.units.transportType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class RouteThree extends Route {

    /*List<StationsEnum> stationList = new ArrayList<>(EnumSet.of(StationsEnum.BirstfeldenHard, StationsEnum.Salinenstr, StationsEnum.Schulstr, StationsEnum.Baren, StationsEnum.Breite,
            StationsEnum.Waldenburgerstr, StationsEnum.StAlbanTor, StationsEnum.Aeschenplatz, StationsEnum.Bankverein, StationsEnum.Barfusserplatz, StationsEnum.MusikAkademie,
            StationsEnum.Universitat, StationsEnum.Spalentor, StationsEnum.Pilgerstr, StationsEnum.Burgfelderplatz, StationsEnum.Strassburgerallee, StationsEnum.FelixPlatterSpital,
            StationsEnum.Luzernerring, StationsEnum.WaldighoferStr, StationsEnum.Burgfelderhof, StationsEnum.SaintExupery, StationsEnum.PlaceMermoz, StationsEnum.Soleil,
            StationsEnum.SaintLouisGare));*/

    public RouteThree() {
        super(3, generateStationList(), StationsEnum.BirstfeldenHard, StationsEnum.SaintLouisGare);
    }


    public RouteThree(int startTime, int endTime, transportType type) {
        super(3, generateStationList(), StationsEnum.BirstfeldenHard, StationsEnum.SaintLouisGare, startTime, endTime, type);
    }

    public RouteThree(transportType type) {
        super(3, generateStationList(), StationsEnum.BirstfeldenHard, StationsEnum.SaintLouisGare, type);
    }

    private static List<StationsEnum> generateStationList() {
        return new ArrayList<>(EnumSet.of(StationsEnum.BirstfeldenHard, StationsEnum.Salinenstr, StationsEnum.Schulstr, StationsEnum.Baren, StationsEnum.Breite,
                StationsEnum.Waldenburgerstr, StationsEnum.StAlbanTor, StationsEnum.Aeschenplatz, StationsEnum.Bankverein, StationsEnum.Barfusserplatz, StationsEnum.MusikAkademie,
                StationsEnum.Universitat, StationsEnum.Spalentor, StationsEnum.Pilgerstr, StationsEnum.Burgfelderplatz, StationsEnum.Strassburgerallee, StationsEnum.FelixPlatterSpital,
                StationsEnum.Luzernerring, StationsEnum.WaldighoferStr, StationsEnum.Burgfelderhof, StationsEnum.SaintExupery, StationsEnum.PlaceMermoz, StationsEnum.Soleil,
                StationsEnum.SaintLouisGare));
    }

}
