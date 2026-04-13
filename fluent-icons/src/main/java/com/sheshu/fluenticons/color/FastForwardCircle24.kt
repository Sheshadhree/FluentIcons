package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.FastForwardCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.FastForwardCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(2.71429f, 5.75f),
                end = Offset(16.5167f, 20.0902f)
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.533f, 8.883f)
            curveToRelative(0f, -0.714f, 0.843f, -1.132f, 1.454f, -0.72f)
            lineToRelative(4.622f, 3.117f)
            curveToRelative(0.521f, 0.35f, 0.521f, 1.09f, 0f, 1.44f)
            lineToRelative(-4.622f, 3.117f)
            curveToRelative(-0.61f, 0.412f, -1.454f, -0.005f, -1.454f, -0.72f)
            verticalLineToRelative(-2.03f)
            lineToRelative(-4.08f, 2.75f)
            curveTo(7.844f, 16.25f, 7f, 15.832f, 7f, 15.117f)
            verticalLineTo(8.883f)
            curveToRelative(0f, -0.714f, 0.843f, -1.132f, 1.454f, -0.72f)
            lineToRelative(4.08f, 2.75f)
            verticalLineToRelative(-2.03f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(9.25f, 8.81605f),
                end = Offset(10.9569f, 17.8542f)
            )
        ) {
            moveTo(12.533f, 8.883f)
            curveToRelative(0f, -0.714f, 0.843f, -1.132f, 1.454f, -0.72f)
            lineToRelative(4.622f, 3.117f)
            curveToRelative(0.521f, 0.35f, 0.521f, 1.09f, 0f, 1.44f)
            lineToRelative(-4.622f, 3.117f)
            curveToRelative(-0.61f, 0.412f, -1.454f, -0.005f, -1.454f, -0.72f)
            verticalLineToRelative(-2.03f)
            lineToRelative(-4.08f, 2.75f)
            curveTo(7.844f, 16.25f, 7f, 15.832f, 7f, 15.117f)
            verticalLineTo(8.883f)
            curveToRelative(0f, -0.714f, 0.843f, -1.132f, 1.454f, -0.72f)
            lineToRelative(4.08f, 2.75f)
            verticalLineToRelative(-2.03f)
            close()
        }
    }.build()
}
