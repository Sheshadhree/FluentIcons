package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.NumberSymbolSquare32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.NumberSymbolSquare32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.92857f, 7.875f),
                end = Offset(24.3571f, 24.125f)
            )
        ) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0281195f to Color(0xFFE67EEA),
                    0.43755f to Color(0xFFAD64D7),
                    1f to Color(0xFF794DC5)
                ),
                start = Offset(9.33936f, 3f),
                end = Offset(23.598f, 29f)
            )
        ) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(12.3194f, 9.53834f),
                end = Offset(22.9325f, 27.8527f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.704f, 9.021f)
            curveToRelative(0.54f, 0.113f, 0.888f, 0.642f, 0.775f, 1.183f)
            lineTo(15.105f, 12f)
            horizontalLineToRelative(3.457f)
            lineToRelative(0.459f, -2.204f)
            curveToRelative(0.113f, -0.54f, 0.642f, -0.888f, 1.183f, -0.775f)
            curveToRelative(0.54f, 0.113f, 0.888f, 0.642f, 0.775f, 1.183f)
            lineTo(20.605f, 12f)
            horizontalLineTo(22f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1.812f)
            lineToRelative(-0.833f, 4f)
            horizontalLineTo(21f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-2.062f)
            lineToRelative(-0.459f, 2.204f)
            curveToRelative(-0.113f, 0.54f, -0.642f, 0.888f, -1.183f, 0.775f)
            curveToRelative(-0.54f, -0.113f, -0.888f, -0.642f, -0.775f, -1.183f)
            lineTo(16.895f, 20f)
            horizontalLineToRelative(-3.457f)
            lineToRelative(-0.459f, 2.204f)
            curveToRelative(-0.113f, 0.54f, -0.642f, 0.888f, -1.183f, 0.775f)
            curveToRelative(-0.54f, -0.113f, -0.888f, -0.642f, -0.775f, -1.183f)
            lineTo(11.395f, 20f)
            horizontalLineTo(10f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.812f)
            lineToRelative(0.833f, -4f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2.062f)
            lineToRelative(0.459f, -2.204f)
            curveToRelative(0.113f, -0.54f, 0.642f, -0.888f, 1.183f, -0.775f)
            close()
            moveTo(14.688f, 14f)
            lineToRelative(-0.833f, 4f)
            horizontalLineToRelative(3.457f)
            lineToRelative(0.833f, -4f)
            horizontalLineToRelative(-3.457f)
            close()
        }
    }.build()
}
