package ie.atu.productv4;



public class productDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
    public static product getProduct(String productCode) {

        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        product item = null;
        if (productCode.equalsIgnoreCase("rock")) {
            music myusic = new music();
            myusic.setCode(productCode);
            myusic.setDescription("linkin park new album");
            myusic.setPrice(57.50);
            myusic.setArtist("linkin park");
            myusic.setlabel("2pacom");
            item = myusic;
        } else if (productCode.equalsIgnoreCase("techno")) {
            music myusic = new music();
            myusic.setCode(productCode);
            myusic.setDescription("scooter new album");
            myusic.setPrice(57.50);
            myusic.setArtist("scooter");
            myusic.setlabel("2pacom");
            item = myusic;
        } else if (productCode.equalsIgnoreCase("rap")) {
            music myusic = new music();
            myusic.setCode(productCode);
            myusic.setDescription("2pac new album");
            myusic.setPrice(12.23);
            myusic.setArtist("2pac");
            myusic.setlabel("2pacom");
            item = myusic;
        }
        if (productCode.equalsIgnoreCase("sony")) {
            tv myTv = new tv();
            myTv.setCode(productCode);
            myTv.setDescription("sony black ");
            myTv.setPrice(57.50);
            myTv.setscreenSize("55inch");
            myTv.setManafacture("sony");

            item = myTv;
        } else if (productCode.equalsIgnoreCase("lg")) {
            tv myTv = new tv();
            myTv.setCode(productCode);
            myTv.setDescription("lg black");
            myTv.setPrice(57.50);
            myTv.setscreenSize("62inch");
            myTv.setManafacture("lg");
            item = myTv;
        } else if (productCode.equalsIgnoreCase("samsung")) {
            tv myTv = new tv();
            myTv.setCode(productCode);
            myTv.setDescription("samsung black");
            myTv.setPrice(54.50);
            myTv.setscreenSize("65inch");
            myTv.setManafacture("samsung");
            item = myTv;
        }

        return item ;

    }
}