package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CameraDome48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CameraDome48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 7.25f)
            curveTo(4f, 5.455f, 5.455f, 4f, 7.25f, 4f)
            horizontalLineToRelative(33.5f)
            curveTo(42.545f, 4f, 44f, 5.455f, 44f, 7.25f)
            reflectiveCurveToRelative(-1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 10.5f, 4f, 9.045f, 4f, 7.25f)
            close()
            moveTo(24f, 18.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveToRelative(0f, 2.5f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(18f, -8f)
            horizontalLineTo(6f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 9.941f, 8.059f, 18f, 18f, 18f)
            reflectiveCurveToRelative(18f, -8.059f, 18f, -18f)
            verticalLineTo(13f)
            close()
            moveTo(13f, 27f)
            curveToRelative(0f, -6.075f, 4.925f, -11f, 11f, -11f)
            reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
            reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
            reflectiveCurveToRelative(-11f, -4.925f, -11f, -11f)
            close()
        }
    }.build()
}
