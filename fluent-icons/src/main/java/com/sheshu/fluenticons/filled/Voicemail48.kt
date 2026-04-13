package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Voicemail48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Voicemail48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 24f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveTo(32f, 20.5f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(8.25f, 8f)
            curveTo(5.903f, 8f, 4f, 9.903f, 4f, 12.25f)
            verticalLineToRelative(23.5f)
            curveTo(4f, 38.097f, 5.903f, 40f, 8.25f, 40f)
            horizontalLineToRelative(31.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineToRelative(-23.5f)
            curveTo(44f, 9.903f, 42.097f, 8f, 39.75f, 8f)
            horizontalLineTo(8.25f)
            close()
            moveToRelative(12.624f, 12.5f)
            curveTo(21.583f, 21.485f, 22f, 22.694f, 22f, 24f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            horizontalLineToRelative(16f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            curveToRelative(0f, -1.306f, 0.417f, -2.515f, 1.126f, -3.5f)
            horizontalLineToRelative(-6.252f)
            close()
        }
    }.build()
}
