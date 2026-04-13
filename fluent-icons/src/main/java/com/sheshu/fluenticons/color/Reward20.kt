package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Reward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Reward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(17.0257f, 3.60502f),
                end = Offset(12.0721f, 8.94815f)
            )
        ) {
            moveTo(12.367f, 9.804f)
            lineToRelative(3.296f, -1.683f)
            curveToRelative(0.836f, -0.428f, 1.363f, -1.288f, 1.363f, -2.227f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.137f)
            lineTo(12f, 6.5f)
            lineToRelative(0.367f, 3.304f)
            close()
            moveTo(7.61f, 3f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 3f, 3f, 3.673f, 3f, 4.5f)
            verticalLineToRelative(1.395f)
            lineToRelative(0.007f, 0.187f)
            curveToRelative(0.065f, 0.865f, 0.575f, 1.64f, 1.356f, 2.04f)
            lineToRelative(3.27f, 1.67f)
            lineTo(8f, 6.5f)
            lineTo(7.61f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF76EB95),
                    1f to Color(0xFF1EC8B0)
                ),
                start = Offset(10f, 2f),
                end = Offset(12.7508f, 10.0613f)
            )
        ) {
            moveTo(7.5f, 9.723f)
            verticalLineTo(3f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(6.737f)
            lineToRelative(-1.025f, 0.524f)
            lineTo(10f, 11f)
            lineTo(7.5f, 9.723f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-8.625f, -14.5f),
                radius = 39.0722f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.5f, 13.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(11.933f, 17f, 10f, 17f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            close()
        }
    }.build()
}
