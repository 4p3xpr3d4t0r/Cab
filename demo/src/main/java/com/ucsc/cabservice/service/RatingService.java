/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Rating;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface RatingService {

    public Rating addRating(Rating rating);

    public Rating updateRating(Rating rating);

    public String deleteRating(Rating rating);

    public List<Rating> getAllRatings();

    public Rating getRating(Long id);
}
