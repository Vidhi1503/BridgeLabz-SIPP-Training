class PetrolPump {
    int petrol, dist;
    PetrolPump(int p, int d) { petrol = p; dist = d; }
}
class circular {
    static int finds(PetrolPump[] arr) {
        int start = 0, bal = 0, deficit = 0;
        for (int i = 0; i < arr.length; i++) {
            bal += arr[i].petrol - arr[i].dist;
            if (bal < 0) {
                start = i + 1;
                deficit += bal;
                bal = 0;
            }
        }
        return (bal + deficit >= 0) ? start : -1;
    }
}
