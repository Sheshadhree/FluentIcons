package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Library28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Library28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4.50904f, 3f),
                end = Offset(10.0513f, 31.6715f)
            )
        ) {
            moveTo(7.99f, 5f)
            curveToRelative(0f, -1.104f, -0.896f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveTo(2.897f, 3f, 2f, 3.896f, 2f, 5f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.104f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(1.99f)
            curveToRelative(1.104f, 0f, 2f, -0.896f, 2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(14.08f, 1.543f)
            lineToRelative(3.86f, 15.483f)
            curveToRelative(0.267f, 1.071f, -0.386f, 2.157f, -1.457f, 2.425f)
            lineTo(22.51f, 24.94f)
            curveToRelative(-1.07f, 0.267f, -2.157f, -0.385f, -2.424f, -1.457f)
            lineTo(16.226f, 8f)
            curveToRelative(-0.268f, -1.072f, 0.385f, -2.157f, 1.456f, -2.425f)
            lineToRelative(1.963f, -0.489f)
            curveToRelative(1.071f, -0.268f, 2.157f, 0.385f, 2.425f, 1.457f)
            close()
            moveTo(12.99f, 3f)
            curveToRelative(1.104f, 0f, 2f, 0.896f, 2f, 2f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.104f, -0.896f, 2f, -2f, 2f)
            horizontalLineTo(11f)
            curveToRelative(-1.104f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.104f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(1.99f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(16.866f, 2.26967f),
                end = Offset(24.8735f, 4.43141f)
            )
        ) {
            moveTo(2f, 7f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            horizontalLineTo(2f)
            verticalLineTo(7f)
            close()
            moveToRelative(7f, 0f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            horizontalLineTo(9f)
            verticalLineTo(7f)
            close()
            moveToRelative(7.866f, 3.567f)
            lineToRelative(5.815f, -1.575f)
            lineToRelative(0.486f, 1.953f)
            lineToRelative(-5.817f, 1.565f)
            lineToRelative(-0.484f, -1.943f)
            close()
        }
    }.build()
}
