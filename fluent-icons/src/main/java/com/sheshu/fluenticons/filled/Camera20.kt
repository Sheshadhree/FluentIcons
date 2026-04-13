package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Camera20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Camera20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 10f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveTo(6.784f, 2.826f)
            curveTo(7.039f, 2.32f, 7.557f, 2f, 8.124f, 2f)
            horizontalLineToRelative(3.764f)
            curveToRelative(0.569f, 0f, 1.088f, 0.321f, 1.342f, 0.83f)
            lineTo(13.815f, 4f)
            horizontalLineToRelative(1.69f)
            curveToRelative(1.38f, 0f, 2.5f, 1.119f, 2.5f, 2.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.381f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1.69f)
            lineToRelative(0.589f, -1.174f)
            close()
            moveTo(10f, 6f)
            curveToRelative(-2.209f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.791f, 4f, 4f, 4f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
        }
    }.build()
}
