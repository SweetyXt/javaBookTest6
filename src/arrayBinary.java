public class arrayBinary {
    public static int bsearch(int array[],int value){
        boolean found=false;
        int high=array.length-1;
        int low=0;
        int cnt=0;
        int mid=(high+low)/2;
        System.out.println("looking for "+value);
        while(!found&&(high>=low)){
            System.out.println("low"+low+"mid"+mid+"high"+high);
            if(value==array[mid]){
                found=true;
            }else{
                if(value<array[mid]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
            mid=(high+low)/2;
            cnt++;
        }
        System.out.println("Steps"+cnt);
        return ((found)?mid:-1);
    }
    static public void main(String args[]){
        int a[]=new int[100];
        for(int i=0;i<a.length;i++){
            a[i]=i;
        }
        System.out.println("result"+bsearch(a,32));
        System.out.println("result"+bsearch(a,1));
        System.out.println("result"+bsearch(a,1031));
    }

}
