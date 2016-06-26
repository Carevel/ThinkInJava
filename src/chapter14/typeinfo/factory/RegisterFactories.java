package chapter14.typeinfo.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Changjiang on 2016/6/26.
 */
class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new GabinAirFiler.Factory());
    }
    private static Random rand =new Random(47);
    public static Part CreateRandom(){
        int n=rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory implements chapter14.typeinfo.factory.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class GabinAirFiler extends Filter {
    public static class Factory implements chapter14.typeinfo.factory.Factory<GabinAirFiler> {
        @Override
        public GabinAirFiler create() {
            return new GabinAirFiler();
        }
    }
}

public class RegisterFactories {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(Part.CreateRandom());
        }
    }
}
