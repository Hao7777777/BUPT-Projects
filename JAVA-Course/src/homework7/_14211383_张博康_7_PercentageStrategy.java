package homework7;

/**
 * Created by Connor on 2016/12/26.
 */
public class _14211383_张博康_7_PercentageStrategy extends _14211383_张博康_7_IPricingStrategy {
    private double discountPercentage;

    public String getDiscount() { return String.valueOf(discountPercentage); }

    _14211383_张博康_7_PercentageStrategy(String id, String name, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getSubTotal(_14211383_张博康_7_SaleLineItem saleLineItem) {
        return saleLineItem.getCopies() * ( saleLineItem.getPrice() * (100 - discountPercentage) / 100);
    }
}
