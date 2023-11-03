package com.ruvindi.aad.cloud_gateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {
    public static final List<String> WHITE_LIST = List.of(
            "/authenticationServer/auth/token",
            "/nextTravelPVTLtdUserService/api/v1/user/saveUser",
            "/nextTravelPVTLtdHotelService/api/v1/Hotel/getAllHotelsByPackageCategory",
            "/nextTravelPVTLtdHotelService/api/v1/Hotel/getAllHotelsByStarRateAndLocation",
            "/nextTravelPVTLtdTravelPackage/api/v1/Package/getPackageNameList",
            "/nextTravelPVTLtdVehicleService/api/v1/Vehicle/getAllVehiclesByCategory",
            "/nextTravelPVTLtdVehicleService/api/v1/Vehicle/getVehicleRegistrationNumbers",
            "/nextTravelPVTLtdUserService/api/v1/user/getLastId",
            "/eureka"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> WHITE_LIST
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));
}
