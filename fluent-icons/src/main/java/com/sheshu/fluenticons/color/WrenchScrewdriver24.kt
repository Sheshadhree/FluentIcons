package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.WrenchScrewdriver24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.WrenchScrewdriver24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    0.853157f to Color(0xFF0067BF)
                ),
                start = Offset(19.1667f, -0.00103998f),
                end = Offset(15.4736f, 20.5021f)
            )
        ) {
            moveTo(16.75f, 2f)
            curveToRelative(-0.284f, 0f, -0.544f, 0.16f, -0.67f, 0.415f)
            lineToRelative(-1f, 2f)
            curveToRelative(-0.113f, 0.224f, -0.106f, 0.49f, 0.019f, 0.707f)
            lineTo(16f, 6.7f)
            verticalLineToRelative(5.8f)
            horizontalLineToRelative(3f)
            verticalLineTo(6.7f)
            lineToRelative(0.901f, -1.578f)
            curveToRelative(0.125f, -0.218f, 0.132f, -0.483f, 0.02f, -0.707f)
            lineToRelative(-1f, -2f)
            curveTo(18.794f, 2.16f, 18.534f, 2f, 18.25f, 2f)
            horizontalLineToRelative(-1.5f)
            close()
            moveTo(14f, 14.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(15.9269f, 12.7262f),
                end = Offset(16.9762f, 15.1772f)
            )
        ) {
            moveTo(20.25f, 12f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(15f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-2.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(5.5f)
            close()
            moveTo(8.829f, 2.212f)
            curveToRelative(0.205f, -0.14f, 0.466f, -0.168f, 0.697f, -0.077f)
            curveTo(11.56f, 2.942f, 13f, 4.927f, 13f, 7.25f)
            curveToRelative(0f, 2.124f, -1.204f, 3.965f, -2.964f, 4.882f)
            verticalLineToRelative(7.332f)
            curveTo(10.036f, 20.864f, 8.9f, 22f, 7.5f, 22f)
            curveToRelative(-1.4f, 0f, -2.536f, -1.136f, -2.536f, -2.536f)
            verticalLineToRelative(-7.332f)
            curveTo(3.204f, 11.215f, 2f, 9.373f, 2f, 7.25f)
            curveToRelative(0f, -2.323f, 1.44f, -4.308f, 3.473f, -5.115f)
            curveToRelative(0.231f, -0.091f, 0.493f, -0.062f, 0.698f, 0.077f)
            curveTo(6.377f, 2.352f, 6.5f, 2.584f, 6.5f, 2.832f)
            verticalLineTo(6.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(2.833f)
            curveToRelative(0f, -0.249f, 0.123f, -0.481f, 0.329f, -0.62f)
            close()
        }
    }.build()
}
