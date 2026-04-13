package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContactCard16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContactCard16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(6f, 3f),
                end = Offset(8.93946f, 13.1621f)
            )
        ) {
            moveTo(1f, 4.75f)
            curveTo(1f, 3.784f, 1.784f, 3f, 2.75f, 3f)
            horizontalLineToRelative(10.5f)
            curveTo(14.216f, 3f, 15f, 3.784f, 15f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 13f, 1f, 12.216f, 1f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.446512f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(10.1667f, 4.22807f),
                end = Offset(12.6333f, 18.5976f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(1f, 4.75f)
            curveTo(1f, 3.784f, 1.784f, 3f, 2.75f, 3f)
            horizontalLineToRelative(10.5f)
            curveTo(14.216f, 3f, 15f, 3.784f, 15f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 13f, 1f, 12.216f, 1f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(10.6364f, 5.53846f),
                end = Offset(12.6529f, 13.1991f)
            )
        ) {
            moveTo(9.5f, 6f)
            curveTo(9.224f, 6f, 9f, 6.224f, 9f, 6.5f)
            reflectiveCurveTo(9.224f, 7f, 9.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(12.776f, 7f, 13f, 6.776f, 13f, 6.5f)
            reflectiveCurveTo(12.776f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 3f)
            curveTo(9.224f, 9f, 9f, 9.224f, 9f, 9.5f)
            reflectiveCurveTo(9.224f, 10f, 9.5f, 10f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(3.858f, 8.392f)
            curveTo(3.384f, 8.392f, 3f, 8.776f, 3f, 9.25f)
            curveToRelative(0f, 0.767f, 0.522f, 1.435f, 1.265f, 1.62f)
            lineToRelative(0.053f, 0.014f)
            curveToRelative(0.62f, 0.155f, 1.267f, 0.155f, 1.886f, 0f)
            lineToRelative(0.054f, -0.013f)
            curveTo(7f, 10.685f, 7.523f, 10.017f, 7.523f, 9.25f)
            curveToRelative(0f, -0.475f, -0.385f, -0.859f, -0.858f, -0.859f)
            horizontalLineTo(3.858f)
            close()
            moveToRelative(1.403f, -0.678f)
            curveToRelative(0.75f, 0f, 1.357f, -0.608f, 1.357f, -1.357f)
            curveTo(6.618f, 5.607f, 6.011f, 5f, 5.261f, 5f)
            curveTo(4.512f, 5f, 3.904f, 5.607f, 3.904f, 6.357f)
            reflectiveCurveToRelative(0.608f, 1.357f, 1.357f, 1.357f)
            close()
        }
    }.build()
}
