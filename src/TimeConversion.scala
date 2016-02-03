object TimeConversion {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var time = sc.next();
        time = time.toUpperCase
        val idx = time.indexOfSlice("PM")
        if ( idx >= 0) {
            time = time.slice(0, idx)
            val hour = time.split(":").head.toInt
            if ( hour != 12)
                time = (hour + 12).toString + time.slice(2, time.length)
        }
        else {
            val idx1 = time.indexOfSlice("AM")
            time = time.slice(0, idx1)
            val hour = time.split(":").head.toInt
            if ( hour == 12)
                time = "00" + time.slice(2, time.length)
        }
            
            
       println(time)
    }
}
