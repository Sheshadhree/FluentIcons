package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Form28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Form28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(10.8571f, 3f),
                end = Offset(19.2859f, 23.814f)
            )
        ) {
            moveTo(6.75f, 3f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineToRelative(14.5f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(5.2f, 5.725f),
                end = Offset(24.614f, 9.28174f)
            )
        ) {
            moveTo(6f, 12.5f)
            curveTo(6f, 11.12f, 7.12f, 10f, 8.5f, 10f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(9.88f, 15f, 8.5f, 15f)
            reflectiveCurveTo(6f, 13.88f, 6f, 12.5f)
            close()
            moveTo(8.5f, 17f)
            curveTo(7.12f, 17f, 6f, 18.12f, 6f, 19.5f)
            reflectiveCurveTo(7.12f, 22f, 8.5f, 22f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(9.88f, 17f, 8.5f, 17f)
            close()
            moveToRelative(4.5f, -4.75f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(21.664f, 13f, 21.25f, 13f)
            horizontalLineToRelative(-7.5f)
            curveTo(13.336f, 13f, 13f, 12.664f, 13f, 12.25f)
            close()
            moveToRelative(0.75f, 6.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(13.336f, 20f, 13.75f, 20f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(6f, 7.25f)
            curveTo(6f, 6.836f, 6.336f, 6.5f, 6.75f, 6.5f)
            horizontalLineToRelative(14.5f)
            curveTo(21.664f, 6.5f, 22f, 6.836f, 22f, 7.25f)
            reflectiveCurveTo(21.664f, 8f, 21.25f, 8f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 8f, 6f, 7.664f, 6f, 7.25f)
            close()
        }
    }.build()
}
