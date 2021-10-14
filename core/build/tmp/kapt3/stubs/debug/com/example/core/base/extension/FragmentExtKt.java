package com.example.core.base.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"canNavigate", "", "Landroidx/fragment/app/Fragment;", "navigateSafe", "", "directions", "Landroidx/navigation/NavDirections;", "navOptions", "Landroidx/navigation/NavOptions;", "core_debug"})
public final class FragmentExtKt {
    
    /**
     * When trying to navigate to a destination that is not included in the current navigation graph
     * the app will crash:
     * java.lang.IllegalArgumentException: Navigation action/destination X cannot be found
     *
     * This happens when a (second) navigation request is triggered from a fragment that is no longer the
     * current
     * location (currentDestination) in the navController. In other words, when navigating from A to B, there is
     * a moment when:
     *    - Fragment A is still active and showing.
     *    - The navigation library already changed its current location,currentDestination, to Fragment B.
     *
     * Crash happens when a second request to navigate from fragment A comes in at exactly this moment (usually
     * due
     * to extremely fast clicking or multitouch), and it uses a destination that is not included in B’s graph.
     * More: https://medium.com/@ffvanderlaan/fixing-the-dreaded-is-unknown-to-this-navcontroller-68c4003824ce
     *
     * This method navigates only if this is safely possible; when this Fragment is still the current
     * destination.
     */
    public static final void navigateSafe(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$navigateSafe, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections directions, @org.jetbrains.annotations.Nullable()
    androidx.navigation.NavOptions navOptions) {
    }
    
    public static final boolean canNavigate(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$canNavigate) {
        return false;
    }
}