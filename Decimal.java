package com.duofriend.shops.common.util;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.NumberUtil;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.Optional;

public class Decimal {

    private Decimal(BigDecimal value) {
        this.value = value;
    }

    private BigDecimal value;

    private static final int HALF_UP = BigDecimal.ROUND_HALF_UP;

    private static final int UP = BigDecimal.ROUND_UP;

    private static final int DOWN = BigDecimal.ROUND_DOWN;

    public static final BigDecimal ZERO = BigDecimal.ZERO;

    public static final BigDecimal ONE = BigDecimal.ONE;

    public static final BigDecimal TEN = BigDecimal.TEN;

    public static Decimal of(BigDecimal value) {
        return new Decimal(Optional.ofNullable(value).orElse(ZERO));
    }

    public static Decimal of(String value) {
        Assert.isTrue(NumberUtil.isNumber(value), "非法字符");
        return new Decimal(new BigDecimal(value));
    }

    public static Decimal of(Double value) {
        return new Decimal(Optional.ofNullable(value).map(Object::toString).map(BigDecimal::new).orElse(ZERO));
    }

    public static Decimal of(Float value) {
        return new Decimal(Optional.ofNullable(value).map(Object::toString).map(BigDecimal::new).orElse(ZERO));
    }

    public static Decimal of(Integer value) {
        return new Decimal(Optional.ofNullable(value).map(Object::toString).map(BigDecimal::new).orElse(ZERO));
    }

    public Decimal add(@NonNull BigDecimal var) {
        this.value = this.value.add(var);
        return this;
    }

    public Decimal add(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.add(new BigDecimal(var));
    }

    public Decimal add(@NonNull Double var) {
        return this.add(new BigDecimal(var.toString()));
    }

    public Decimal add(@NonNull Float var) {
        return this.add(new BigDecimal(var.toString()));
    }

    public Decimal add(@NonNull Integer var) {
        return this.add(new BigDecimal(var.toString()));
    }

    public Decimal subtract(@NonNull BigDecimal var) {
        this.value = this.value.subtract(var);
        return this;
    }

    public Decimal subtract(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.subtract(new BigDecimal(var));
    }

    public Decimal subtract(@NonNull Double var) {
        return this.subtract(new BigDecimal(var.toString()));
    }

    public Decimal subtract(@NonNull Float var) {
        return this.subtract(new BigDecimal(var.toString()));
    }

    public Decimal subtract(@NonNull Integer var) {
        return this.subtract(new BigDecimal(var.toString()));
    }

    public Decimal multiply(@NonNull BigDecimal var) {
        this.value = this.value.multiply(var);
        return this;
    }

    public Decimal multiply(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.multiply(new BigDecimal(var));
    }

    public Decimal multiply(@NonNull Double var) {
        return this.multiply(new BigDecimal(var.toString()));
    }

    public Decimal multiply(@NonNull Float var) {
        return this.multiply(new BigDecimal(var.toString()));
    }

    public Decimal multiply(@NonNull Integer var) {
        return this.multiply(new BigDecimal(var.toString()));
    }

    public Decimal divide(@NonNull BigDecimal var, int scale, int round) {
        this.value = this.value.divide(var, scale, round);
        return this;
    }

