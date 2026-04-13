package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataBarVerticalAscending16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataBarVerticalAscending16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF16BBDA),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(13.6055f, -1.68601f),
                end = Offset(21.6626f, 2.07482f)
            )
        ) {
            moveTo(14f, 3.683f)
            curveTo(14f, 2.753f, 13.328f, 2f, 12.5f, 2f)
            reflectiveCurveTo(11f, 2.754f, 11f, 3.683f)
            verticalLineToRelative(8.634f)
            curveTo(11f, 13.247f, 11.672f, 14f, 12.5f, 14f)
            reflectiveCurveToRelative(1.5f, -0.754f, 1.5f, -1.683f)
            verticalLineTo(3.683f)
            close()
            moveTo(10.003f, 6.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-0.829f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(6f, 9.497f)
            curveToRelative(0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(3f, 8.668f, 3f, 9.497f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
