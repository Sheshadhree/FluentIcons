package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Poll32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Poll32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6D37CD),
                    1f to Color(0xFFEA71EF)
                ),
                start = Offset(18.4167f, 24.2333f),
                end = Offset(14.2216f, 2.81852f)
            )
        ) {
            moveTo(12f, 6.5f)
            curveTo(12f, 4.567f, 13.567f, 3f, 15.5f, 3f)
            reflectiveCurveTo(19f, 4.567f, 19f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(12f, 27.433f, 12f, 25.5f)
            verticalLineToRelative(-19f)
            close()
            moveToRelative(10f, 6f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(22f, 27.433f, 22f, 25.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(5.5f, 15f)
            curveTo(3.567f, 15f, 2f, 16.567f, 2f, 18.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 27.433f, 3.567f, 29f, 5.5f, 29f)
            reflectiveCurveTo(9f, 27.433f, 9f, 25.5f)
            verticalLineToRelative(-7f)
            curveTo(9f, 16.567f, 7.433f, 15f, 5.5f, 15f)
            close()
        }
    }.build()
}
