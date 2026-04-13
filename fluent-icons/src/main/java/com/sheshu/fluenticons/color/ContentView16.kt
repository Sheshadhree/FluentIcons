package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContentView16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContentView16",
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
                start = Offset(6.28571f, 2f),
                end = Offset(10.8832f, 13.3531f)
            )
        ) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4f, 4f),
                end = Offset(13.609f, 7.26581f)
            )
        ) {
            moveTo(4f, 11.5f)
            curveTo(4f, 11.224f, 4.224f, 11f, 4.5f, 11f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 11f, 8f, 11.224f, 8f, 11.5f)
            reflectiveCurveTo(7.776f, 12f, 7.5f, 12f)
            horizontalLineToRelative(-3f)
            curveTo(4.224f, 12f, 4f, 11.776f, 4f, 11.5f)
            close()
            moveTo(4.5f, 9f)
            curveTo(4.224f, 9f, 4f, 9.224f, 4f, 9.5f)
            reflectiveCurveTo(4.224f, 10f, 4.5f, 10f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 10f, 8f, 9.776f, 8f, 9.5f)
            reflectiveCurveTo(7.776f, 9f, 7.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(4f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveTo(4.448f, 8f, 4f, 7.552f, 4f, 7f)
            verticalLineTo(5f)
            close()
            moveToRelative(6f, 4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
