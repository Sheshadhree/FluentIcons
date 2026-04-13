package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.SearchVisual16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.SearchVisual16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0152387f to Color(0xFF3DCBFF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(0.447223f, -0.172223f),
                end = Offset(11.425f, 17.5611f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineTo(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(1f, 5.552f, 1f, 5f)
            verticalLineTo(3.5f)
            curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
            horizontalLineTo(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveTo(5.552f, 3f, 5f, 3f)
            horizontalLineTo(3.5f)
            close()
            moveTo(10f, 2f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.5f)
            curveTo(13.88f, 1f, 15f, 2.12f, 15f, 3.5f)
            verticalLineTo(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(3.5f)
            curveTo(13f, 3.224f, 12.776f, 3f, 12.5f, 3f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(-8f, 8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 12.776f, 3.224f, 13f, 3.5f, 13f)
            horizontalLineTo(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 15f, 1f, 13.88f, 1f, 12.5f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(12f, 0f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(6.21875f, 5.875f),
                radius = 4.62468f
            )
        ) {
            moveTo(8f, 10f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveTo(9.105f, 6f, 8f, 6f)
            reflectiveCurveTo(6f, 6.895f, 6f, 8f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(5.25f, 6f)
            curveTo(5.664f, 6f, 6f, 5.664f, 6f, 5.25f)
            reflectiveCurveTo(5.664f, 4.5f, 5.25f, 4.5f)
            reflectiveCurveTo(4.5f, 4.836f, 4.5f, 5.25f)
            reflectiveCurveTo(4.836f, 6f, 5.25f, 6f)
            close()
        }
    }.build()
}
