package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.SearchVisual24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.SearchVisual24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0152387f to Color(0xFF3DCBFF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(1.21032f, 0.325396f),
                end = Offset(16.8929f, 25.6587f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.5f, 4f)
            curveTo(4.224f, 4f, 4f, 4.224f, 4f, 4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(2f, 8.552f, 2f, 8f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineTo(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveTo(8.552f, 4f, 8f, 4f)
            horizontalLineTo(4.5f)
            close()
            moveTo(15f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.5f)
            curveTo(20.88f, 2f, 22f, 3.12f, 22f, 4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(4.5f)
            curveTo(20f, 4.224f, 19.776f, 4f, 19.5f, 4f)
            horizontalLineTo(16f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveTo(3f, 15f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(4f, 19.776f, 4.224f, 20f, 4.5f, 20f)
            horizontalLineTo(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 22f, 2f, 20.88f, 2f, 19.5f)
            verticalLineTo(16f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(18f, 0f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(16f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(16f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(8.98438f, 8.4375f),
                radius = 7.35745f
            )
        ) {
            moveTo(12f, 15f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
            moveTo(7.5f, 8.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(8.19f, 6.25f, 7.5f, 6.25f)
            reflectiveCurveTo(6.25f, 6.81f, 6.25f, 7.5f)
            reflectiveCurveTo(6.81f, 8.75f, 7.5f, 8.75f)
            close()
        }
    }.build()
}