    public Decimal divide(String var, int scale, int round) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.divide(new BigDecimal(var), scale, round);
    }

    public Decimal divide(@NonNull Double var, int scale, int round) {
        return this.divide(new BigDecimal(var.toString()), scale, round);
    }

    public Decimal divide(@NonNull Float var, int scale, int round) {
        return this.divide(new BigDecimal(var.toString()), scale, round);
    }

    public Decimal divide(@NonNull Integer var, int scale, int round) {
        return this.divide(new BigDecimal(var.toString()), scale, round);
    }

    public boolean lt(@NonNull BigDecimal var) {
        return this.value.compareTo(var) < 0;
    }

    public boolean lt(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.lt(new BigDecimal(var));
    }

    public boolean lt(@NonNull Double var) {
        return this.lt(new BigDecimal(var.toString()));
    }

    public boolean lt(@NonNull Float var) {
        return this.lt(new BigDecimal(var.toString()));
    }

    public boolean lt(@NonNull Integer var) {
        return this.lt(new BigDecimal(var.toString()));
    }

    public boolean le(@NonNull BigDecimal var) {
        return this.value.compareTo(var) <= 0;
    }

    public boolean le(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.le(new BigDecimal(var));
    }

    public boolean le(@NonNull Double var) {
        return this.le(new BigDecimal(var.toString()));
    }

    public boolean le(@NonNull Float var) {
        return this.le(new BigDecimal(var.toString()));
    }

    public boolean le(@NonNull Integer var) {
        return this.le(new BigDecimal(var.toString()));
    }

    public boolean eq(@NonNull BigDecimal var) {
        return this.value.compareTo(var) == 0;
    }

    public boolean eq(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.eq(new BigDecimal(var));
    }

    public boolean eq(@NonNull Double var) {
        return this.eq(new BigDecimal(var.toString()));
    }

    public boolean eq(@NonNull Float var) {
        return this.eq(new BigDecimal(var.toString()));
    }

    public boolean eq(@NonNull Integer var) {
        return this.eq(new BigDecimal(var.toString()));
    }

    public boolean nq(@NonNull BigDecimal var) {
        return this.value.compareTo(var) != 0;
    }

    public boolean nq(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.nq(new BigDecimal(var));
    }

    public boolean nq(@NonNull Double var) {
        return this.nq(new BigDecimal(var.toString()));
    }

    public boolean nq(@NonNull Float var) {
        return this.nq(new BigDecimal(var.toString()));
    }

    public boolean nq(@NonNull Integer var) {
        return this.nq(new BigDecimal(var.toString()));
    }

    public boolean gt(@NonNull BigDecimal var) {
        return this.value.compareTo(var) > 0;
    }

    public boolean gt(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.gt(new BigDecimal(var));
    }

    public boolean gt(@NonNull Double var) {
        return this.gt(new BigDecimal(var.toString()));
    }

    public boolean gt(@NonNull Float var) {
        return this.gt(new BigDecimal(var.toString()));
    }

    public boolean gt(@NonNull Integer var) {
        return this.gt(new BigDecimal(var.toString()));
    }

    public boolean ge(@NonNull BigDecimal var) {
        return this.value.compareTo(var) >= 0;
    }

    public boolean ge(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.ge(new BigDecimal(var));
    }

    public boolean ge(@NonNull Double var) {
        return this.ge(new BigDecimal(var.toString()));
    }

    public boolean ge(@NonNull Float var) {
        return this.ge(new BigDecimal(var.toString()));
    }

    public boolean ge(@NonNull Integer var) {
        return this.ge(new BigDecimal(var.toString()));
    }

    public Decimal difference(@NonNull BigDecimal var) {
        this.value = this.ge(var) ? this.value.subtract(var) : var.subtract(this.value);
        return this;
    }

    public Decimal difference(String var) {
        Assert.isTrue(NumberUtil.isNumber(var), "非法字符");
        return this.difference(new BigDecimal(var));
    }

    public Decimal difference(@NonNull Double var) {
        return this.difference(new BigDecimal(var.toString()));
    }

    public Decimal difference(@NonNull Float var) {
        return this.difference(new BigDecimal(var.toString()));
    }

    public Decimal difference(@NonNull Integer var) {
        return this.difference(new BigDecimal(var.toString()));
    }

    public Decimal decimalOffset(@NonNull Integer offset) {
        this.value = this.value.multiply(BigDecimal.valueOf(Math.pow(10, offset)));
        return this;
    }

    public BigDecimal get() {
        return this.value;
    }

    public BigDecimal get(int scale) {
        return this.value.setScale(scale, HALF_UP);
    }

    public BigDecimal get(int scale, int round) {
        return this.value.setScale(scale, round);
    }

    @Override
    public String toString() {
        return this.value.stripTrailingZeros().toPlainString();
    }

    public String toString(int scale) {
        return this.value.setScale(scale, HALF_UP).toPlainString();
    }

    public String toString(int scale, int round) {
        return this.value.setScale(scale, round).toPlainString();
    }

    public Double toDouble() {
        return this.value.doubleValue();
    }

    public Double toDouble(int scale) {
        return this.value.setScale(scale, HALF_UP).doubleValue();
    }

    public Double toDouble(int scale, int round) {
        return this.value.setScale(scale, round).doubleValue();
    }

    public Float toFloat() {
        return this.value.floatValue();
    }

    public Float toFloat(int scale) {
        return this.value.setScale(scale, HALF_UP).floatValue();
    }

    public Float toFloat(int scale, int round) {
        return this.value.setScale(scale, round).floatValue();
    }

    public Integer toInt() {
        return this.value.intValue();
    }

    public Integer toInt(int scale) {
        return this.value.setScale(scale, HALF_UP).intValue();
    }

    public Integer toInt(int scale, int round) {
        return this.value.setScale(scale, round).intValue();
    }

}
