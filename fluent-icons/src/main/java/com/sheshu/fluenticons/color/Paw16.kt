package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Paw16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Paw16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(5.37804f, 7.93055f),
                end = Offset(8.29425f, 14.5827f)
            )
        ) {
            moveTo(8f, 7f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            curveToRelative(0f, 1.298f, 1.212f, 2f, 2.285f, 2f)
            horizontalLineToRelative(5.43f)
            curveTo(11.788f, 14f, 13f, 13.298f, 13f, 12f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
            moveToRelative(0.5f, -3.125f)
            curveTo(8.5f, 2.938f, 9.138f, 2f, 10.125f, 2f)
            reflectiveCurveToRelative(1.625f, 0.938f, 1.625f, 1.875f)
            reflectiveCurveToRelative(-0.638f, 1.875f, -1.625f, 1.875f)
            reflectiveCurveTo(8.5f, 4.812f, 8.5f, 3.875f)
            close()
            moveTo(2.375f, 4.25f)
            curveToRelative(-0.987f, 0f, -1.625f, 0.938f, -1.625f, 1.875f)
            reflectiveCurveTo(1.388f, 8f, 2.375f, 8f)
            reflectiveCurveTo(4f, 7.062f, 4f, 6.125f)
            reflectiveCurveTo(3.362f, 4.25f, 2.375f, 4.25f)
            close()
            moveToRelative(11.25f, 0f)
            curveTo(12.638f, 4.25f, 12f, 5.188f, 12f, 6.125f)
            reflectiveCurveTo(12.638f, 8f, 13.625f, 8f)
            reflectiveCurveToRelative(1.625f, -0.938f, 1.625f, -1.875f)
            reflectiveCurveToRelative(-0.638f, -1.875f, -1.625f, -1.875f)
            close()
            moveTo(5.875f, 2f)
            curveTo(4.888f, 2f, 4.25f, 2.938f, 4.25f, 3.875f)
            reflectiveCurveTo(4.888f, 5.75f, 5.875f, 5.75f)
            reflectiveCurveTo(7.5f, 4.812f, 7.5f, 3.875f)
            reflectiveCurveTo(6.862f, 2f, 5.875f, 2f)
            close()
        }
    }.build()
}
