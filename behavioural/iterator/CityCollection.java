public class CityCollection {

    public Collection<String> collection;

    public CityCollection(){
        this.collection = new ArrayList<>();
    }

    public Iterator<String> getIterator(){
        return new CityCollectionIterator();
    }

    private class CityCollectionIterator {

        int index;

        public CityCollectionIterator(){
            index = 0;
        }

        public boolean hasNext(){
            return this.collections.size() > index+1;
        }

        public String next(){
            index++;
            return this.collections.get(index-1);
        }

    }


}