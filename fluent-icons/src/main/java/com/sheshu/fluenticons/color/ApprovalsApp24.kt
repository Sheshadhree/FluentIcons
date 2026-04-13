package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ApprovalsApp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ApprovalsApp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3.25f, 3.17471f),
                end = Offset(9.24661f, 25.2709f)
            )
        ) {
            moveTo(12.744f, 2.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(0.689f, 0.689f)
            curveToRelative(-4.845f, 0.01f, -8.769f, 3.94f, -8.769f, 8.787f)
            curveToRelative(0f, 4.853f, 3.934f, 8.787f, 8.787f, 8.787f)
            curveToRelative(4.853f, 0f, 8.787f, -3.934f, 8.787f, -8.787f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            curveToRelative(0f, 3.748f, -3.039f, 6.787f, -6.787f, 6.787f)
            curveToRelative(-3.748f, 0f, -6.787f, -3.039f, -6.787f, -6.787f)
            curveToRelative(0f, -3.742f, 3.029f, -6.777f, 6.769f, -6.787f)
            lineToRelative(-0.69f, 0.689f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.391f, 0.39f, 1.025f, 0.39f, 1.415f, 0f)
            lineToRelative(2.396f, -2.396f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-2.396f, -2.396f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(16.0242f, 10.4276f),
                end = Offset(7.89197f, 14.4703f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.937f, 9.48f)
            curveToRelative(0.39f, 0.391f, 0.39f, 1.025f, 0f, 1.415f)
            lineToRelative(-4.792f, 4.792f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineTo(8.934f, 13.89f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(1.09f, 1.09f)
            lineToRelative(4.085f, -4.085f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            close()
        }
    }.build()
}
