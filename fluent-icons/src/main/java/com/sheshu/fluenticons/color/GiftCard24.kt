package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.GiftCard24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.GiftCard24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFCECECE))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-8.5f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBB45EA),
                    0.468144f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(2f, -0.6875f),
                end = Offset(14.4103f, 24.3659f)
            )
        ) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-8.5f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.986f, 10f)
            lineTo(8f, 3.998f)
            lineToRelative(1.5f, 0.004f)
            lineTo(9.486f, 10f)
            horizontalLineTo(22f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(9.482f)
            lineToRelative(-0.017f, 7.502f)
            lineToRelative(-1.5f, -0.004f)
            lineToRelative(0.017f, -7.498f)
            horizontalLineTo(2f)
            verticalLineTo(10f)
            horizontalLineToRelative(5.986f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    0.378049f to Color(0xFFFFCD0F)
                ),
                center = Offset(9.5f, 11.5f),
                radius = 25.625f
            )
        ) {
            moveTo(7.986f, 10f)
            lineTo(8f, 3.998f)
            lineToRelative(1.5f, 0.004f)
            lineTo(9.486f, 10f)
            horizontalLineTo(22f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(9.482f)
            lineToRelative(-0.017f, 7.502f)
            lineToRelative(-1.5f, -0.004f)
            lineToRelative(0.017f, -7.498f)
            horizontalLineTo(2f)
            verticalLineTo(10f)
            horizontalLineToRelative(5.986f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF515151)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.94f, 11.5f)
            curveTo(5.587f, 11.466f, 4.5f, 10.36f, 4.5f, 9f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(0.681f, 0f, 1.3f, 0.273f, 1.75f, 0.715f)
            curveTo(9.2f, 6.773f, 9.819f, 6.5f, 10.5f, 6.5f)
            curveTo(11.88f, 6.5f, 13f, 7.62f, 13f, 9f)
            curveToRelative(0f, 1.36f, -1.087f, 2.467f, -2.44f, 2.5f)
            lineToRelative(1.72f, 1.72f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.47f, -2.47f)
            lineToRelative(-2.47f, 2.47f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.72f, -1.72f)
            close()
            moveTo(7f, 8f)
            curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(3.5f, 2f)
            horizontalLineToRelative(-1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    0.80352f to Color(0xFFFFCD0F)
                ),
                start = Offset(9.03333f, -16.9285f),
                end = Offset(8.45711f, 23.0712f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.94f, 11.5f)
            curveTo(5.587f, 11.466f, 4.5f, 10.36f, 4.5f, 9f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(0.681f, 0f, 1.3f, 0.273f, 1.75f, 0.715f)
            curveTo(9.2f, 6.773f, 9.819f, 6.5f, 10.5f, 6.5f)
            curveTo(11.88f, 6.5f, 13f, 7.62f, 13f, 9f)
            curveToRelative(0f, 1.36f, -1.087f, 2.467f, -2.44f, 2.5f)
            lineToRelative(1.72f, 1.72f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.47f, -2.47f)
            lineToRelative(-2.47f, 2.47f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.72f, -1.72f)
            close()
            moveTo(7f, 8f)
            curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(3.5f, 2f)
            horizontalLineToRelative(-1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
