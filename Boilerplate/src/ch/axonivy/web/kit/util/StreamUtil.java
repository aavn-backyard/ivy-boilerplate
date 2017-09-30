/**
 * CollectionUtils.java
 * 
 * Copyright(c)2010 by Soreco AG, CH-8603 Schwerzenbach. http://www.soreco.ch All rights reserved.
 * 
 * This software is the confidential and proprietary information of Soreco AG. You shall not
 * disclose such confidential information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Soreco.
 *
 * @author vhkhang
 */
package ch.axonivy.web.kit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamUtil {

    public static <T> Stream<T> nullSafeStream(Collection<T> datasource) {
        return Optional.ofNullable(datasource).orElse(new ArrayList<T>()).stream();
    }

    public static <T> Optional<T> findFirst(Collection<T> datasource, Predicate<? super T> predicate) {
        return nullSafeStream(datasource).filter(predicate).findFirst();
    }
    
	public static <T> Stream<T> nullSafeStream(T[] datasource) {
        return Optional.ofNullable(datasource).map(Arrays::asList).orElse(new ArrayList<T>()).stream();
    }
}
