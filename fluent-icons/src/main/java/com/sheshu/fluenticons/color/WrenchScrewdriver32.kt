package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.WrenchScrewdriver32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.WrenchScrewdriver32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    0.853157f to Color(0xFF0067BF)
                ),
                start = Offset(25.8333f, 0.522522f),
                end = Offset(21.7619f, 26.0824f)
            )
        ) {
            moveTo(22f, 3f)
            curveToRelative(-0.409f, 0f, -0.777f, 0.249f, -0.928f, 0.629f)
            lineToRelative(-1f, 2.5f)
            curveToRelative(-0.096f, 0.238f, -0.096f, 0.504f, 0f, 0.742f)
            lineTo(21f, 9.193f)
            verticalLineTo(16f)
            horizontalLineToRelative(5f)
            verticalLineTo(9.193f)
            lineToRelative(0.928f, -2.322f)
            curveToRelative(0.096f, -0.238f, 0.096f, -0.504f, 0f, -0.742f)
            lineToRelative(-1f, -2.5f)
            curveTo(25.777f, 3.249f, 25.409f, 3f, 25f, 3f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-4f, 16.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            verticalLineToRelative(-4f)
            horizontalLineTo(18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(21.028f, 16.9682f),
                end = Offset(22.269f, 20.3845f)
            )
        ) {
            moveTo(28f, 16f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            horizontalLineTo(18f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            close()
            moveTo(8.577f, 3.525f)
            curveTo(8.842f, 3.712f, 9f, 4.017f, 9f, 4.341f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(4.341f)
            curveToRelative(0f, -0.324f, 0.158f, -0.629f, 0.423f, -0.816f)
            curveToRelative(0.265f, -0.188f, 0.604f, -0.235f, 0.91f, -0.126f)
            curveTo(15.051f, 4.359f, 17f, 6.95f, 17f, 10f)
            curveToRelative(0f, 2.794f, -1.636f, 5.203f, -4f, 6.326f)
            verticalLineTo(26f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-9.674f)
            curveTo(4.636f, 15.203f, 3f, 12.794f, 3f, 10f)
            curveToRelative(0f, -3.05f, 1.95f, -5.64f, 4.667f, -6.601f)
            curveToRelative(0.306f, -0.109f, 0.645f, -0.062f, 0.91f, 0.126f)
            close()
        }
    }.build()
}
