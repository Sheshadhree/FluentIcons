package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SpinnerIos16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SpinnerIos16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.501f, 8f)
            curveToRelative(0f, -3.038f, 2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.462f, 5.5f, -5.5f, 5.5f)
            curveToRelative(-0.414f, 0f, -0.751f, 0.336f, -0.751f, 0.75f)
            reflectiveCurveTo(7.586f, 15f, 8f, 15f)
            curveToRelative(3.866f, 0f, 7.001f, -3.134f, 7.001f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            curveToRelative(-3.852f, 0f, -6.978f, 3.112f, -7f, 6.96f)
            lineTo(1f, 8f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(2.501f, 8.414f, 2.501f, 8f)
            close()
        }
    }.build()
}
