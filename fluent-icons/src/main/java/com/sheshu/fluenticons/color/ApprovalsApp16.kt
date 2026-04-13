package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ApprovalsApp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ApprovalsApp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(1.55371f, 1.23085f),
                end = Offset(5.94052f, 17.4221f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.571f, 0.236f)
            curveToRelative(-0.314f, -0.315f, -0.824f, -0.315f, -1.14f, 0f)
            curveToRelative(-0.314f, 0.315f, -0.314f, 0.825f, 0f, 1.14f)
            lineToRelative(0.73f, 0.728f)
            horizontalLineTo(8f)
            curveToRelative(-3.56f, 0f, -6.447f, 2.887f, -6.447f, 6.448f)
            curveTo(1.554f, 12.113f, 4.44f, 15f, 8.002f, 15f)
            curveToRelative(3.56f, 0f, 6.448f, -2.887f, 6.448f, -6.448f)
            curveToRelative(0f, -0.445f, -0.361f, -0.806f, -0.806f, -0.806f)
            curveToRelative(-0.445f, 0f, -0.806f, 0.361f, -0.806f, 0.806f)
            curveToRelative(0f, 2.671f, -2.165f, 4.837f, -4.836f, 4.837f)
            curveToRelative(-2.671f, 0f, -4.837f, -2.166f, -4.837f, -4.837f)
            reflectiveCurveToRelative(2.166f, -4.836f, 4.837f, -4.836f)
            horizontalLineTo(8.25f)
            lineTo(7.432f, 4.533f)
            curveToRelative(-0.315f, 0.315f, -0.315f, 0.825f, 0f, 1.14f)
            curveToRelative(0.314f, 0.314f, 0.825f, 0.314f, 1.14f, 0f)
            lineToRelative(2.148f, -2.149f)
            curveToRelative(0.315f, -0.315f, 0.315f, -0.825f, 0f, -1.14f)
            lineTo(8.571f, 0.237f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(10.891f, 6.55505f),
                end = Offset(4.99858f, 9.4843f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.61f, 5.812f)
            curveToRelative(0.315f, 0.314f, 0.315f, 0.824f, 0f, 1.14f)
            lineToRelative(-3.472f, 3.471f)
            curveToRelative(-0.315f, 0.315f, -0.825f, 0.315f, -1.14f, 0f)
            lineTo(5.696f, 9.121f)
            curveToRelative(-0.314f, -0.314f, -0.314f, -0.825f, 0f, -1.14f)
            curveToRelative(0.315f, -0.314f, 0.825f, -0.314f, 1.14f, 0f)
            lineToRelative(0.732f, 0.733f)
            lineToRelative(2.902f, -2.902f)
            curveToRelative(0.315f, -0.315f, 0.825f, -0.315f, 1.14f, 0f)
            close()
        }
    }.build()
}
