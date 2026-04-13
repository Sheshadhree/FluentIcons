package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Briefcase28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Briefcase28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(8.5421f, 3.25f),
                end = Offset(11.1839f, 11.2045f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.746f, 2.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(7f)
            horizontalLineTo(19f)
            lineToRelative(-5f, 3f)
            lineToRelative(-5f, -3f)
            lineToRelative(-0.004f, -0.002f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -1.243f, 1.008f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(5.5f)
            close()
            moveToRelative(-5.5f, 1.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(7f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(3.78571f, 15.0625f),
                end = Offset(9.72786f, 35.3248f)
            )
        ) {
            moveTo(3f, 13f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(7.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 24f, 3f, 22.321f, 3f, 20.25f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.336754f to Color(0xFF194694),
                    0.74691f to Color(0x00367AF2)
                ),
                center = Offset(14f, 13f),
                radius = 11f
            )
        ) {
            moveTo(3f, 13f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(7.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 24f, 3f, 22.321f, 3f, 20.25f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.551691f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(5.2f, 7.41511f),
                end = Offset(16.2578f, 19.722f)
            )
        ) {
            moveTo(3f, 10.75f)
            curveTo(3f, 8.679f, 4.679f, 7f, 6.75f, 7f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 7f, 25f, 8.679f, 25f, 10.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 17f, 3f, 15.993f, 3f, 14.75f)
            verticalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.843749f to Color(0xFF7CECFF)
                ),
                start = Offset(13.9922f, 13.5156f),
                end = Offset(13.9922f, 18.5f)
            )
        ) {
            moveTo(15.246f, 13.516f)
            horizontalLineToRelative(-2.508f)
            curveToRelative(-0.692f, 0f, -1.254f, 0.557f, -1.254f, 1.246f)
            verticalLineToRelative(2.492f)
            curveToRelative(0f, 0.688f, 0.562f, 1.246f, 1.254f, 1.246f)
            horizontalLineToRelative(2.508f)
            curveToRelative(0.693f, 0f, 1.254f, -0.558f, 1.254f, -1.246f)
            verticalLineToRelative(-2.492f)
            curveToRelative(0f, -0.689f, -0.561f, -1.246f, -1.254f, -1.246f)
            close()
        }
    }.build()
}
