package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.BookContacts32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.BookContacts32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(17.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(26.776f, 30f, 26.5f, 30f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(14f)
            close()
            moveTo(9f, 3f)
            curveTo(7.343f, 3f, 6f, 4.343f, 6f, 6f)
            verticalLineToRelative(19f)
            horizontalLineToRelative(19f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(9f)
            close()
            moveToRelative(10.454f, 12f)
            curveToRelative(1.13f, 0f, 2.046f, 0.915f, 2.046f, 2.045f)
            verticalLineToRelative(0.205f)
            curveToRelative(0f, 1.868f, -1.571f, 3.75f, -5.5f, 3.75f)
            curveToRelative(-3.929f, 0f, -5.5f, -1.875f, -5.5f, -3.75f)
            verticalLineToRelative(-0.205f)
            curveToRelative(0f, -1.13f, 0.916f, -2.045f, 2.046f, -2.045f)
            horizontalLineToRelative(6.908f)
            close()
            moveTo(16f, 7.5f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            close()
        }
    }.build()
}
