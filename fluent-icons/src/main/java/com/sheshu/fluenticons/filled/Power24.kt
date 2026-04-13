package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Power24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Power24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.205f, 4.843f)
            curveToRelative(0.5f, -0.233f, 1.096f, -0.016f, 1.329f, 0.485f)
            curveToRelative(0.233f, 0.5f, 0.016f, 1.095f, -0.485f, 1.328f)
            curveTo(6.6f, 7.796f, 5f, 10.255f, 5f, 13.003f)
            curveTo(5f, 16.867f, 8.134f, 20f, 12f, 20f)
            reflectiveCurveToRelative(7f, -3.133f, 7f, -6.997f)
            curveToRelative(0f, -2.743f, -1.593f, -5.197f, -4.035f, -6.34f)
            curveToRelative(-0.5f, -0.234f, -0.716f, -0.83f, -0.481f, -1.33f)
            curveToRelative(0.234f, -0.5f, 0.83f, -0.715f, 1.33f, -0.481f)
            curveTo(18.951f, 6.322f, 21f, 9.477f, 21f, 13.003f)
            curveTo(21f, 17.972f, 16.97f, 22f, 12f, 22f)
            reflectiveCurveToRelative(-9f, -4.028f, -9f, -8.997f)
            curveToRelative(0f, -3.533f, 2.057f, -6.695f, 5.205f, -8.16f)
            close()
            moveTo(12f, 2f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(13f, 3f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(11f, 10f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
