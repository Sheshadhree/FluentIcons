package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Briefcase24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Briefcase24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(7.63695f, 2.63096f),
                end = Offset(9.95049f, 9.25272f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(6f)
            lineToRelative(-4f, 2.31f)
            lineTo(8f, 6f)
            verticalLineTo(4.25f)
            curveTo(8f, 3.007f, 9.007f, 2f, 10.25f, 2f)
            horizontalLineToRelative(3.5f)
            close()
            moveToRelative(-3.5f, 1.5f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineToRelative(5f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(3.64286f, 12.6875f),
                end = Offset(8.50461f, 29.2657f)
            )
        ) {
            moveTo(3f, 11f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(5.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 20f, 3f, 18.545f, 3f, 16.75f)
            verticalLineTo(11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.336754f to Color(0xFF194694),
                    0.74691f to Color(0x00367AF2)
                ),
                center = Offset(12f, 11f),
                radius = 9f
            )
        ) {
            moveTo(3f, 11f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(5.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 20f, 3f, 18.545f, 3f, 16.75f)
            verticalLineTo(11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.551691f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(4.8f, 6.33209f),
                end = Offset(13.6229f, 16.3748f)
            )
        ) {
            moveTo(3f, 9.25f)
            curveTo(3f, 7.455f, 4.455f, 6f, 6.25f, 6f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 6f, 21f, 7.455f, 21f, 9.25f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 14f, 3f, 13.216f, 3f, 12.25f)
            verticalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.843749f to Color(0xFF7CECFF)
                ),
                start = Offset(12f, 11f),
                end = Offset(12f, 15f)
            )
        ) {
            moveTo(13f, 11f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
