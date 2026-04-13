package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Briefcase20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Briefcase20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(6.72771f, 2.45f),
                end = Offset(8.31329f, 7.22235f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.25f, 2f)
            curveTo(12.216f, 2f, 13f, 2.784f, 13f, 3.75f)
            verticalLineTo(5f)
            lineToRelative(-3f, 1.5f)
            lineTo(7f, 5f)
            verticalLineTo(3.75f)
            curveTo(7f, 2.784f, 7.784f, 2f, 8.75f, 2f)
            horizontalLineToRelative(2.5f)
            close()
            moveToRelative(-2.5f, 1f)
            curveTo(8.336f, 3f, 8f, 3.336f, 8f, 3.75f)
            verticalLineTo(5f)
            horizontalLineToRelative(4f)
            verticalLineTo(3.75f)
            curveTo(12f, 3.336f, 11.664f, 3f, 11.25f, 3f)
            horizontalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(3.5f, 9.5f),
                end = Offset(8.32203f, 23.8874f)
            )
        ) {
            moveTo(3f, 8f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 16f, 3f, 14.88f, 3f, 13.5f)
            verticalLineTo(8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.2428f to Color(0xFF194694),
                    0.74691f to Color(0x00367AF2)
                ),
                center = Offset(10f, 8f),
                radius = 8f
            )
        ) {
            moveTo(3f, 8f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 16f, 3f, 14.88f, 3f, 13.5f)
            verticalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.551691f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(4.4f, 5.24907f),
                end = Offset(10.982f, 13.0185f)
            )
        ) {
            moveTo(3f, 7.5f)
            curveTo(3f, 6.12f, 4.12f, 5f, 5.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 5f, 17f, 6.12f, 17f, 7.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.672f, 11f, 3f, 10.328f, 3f, 9.5f)
            verticalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.843749f to Color(0xFF7CECFF)
                ),
                start = Offset(10.0006f, 9f),
                end = Offset(10.0006f, 11.0012f)
            )
        ) {
            moveTo(10.5f, 9f)
            horizontalLineToRelative(-1f)
            curveTo(9.224f, 9f, 9f, 9.224f, 9f, 9.5f)
            verticalLineToRelative(2.012f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.277f, 0f, 0.501f, -0.224f, 0.501f, -0.5f)
            verticalLineTo(9.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
