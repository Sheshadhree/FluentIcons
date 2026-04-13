package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookContacts32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookContacts32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 30f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            horizontalLineToRelative(18.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(9f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            verticalLineToRelative(20f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            close()
            moveToRelative(10f, -19.5f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(2.5f, 6.75f)
            curveToRelative(0f, 1.868f, -1.571f, 3.75f, -5.5f, 3.75f)
            curveToRelative(-3.929f, 0f, -5.5f, -1.875f, -5.5f, -3.75f)
            verticalLineToRelative(-0.205f)
            curveToRelative(0f, -1.13f, 0.916f, -2.045f, 2.046f, -2.045f)
            horizontalLineToRelative(6.909f)
            curveToRelative(1.13f, 0f, 2.045f, 0.915f, 2.045f, 2.045f)
            verticalLineToRelative(0.205f)
            close()
        }
    }.build()
}
