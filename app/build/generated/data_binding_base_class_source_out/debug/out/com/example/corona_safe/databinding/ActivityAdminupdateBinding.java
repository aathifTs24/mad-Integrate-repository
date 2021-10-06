// Generated by view binder compiler. Do not edit!
package com.example.corona_safe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.corona_safe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminupdateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView adminTextUP;

  @NonNull
  public final ImageView btnHomeUP;

  @NonNull
  public final ImageButton btnSearchUP;

  @NonNull
  public final Button btndeleteUP;

  @NonNull
  public final Button btnupdateUP;

  @NonNull
  public final EditText editEmailUP;

  @NonNull
  public final EditText editNICUP;

  @NonNull
  public final EditText editUserUP;

  @NonNull
  public final EditText editVacSTUP;

  @NonNull
  public final EditText editVaccUP;

  @NonNull
  public final ImageView imageView2UP;

  @NonNull
  public final TextView txtEmailUP;

  @NonNull
  public final TextView txtNICUP;

  @NonNull
  public final TextView txtUserUP;

  @NonNull
  public final TextView txtVacSTUP;

  @NonNull
  public final TextView txtVaccUP;

  private ActivityAdminupdateBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView adminTextUP, @NonNull ImageView btnHomeUP, @NonNull ImageButton btnSearchUP,
      @NonNull Button btndeleteUP, @NonNull Button btnupdateUP, @NonNull EditText editEmailUP,
      @NonNull EditText editNICUP, @NonNull EditText editUserUP, @NonNull EditText editVacSTUP,
      @NonNull EditText editVaccUP, @NonNull ImageView imageView2UP, @NonNull TextView txtEmailUP,
      @NonNull TextView txtNICUP, @NonNull TextView txtUserUP, @NonNull TextView txtVacSTUP,
      @NonNull TextView txtVaccUP) {
    this.rootView = rootView;
    this.adminTextUP = adminTextUP;
    this.btnHomeUP = btnHomeUP;
    this.btnSearchUP = btnSearchUP;
    this.btndeleteUP = btndeleteUP;
    this.btnupdateUP = btnupdateUP;
    this.editEmailUP = editEmailUP;
    this.editNICUP = editNICUP;
    this.editUserUP = editUserUP;
    this.editVacSTUP = editVacSTUP;
    this.editVaccUP = editVaccUP;
    this.imageView2UP = imageView2UP;
    this.txtEmailUP = txtEmailUP;
    this.txtNICUP = txtNICUP;
    this.txtUserUP = txtUserUP;
    this.txtVacSTUP = txtVacSTUP;
    this.txtVaccUP = txtVaccUP;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminupdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminupdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adminupdate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminupdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adminTextUP;
      TextView adminTextUP = rootView.findViewById(id);
      if (adminTextUP == null) {
        break missingId;
      }

      id = R.id.btnHomeUP;
      ImageView btnHomeUP = rootView.findViewById(id);
      if (btnHomeUP == null) {
        break missingId;
      }

      id = R.id.btnSearchUP;
      ImageButton btnSearchUP = rootView.findViewById(id);
      if (btnSearchUP == null) {
        break missingId;
      }

      id = R.id.btndeleteUP;
      Button btndeleteUP = rootView.findViewById(id);
      if (btndeleteUP == null) {
        break missingId;
      }

      id = R.id.btnupdateUP;
      Button btnupdateUP = rootView.findViewById(id);
      if (btnupdateUP == null) {
        break missingId;
      }

      id = R.id.editEmailUP;
      EditText editEmailUP = rootView.findViewById(id);
      if (editEmailUP == null) {
        break missingId;
      }

      id = R.id.editNICUP;
      EditText editNICUP = rootView.findViewById(id);
      if (editNICUP == null) {
        break missingId;
      }

      id = R.id.editUserUP;
      EditText editUserUP = rootView.findViewById(id);
      if (editUserUP == null) {
        break missingId;
      }

      id = R.id.editVacSTUP;
      EditText editVacSTUP = rootView.findViewById(id);
      if (editVacSTUP == null) {
        break missingId;
      }

      id = R.id.editVaccUP;
      EditText editVaccUP = rootView.findViewById(id);
      if (editVaccUP == null) {
        break missingId;
      }

      id = R.id.imageView2UP;
      ImageView imageView2UP = rootView.findViewById(id);
      if (imageView2UP == null) {
        break missingId;
      }

      id = R.id.txtEmailUP;
      TextView txtEmailUP = rootView.findViewById(id);
      if (txtEmailUP == null) {
        break missingId;
      }

      id = R.id.txtNICUP;
      TextView txtNICUP = rootView.findViewById(id);
      if (txtNICUP == null) {
        break missingId;
      }

      id = R.id.txtUserUP;
      TextView txtUserUP = rootView.findViewById(id);
      if (txtUserUP == null) {
        break missingId;
      }

      id = R.id.txtVacSTUP;
      TextView txtVacSTUP = rootView.findViewById(id);
      if (txtVacSTUP == null) {
        break missingId;
      }

      id = R.id.txtVaccUP;
      TextView txtVaccUP = rootView.findViewById(id);
      if (txtVaccUP == null) {
        break missingId;
      }

      return new ActivityAdminupdateBinding((ConstraintLayout) rootView, adminTextUP, btnHomeUP,
          btnSearchUP, btndeleteUP, btnupdateUP, editEmailUP, editNICUP, editUserUP, editVacSTUP,
          editVaccUP, imageView2UP, txtEmailUP, txtNICUP, txtUserUP, txtVacSTUP, txtVaccUP);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
