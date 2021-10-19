// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView itemImageView;

  @NonNull
  public final TextView textDogAge;

  @NonNull
  public final TextView textDogHobbies;

  @NonNull
  public final TextView textDogName;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView itemImageView, @NonNull TextView textDogAge,
      @NonNull TextView textDogHobbies, @NonNull TextView textDogName) {
    this.rootView = rootView;
    this.itemImageView = itemImageView;
    this.textDogAge = textDogAge;
    this.textDogHobbies = textDogHobbies;
    this.textDogName = textDogName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_image_view;
      ImageView itemImageView = rootView.findViewById(id);
      if (itemImageView == null) {
        break missingId;
      }

      id = R.id.text_dog_age;
      TextView textDogAge = rootView.findViewById(id);
      if (textDogAge == null) {
        break missingId;
      }

      id = R.id.text_dog_hobbies;
      TextView textDogHobbies = rootView.findViewById(id);
      if (textDogHobbies == null) {
        break missingId;
      }

      id = R.id.text_dog_name;
      TextView textDogName = rootView.findViewById(id);
      if (textDogName == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, itemImageView,
          textDogAge, textDogHobbies, textDogName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
