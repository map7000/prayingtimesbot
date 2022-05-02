package ru.mfilatov.prayingtimesbot.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    @NonNull
    Double latitude;
    @NonNull
    Double longitude;
    @NonNull
    Integer method;
}
