package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatMore16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatMore16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(2.42857f, 4.25f),
                end = Offset(12.9045f, 22.111f)
            )
        ) {
            moveTo(8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            curveToRelative(0f, 1.04f, 0.265f, 2.019f, 0.73f, 2.872f)
            lineToRelative(-0.71f, 2.49f)
            curveToRelative(-0.052f, 0.179f, 0f, 0.37f, 0.134f, 0.5f)
            curveToRelative(0.134f, 0.127f, 0.328f, 0.171f, 0.504f, 0.112f)
            lineToRelative(2.338f, -0.779f)
            curveTo(5.88f, 13.707f, 6.906f, 14f, 8f, 14f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(6.34989f, 6.55267f),
                end = Offset(6.72787f, 9.80142f)
            )
        ) {
            moveTo(6f, 7f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 6.5f, 10f, 6.724f, 10f, 7f)
            reflectiveCurveTo(9.776f, 7.5f, 9.5f, 7.5f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 7.5f, 6f, 7.276f, 6f, 7f)
            close()
            moveToRelative(0.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 8.5f, 9f, 8.724f, 9f, 9f)
            reflectiveCurveTo(8.776f, 9.5f, 8.5f, 9.5f)
            horizontalLineToRelative(-2f)
            curveTo(6.224f, 9.5f, 6f, 9.276f, 6f, 9f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
